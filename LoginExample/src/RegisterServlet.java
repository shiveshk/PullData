

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;

import com.hams.data.User1;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get data from register.jsp and save in variables
				String user_name = null;
				String password = null;
				String time = null;
				
				user_name = request.getParameter("user_name");
				password = request.getParameter("password");
				time = request.getParameter("time");
				
				
				
				//use string builder to build message
				StringBuilder message = null;
				try {
					message = new StringBuilder(" Dear " + user_name + " Successfully Registered .");
				} catch (Exception e) {
					e.printStackTrace();
					//LOGGER.info(e);
				}
				
				try {
					String html = "<html><h2>"+message+"</h2></html>";
		            response.getWriter().println(html);
		        } catch (IOException e) {
		            e.printStackTrace();
		            //LOGGER.info(e);
		        }
				
				//creating configuration object  
				Configuration cfg = null;
				try {
					cfg = new Configuration();  
					//populates the data of the configuration file 
					cfg.configure("hibernate.cfg.xml"); 
				} catch (HibernateException e) {
					e.printStackTrace();
					//LOGGER.info(e);
					
				}
			    // creating session factory object  
			    SessionFactory factory = null;
				try {
					factory = cfg.buildSessionFactory();
				} catch (HibernateException e) {
					e.printStackTrace();
					//LOGGER.info(e);
				}  
			      
			    //creating session object  
			    Session session1 = null;
				try {
					session1 = factory.openSession();
				} catch (HibernateException e) {
					e.printStackTrace();
					//LOGGER.info(e);
				}  
			      
			    //creating transaction object  
				Transaction t = null;
				try {
					t = session1.beginTransaction();
				} catch (HibernateException e) {
					e.printStackTrace();
					//LOGGER.info(e);
					
				}  
				// 1) create a java calendar instance
				Calendar calendar = Calendar.getInstance();
				 
				// 2) get a java.util.Date from the calendar instance.
				//this date will represent the current instant, or "now".
				java.util.Date now = calendar.getTime();
				 
				// 3) a java current time (now) instance
				java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
						
			    User1 user = new User1();  
			    
			    user.setTime_stamp(currentTimestamp);
			    user.setPassword(password);
			    user.setUser_name(user_name);
			    
			    
			    
			    //persisting the object
			    try {
					session1.save(user);  
				} catch (HibernateException e) {
					
					e.printStackTrace();
					//LOGGER.info(e);
				}
			    
			    //transaction is committed 
			    t.commit(); 
			    try {
					session1.close();
				} catch (HibernateException e) {
					
					e.printStackTrace();
					//LOGGER.info(e);
				}  
			      
			    System.out.println("successfully saved");  
			      
				//LOGGER.info(message);
				String nextJSP = "/login.html";
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
				
				
				dispatcher.forward(request,response);
			}
			

		
	

}
