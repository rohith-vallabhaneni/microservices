FROM openjdk:8

RUN mkdir scheduler

ADD target/SchedulerService-0.0.1-SNAPSHOT.jar scheduler/

EXPOSE 4444

CMD java -jar scheduler/SchedulerService-0.0.1-SNAPSHOT.jar
