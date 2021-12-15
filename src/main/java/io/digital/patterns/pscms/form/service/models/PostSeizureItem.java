package io.digital.patterns.pscms.form.service.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "cop_epms_item_gold")
@Inheritance(strategy = InheritanceType.JOINED)
@Setter
@Getter
public class PostSeizureItem {

    @Id
    @Column(name = "itemId", nullable = false, unique = true)
    private String itemId;


    @Column(name = "businessKey")
    private String businesskey;

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

    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "itemId", referencedColumnName = "itemId")
    private Agency agency;

}
