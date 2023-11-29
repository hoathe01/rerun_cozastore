 package com.huynhthehoa.cozastore.entity;
 import jakarta.persistence.*;
 import lombok.Data;
 import java.util.Date;


@Data
@Entity(name = "blog" )
public class BlogEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "title")
  private String title;
  
  @Column(name = "image")
  private String image;
  
  @Column(name = "content")
  private String content;
  
  @Column(name = "idUser")
  private int idUser;
  
  @Column(name = "createDate")
  private Date createDate;

}
