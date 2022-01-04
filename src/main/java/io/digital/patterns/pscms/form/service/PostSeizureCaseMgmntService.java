package io.digital.patterns.pscms.form.service;

import io.digital.patterns.pscms.form.service.models.PostSeizureEvent;
import io.digital.patterns.pscms.form.service.repository.PostSeizureEventRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PostSeizureCaseMgmntService {
    @Autowired
    PostSeizureEventRepository postSeizureEventRepository;

    public JSONObject getEventByBusinessKey(String businessKey){
        PostSeizureEvent event = postSeizureEventRepository.findById(businessKey).get();
        //Pojo to Json
        JSONObject object = new JSONObject(event);
        System.out.println(object);
        return object;
    }

}