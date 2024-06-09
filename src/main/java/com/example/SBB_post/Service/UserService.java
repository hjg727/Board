package com.example.SBB_post.Service;


import com.example.SBB_post.DataNotFoundException;
import com.example.SBB_post.Entity.SiteUser;
import com.example.SBB_post.Repository.UserRepository;
import com.example.SBB_post.UserRole;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String email, String password) {
        SiteUser user = new SiteUser();
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        user.setUsername(username);
        return this.userRepository.save(user);
    }

    public SiteUser getUser(String username) {
        return this.userRepository.findByUsername(username)
                .orElseThrow(() -> new DataNotFoundException("siteuser not found"));
    }
}
