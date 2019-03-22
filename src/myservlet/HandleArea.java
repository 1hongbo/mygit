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
		//1.先创建 javabean 对象 
		  Area databean=new Area(); 
		  //2.将 databean 存储到 session 对象中 
		  HttpSession session=request.getSession(true); 
		  session.setAttribute("data", databean); 
		  //3.利用 request 对象从 inputData 页面中获取梯形
//		的上底下底和高，并将其转换为 double 数据 
		  try { 
		   double 
		a=Double.parseDouble(request.getParameter("a")); 
		   double 
		b=Double.parseDouble(request.getParameter("b")); 
		   double 
		c=Double.parseDouble(request.getParameter("c")); 
		   //4.将从页面中获取的数据送往模型 databean 中 
		   databean.setA(a); 
		   databean.setB(b); 
		   databean.setC(c); 
		   double s=-1; 
		   s=(a+b)*c/2.0; 
		   databean.setArea(s); 
		   databean.setMessage("梯形"); 
		  } 
		  catch(Exception e) { 
		   databean.setArea(-1); 
		   databean.setMessage(""+e); 
		  } 
		  //5.重定向到 show.jsp 页面 
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
