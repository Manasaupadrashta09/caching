package com.java.servlet;

import java.io.IOException;
import com.java.servlet.DistributedCache;
import com.java.servlet.ReplicatedCache;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DistributedCache cache = new DistributedCache();
		ReplicatedCache cache1 = new ReplicatedCache();
		
		cache.saveData("Manasa", "Upadrashta");
		cache1.saveData("Manisha", "Upadrashta");
		response.setContentType("text/html");
		PrintWriter output = response.getWriter();
		output.print("<html><body>");
		output.print("<h3>Hi This is my first servlet...</h3>");
		output.print("</body></html>");
		
	}

}
