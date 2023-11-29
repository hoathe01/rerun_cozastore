package com.huynhthehoa.cozastore.entity;

 import jakarta.persistence.*;
 import lombok.Data;

 import java.util.Date;


@Data
@Entity(name = "orders" )
public class OrdersEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "idUser")
  private int idUser;
  
  @Column(name = "idStatus")
  private int idStatus;
  
  @Column(name = "createDate")
  private Date createDate;

}
