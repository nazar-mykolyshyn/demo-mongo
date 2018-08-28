package com.example.demomongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {

  @Id
  private String id;

  public Users() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
