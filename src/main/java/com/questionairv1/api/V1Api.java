/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.7).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.questionairv1.api;

import com.questionairv1.model.Answer;
import com.questionairv1.model.Questionnaire;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-21T16:16:21.145Z[GMT]")
@Api(value = "v1", description = "the v1 API")
public interface V1Api {

    @ApiOperation(value = "", nickname = "v1AnswersPost", notes = "Ajouter une réponse à une/des question(s) dans un questionnaire", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "OK réponse(s) ajoutée(s)"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/v1/answers",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> v1AnswersPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody List<Answer> body);


    @ApiOperation(value = "", nickname = "v1QuestionnaireFormsIdQuestnrGet", notes = "Obtenir le formulaire du questionnaire pour que le copropriétaire le remplisse", response = Questionnaire.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK le formulaire a été obtenu", response = Questionnaire.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/v1/questionnaire_forms/{id_questnr}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Questionnaire> v1QuestionnaireFormsIdQuestnrGet(@ApiParam(value = "L'id du questionnaire à obtenir",required=true) @PathVariable("id_questnr") Long idQuestnr);

}
