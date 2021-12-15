package io.digital.patterns.pscms.form.service.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "firearm")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "itemId")
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
