FROM maven:latest
LABEL authors="zehraghali"
WORKDIR /app

COPY pom.xml /app/

COPY . /app/

RUN mvn package

CMD ["java", "-jar", "target/test.jar"]


