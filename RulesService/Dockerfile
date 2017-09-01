FROM openjdk:8

RUN mkdir rule

ADD target/RulesService-0.0.1-SNAPSHOT.jar rule/

EXPOSE 3333

CMD java -jar rule/RulesService-0.0.1-SNAPSHOT.jar
