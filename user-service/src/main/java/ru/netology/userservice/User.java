package ru.netology.userservice;

public class User {
  private Long id;
  private String fullName;
  private String deliveryAddress;
  private String phone;
  private String email;

  public User(Long id, String fullName, String deliveryAddress, String phone, String email) {
    this.id = id;
    this.fullName = fullName;
    this.deliveryAddress = deliveryAddress;
    this.phone = phone;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public String getFullName() {
    return fullName;
  }

  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }
}
