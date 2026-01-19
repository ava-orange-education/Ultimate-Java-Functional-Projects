FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the packaged jar into the container (name must match your built jar)
COPY target/task-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
