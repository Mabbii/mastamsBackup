package view;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;
import java.sql.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;

public class GLedgerBean {
   
    
   
    private RichInputText txtfrom;
    private RichInputText txtto;
    
    private RichInputDate endDateTB;
    private RichInputDate startDateTB;
    private RichInputDate startDateJL;
    private RichInputDate endDateJL;
    


    public GLedgerBean() {
        super();
    }

   
    public void copyValues(){
        
        
    }

    public String copyto() {
       
        txtto.setValue(txtfrom.getValue().toString());
      
        Timestamp myDate = (Timestamp) this.getEndDateTB().getValue();
      
        
        endDateJL.setValue((Timestamp)myDate);
        
         myDate = (Timestamp) this.getStartDateTB().getValue();
        
        
        startDateJL.setValue((Timestamp)myDate);
        
      
     //Date myDate = (Date)getDocDate().getValue();
        
        AdfFacesContext AdfFacesContext2=AdfFacesContext.getCurrentInstance();
        AdfFacesContext2.addPartialTarget(txtto);
        
        AdfFacesContext AdfFacesContext1=AdfFacesContext.getCurrentInstance();
        AdfFacesContext1.addPartialTarget(startDateJL);
        
        AdfFacesContext AdfFacesContext3=AdfFacesContext.getCurrentInstance();
        AdfFacesContext3.addPartialTarget(endDateJL);
        return null;
    }

    public void setTxtfrom(RichInputText txtfrom) {
        this.txtfrom = txtfrom;
    }

    public RichInputText getTxtfrom() {
        return txtfrom;
    }

    public void setTxtto(RichInputText txtto) {
        this.txtto = txtto;
    }

    public RichInputText getTxtto() {
        return txtto;
    }

  

    public void setEndDateTB(RichInputDate endDateTB) {
        this.endDateTB = endDateTB;
    }

    public RichInputDate getEndDateTB() {
        return endDateTB;
    }

    public void setStartDateTB(RichInputDate startDateTB) {
        this.startDateTB = startDateTB;
    }

    public RichInputDate getStartDateTB() {
        return startDateTB;
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
