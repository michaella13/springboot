package Big.group.StudentMis.model;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dob;
    private int age;
    public Student(){

    }
    
 
 


    public Student(long id, String firstName, String lastName, String email, LocalDate dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
    }


    public Student(String firstName, String lastName, String email, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
    }


    public int getAge() {
        LocalDate today=LocalDate.now();
        int age=0;
        if(this.dob!=null){
            age=Period.between(this.dob, today).getYears();
        }
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
  
}
