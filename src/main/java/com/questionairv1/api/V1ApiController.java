package com.questionairv1.api;

import com.questionairv1.model.Answer;
import com.questionairv1.model.Questionnaire;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-21T16:16:21.145Z[GMT]")
@Controller
public class V1ApiController implements V1Api {

    private static final Logger log = LoggerFactory.getLogger(V1ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> v1AnswersPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody List<Answer> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Questionnaire> v1QuestionnaireFormsIdQuestnrGet(@ApiParam(value = "L'id du questionnaire à obtenir",required=true) @PathVariable("id_questnr") Long idQuestnr) {
        String accept = request.getHeader("Accept");
        Questionnaire q = new Questionnaire();
        return new ResponseEntity<Questionnaire>(HttpStatus.NOT_IMPLEMENTED);
    }

}
