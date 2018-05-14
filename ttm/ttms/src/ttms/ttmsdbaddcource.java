package ttms;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ttmsdbaddcource {
     static SessionFactory ssf=new Configuration().configure().buildSessionFactory();
    
        public void courceinsert(addcource_table t)
        {
        Session ss=ssf.openSession();
        ss.beginTransaction();
        ss.save(t);
        ss.getTransaction().commit();
        }
       public String[] show(String dept,String yr)
       {
           Session ss=ssf.openSession();
           ss.beginTransaction();
           Query q=ss.createQuery("FROM addcource_table");
           List l=q.list();
           String[] subcodelist=new String[l.size()];
           int i=0;
          // System.out.println(dept+" "+yr);
           for(Object o : l)
           {
               addcource_table addcource=(addcource_table)o;
              // System.out.println(addcource.getDepartment()+" "+addcource.getYear());
              
              if(addcource.getDepartment().equals(dept) && addcource.getYear().equals(yr)){
               subcodelist[i]=new String(addcource.getSubcode().toString());
               i++;
              
              }
           
           }
           ss.getTransaction().commit();
           return subcodelist;
       }
       public int[] fetch_lecture()
       {
        Session ss=ssf.openSession();
           ss.beginTransaction();
           Query q=ss.createQuery("FROM addcource_table");
           List<addcource_table> l=q.list();   
           int lecture[]=new int[l.size()];
           int i=0;
           for(addcource_table at:l)
           {
               lecture[i]=at.getLpk();
               i++;
              
           }
            ss.getTransaction().commit();
            return lecture;
           
       }
}
