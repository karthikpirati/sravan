package jnet.agreement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.ldap.query.LdapQuery;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.ldap.query.SearchScope;
import org.springframework.ldap.support.LdapNameBuilder;
import org.springframework.stereotype.Service;

import jnet.agreement.model.Forms;
import jnet.agreement.model.Person;

import javax.naming.CompositeName;
import javax.naming.Name;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.ModificationItem;
import javax.naming.ldap.LdapName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class LdapService {

    @Autowired
    private LdapTemplate ldapTemplate;

    static List<Forms> all = new ArrayList<>(11);

    public List<Forms> getAllForms(){


        try{
           Iterable<Forms> itr= ldapTemplate.findAll(Forms.class);
           for(Forms f: itr){
               all.add(f);
           }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return all;
    }

    public String saveToDir(Person p )  {
        Attribute Ab = new BasicAttribute("JnetDigitalSignature","formVersion");
        //new BasicAttribute("JnetDigitalSignature","Form="+u1.getFormName()+";Version="+u1.getFormVersion()+";Type=DigitalAgreement;SignedDate="+u1.getTimeOfSignature());
        ModificationItem item = new ModificationItem(DirContext.ADD_ATTRIBUTE, Ab);
        ldapTemplate.modifyAttributes(buildDn(p),new ModificationItem[] { item});


         return "success";
    }
    public  Name buildDn( Person p){
        return LdapNameBuilder.newInstance("ou=Active,ou=People,o=jnet").add("cn",p.getUserID()).build();
    }


    public Forms getFormByName(String name){
        AndFilter andFilter =new AndFilter( );
        andFilter.and(new EqualsFilter("objectClass","jnetAgreementForm"));
        andFilter.and(new EqualsFilter("jnetAgreementFormName", name));
       return ldapTemplate.findOne(LdapQueryBuilder.query().countLimit(1).base("ou=Forms,ou=DigitalAgreements,o=jnet").searchScope(SearchScope.SUBTREE).filter(andFilter),Forms.class);
    }
}



