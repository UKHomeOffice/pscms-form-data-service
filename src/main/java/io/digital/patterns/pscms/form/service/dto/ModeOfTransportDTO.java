package io.digital.patterns.pscms.form.service.dto;

import lombok.Data;

@Data
public class ModeOfTransportDTO {
    private long id;
    private String businessKey;
    private String type;
    private String registrationNumber;
    private String color;
    private String nationality;
    private String chasisNumber;
    private String vrn;
}
