package com.sample;


public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}
