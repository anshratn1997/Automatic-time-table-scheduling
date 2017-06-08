
package ttms;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import static ttms.ttmsdb.ssf;

public class labassigndb {
    public static SessionFactory ssf=new Configuration().configure().buildSessionFactory();
    
        public void lab(labassign_table t)
        {
         Session ss=ssf.openSession();
         ss.beginTransaction();
         ss.save(t);
         ss.getTransaction().commit();
        
        }    
        public String[] fetchlab()
        {
            Session ss=ssf.openSession();
            ss.beginTransaction();
            Query q=ss.createQuery("from labassign_table");
            List<labassign_table> l=q.list();
            String[] lab_tute=new String[l.size()];
            int  i=0;
            for(labassign_table al:l)
            {
                lab_tute[i]=al.getSubcode();
                i++;
            }
            ss.getTransaction().commit();
            return lab_tute;
            
        }
    
}
