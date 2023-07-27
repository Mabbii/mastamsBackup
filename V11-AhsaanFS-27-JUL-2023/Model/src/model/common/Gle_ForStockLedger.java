package model.common;

import java.sql.Timestamp;

import oracle.jbo.ViewObject;

public interface Gle_ForStockLedger extends ViewObject {
    void refreshQuery(String coaName, Timestamp startDate, Timestamp endDate);
}
