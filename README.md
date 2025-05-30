# Online Status: User Activity Tracking Service

## What Problem Does This Solve?
The Online Status service provides a reliable way to track and query user activity status in applications. It helps determine whether users are currently active or offline, enabling features like presence indicators, activity logs, and user availability status in applications.

## Who Is This For?
- Web application developers implementing user presence features
- Platform services requiring user activity tracking
- Applications with social or collaborative features
- Systems that need to monitor user engagement

## Current Implementation Status
- ✅ Core user activity tracking
- ✅ Activity status querying
- ✅ Spring Boot application framework
- 🚧 REST API endpoints
- 🚧 Persistence layer
- 📋 Activity analytics
- 📋 Real-time notifications

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven for dependency management
- Basic understanding of Spring Boot applications

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/nczempin/online-status.git
   cd online-status
   ```

2. Build the application:
   ```
   cd java/online-status
   mvn clean install
   ```

### Running the Service
1. Start the Spring Boot application:
   ```
   mvn spring-boot:run
   ```

2. The service will be available at:
   ```
   http://localhost:8080
   ```

## Project Scope

### What This IS
- A service for tracking user online/offline status
- A Spring Boot application with a clean API
- A component that can be integrated into larger systems
- A foundation for building presence-aware applications

### What This IS NOT
- Not a complete user management system
- Not a messaging platform (though it can support one)
- Not a standalone application with a user interface
- Not optimized for extremely high-scale deployments without modification

## Repository Structure
- `java/online-status/` - Main application directory
  - `src/main/java/de/czempin/aesdc/onlinestatus/` - Java source files
    - `OnlineStatusApplication.java` - Spring Boot application entry point
    - `OnlineStatusTracker.java` - Core tracking functionality
    - `UserActivityService.java` - Service interface for user activity
    - `UserActivityServiceImpl.java` - Implementation of the service
  - `src/test/` - Test files for the application

## API Usage
```java
// Example usage
OnlineStatusTracker tracker = new OnlineStatusTracker();
tracker.setUserActivityService(userActivityService);

// Check if a user is online
boolean isUserOnline = tracker.isOnline(userId);
```

## Development Status
This is an experimental service in active development. Contributions and feedback are welcome.
