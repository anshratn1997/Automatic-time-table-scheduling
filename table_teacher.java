
package ttms;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class table_teacher implements Serializable{
    @Id   
    private String techid;
    private String techname;
    private String techcontact;
    private String techsubcode;
  
    public String getTechid() {
        return techid;
    }
    
    public void setTechid(String techid) {
        this.techid = techid;
    }

    public String getTechname() {
        return techname;
    }

    public void setTechname(String techname) {
        this.techname = techname;
    }

    public String getTechcontact() {
        return techcontact;
    }

    public void setTechcontact(String techcontact) {
        this.techcontact = techcontact;
    }

    public String getTechsubcode() {
        return techsubcode;
    }

    public void setTechsubcode(String techsubcode) {
        this.techsubcode = techsubcode;
    }
    
    
    
}
