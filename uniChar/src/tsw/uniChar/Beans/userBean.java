package tsw.uniChar.Beans;

import java.io.Serializable;

public class userBean implements Serializable {
	int id = -1;
	String name = "";
	String surname = "";
	String role = "";
	String user = "";
	String password = "";
	String newPassword = "";
	String email = "";


    public userBean() {
    }


    public userBean(String user, String password) {
    	this.user = user;
    	this.password = password;
    }
    
    public userBean(int id, String name, String surname, String role, String user, String password,String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.user = user;
        this.password = password;
        this.email = email;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setNewPassword(String newPassword) {
    	this.newPassword = newPassword;
    }

    public String getNewPassword() {
    	return this.newPassword;
    }
    
    public String getEmail() {
    	return this.email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    @Override
    public String toString() {
    	return "Utente: " + this.getName() + " " + this.getSurname() + 
    			"  \nUsername: " + this.getUser() + ", \neMail: " + this.getEmail();
    }
    
}