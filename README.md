## Overview

Task Manager API is a back-end application built with Spring Boot, MongoDB, and Swagger. This application provides RESTful API endpoints for managing tasks, including creating, reading, updating, and deleting tasks. The API is documented using Swagger and includes a Swagger UI for easy interaction and testing.

## Features

- Create, read, update, and delete tasks
- MongoDB as the data store
- Swagger for API documentation and testing
- Spring Boot for rapid application development

## Prerequisites

- Java 21
- Maven
- Docker (for MongoDB setup)

## Getting Started
### Install MongoDB via Docker 
```bash
cd mongoDB
docker-compose up -d
```
### Open, Install and Run Spring Boot Application
```bash
cd taskmanager-api
mvn clean install
mvn spring-boot:run
```
