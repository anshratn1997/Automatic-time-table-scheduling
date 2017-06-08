
package ttms;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ttmsdbassignteacher {
 
    static SessionFactory ssf=new Configuration().configure().buildSessionFactory();
    
    
        public void assignteacher(teacherassign t)
        {
        Session ss=ssf.openSession();
        ss.beginTransaction();
        ss.save(t);
        ss.getTransaction().commit();        
        }    
        public String[] fetchsub()
        {
            
            Session ss=ssf.openSession();
            ss.beginTransaction();
            Query q=ss.createQuery("from teacherassign");
  
            List<teacherassign> l=q.list();
            String[] sub=new String[l.size()];
            int i=0;
            
            for(teacherassign al:l)
            {
                sub[i]=al.getSubcode();
                i++;
    
            }
            ss.getTransaction().commit();
            return sub;
        }
        public String[] fetchtechname()
        {
            Session ss=ssf.openSession();
            ss.beginTransaction();
            Query q=ss.createQuery("from teacherassign");
  
            List<teacherassign> l=q.list();
            String[] tech=new String[l.size()];
            int i=0;
            for(teacherassign al:l)
            {
                tech[i]=al.getTechname();
                i++;
    
            }
            ss.getTransaction().commit();
            return tech;
        }
}
