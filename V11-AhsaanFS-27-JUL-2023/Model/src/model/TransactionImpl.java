package model;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.sql.Timestamp;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.ApplicationModule;
import oracle.jbo.AttributeList;
import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.DBTransactionImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 28 00:18:15 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TransactionImpl extends EntityImpl {
    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {



        super.create(attributeList);
    }


    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TnsId,
        TnsDate,
        TnsAmount,
        TnsDetail,
        TnsInfo,
        TnsGroup,
        TnsTnsTypeIdFk,
        TnsRate,
        TnsQty,
        TnsOiltId,
        TnsOildId,
        TnsStId,
        TnsCoaDactNumber,
        TnsCoaCactNumber,
        TnsAdjDate,
        TnsBankTnsTypeIdFk,
        TnsSlipNo,
        TnsSlipDate,
        TnsTnsviewId,
        TnsNewrate,
        TnsFreightfactor,
        TnsIsDebit,
        TnsIsClaimedId,
        TnsAdjId,
        TnsReverseEntry,
        TnsPurchaseRateLogIdFk,
        TnsSaleRateLogIdFk,
        TnsEtc,
        TnsParentTnsId,
        TnsBankNameId,
        TnsBrCode,
        TnsOildLoadId,
        TnsOildLoadDate,
        TnsFormatAmount,
        TnsSpellAmount,
        TnsSDate,
        TnsAdjAcRef,
        TnsInfoStart,
        DcIdFk,
        TnsCrDr,
        TnsStorageOiltIdFk,
        TnsDiscRate,
        TnsDiscAmt,
        VehicleIdFk,
        GeneralLedgerEntry,
        TransactionType,
        ChartOfAccounts,
        ChartOfAccounts1,
        BankTnsType,
        TnsView,
        OilDepo,
        OilTanker,
        Transaction,
        TnsPurchaseReturnTransaction,
        PurchaseRateLog,
        SaleRateLog,
        BankName,
        OilDepo1,
        OilTanker1,
        Vehicle1;
        private static AttributesEnum[] vals = null;
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


    public static final int TNSID = AttributesEnum.TnsId.index();
    public static final int TNSDATE = AttributesEnum.TnsDate.index();
    public static final int TNSAMOUNT = AttributesEnum.TnsAmount.index();
    public static final int TNSDETAIL = AttributesEnum.TnsDetail.index();
    public static final int TNSINFO = AttributesEnum.TnsInfo.index();
    public static final int TNSGROUP = AttributesEnum.TnsGroup.index();
    public static final int TNSTNSTYPEIDFK = AttributesEnum.TnsTnsTypeIdFk.index();
    public static final int TNSRATE = AttributesEnum.TnsRate.index();
    public static final int TNSQTY = AttributesEnum.TnsQty.index();
    public static final int TNSOILTID = AttributesEnum.TnsOiltId.index();
    public static final int TNSOILDID = AttributesEnum.TnsOildId.index();
    public static final int TNSSTID = AttributesEnum.TnsStId.index();
    public static final int TNSCOADACTNUMBER = AttributesEnum.TnsCoaDactNumber.index();
    public static final int TNSCOACACTNUMBER = AttributesEnum.TnsCoaCactNumber.index();
    public static final int TNSADJDATE = AttributesEnum.TnsAdjDate.index();
    public static final int TNSBANKTNSTYPEIDFK = AttributesEnum.TnsBankTnsTypeIdFk.index();
    public static final int TNSSLIPNO = AttributesEnum.TnsSlipNo.index();
    public static final int TNSSLIPDATE = AttributesEnum.TnsSlipDate.index();
    public static final int TNSTNSVIEWID = AttributesEnum.TnsTnsviewId.index();
    public static final int TNSNEWRATE = AttributesEnum.TnsNewrate.index();
    public static final int TNSFREIGHTFACTOR = AttributesEnum.TnsFreightfactor.index();
    public static final int TNSISDEBIT = AttributesEnum.TnsIsDebit.index();
    public static final int TNSISCLAIMEDID = AttributesEnum.TnsIsClaimedId.index();
    public static final int TNSADJID = AttributesEnum.TnsAdjId.index();
    public static final int TNSREVERSEENTRY = AttributesEnum.TnsReverseEntry.index();
    public static final int TNSPURCHASERATELOGIDFK = AttributesEnum.TnsPurchaseRateLogIdFk.index();
    public static final int TNSSALERATELOGIDFK = AttributesEnum.TnsSaleRateLogIdFk.index();
    public static final int TNSETC = AttributesEnum.TnsEtc.index();
    public static final int TNSPARENTTNSID = AttributesEnum.TnsParentTnsId.index();
    public static final int TNSBANKNAMEID = AttributesEnum.TnsBankNameId.index();
    public static final int TNSBRCODE = AttributesEnum.TnsBrCode.index();
    public static final int TNSOILDLOADID = AttributesEnum.TnsOildLoadId.index();
    public static final int TNSOILDLOADDATE = AttributesEnum.TnsOildLoadDate.index();
    public static final int TNSFORMATAMOUNT = AttributesEnum.TnsFormatAmount.index();
    public static final int TNSSPELLAMOUNT = AttributesEnum.TnsSpellAmount.index();
    public static final int TNSSDATE = AttributesEnum.TnsSDate.index();
    public static final int TNSADJACREF = AttributesEnum.TnsAdjAcRef.index();
    public static final int TNSINFOSTART = AttributesEnum.TnsInfoStart.index();
    public static final int DCIDFK = AttributesEnum.DcIdFk.index();
    public static final int TNSCRDR = AttributesEnum.TnsCrDr.index();
    public static final int TNSSTORAGEOILTIDFK = AttributesEnum.TnsStorageOiltIdFk.index();
    public static final int TNSDISCRATE = AttributesEnum.TnsDiscRate.index();
    public static final int TNSDISCAMT = AttributesEnum.TnsDiscAmt.index();
    public static final int VEHICLEIDFK = AttributesEnum.VehicleIdFk.index();
    public static final int GENERALLEDGERENTRY = AttributesEnum.GeneralLedgerEntry.index();
    public static final int TRANSACTIONTYPE = AttributesEnum.TransactionType.index();
    public static final int CHARTOFACCOUNTS = AttributesEnum.ChartOfAccounts.index();
    public static final int CHARTOFACCOUNTS1 = AttributesEnum.ChartOfAccounts1.index();
    public static final int BANKTNSTYPE = AttributesEnum.BankTnsType.index();
    public static final int TNSVIEW = AttributesEnum.TnsView.index();
    public static final int OILDEPO = AttributesEnum.OilDepo.index();
    public static final int OILTANKER = AttributesEnum.OilTanker.index();
    public static final int TRANSACTION = AttributesEnum.Transaction.index();
    public static final int TNSPURCHASERETURNTRANSACTION = AttributesEnum.TnsPurchaseReturnTransaction.index();
    public static final int PURCHASERATELOG = AttributesEnum.PurchaseRateLog.index();
    public static final int SALERATELOG = AttributesEnum.SaleRateLog.index();
    public static final int BANKNAME = AttributesEnum.BankName.index();
    public static final int OILDEPO1 = AttributesEnum.OilDepo1.index();
    public static final int OILTANKER1 = AttributesEnum.OilTanker1.index();
    public static final int VEHICLE1 = AttributesEnum.Vehicle1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TransactionImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.Transaction");
    }


    /**
     * Gets the attribute value for TnsId, using the alias name TnsId.
     * @return the value of TnsId
     */
    public DBSequence getTnsId() {
        return (DBSequence) getAttributeInternal(TNSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsId.
     * @param value value to set the TnsId
     */
    public void setTnsId(DBSequence value) {
        setAttributeInternal(TNSID, value);
    }

    /**
     * Gets the attribute value for TnsDate, using the alias name TnsDate.
     * @return the value of TnsDate
     */
    public Timestamp getTnsDate() {
        return (Timestamp) getAttributeInternal(TNSDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsDate.
     * @param value value to set the TnsDate
     */
    public void setTnsDate(Timestamp value) {
        setAttributeInternal(TNSDATE, value);
    }

    /**
     * Gets the attribute value for TnsAmount, using the alias name TnsAmount.
     * @return the value of TnsAmount
     */
    public BigDecimal getTnsAmount() {
        return (BigDecimal) getAttributeInternal(TNSAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsAmount.
     * @param value value to set the TnsAmount
     */
    public void setTnsAmount(BigDecimal value) {
        setAttributeInternal(TNSAMOUNT, value);
    }

    /**
     * Gets the attribute value for TnsDetail, using the alias name TnsDetail.
     * @return the value of TnsDetail
     */
    public String getTnsDetail() {
        return (String) getAttributeInternal(TNSDETAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsDetail.
     * @param value value to set the TnsDetail
     */
    public void setTnsDetail(String value) {
        setAttributeInternal(TNSDETAIL, value);
    }

    /**
     * Gets the attribute value for TnsInfo, using the alias name TnsInfo.
     * @return the value of TnsInfo
     */
    public String getTnsInfo() {
        return (String) getAttributeInternal(TNSINFO);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsInfo.
     * @param value value to set the TnsInfo
     */
    public void setTnsInfo(String value) {
        setAttributeInternal(TNSINFO, value);
    }

    /**
     * Gets the attribute value for TnsGroup, using the alias name TnsGroup.
     * @return the value of TnsGroup
     */
    public Long getTnsGroup() {
        return (Long) getAttributeInternal(TNSGROUP);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsGroup.
     * @param value value to set the TnsGroup
     */
    public void setTnsGroup(Long value) {
        setAttributeInternal(TNSGROUP, value);
    }

    /**
     * Gets the attribute value for TnsTnsTypeIdFk, using the alias name TnsTnsTypeIdFk.
     * @return the value of TnsTnsTypeIdFk
     */
    public Long getTnsTnsTypeIdFk() {
        return (Long) getAttributeInternal(TNSTNSTYPEIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsTnsTypeIdFk.
     * @param value value to set the TnsTnsTypeIdFk
     */
    public void setTnsTnsTypeIdFk(Long value) {
        setAttributeInternal(TNSTNSTYPEIDFK, value);
    }

    /**
     * Gets the attribute value for TnsRate, using the alias name TnsRate.
     * @return the value of TnsRate
     */
    public String getTnsRate() {
        return (String) getAttributeInternal(TNSRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsRate.
     * @param value value to set the TnsRate
     */
    public void setTnsRate(String value) {
        setAttributeInternal(TNSRATE, value);
    }

    /**
     * Gets the attribute value for TnsQty, using the alias name TnsQty.
     * @return the value of TnsQty
     */
    public BigDecimal getTnsQty() {
        return (BigDecimal) getAttributeInternal(TNSQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsQty.
     * @param value value to set the TnsQty
     */
    public void setTnsQty(BigDecimal value) {
        setAttributeInternal(TNSQTY, value);
    }

    /**
     * Gets the attribute value for TnsOiltId, using the alias name TnsOiltId.
     * @return the value of TnsOiltId
     */
    public Long getTnsOiltId() {
        return (Long) getAttributeInternal(TNSOILTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsOiltId.
     * @param value value to set the TnsOiltId
     */
    public void setTnsOiltId(Long value) {
        setAttributeInternal(TNSOILTID, value);
    }

    /**
     * Gets the attribute value for TnsOildId, using the alias name TnsOildId.
     * @return the value of TnsOildId
     */
    public Long getTnsOildId() {
        return (Long) getAttributeInternal(TNSOILDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsOildId.
     * @param value value to set the TnsOildId
     */
    public void setTnsOildId(Long value) {
        setAttributeInternal(TNSOILDID, value);
    }

    /**
     * Gets the attribute value for TnsStId, using the alias name TnsStId.
     * @return the value of TnsStId
     */
    public Long getTnsStId() {
        return (Long) getAttributeInternal(TNSSTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsStId.
     * @param value value to set the TnsStId
     */
    public void setTnsStId(Long value) {
        setAttributeInternal(TNSSTID, value);
    }

    /**
     * Gets the attribute value for TnsCoaDactNumber, using the alias name TnsCoaDactNumber.
     * @return the value of TnsCoaDactNumber
     */
    public Long getTnsCoaDactNumber() {
        return (Long) getAttributeInternal(TNSCOADACTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsCoaDactNumber.
     * @param value value to set the TnsCoaDactNumber
     */
    public void setTnsCoaDactNumber(Long value) {
        setAttributeInternal(TNSCOADACTNUMBER, value);
    }

    /**
     * Gets the attribute value for TnsCoaCactNumber, using the alias name TnsCoaCactNumber.
     * @return the value of TnsCoaCactNumber
     */
    public Long getTnsCoaCactNumber() {
        return (Long) getAttributeInternal(TNSCOACACTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsCoaCactNumber.
     * @param value value to set the TnsCoaCactNumber
     */
    public void setTnsCoaCactNumber(Long value) {
        setAttributeInternal(TNSCOACACTNUMBER, value);
    }

    /**
     * Gets the attribute value for TnsAdjDate, using the alias name TnsAdjDate.
     * @return the value of TnsAdjDate
     */
    public Timestamp getTnsAdjDate() {
        return (Timestamp) getAttributeInternal(TNSADJDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsAdjDate.
     * @param value value to set the TnsAdjDate
     */
    public void setTnsAdjDate(Timestamp value) {
        setAttributeInternal(TNSADJDATE, value);
    }

    /**
     * Gets the attribute value for TnsBankTnsTypeIdFk, using the alias name TnsBankTnsTypeIdFk.
     * @return the value of TnsBankTnsTypeIdFk
     */
    public Long getTnsBankTnsTypeIdFk() {
        return (Long) getAttributeInternal(TNSBANKTNSTYPEIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsBankTnsTypeIdFk.
     * @param value value to set the TnsBankTnsTypeIdFk
     */
    public void setTnsBankTnsTypeIdFk(Long value) {
        setAttributeInternal(TNSBANKTNSTYPEIDFK, value);
    }

    /**
     * Gets the attribute value for TnsSlipNo, using the alias name TnsSlipNo.
     * @return the value of TnsSlipNo
     */
    public String getTnsSlipNo() {
        return (String) getAttributeInternal(TNSSLIPNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsSlipNo.
     * @param value value to set the TnsSlipNo
     */
    public void setTnsSlipNo(String value) {
        setAttributeInternal(TNSSLIPNO, value);
    }

    /**
     * Gets the attribute value for TnsSlipDate, using the alias name TnsSlipDate.
     * @return the value of TnsSlipDate
     */
    public Timestamp getTnsSlipDate() {
        return (Timestamp) getAttributeInternal(TNSSLIPDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsSlipDate.
     * @param value value to set the TnsSlipDate
     */
    public void setTnsSlipDate(Timestamp value) {
        setAttributeInternal(TNSSLIPDATE, value);
    }

    /**
     * Gets the attribute value for TnsTnsviewId, using the alias name TnsTnsviewId.
     * @return the value of TnsTnsviewId
     */
    public Long getTnsTnsviewId() {
        return (Long) getAttributeInternal(TNSTNSVIEWID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsTnsviewId.
     * @param value value to set the TnsTnsviewId
     */
    public void setTnsTnsviewId(Long value) {
        setAttributeInternal(TNSTNSVIEWID, value);
    }

    /**
     * Gets the attribute value for TnsNewrate, using the alias name TnsNewrate.
     * @return the value of TnsNewrate
     */
    public String getTnsNewrate() {
        return (String) getAttributeInternal(TNSNEWRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsNewrate.
     * @param value value to set the TnsNewrate
     */
    public void setTnsNewrate(String value) {
        setAttributeInternal(TNSNEWRATE, value);
    }

    /**
     * Gets the attribute value for TnsFreightfactor, using the alias name TnsFreightfactor.
     * @return the value of TnsFreightfactor
     */
    public BigDecimal getTnsFreightfactor() {
        return (BigDecimal) getAttributeInternal(TNSFREIGHTFACTOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsFreightfactor.
     * @param value value to set the TnsFreightfactor
     */
    public void setTnsFreightfactor(BigDecimal value) {
        setAttributeInternal(TNSFREIGHTFACTOR, value);
    }

    /**
     * Gets the attribute value for TnsIsDebit, using the alias name TnsIsDebit.
     * @return the value of TnsIsDebit
     */
    public Integer getTnsIsDebit() {
        return (Integer) getAttributeInternal(TNSISDEBIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsIsDebit.
     * @param value value to set the TnsIsDebit
     */
    public void setTnsIsDebit(Integer value) {
        setAttributeInternal(TNSISDEBIT, value);
    }

    /**
     * Gets the attribute value for TnsIsClaimedId, using the alias name TnsIsClaimedId.
     * @return the value of TnsIsClaimedId
     */
    public Long getTnsIsClaimedId() {
        return (Long) getAttributeInternal(TNSISCLAIMEDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsIsClaimedId.
     * @param value value to set the TnsIsClaimedId
     */
    public void setTnsIsClaimedId(Long value) {
        setAttributeInternal(TNSISCLAIMEDID, value);
    }

    /**
     * Gets the attribute value for TnsAdjId, using the alias name TnsAdjId.
     * @return the value of TnsAdjId
     */
    public Long getTnsAdjId() {
        return (Long) getAttributeInternal(TNSADJID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsAdjId.
     * @param value value to set the TnsAdjId
     */
    public void setTnsAdjId(Long value) {
        setAttributeInternal(TNSADJID, value);
    }

    /**
     * Gets the attribute value for TnsReverseEntry, using the alias name TnsReverseEntry.
     * @return the value of TnsReverseEntry
     */
    public Long getTnsReverseEntry() {
        return (Long) getAttributeInternal(TNSREVERSEENTRY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsReverseEntry.
     * @param value value to set the TnsReverseEntry
     */
    public void setTnsReverseEntry(Long value) {
        setAttributeInternal(TNSREVERSEENTRY, value);
    }

    /**
     * Gets the attribute value for TnsPurchaseRateLogIdFk, using the alias name TnsPurchaseRateLogIdFk.
     * @return the value of TnsPurchaseRateLogIdFk
     */
    public Long getTnsPurchaseRateLogIdFk() {
        return (Long) getAttributeInternal(TNSPURCHASERATELOGIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsPurchaseRateLogIdFk.
     * @param value value to set the TnsPurchaseRateLogIdFk
     */
    public void setTnsPurchaseRateLogIdFk(Long value) {
        setAttributeInternal(TNSPURCHASERATELOGIDFK, value);
    }

    /**
     * Gets the attribute value for TnsSaleRateLogIdFk, using the alias name TnsSaleRateLogIdFk.
     * @return the value of TnsSaleRateLogIdFk
     */
    public Long getTnsSaleRateLogIdFk() {
        return (Long) getAttributeInternal(TNSSALERATELOGIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsSaleRateLogIdFk.
     * @param value value to set the TnsSaleRateLogIdFk
     */
    public void setTnsSaleRateLogIdFk(Long value) {
        setAttributeInternal(TNSSALERATELOGIDFK, value);
    }

    /**
     * Gets the attribute value for TnsEtc, using the alias name TnsEtc.
     * @return the value of TnsEtc
     */
    public String getTnsEtc() {
        return (String) getAttributeInternal(TNSETC);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsEtc.
     * @param value value to set the TnsEtc
     */
    public void setTnsEtc(String value) {
        setAttributeInternal(TNSETC, value);
    }

    /**
     * Gets the attribute value for TnsParentTnsId, using the alias name TnsParentTnsId.
     * @return the value of TnsParentTnsId
     */
    public Long getTnsParentTnsId() {
        return (Long) getAttributeInternal(TNSPARENTTNSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsParentTnsId.
     * @param value value to set the TnsParentTnsId
     */
    public void setTnsParentTnsId(Long value) {
        setAttributeInternal(TNSPARENTTNSID, value);
    }

    /**
     * Gets the attribute value for TnsBankNameId, using the alias name TnsBankNameId.
     * @return the value of TnsBankNameId
     */
    public Long getTnsBankNameId() {
        return (Long) getAttributeInternal(TNSBANKNAMEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsBankNameId.
     * @param value value to set the TnsBankNameId
     */
    public void setTnsBankNameId(Long value) {
        setAttributeInternal(TNSBANKNAMEID, value);
    }

    /**
     * Gets the attribute value for TnsBrCode, using the alias name TnsBrCode.
     * @return the value of TnsBrCode
     */
    public String getTnsBrCode() {
        return (String) getAttributeInternal(TNSBRCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsBrCode.
     * @param value value to set the TnsBrCode
     */
    public void setTnsBrCode(String value) {
        setAttributeInternal(TNSBRCODE, value);
    }

    /**
     * Gets the attribute value for TnsOildLoadId, using the alias name TnsOildLoadId.
     * @return the value of TnsOildLoadId
     */
    public Long getTnsOildLoadId() {
        return (Long) getAttributeInternal(TNSOILDLOADID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsOildLoadId.
     * @param value value to set the TnsOildLoadId
     */
    public void setTnsOildLoadId(Long value) {
        setAttributeInternal(TNSOILDLOADID, value);
    }

    /**
     * Gets the attribute value for TnsOildLoadDate, using the alias name TnsOildLoadDate.
     * @return the value of TnsOildLoadDate
     */
    public Timestamp getTnsOildLoadDate() {
        return (Timestamp) getAttributeInternal(TNSOILDLOADDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsOildLoadDate.
     * @param value value to set the TnsOildLoadDate
     */
    public void setTnsOildLoadDate(Timestamp value) {
        setAttributeInternal(TNSOILDLOADDATE, value);
    }

    /**
     * Gets the attribute value for TnsFormatAmount, using the alias name TnsFormatAmount.
     * @return the value of TnsFormatAmount
     */
    public BigDecimal getTnsFormatAmount() {
        return (BigDecimal) getAttributeInternal(TNSFORMATAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsFormatAmount.
     * @param value value to set the TnsFormatAmount
     */
    public void setTnsFormatAmount(BigDecimal value) {
        setAttributeInternal(TNSFORMATAMOUNT, value);
    }

    /**
     * Gets the attribute value for TnsSpellAmount, using the alias name TnsSpellAmount.
     * @return the value of TnsSpellAmount
     */
    public String getTnsSpellAmount() {
        return (String) getAttributeInternal(TNSSPELLAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsSpellAmount.
     * @param value value to set the TnsSpellAmount
     */
    public void setTnsSpellAmount(String value) {
        setAttributeInternal(TNSSPELLAMOUNT, value);
    }

    /**
     * Gets the attribute value for TnsSDate, using the alias name TnsSDate.
     * @return the value of TnsSDate
     */
    public Timestamp getTnsSDate() {
        return (Timestamp) getAttributeInternal(TNSSDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsSDate.
     * @param value value to set the TnsSDate
     */
    public void setTnsSDate(Timestamp value) {
        setAttributeInternal(TNSSDATE, value);
    }

    /**
     * Gets the attribute value for TnsAdjAcRef, using the alias name TnsAdjAcRef.
     * @return the value of TnsAdjAcRef
     */
    public Long getTnsAdjAcRef() {
        return (Long) getAttributeInternal(TNSADJACREF);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsAdjAcRef.
     * @param value value to set the TnsAdjAcRef
     */
    public void setTnsAdjAcRef(Long value) {
        setAttributeInternal(TNSADJACREF, value);
    }

    /**
     * Gets the attribute value for TnsInfoStart, using the alias name TnsInfoStart.
     * @return the value of TnsInfoStart
     */
    public String getTnsInfoStart() {
        return (String) getAttributeInternal(TNSINFOSTART);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsInfoStart.
     * @param value value to set the TnsInfoStart
     */
    public void setTnsInfoStart(String value) {
        setAttributeInternal(TNSINFOSTART, value);
    }

    /**
     * Gets the attribute value for DcIdFk, using the alias name DcIdFk.
     * @return the value of DcIdFk
     */
    public Long getDcIdFk() {
        return (Long) getAttributeInternal(DCIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for DcIdFk.
     * @param value value to set the DcIdFk
     */
    public void setDcIdFk(Long value) {
        setAttributeInternal(DCIDFK, value);
    }

    /**
     * Gets the attribute value for TnsCrDr, using the alias name TnsCrDr.
     * @return the value of TnsCrDr
     */
    public Long getTnsCrDr() {
        return (Long) getAttributeInternal(TNSCRDR);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsCrDr.
     * @param value value to set the TnsCrDr
     */
    public void setTnsCrDr(Long value) {
        setAttributeInternal(TNSCRDR, value);
    }

    /**
     * Gets the attribute value for TnsStorageOiltIdFk, using the alias name TnsStorageOiltIdFk.
     * @return the value of TnsStorageOiltIdFk
     */
    public Long getTnsStorageOiltIdFk() {
        return (Long) getAttributeInternal(TNSSTORAGEOILTIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsStorageOiltIdFk.
     * @param value value to set the TnsStorageOiltIdFk
     */
    public void setTnsStorageOiltIdFk(Long value) {
        setAttributeInternal(TNSSTORAGEOILTIDFK, value);
    }

    /**
     * Gets the attribute value for TnsDiscRate, using the alias name TnsDiscRate.
     * @return the value of TnsDiscRate
     */
    public BigDecimal getTnsDiscRate() {
        return (BigDecimal) getAttributeInternal(TNSDISCRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsDiscRate.
     * @param value value to set the TnsDiscRate
     */
    public void setTnsDiscRate(BigDecimal value) {
        setAttributeInternal(TNSDISCRATE, value);
    }

    /**
     * Gets the attribute value for TnsDiscAmt, using the alias name TnsDiscAmt.
     * @return the value of TnsDiscAmt
     */
    public BigDecimal getTnsDiscAmt() {
        return (BigDecimal) getAttributeInternal(TNSDISCAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TnsDiscAmt.
     * @param value value to set the TnsDiscAmt
     */
    public void setTnsDiscAmt(BigDecimal value) {
        setAttributeInternal(TNSDISCAMT, value);
    }

    /**
     * Gets the attribute value for VehicleIdFk, using the alias name VehicleIdFk.
     * @return the value of VehicleIdFk
     */
    public BigDecimal getVehicleIdFk() {
        return (BigDecimal) getAttributeInternal(VEHICLEIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for VehicleIdFk.
     * @param value value to set the VehicleIdFk
     */
    public void setVehicleIdFk(BigDecimal value) {
        setAttributeInternal(VEHICLEIDFK, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGeneralLedgerEntry() {
        return (RowIterator) getAttributeInternal(GENERALLEDGERENTRY);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTransactionType() {
        return (EntityImpl) getAttributeInternal(TRANSACTIONTYPE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTransactionType(EntityImpl value) {
        setAttributeInternal(TRANSACTIONTYPE, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getChartOfAccounts() {
        return (EntityImpl) getAttributeInternal(CHARTOFACCOUNTS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setChartOfAccounts(EntityImpl value) {
        setAttributeInternal(CHARTOFACCOUNTS, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getChartOfAccounts1() {
        return (EntityImpl) getAttributeInternal(CHARTOFACCOUNTS1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setChartOfAccounts1(EntityImpl value) {
        setAttributeInternal(CHARTOFACCOUNTS1, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getBankTnsType() {
        return (EntityImpl) getAttributeInternal(BANKTNSTYPE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setBankTnsType(EntityImpl value) {
        setAttributeInternal(BANKTNSTYPE, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTnsView() {
        return (EntityImpl) getAttributeInternal(TNSVIEW);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTnsView(EntityImpl value) {
        setAttributeInternal(TNSVIEW, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getOilDepo() {
        return (EntityImpl) getAttributeInternal(OILDEPO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setOilDepo(EntityImpl value) {
        setAttributeInternal(OILDEPO, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getOilTanker() {
        return (EntityImpl) getAttributeInternal(OILTANKER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setOilTanker(EntityImpl value) {
        setAttributeInternal(OILTANKER, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTransaction() {
        return (RowIterator) getAttributeInternal(TRANSACTION);
    }

    /**
     * @return the associated entity TransactionImpl.
     */
    public TransactionImpl getTnsPurchaseReturnTransaction() {
        return (TransactionImpl) getAttributeInternal(TNSPURCHASERETURNTRANSACTION);
    }

    /**
     * Sets <code>value</code> as the associated entity TransactionImpl.
     */
    public void setTnsPurchaseReturnTransaction(TransactionImpl value) {
        setAttributeInternal(TNSPURCHASERETURNTRANSACTION, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getPurchaseRateLog() {
        return (EntityImpl) getAttributeInternal(PURCHASERATELOG);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPurchaseRateLog(EntityImpl value) {
        setAttributeInternal(PURCHASERATELOG, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSaleRateLog() {
        return (EntityImpl) getAttributeInternal(SALERATELOG);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSaleRateLog(EntityImpl value) {
        setAttributeInternal(SALERATELOG, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getBankName() {
        return (EntityImpl) getAttributeInternal(BANKNAME);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setBankName(EntityImpl value) {
        setAttributeInternal(BANKNAME, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getOilDepo1() {
        return (EntityImpl) getAttributeInternal(OILDEPO1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setOilDepo1(EntityImpl value) {
        setAttributeInternal(OILDEPO1, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getOilTanker1() {
        return (EntityImpl) getAttributeInternal(OILTANKER1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setOilTanker1(EntityImpl value) {
        setAttributeInternal(OILTANKER1, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getVehicle1() {
        return (EntityImpl) getAttributeInternal(VEHICLE1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setVehicle1(EntityImpl value) {
        setAttributeInternal(VEHICLE1, value);
    }

    /**
     * @param tnsId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(DBSequence tnsId) {
        return new Key(new Object[] { tnsId });
    }


    
    @SuppressWarnings({ "unchecked", "oracle.jdeveloper.java.unchecked-conversion-or-cast",
                        "oracle.jdeveloper.java.semantic-warning" })
       protected void callLoggingProcedure(int operation, TransactionEvent e) {

           String entityName = getEntityDef().getName();
    Map SessionScopeMap = ADFContext.getCurrent().getSessionScope();
    String UserName=(String)SessionScopeMap.get("loginUser");
    String sessionId=(String)SessionScopeMap.get("loginSessionID");

           int dmlAction = 0;
           Object theKey = getPrimaryKey().getAttribute(0);
    String strKey=theKey.toString();
        Long longKey = new Long(strKey);

           if (operation == DML_INSERT) {
               dmlAction = 1;
           } else if (operation == DML_UPDATE) {
               dmlAction = 2;
           } else if (operation == DML_DELETE) {
               dmlAction = 3;
           }






    DBTransactionImpl dbti = (DBTransactionImpl)getDBTransaction();
    CallableStatement statement =
     dbti.createCallableStatement(("BEGIN "+"INSERTOPERATION(?,?,?,?,?);" +
                                   "END;"), 0);
    try {
       statement.setInt(1, 1);
       statement.setInt(2, dmlAction);
       statement.setLong(3, longKey);

       statement.setString(4, UserName);
       statement.setString(5, sessionId);
             statement.execute();

    } catch (SQLException sqlerr) {
       throw new JboException(sqlerr);
    } finally {
       try {
           if (statement != null) {
               statement.close();
               //dbti.disconnect(true);
           }
       } catch (SQLException closeerr) {
           throw new JboException(closeerr);
       }
    }

    }

}
