FROM maven:3.9-eclipse-temurin-25-alpine AS build
WORKDIR /workspace
COPY . .
RUN mvn -pl api-gateway -am package -DskipTests -q

FROM eclipse-temurin:25-jre-alpine
WORKDIR /app
COPY --from=build /workspace/api-gateway/target/api-gateway-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
