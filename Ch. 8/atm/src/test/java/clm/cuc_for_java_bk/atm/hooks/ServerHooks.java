package clm.cuc_for_java_bk.atm.hooks;

import clm.cuc_for_java_bk.atm.server.AtmServer;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServerHooks
{
	public static final int PORT = 8887;
	
	private AtmServer server;
	
	@Before
	public void startServer() throws Exception
	{
		server = new AtmServer(PORT);
		server.start();
	}
	
	@After
	public void stopServer() throws Exception
	{
		server.stop();
	}
}
