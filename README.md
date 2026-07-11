# websocket

A simple Spring Boot WebSocket demo with a basic browser chat client.

## Requirements

- Java 17
- Maven 3.9+ or the included Maven wrapper

## Run

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

Then open:

```text
http://localhost:8080
```

## How it works

- WebSocket endpoint: `/ws`
- Client send destination: `/app/sendMessage`
- Broadcast topic: `/topic/messages`

The browser page connects with SockJS/STOMP, sends messages to the server, and displays the server response in the page.

## Test

```bash
./mvnw test
```
