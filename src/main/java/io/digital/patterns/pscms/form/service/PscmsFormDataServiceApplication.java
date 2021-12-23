package io.digital.patterns.pscms.form.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.digital.patterns.pscms.form.service.models.Agency;
import io.digital.patterns.pscms.form.service.models.Attachment;
import io.digital.patterns.pscms.form.service.models.PostSeizureEvent;
import io.digital.patterns.pscms.form.service.models.PostSeizureItem;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.File;
import java.io.IOException;
import java.util.*;


@SpringBootApplication
@Slf4j
public class PscmsFormDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PscmsFormDataServiceApplication.class, args);

    }
}
