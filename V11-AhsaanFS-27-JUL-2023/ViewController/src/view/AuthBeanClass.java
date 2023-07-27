package view;

import java.io.IOException;

import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;


import model.VOAPPImpl;

import model.common.VOAPP;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.share.ADFContext;
import oracle.adf.share.security.SecurityContext;

import oracle.adf.view.rich.render.ClientEvent;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

import weblogic.security.SimpleCallbackHandler;
import weblogic.security.URLCallbackHandler;
import weblogic.security.services.Authentication;

import weblogic.servlet.security.ServletAuthentication;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.binding.BindingContainer;
import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import oracle.binding.OperationBinding;

public class AuthBeanClass {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public BindingContainer getBindings(){
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    // ******************************************************   checkUserAttempts   ************************************
    @SuppressWarnings({ "unchecked", "oracle.jdeveloper.java.unchecked-conversion-or-cast" })
    public int checkUserAttempts(String username){
            int Attempts=0;
            
            

        OperationBinding operationBinding=getBindings().getOperationBinding("execPLSQLCheckLoginAttempts");
         //optional
         operationBinding.getParamsMap().put("aStringParam",username);
        
         //invoke method
         operationBinding.execute();
         if (!operationBinding.getErrors().isEmpty()) {
            //check errors
            List errors = operationBinding.getErrors();
             System.out.println("ERROR IN checkUserAttempts" );  
         }else{
            Object methodReturnValue;
            methodReturnValue = operationBinding.getResult();
            Attempts=(Integer) methodReturnValue;
             System.out.println("SUCCESS IN checkUserAttempts" ); 
         }
      
        //operationBinding.release();
            
    
        return Attempts;
    }
    // ******************************************************   execBMInsertUserLOG   ************************************
    @SuppressWarnings({ "unchecked", "oracle.jdeveloper.java.unchecked-conversion-or-cast" })
    public void execBMInsertUserLOG(String SessionID,String Username,int AuthF,int pAuthReason){
        int Attempts=0;
       
        OperationBinding operationBinding=getBindings().getOperationBinding("execINSERTUSERLOG");
         //optional
         operationBinding.getParamsMap().put("pSessionId",SessionID);
        operationBinding.getParamsMap().put("pUserName",Username);
        operationBinding.getParamsMap().put("pAuthF",AuthF);
        operationBinding.getParamsMap().put("pAuthReason",pAuthReason);
         //invoke method
         operationBinding.execute();
         if (!operationBinding.getErrors().isEmpty()) {
            //check errors
            List errors = operationBinding.getErrors();
             System.out.println("ERROR IN execBMInsertUserLOG" );  
             System.out.println(errors); 
         }
       
       
        
      
    }
    // ******************************************************   execBMUpdateUserLOG   ************************************
    @SuppressWarnings({ "unchecked", "oracle.jdeveloper.java.unchecked-conversion-or-cast" })
    public int execBMUpdateUserLOG(String SessionID,String Username,int pOutReason){
        int retFlag=0;
       
         OperationBinding operationBinding=getBindings().getOperationBinding("execUpdateUserLOG");
 
        //optional
        operationBinding.getParamsMap().put("pSessionId",SessionID);
        operationBinding.getParamsMap().put("pUserName",Username);
        operationBinding.getParamsMap().put("pOutReason",pOutReason);
        
        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
           //check errors
            List errors = operationBinding.getErrors();
            System.out.println("ERROR IN execBMUpdateUserLOG" );   
            System.out.println(errors );
        }else{
            System.out.println("IN execBMUpdateUserLOG Else Part " );   
            retFlag=1;
        }
        
        System.out.println("in execBMUpdateUserLOG method" );   
    return retFlag;
    }
    
// ******************************************************   DO AUTH   ************************************
    public String doAuth( ) {
        CheckSession();
        System.out.println("Back in Auth");
        String un = username;
        
        byte[] pw = password.getBytes();
        
        int Attempts=this.checkUserAttempts(this.getUsername());
        
        int AuthF=0;
        FacesContext ctx = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) ctx.getExternalContext().getRequest();
        
        System.out.println("Attempts =" + Attempts );
        if (Attempts == 1){
          
        
        
        
        
        try {
            
        Subject mySubject = Authentication.login(new URLCallbackHandler(un, pw));
        
        ServletAuthentication.runAs(mySubject, request);
        ServletAuthentication.generateNewSessionID(request);
        System.out.println(" Here :"+ctx.getViewRoot().getViewId());
        String loginUrl = "/adfAuthentication?success_url=/faces/HomeView.jsf";
        HttpServletResponse response = (HttpServletResponse) ctx.getExternalContext().getResponse();
        HttpSession session = (HttpSession) ctx.getExternalContext().getSession(false);
        String  sessionId = session.getId();
        System.out.println("SESSION ID in login Success  OF LOGIN USER =" + sessionId );
        AuthF=1;
        session.setAttribute("loginUser",un );
        session.setAttribute("loginSessionID",sessionId );
        this.execBMInsertUserLOG( sessionId, un, AuthF,0); // 0 Succes in auth
        sendForward(request, response, loginUrl);
        } catch (FailedLoginException e) {
        AuthF=0;
        HttpSession session = (HttpSession) ctx.getExternalContext().getSession(false);
        String  sessionId = session.getId();
        System.out.println("SESSION ID in login incorrect  OF LOGIN USER =" + sessionId );
        this.execBMInsertUserLOG( sessionId, un, AuthF,1); // 1 Failed in auth
        FacesMessage msg =
        new FacesMessage(FacesMessage.SEVERITY_ERROR, "Incorrect user name or password",
                         "Incorrect user name or password was specified");
        ctx.addMessage(null, msg);
        } catch (LoginException e) {
        AuthF=0;
        HttpSession session = (HttpSession) ctx.getExternalContext().getSession(false);
        String  sessionId = session.getId();
        System.out.println("SESSION ID in login exception  OF LOGIN USER =" + sessionId );
        this.execBMInsertUserLOG( sessionId, un, AuthF,1); // 1 Failed in auth
        e.printStackTrace();
        }
        }
        else{
        AuthF=0;
        HttpSession session = (HttpSession) ctx.getExternalContext().getSession(false);
        String  sessionId = session.getId();
        System.out.println("SESSION ID in login Attempts failure OF LOGIN USER =" + sessionId );
       this.execBMInsertUserLOG( sessionId, un, AuthF,2); // 1 auth attempts quta finished
       if (Attempts == 0){
        reportUnexpectedLoginError("User Attempts Quta finished",null );
       }else if (Attempts == 2){
            reportUnexpectedLoginError("Wrong User",null );
        }
            
            
            
        }
        return null;

    }
// ******************************************************   LOG OFF   ************************************    
    public String logoff() {
        int retFlag =1;
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        HttpServletRequest httpRequest = (HttpServletRequest) ectx.getRequest();
        HttpServletResponse httpResponse = (HttpServletResponse) ectx.getResponse();
    try {
        
       
       // HttpSession session2 = (HttpSession) ectx.getSession(false);
       // String sessionId = session2.getId();
       
        Map SessionScope = ADFContext.getCurrent().getSessionScope();
        String UserName=(String)SessionScope.get("loginUser");
        String sessionId=(String)SessionScope.get("loginSessionID");
        System.out.println("SESSION user OF LOGOUT USER =" + UserName );
       System.out.println("SESSION ID OF LOGOUT USER =" + sessionId );
        retFlag= this.execBMUpdateUserLOG(sessionId,UserName,1);
        //String UserName=(String)session2.getAttribute("userName");
      //  adf.context.securityContext.getUserName()
        ADFContext adfCtx = ADFContext.getCurrent();  
            SecurityContext secCntx = adfCtx.getSecurityContext();  
           // String user = secCntx.getUserPrincipal().getName();  
            String userName = secCntx.getUserName();
        System.out.println("from securitycontext Login User =" + userName );
    //retFlag= this.execBMUpdateUserLOG(sessionId,userName,1);
        if (retFlag==1){
        httpRequest.logout(); // Servlet 3.0 logout
        HttpSession session = httpRequest.getSession(false);
    if (session != null) {
        session.invalidate();
        System.out.println("session != null"  );
    }
    String logoutUrl ="/adfAuthentication?success_url=/faces" +
    ctx.getViewRoot().getViewId();
    sendForward(httpRequest,httpResponse,logoutUrl);
        }else{
                 System.out.println("Logout Un Successfull"  );
             }
         
    } catch (Exception e) {
        ADFContext adfCtx = ADFContext.getCurrent();  
            SecurityContext secCntx = adfCtx.getSecurityContext();  
           // String user = secCntx.getUserPrincipal().getName();  
            String userName = secCntx.getUserName();
        Map SessionScope = ADFContext.getCurrent().getSessionScope();
        String UserName=(String)SessionScope.get("loginUser");
        String sessionId=(String)SessionScope.get("loginSessionID");
        System.out.println("Logout with errors if (case) SESSION user OF LOGOUT USER =" + userName );
        System.out.println("Logout with errors if (case) SESSION ID OF LOGOUT USER =" + sessionId );
       this.execBMUpdateUserLOG(sessionId,userName,0);//Logout with errors reason  0
    reportUnexpectedLoginError("ServletException An error occurred during logout. Please consult logs for more information.", e);
    }
        
    return null;
    }
// ******************************************************   LOGGED OFF   ************************************    
    public String loggedoff() {
        int retflage=0;
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        HttpServletRequest httpRequest = (HttpServletRequest) ectx.getRequest();
        HttpServletResponse httpResponse = (HttpServletResponse) ectx.getResponse();    
       
        Map SessionScopeMap = ADFContext.getCurrent().getSessionScope();
        String UserName=(String)SessionScopeMap.get("loginUser");
        String sessionId=(String)SessionScopeMap.get("loginSessionID");
        System.out.println("SESSION user OF LOGOUT USER =" + UserName );
       System.out.println("SESSION ID OF LOGOUT USER =" + sessionId );
        
        retflage= execBMUpdateUserLOG(sessionId,UserName,1);
    try {
        httpRequest.logout(); // Servlet 3.0 logout 
        HttpSession session = httpRequest.getSession(false);
    if (session != null) {
         sessionId=(String)SessionScopeMap.get("loginSessionID"); 
        System.out.println("session != null Id =" + sessionId ); 
        session.invalidate();
    }
    String logoutUrl ="/adfAuthentication?success_url=/faces" +
    ctx.getViewRoot().getViewId();
    sendForward(httpRequest,httpResponse,logoutUrl);
    } catch (Exception e) {
        ADFContext adfCtx = ADFContext.getCurrent();
            SecurityContext secCntx = adfCtx.getSecurityContext();          
           // String user = secCntx.getUserPrincipal().getName();  
            String userName = secCntx.getUserName();
         UserName=(String)SessionScopeMap.get("loginUser");
         sessionId=(String)SessionScopeMap.get("loginSessionID");
        System.out.println("Logout with errors SESSION user OF LOGOUT USER =" + userName ); 
        System.out.println("Logout with errors SESSION ID OF LOGOUT USER =" + sessionId );
       execBMUpdateUserLOG(sessionId,userName,0);//Logout with errors reason  0
       
    reportUnexpectedLoginError("ServletException An error occurred during logout. Please consult logs for more information.", e);
    }
    return null;
    }
    
    public void sendForward(HttpServletRequest request, HttpServletResponse response, String forwardUrl) {
       System.out.println("Forwarding ..."+forwardUrl);
       FacesContext ctx = FacesContext.getCurrentInstance();
      
        RequestDispatcher dis = request.getRequestDispatcher(forwardUrl);
        try {
            dis.forward(request, response);
        } catch (IOException e) {
            reportUnexpectedLoginError("IOException Exception",e);
            e.printStackTrace();
        } catch (ServletException e) {
            reportUnexpectedLoginError("ServletException ",e);
            e.printStackTrace();
        }
        ctx.responseComplete();
    }

    public void reportUnexpectedLoginError(String errorType, Exception e) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Unexpected Error during login","Error type ="+errorType);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void CheckSession() {
        System.out.println("In CheckSession");
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        HttpServletRequest httpRequest = (HttpServletRequest) ectx.getRequest();
        HttpServletResponse httpResponse = (HttpServletResponse) ectx.getResponse(); 
        Map SessionScopeMap = ADFContext.getCurrent().getSessionScope();
        String sessionId=(String)SessionScopeMap.get("loginSessionID");
        System.out.println("Session id" + sessionId);
        
    }
}
