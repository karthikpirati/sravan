package jnet.agreement.model;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;

@Entry(base = "ou=Forms,ou=DigitalAgreements,o=jnet",objectClasses={"jnetAgreementForm","Top"} )
public final class Forms {

    @Id
    private Name dn;
    @Attribute(name="jnetAgreementFormName" )
    private String jnetAgreementFormName;
    @Attribute(name="jnetAgreementFormVersion" )
    private String jnetAgreementFormVersion;
    @Attribute(name="jnetAgreementFormData" )
    private String jnetAgreementFormData;
    @Attribute(name="JNETAgreementFormDisplayName" )
    private String JNETAgreementFormDisplayName;
    @Attribute(name="jnetUsedforAccessControl" )
    private String jnetUsedforAccessControl;


    public Forms() {
    }

    public Name getDn() {
        return dn;
    }

    public void setDn(Name dn) {
        this.dn = dn;
    }

    public String getJnetAgreementFormName() {
        return jnetAgreementFormName;
    }

    public void setJnetAgreementFormName(String jnetAgreementFormName) {
        this.jnetAgreementFormName = jnetAgreementFormName;
    }

    public String getJnetAgreementFormVersion() {
        return jnetAgreementFormVersion;
    }

    public void setJnetAgreementFormVersion(String jnetAgreementFormVersion) {
        this.jnetAgreementFormVersion = jnetAgreementFormVersion;
    }

    public String getJnetAgreementFormData() {
        return jnetAgreementFormData;
    }

    public void setJnetAgreementFormData(String jnetAgreementFormData) {
        this.jnetAgreementFormData = jnetAgreementFormData;
    }

    public String getJNETAgreementFormDisplayName() {
        return JNETAgreementFormDisplayName;
    }

    public void setJNETAgreementFormDisplayName(String JNETAgreementFormDisplayName) {
        this.JNETAgreementFormDisplayName = JNETAgreementFormDisplayName;
    }

    public String getJnetUsedforAccessControl() {
        return jnetUsedforAccessControl;
    }

    public void setJnetUsedforAccessControl(String jnetUsedforAccessControl) {
        this.jnetUsedforAccessControl = jnetUsedforAccessControl;
    }
}
