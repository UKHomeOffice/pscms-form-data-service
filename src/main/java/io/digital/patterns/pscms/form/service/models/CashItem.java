package io.digital.patterns.pscms.form.service.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="cash", schema = "public")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "itemId")
public class CashItem extends PostSeizureItem {

    @Column(name = "cashAmount")
    private String cashAmount;

    @Column(name = "cashWords")
    private String cashWords;

    @Column(name = "cashCurrency")
    private String cashCurrency;    

}
