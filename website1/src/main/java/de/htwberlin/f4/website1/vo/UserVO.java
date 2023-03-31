package de.htwberlin.f4.website1.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {

    private Long id;
    private String firstname;
    private String lastname;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    
    
	

}