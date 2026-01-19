# Package the microservice as a JAR
./mvnw clean package

# Build Docker image
docker build -t demo-service .

# Run container
docker run -p 8080:8080 demo-service

# Then access:

http://localhost:8080/hello?name=Docker

# You should see the response:
Hello, Docker
