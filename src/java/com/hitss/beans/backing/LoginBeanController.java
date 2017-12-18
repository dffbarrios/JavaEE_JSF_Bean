package com.hitss.beans.backing;
import com.hitss.beans.model.LoginBean;
import com.hitss.services.webservice.WSUser_Service;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;

//Named: loginBeanController
@ManagedBean
@SessionScoped
public class LoginBeanController 
        implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/_diegofernandobarrios_17122017_webservice/WSUser.wsdl")
    private WSUser_Service service;
    @ManagedProperty(value="#{loginBean}")
    private LoginBean loginBean;
    private String message;
    
    public LoginBeanController() { }

    public String loginAction(){
       if(!checkCredentials(
            this.loginBean.getUsername(),
            this.loginBean.getPassword()).isEmpty()){
            FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().getSessionMap().put("user",  this.loginBean.getUsername());
            this.loginBean.setLoged(true);
            return "register-user";
       }else{
           this.message = "Combinación errada de usuario y contraseña";
           return "messages";
        }
    }
    
    public String logoutAction(){
       this.loginBean.setLoged(false);
       FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
       return "index";
    }

    private java.util.List<com.hitss.services.webservice.User> 
            checkCredentials(String username, String password) {
        com.hitss.services.webservice.WSUser port = service.getWSUserPort();
        return port.checkCredentials(username, password);
    }
    
    public LoginBean getLoginBean() {
        return loginBean;
    }
    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }     
}
