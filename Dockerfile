# Etapa 1: Build con Maven (multi-stage build)
FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY pom.xml ./
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Runtime minimalista
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Instalar curl para health checks
RUN apk add --no-cache curl

# Copiar JAR de la etapa anterior
COPY --from=build /app/target/plan_my_trip-0.0.1-SNAPSHOT.jar app.jar

# Crear usuario no-root
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

# Health check (IMPORTANTE para Render)
HEALTHCHECK --interval=30s --timeout=3s --retries=3 \
  CMD curl -f http://localhost:${PORT:-8080}/actuator/health || exit 1

# Render asigna el puerto automáticamente
EXPOSE ${PORT:-8080}

# Comando de inicio
CMD ["java", "-jar", "app.jar"]