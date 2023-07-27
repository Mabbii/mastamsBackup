package view;

import java.awt.event.ActionEvent;

import java.util.Iterator;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import oracle.adf.share.ADFContext;

import oracle.adf.share.security.SecurityContext;

import oracle.security.idm.IMException;
import oracle.security.idm.IdentityStore;
import oracle.security.idm.PropertySet;
import oracle.security.idm.User;
import oracle.security.idm.UserProfile;
//import oracle.security.jps.JpsContextFactory;
import oracle.security.jps.JpsContext;
import oracle.security.jps.JpsContextFactory;
import oracle.security.jps.JpsException;
//import oracle.security.jps.internal.api.config.serializer.JpsContext;
import oracle.security.jps.service.idstore.IdentityStoreService;

public class OpssBean {
    private JpsContext jpsCtx = null;
    private IdentityStore idStore = null;
    private UserProfile userProfile = null;
    
    private String oldPassword = null;
    private String newPassword = null;
    
    private String username = "";
    public OpssBean() {
        ADFContext adfCtx = ADFContext.getCurrent();
                SecurityContext secCntx = adfCtx.getSecurityContext();

                this.username = secCntx.getUserName();

                try {
                    jpsCtx = JpsContextFactory.getContextFactory().getContext();
                    IdentityStoreService service =
                          jpsCtx.getServiceInstance(IdentityStoreService.class);
                    idStore = service.getIdmStore();

                    User user = idStore.searchUser(secCntx.getUserName());
                    if (user != null) {
                        userProfile = user.getUserProfile();
                        PropertySet propSet = userProfile.getAllUserProperties();
                        Iterator it = propSet.getAll();
                    }
                } catch (JpsException e) {
                    e.printStackTrace();
                } catch (IMException e) {
                    e.printStackTrace();
                }
            }
        public void changePassword(ActionEvent actionEvent) {
                // Add event code here...
                if ( oldPassword == null || oldPassword.equals("") ) {
                     FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                                              "Old password is empty", ""); 
                     FacesContext.getCurrentInstance().addMessage(null, msg);
                     return;
                }
                
                if ( newPassword == null || newPassword.equals("") ) {
                      FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                                              "New password is empty", ""); 
                      FacesContext.getCurrentInstance().addMessage(null, msg);
                      return;
                }
                
                if ( userProfile != null ) {
                
                   try {
                              char[] adEncodedPassword = oldPassword.toCharArray();
                              char[] adEncodedPassword2 = newPassword.toCharArray();
                             
                              userProfile.setPassword(adEncodedPassword, adEncodedPassword2);
                              FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                                                                  "Password has been changed", ""); 
                              FacesContext.getCurrentInstance().addMessage(null, msg);  
                    } catch (IMException e) {
                              e.printStackTrace();
                              FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                                                  e.getMessage(), ""); 
                              FacesContext.getCurrentInstance().addMessage(null, msg);  
                    }
                 } 
            }
    }
   
