FROM maven:3.9-eclipse-temurin-25-alpine AS build
WORKDIR /workspace
COPY . .
RUN mvn -pl customer-profile-service -am package -DskipTests -q

FROM eclipse-temurin:25-jre-alpine
WORKDIR /app
COPY --from=build /workspace/customer-profile-service/target/customer-profile-service-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
