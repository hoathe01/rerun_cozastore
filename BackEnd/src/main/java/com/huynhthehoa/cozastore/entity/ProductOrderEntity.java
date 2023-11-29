package com.huynhthehoa.cozastore.entity;

 import jakarta.persistence.Column;
 import jakarta.persistence.Entity;
 import lombok.Data;

 import java.util.Date;


@Data
//@Entity(name = "productorder" )
public class ProductOrderEntity {


  @Column(name = "idProduct")
  private int idProduct;

  @Column(name = "idOrder")
  private int idOrder;

  @Column(name = "quanity")
  private int quanity;

  @Column(name = "price")
  private double price;

  @Column(name = "createDate")
  private Date createDate;

}
