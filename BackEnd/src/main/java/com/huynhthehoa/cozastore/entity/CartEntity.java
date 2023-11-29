 package com.huynhthehoa.cozastore.entity;
 import jakarta.persistence.*;
 import lombok.Data;
 import java.util.Date;


@Data
@Entity(name = "cart" )
public class CartEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "idProduct")
  private int idProduct;
  
  @Column(name = "quanity")
  private int quanity;
  
  @Column(name = "idUser")
  private int idUser;
  
  @Column(name = "createDate")
  private Date createDate;

}
