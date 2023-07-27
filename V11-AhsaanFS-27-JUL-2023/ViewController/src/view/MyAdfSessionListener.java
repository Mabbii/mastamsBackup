package view;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import model.common.VOAPP;

import oracle.adf.share.ADFContext;
import oracle.adf.share.security.SecurityContext;

import oracle.jbo.client.Configuration;

public class MyAdfSessionListener implements HttpSessionListener {
    private static final Map<String, HttpSession> HTTP_SESSIONS = new HashMap<>();

    public MyAdfSessionListener() {
        super();
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession httpSession = httpSessionEvent.getSession();
        HTTP_SESSIONS.put(httpSession.getId(), httpSession);
        //Uncomment the line below for simple debug
        System.out.println("Session created:" + httpSession.getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
       
        HttpSession httpSession = httpSessionEvent.getSession();
        String UserName=(String)httpSession.getAttribute("userName");
        System.out.println("MyAdfSessionListener LOGOUT USER =" + UserName );
        
        System.out.println("Session destroyed:" + httpSession.getId());
        HTTP_SESSIONS.remove(httpSession);
        //Uncomment the line below for simple debug
        
      
    }
    
   
    public static Map<String, HttpSession> getHttpSessions() {
        return Collections.unmodifiableMap(HTTP_SESSIONS);
    }

    public static HttpSession findHttpSession(String sessionId) {
        return HTTP_SESSIONS.get(sessionId);
    }
}
