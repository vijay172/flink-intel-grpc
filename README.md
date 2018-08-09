#flink-intel-grpc

#Install grpc proto generated jar in local maven repo
mvn deploy:deploy-file -DgroupId=com.intel.grpc -DartifactId=Image -Dversion=0.0.1 -Durl=file:./local-maven-repo/ -DrepositoryId=local-maven-repo -DupdateReleaseInfo=true -Dfile=./src/main/resources/lib/grpc-java-course1-1.0-SNAPSHOT.jar

#Build
Go to root dir
mvn clean package
