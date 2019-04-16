FROM openjdk:8
ADD build/libs/kubernetes-demo-develop.20190414.2.jar kubernetes-demo-develop.20190414.2.jar
EXPOSE 8085
ENTRYPOINT ["java" , "-jar" , "kubernetes-demo-develop.20190414.2.jar"]