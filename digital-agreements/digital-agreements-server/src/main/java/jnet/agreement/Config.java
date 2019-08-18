package jnet.agreement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;
@Configuration
@EnableLdapRepositories
public class Config {



        @Value("${ldap.urls}")
        private String urls;

        @Value("${ldap.username}")
        private String userDn;

        @Value("${ldap.password}")
        private String pass;

        @Bean
        public LdapContextSource ldapContextSource()
        {
            LdapContextSource lcs =new LdapContextSource();

            String [] url= urls.split(",");
            System.out.println("Setting connection ");
            /*lcs.setUrl("ldap://10.182.71.23:389");
            //lcs.setBase("o=jnet");
            lcs.setUserDn("cn=digitalagreement-app,ou=serviceaccounts,o=jnet");
            lcs.setPassword("jnet");*/

            lcs.setUrls(url);
            lcs.setUserDn(userDn);
            lcs.setPassword(pass);
            lcs.afterPropertiesSet();
            return lcs;

        }
        @Bean
        public LdapTemplate ldapTemplate(){
            return new LdapTemplate(ldapContextSource());
        }


}
