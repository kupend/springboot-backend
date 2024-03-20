package net.javaguides.springbootbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "employees")
public class Employee {
    // this has a primary key

   @Id
    //primary key generation strategy
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //colimn annotation to map the column name, specifying "null= false" then it is not null
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private  String lastName;
    @Column(name="email_id")
    private String emailId;


}
