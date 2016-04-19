package com.example.selmi.myapplication.Model;

/**
 * Created by Selmi on 28/02/2016.
 */
public class Pdf {

    public Long id;
    public String nom;
    public String url;

    public Pdf(String nom, String url) {
        this.nom = nom;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
