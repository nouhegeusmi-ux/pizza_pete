package com.pizzapete.pizza_pete.dto;

public class UpdateProfileRequest {

    private String prenom;
    private String nom;
    private String adresse;
    private String ville;
    private String etat;

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }

    public String getEtat() { return etat; }
    public void setEtat(String etat) { this.etat = etat; }
}