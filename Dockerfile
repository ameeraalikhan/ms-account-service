FROM maven:3.9.4-ibm-semeru-17-focal as mvnbuild
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean install -Dmaven.test.skip=true

FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
#COPY target/ms-account-service-0.0.1-SNAPSHOT.jar app.jar
COPY --from=mvnbuild /usr/src/app/target/ms-account-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

