package com.example.service;

import com.example.dto.UserDTO;
import com.example.entity.Role;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {



    List<UserDTO> listAllUsers();
    UserDTO findByUserName(String username);
    void save(UserDTO user);

 //   @Transactional
  //  void deleteByUserName(String username);

    UserDTO update(UserDTO user);

    void delete(String username);

    List<UserDTO> listAllByRole(String role);



}
