package clm.cuc_for_java_bk.atm.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AtmServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println(
				"<html>"
				+"<head>"
				+"<title>Nice Bank ATM</title>"
				+"</head>"
				+"<body>"
				+"<h1>Welcome to our nice bank!</h1>"
				+"<form action=\"/withdraw\" method=\"POST\">"
				+"<input type=\"button\" value=\"20\" id=\"20\" name=\"twenty\" onclick=\"setAmount(this.value)\"><br>"
				+"<input type=\"button\" value=\"40\" id=\"40\" name=\"forty\" onclick=\"setAmount(this.value)\"><br>"
				+"<input type=\"button\" value=\"60\" id=\"60\" name=\"sixty\" onclick=\"setAmount(this.value)\"><br>"
				+"<input type=\"button\" value=\"80\" id=\"80\" name=\"eighty\" onclick=\"setAmount(this.value)\"><br>"
				+"<input type=\"button\" value=\"100\" id=\"100\" name=\"one_hundred\" onclick=\"setAmount(this.value)\"><br>"
				+"<label for=\"amount\">Amount</label>"
				+"<input type=\"text\" id=\"amount\" name=\"amount\"><br>"
				+"<button type=\"submit\" id=\"withdraw\">Withdraw</button>"
				+"</form>"
				+"<script>"
				+"function setAmount(value) {"
				+"document.getElementById('amount').value = value"
				+"}"
				+"</script>"
				+"</body>"
				+"</html>"
				);
	}
}
