FROM openjdk:8-jdk-alpine

EXPOSE 8502

ADD /build/libs/gateway-0.0.1-SNAPSHOT.jar gateway.jar

ENTRYPOINT ["java", "-jar", "gateway.jar"]

