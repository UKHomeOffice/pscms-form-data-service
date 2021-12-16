package io.digital.patterns.pscms.form.service.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "cop_epms_item_gold")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Setter
@Getter
public class PostSeizureItem implements Serializable {

    @Id
    @Column(name = "itemId", nullable = false, unique = true)
    private String itemId;


    @Column(name = "itemBusinessKey")
    private String itemBusinessKey;

    @Column(name = "itemDescription")
    private String itemDescription;

    @Column(name = "itemCategory")
    private String itemCategory;

    @Column(name = "reviewDate")
    private Calendar reviewDate;

    @Column(name = "currentLocation")
    private String currentLocation;

    @Column(name = "store")
    private String store;

    @Column(name = "seizedAction")
    private String seizedAction;

    @Column(name = "storageLocation")
    private String storageLocation;

    @Column(name = "item_free_text")
    private String itemFreeText;

    @Column(name = "item_MMC")
    private String itemMMC;

    @OneToOne(cascade=CascadeType.ALL, optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "itemId", referencedColumnName = "itemId")
    private Agency agency;

}
