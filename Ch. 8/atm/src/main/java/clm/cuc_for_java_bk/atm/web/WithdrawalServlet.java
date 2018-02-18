package clm.cuc_for_java_bk.atm.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clm.cuc_for_java_bk.atm.nicebank.Account;
import clm.cuc_for_java_bk.atm.nicebank.AutomatedTeller;
import clm.cuc_for_java_bk.atm.nicebank.CashSlot;
import clm.cuc_for_java_bk.atm.nicebank.Teller;

@WebServlet(description = "Cash Withdrawal Servlet", urlPatterns = { "/withdraw" })
public class WithdrawalServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	public WithdrawalServlet(CashSlot cashSlot, Account account)
	{
		this.cashSlot = cashSlot;
		this.account = account;
	}
	
	private CashSlot cashSlot;
	private Account account;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Teller teller = new AutomatedTeller(cashSlot);
		int amount = Integer.parseInt(request.getParameter("amount"));
		teller.withdrawFrom(account, amount);
		
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println(
				"<html>"
						+"<head>"
						+"<title>Nice Bank ATM</title>"
						+"</head>"
						+"<body>"
						+"Please take your $" + amount
						+"</body>"
				+"</html>"
				);
	}
}
