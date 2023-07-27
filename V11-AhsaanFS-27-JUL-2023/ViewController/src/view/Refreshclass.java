package view;

import java.math.BigDecimal;
import java.math.*;
import javax.faces.application.FacesMessage;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.controller.ControllerContext;
import oracle.adf.controller.ViewPortContext;

import org.apache.myfaces.trinidad.event.ReturnEvent;

public class Refreshclass {
    public Refreshclass() {
    }
    private long Amount;
    private long Quantity;
    private long Rate;
    
    public void setAmount(long Amount){
        CalAmount();
        this.Amount = Amount;
    }
    public long getAmount(){
        return  Amount;
    }
    public void setQuantity(long Quantity){
        this.Quantity = Quantity;
    }
    public long getQuantity(){
        return  Amount;
    }
    public void setRate(long Rate){
        this.Rate = Rate;
    }
    public long getRate(){
        return  Rate;
    }
    public long CalAmount(){
        Amount = Quantity * Rate;
        return Amount;
    }
    public String RefreshAction(ActionEvent actionEvent) {
        ControllerContext controllerContext=ControllerContext.getInstance();
        ViewPortContext currentRootViewPort = controllerContext.getCurrentRootViewPort();
        boolean isDataDirty = currentRootViewPort.isDataDirty();
        if (true == isDataDirty) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("There is uncommittaed data on page"));
        }else{
            FacesContext fc = FacesContext.getCurrentInstance();
            String refreshpage = fc.getViewRoot().getViewId();
            ViewHandler ViewH = fc.getApplication().getViewHandler();
            UIViewRoot UIV = ViewH.createView(fc, refreshpage);
            UIV.setViewId(refreshpage);
            fc.setViewRoot(UIV);    
        }
        return null;
    }

    public void refreshaftercmit(ReturnEvent returnEvent) {
        FacesContext fc = FacesContext.getCurrentInstance();
        String refreshpage = fc.getViewRoot().getViewId();
        ViewHandler ViewH = fc.getApplication().getViewHandler();
        UIViewRoot UIV = ViewH.createView(fc, refreshpage);
        UIV.setViewId(refreshpage);
        fc.setViewRoot(UIV);
    }

    public void refresh(ReturnEvent returnEvent) {
        // Add event code here...
    }


    public void rfshaction(ActionEvent actionEvent) {
        ControllerContext controllerContext=ControllerContext.getInstance();
        ViewPortContext currentRootViewPort = controllerContext.getCurrentRootViewPort();
        boolean isDataDirty = currentRootViewPort.isDataDirty();
        if (true == isDataDirty) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("There is uncommittaed data on page"));
        }else{
            FacesContext fc = FacesContext.getCurrentInstance();
            String refreshpage = fc.getViewRoot().getViewId();
            ViewHandler ViewH = fc.getApplication().getViewHandler();
            UIViewRoot UIV = ViewH.createView(fc, refreshpage);
            UIV.setViewId(refreshpage);
            fc.setViewRoot(UIV);    
        }
            
    }


        public void refreshaftercmitt(ReturnEvent returnEvent) {
        FacesContext fc = FacesContext.getCurrentInstance();
        String refreshpage = fc.getViewRoot().getViewId();
        ViewHandler ViewH = fc.getApplication().getViewHandler();
        UIViewRoot UIV = ViewH.createView(fc, refreshpage);
        UIV.setViewId(refreshpage);
        fc.setViewRoot(UIV);
        }

        public void refreshh(ReturnEvent returnEvent) {
        // Add event code here...
        }
            }
