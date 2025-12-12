//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.prog3.plan_my_trip.dto.response;

import java.time.LocalDateTime;
import java.util.Map;
import lombok.Generated;

public class ErrorResponse {
    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String message;
    private Map<String, String> details;

    @Generated
    public static ErrorResponseBuilder builder() {
        return new ErrorResponseBuilder();
    }

    @Generated
    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public String getError() {
        return this.error;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public Map<String, String> getDetails() {
        return this.details;
    }

    @Generated
    public void setTimestamp(final LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Generated
    public void setStatus(final Integer status) {
        this.status = status;
    }

    @Generated
    public void setError(final String error) {
        this.error = error;
    }

    @Generated
    public void setMessage(final String message) {
        this.message = message;
    }

    @Generated
    public void setDetails(final Map<String, String> details) {
        this.details = details;
    }

    @Generated
    public ErrorResponse() {
    }

    @Generated
    public ErrorResponse(final LocalDateTime timestamp, final Integer status, final String error, final String message, final Map<String, String> details) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.details = details;
    }

    @Generated
    public static class ErrorResponseBuilder {
        @Generated
        private LocalDateTime timestamp;
        @Generated
        private Integer status;
        @Generated
        private String error;
        @Generated
        private String message;
        @Generated
        private Map<String, String> details;

        @Generated
        ErrorResponseBuilder() {
        }

        @Generated
        public ErrorResponseBuilder timestamp(final LocalDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @Generated
        public ErrorResponseBuilder status(final Integer status) {
            this.status = status;
            return this;
        }

        @Generated
        public ErrorResponseBuilder error(final String error) {
            this.error = error;
            return this;
        }

        @Generated
        public ErrorResponseBuilder message(final String message) {
            this.message = message;
            return this;
        }

        @Generated
        public ErrorResponseBuilder details(final Map<String, String> details) {
            this.details = details;
            return this;
        }

        @Generated
        public ErrorResponse build() {
            return new ErrorResponse(this.timestamp, this.status, this.error, this.message, this.details);
        }

        @Generated
        public String toString() {
            String var10000 = String.valueOf(this.timestamp);
            return "ErrorResponse.ErrorResponseBuilder(timestamp=" + var10000 + ", status=" + this.status + ", error=" + this.error + ", message=" + this.message + ", details=" + String.valueOf(this.details) + ")";
        }
    }
}
