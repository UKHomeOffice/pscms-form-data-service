package io.digital.patterns.pscms.form.service.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter
public class DrugItem extends PostSeizureItem {

    @Column(name = "drug_id", unique = true)
    private long drugId;

    @Column(name = "sentForAnalysis")
    private String sentForAnalysis;

    @Column(name = "dataSent")
    private String dataSent;

    @Column(name = "analysisResult")
    private String analysisResult;

    @Column(name = "excludeFormHOReturn")
    private String excludeFormHOReturn;

    @Column(name = "HOCode")
    private String hoCode;

    @Column(name = "drugPreperation")
    private String drugPreperation;

}
