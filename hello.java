import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
public class hello extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");//setting the content type  
PrintWriter pw=res.getWriter();//get the stream to write the data  
//creating a cookie
Cookie ck=new Cookie("user","sonoo jaiswal");//creating cookie object  
res.addCookie(ck);
//writing html in the stream  
pw.println("<html><body>");  
pw.println("Welcome to servlet"); 
pw.println("<form method='post' action='/form2'>"); 
pw.println("<label>Name</label>"); 
pw.println("<input type='text' name='text/>"); 
pw.println("<input type='submit' value='submit'/>");
pw.println("</form>"); 
pw.println("</body></html>");  
//getting cookies
Cookie c[]=req.getCookies();  
for(int i=0;i<c.length;i++){  
 pw.print("<br>"+c[i].getName()+" "+c[i].getValue());//printing name and value of cookie  
}
  
pw.close();//closing the stream  
}}