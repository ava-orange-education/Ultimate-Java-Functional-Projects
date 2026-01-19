FROM openjdk:17

# Copy the packaged jar from the Maven target directory
COPY target/demo-service-0.0.1-SNAPSHOT.jar demo-service.jar

# Run the application
ENTRYPOINT ["java", "-jar", "demo-service.jar"]
