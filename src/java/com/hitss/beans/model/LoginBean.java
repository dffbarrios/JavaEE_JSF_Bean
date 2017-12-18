package com.hitss.beans.model;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;

//Name: loginBean
@ManagedBean
@SessionScoped
public class LoginBean 
        implements Serializable {
    
    private String username = "";
    private String password = "";
    private String name = "";
    private String lastname = "";
    private boolean loged = false;
    
    public LoginBean() {}
    public LoginBean(String username, String name, String lastname) {
        //this();
        this.username = username;
        this.name = name;
        this.lastname = lastname;
    }    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoged() {
        return loged;
    }

    public void setLoged(boolean loged) {
        this.loged = loged;
    }
    
    
}
