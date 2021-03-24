#Dockerfile for quotation-client-service

FROM openjdk:11
EXPOSE  8082
COPY ./target/quotation-client-service-0.0.1-SNAPSHOT.jar quotation-client-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","quotation-client-service-0.0.1-SNAPSHOT.jar"]