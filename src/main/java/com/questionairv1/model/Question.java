package com.questionairv1.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.questionairv1.model.Choice;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Question
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-21T16:16:21.145Z[GMT]")
public class Question   {
  @JsonProperty("id_quest")
  private Long idQuest = null;

  @JsonProperty("choices")
  @Valid
  private List<Choice> choices = null;

  @JsonProperty("id_cat")
  private Long idCat = null;

  @JsonProperty("content_quest")
  private String contentQuest = null;

  /**
   * Gets or Sets typeQuest
   */
  @JsonProperty("type_quest")
  private String typeQuest = null;

  @JsonProperty("min")
  private Long min = null;

  @JsonProperty("max")
  private Long max = null;

  public Question idQuest(Long idQuest) {
    this.idQuest = idQuest;
    return this;
  }

  /**
   * Get idQuest
   * @return idQuest
  **/
  @ApiModelProperty(value = "")

  public Long getIdQuest() {
    return idQuest;
  }

  public void setIdQuest(Long idQuest) {
    this.idQuest = idQuest;
  }

  public Question choices(List<Choice> choices) {
    this.choices = choices;
    return this;
  }

  public Question addChoicesItem(Choice choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<Choice>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * Get choices
   * @return choices
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Choice> getChoices() {
    return choices;
  }

  public void setChoices(List<Choice> choices) {
    this.choices = choices;
  }

  public Question idCat(Long idCat) {
    this.idCat = idCat;
    return this;
  }

  /**
   * Get idCat
   * @return idCat
  **/
  @ApiModelProperty(value = "")

  public Long getIdCat() {
    return idCat;
  }

  public void setIdCat(Long idCat) {
    this.idCat = idCat;
  }

  public Question contentQuest(String contentQuest) {
    this.contentQuest = contentQuest;
    return this;
  }

  /**
   * Get contentQuest
   * @return contentQuest
  **/
  @ApiModelProperty(value = "")

  public String getContentQuest() {
    return contentQuest;
  }

  public void setContentQuest(String contentQuest) {
    this.contentQuest = contentQuest;
  }

  public Question typeQuest(String typeQuest) {
    this.typeQuest = typeQuest;
    return this;
  }

  /**
   * Get typeQuest
   * @return typeQuest
  **/
  @ApiModelProperty(value = "")

  public String getTypeQuest() {
    return typeQuest;
  }

  public void setTypeQuest(String typeQuest) {
    this.typeQuest = typeQuest;
  }

  public Question min(Long min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
  **/
  @ApiModelProperty(value = "")

  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }

  public Question max(Long max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
  **/
  @ApiModelProperty(value = "")

  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Question question = (Question) o;
    return Objects.equals(this.idQuest, question.idQuest) &&
        Objects.equals(this.choices, question.choices) &&
        Objects.equals(this.idCat, question.idCat) &&
        Objects.equals(this.contentQuest, question.contentQuest) &&
        Objects.equals(this.typeQuest, question.typeQuest) &&
        Objects.equals(this.min, question.min) &&
        Objects.equals(this.max, question.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idQuest, choices, idCat, contentQuest, typeQuest, min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Question {\n");
    
    sb.append("    idQuest: ").append(toIndentedString(idQuest)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    idCat: ").append(toIndentedString(idCat)).append("\n");
    sb.append("    contentQuest: ").append(toIndentedString(contentQuest)).append("\n");
    sb.append("    typeQuest: ").append(toIndentedString(typeQuest)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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
