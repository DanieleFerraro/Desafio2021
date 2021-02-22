package com.example.demo;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Contatos {
 
    @Id @GeneratedValue
    private Long id; 
    private String Name;
    private String password;
    private String email;
    private Long phone;
    
    
    public void User(String Name, String email, String password, Long phone) {
        this.Name = Name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }


	public Map<String, ?> getId() {
		
		return null;
	}
}
