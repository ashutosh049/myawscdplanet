package com.mydeveloperplanet.myawscdplanet.dto;

public class UserDto {

  private String firstName;
  private String lastName;

  public UserDto(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    UserDto userDto = (UserDto) o;

    if (!getFirstName().equals(userDto.getFirstName())) {
      return false;
    }
    return getLastName().equals(userDto.getLastName());
  }

  @Override
  public int hashCode() {
    int result = getFirstName().hashCode();
    result = 31 * result + getLastName().hashCode();
    return result;
  }
}
