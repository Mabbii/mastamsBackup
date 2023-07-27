package view;


import java.io.IOException;

//import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import oracle.adf.controller.ControllerContext;
import oracle.adf.controller.v2.lifecycle.Lifecycle;
import oracle.adf.controller.v2.lifecycle.PagePhaseEvent;
import oracle.adf.controller.v2.lifecycle.PagePhaseListener;
//import oracle.adf.model.BindingContext;
//import oracle.adf.model.OperationBinding;
//import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.context.AdfFacesContext;



public class PageLoadBean implements PagePhaseListener {
    public PageLoadBean() {
        super();
    }

    @Override
    public void afterPhase(PagePhaseEvent pagePhaseEvent) {
    if (pagePhaseEvent.getPhaseId() == Lifecycle.PREPARE_RENDER_ID) {
    // onPagePreRender();
    }
    }

    @Override
    public void beforePhase(PagePhaseEvent pagePhaseEvent) {
    if (pagePhaseEvent.getPhaseId() == Lifecycle.PREPARE_MODEL_ID) {
    onPageLoad();
    }
    }


    public void onPageLoad() {
    if (!AdfFacesContext.getCurrentInstance().isPostback()) {
    // add your onPageLoad event here
     
    // to set the View Criteria on the Iterator
    System.out.println("Called On Page Load");  ///your custom method.
        }
    }
    
    
    
    public String Redirect (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/AccountsMyy.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
  
           return null;
    }
    public String RedirecttoHome (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/HomeView.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    
    public String Redirecttomanagment (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/Managementmy.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    
    public String RedirecttoRetailMy (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/RetailMy.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
   
    
    
    public String RedirecttoDataLoader (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/DataLoaderr.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoSupplyMy (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/SupplyMy.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoRatesMy (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/RatesMy.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoAccountsOpening (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/AccountOpeningView.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoReports (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/ReportsView.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoOpeningandFinance (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/OpeningandFinance.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoStockTransfer (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/StockView.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoDayBook (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/DayBookView.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoFinancialStatement(){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/FinancialStatementsview.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoInitilizeDate (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/InitializeDateview.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoBill (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/BILL.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoLog (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/LogingTree.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoBilli (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/Bill_DetailData_View.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoBillVehicle (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/Bill_Vehicle_View.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoBillGroup (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/Bill_Group_View.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
    public String RedirecttoRetail_Lube (){
        
        FacesContext ctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = ctx.getExternalContext();
        
        String viewId = "/Retail_Lube.jsf";
        ControllerContext ControllerCtx = ControllerContext.getInstance();
        
        String activityURL = ControllerCtx.getGlobalViewActivityURL(viewId);
        
        try{
            ectx.redirect(activityURL);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    
           return null;
    }
}

































            /*HttpServletRequest httpRequest = (HttpServletRequest) ectx.getRequest();
        HttpServletResponse httpResponse = (HttpServletResponse) ectx.getResponse(); 
    
        String logoutUrl = "/adfAuthentication?success_url=/faces/AccountsMyy.jsf";
        sendForward(httpRequest,httpResponse,logoutUrl);*/
   /* public void sendForward(HttpServletRequest request, HttpServletResponse response, String forwardUrl) {
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
    
 
}
*/