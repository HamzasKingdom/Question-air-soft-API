package com.questionairv1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Answer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-21T16:16:21.145Z[GMT]")
public class Answer   {
  @JsonProperty("id_questnr")
  private Long idQuestnr = null;

  @JsonProperty("id_question")
  private Long idQuestion = null;

  @JsonProperty("id_choice")
  private Long idChoice = null;

  @JsonProperty("answer_type")
  private String answerType = null;

  @JsonProperty("answer_content")
  private Long answerContent = null;

  public Answer idQuestnr(Long idQuestnr) {
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

  public Answer idQuestion(Long idQuestion) {
    this.idQuestion = idQuestion;
    return this;
  }

  /**
   * Get idQuestion
   * @return idQuestion
  **/
  @ApiModelProperty(value = "")

  public Long getIdQuestion() {
    return idQuestion;
  }

  public void setIdQuestion(Long idQuestion) {
    this.idQuestion = idQuestion;
  }

  public Answer idChoice(Long idChoice) {
    this.idChoice = idChoice;
    return this;
  }

  /**
   * Get idChoice
   * @return idChoice
  **/
  @ApiModelProperty(value = "")

  public Long getIdChoice() {
    return idChoice;
  }

  public void setIdChoice(Long idChoice) {
    this.idChoice = idChoice;
  }

  public Answer answerType(String answerType) {
    this.answerType = answerType;
    return this;
  }

  /**
   * Get answerType
   * @return answerType
  **/
  @ApiModelProperty(value = "")

  public String getAnswerType() {
    return answerType;
  }

  public void setAnswerType(String answerType) {
    this.answerType = answerType;
  }

  public Answer answerContent(Long answerContent) {
    this.answerContent = answerContent;
    return this;
  }

  /**
   * Get answerContent
   * @return answerContent
  **/
  @ApiModelProperty(value = "")

  public Long getAnswerContent() {
    return answerContent;
  }

  public void setAnswerContent(Long answerContent) {
    this.answerContent = answerContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Answer answer = (Answer) o;
    return Objects.equals(this.idQuestnr, answer.idQuestnr) &&
        Objects.equals(this.idQuestion, answer.idQuestion) &&
        Objects.equals(this.idChoice, answer.idChoice) &&
        Objects.equals(this.answerType, answer.answerType) &&
        Objects.equals(this.answerContent, answer.answerContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idQuestnr, idQuestion, idChoice, answerType, answerContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Answer {\n");
    
    sb.append("    idQuestnr: ").append(toIndentedString(idQuestnr)).append("\n");
    sb.append("    idQuestion: ").append(toIndentedString(idQuestion)).append("\n");
    sb.append("    idChoice: ").append(toIndentedString(idChoice)).append("\n");
    sb.append("    answerType: ").append(toIndentedString(answerType)).append("\n");
    sb.append("    answerContent: ").append(toIndentedString(answerContent)).append("\n");
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
