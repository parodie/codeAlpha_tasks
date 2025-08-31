
# Task 4: Web Server using Docker

## 📝 Description
This project demonstrates **containerizing a simple Nginx web server using Docker**. A custom homepage is served from within a container, showcasing core Docker concepts like images, containers, lifecycle management, and best practices.

## 🐳 How to Run

###  Build the Docker Image & run the container
```bash
docker build -t my-webserver .
docker run -d -p 8080:80 --name web-container my-webserver
```
### View in Browser
open **http://localhost:8080** 
