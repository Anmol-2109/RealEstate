package com.RealState.Project.Service.Mappers;

import com.RealState.Project.DTO.UserRequestDTO;
import com.RealState.Project.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserRequestDTO toUserRequestDTO(User user);

    @Mapping(target = "id",ignore = true)
    User toUser(UserRequestDTO userRequestDTO);
}
