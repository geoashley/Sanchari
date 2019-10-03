package com.sanchari.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastNname;

    @Column(unique = true)
    private String userName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNname() {
        return lastNname;
    }

    public void setLastNname(String lastNname) {
        this.lastNname = lastNname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastNname='" + lastNname + '\'' +
                '}';
    }
}
