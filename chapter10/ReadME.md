How to run
Ensure Kafka is running locally, for example using docker-compose with confluentinc/cp-kafka as in your screenshots.
​

Build and run:

bash
./mvnw spring-boot:run
Test endpoints:

POST http://localhost:8080/demo/kafka with a raw string body → sends to Kafka.

GET http://localhost:8080/demo/rest/123 → RestTemplate call.

GET http://localhost:8080/demo/webclient/123 → WebClient call (reactive).

GET http://localhost:8080/demo/feign/123 → Feign client with fallback.