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
        log.info("Starting workflow dao service...");

        PostSeizureEvent event = new PostSeizureEvent();
        Attachment attachment = new Attachment();
        attachment.setAttachmentId(3l);
        attachment.setFileName("fileName");
        attachment.setUrl("url");
        attachment.setAttachmentBusinessKey("businessKey");
        List<Attachment> list = Arrays.asList(attachment);
        event.setAttachments(list);

        Agency agency = new Agency();
        agency.setId(1l);
        agency.setItemId("itemId");
        agency.setAgencyName("agencyName");
        agency.setBusinessKey("agencyKey");
        agency.setContactsType("contacts Type");
        agency.setOGDRef("oGDRef");

        PostSeizureItem item = new PostSeizureItem();
        item.setItemId("itemId");
        item.setItemBusinessKey("item business key");
        item.setItemCategory("itemCategory");
        item.setItemDescription("description");
        item.setCurrentLocation("location");
        item.setItemMMC("mmC");
        item.setReviewDate(null);
        event.setEventDate(null);
        event.setContextSubmissionDate(null);
        event.setEventTime(null);
        item.setStore("store");
        item.setStorageLocation("storage location");
        item.setSeizedAction("seized action");
        item.setItemFreeText("free text");
        item.setAgency(agency);

        List<PostSeizureItem> posItem = Arrays.asList(item);
        event.setItems(posItem);

        event.setBusinessKey("DP-20201103-1");
        event.setSubmittingUsersEmail("test@test.com");
        event.setBfOperationName("Test Operation Name");
        event.setEpmsNumber("999");
        event.setEventPort("Glasgow Airport");
        event.setOtherInformation("Not applicable");
        event.setEventMode("Event test mode");

        //Pojo to Json
        JSONObject object = new JSONObject(event);
        System.out.println(object);
        SpringApplication.run(PscmsFormDataServiceApplication.class, args);

    }
}
