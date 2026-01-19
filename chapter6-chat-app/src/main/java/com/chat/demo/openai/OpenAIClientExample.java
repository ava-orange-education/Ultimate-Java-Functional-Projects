package com.chat.demo.openai;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OpenAIClientExample {

    // Set environment variable OPENAI_API_KEY before running
    private static final String API_KEY = System.getenv("OPENAI_API_KEY");

    // Chat Completions endpoint (replace with the exact URL you use)
    private static final String ENDPOINT = "https://api.openai.com/v1/chat/completions";

    public static void main(String[] args) throws Exception {
        if (API_KEY == null || API_KEY.isBlank()) {
            throw new IllegalStateException("OPENAI_API_KEY environment variable is not set");
        }

        String prompt = "Write a Java function that reverses a string.";
        String requestBody = """
                {
                  "model": "gpt-4.1-mini",
                  "messages": [
                    {
                      "role": "user",
                      "content": "%s"
                    }
                  ]
                }
                """.formatted(prompt);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ENDPOINT))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + API_KEY)
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
