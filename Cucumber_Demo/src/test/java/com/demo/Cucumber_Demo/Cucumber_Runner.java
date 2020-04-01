package com.demo.Cucumber_Demo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:cucumber-reports"},features={"src/test/resources/skeleton/story.feature",
		"src/test/resources/skeleton/dempwebshoplogin1.feature"})

public class Cucumber_Runner {

}
