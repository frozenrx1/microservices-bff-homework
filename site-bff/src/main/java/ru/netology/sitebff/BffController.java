package ru.netology.sitebff;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BffController {
  private final BffService bffService;

  public BffController(BffService bffService) {
    this.bffService = bffService;
  }

  @GetMapping("/api/site-bff/user/{userId}")
  public UserProfileResponse getUserProfile(@PathVariable Long userId) {
    return bffService.userProfileRequest(userId);
  }
}
