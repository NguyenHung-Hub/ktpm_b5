FROM openjdk:11
EXPOSE 8080
USER spring:spring
ARG DEPENDENCY=out/artifacts/B4_jar
COPY ${DEPENDENCY} B4.jar
ENTRYPOINT ["java","-cp","app:app/lib/*","hello.Application"]
