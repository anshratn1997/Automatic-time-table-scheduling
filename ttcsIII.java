
package ttms.timetable;
import java.util.*;
public class ttcsIII {
   
     
    
    public String[][] create(String[] str,String[] techname,int[] lect,String[] lab_tute)
    {
        
        String[][] table=new String[6][7];
        boolean fi=true;
        while(fi){
           
        int lecture[]=new int[5];
        for(int i=0;i<5;i++)
        {
            lecture[i]=lect[i];
        }
        boolean end=true;
        HashSet<String> set=new HashSet<>();
        int count=0;
        int inc=0;
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
                  table[0][inc]=str[(int)i]+"("+techname[(int)i]+")";
                  inc++;
               }

                
                if(count==4)
                    end=false;
            }
            
        }
        count=0;
        end=true;
        set.clear();
        //System.out.println("hello");
         inc=0;
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
                  table[1][inc]=str[(int)i]+"("+techname[(int)i]+")";;
                  inc++;
               }

                if(count==2)
                    end=false;
            }
        }
        count=0;
        end=true;
        set.clear();
             //System.out.println("hello");
          inc=0;                                       //for wednesday
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
                  
                  table[2][inc]=str[(int)i]+"("+techname[(int)i]+")";
                  inc++;
               }

                if(count==3)
                    end=false;
            }
        }
        count=0;
        end=true;
        set.clear();
             //System.out.println("hello");
         inc=0;          
         //for thrusday
         int temp=0;
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
                  
                  table[3][inc]=str[(int)i]+"("+techname[(int)i]+")";
                  inc++;
               }

                if(count==2)
                    end=false;
            }
            if(temp==15)
            {
                
                fi=true;
                break;
            }
                
        }
         if(temp==15)
             continue;
        count=0;
        end=true;
        set.clear();
             //System.out.println("hello");
          inc=0;    
          temp=0;                     //for friday
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
                  
                  table[4][inc]=str[(int)i]+"("+techname[(int)i]+")";
                  inc++;
               }

                if(count==3)
                    end=false;
            }
            if(temp==15){
                fi=true;
                break;
            }
        }
        if(temp==15)
            continue;
        count=0;
        end=true;
        set.clear();
             //System.out.println("hello");
              inc=0;                                             
              //for saturday
              temp=0;
         while(end){
            //System.out.println("ok");
            double i=Math.random()*5;
           temp++;
           //System.out.println(temp);
            if(set.contains(str[(int)i]))
            {
               end=true;
            }
            else
            {    if(lecture[(int)i]!=0){
                   set.add(str[(int)i]);
                  count++;
                  lecture[(int)i]--;
                  
                  table[5][inc]=str[(int)i]+"("+techname[(int)i]+")";
                  inc++;
               }

                if(count==2)
                    end=false;
            }
            if(temp==15)
            {
                fi=true;
                break;
            }
        }
         if(temp==15){
            //System.out.println("ok aa gya hu");
             continue;}
         else
            fi=false;
    }
         //System.out.println("lectute have been completed");
        HashSet<String> lab=new HashSet<>();
        HashSet<String> tute1=new HashSet<>();
        HashSet<String> tute2=new HashSet<>();
        
        // for lab1 and tute2
        
        lab.add(lab_tute[0]);
        //System.out.println("lab1 "+lab_tute[0]);
        
        if(!tute2.add(lab_tute[1])){
            if(!tute2.add(lab_tute[2])){
                tute2.add(lab_tute[3]);
                
                table[0][5]=lab_tute[0]+"(p1)/"+lab_tute[3];
            }
            else
                table[0][5]=lab_tute[0]+"(p1)/"+lab_tute[2];
        } 
        else
            table[0][5]=lab_tute[0]+"(p1)/"+lab_tute[1].substring(0,4);
        if(!tute2.add(lab_tute[1])){
            if(!tute2.add(lab_tute[2])){
                tute2.add(lab_tute[3]); 
                table[0][6]="(t2),"+lab_tute[3]+"(t2)";
            }
            else
                table[0][6]=lab_tute[1].substring(4,6)+"-"+lab_tute[2]+"(t2)";
        } 
        else
                table[0][6]=lab_tute[0]+"/"+lab_tute[1];

         table[1][2]=lab_tute[0]+"(p2)/";
         table[1][3]=lab_tute[1]+"(p1)";
   
        //for lab2 and tute1
        lab.add(lab_tute[1]);
        //System.out.println("lab2 "+lab_tute[1]);
        if(!tute1.add(lab_tute[2])){
            if(!tute1.add(lab_tute[3])){
                tute1.add(lab_tute[0]);
                table[2][4]=lab_tute[1]+"/"+lab_tute[0];
            }
            else
            table[2][4]=lab_tute[1]+"/"+lab_tute[3];
        }
        else
        table[2][4]=lab_tute[1]+"(p2)/"+lab_tute[2].substring(0,4);
        
        if(!tute1.add(lab_tute[2]) ){
            if(!tute1.add(lab_tute[3])){
                tute1.add(lab_tute[0]);
                table[2][5]=lab_tute[1]+"/"+lab_tute[0];
            }
            else
            table[2][5]=lab_tute[2].substring(4,6)+"-"+lab_tute[3]+"(t1)";
        } 
        else
        table[2][5]=lab_tute[1]+"/"+lab_tute[2];
        
        
         table[3][2]=lab_tute[2]+"(p2)/";
         table[3][3]=lab_tute[3]+"(p1)";


        // for lab1 and tute 2
       lab.add(lab_tute[2]);
        //System.out.println("lab1 "+lab_tute[2]);
        if(!tute2.add(lab_tute[1])){
            if(!tute2.add(lab_tute[0])){
                tute2.add(lab_tute[3]);
                table[4][4]=lab_tute[2]+"/"+lab_tute[3];
            }
            else
               table[4][4]=lab_tute[2]+"(p1)/"+lab_tute[0].substring(0,4);
        } 
        else
            table[4][4]=lab_tute[2]+"/"+lab_tute[1];
                    
        if(!tute2.add(lab_tute[1])){
            if(!tute2.add(lab_tute[0])){
                tute2.add(lab_tute[3]); 
                table[4][5]=lab_tute[0].substring(4,6)+"-"+lab_tute[3]+"(t2)";
            }
            else
                table[4][5]=lab_tute[2]+"/"+lab_tute[0];
        } 
        else
                table[4][5]=lab_tute[2]+"/"+lab_tute[1];


            //for lab2 and tute1
        lab.add(lab_tute[3]);
        //System.out.println("lab2 "+lab_tute[3]);
        if(!tute1.add(lab_tute[2])){
            if(!tute1.add(lab_tute[1])){
                tute1.add(lab_tute[0]);
                table[5][2]=lab_tute[3]+"/"+lab_tute[0];
            }
            else
            table[5][2]=lab_tute[3]+"(p2)/"+lab_tute[1].substring(0,4);
        }
        else
        table[5][2]=lab_tute[3]+"/"+lab_tute[2];
        if(!tute1.add(lab_tute[2])){
            if(!tute1.add(lab_tute[1])){
                tute1.add(lab_tute[0]);
                table[5][3]=lab_tute[1].substring(4,6)+"-"+lab_tute[0]+"(t1)";
            }
            else
            table[5][3]=lab_tute[3]+"/"+lab_tute[2];
        } 
        else
        table[5][3]=lab_tute[3]+"/"+lab_tute[0];
     return table;

    
}

                
    }

  
        
