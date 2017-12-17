
package com.hitss.services.webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSUser", targetNamespace = "http://webservice.services.hitss.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSUser {


    /**
     * 
     * @param currentUser
     * @param password
     * @param name
     * @param currentPass
     * @param lastname
     * @param username
     * @param status
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertUser", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.InsertUser")
    @ResponseWrapper(localName = "insertUserResponse", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.InsertUserResponse")
    @Action(input = "http://webservice.services.hitss.com/WSUser/insertUserRequest", output = "http://webservice.services.hitss.com/WSUser/insertUserResponse")
    public String insertUser(
        @WebParam(name = "currentUser", targetNamespace = "")
        String currentUser,
        @WebParam(name = "currentPass", targetNamespace = "")
        String currentPass,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "lastname", targetNamespace = "")
        String lastname,
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "status", targetNamespace = "")
        String status);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.util.List<com.hitss.services.webservice.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkCredentials", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.CheckCredentials")
    @ResponseWrapper(localName = "checkCredentialsResponse", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.CheckCredentialsResponse")
    @Action(input = "http://webservice.services.hitss.com/WSUser/checkCredentialsRequest", output = "http://webservice.services.hitss.com/WSUser/checkCredentialsResponse")
    public List<User> checkCredentials(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param idUser
     * @param currentUser
     * @param currentPass
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.DeleteUserResponse")
    @Action(input = "http://webservice.services.hitss.com/WSUser/deleteUserRequest", output = "http://webservice.services.hitss.com/WSUser/deleteUserResponse")
    public String deleteUser(
        @WebParam(name = "currentUser", targetNamespace = "")
        String currentUser,
        @WebParam(name = "currentPass", targetNamespace = "")
        String currentPass,
        @WebParam(name = "idUser", targetNamespace = "")
        int idUser);

    /**
     * 
     * @param currentUser
     * @param currentPass
     * @param username
     * @return
     *     returns java.util.List<com.hitss.services.webservice.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listUser", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.ListUser")
    @ResponseWrapper(localName = "listUserResponse", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.ListUserResponse")
    @Action(input = "http://webservice.services.hitss.com/WSUser/listUserRequest", output = "http://webservice.services.hitss.com/WSUser/listUserResponse")
    public List<User> listUser(
        @WebParam(name = "currentUser", targetNamespace = "")
        String currentUser,
        @WebParam(name = "currentPass", targetNamespace = "")
        String currentPass,
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param currentUser
     * @param currentPass
     * @return
     *     returns java.util.List<com.hitss.services.webservice.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listUsers", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.ListUsers")
    @ResponseWrapper(localName = "listUsersResponse", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.ListUsersResponse")
    @Action(input = "http://webservice.services.hitss.com/WSUser/listUsersRequest", output = "http://webservice.services.hitss.com/WSUser/listUsersResponse")
    public List<User> listUsers(
        @WebParam(name = "currentUser", targetNamespace = "")
        String currentUser,
        @WebParam(name = "currentPass", targetNamespace = "")
        String currentPass);

    /**
     * 
     * @param idUser
     * @param currentUser
     * @param password
     * @param name
     * @param currentPass
     * @param lastname
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://webservice.services.hitss.com/", className = "com.hitss.services.webservice.UpdateUserResponse")
    @Action(input = "http://webservice.services.hitss.com/WSUser/updateUserRequest", output = "http://webservice.services.hitss.com/WSUser/updateUserResponse")
    public String updateUser(
        @WebParam(name = "currentUser", targetNamespace = "")
        String currentUser,
        @WebParam(name = "currentPass", targetNamespace = "")
        String currentPass,
        @WebParam(name = "idUser", targetNamespace = "")
        int idUser,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "lastname", targetNamespace = "")
        String lastname,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}