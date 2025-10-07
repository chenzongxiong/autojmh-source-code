cd maven_build_sys && JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 mvn install -DskipTests=true
cd syringe && JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 mvn install -DskipTests=true
cd spoon && git checkout 8a8ef93b347312720d7d021d81dad1b44a9e4754
mvn package -DskipTests
