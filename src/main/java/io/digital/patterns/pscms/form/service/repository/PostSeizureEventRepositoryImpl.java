package io.digital.patterns.pscms.form.service.repository;

import io.digital.patterns.pscms.form.service.models.Agency;
import io.digital.patterns.pscms.form.service.models.Attachment;
import io.digital.patterns.pscms.form.service.models.PostSeizureEvent;
import io.digital.patterns.pscms.form.service.models.PostSeizureItem;
import org.json.JSONObject;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PostSeizureEventRepositoryImpl implements PostSeizureEventRepository {

    @Override
    public Optional<PostSeizureEvent> findById(String s) {
//        log.info("Starting workflow dao service...");

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


        return Optional.of(event);
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<PostSeizureEvent> findAll() {
        return null;
    }

    @Override
    public List<PostSeizureEvent> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PostSeizureEvent> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PostSeizureEvent> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(PostSeizureEvent entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends PostSeizureEvent> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PostSeizureEvent> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PostSeizureEvent> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends PostSeizureEvent> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<PostSeizureEvent> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PostSeizureEvent getOne(String s) {
        return null;
    }

    @Override
    public <S extends PostSeizureEvent> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PostSeizureEvent> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PostSeizureEvent> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PostSeizureEvent> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PostSeizureEvent> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PostSeizureEvent> boolean exists(Example<S> example) {
        return false;
    }
}
