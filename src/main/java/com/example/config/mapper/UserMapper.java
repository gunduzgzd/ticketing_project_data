package com.example.config.mapper;


import com.example.dto.UserDTO;
import com.example.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private final ModelMapper modelMapper;


    public UserMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;

    }

    public User convertTiEntity(UserDTO dto) {
        return modelMapper.map(dto, User.class);
    }

    public UserDTO convertToDto(User entity) {

        return modelMapper.map(entity, UserDTO.class);
    }

}
