package com.hitss.beans.model;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

//Named: userBean
@ManagedBean
@RequestScoped
public class UserBean {

private Integer usrId;
    private String usrName;
    private String usrLastname;
    private String usrUsername;
    private String usrPassword;
    private Date usrCreationdate;
    private String usrEtaid;
       
    public UserBean() {}

    public UserBean(String usrName, String usrLastname, 
            String usrUsername, String usrPassword, String usrEtaid) {
        this.usrName = usrName;
        this.usrLastname = usrLastname;
        this.usrUsername = usrUsername;
        this.usrPassword = usrPassword;
        this.usrEtaid = usrEtaid;
    }
    
    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrLastname() {
        return usrLastname;
    }

    public void setUsrLastname(String usrLastname) {
        this.usrLastname = usrLastname;
    }

    public String getUsrUsername() {
        return usrUsername;
    }

    public void setUsrUsername(String usrUsername) {
        this.usrUsername = usrUsername;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public Date getUsrCreationdate() {
        return usrCreationdate;
    }

    public void setUsrCreationdate(Date usrCreationdate) {
        this.usrCreationdate = usrCreationdate;
    }

    public String getUsrEtaid() {
        return usrEtaid;
    }

    public void setUsrEtaid(String usrEtaid) {
        this.usrEtaid = usrEtaid;
    }     
}