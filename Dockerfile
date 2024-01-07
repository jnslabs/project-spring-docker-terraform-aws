FROM maven:3.8.5-openjdk-17 as build
WORKDIR /build
COPY deploy/docker .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build ./build/target/*.jar ./application.jar
EXPOSE 8090

ENTRYPOINT java -jar application.jar