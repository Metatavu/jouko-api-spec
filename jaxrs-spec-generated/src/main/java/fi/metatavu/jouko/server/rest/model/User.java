package fi.metatavu.jouko.server.rest.model;

import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class User   {
  
  private @Valid Long id = null;
  private @Valid String username = null;
  private @Valid String firstname = null;
  private @Valid String lastnamename = null;
  private @Valid String email = null;
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
   * The usernamename of the user
   **/
  public User username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The usernamename of the user")
  @NotNull
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * The firstname of the user
   **/
  public User firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  
  @ApiModelProperty(value = "The firstname of the user")
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  /**
   * The lastnamename of the user
   **/
  public User lastnamename(String lastnamename) {
    this.lastnamename = lastnamename;
    return this;
  }

  
  @ApiModelProperty(value = "The lastnamename of the user")
  public String getLastnamename() {
    return lastnamename;
  }
  public void setLastnamename(String lastnamename) {
    this.lastnamename = lastnamename;
  }

  /**
   * The email of the user
   **/
  public User email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "The email of the user")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
        Objects.equals(username, user.username) &&
        Objects.equals(firstname, user.firstname) &&
        Objects.equals(lastnamename, user.lastnamename) &&
        Objects.equals(email, user.email) &&
        Objects.equals(keycloakId, user.keycloakId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstname, lastnamename, email, keycloakId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastnamename: ").append(toIndentedString(lastnamename)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

