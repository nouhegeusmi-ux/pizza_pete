package com.pizzapete.pizza_pete.controller;

import com.pizzapete.pizza_pete.Entity.Role;
import com.pizzapete.pizza_pete.Entity.User;
import com.pizzapete.pizza_pete.dto.UpdateProfileRequest;
import com.pizzapete.pizza_pete.dto.UserResponse;
import com.pizzapete.pizza_pete.Service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public ResponseEntity<UserResponse> getMyProfile(
            Authentication authentication) {

        User user = userService.getUserByEmail(authentication.getName());

        return ResponseEntity.ok(new UserResponse(user));
    }

    @PutMapping("/me")
    public ResponseEntity<UserResponse> updateMyProfile(
            Authentication authentication,
            @RequestBody UpdateProfileRequest request) {

        User user = userService.updateProfile(
                authentication.getName(), request);

        return ResponseEntity.ok(new UserResponse(user));
    }

    @PutMapping("/{id}/role")
    @PreAuthorize("hasRole('ADMINISTRATEUR')")
    public ResponseEntity<UserResponse> updateRole(
            @PathVariable Long id,
            @RequestParam Role role) {

        User user = userService.updateRole(id, role);

        return ResponseEntity.ok(new UserResponse(user));
    }
}