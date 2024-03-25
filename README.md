# Docker Compose Spring Boot and Postgres demo
## Technologies
- Spring Boot
- Postgresql
- Docker
- Docker Compose

## Run the System
Run the following command:
```bash
docker-compose up
```

## Stop the System
To stop all running containers, use this command:
```bash
docker-compose down

docker runtutan keberhasilan spring dan postgre:
1. docker build -t namaAplikasiSpringImage:tag
2. docker network create my-network
3. docker run --network my-network -e DB_HOST=db -e DB_NAME=customer_db -e DB_USERNAME=lala -e DB_PASSWORD=1234 -p 6868:8080 -d akmal23/spring-tes:3.0 
4. docker run --network my-network -e DB_HOST=db -e DB_NAME=customer_db -e DB_USERNAME=lala -e DB_PASSWORD=1234 akmal23/spring-tes:3.0