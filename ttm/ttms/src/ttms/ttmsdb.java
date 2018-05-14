
package ttms;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;

import org.hibernate.cfg.Configuration;

public class ttmsdb {
   
        
    static SessionFactory ssf=new Configuration().configure().buildSessionFactory();
    
        public void insert(table_teacher t)
        {
        Session ss=ssf.openSession();
        ss.beginTransaction();
        ss.save(t);
        ss.getTransaction().commit();
        }
    
        public ArrayList<ArrayList<String> > show()
        {
            ArrayList<ArrayList<String> > al=new ArrayList<ArrayList<String> >();
            table_teacher t=null;
            Session ss=ssf.openSession();
            ss.beginTransaction();
            Query q=ss.createQuery("from table_teacher");
            List<table_teacher> l=q.list();
            
            for(table_teacher row:l)
            {
             ArrayList<String> rowal=new ArrayList<String>(4);
             rowal.add(row.getTechid());
             rowal.add(row.getTechname());
             rowal.add(row.getTechcontact());
             rowal.add(row.getTechsubcode());
             al.add(rowal);
            }      
            ss.getTransaction().commit();
            return al;
         }
      public String[] techlist()
       {
             Session ss=ssf.openSession();
             ss.beginTransaction();
             Query q=ss.createQuery("from table_teacher");
             List<table_teacher> l=q.list();
             String[] tlist=new String[l.size()];
             int i=0;
             for(table_teacher t1:l)
             {
                 tlist[i]=new String(t1.getTechid());
                 i++;
             }
             ss.getTransaction().commit();
             return tlist;
       }
        
}