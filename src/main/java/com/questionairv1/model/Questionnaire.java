package com.questionairv1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.questionairv1.model.Question;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Questionnaire
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-21T16:16:21.145Z[GMT]")
public class Questionnaire {
  @JsonProperty("id_questnr")
  private Long idQuestnr = null;

  @JsonProperty("id_client")
  private Long idClient = null;

  @JsonProperty("questions")
  @Valid
  private List<Question> questions = null;

  @JsonProperty("name_questnr")
  private String nameQuestnr = null;

  public Questionnaire idQuestnr(Long idQuestnr) {
    this.idQuestnr = idQuestnr;
    return this;
  }

  /**
   * Get idQuestnr
   * @return idQuestnr
  **/
  @ApiModelProperty(value = "")

  public Long getIdQuestnr() {
    return idQuestnr;
  }

  public void setIdQuestnr(Long idQuestnr) {
    this.idQuestnr = idQuestnr;
  }

  public Questionnaire idClient(Long idClient) {
    this.idClient = idClient;
    return this;
  }

  /**
   * Get idClient
   * @return idClient
  **/
  @ApiModelProperty(value = "")

  public Long getIdClient() {
    return idClient;
  }

  public void setIdClient(Long idClient) {
    this.idClient = idClient;
  }

  public Questionnaire questions(List<Question> questions) {
    this.questions = questions;
    return this;
  }

  public Questionnaire addQuestionsItem(Question questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<Question>();
    }
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * Get questions
   * @return questions
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

  public Questionnaire nameQuestnr(String nameQuestnr) {
    this.nameQuestnr = nameQuestnr;
    return this;
  }

  /**
   * Get nameQuestnr
   * @return nameQuestnr
  **/
  @ApiModelProperty(value = "")

  public String getNameQuestnr() {
    return nameQuestnr;
  }

  public void setNameQuestnr(String nameQuestnr) {
    this.nameQuestnr = nameQuestnr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Questionnaire questionnaire = (Questionnaire) o;
    return Objects.equals(this.idQuestnr, questionnaire.idQuestnr) &&
        Objects.equals(this.idClient, questionnaire.idClient) &&
        Objects.equals(this.questions, questionnaire.questions) &&
        Objects.equals(this.nameQuestnr, questionnaire.nameQuestnr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idQuestnr, idClient, questions, nameQuestnr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Questionnaire {\n");
    
    sb.append("    idQuestnr: ").append(toIndentedString(idQuestnr)).append("\n");
    sb.append("    idClient: ").append(toIndentedString(idClient)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    nameQuestnr: ").append(toIndentedString(nameQuestnr)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
