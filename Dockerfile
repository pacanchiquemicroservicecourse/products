# ------------------------------------------------------------------------
#
# Directorio de ubicacion de todos los microservicio /opt/<NOMBRE>
#
# docker build -f Dockerfile -t telco-micro-java-arch-restblank .
# 
# ------------------------------------------------------------------------

FROM openjdk:19-jre-slim-buster
COPY target/products-0.0.1-SNAPSHOT.jar /opt/microservice/products.jar
ENTRYPOINT ["java","-jar","/opt/microservice/products.jar"]