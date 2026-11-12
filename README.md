# Wridea Backend

Minimal Spring Boot foundation for the Wridea API.

## Requirements

- Java 25 or newer
- No global Maven installation is required; use the included Maven Wrapper.

## Run locally

```bash
./mvnw spring-boot:run
```

The service listens on `http://localhost:8080`.

## Verify

```bash
./mvnw verify
```

## Endpoints

```bash
curl http://localhost:8080/api/v1/system/ping
curl http://localhost:8080/actuator/health
```

Expected responses:

```json
{"status":"ok","service":"wridea-be"}
```

The health response contains `"status":"UP"` when the application is ready.

## Current scope

This initial foundation contains only Spring MVC, validation, Actuator health checks, and automated tests. Database access, authentication, business domains, and deployment configuration will be added in later approved stages.
