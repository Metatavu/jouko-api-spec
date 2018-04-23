package fi.metatavu.jouko.server.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class User   {
  
  private @Valid Long id = null;
  private @Valid String name = null;
  private @Valid UUID keycloakId = null;

  /**
   * User id
   **/
  public User id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The name of the user
   **/
  public User name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the user")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The keycloak id of the user
   **/
  public User keycloakId(UUID keycloakId) {
    this.keycloakId = keycloakId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The keycloak id of the user")
  @NotNull
  public UUID getKeycloakId() {
    return keycloakId;
  }
  public void setKeycloakId(UUID keycloakId) {
    this.keycloakId = keycloakId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(id, user.id) &&
        Objects.equals(name, user.name) &&
        Objects.equals(keycloakId, user.keycloakId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, keycloakId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    keycloakId: ").append(toIndentedString(keycloakId)).append("\n");
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

