package clm.cuc_for_java_bk.atm.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import clm.cuc_for_java_bk.atm.web.AtmServlet;

public class AtmServer
{
	public AtmServer(int port)
	{
		SERVER = new Server(9988);
		
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");
		SERVER.setHandler(context);
		
		context.addServlet(new ServletHolder(new AtmServlet()), "/*");
	}
	
	private final Server SERVER;
	
	public void start() throws Exception
	{
		SERVER.start();
		
		System.out.println("Listening on " + SERVER.getURI());
	}
	
	public void stop() throws Exception
	{
		SERVER.stop();
	}

	public static void main(String[] args) throws Exception
	{
		new AtmServer(9988).start();
	}

}
