ARG JDK_VERSION="17.0.1"
ARG ALPIN_VERSION="3.14"
FROM openjdk:${JDK_VERSION}-slim

RUN apt-get update \
    && apt-get install -y git curl maven make default-mysql-client