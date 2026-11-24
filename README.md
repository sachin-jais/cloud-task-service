# Cloud Task Service (Maven + Docker + GitHub Actions)

A cloud-ready Java Spring Boot microservice packaged with **Maven**, containerized via a multi-stage **Docker** build, orchestrated with **Docker Compose**, and automated with **GitHub Actions CI/CD**.

## Quick Start

### Run with Maven
```bash
mvn clean test
mvn spring-boot:run
```

### Run with Docker Compose
```bash
docker compose up --build -d
curl http://localhost:8080/api/status
docker compose down
```

## Endpoints
- `GET /` — Service status, environment, and timestamp
- `GET /api/status` — Microservice health message
- `GET /actuator/health` — Spring Boot Actuator health probe
