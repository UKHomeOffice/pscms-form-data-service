package io.digital.patterns.pscms.form.service.models;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="cop_epms_rbe_gold")
@Setter
@Getter
public class PostSeizureEvent {

    @Id
    @Column(unique = true, nullable = false, name = "businessKey")    
    private String businessKey;

    @Temporal(TemporalType.DATE)
    @Column(name="eventDate")
    private Calendar eventDate;

    @Temporal(TemporalType.DATE)
    @Column(name="contextSubmissionDate")
    private Calendar contextSubmissionDate;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="eventTime")
    private Date eventTime;

    @Column(name="submittingUsersEmail")
    private String submittingUsersEmail;

    @Column(name = "bfOperationName")
    private String bfOperationName;

    @Column(name = "epmsNumber")
    private String epmsNumber;

    @Column(name = "eventPort")
    private String eventPort;

    @Column(name = "otherInformation")
    private String otherInformation;



    @Column(name = "eventMode")
    private String eventMode;






}
