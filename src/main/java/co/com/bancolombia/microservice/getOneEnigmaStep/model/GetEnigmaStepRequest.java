package co.com.bancolombia.microservice.getOneEnigmaStep.model;

import java.util.Objects;
import co.com.bancolombia.microservice.getOneEnigmaStep.model.Header;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetEnigmaStepRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-15T16:02:12.290-05:00")

public class GetEnigmaStepRequest   {
  @JsonProperty("header")
  private Header header = null;

  @JsonProperty("step")
  private String step = null;

  public GetEnigmaStepRequest header(Header header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public GetEnigmaStepRequest step(String step) {
    this.step = step;
    return this;
  }

  /**
   * Get step
   * @return step
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEnigmaStepRequest getEnigmaStepRequest = (GetEnigmaStepRequest) o;
    return Objects.equals(this.header, getEnigmaStepRequest.header) &&
        Objects.equals(this.step, getEnigmaStepRequest.step);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, step);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEnigmaStepRequest {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
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

