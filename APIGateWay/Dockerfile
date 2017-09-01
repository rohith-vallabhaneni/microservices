FROM openjdk:8

RUN mkdir api

ADD target/APIGateway-0.0.1-SNAPSHOT.jar api/

EXPOSE 8765

CMD java -jar api/APIGateway-0.0.1-SNAPSHOT.jar
