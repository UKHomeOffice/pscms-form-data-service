package io.digital.patterns.pscms.form.service.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "npsu_case")
@Setter
@Getter
public class Case {

    @Id
    @Column(name = "caseId", unique = true, nullable = false)
    private String caseId;

    @Column(name = "NPSU_Ref")
    private String npsuRef;

}
