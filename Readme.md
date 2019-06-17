# Spring Security

* Good Security must be layered:
* Hardware/Media (FileSystem) -> Network (SSL/TLS) -> OS (User level controls, security patches)
  -> Application Security (Here’s where Spring Security comes) 
* Spring Security provides Jakarta EE(J2EE) application security services
* authn (who => determination if a “principal” is who they say they are ) 
     - HTTP basic, digest, x509 and Form based authn
     - LDAP and AD
     - OpenID, Jasig CAS, JAAS
     - Kerberos and SAML
* authz(what - Access control)
  
 * Spring Security Projects:
    - spring-security-core
    - spring-security-config
    - spring-security-web
    - spring-security-test and other projects for specifics like oauth, CAS etc
# In memory authn
* just by adding spring-boot-starter-security, a form based security is enabled. User/<password hashin console log>
* Extend "WebSecurityConfigurerAdapter" and override configure() Method
  
