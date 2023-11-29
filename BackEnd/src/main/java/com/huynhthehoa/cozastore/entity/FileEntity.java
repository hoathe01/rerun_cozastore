package com.huynhthehoa.cozastore.entity;

 import jakarta.persistence.*;
 import lombok.Data;


@Data
@Entity(name = "file" )
public class FileEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "type")
  private String type;
  
  @Column(name = "data")
  private String data;

}
