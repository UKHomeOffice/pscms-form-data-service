package io.digital.patterns.pscms.form.service.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="attachmentId")
    private Long attachmentId;

    @Column(name="fileName")
    private String fileName;

    @Column(name="url")
    private String url;

    @Column(name="attachmentBusinessKey")
    private String attachmentBusinessKey;
}
