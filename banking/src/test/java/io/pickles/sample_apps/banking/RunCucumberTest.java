package io.pickles.sample_apps.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;

@RunWith(Cucumber.class)
@CucumberOptions(//
		plugin = { "pretty", "html:out" }, //
		snippets = SnippetType.CAMELCASE, //
		glue = { "classpath:io.pickles.sample_apps.banking", "classpath:io.pickles.steps" }//
)
public class RunCucumberTest {

	@BeforeClass
	public static void givenInMemoryDatabase() throws SQLException, LiquibaseException {
		Connection connection = DriverManager.getConnection("jdbc:h2:mem:delayed_verification");
		Database database = DatabaseFactory.getInstance()
				.findCorrectDatabaseImplementation(new JdbcConnection(connection));
		Liquibase liquibase = new Liquibase("liquibase/delayed-verification.xml", new ClassLoaderResourceAccessor(),
				database);
		liquibase.update("");

		liquibase = new Liquibase("delayed-verification-testdata.xml", new ClassLoaderResourceAccessor(), database);
		liquibase.update("");
	}
}
