package com.huynhthehoa.cozastore.entity;

 import jakarta.persistence.*;
 import lombok.Data;

 import java.util.Date;


@Data
@Entity(name = "user" )
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "username")
  private String username;
  
  @Column(name = "password")
  private String password;
  
  @Column(name = "email")
  private String email;
  
  @Column(name = "idRole")
  private int idRole;
  
  @Column(name = "createDate")
  private Date createDate;

}
