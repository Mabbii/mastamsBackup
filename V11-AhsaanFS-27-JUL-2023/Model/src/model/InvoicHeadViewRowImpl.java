package model;

import java.math.BigDecimal;

import java.math.MathContext;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.BFileDomain;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 26 01:33:58 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvoicHeadViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_INVOICHEAD = 0;
    public static final int ENTITY_LUBECUSTOMER = 1;
    public static final int ENTITY_LUBEVEHICLE = 2;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        InvoicHeadId,
        InvoicHeadDate,
        InvoicHeadTotal,
        InvoicHeadNetTotal,
        InvoicHeadReciept,
        InvoicHeadDiscount,
        InvoicHeadBalance,
        LcustomerIdFk,
        LvehicleIdFk,
        LcName,
        LcId,
        LvRegNo,
        LvId,
        LcCity,
        LcPhone,
        InvoicHeadMr,
        InvoicHeadDueDate,
        InvoicDetailView,
        LubeCustomerView1,
        LubeVehicleView1;
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


    public static final int INVOICHEADID = AttributesEnum.InvoicHeadId.index();
    public static final int INVOICHEADDATE = AttributesEnum.InvoicHeadDate.index();
    public static final int INVOICHEADTOTAL = AttributesEnum.InvoicHeadTotal.index();
    public static final int INVOICHEADNETTOTAL = AttributesEnum.InvoicHeadNetTotal.index();
    public static final int INVOICHEADRECIEPT = AttributesEnum.InvoicHeadReciept.index();
    public static final int INVOICHEADDISCOUNT = AttributesEnum.InvoicHeadDiscount.index();
    public static final int INVOICHEADBALANCE = AttributesEnum.InvoicHeadBalance.index();
    public static final int LCUSTOMERIDFK = AttributesEnum.LcustomerIdFk.index();
    public static final int LVEHICLEIDFK = AttributesEnum.LvehicleIdFk.index();
    public static final int LCNAME = AttributesEnum.LcName.index();
    public static final int LCID = AttributesEnum.LcId.index();
    public static final int LVREGNO = AttributesEnum.LvRegNo.index();
    public static final int LVID = AttributesEnum.LvId.index();
    public static final int LCCITY = AttributesEnum.LcCity.index();
    public static final int LCPHONE = AttributesEnum.LcPhone.index();
    public static final int INVOICHEADMR = AttributesEnum.InvoicHeadMr.index();
    public static final int INVOICHEADDUEDATE = AttributesEnum.InvoicHeadDueDate.index();
    public static final int INVOICDETAILVIEW = AttributesEnum.InvoicDetailView.index();
    public static final int LUBECUSTOMERVIEW1 = AttributesEnum.LubeCustomerView1.index();
    public static final int LUBEVEHICLEVIEW1 = AttributesEnum.LubeVehicleView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InvoicHeadViewRowImpl() {
    }

    /**
     * Gets InvoicHead entity object.
     * @return the InvoicHead
     */
    public EntityImpl getInvoicHead() {
        return (EntityImpl) getEntity(ENTITY_INVOICHEAD);
    }


    /**
     * Gets LubeCustomer entity object.
     * @return the LubeCustomer
     */
    public EntityImpl getLubeCustomer() {
        return (EntityImpl) getEntity(ENTITY_LUBECUSTOMER);
    }

    /**
     * Gets LubeVehicle entity object.
     * @return the LubeVehicle
     */
    public EntityImpl getLubeVehicle() {
        return (EntityImpl) getEntity(ENTITY_LUBEVEHICLE);
    }

    /**
     * Gets the attribute value for INVOIC_HEAD_ID using the alias name InvoicHeadId.
     * @return the INVOIC_HEAD_ID
     */
    public DBSequence getInvoicHeadId() {
        return (DBSequence) getAttributeInternal(INVOICHEADID);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOIC_HEAD_ID using the alias name InvoicHeadId.
     * @param value value to set the INVOIC_HEAD_ID
     */
    public void setInvoicHeadId(DBSequence value) {
        setAttributeInternal(INVOICHEADID, value);
    }

    /**
     * Gets the attribute value for INVOIC_HEAD_DATE using the alias name InvoicHeadDate.
     * @return the INVOIC_HEAD_DATE
     */
    public Timestamp getInvoicHeadDate() {
        return (Timestamp) getAttributeInternal(INVOICHEADDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOIC_HEAD_DATE using the alias name InvoicHeadDate.
     * @param value value to set the INVOIC_HEAD_DATE
     */
    public void setInvoicHeadDate(Timestamp value) {
        setAttributeInternal(INVOICHEADDATE, value);
    }

    /**
     * Gets the attribute value for INVOIC_HEAD_TOTAL using the alias name InvoicHeadTotal.
     * @return the INVOIC_HEAD_TOTAL
     */
    public BigDecimal getInvoicHeadTotal() {
        return (BigDecimal) getAttributeInternal(INVOICHEADTOTAL);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOIC_HEAD_TOTAL using the alias name InvoicHeadTotal.
     * @param value value to set the INVOIC_HEAD_TOTAL
     */
    public void setInvoicHeadTotal(BigDecimal value) {
        setAttributeInternal(INVOICHEADTOTAL, value);
    }


    /**
     * Gets the attribute value for INVOIC_HEAD_NET_TOTAL using the alias name InvoicHeadNetTotal.
     * @return the INVOIC_HEAD_NET_TOTAL
     */
    public BigDecimal getInvoicHeadNetTotal() {
        return (BigDecimal) getAttributeInternal(INVOICHEADNETTOTAL);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOIC_HEAD_NET_TOTAL using the alias name InvoicHeadNetTotal.
     * @param value value to set the INVOIC_HEAD_NET_TOTAL
     */
    public void setInvoicHeadNetTotal(BigDecimal value) {
        setAttributeInternal(INVOICHEADNETTOTAL, value);
        
        
        BigDecimal diff = new BigDecimal(0.0);

         
        
         diff = (BigDecimal)(value.subtract(this.getInvoicHeadDiscount()));
         
             
         setAttributeInternal(INVOICHEADNETTOTAL, diff);
         diff = (BigDecimal)diff.subtract(this.getInvoicHeadReciept());
         setAttributeInternal(INVOICHEADBALANCE, diff);
        
        
    }

    /**
     * Gets the attribute value for INVOIC_HEAD_RECIEPT using the alias name InvoicHeadReciept.
     * @return the INVOIC_HEAD_RECIEPT
     */
    public BigDecimal getInvoicHeadReciept() {
        return (BigDecimal) getAttributeInternal(INVOICHEADRECIEPT);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOIC_HEAD_RECIEPT using the alias name InvoicHeadReciept.
     * @param value value to set the INVOIC_HEAD_RECIEPT
     */
    public void setInvoicHeadReciept(BigDecimal value) {
        setAttributeInternal(INVOICHEADRECIEPT, value);
        
        BigDecimal diff = new BigDecimal(0.0);

         
        
         diff = (BigDecimal)(this.getInvoicHeadNetTotal().subtract(value));
         
             
    
         setAttributeInternal(INVOICHEADBALANCE, diff);
        
    }

    /**
     * Gets the attribute value for INVOIC_HEAD_DISCOUNT using the alias name InvoicHeadDiscount.
     * @return the INVOIC_HEAD_DISCOUNT
     */
    public BigDecimal getInvoicHeadDiscount() {
        return (BigDecimal) getAttributeInternal(INVOICHEADDISCOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOIC_HEAD_DISCOUNT using the alias name InvoicHeadDiscount.
     * @param value value to set the INVOIC_HEAD_DISCOUNT
     */
    public void setInvoicHeadDiscount(BigDecimal value) {
        setAttributeInternal(INVOICHEADDISCOUNT, value);
        
     
        
        
       BigDecimal diff = new BigDecimal(0.0);

        
     
        diff = (BigDecimal)(this.getInvoicHeadTotal().subtract(value));
        
            
        setAttributeInternal(INVOICHEADNETTOTAL, diff);
        diff = (BigDecimal)diff.subtract(this.getInvoicHeadReciept());
        setAttributeInternal(INVOICHEADBALANCE, diff);
    }

    /**
     * Gets the attribute value for INVOIC_HEAD_BALANCE using the alias name InvoicHeadBalance.
     * @return the INVOIC_HEAD_BALANCE
     */
    public BigDecimal getInvoicHeadBalance() {
        return (BigDecimal) getAttributeInternal(INVOICHEADBALANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOIC_HEAD_BALANCE using the alias name InvoicHeadBalance.
     * @param value value to set the INVOIC_HEAD_BALANCE
     */
    public void setInvoicHeadBalance(BigDecimal value) {
        setAttributeInternal(INVOICHEADBALANCE, value);
    }

    /**
     * Gets the attribute value for LCUSTOMER_ID_FK using the alias name LcustomerIdFk.
     * @return the LCUSTOMER_ID_FK
     */
    public Long getLcustomerIdFk() {
        return (Long) getAttributeInternal(LCUSTOMERIDFK);
    }

    /**
     * Sets <code>value</code> as attribute value for LCUSTOMER_ID_FK using the alias name LcustomerIdFk.
     * @param value value to set the LCUSTOMER_ID_FK
     */
    public void setLcustomerIdFk(Long value) {
        setAttributeInternal(LCUSTOMERIDFK, value);
    }

    /**
     * Gets the attribute value for LVEHICLE_ID_FK using the alias name LvehicleIdFk.
     * @return the LVEHICLE_ID_FK
     */
    public Long getLvehicleIdFk() {
        return (Long) getAttributeInternal(LVEHICLEIDFK);
    }

    /**
     * Sets <code>value</code> as attribute value for LVEHICLE_ID_FK using the alias name LvehicleIdFk.
     * @param value value to set the LVEHICLE_ID_FK
     */
    public void setLvehicleIdFk(Long value) {
        setAttributeInternal(LVEHICLEIDFK, value);
    }

    /**
     * Gets the attribute value for LC_NAME using the alias name LcName.
     * @return the LC_NAME
     */
    public String getLcName() {
        return (String) getAttributeInternal(LCNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for LC_NAME using the alias name LcName.
     * @param value value to set the LC_NAME
     */
    public void setLcName(String value) {
        setAttributeInternal(LCNAME, value);
    }

    /**
     * Gets the attribute value for LC_ID using the alias name LcId.
     * @return the LC_ID
     */
    public DBSequence getLcId() {
        return (DBSequence) getAttributeInternal(LCID);
    }

    /**
     * Sets <code>value</code> as attribute value for LC_ID using the alias name LcId.
     * @param value value to set the LC_ID
     */
    public void setLcId(DBSequence value) {
        setAttributeInternal(LCID, value);
    }

    /**
     * Gets the attribute value for LV_REG_NO using the alias name LvRegNo.
     * @return the LV_REG_NO
     */
    public String getLvRegNo() {
        return (String) getAttributeInternal(LVREGNO);
    }

    /**
     * Sets <code>value</code> as attribute value for LV_REG_NO using the alias name LvRegNo.
     * @param value value to set the LV_REG_NO
     */
    public void setLvRegNo(String value) {
        setAttributeInternal(LVREGNO, value);
    }

    /**
     * Gets the attribute value for LV_ID using the alias name LvId.
     * @return the LV_ID
     */
    public DBSequence getLvId() {
        return (DBSequence) getAttributeInternal(LVID);
    }

    /**
     * Sets <code>value</code> as attribute value for LV_ID using the alias name LvId.
     * @param value value to set the LV_ID
     */
    public void setLvId(DBSequence value) {
        setAttributeInternal(LVID, value);
    }

    /**
     * Gets the attribute value for LC_CITY using the alias name LcCity.
     * @return the LC_CITY
     */
    public String getLcCity() {
        return (String) getAttributeInternal(LCCITY);
    }

    /**
     * Sets <code>value</code> as attribute value for LC_CITY using the alias name LcCity.
     * @param value value to set the LC_CITY
     */
    public void setLcCity(String value) {
        setAttributeInternal(LCCITY, value);
    }

    /**
     * Gets the attribute value for LC_PHONE using the alias name LcPhone.
     * @return the LC_PHONE
     */
    public String getLcPhone() {
        return (String) getAttributeInternal(LCPHONE);
    }

    /**
     * Sets <code>value</code> as attribute value for LC_PHONE using the alias name LcPhone.
     * @param value value to set the LC_PHONE
     */
    public void setLcPhone(String value) {
        setAttributeInternal(LCPHONE, value);
    }

    /**
     * Gets the attribute value for INVOIC_HEAD_MR using the alias name InvoicHeadMr.
     * @return the INVOIC_HEAD_MR
     */
    public Long getInvoicHeadMr() {
        return (Long) getAttributeInternal(INVOICHEADMR);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOIC_HEAD_MR using the alias name InvoicHeadMr.
     * @param value value to set the INVOIC_HEAD_MR
     */
    public void setInvoicHeadMr(Long value) {
        setAttributeInternal(INVOICHEADMR, value);
    }

    /**
     * Gets the attribute value for INVOIC_HEAD_DUE_DATE using the alias name InvoicHeadDueDate.
     * @return the INVOIC_HEAD_DUE_DATE
     */
    public Timestamp getInvoicHeadDueDate() {
        return (Timestamp) getAttributeInternal(INVOICHEADDUEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOIC_HEAD_DUE_DATE using the alias name InvoicHeadDueDate.
     * @param value value to set the INVOIC_HEAD_DUE_DATE
     */
    public void setInvoicHeadDueDate(Timestamp value) {
        setAttributeInternal(INVOICHEADDUEDATE, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvoicDetailView.
     */
    public RowIterator getInvoicDetailView() {
        return (RowIterator) getAttributeInternal(INVOICDETAILVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LubeCustomerView1.
     */
    public RowSet getLubeCustomerView1() {
        return (RowSet) getAttributeInternal(LUBECUSTOMERVIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LubeVehicleView1.
     */
    public RowSet getLubeVehicleView1() {
        return (RowSet) getAttributeInternal(LUBEVEHICLEVIEW1);
    }


}

