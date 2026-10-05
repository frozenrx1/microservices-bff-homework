package ru.netology.orderservice;

import java.math.BigDecimal;
import java.util.List;

public class Order {
  private Long id;
  private Long userId;
  private BigDecimal amount;
  private String currency;
  private final List<String> items;

  public Order(Long id, Long userId, BigDecimal amount, String currency, List<String> items) {
    this.id = id;
    this.userId = userId;
    this.amount = amount;
    this.currency = currency;
    this.items = items;
  }

  public Long getId() {
    return id;
  }

  public Long getUserId() {
    return userId;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public String getCurrency() {
    return currency;
  }

  public List<String> getItems() {
    return items;
  }
}
