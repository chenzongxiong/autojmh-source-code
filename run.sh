# java -cp target/autojmh-0.0.1.jar fr.inria.autojmh.tool.Tool config.properties
# JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 \
JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64 \
    mvn clean package -DskipTests exec:java
