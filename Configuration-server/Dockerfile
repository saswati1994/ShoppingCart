FROM openjdk:8

COPY ./target/Configuration-server-*.jar configurationserver.jar

EXPOSE 8089

CMD ["java","-jar","-Dspring.profile.active=local","configurationserver.jar"]