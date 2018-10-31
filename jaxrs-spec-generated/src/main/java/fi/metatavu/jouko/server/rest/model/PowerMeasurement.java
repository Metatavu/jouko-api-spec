package fi.metatavu.jouko.server.rest.model;

import java.time.OffsetDateTime;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class PowerMeasurement   {
  
  private @Valid Long id = null;
  private @Valid OffsetDateTime startTime = null;
  private @Valid OffsetDateTime endTime = null;

public enum MeasurementTypeEnum {

    AVERAGE(String.valueOf("AVERAGE"));


    private String value;

    MeasurementTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MeasurementTypeEnum fromValue(String v) {
        for (MeasurementTypeEnum b : MeasurementTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private @Valid MeasurementTypeEnum measurementType = null;
  private @Valid Double measurementValue = null;
  private @Valid Long deviceId = null;
  private @Valid Long phaseNumber = null;

  /**
   * Measurement id
   **/
  public PowerMeasurement id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Measurement id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Start time of the measurement
   **/
  public PowerMeasurement startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(value = "Start time of the measurement")
  public OffsetDateTime getStartTime() {
    return startTime;
  }
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * End time of the measurement
   **/
  public PowerMeasurement endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(value = "End time of the measurement")
  public OffsetDateTime getEndTime() {
    return endTime;
  }
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  /**
   * Type of measurement
   **/
  public PowerMeasurement measurementType(MeasurementTypeEnum measurementType) {
    this.measurementType = measurementType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of measurement")
  public MeasurementTypeEnum getMeasurementType() {
    return measurementType;
  }
  public void setMeasurementType(MeasurementTypeEnum measurementType) {
    this.measurementType = measurementType;
  }

  /**
   **/
  public PowerMeasurement measurementValue(Double measurementValue) {
    this.measurementValue = measurementValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public Double getMeasurementValue() {
    return measurementValue;
  }
  public void setMeasurementValue(Double measurementValue) {
    this.measurementValue = measurementValue;
  }

  /**
   * Device id
   **/
  public PowerMeasurement deviceId(Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  
  @ApiModelProperty(value = "Device id")
  public Long getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(Long deviceId) {
    this.deviceId = deviceId;
  }

  /**
   * Phasenumber
   **/
  public PowerMeasurement phaseNumber(Long phaseNumber) {
    this.phaseNumber = phaseNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Phasenumber")
  public Long getPhaseNumber() {
    return phaseNumber;
  }
  public void setPhaseNumber(Long phaseNumber) {
    this.phaseNumber = phaseNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerMeasurement powerMeasurement = (PowerMeasurement) o;
    return Objects.equals(id, powerMeasurement.id) &&
        Objects.equals(startTime, powerMeasurement.startTime) &&
        Objects.equals(endTime, powerMeasurement.endTime) &&
        Objects.equals(measurementType, powerMeasurement.measurementType) &&
        Objects.equals(measurementValue, powerMeasurement.measurementValue) &&
        Objects.equals(deviceId, powerMeasurement.deviceId) &&
        Objects.equals(phaseNumber, powerMeasurement.phaseNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTime, endTime, measurementType, measurementValue, deviceId, phaseNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerMeasurement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    measurementType: ").append(toIndentedString(measurementType)).append("\n");
    sb.append("    measurementValue: ").append(toIndentedString(measurementValue)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    phaseNumber: ").append(toIndentedString(phaseNumber)).append("\n");
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

