package view;

import java.util.List;

import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpServletRequest;

import model.common.VOAPP;

import oracle.adf.model.BindingContext;
import oracle.adf.model.DataControlFrame;
import oracle.adf.share.ADFContext;

import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import oracle.jbo.client.Configuration;

public class MainPageBeanClass {
   String Task;
   String UserName;
    public MainPageBeanClass() {
    }
    public BindingContainer getBindings(){
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    /*------------AccountsMy-------------*/
    public void CallAddParty(ActionEvent actionEvent) {
        System.out.println("Here i am");
        // Add event code here...
        this.CallBMTaskFlowActivity(1);       
    } 
    public void CallAddProduct(ActionEvent actionEvent) {
        // Add event code here...
        
        this.CallBMTaskFlowActivity(2);       
    }
    public void CallAddBank(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(3);       
    } 
    public void CallAddReferenceBank(ActionEvent actionEvent) {
        // Add event code here...
        
        this.CallBMTaskFlowActivity(4);       
    }
    public void AddExpense(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(5);       
    } 
    public void CallAccountRevenue(ActionEvent actionEvent) {
        // Add event code here...
        
        this.CallBMTaskFlowActivity(6);       
    }
    public void CallAccountCapital(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(7);       
    } 
    public void CallAccountReceviable(ActionEvent actionEvent) {
        // Add event code here...
       
        this.CallBMTaskFlowActivity(8);       
    }
    public void CallAccountPayable(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(9);       
    } 
         /*------------AccountsMy-------------*/
    /*------------AccountOpeningView-------------*/
    public void CallOpeningBalanceforAssets(ActionEvent actionEvent) {
        // Add event code here...
      
        this.CallBMTaskFlowActivity(10);       
    }   
    public void CallOpeningBalanceForProduct(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(11);       
    } 
    public void CallOpeneingBalanceForLiabilities(ActionEvent actionEvent) {
        // Add event code here...
        
        this.CallBMTaskFlowActivity(12);       
    }
    public void CallOpeningBalanceForOilTanker(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(13);       
    }
    /*------------AccountOpeningView-------------*/
       /*------------DayBookView-------------*/
    public void CallPurchaseSupplierFuel(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(14);       
    }
    public void CallJournalVoucher(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(15);       
    } 
    public void CallSales(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(16);       
    }
    public void CallPurchaseLube(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(17);       
    }
    public void CallPaymenting(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(540);       
    }
    public void CallReciepting(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(541);       
    }
    public void CallExpensive(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(542);       
    }
    
          /*------------DayBookView-------------*/
    /*------------FinancialStatementsView-------------*/
    public void CallISCalculate(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(18);       
    }
    public void CallISDetailedHistory(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(19);       
    }
    public void CallISAdjustment(ActionEvent actionEvent) {
        // Add event code here...   
        this.CallBMTaskFlowActivity(20);       
    }
    public void CallISwithDate(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(21);       
    }
    /*------------FinancialStatementsView-------------*/
       /*------------ManagementMyView-------------*/
    public void CallNozal(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(22);       
    }
    public void CallTanks(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(23);       
    }
    public void CallNozalTankMap(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(24);       
    }  
    public void CallNozalManage(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(25);       
    }
    public void CallOilTanker(ActionEvent actionEvent) {
        // Add event code here...
       // Long input =501;
       //rollback();
      this.CallBMTaskFlowActivity(501);
    }
    public void CallOilTanlerS(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(502);
    }
    public void CallOilDepo(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(503);  
    }
    public void CallVehicle(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(504);       
    }
    public void CallStartSystem(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(505);       
    } 
    /*------------ManagementMyView-------------*/
        /*------------RatesMy-------------*/
    public void CallNozalRetailRate(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(506);       
    }
    public void CallSaleRate(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(507);       
    } 
    public void CallPurchaseRateSupplier(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(508);       
    } 
      /*------------RatesMy-------------*/
    /*------------ReportsView-------------*/
    public void CallJournalLedger(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(509);       
    }
    public void CallStockLedger(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(510);       
    }
    public void CallTrialBalance(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(511);       
    }
    public void CallLedgerDetailed(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(512);       
    }
    public void CallStorageOilTanker(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(513);       
    } 
    public void CallBillStatement(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(536);       
    } 
    public void CallBillVehicle(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(537);       
    }
    public void CallBillCoaGroup(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(538);       
    }
    public void CallBillGroup(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(539);       
    }
    /*------------ReportsView-------------*/
     /*------------RetailMy-------------*/
    public void CallMeterReading(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(514);       
    }
    public void CallLubeSale(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(515);       
    }
    public void CallRetailSale(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(516);       
    }
    public void CallRetailReciept(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(517);       
    } 
    public void CallRetailExpense(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(518);       
    } 
    public void CallRetailPayment(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(519);       
    } 
    public void CallDips(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(520);       
    }
    public void CallSaleSummry(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(521);       
    }
    public void CallDaybookSummary(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(522);       
    }
    public void CallDataLoader(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(523);       
    }
     /*------------RetailMy-------------*/
    /*------------StockView-------------*/
    public void CallStockTransfer(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(524);       
    }
    public void CallSTOCKGAIN(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(525);       
    }
    public void CallSTOCKLOSS(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(526);       
    }
    public void CallSTOCKLOSSBACKDATE(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(527);       
    }
    
    /*------------StockView-------------*/
     /*------------SupplyMy-------------*/
    public void CallRecieptCustomer(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(529);
    }
    public void CallPaymentSupplier(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(530); 
    }
    public void CallPurchaseSupplierSupply(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(531);
    }
    public void CallSalesSupply(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(532);
    }
    public void CallExpenseSupply(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(533);
    }
    public void CallRecieptUnclaimedSupply(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(534);       
    }
    public void CallRecieptclaimedSupply(ActionEvent actionEvent) {
        // Add event code here...
        this.CallBMTaskFlowActivity(535);       
    }
    /*------------SupplyMy-------------*/
    /*------------HomeView-------------*/
    
    public void rollback() {
       BindingContext bc = BindingContext.getCurrent();
       String dcfName = bc.getCurrentDataControlFrame();
       DataControlFrame dcf = bc.findDataControlFrame(dcfName);
           System.out.println("In rollback ");
          dcf.rollback();
       
    }
    
    
    
    
    
    
    
    
    
    @SuppressWarnings({ "unchecked", "oracle.jdeveloper.java.unchecked-conversion-or-cast" })
    public void CallBMTaskFlowActivity(int bmTask) {
        // Add event code here...
        
        
        Map SessionScope = ADFContext.getCurrent().getSessionScope();
        String UserName=(String)SessionScope.get("loginUser");
        String sessionId=(String)SessionScope.get("loginSessionID");
        System.out.println("SESSION user OF LOGged USER =" + UserName );
        System.out.println("SESSION ID OF LOGged USER =" + sessionId );
        System.out.println("Calling AM Method");
        OperationBinding operationBinding=getBindings().getOperationBinding("CallAMTaskFlowActivity");
         //optional
         operationBinding.getParamsMap().put("Task",bmTask);
        operationBinding.getParamsMap().put("userName",UserName);
        operationBinding.getParamsMap().put("sessionID",sessionId);
        System.out.println("Before Invoking Method");

         //invoke method
         operationBinding.execute();
        System.out.println("Before If");
         if (!operationBinding.getErrors().isEmpty()) {
            //check errors
            System.out.println("inside if");
            List errors = operationBinding.getErrors();
             System.out.println("ERROR IN execBMInsertUserLOG" );  
             System.out.println(errors); 
         }
        
              
           
    }

    public void setTask(String Task) {
        this.Task = Task;
    }

    public String getTask() {
        return Task;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return UserName;
    }
}
