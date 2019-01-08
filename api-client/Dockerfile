FROM openjdk:8-jdk-alpine

EXPOSE 8501

ADD /build/libs/api-client-0.0.1-SNAPSHOT.jar api-client.jar

ENTRYPOINT ["java", "-jar", "api-client.jar"]
