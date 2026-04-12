FROM eclipse-temurin:23-jre
WORKDIR /app
COPY target/security-starter-demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]
