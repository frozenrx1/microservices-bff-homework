package ru.netology.orderservice;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping("/api/orders/by-user/{id}")
  public List<Order> getOrdersByUserId(@PathVariable Long id) {
    return orderService.getOrdersByUserId(id);
  }
}
