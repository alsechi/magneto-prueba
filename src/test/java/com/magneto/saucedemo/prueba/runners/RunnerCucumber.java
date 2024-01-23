/**
 * @since 27/11/2017
 */
package com.magneto.saucedemo.prueba.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//@CucumberOptions(features = "src/test/resources/features",tags = {"@Todos"},snippets = SnippetType.CAMELCASE,glue = "com.pyxis.trello.prueba",plugin = {"json:target/cucumber.json"})
@CucumberOptions(features = "src/test/resources/features",tags = {"@CompraExitosa"},snippets = SnippetType.CAMELCASE,glue = "com.magneto.saucedemo.prueba",plugin = {"json:target/cucumber.json"})

@RunWith(CucumberWithSerenity.class)
public class RunnerCucumber {
}