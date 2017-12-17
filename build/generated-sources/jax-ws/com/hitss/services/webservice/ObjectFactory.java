
package com.hitss.services.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hitss.services.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckCredentials_QNAME = new QName("http://webservice.services.hitss.com/", "checkCredentials");
    private final static QName _CheckCredentialsResponse_QNAME = new QName("http://webservice.services.hitss.com/", "checkCredentialsResponse");
    private final static QName _DeleteUser_QNAME = new QName("http://webservice.services.hitss.com/", "deleteUser");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://webservice.services.hitss.com/", "deleteUserResponse");
    private final static QName _InsertUser_QNAME = new QName("http://webservice.services.hitss.com/", "insertUser");
    private final static QName _InsertUserResponse_QNAME = new QName("http://webservice.services.hitss.com/", "insertUserResponse");
    private final static QName _ListUser_QNAME = new QName("http://webservice.services.hitss.com/", "listUser");
    private final static QName _ListUserResponse_QNAME = new QName("http://webservice.services.hitss.com/", "listUserResponse");
    private final static QName _ListUsers_QNAME = new QName("http://webservice.services.hitss.com/", "listUsers");
    private final static QName _ListUsersResponse_QNAME = new QName("http://webservice.services.hitss.com/", "listUsersResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://webservice.services.hitss.com/", "updateUser");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://webservice.services.hitss.com/", "updateUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hitss.services.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckCredentials }
     * 
     */
    public CheckCredentials createCheckCredentials() {
        return new CheckCredentials();
    }

    /**
     * Create an instance of {@link CheckCredentialsResponse }
     * 
     */
    public CheckCredentialsResponse createCheckCredentialsResponse() {
        return new CheckCredentialsResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link InsertUser }
     * 
     */
    public InsertUser createInsertUser() {
        return new InsertUser();
    }

    /**
     * Create an instance of {@link InsertUserResponse }
     * 
     */
    public InsertUserResponse createInsertUserResponse() {
        return new InsertUserResponse();
    }

    /**
     * Create an instance of {@link ListUser }
     * 
     */
    public ListUser createListUser() {
        return new ListUser();
    }

    /**
     * Create an instance of {@link ListUserResponse }
     * 
     */
    public ListUserResponse createListUserResponse() {
        return new ListUserResponse();
    }

    /**
     * Create an instance of {@link ListUsers }
     * 
     */
    public ListUsers createListUsers() {
        return new ListUsers();
    }

    /**
     * Create an instance of {@link ListUsersResponse }
     * 
     */
    public ListUsersResponse createListUsersResponse() {
        return new ListUsersResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCredentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "checkCredentials")
    public JAXBElement<CheckCredentials> createCheckCredentials(CheckCredentials value) {
        return new JAXBElement<CheckCredentials>(_CheckCredentials_QNAME, CheckCredentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCredentialsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "checkCredentialsResponse")
    public JAXBElement<CheckCredentialsResponse> createCheckCredentialsResponse(CheckCredentialsResponse value) {
        return new JAXBElement<CheckCredentialsResponse>(_CheckCredentialsResponse_QNAME, CheckCredentialsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "insertUser")
    public JAXBElement<InsertUser> createInsertUser(InsertUser value) {
        return new JAXBElement<InsertUser>(_InsertUser_QNAME, InsertUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "insertUserResponse")
    public JAXBElement<InsertUserResponse> createInsertUserResponse(InsertUserResponse value) {
        return new JAXBElement<InsertUserResponse>(_InsertUserResponse_QNAME, InsertUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "listUser")
    public JAXBElement<ListUser> createListUser(ListUser value) {
        return new JAXBElement<ListUser>(_ListUser_QNAME, ListUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "listUserResponse")
    public JAXBElement<ListUserResponse> createListUserResponse(ListUserResponse value) {
        return new JAXBElement<ListUserResponse>(_ListUserResponse_QNAME, ListUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "listUsers")
    public JAXBElement<ListUsers> createListUsers(ListUsers value) {
        return new JAXBElement<ListUsers>(_ListUsers_QNAME, ListUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "listUsersResponse")
    public JAXBElement<ListUsersResponse> createListUsersResponse(ListUsersResponse value) {
        return new JAXBElement<ListUsersResponse>(_ListUsersResponse_QNAME, ListUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.services.hitss.com/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

}
