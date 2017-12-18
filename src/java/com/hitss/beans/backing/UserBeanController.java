package com.hitss.beans.backing;
import com.hitss.beans.model.UserBean;
import com.hitss.services.webservice.WSUser_Service;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.xml.ws.WebServiceRef;

//@Named(value = "userBeanController")
@ManagedBean
@RequestScoped
public class UserBeanController {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/_diegofernandobarrios_17122017_webservice/WSUser.wsdl")
    private WSUser_Service service;
        
    @ManagedProperty(value = "#{userBean}")
    private UserBean userBean;    
    private String message;
    
    public UserBeanController() {}
    
    public String insertUser(){
        String msg = persistingUser(
                "michaelwatts", "mypass",
                this.userBean.getUsrName(),this.userBean.getUsrLastname(),
                this.userBean.getUsrUsername(),this.userBean.getUsrPassword(),
                this.userBean.getUsrEtaid()                
        );
        this.message = msg;
        return "messages";
    }

    private String persistingUser(
            String currentUser, String currentPass, String name, 
            String lastname, String username, String password, String status) {
        com.hitss.services.webservice.WSUser port = service.getWSUserPort();
        return port.insertUser(currentUser, currentPass, name, lastname, username, password, status);
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }   
}
