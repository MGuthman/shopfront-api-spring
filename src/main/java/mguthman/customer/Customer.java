
package mguthman.customer;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id 
    @GeneratedValue (generator = "my_increment")     
    @GenericGenerator (name = "my_increment", strategy = "increment") 
    private Long id;
    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId () {
        return id;
    }
}
