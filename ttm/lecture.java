import java.io.*;
import java.util.*;
import java.math.*;
import javafx.util.Pair;
class Main
{

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
         
        public FastReader ()
        {
            
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        
        
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int iint()
        {
            return Integer.parseInt(next());
        }
 
        long ilong()
        {
            return Long.parseLong(next());
        }
 
        double idouble()
        {
            return Double.parseDouble(next());
        }
 
        String readline()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }        
    }
 
 
 public static void main(String[] args)
    {
        FastReader s=new FastReader();
        String str[]={"Kcs601","Kcs602","Kcs603","Kcs604","Kcs605"};
        int lect[]=new int[5];
        lect[0]=4;lect[1]=3;lect[2]=3;lect[3]=3;lect[4]=3;
         boolean fi=true;

         while(fi){
        int lecture[]=new int[5];
        for (int i=0;i<5 ;i++ ) {
          lecture[i]=lect[i];
        }
        boolean end=true;
        HashSet<String> set=new HashSet<>();
        int count=0;
       
        
        //for Monday

        while(end) {
            double i=Math.random()*5;
            if(set.contains(str[(int)i]))
            {
               end=true;
            }
            else
            {    if(lecture[(int)i]!=0){
                  set.add(str[(int)i]);
                  count++;
                  lecture[(int)i]--;
                  System.out.println(str[(int)i]);
               }

                
                if(count==4)
                    end=false;
            }
        }
        count=0;
        end=true;
        set.clear();
        System.out.println("hello");
        //for tuesday
        while(end){
            //System.out.println("ok");
            double i=Math.random()*5;
            
            if(set.contains(str[(int)i]))
            {
               end=true;
            }
            else
            {    if(lecture[(int)i]!=0){
                   set.add(str[(int)i]);
                  count++;
                  lecture[(int)i]--;
                  System.out.println(str[(int)i]);
               }

                if(count==2)
                    end=false;
            }

        }
        count=0;
        end=true;
        set.clear();
             System.out.println("hello");
                                                //for wednesday
         while(end){
            //System.out.println("ok");
            double i=Math.random()*5;
          
            if(set.contains(str[(int)i]))
            {
               end=true;
            }
            else
            {    if(lecture[(int)i]!=0){
                   set.add(str[(int)i]);
                  count++;
                  lecture[(int)i]--;
                  System.out.println(str[(int)i]);
               }

                if(count==3)
                    end=false;
            }
            
        }
        count=0;
        end=true;
        set.clear();
             System.out.println("hello");
           int temp=0;                                             //for thrusday
         while(end){
            //System.out.println("ok");
            double i=Math.random()*5;
            temp++;
            if(set.contains(str[(int)i]))
            {
               end=true;
            }
            else
            {    if(lecture[(int)i]!=0){
                   set.add(str[(int)i]);
                  count++;
                  lecture[(int)i]--;
                  System.out.println(str[(int)i]);
               }

                if(count==2)
                    end=false;
            }
            if(temp==11){
              fi=true;
              break;
            }
        }
        if(temp==11)
          continue;
        count=0;
        end=true;
        set.clear();
             System.out.println("hello");
          temp=0;                                          //for friday
         while(end){
            //System.out.println("ok");
          temp++;
            double i=Math.random()*5;
            if(set.contains(str[(int)i]))
            {
               end=true;
            }
            else
            {    if(lecture[(int)i]!=0){
                   set.add(str[(int)i]);
                  count++;
                  lecture[(int)i]--;
                  System.out.println(str[(int)i]);
               }

                if(count==3)
                    end=false;
            }
            if(temp==11){
              fi=true;
              break;
            }
        }
        if(temp==11)
          continue;
        count=0;
        end=true;
        set.clear();
             System.out.println("hello");
                                                  //for saturday
              temp=0;
         while(end){
            //System.out.println("ok");
            double i=Math.random()*5;
            temp++;
            System.out.println(temp);
            if(set.contains(str[(int)i]))
            {
               end=true;
            }
            else
            {    if(lecture[(int)i]!=0){
                   set.add(str[(int)i]);
                  count++;
                  lecture[(int)i]--;
                  System.out.println(str[(int)i]);
               }

                if(count==2)
                    end=false;
            }
            if(temp==11){
              fi=true;
              end=false;
            }
        }
        if(temp==11){
          
          continue;
        }
        else
          fi=false;

        
    }
  }
}