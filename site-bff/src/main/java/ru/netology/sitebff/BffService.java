package ru.netology.sitebff;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class BffService {
  private final RestClient restClient = RestClient.create();

  public UserResponse userRequest(Long userId) {

    return restClient
        .get()
        .uri("http://localhost:8081/api/users/{id}", userId)
        .retrieve()
        .body(UserResponse.class);
  }

  public List<OrderResponse> orderRequest(Long userId) {

    return List.of(
        restClient
            .get()
            .uri("http://localhost:8082/api/orders/by-user/{id}", userId)
            .retrieve()
            .body(OrderResponse[].class));
  }

  public UserProfileResponse userProfileRequest(Long userId) {
    UserResponse user = userRequest(userId);
    List<OrderResponse> orders = orderRequest(userId);
    return new UserProfileResponse(user, orders);
  }
}
