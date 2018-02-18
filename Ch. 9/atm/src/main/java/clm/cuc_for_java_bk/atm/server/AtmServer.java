package clm.cuc_for_java_bk.atm.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import clm.cuc_for_java_bk.atm.nicebank.Account;
import clm.cuc_for_java_bk.atm.nicebank.CashSlot;
import clm.cuc_for_java_bk.atm.web.AtmServlet;
import clm.cuc_for_java_bk.atm.web.WithdrawalServlet;

public class AtmServer
{
	private static final Logger LOG = LogManager.getLogger(AtmServer.class);
	
	public AtmServer(int port, CashSlot cashSlot, Account account)
	{
		SERVER = new Server(9988);
		
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");
		SERVER.setHandler(context);
		
		context.addServlet(new ServletHolder(new AtmServlet()), "/");
		context.addServlet(new ServletHolder(new WithdrawalServlet(cashSlot, account)), "/withdraw");
	}
	
	private final Server SERVER;
	
	public void start() throws Exception
	{
		SERVER.start();
		
		LOG.info("Listening on " + SERVER.getURI());
	}
	
	public void stop() throws Exception
	{
		SERVER.stop();
		LOG.info("Server shutdown");
	}

	public static void main(String[] args) throws Exception
	{
		new AtmServer(9988, new CashSlot(), new Account()).start();
		LOG.debug("++ Atm Server Started");
	}

}