# backend-test-winprovit

Simple API using Quarkus for the WINPROVIT technical test.

## Running the application in docker

You can run this application in a docker container using:
```shell script
./mvnw clean package
docker build -f src/main/docker/Dockerfile.jvm -t backend-test-winprovit .
docker run -d --rm -p 8080:8080 backend-test-winprovit
```

The swagger-ui will be available [here](http://localhost:8080/swagger) and the openapi [here](http://localhost:8080/openapi)
