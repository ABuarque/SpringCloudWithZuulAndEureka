# SpringCloudWithZuulAndEureka
Using Spring to create Microservices

## Fixing problems with JAXB
About: http://blog.caelum.com.br/erros-com-jaxb-no-java-9/

To fix it, add these dependecies to the build.gradle in your gateway project
```
compile group: 'javax.xml.bind', name: 'jaxb-api', version: '2.2.4'
compile group: 'com.sun.xml.bind', name: 'jaxb-core', version: '2.2.7'
compile group: 'com.sun.xml.bind', name: 'jaxb-impl', version: '2.2.3-1'
```
