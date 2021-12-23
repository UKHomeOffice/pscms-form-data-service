package io.digital.patterns.pscms.form.service;

import io.digital.patterns.pscms.form.service.models.PostSeizureEvent;
import io.digital.patterns.pscms.form.service.repository.PostSeizureEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PostSeizureCaseMgmntService {
    @Autowired
    PostSeizureEventRepository postSeizureEventRepository;

    public Optional<PostSeizureEvent> getEventByBusinessKey(String businessKey){
        return postSeizureEventRepository.findById(businessKey);
    }

}