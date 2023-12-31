package model;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowSet;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jun 07 05:01:48 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DataLoaderRpayDrecViewRowImpl extends ViewRowImpl {
    public static final int ENTITY_DATALOADERRPAYDREC = 0;
    public static final int ENTITY_CHARTOFACCOUNTS = 1;
    public static final int ENTITY_CHARTOFACCOUNTS1 = 2;
    public static final int ENTITY_VEHICLE1 = 3;
    public static final int ENTITY_BANKTNSTYPE = 4;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        DlRpDrId,
        DlRpDrDate,
        DlRpDrPartyIdFk,
        DlRpDrBankIdFk,
        DlRpDrAmount,
        DlRpDrVehicleIdFk,
        DlRpDrInfo,
        DlRpDrSlipDate,
        DlRpDrSlipNo,
        CoaName,
        CoaActNumber,
        CoaName1,
        CoaActNumber1,
        VehicleRegNo,
        VehicleId,
        TnsBankTnsTypeIdFk,
        BankTnsTypeName,
        BankTnsTypeId,
        COA_PARTY_ACREC_ACPAY1,
        COABankAccount1,
        Vehicle1View1,
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


    public static final int DLRPDRID = AttributesEnum.DlRpDrId.index();
    public static final int DLRPDRDATE = AttributesEnum.DlRpDrDate.index();
    public static final int DLRPDRPARTYIDFK = AttributesEnum.DlRpDrPartyIdFk.index();
    public static final int DLRPDRBANKIDFK = AttributesEnum.DlRpDrBankIdFk.index();
    public static final int DLRPDRAMOUNT = AttributesEnum.DlRpDrAmount.index();
    public static final int DLRPDRVEHICLEIDFK = AttributesEnum.DlRpDrVehicleIdFk.index();
    public static final int DLRPDRINFO = AttributesEnum.DlRpDrInfo.index();
    public static final int DLRPDRSLIPDATE = AttributesEnum.DlRpDrSlipDate.index();
    public static final int DLRPDRSLIPNO = AttributesEnum.DlRpDrSlipNo.index();
    public static final int COANAME = AttributesEnum.CoaName.index();
    public static final int COAACTNUMBER = AttributesEnum.CoaActNumber.index();
    public static final int COANAME1 = AttributesEnum.CoaName1.index();
    public static final int COAACTNUMBER1 = AttributesEnum.CoaActNumber1.index();
    public static final int VEHICLEREGNO = AttributesEnum.VehicleRegNo.index();
    public static final int VEHICLEID = AttributesEnum.VehicleId.index();
    public static final int TNSBANKTNSTYPEIDFK = AttributesEnum.TnsBankTnsTypeIdFk.index();
    public static final int BANKTNSTYPENAME = AttributesEnum.BankTnsTypeName.index();
    public static final int BANKTNSTYPEID = AttributesEnum.BankTnsTypeId.index();
    public static final int COA_PARTY_ACREC_ACPAY1 = AttributesEnum.COA_PARTY_ACREC_ACPAY1.index();
    public static final int COABANKACCOUNT1 = AttributesEnum.COABankAccount1.index();
    public static final int VEHICLE1VIEW1 = AttributesEnum.Vehicle1View1.index();
    public static final int BANKTNSTYPEVIEW1 = AttributesEnum.BankTnsTypeView1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DataLoaderRpayDrecViewRowImpl() {
    }

    /**
     * Gets DataLoaderRpayDrec entity object.
     * @return the DataLoaderRpayDrec
     */
    public EntityImpl getDataLoaderRpayDrec() {
        return (EntityImpl) getEntity(ENTITY_DATALOADERRPAYDREC);
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
     * Gets Vehicle1 entity object.
     * @return the Vehicle1
     */
    public EntityImpl getVehicle1() {
        return (EntityImpl) getEntity(ENTITY_VEHICLE1);
    }

    /**
     * Gets BankTnsType entity object.
     * @return the BankTnsType
     */
    public EntityImpl getBankTnsType() {
        return (EntityImpl) getEntity(ENTITY_BANKTNSTYPE);
    }

    /**
     * Gets the attribute value for DL_RP_DR_ID using the alias name DlRpDrId.
     * @return the DL_RP_DR_ID
     */
    public DBSequence getDlRpDrId() {
        return (DBSequence) getAttributeInternal(DLRPDRID);
    }

    /**
     * Sets <code>value</code> as attribute value for DL_RP_DR_ID using the alias name DlRpDrId.
     * @param value value to set the DL_RP_DR_ID
     */
    public void setDlRpDrId(DBSequence value) {
        setAttributeInternal(DLRPDRID, value);
    }

    /**
     * Gets the attribute value for DL_RP_DR_DATE using the alias name DlRpDrDate.
     * @return the DL_RP_DR_DATE
     */
    public Timestamp getDlRpDrDate() {
        return (Timestamp) getAttributeInternal(DLRPDRDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for DL_RP_DR_DATE using the alias name DlRpDrDate.
     * @param value value to set the DL_RP_DR_DATE
     */
    public void setDlRpDrDate(Timestamp value) {
        setAttributeInternal(DLRPDRDATE, value);
        setAttributeInternal(DLRPDRSLIPDATE, value);
    }

    /**
     * Gets the attribute value for DL_RP_DR_PARTY_ID_FK using the alias name DlRpDrPartyIdFk.
     * @return the DL_RP_DR_PARTY_ID_FK
     */
    public Long getDlRpDrPartyIdFk() {
        return (Long) getAttributeInternal(DLRPDRPARTYIDFK);
    }

    /**
     * Sets <code>value</code> as attribute value for DL_RP_DR_PARTY_ID_FK using the alias name DlRpDrPartyIdFk.
     * @param value value to set the DL_RP_DR_PARTY_ID_FK
     */
    public void setDlRpDrPartyIdFk(Long value) {
        setAttributeInternal(DLRPDRPARTYIDFK, value);
    }

    /**
     * Gets the attribute value for DL_RP_DR_BANK_ID_FK using the alias name DlRpDrBankIdFk.
     * @return the DL_RP_DR_BANK_ID_FK
     */
    public Long getDlRpDrBankIdFk() {
        return (Long) getAttributeInternal(DLRPDRBANKIDFK);
    }

    /**
     * Sets <code>value</code> as attribute value for DL_RP_DR_BANK_ID_FK using the alias name DlRpDrBankIdFk.
     * @param value value to set the DL_RP_DR_BANK_ID_FK
     */
    public void setDlRpDrBankIdFk(Long value) {
        setAttributeInternal(DLRPDRBANKIDFK, value);
    }

    /**
     * Gets the attribute value for DL_RP_DR_AMOUNT using the alias name DlRpDrAmount.
     * @return the DL_RP_DR_AMOUNT
     */
    public BigDecimal getDlRpDrAmount() {
        return (BigDecimal) getAttributeInternal(DLRPDRAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for DL_RP_DR_AMOUNT using the alias name DlRpDrAmount.
     * @param value value to set the DL_RP_DR_AMOUNT
     */
    public void setDlRpDrAmount(BigDecimal value) {
        setAttributeInternal(DLRPDRAMOUNT, value);
    }

    /**
     * Gets the attribute value for DL_RP_DR_VEHICLE_ID_FK using the alias name DlRpDrVehicleIdFk.
     * @return the DL_RP_DR_VEHICLE_ID_FK
     */
    public Long getDlRpDrVehicleIdFk() {
        return (Long) getAttributeInternal(DLRPDRVEHICLEIDFK);
    }

    /**
     * Sets <code>value</code> as attribute value for DL_RP_DR_VEHICLE_ID_FK using the alias name DlRpDrVehicleIdFk.
     * @param value value to set the DL_RP_DR_VEHICLE_ID_FK
     */
    public void setDlRpDrVehicleIdFk(Long value) {
        setAttributeInternal(DLRPDRVEHICLEIDFK, value);
    }

    /**
     * Gets the attribute value for DL_RP_DR_INFO using the alias name DlRpDrInfo.
     * @return the DL_RP_DR_INFO
     */
    public String getDlRpDrInfo() {
        return (String) getAttributeInternal(DLRPDRINFO);
    }

    /**
     * Sets <code>value</code> as attribute value for DL_RP_DR_INFO using the alias name DlRpDrInfo.
     * @param value value to set the DL_RP_DR_INFO
     */
    public void setDlRpDrInfo(String value) {
        setAttributeInternal(DLRPDRINFO, value);
    }

    /**
     * Gets the attribute value for DL_RP_DR_SLIP_DATE using the alias name DlRpDrSlipDate.
     * @return the DL_RP_DR_SLIP_DATE
     */
    public Timestamp getDlRpDrSlipDate() {
        return (Timestamp) getAttributeInternal(DLRPDRSLIPDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for DL_RP_DR_SLIP_DATE using the alias name DlRpDrSlipDate.
     * @param value value to set the DL_RP_DR_SLIP_DATE
     */
    public void setDlRpDrSlipDate(Timestamp value) {
        setAttributeInternal(DLRPDRSLIPDATE, value);
    }

    /**
     * Gets the attribute value for DL_RP_DR_SLIP_NO using the alias name DlRpDrSlipNo.
     * @return the DL_RP_DR_SLIP_NO
     */
    public String getDlRpDrSlipNo() {
        return (String) getAttributeInternal(DLRPDRSLIPNO);
    }

    /**
     * Sets <code>value</code> as attribute value for DL_RP_DR_SLIP_NO using the alias name DlRpDrSlipNo.
     * @param value value to set the DL_RP_DR_SLIP_NO
     */
    public void setDlRpDrSlipNo(String value) {
        setAttributeInternal(DLRPDRSLIPNO, value);
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
     * Gets the attribute value for VEHICLE_REG_NO using the alias name VehicleRegNo.
     * @return the VEHICLE_REG_NO
     */
    public String getVehicleRegNo() {
        return (String) getAttributeInternal(VEHICLEREGNO);
    }

    /**
     * Sets <code>value</code> as attribute value for VEHICLE_REG_NO using the alias name VehicleRegNo.
     * @param value value to set the VEHICLE_REG_NO
     */
    public void setVehicleRegNo(String value) {
        setAttributeInternal(VEHICLEREGNO, value);
    }

    /**
     * Gets the attribute value for VEHICLE_ID using the alias name VehicleId.
     * @return the VEHICLE_ID
     */
    public DBSequence getVehicleId() {
        return (DBSequence) getAttributeInternal(VEHICLEID);
    }

    /**
     * Sets <code>value</code> as attribute value for VEHICLE_ID using the alias name VehicleId.
     * @param value value to set the VEHICLE_ID
     */
    public void setVehicleId(DBSequence value) {
        setAttributeInternal(VEHICLEID, value);
    }

    /**
     * Gets the attribute value for TNS_BANK_TNS_TYPE_ID_FK using the alias name TnsBankTnsTypeIdFk.
     * @return the TNS_BANK_TNS_TYPE_ID_FK
     */
    public BigDecimal getTnsBankTnsTypeIdFk() {
        return (BigDecimal) getAttributeInternal(TNSBANKTNSTYPEIDFK);
    }

    /**
     * Sets <code>value</code> as attribute value for TNS_BANK_TNS_TYPE_ID_FK using the alias name TnsBankTnsTypeIdFk.
     * @param value value to set the TNS_BANK_TNS_TYPE_ID_FK
     */
    public void setTnsBankTnsTypeIdFk(BigDecimal value) {
        setAttributeInternal(TNSBANKTNSTYPEIDFK, value);
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
     * Gets the view accessor <code>RowSet</code> COA_PARTY_ACREC_ACPAY1.
     */
    public RowSet getCOA_PARTY_ACREC_ACPAY1() {
        return (RowSet) getAttributeInternal(COA_PARTY_ACREC_ACPAY1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> COABankAccount1.
     */
    public RowSet getCOABankAccount1() {
        return (RowSet) getAttributeInternal(COABANKACCOUNT1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Vehicle1View1.
     */
    public RowSet getVehicle1View1() {
        return (RowSet) getAttributeInternal(VEHICLE1VIEW1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> BankTnsTypeView1.
     */
    public RowSet getBankTnsTypeView1() {
        return (RowSet) getAttributeInternal(BANKTNSTYPEVIEW1);
    }
}

