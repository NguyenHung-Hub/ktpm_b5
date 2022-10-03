#FROM openjdk:11
#EXPOSE 8080
#ARG DEPENDENCY=target/application.jar
#COPY ${DEPENDENCY} application.jar
#ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]

FROM openjdk:11
EXPOSE 8080
ARG DEPENDENCY=target/application.war
COPY ${DEPENDENCY} application.war
ENTRYPOINT ["java","-jar","/application.war"]