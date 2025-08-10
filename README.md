# Microservices-Based Spring Boot Application

A microservices-based Spring Boot application where two services interact through **Feign Client**, use separate **MySQL** databases, and are routed via **Spring Cloud API Gateway** with service discovery through **Eureka Server**.

## Features

- **Service Discovery** – All services are registered with **Eureka Server** for dynamic service lookup.
- **API Gateway** – Centralized entry point using **Spring Cloud Gateway** for routing requests to microservices.
- **Inter-Service Communication** – Implemented using **Feign Client** for declarative REST calls.
- **Database** – Each microservice has its own **MySQL** database for loose coupling.
- **Scalability Ready** – New services can be added without changing API Gateway configurations when using service discovery.

## Tech Stack

- **Backend:** Java, Spring Boot, Spring Cloud Gateway, Spring Cloud Netflix Eureka  
- **Communication:** Feign Client, REST API  
- **Database:** MySQL  
- **Build Tool:** Maven  

## How It Works

1. Client sends a request to the **API Gateway**.  
2. Gateway dynamically routes the request to the appropriate microservice via **Eureka**.  
3. One service communicates with another service via **Feign Client**.  
4. Results are processed and returned to the client.  

## Architecture Overview

```mermaid
graph LR
    Client --> API_Gateway
    API_Gateway --> Microservice_A
    Microservice_A -- Feign Client --> Microservice_B
    API_Gateway -. Service Discovery .- Eureka
    Microservice_A -.-> Eureka
    Microservice_B -.-> Eureka