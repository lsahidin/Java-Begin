package Utils;
// Generated Jan 27, 2016 3:19:00 PM by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private int id;
     private String nama;
     private String email;

    public User() {
    }

	
    public User(int id) {
        this.id = id;
    }
    public User(int id, String nama, String email) {
       this.id = id;
       this.nama = nama;
       this.email = email;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


