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
 * Choice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-21T16:16:21.145Z[GMT]")
public class Choice   {
  @JsonProperty("id_choice")
  private Long idChoice = null;

  @JsonProperty("id_quest")
  private Long idQuest = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("rating")
  private Long rating = null;

  public Choice idChoice(Long idChoice) {
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

  public Choice idQuest(Long idQuest) {
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

  public Choice content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Choice rating(Long rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")

  public Long getRating() {
    return rating;
  }

  public void setRating(Long rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Choice choice = (Choice) o;
    return Objects.equals(this.idChoice, choice.idChoice) &&
        Objects.equals(this.idQuest, choice.idQuest) &&
        Objects.equals(this.content, choice.content) &&
        Objects.equals(this.rating, choice.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idChoice, idQuest, content, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Choice {\n");
    
    sb.append("    idChoice: ").append(toIndentedString(idChoice)).append("\n");
    sb.append("    idQuest: ").append(toIndentedString(idQuest)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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
