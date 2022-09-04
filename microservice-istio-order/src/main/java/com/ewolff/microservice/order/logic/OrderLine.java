package com.ewolff.microservice.order.logic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.ewolff.microservice.order.item.Item;

@Entity
public class OrderLine {

  @Column(name = "F_COUNT")
  private int count;

  @ManyToOne
  private Item item;

  @Id
  @GeneratedValue
  private long id;

  public OrderLine() {
  }

  public OrderLine(int count, Item item) {
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
    OrderLine other = (OrderLine) obj;
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
    return "OrderLine [count=" + count + ", item=" + item + ", id=" + id + "]";
  }


}
