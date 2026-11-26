package com.pizzapete.pizza_pete.Service;

import com.pizzapete.pizza_pete.Entity.Role;
import com.pizzapete.pizza_pete.Entity.User;
import com.pizzapete.pizza_pete.dto.UpdateProfileRequest;
import com.pizzapete.pizza_pete.repository.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Utilisateur introuvable"));
    }

    @Transactional
    public User updateProfile(String email, UpdateProfileRequest request) {

        User user = getUserByEmail(email);

        user.setPrenom(request.getPrenom());
        user.setNom(request.getNom());
        user.setAdresse(request.getAdresse());
        user.setVille(request.getVille());
        user.setEtat(request.getEtat());

        return userRepository.save(user);
    }

    @Transactional
    public User updateRole(Long id, Role role) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur introuvable"));

        user.setRole(role);

        return userRepository.save(user);
    }
}