# SpringCloudWithZuulAndEureka
Using Eureka Discovery service and Zuul as proxy

## Eureka
To enable service discovery, in your microservices add the following dependencia:
```
implementation('org.springframework.cloud:spring-cloud-starter-netflix-eureka-client')
```
And then, add the anotion to driver class:
```
@EnableEurekaClient

```
Configure the application.yml file:
```
spring:
  application:
    name: api-client

server:
  port: 8501

eureka:
  client:
    registerWithEureka: true
    fetchRegistry: true
    serviceUrl:
      defaultZone: http://localhost:8502/eureka/
  instance:
    hostname: localhost
```

In the Discovery microservice add the following dependency:
```
implementation('org.springframework.cloud:spring-cloud-starter-netflix-eureka-server')
```
Enable Eureka Proxydriver class:
```
@EnableZuulProxy
```
Configure the application.yml:
```
eureka:
  dashboard:
    enabled: true
  client:
    registerWithEureka: false
    fetchRegistry: false
    server:
      waitTimeInMsWhenSyncEmpty: 0
```


## To open up the Eureka dashboard
```
http://localhost:8502/
```

## Fixing problems with JAXB
About: http://blog.caelum.com.br/erros-com-jaxb-no-java-9/

To fix it, add these dependecies to the build.gradle in your gateway project
```
compile group: 'javax.xml.bind', name: 'jaxb-api', version: '2.2.4'
compile group: 'com.sun.xml.bind', name: 'jaxb-core', version: '2.2.7'
compile group: 'com.sun.xml.bind', name: 'jaxb-impl', version: '2.2.3-1'
```
