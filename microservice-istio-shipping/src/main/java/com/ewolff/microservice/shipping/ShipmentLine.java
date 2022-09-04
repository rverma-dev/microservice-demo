package com.ewolff.microservice.shipping;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ShipmentLine {

  @Column(name = "F_COUNT")
  private int count;

  @Embedded
  private Item item;

  @Id
  @GeneratedValue
  private long id;

  public ShipmentLine() {
  }

  public ShipmentLine(int count, Item item) {
    this.count = count;
    this.item = item;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + count;
    result = prime * result + (int) (id ^ (id >>> 32));
    result = prime * result + ((item == null) ? 0 : item.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    ShipmentLine other = (ShipmentLine) obj;
    if (count != other.count) {
      return false;
    }
    if (id != other.id) {
      return false;
    }
    if (item == null) {
      if (other.item != null) {
        return false;
      }
    } else if (!item.equals(other.item)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "ShipmentLine [count=" + count + ", item=" + item + ", id=" + id + "]";
  }

}
