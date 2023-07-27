package view;



import java.util.Hashtable;

import java.util.Map;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.ModificationItem;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.share.ADFContext;

public class ChangeMe {
    private String ldapServer = "ldap://127.0.0.1:7001"; 
    private String ldapPassword = "welcome1"; 
    private String ldapDC = "Smart_Domain";
    public ChangeMe() {
        super();
    }

    @SuppressWarnings("unchecked")
    public String changePassword(String username, String oldPassword, String newPassword, String confirmNewPassword) 
    {
         Map SessionScope = ADFContext.getCurrent().getSessionScope();
         String UserName=(String)SessionScope.get("loginUser");
         
         if(UserName.equals(username)){
             if (oldPassword.equals(newPassword)) 
              { 
                  FacesMessage Message = new FacesMessage("new and old passwords match");
                      Message.setSeverity(FacesMessage.SEVERITY_ERROR);
                      FacesContext fc = FacesContext.getCurrentInstance();
                      fc.addMessage(null, Message);
                  return "Your new password must be different from your old password.";
              } 
             if (!newPassword.equals(confirmNewPassword)) 
              {
                  FacesMessage Message = new FacesMessage("new password and confirmed password don't match");
                      Message.setSeverity(FacesMessage.SEVERITY_ERROR);
                      FacesContext fc = FacesContext.getCurrentInstance();
                      fc.addMessage(null, Message);
                 return "Your new password must match your confirmed password.";
              } 
             if (!isAuthenticated(username, oldPassword)) 
              {
                  FacesMessage Message = new FacesMessage("old password was not authenticated");
                      Message.setSeverity(FacesMessage.SEVERITY_ERROR);
                      FacesContext fc = FacesContext.getCurrentInstance();
                      fc.addMessage(null, Message);
                 return "Your old password is incorrect."; 
              } 
             String ldapUri = ldapServer; 
             String admindn = "cn=Admin"; 
             String admincred = ldapPassword; 
             String usersContainer = "ou=people,ou=myrealm,dc=" + ldapDC; 
             Hashtable env = new Hashtable(); 
             //env.put(Context., arg1)
             env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory"); 
             env.put(Context.PROVIDER_URL, ldapUri);
             env.put(Context.SECURITY_PRINCIPAL, admindn); 
             env.put(Context.SECURITY_CREDENTIALS, admincred); 
             try 
              { 
                InitialDirContext initialContext = new InitialDirContext(env);
                DirContext ctx = initialContext; 
                ModificationItem[] mods = new ModificationItem[1];
                Attribute mod0 = new BasicAttribute("userpassword", newPassword);
                mods[0] = new ModificationItem(DirContext.REPLACE_ATTRIBUTE, mod0);
                ctx.modifyAttributes("uid=" + username + "," + usersContainer, mods);
                ctx.close();
                  System.out.println("new password = " +newPassword);
                  AlertMessage();
                return "Password Changed!";
                  
              } catch (NamingException e) 
              {
                System.out.println(e);
                 return "Woops! Something went wrong!"; 
              }
         }else{
                 FacesMessage Message = new FacesMessage("Error in Paswword Change: You are not allowed to change others password!");
                     Message.setSeverity(FacesMessage.SEVERITY_ERROR);
                     FacesContext fc = FacesContext.getCurrentInstance();
                     fc.addMessage(null, Message);
             return "Error in Paswword Change: You are not allowed to change others password!";
             }
    
     }

    @SuppressWarnings("unchecked")
    public boolean isAuthenticated(String username, String password) 
    { 
      Hashtable env = new Hashtable(); 
      env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
      env.put(Context.PROVIDER_URL, ldapServer); 
      env.put(Context.SECURITY_AUTHENTICATION, "simple");
      env.put(Context.SECURITY_PRINCIPAL, "uid=" + username + ",ou=people,ou=myrealm,dc=" + ldapDC);
      env.put(Context.SECURITY_CREDENTIALS, password);
     try
     {
      DirContext ctx = new InitialDirContext(env);
      String authorised = ctx.AUTHORITATIVE;
      ctx.close();
      return true;
     }catch(NamingException e)
     { 
      System.out.println(e); 
      return false;
     }
    }
    public void AlertMessage(){
    FacesMessage Message = new FacesMessage("Password changed successfully");
        Message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, Message);
    
    }
}
