package myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mybean.*; 
import javax.servlet.http.*;

/**
 * Servlet implementation class HandleArea
 */
@WebServlet("/HandleArea")
public class HandleArea extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleArea() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		//1.�ȴ��� javabean ���� 
		  Area databean=new Area(); 
		  //2.�� databean �洢�� session ������ 
		  HttpSession session=request.getSession(true); 
		  session.setAttribute("data", databean); 
		  //3.���� request ����� inputData ҳ���л�ȡ����
//		���ϵ��µ׺͸ߣ�������ת��Ϊ double ���� 
		  try { 
		   double 
		a=Double.parseDouble(request.getParameter("a")); 
		   double 
		b=Double.parseDouble(request.getParameter("b")); 
		   double 
		c=Double.parseDouble(request.getParameter("c")); 
		   //4.����ҳ���л�ȡ����������ģ�� databean �� 
		   databean.setA(a); 
		   databean.setB(b); 
		   databean.setC(c); 
		   double s=-1; 
		   s=(a+b)*c/2.0; 
		   databean.setArea(s); 
		   databean.setMessage("����"); 
		  } 
		  catch(Exception e) { 
		   databean.setArea(-1); 
		   databean.setMessage(""+e); 
		  } 
		  //5.�ض��� show.jsp ҳ�� 
		  response.sendRedirect("show.jsp"); 
		 } 
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
