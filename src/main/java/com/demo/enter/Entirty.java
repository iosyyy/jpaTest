package com.demo.enter;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author 靖鸿宣
 * @since 2021/8/5
 */
@Entity
@Getter
@Setter
public class Entirty {

  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = false, unique = true)
  private String userName;

  @Column(nullable = false)
  private String passWord;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(unique = true)
  private String nickName;

  @Column(nullable = false)
  private String regTime;



  public Entirty(String userName, String passWord, String email, String nickName, String regTime) {
    this.userName = userName;
    this.passWord = passWord;
    this.email = email;
    this.nickName = nickName;
    this.regTime = regTime;
  }

  public Entirty() {
  }


  // getter and setter

  @Override
  public String toString() {
    return getClass().getSimpleName() + "(" +
            "id = " + id + ", " +
            "userName = " + userName + ", " +
            "passWord = " + passWord + ", " +
            "email = " + email + ", " +
            "nickName = " + nickName + ", " +
            "regTime = " + regTime + ")";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) { return true; }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) { return false; }
    Entirty entirty = (Entirty) o;

    return Objects.equals(id, entirty.id);
  }

  @Override
  public int hashCode() {
    return 777690823;
  }
}