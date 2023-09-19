package register.registerationformthymleaf.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class user {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,name = "first_Name")
    private String firstName;
    @Column(nullable = false,name = "last_Name")
    private String lastName;
    @Column(nullable = false)
    private String email;
    @Column(name="password", nullable=false)
    private String password;


public user(){

}


public user(String firstName, String lastName, String email, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
}


public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}


public String getFirstName() {
    return firstName;
}


public void setFirstName(String firstName) {
    this.firstName = firstName;
}


public String getLastName() {
    return lastName;
}


public void setLastName(String lastName) {
    this.lastName = lastName;
}


public String getEmail() {
    return email;
}


public void setEmail(String email) {
    this.email = email;
}


public String getPassword() {
    return password;
}


public void setPassword(String password) {
    this.password = password;
}






}
