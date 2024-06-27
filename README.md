```shell
cd liquibase-files-in-jar
mvn clean install

cd ../embedded-liquibase-using-loadData
mvn clean install


// option 1
cd target
java -cp embedded-liquibase-using-loadData-1.0-SNAPSHOT-jar-with-dependencies.jar 

// option2
cd target/appassembler/bin
./app

```