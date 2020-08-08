FROM centos:centos8

MAINTAINER Sushant

# Install Java
RUN yum -y update && yum install -y java-1.8.0-openjdk

ARG BASE_DIR=/usr/local/weatherapp
ARG WEATHERAPP_VERSION=0.0.1

ARG SERVER_PORT=8081
ARG SERVER_NAME=localhost

COPY ./target/demo-test-1.0.0.jar ${BASE_DIR}/${WEATHERAPP_VERSION}/weatherapp.jar

EXPOSE 8081

COPY start.sh /usr/local/bin

RUN chmod +x /usr/local/bin/start.sh
RUN chmod -R 555 /usr/local/weatherapp && \
	chmod 555 /usr/local/bin/start.sh

CMD start.sh
