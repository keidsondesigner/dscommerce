package com.keidsonroby.dscommerce.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK {
  //  OrderItemPK representa a chave primária [PK] composta da tabela OrderItem.

  @ManyToOne
  @JoinColumn(name = "order_id") //  chave estrangeira FK pedido id
  private Order order;


  @ManyToOne
  @JoinColumn(name = "product_id") // chave estrangeira FK produto id
  private Product product;


  public OrderItemPK() { }


  public OrderItemPK(Order order, Product product) {
    this.order = order;
    this.product = product;
  }


  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }


  public Product getProduct() {
    return product;
  }


  public void setProduct(Product product) {
    this.product = product;
  }
}
