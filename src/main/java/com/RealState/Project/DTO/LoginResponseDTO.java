package com.RealState.Project.DTO;

import com.RealState.Project.Entity.RefreshToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDTO {
    String jwt;
    String refresh;
    String username;
}
