FROM openjdk:17-jdk-alpine

LABEL BASE_IMAGE="registry.access.redhat.com/ubi8/ubi-minimal:8.5"
LABEL JAVA_VERSION="11"

#RUN microdnf install --nodocs java-11-openjdk-headless && microdnf clean all

WORKDIR /work/
# RUN ls -lR / | grep -i target
# RUN ls -lR / | grep -i ".jar"
ADD hw/target/*.jar /work/helloWorldApplication.jar

EXPOSE 8080
CMD ["java", "-jar", "helloWorldApplication.jar"]


