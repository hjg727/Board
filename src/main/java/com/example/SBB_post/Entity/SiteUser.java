package com.example.SBB_post.Entity;

import com.example.SBB_post.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Getter @Setter
@Entity
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)//사용자가 입력한 아이디//이를 프라이머리키로 설정해야 더 이상적인 테이블이다.
    private String username;

    private String password;

    @Column(unique = true)
    private String email;


}
