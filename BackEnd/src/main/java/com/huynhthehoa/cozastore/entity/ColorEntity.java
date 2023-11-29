 package com.huynhthehoa.cozastore.entity;

 import jakarta.persistence.*;
 import lombok.Data;

 import java.util.Date;


@Data
@Entity(name = "color" )
public class ColorEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "createDate")
  private Date createDate;

}
