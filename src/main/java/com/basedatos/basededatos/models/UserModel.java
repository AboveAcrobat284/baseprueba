package com.basedatos.basededatos.models;

import jakarta.persistence.*;
@Entity
@Table(schema = "user")
public class UserModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "e_mail")
    private String eMail;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail() {
        return eMail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {return userName;}

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {return userPassword;}


}
