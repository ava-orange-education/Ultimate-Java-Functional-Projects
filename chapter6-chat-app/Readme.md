# Spring Boot Chat App with OpenAI Example

## How to run both parts

### WebSocket chat app

- From project root:

  ```bash
  ./mvnw spring-boot:run

(or run ChatApplication in the IDE).

Open http://localhost:8080/ in two browser tabs and send messages.

OpenAI prompt example
Set environment variable OPENAI_API_KEY to a valid key.

Run OpenAIClientExample.main() from your IDE or:

bash
./mvnw -Dexec.mainClass="com.chat.demo.openai.OpenAIClientExample" \
-Dexec.cleanupDaemonThreads=false \
org.codehaus.mojo:exec-maven-plugin:3.1.0:java
The console prints the JSON response containing the model’s generated answer to the prompt.

