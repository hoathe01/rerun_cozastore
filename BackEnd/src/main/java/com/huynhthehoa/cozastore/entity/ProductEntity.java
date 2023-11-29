package com.huynhthehoa.cozastore.entity;

 import jakarta.persistence.*;
 import lombok.Data;

 import java.util.Date;


@Data
@Entity(name = "product" )
public class ProductEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "image")
  private String image;
  
  @Column(name = "price")
  private double price;
  
  @Column(name = "description")
  private String description;
  
  @Column(name = "quanity")
  private int quanity;
  
  @Column(name = "idCategory")
  private int idCategory;
  
  @Column(name = "idSize")
  private int idSize;
  
  @Column(name = "idColor")
  private int idColor;
  
  @Column(name = "createDate")
  private Date createDate;

}
