FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER joseluis.santos@vass.es
ADD clientService-0.0.1-SNAPSHOT.jar miapp.jar
EXPOSE 8098
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/miapp.jar"]