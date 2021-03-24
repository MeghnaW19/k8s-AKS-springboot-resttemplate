#Dockerfile for quotation-service
FROM openjdk:11
EXPOSE  8081
COPY ./target/quotation-service-0.0.1-SNAPSHOT.jar quotation-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","quotation-service-0.0.1-SNAPSHOT.jar"]