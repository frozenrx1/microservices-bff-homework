package ru.netology.userservice;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private final Map<Long, User> users =
      Map.of(
          1L,
          new User(1L, "Takumi Fujiwara", "Gunma", "+81-111", "takumi@yandex.ru"),
          2L,
          new User(2L, "Ryosuke Takahashi", "Gunma", "+81-222", "ryosuke@yandex.ru"));

  public User getUser(Long id) {
    return users.get(id);
  }
}
