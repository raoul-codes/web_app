package de.htwberlin.f4.website1.persitence.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;


@Entity
@Table(name = "USERS")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    private Long id;

    @Column(name = "USER_FIRSTNAME")
    private String firstName;

    @Column(name = "USER_LASTNAME")
    private String lastName;
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	
}
