package pet.store.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String employeeName;

    @ManyToOne
    @JoinColumn(name = "pet_store_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private PetStore petStore;

    // Constructors, Getters, and Setters
}






