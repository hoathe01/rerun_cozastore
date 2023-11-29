package com.huynhthehoa.cozastore.entity;

 import jakarta.persistence.*;
 import lombok.Data;

 import java.util.Date;


@Data
@Entity(name = "comment" )
public class CommentEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "email")
  private String email;
  
  @Column(name = "content")
  private String content;
  
  @Column(name = "idBlog")
  private int idBlog;
  
  @Column(name = "createDate")
  private Date createDate;

}
