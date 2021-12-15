package io.digital.patterns.pscms.form.service.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="agency")
@Data
@NoArgsConstructor
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "businessKey")
    private String businessKey;

    @Column(name = "itemId")
    private String itemId;

    @Column(name = "contactsType")
    private String contactsType;

    @Column(name = "agency_name")
    private String agencyName;

    @Column(name = "OGD_ref")
    private String oGDRef;
}
