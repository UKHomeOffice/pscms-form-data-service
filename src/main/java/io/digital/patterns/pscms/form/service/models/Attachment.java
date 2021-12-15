package io.digital.patterns.pscms.form.service.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "attachment")
@Setter
@Getter
public class Attachment {
    
    @Id
    @GeneratedValue
    @Column(name="attachmentId")
    private Long attachmentId;

    @Column(name="fileName")
    private String fileName;

    @Column(name="url")
    private String url;


    @Column(name="businessKey")
    private String businessKey;
    
}
