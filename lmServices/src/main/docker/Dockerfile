FROM java:8
MAINTAINER joseluis.santos@vass.es
ADD eureka-0.0.1-SNAPSHOT.jar miapp.jar
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/miapp.jar"]