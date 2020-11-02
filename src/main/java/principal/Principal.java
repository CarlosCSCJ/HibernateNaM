package principal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Principal {
	
	public static void main(String[] args) {
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    	Session session = sf.openSession();

//    	Employees e = session.load(Employees.class, 10001);
//    	System.out.println(e.getFirstName());	
    		
    	session.close();
	}

}
