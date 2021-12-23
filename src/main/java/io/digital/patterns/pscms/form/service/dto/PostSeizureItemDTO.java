package io.digital.patterns.pscms.form.service.dto;

import io.digital.patterns.pscms.form.service.models.Agency;
import lombok.Data;

@Data
public class PostSeizureItemDTO {
    private String itemId;
    private String itemBusinessKey;
    private String itemCategory;
    private String reviewDate;
    private String currentLocation;
    private String store;
    private String seizedAction;
    private String storageLocation;
    private String itemFreeText;
    private String itemMMC;
    private long drugId;
    private String sentForAnalysis;
    private String dataSent;
    private String analysisResult;
    private String excludeFormHOReturn;
    private String hoCode;
    private String drugPreperation;
    private String cashAmount;
    private String cashWords;
    private String cashCurrency;
    private String serialBarrel;
    private String firearmCheckDone;
    private String reasonFirearmCheckNotDone;
    private String lethality;
    private Agency agency;
}
