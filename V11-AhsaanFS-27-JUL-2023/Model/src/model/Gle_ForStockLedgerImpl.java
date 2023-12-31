package model;

import java.sql.Timestamp;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 03 17:49:49 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Gle_ForStockLedgerImpl extends ViewObjectImpl implements model.common.Gle_ForStockLedger{
    /**
     * This is the default constructor (do not remove).
     */
    public Gle_ForStockLedgerImpl() {
    }

    /**
     * Returns the variable value for BindGlesStartDate.
     * @return variable value for BindGlesStartDate
     */
    public Timestamp getBindGlesStartDate() {
        return (Timestamp) ensureVariableManager().getVariableValue("BindGlesStartDate");
    }

    /**
     * Sets <code>value</code> for variable BindGlesStartDate.
     * @param value value to bind as BindGlesStartDate
     */
    public void setBindGlesStartDate(Timestamp value) {
        ensureVariableManager().setVariableValue("BindGlesStartDate", value);
    }

    /**
     * Returns the variable value for BindglesEndDate.
     * @return variable value for BindglesEndDate
     */
    public Timestamp getBindglesEndDate() {
        return (Timestamp) ensureVariableManager().getVariableValue("BindglesEndDate");
    }

    /**
     * Sets <code>value</code> for variable BindglesEndDate.
     * @param value value to bind as BindglesEndDate
     */
    public void setBindglesEndDate(Timestamp value) {
        ensureVariableManager().setVariableValue("BindglesEndDate", value);
    }

    /**
     * Returns the variable value for BindCoaNamee.
     * @return variable value for BindCoaNamee
     */
    public String getBindCoaNamee() {
        return (String) ensureVariableManager().getVariableValue("BindCoaNamee");
    }

    /**
     * Sets <code>value</code> for variable BindCoaNamee.
     * @param value value to bind as BindCoaNamee
     */
    public void setBindCoaNamee(String value) {
        ensureVariableManager().setVariableValue("BindCoaNamee", value);
    }

    @Override
    public void refreshQuery(String coaName, Timestamp startDate, Timestamp endDate) {
        this.clearCache();
         this.setBindCoaNamee(coaName);
         this.setBindGlesStartDate(startDate);
         this.setBindglesEndDate(endDate);
         this.executeQuery();

    }
}

