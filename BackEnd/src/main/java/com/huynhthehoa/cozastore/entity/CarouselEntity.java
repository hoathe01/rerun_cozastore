 package com.huynhthehoa.cozastore.entity;
 import jakarta.persistence.*;
 import lombok.Data;
 import java.util.Date;


@Data
@Entity(name = "carousel" )
public class CarouselEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "title")
  private String title;
  
  @Column(name = "image")
  private String image;
  
  @Column(name = "content")
  private String content;
  
  @Column(name = "idCategory")
  private int idCategory;
  
  @Column(name = "createDate")
  private Date createDate;

}
