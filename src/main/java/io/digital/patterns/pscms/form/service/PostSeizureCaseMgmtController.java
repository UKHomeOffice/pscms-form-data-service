package io.digital.patterns.pscms.form.service;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/v1/dao-service")
public class PostSeizureCaseMgmtController {

    @GetMapping("/recordFormData")
    public ResponseEntity<?> recordFormData(@RequestBody JsonNode message) {        
            //TODO: Validate json payload against schema

            //TODO: Map to corresponding model data and save to db (mappers & repository)
        
            JSONObject response = new JSONObject();
            response.put("error occurred", "Invalid Payload");
            return ResponseEntity.ok(response.toString());
        
    }
}
