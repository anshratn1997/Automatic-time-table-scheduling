
package ttms;

// code to generate add cource table
import java.io.Serializable;
import org.hibernate.annotations.Entity;
import javax.persistence.Id;
@Entity
public class addcource_table implements Serializable{
    private String department;
    private String year;
    @Id
    private String subcode;
    private int lpk;    
    private int tpk;    
    private int labpk;   

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSubcode() {
        return subcode;
    }

    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }

    public int getLpk() {
        return lpk;
    }

    public void setLpk(int lpk) {
        this.lpk = lpk;
    }

    public int getTpk() {
        return tpk;
    }

    public void setTpk(int tpk) {
        this.tpk = tpk;
    }

    public int getLabpk() {
        return labpk;
    }

    public void setLabpk(int labpk) {
        this.labpk = labpk;
    }
    
    

    
    
        
    
    
}
