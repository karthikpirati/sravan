package com.digital.agreements.repository;

import org.springframework.data.ldap.repository.LdapRepository;

import com.digital.agreements.entity.LDAPEntity;

public interface AgreementResository extends LdapRepository<LDAPEntity>{

}
