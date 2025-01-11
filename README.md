# 🎲 Board Game Management System

A modern, full-stack web application for managing and reviewing board games. Built with Spring Boot and implementing modern DevOps practices including CI/CD, containerization, and cloud deployment.

## 🌟 Features

### Application Features
- **Board Game Management**
  - View list of board games
  - Get detailed information about each game
  - Add new board games to the collection
  - Rate and review board games

- **User Management**
  - Role-based access control (User/Manager)
  - Secure authentication and authorization
  - User profile management

- **RESTful API**
  - Full CRUD operations for board games
  - JSON-based communication
  - Proper error handling
  - API documentation

### DevOps Features
- **Continuous Integration**
  - Automated builds with Jenkins
  - Unit and integration testing
  - Code quality analysis with SonarQube
  - Test coverage reporting with JaCoCo

- **Continuous Deployment**
  - Automated Docker image creation
  - Kubernetes deployment automation
  - Rolling updates with zero downtime
  - Environment-specific configurations

- **Monitoring & Logging**
  - Application metrics collection
  - Centralized logging
  - Performance monitoring
  - Health checks and alerts

## 🛠️ Technology Stack

### Backend
- Java 17 (LTS)
- Spring Boot 3.1.0
- Spring Security
- Spring MVC
- JDBC
- H2 Database (In-memory)

### Frontend
- Thymeleaf
- HTML5
- CSS3
- JavaScript
- Bootstrap 5

### DevOps & Infrastructure
- **Version Control**
  - Git
  - GitHub Actions (optional CI/CD)

- **CI/CD**
  - Jenkins Pipeline
  - SonarQube
  - JaCoCo Code Coverage
  - Maven Build Tool

- **Containerization**
  - Docker
  - Docker Compose (local development)
  - Docker Hub Registry

- **Orchestration**
  - Kubernetes
  - Helm Charts
  - Kubernetes ConfigMaps & Secrets

- **Cloud Platform**
  - AWS EC2
  - AWS EKS (optional)
  - Load Balancer
  - Auto Scaling

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.8+
- Docker 20.10+
- Kubernetes 1.20+
- AWS CLI (for cloud deployment)

### Local Development
1. Clone the repository:
   ```bash
   git clone [repository-url]
   ```

2. Navigate to project directory:
   ```bash
   cd Boardgame-main
   ```

3. Run the application using Maven wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Access the application:
   ```
   http://localhost:8080
   ```

### Docker Development
1. Build Docker image:
   ```bash
   docker build -t boardgame-app .
   ```

2. Run Docker container:
   ```bash
   docker run -p 8080:8080 boardgame-app
   ```

### Kubernetes Deployment
1. Create Kubernetes secrets:
   ```bash
   kubectl create secret generic boardgame-secrets \
     --from-file=./config/secrets.properties
   ```

2. Apply Kubernetes configurations:
   ```bash
   kubectl apply -f k8s/namespace.yaml
   kubectl apply -f k8s/configmap.yaml
   kubectl apply -f k8s-deployment.yaml
   kubectl apply -f k8s/service.yaml
   ```

3. Verify deployment:
   ```bash
   kubectl get pods -n boardgame
   kubectl get services -n boardgame
   ```

## 📦 CI/CD Pipeline

Our Jenkins pipeline includes the following stages:

1. **Build & Test**
   - Compile source code
   - Run unit tests
   - Run integration tests
   - Generate test reports

2. **Code Quality**
   - SonarQube analysis
   - Code coverage check
   - Security vulnerability scan
   - Code style verification

3. **Containerization**
   - Build Docker image
   - Run container tests
   - Push to Docker registry
   - Clean up local images

4. **Deployment**
   - Update Kubernetes configs
   - Rolling deployment
   - Health checks
   - Rollback on failure

## 🔍 Monitoring & Logging

### Application Monitoring
- Health metrics endpoint: `/actuator/health`
- Metrics endpoint: `/actuator/metrics`
- Custom business metrics
- Performance monitoring

### Infrastructure Monitoring
- Kubernetes dashboard
- Resource utilization
- Node health
- Network metrics

### Logging
- Centralized logging system
- Log aggregation
- Error tracking
- Audit logging

## 🔒 Security

- JWT-based authentication
- Role-based access control
- Secure password handling
- HTTPS support
- Container security scanning
- Kubernetes RBAC
- Network policies

## 🧪 Testing

### Unit Testing
```bash
./mvnw test
```

### Integration Testing
```bash
./mvnw verify
```

### Security Testing
```bash
./mvnw verify -P security-tests
```

## 📝 Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## 📄 Configuration

### Environment Variables
- `SPRING_PROFILES_ACTIVE` - Active Spring profile
- `DB_HOST` - Database host
- `DB_PORT` - Database port
- `KUBERNETES_NAMESPACE` - K8s namespace

### Kubernetes ConfigMaps
- Application properties
- Logging configuration
- Feature flags

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.
