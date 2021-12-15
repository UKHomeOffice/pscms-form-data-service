package io.digital.patterns.pscms.form.service.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "firearm")
@Setter
@Getter
public class Firearm extends PostSeizureItem {

    @Column(name = "serialBarrel")
    private String serialBarrel;

    @Column(name = "firearm_check_done")
    private String firearmCheckDone;

    @Column(name = "reason_firearm_check_notdone")
    private String reasonFirearmCheckNotDone;

    @Column(name = "lethality")
    private String lethality;

}
