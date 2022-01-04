package io.digital.patterns.pscms.form.service.dto;

import io.digital.patterns.pscms.form.service.models.Attachment;
import io.digital.patterns.pscms.form.service.models.PostSeizureItem;
import lombok.Data;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Data
public class PostSeizureEventDTO {
    private String businessKey;
    private Calendar eventDate;
    private Calendar contextSubmissionDate;
    private Date eventTime;
    private String submittingUserEmail;
    private String bfOperationName;
    private String epmsNumber;
    private String eventPort;
    private String otherInformation;
    private List<Attachment> attachments;
    private List<PostSeizureItem> items;
}
