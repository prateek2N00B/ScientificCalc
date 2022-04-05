FROM openjdk:8
COPY ./target/ScientificCalc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","ScientificCalc-1.0-SNAPSHOT-jar-with-dependencies.jar"]