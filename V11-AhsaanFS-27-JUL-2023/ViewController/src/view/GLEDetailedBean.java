package view;

import java.sql.Timestamp;

import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;

public class GLEDetailedBean {
    private RichInputDate endDatetb;
    private RichInputDate startDatetb;
    private RichInputText coanametb;
    private RichInputText coanameJL;
    private RichInputDate startDateJL;
    private RichInputDate endDateJL;

    public GLEDetailedBean() {
    }

    public String convertData() {
       
        coanameJL.setValue(coanametb.getValue().toString());
        
        Timestamp myDate = (Timestamp) this.getEndDatetb().getValue();
        
        
        endDateJL.setValue((Timestamp)myDate);
        
         myDate = (Timestamp) this.getStartDatetb().getValue();
        
        
        startDateJL.setValue((Timestamp)myDate);
        
        
        //Date myDate = (Date)getDocDate().getValue();
        
        AdfFacesContext AdfFacesContext2=AdfFacesContext.getCurrentInstance();
        AdfFacesContext2.addPartialTarget(coanameJL);
        
        AdfFacesContext AdfFacesContext1=AdfFacesContext.getCurrentInstance();
        AdfFacesContext1.addPartialTarget(startDateJL);
        
        AdfFacesContext AdfFacesContext3=AdfFacesContext.getCurrentInstance();
        AdfFacesContext3.addPartialTarget(endDateJL);
       
       
        return null;
    }

    public void setEndDatetb(RichInputDate endDatetb) {
        this.endDatetb = endDatetb;
    }

    public RichInputDate getEndDatetb() {
        return endDatetb;
    }

    public void setStartDatetb(RichInputDate startDatetb) {
        this.startDatetb = startDatetb;
    }

    public RichInputDate getStartDatetb() {
        return startDatetb;
    }

    public void setCoanametb(RichInputText coanametb) {
        this.coanametb = coanametb;
    }

    public RichInputText getCoanametb() {
        return coanametb;
    }

    public void setCoanameJL(RichInputText coanameJL) {
        this.coanameJL = coanameJL;
    }

    public RichInputText getCoanameJL() {
        return coanameJL;
    }

    public void setStartDateJL(RichInputDate startDateJL) {
        this.startDateJL = startDateJL;
    }

    public RichInputDate getStartDateJL() {
        return startDateJL;
    }

    public void setEndDateJL(RichInputDate endDateJL) {
        this.endDateJL = endDateJL;
    }

    public RichInputDate getEndDateJL() {
        return endDateJL;
    }
}
