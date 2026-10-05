package ru.netology.sitebff;

public record UserResponse(
    Long id, String fullName, String deliveryAddress, String phone, String email) {}
