package io.digital.patterns.pscms.form.service.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "trailer")
@Setter
@Getter
@PrimaryKeyJoinColumn
public class Trailer extends ModeOfTransport{

}
