FROM maven:3.9-eclipse-temurin-25-alpine AS build
WORKDIR /workspace
COPY . .
RUN mvn -pl kyc-engine -am package -DskipTests -q

FROM eclipse-temurin:25-jre-alpine
WORKDIR /app
COPY --from=build /workspace/kyc-engine/target/kyc-engine-1.0.0-SNAPSHOT.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "app.jar"]
