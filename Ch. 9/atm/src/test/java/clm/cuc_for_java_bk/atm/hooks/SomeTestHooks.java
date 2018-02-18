package clm.cuc_for_java_bk.atm.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SomeTestHooks
{
	@Before
	public void beforeCallingScenario() throws InterruptedException
	{
		System.out.println("**** About to start the scenario.");
	}
	
	@After
	public void afterRunningScenario(Scenario scenario)
	{
		System.out.println("*** Just finished running scenario: " + scenario.getStatus());
	}
}
