package model;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.ApplicationModule;
import oracle.jbo.RowSet;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Nov 05 22:56:34 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class expenseTNSRowImpl extends ViewRowImpl {
    public static final int ENTITY_TRANSACTION = 0;
    public static final int ENTITY_CHARTOFACCOUNTS = 1;
    public static final int ENTITY_CHARTOFACCOUNTS1 = 2;
    public static final int ENTITY_BANKTNSTYPE = 3;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TnsDate,
        TnsId,
        TnsDetail,
        TnsAmount,
        TnsCoaDactNumber,
        TnsCoaCactNumber,
        TnsInfo,
        TnsTnsTypeIdFk,
        TnsTnsviewId,
        TnsBankTnsTypeIdFk,
        TnsSlipDate,
        TnsSlipNo,
        CoaName,
        CoaActNumber,
        CoaCode,
        CoaBalance,
        CoaName1,
        CoaActNumber1,
        CoaCode1,
        CoaBalance1,
        BankTnsTypeName,
        BankTnsTypeId,
        TnsSpellAmount,
        TnsFormatAmount,
        TnsSDate,
        CoaExpense1,
        COABankAndCash1,
        BankTnsTypeView1;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int TNSDATE = AttributesEnum.TnsDate.index();
    public static final int TNSID = AttributesEnum.TnsId.index();
    public static final int TNSDETAIL = AttributesEnum.TnsDetail.index();
    public static final int TNSAMOUNT = AttributesEnum.TnsAmount.index();
    public static final int TNSCOADACTNUMBER = AttributesEnum.TnsCoaDactNumber.index();
    public static final int TNSCOACACTNUMBER = AttributesEnum.TnsCoaCactNumber.index();
    public static final int TNSINFO = AttributesEnum.TnsInfo.index();
    public static final int TNSTNSTYPEIDFK = AttributesEnum.TnsTnsTypeIdFk.index();
    public static final int TNSTNSVIEWID = AttributesEnum.TnsTnsviewId.index();
    public static final int TNSBANKTNSTYPEIDFK = AttributesEnum.TnsBankTnsTypeIdFk.index();
    public static final int TNSSLIPDATE = AttributesEnum.TnsSlipDate.index();
    public static final int TNSSLIPNO = AttributesEnum.TnsSlipNo.index();
    public static final int COANAME = AttributesEnum.CoaName.index();
    public static final int COAACTNUMBER = AttributesEnum.CoaActNumber.index();
    public static final int COACODE = AttributesEnum.CoaCode.index();
    public static final int COABALANCE = AttributesEnum.CoaBalance.index();
    public static final int COANAME1 = AttributesEnum.CoaName1.index();
    public static final int COAACTNUMBER1 = AttributesEnum.CoaActNumber1.index();
    public static final int COACODE1 = AttributesEnum.CoaCode1.index();
    public static final int COABALANCE1 = AttributesEnum.CoaBalance1.index();
    public static final int BANKTNSTYPENAME = AttributesEnum.BankTnsTypeName.index();
    public static final int BANKTNSTYPEID = AttributesEnum.BankTnsTypeId.index();
    public static final int TNSSPELLAMOUNT = AttributesEnum.TnsSpellAmount.index();
    public static final int TNSFORMATAMOUNT = AttributesEnum.TnsFormatAmount.index();
    public static final int TNSSDATE = AttributesEnum.TnsSDate.index();
    public static final int COAEXPENSE1 = AttributesEnum.CoaExpense1.index();
    public static final int COABANKANDCASH1 = AttributesEnum.COABankAndCash1.index();
    public static final int BANKTNSTYPEVIEW1 = AttributesEnum.BankTnsTypeView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public expenseTNSRowImpl() {
    }

    /**
     * Gets Transaction entity object.
     * @return the Transaction
     */
    public TransactionImpl getTransaction() {
        return (TransactionImpl) getEntity(ENTITY_TRANSACTION);
    }

    /**
     * Gets ChartOfAccounts entity object.
     * @return the ChartOfAccounts
     */
    public EntityImpl getChartOfAccounts() {
        return (EntityImpl) getEntity(ENTITY_CHARTOFACCOUNTS);
    }

    /**
     * Gets ChartOfAccounts1 entity object.
     * @return the ChartOfAccounts1
     */
    public EntityImpl getChartOfAccounts1() {
        return (EntityImpl) getEntity(ENTITY_CHARTOFACCOUNTS1);
    }

    /**
     * Gets BankTnsType entity object.
     * @return the BankTnsType
     */
    public EntityImpl getBankTnsType() {
        return (EntityImpl) getEntity(ENTITY_BANKTNSTYPE);
    }

    /**
     * Gets the attribute value for TNS_DATE using the alias name TnsDate.
     * @return the TNS_DATE
     */
    public Timestamp getTnsDate() {
        return (Timestamp) getAttributeInternal(TNSDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_DATE using the alias name TnsDate.
     * @param value value to set the TNS_DATE
     */
    public void setTnsDate(Timestamp value) {
        setAttributeInternal(TNSDATE, value);
    }

    /**
     * Gets the attribute value for TNS_ID using the alias name TnsId.
     * @return the TNS_ID
     */
    public DBSequence getTnsId() {
        return (DBSequence) getAttributeInternal(TNSID);
    }


    /**
     * Sets <code>value</code> as attribute value for TNS_ID using the alias name TnsId.
     * @param value value to set the TNS_ID
     */
    public void setTnsId(DBSequence value) {
        setAttributeInternal(TNSID, value);
    }

    /**
     * Gets the attribute value for TNS_DETAIL using the alias name TnsDetail.
     * @return the TNS_DETAIL
     */
    public String getTnsDetail() {
        return (String) getAttributeInternal(TNSDETAIL);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_DETAIL using the alias name TnsDetail.
     * @param value value to set the TNS_DETAIL
     */
    public void setTnsDetail(String value) {
        setAttributeInternal(TNSDETAIL, value);
    }

    /**
     * Gets the attribute value for TNS_AMOUNT using the alias name TnsAmount.
     * @return the TNS_AMOUNT
     */
    public BigDecimal getTnsAmount() {
        return (BigDecimal) getAttributeInternal(TNSAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_AMOUNT using the alias name TnsAmount.
     * @param value value to set the TNS_AMOUNT
     */
    public void setTnsAmount(BigDecimal value) {
        setTnsFormatAmount( value);
           
           setAttributeInternal(TNSAMOUNT, value);
           String str=this.SpellAmount();
           this.setTnsSpellAmount(str);
        }

    /**
     * Gets the attribute value for TNS_COA_DACT_NUMBER using the alias name TnsCoaDactNumber.
     * @return the TNS_COA_DACT_NUMBER
     */
    public Long getTnsCoaDactNumber() {
        return (Long) getAttributeInternal(TNSCOADACTNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_COA_DACT_NUMBER using the alias name TnsCoaDactNumber.
     * @param value value to set the TNS_COA_DACT_NUMBER
     */
    public void setTnsCoaDactNumber(Long value) {
        setAttributeInternal(TNSCOADACTNUMBER, value);
    }

    /**
     * Gets the attribute value for TNS_COA_CACT_NUMBER using the alias name TnsCoaCactNumber.
     * @return the TNS_COA_CACT_NUMBER
     */
    public Long getTnsCoaCactNumber() {
        return (Long) getAttributeInternal(TNSCOACACTNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_COA_CACT_NUMBER using the alias name TnsCoaCactNumber.
     * @param value value to set the TNS_COA_CACT_NUMBER
     */
    public void setTnsCoaCactNumber(Long value) {
        setAttributeInternal(TNSCOACACTNUMBER, value);
    }

    /**
     * Gets the attribute value for TNS_INFO using the alias name TnsInfo.
     * @return the TNS_INFO
     */
    public String getTnsInfo() {
        return (String) getAttributeInternal(TNSINFO);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_INFO using the alias name TnsInfo.
     * @param value value to set the TNS_INFO
     */
    public void setTnsInfo(String value) {
        setAttributeInternal(TNSINFO, value);
    }

    /**
     * Gets the attribute value for TNS_TNS_TYPE_ID_FK using the alias name TnsTnsTypeIdFk.
     * @return the TNS_TNS_TYPE_ID_FK
     */
    public Long getTnsTnsTypeIdFk() {
        return (Long) getAttributeInternal(TNSTNSTYPEIDFK);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_TNS_TYPE_ID_FK using the alias name TnsTnsTypeIdFk.
     * @param value value to set the TNS_TNS_TYPE_ID_FK
     */
    public void setTnsTnsTypeIdFk(Long value) {
        setAttributeInternal(TNSTNSTYPEIDFK, value);
    }

    /**
     * Gets the attribute value for TNS_TNSVIEW_ID using the alias name TnsTnsviewId.
     * @return the TNS_TNSVIEW_ID
     */
    public Long getTnsTnsviewId() {
        return (Long) getAttributeInternal(TNSTNSVIEWID);
    }

    /**
     * Gets the attribute value for TNS_BANK_TNS_TYPE_ID_FK using the alias name TnsBankTnsTypeIdFk.
     * @return the TNS_BANK_TNS_TYPE_ID_FK
     */
    public Long getTnsBankTnsTypeIdFk() {
        return (Long) getAttributeInternal(TNSBANKTNSTYPEIDFK);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_BANK_TNS_TYPE_ID_FK using the alias name TnsBankTnsTypeIdFk.
     * @param value value to set the TNS_BANK_TNS_TYPE_ID_FK
     */
    public void setTnsBankTnsTypeIdFk(Long value) {
        setAttributeInternal(TNSBANKTNSTYPEIDFK, value);
    }

    /**
     * Gets the attribute value for TNS_SLIP_DATE using the alias name TnsSlipDate.
     * @return the TNS_SLIP_DATE
     */
    public Timestamp getTnsSlipDate() {
        return (Timestamp) getAttributeInternal(TNSSLIPDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_SLIP_DATE using the alias name TnsSlipDate.
     * @param value value to set the TNS_SLIP_DATE
     */
    public void setTnsSlipDate(Timestamp value) {
        setAttributeInternal(TNSSLIPDATE, value);
    }

    /**
     * Gets the attribute value for TNS_SLIP_NO using the alias name TnsSlipNo.
     * @return the TNS_SLIP_NO
     */
    public String getTnsSlipNo() {
        return (String) getAttributeInternal(TNSSLIPNO);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_SLIP_NO using the alias name TnsSlipNo.
     * @param value value to set the TNS_SLIP_NO
     */
    public void setTnsSlipNo(String value) {
        setAttributeInternal(TNSSLIPNO, value);
    }

    /**
     * Gets the attribute value for COA_NAME using the alias name CoaName.
     * @return the COA_NAME
     */
    public String getCoaName() {
        return (String) getAttributeInternal(COANAME);
    }

    /**
     * Sets <code>value</code> as attribute value for COA_NAME using the alias name CoaName.
     * @param value value to set the COA_NAME
     */
    public void setCoaName(String value) {
        setAttributeInternal(COANAME, value);
    }

    /**
     * Gets the attribute value for COA_ACT_NUMBER using the alias name CoaActNumber.
     * @return the COA_ACT_NUMBER
     */
    public Long getCoaActNumber() {
        return (Long) getAttributeInternal(COAACTNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for COA_ACT_NUMBER using the alias name CoaActNumber.
     * @param value value to set the COA_ACT_NUMBER
     */
    public void setCoaActNumber(Long value) {
        setAttributeInternal(COAACTNUMBER, value);
    }

    /**
     * Gets the attribute value for COA_CODE using the alias name CoaCode.
     * @return the COA_CODE
     */
    public Long getCoaCode() {
        return (Long) getAttributeInternal(COACODE);
    }

    /**
     * Sets <code>value</code> as attribute value for COA_CODE using the alias name CoaCode.
     * @param value value to set the COA_CODE
     */
    public void setCoaCode(Long value) {
        setAttributeInternal(COACODE, value);
    }

    /**
     * Gets the attribute value for COA_BALANCE using the alias name CoaBalance.
     * @return the COA_BALANCE
     */
    public BigDecimal getCoaBalance() {
        return (BigDecimal) getAttributeInternal(COABALANCE);
    }

    /**
     * Gets the attribute value for COA_NAME using the alias name CoaName1.
     * @return the COA_NAME
     */
    public String getCoaName1() {
        return (String) getAttributeInternal(COANAME1);
    }

    /**
     * Sets <code>value</code> as attribute value for COA_NAME using the alias name CoaName1.
     * @param value value to set the COA_NAME
     */
    public void setCoaName1(String value) {
        setAttributeInternal(COANAME1, value);
    }

    /**
     * Gets the attribute value for COA_ACT_NUMBER using the alias name CoaActNumber1.
     * @return the COA_ACT_NUMBER
     */
    public Long getCoaActNumber1() {
        return (Long) getAttributeInternal(COAACTNUMBER1);
    }

    /**
     * Sets <code>value</code> as attribute value for COA_ACT_NUMBER using the alias name CoaActNumber1.
     * @param value value to set the COA_ACT_NUMBER
     */
    public void setCoaActNumber1(Long value) {
        setAttributeInternal(COAACTNUMBER1, value);
    }

    /**
     * Gets the attribute value for COA_CODE using the alias name CoaCode1.
     * @return the COA_CODE
     */
    public Long getCoaCode1() {
        return (Long) getAttributeInternal(COACODE1);
    }

    /**
     * Sets <code>value</code> as attribute value for COA_CODE using the alias name CoaCode1.
     * @param value value to set the COA_CODE
     */
    public void setCoaCode1(Long value) {
        setAttributeInternal(COACODE1, value);
    }

    /**
     * Gets the attribute value for COA_BALANCE using the alias name CoaBalance1.
     * @return the COA_BALANCE
     */
    public BigDecimal getCoaBalance1() {
        return (BigDecimal) getAttributeInternal(COABALANCE1);
    }

    /**
     * Gets the attribute value for BANK_TNS_TYPE_NAME using the alias name BankTnsTypeName.
     * @return the BANK_TNS_TYPE_NAME
     */
    public String getBankTnsTypeName() {
        return (String) getAttributeInternal(BANKTNSTYPENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for BANK_TNS_TYPE_NAME using the alias name BankTnsTypeName.
     * @param value value to set the BANK_TNS_TYPE_NAME
     */
    public void setBankTnsTypeName(String value) {
        
        setAttributeInternal(BANKTNSTYPENAME, value);
    }

    /**
     * Gets the attribute value for BANK_TNS_TYPE_ID using the alias name BankTnsTypeId.
     * @return the BANK_TNS_TYPE_ID
     */
    public DBSequence getBankTnsTypeId() {

        return (DBSequence) getAttributeInternal(BANKTNSTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for BANK_TNS_TYPE_ID using the alias name BankTnsTypeId.
     * @param value value to set the BANK_TNS_TYPE_ID
     */
    public void setBankTnsTypeId(DBSequence value) {
  
        setAttributeInternal(BANKTNSTYPEID, value);
    }

    /**
     * Gets the attribute value for TNS_SPELL_AMOUNT using the alias name TnsSpellAmount.
     * @return the TNS_SPELL_AMOUNT
     */
    public String getTnsSpellAmount() {
        return this.SpellAmount();
       // return (String) getAttributeInternal(TNSSPELLAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_SPELL_AMOUNT using the alias name TnsSpellAmount.
     * @param value value to set the TNS_SPELL_AMOUNT
     */
    public void setTnsSpellAmount(String value) {
        value=this.SpellAmount();
        
            setAttributeInternal(TNSSPELLAMOUNT, value);
        }

    /**
     * Gets the attribute value for TNS_FORMAT_AMOUNT using the alias name TnsFormatAmount.
     * @return the TNS_FORMAT_AMOUNT
     */
    public BigDecimal getTnsFormatAmount() {
        return (BigDecimal) getAttributeInternal(TNSAMOUNT);
       // return (BigDecimal) getAttributeInternal(TNSFORMATAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_FORMAT_AMOUNT using the alias name TnsFormatAmount.
     * @param value value to set the TNS_FORMAT_AMOUNT
     */
    public void setTnsFormatAmount(BigDecimal value) {
        value=this.getTnsAmount();
                
            setAttributeInternal(TNSFORMATAMOUNT, value);
            }

    /**
     * Gets the attribute value for TNS_S_DATE using the alias name TnsSDate.
     * @return the TNS_S_DATE
     */
    public Timestamp getTnsSDate() {
        return (Timestamp) getAttributeInternal(TNSSDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_S_DATE using the alias name TnsSDate.
     * @param value value to set the TNS_S_DATE
     */
    public void setTnsSDate(Timestamp value) {
        setAttributeInternal(TNSSDATE, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CoaExpense1.
     */
    public RowSet getCoaExpense1() {
        RowSet rs1 = (RowSet)getAttributeInternal(COAEXPENSE1);
          rs1.executeQuery();
          return rs1;
      //  return (RowSet) getAttributeInternal(COAEXPENSE1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> COABankAndCash1.
     */
    public RowSet getCOABankAndCash1() {
        RowSet rs1 = (RowSet)getAttributeInternal(COABANKANDCASH1);
          rs1.executeQuery();
          return rs1;
      //  return (RowSet) getAttributeInternal(COABANKANDCASH1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> BankTnsTypeView1.
     */
    public RowSet getBankTnsTypeView1() {
        RowSet rs1 = (RowSet)getAttributeInternal(BANKTNSTYPEVIEW1);
          rs1.executeQuery();
          return rs1;
     //   return (RowSet) getAttributeInternal(BANKTNSTYPEVIEW1);


    }
    
    public String SpellAmount() {
           String res = "ERROR"; 
           ApplicationModule applicationModule = getApplicationModule();
           
           if (applicationModule instanceof VOAPPImpl){  
                      VOAPPImpl am = (VOAPPImpl) applicationModule;  
                     res = am.get_Spell_number(this.getTnsAmount());
                         //pass values from current row to plsql func and get resut  
                  }  
           return res;
           //return (String) getAttributeInternal(TNSSPELLAMOUNT);
       }

    

    
    
}


