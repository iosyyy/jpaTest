package com.demo.enter;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * @author 靖鸿宣
 * @since 2021/8/6
 */
@Entity
@Getter
@Setter
public class ManyToEntirty {
  @Id
  @GeneratedValue
  private Long id;

  @ManyToMany
  @JoinTable(name = "MANY_TO_ENTIRTY_ENTIRTY",
             joinColumns = @JoinColumn(name = "MANY_TO_ENTIRTY_id"),
             inverseJoinColumns = @JoinColumn(name = "ENTIRTY_id"))
  private List<Entirty> entirties;

  @Override
  public boolean equals(Object o) {
    if (this == o) { return true; }
    if (o == null || getClass() != o.getClass()) { return false; }
    ManyToEntirty that = (ManyToEntirty) o;
    return Objects.equals(id, that.id) && Objects.equals(entirties, that.entirties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entirties);
  }
}
