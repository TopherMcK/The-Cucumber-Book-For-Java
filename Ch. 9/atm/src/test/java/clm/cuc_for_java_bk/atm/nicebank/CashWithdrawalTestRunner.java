package clm.cuc_for_java_bk.atm.nicebank;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "feature"
		,glue = {"clm.cuc_for_java_bk.atm.nicebank"}
		,dryRun = false
		,monochrome = true
		,snippets = SnippetType.CAMELCASE
		,plugin = {"pretty", "html:out"}
		)
public class CashWithdrawalTestRunner
{}
