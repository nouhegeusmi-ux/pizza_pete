package com.pizzapete.pizza_pete.dto;

import com.pizzapete.pizza_pete.Entity.User;

public class UserResponse {

    private Long id;
    private String prenom;
    private String nom;
    private String email;
    private String adresse;
    private String ville;
    private String etat;
    private String role;

    public UserResponse(User user) {
        this.id = user.getId();
        this.prenom = user.getPrenom();
        this.nom = user.getNom();
        this.email = user.getEmail();
        this.adresse = user.getAdresse();
        this.ville = user.getVille();
        this.etat = user.getEtat();
        this.role = user.getRole().name();
    }

    public Long getId() { return id; }
    public String getPrenom() { return prenom; }
    public String getNom() { return nom; }
    public String getEmail() { return email; }
    public String getAdresse() { return adresse; }
    public String getVille() { return ville; }
    public String getEtat() { return etat; }
    public String getRole() { return role; }
}