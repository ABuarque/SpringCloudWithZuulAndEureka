FROM openjdk:8-jdk-alpine

EXPOSE 8500

ADD /build/libs/api-server-0.0.1-SNAPSHOT.jar api-server.jar

ENTRYPOINT ["java", "-jar","api-server.jar"]

