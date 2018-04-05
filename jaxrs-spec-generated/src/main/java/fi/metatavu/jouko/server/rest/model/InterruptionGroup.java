package fi.metatavu.jouko.server.rest.model;

import java.time.OffsetDateTime;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class InterruptionGroup   {
  
  private @Valid Long id = null;
  private @Valid OffsetDateTime startTime = null;
  private @Valid OffsetDateTime endTime = null;

  /**
   * Interruption id
   **/
  public InterruptionGroup id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Interruption id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Start time of the interruption, inclusive
   **/
  public InterruptionGroup startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Start time of the interruption, inclusive")
  @NotNull
  public OffsetDateTime getStartTime() {
    return startTime;
  }
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * End time of the interruption, exclusive
   **/
  public InterruptionGroup endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "End time of the interruption, exclusive")
  @NotNull
  public OffsetDateTime getEndTime() {
    return endTime;
  }
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterruptionGroup interruptionGroup = (InterruptionGroup) o;
    return Objects.equals(id, interruptionGroup.id) &&
        Objects.equals(startTime, interruptionGroup.startTime) &&
        Objects.equals(endTime, interruptionGroup.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterruptionGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

