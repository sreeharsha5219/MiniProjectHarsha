FROM openjdk:8
MAINTAINER sreeharsha52190 sreeharsha52190@gmail.com
COPY ./target/Calculator-1.0.SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator-1.0.SNAPSHOT-jar-with-dependencies.jar"]