// app.js - Frontend JavaScript for PlanMyTrip
// src/main/resources/static/js/app.js

// Global configuration
const API_BASE_URL = '/api';

// Utility Functions
function formatDate(dateStr) {
    const date = new Date(dateStr);
    return date.toLocaleDateString('es-ES', {
        day: '2-digit',
        month: 'short',
        year: 'numeric'
    });
}

function formatDateTime(dateStr) {
    const date = new Date(dateStr);
    return date.toLocaleString('es-ES', {
        day: '2-digit',
        month: 'short',
        year: 'numeric',
        hour: '2-digit',
        minute: '2-digit'
    });
}

function formatCurrency(amount, currency = 'USD') {
    return new Intl.NumberFormat('es-ES', {
        style: 'currency',
        currency: currency
    }).format(amount);
}

// Auth utilities
function getToken() {
    return localStorage.getItem('token');
}

function isAuthenticated() {
    return !!getToken();
}

function logout() {
    localStorage.clear();
    window.location.href = '/login.html';
}

// API Call Helper
async function apiCall(endpoint, options = {}) {
    const token = getToken();

    const defaultOptions = {
        headers: {
            'Content-Type': 'application/json',
            ...(token && { 'Authorization': `Bearer ${token}` })
        }
    };

    const finalOptions = {
        ...defaultOptions,
        ...options,
        headers: {
            ...defaultOptions.headers,
            ...options.headers
        }
    };

    try {
        const response = await fetch(`${API_BASE_URL}${endpoint}`, finalOptions);

        // Handle unauthorized
        if (response.status === 401) {
            logout();
            throw new Error('Sesión expirada');
        }

        // Handle error responses
        if (!response.ok) {
            const error = await response.json();
            throw new Error(error.message || 'Error en la petición');
        }

        // Handle no content
        if (response.status === 204) {
            return null;
        }

        return await response.json();
    } catch (error) {
        console.error('API Error:', error);
        throw error;
    }
}

// Show notification/toast
function showNotification(message, type = 'success') {
    const notification = document.createElement('div');
    notification.className = `notification notification-${type}`;
    notification.textContent = message;

    document.body.appendChild(notification);

    setTimeout(() => {
        notification.classList.add('show');
    }, 100);

    setTimeout(() => {
        notification.classList.remove('show');
        setTimeout(() => notification.remove(), 300);
    }, 3000);
}

// Validate form
function validateForm(formId) {
    const form = document.getElementById(formId);
    if (!form) return false;

    const inputs = form.querySelectorAll('input[required], select[required], textarea[required]');
    let isValid = true;

    inputs.forEach(input => {
        if (!input.value.trim()) {
            input.classList.add('error');
            isValid = false;
        } else {
            input.classList.remove('error');
        }
    });

    return isValid;
}

// Loading spinner
function showLoading(elementId) {
    const element = document.getElementById(elementId);
    if (element) {
        element.innerHTML = '<div class="loading-spinner"></div>';
    }
}

function hideLoading(elementId) {
    const element = document.getElementById(elementId);
    if (element) {
        element.innerHTML = '';
    }
}

// Date validation
function validateDateRange(startDate, endDate) {
    const start = new Date(startDate);
    const end = new Date(endDate);
    return end >= start;
}

// Export functions for global use
window.appUtils = {
    formatDate,
    formatDateTime,
    formatCurrency,
    getToken,
    isAuthenticated,
    logout,
    apiCall,
    showNotification,
    validateForm,
    showLoading,
    hideLoading,
    validateDateRange
};

// Auto-logout on token expiration
window.addEventListener('storage', (e) => {
    if (e.key === 'token' && !e.newValue) {
        window.location.href = '/login.html';
    }
});

// Protect pages that require authentication
if (window.location.pathname.includes('dashboard.html') ||
    window.location.pathname.includes('itinerario.html')) {
    if (!isAuthenticated()) {
        window.location.href = '/login.html';
    }
}

console.log('✈️ PlanMyTrip App loaded successfully!');