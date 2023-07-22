FROM amazoncorretto:17 as builder
RUN yum update -y
RUN yum install -y procps
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} starter.jar

RUN java -Djarmode=layertools -jar starter.jar extract

 
FROM amazoncorretto:17
RUN yum update -y
RUN yum install -y procps
COPY --from=builder dependencies/ ./
RUN true
COPY --from=builder snapshot-dependencies/ ./
RUN true
COPY --from=builder spring-boot-loader/ ./
RUN true
COPY --from=builder application/ ./
RUN true
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
