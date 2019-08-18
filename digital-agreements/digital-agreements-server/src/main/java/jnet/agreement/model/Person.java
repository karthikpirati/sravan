package jnet.agreement.model;


import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.DnAttribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;

@Entry(base = "ou=Active,ou=People,o=jnet", objectClasses = {"top", "person"})
public class Person {

    @Id
    private Name dn;

    @Attribute(name = "cn")
    @DnAttribute("cn")
    private String userID;

    public Name getDn() {
        return dn;
    }

    public void setDn(Name dn) {
        this.dn = dn;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
