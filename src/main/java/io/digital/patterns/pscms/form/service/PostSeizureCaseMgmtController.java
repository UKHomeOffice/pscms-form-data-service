package io.digital.patterns.pscms.form.service;

import com.fasterxml.jackson.databind.JsonNode;
import io.digital.patterns.pscms.form.service.models.PostSeizureEvent;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/v1/dao-service")
public class PostSeizureCaseMgmtController {

    @Autowired
    PostSeizureCaseMgmntService service;

    @GetMapping("/recordFormData")
    public ResponseEntity<?> recordFormData(@RequestBody JsonNode message) {
            //TODO: Validate json payload against schema - Json object

            //TODO: Map to corresponding model data and save to db (mappers & repository)

            JSONObject response = new JSONObject();
            response.put("error occurred", "Invalid Payload");
            return ResponseEntity.ok(response.toString());

    }

    /* @GetMapping("/events")
    public List<PostSeizureEvent> getAllEvents(){
        return service.findAll();
    } */

    @GetMapping("/events/{businessKey}")
    public String getEventsByBusinessKey(@PathVariable ("businessKey") String businessKey){

        return service.getEventByBusinessKey(businessKey).toString();

    }
}
