package io.digital.patterns.pscms.form.service.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mode_of_transport")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Setter
@Getter
public class ModeOfTransport implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "itemId")
    private String itemId;

    @Column(name = "businessKey")
    private String businessKey;

    @Column(name = "type")
    private String type;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "colour")
    private String colour;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "chasis_number")
    private String chasisNumber;

    @Column(name = "vrn")
    private String vrn;

}
