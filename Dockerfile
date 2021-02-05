FROM openjdk:13
LABEL maintainer="maxopencode@gmail.com"
VOLUME /tmp
EXPOSE 9000
ADD build/libs/todo-0.0.1-SNAPSHOT.jar todo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","todo-0.0.1-SNAPSHOT.jar"]