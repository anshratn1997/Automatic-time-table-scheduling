
package ttms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class tuteassigndb {
    static SessionFactory ssf=new Configuration().configure().buildSessionFactory();
    
        public void tute(tuteassign_table t)
        {
        Session ss=ssf.openSession();
        ss.beginTransaction();
        ss.save(t);
        ss.getTransaction().commit();
        
        }     
    
}
