package io.github.sparsick.liquibase.sample;

import liquibase.command.CommandScope;
import liquibase.command.core.UpdateCommandStep;
import liquibase.command.core.helpers.DbUrlConnectionArgumentsCommandStep;
import liquibase.database.Database;
import liquibase.database.DatabaseConnection;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;

import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {
        DatabaseConnection connection = new JdbcConnection(DriverManager.getConnection("jdbc:h2:mem:liquibase", "sa", ""));
        Database database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(connection);
        new CommandScope(UpdateCommandStep.COMMAND_NAME)
                .addArgumentValue(DbUrlConnectionArgumentsCommandStep.DATABASE_ARG, database)
                .addArgumentValue(UpdateCommandStep.CHANGELOG_FILE_ARG, "changelogs/liquibase.changelog.xml")
                .execute();
        System.out.println("Sucessfully executed Liquibase changelog!");
    }
}