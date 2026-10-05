package ru.netology.orderservice;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private final List<Order> orders =
      List.of(
          new Order(
              1L,
              1L,
              new BigDecimal("14000"),
              "USD",
              List.of("USB 3.0 Cable", "PlayStation 5", "DualSense Controller")),
          new Order(
              2L,
              1L,
              new BigDecimal("6700"),
              "USD",
              List.of("Gran Turismo 7", "Logitech G923 Wheel")),
          new Order(3L, 2L, new BigDecimal("12000"), "RUB", List.of("Macbook Neo")));

  public List<Order> getOrdersByUserId(Long userId) {
    return orders.stream().filter(order -> order.getUserId().equals(userId)).toList();
  }
}
