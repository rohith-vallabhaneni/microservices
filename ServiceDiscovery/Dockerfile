FROM openjdk:8

RUN mkdir service

ADD target/ServiceDiscovery-0.0.1-SNAPSHOT.jar service/

EXPOSE 8761

CMD java -jar service/ServiceDiscovery-0.0.1-SNAPSHOT.jar
