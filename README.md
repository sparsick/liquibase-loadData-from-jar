```shell
cd liquibase-files-in-jar
mvn clean install

cd ../embedded-liquibase-using-loadData
mvn clean install

cd target
java -cp embedded-liquibase-using-loadData-1.0-SNAPSHOT-jar-with-dependencies.jar io.github.sparsick.liquibase.sample.Main
```