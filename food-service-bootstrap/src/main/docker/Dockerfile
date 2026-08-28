####
# Multi-stage Dockerfile for CI/CD: Maven build + Quarkus JVM runtime image.
#
# Build from the repository root:
#   docker build -f food-service-bootstrap/src/main/docker/Dockerfile -t app-backend-food .
####

FROM maven:3.9-eclipse-temurin-25 AS build
WORKDIR /build
COPY . .
RUN mvn -B package -DskipTests -pl food-service-bootstrap -am

FROM registry.access.redhat.com/ubi9/openjdk-25-runtime:1.24

ENV LANGUAGE='en_US:en'

COPY --from=build --chown=185 /build/food-service-bootstrap/target/quarkus-app/lib/ /deployments/lib/
COPY --from=build --chown=185 /build/food-service-bootstrap/target/quarkus-app/*.jar /deployments/
COPY --from=build --chown=185 /build/food-service-bootstrap/target/quarkus-app/app/ /deployments/app/
COPY --from=build --chown=185 /build/food-service-bootstrap/target/quarkus-app/quarkus/ /deployments/quarkus/

EXPOSE 8080
USER 185
ENV JAVA_OPTS_APPEND="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
ENV JAVA_APP_JAR="/deployments/quarkus-run.jar"

ENTRYPOINT [ "/opt/jboss/container/java/run/run-java.sh" ]
