package ru.netology.sitebff;

import java.util.List;

public record UserProfileResponse(UserResponse user, List<OrderResponse> orders) {}
