package com.RealState.Project.Entity;

import com.RealState.Project.Entity.Type.AuthProviderType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true)
    String username;

    String password;

    @Column(unique = true)
    @Email
    String email;

    @Enumerated(EnumType.STRING)
    private AuthProviderType providerType;
    String providerId;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return List.of();
    }

    
}
