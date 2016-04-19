package com.example.selmi.myapplication.Model;

import java.util.List;

/**
 * Created by Selmi on 28/02/2016.
 */
public class Cours {

    public Long id;
    public String nom;
    public String description;
    public String image;
    public List<Pdf> pdfList;

    public Cours(String nom, String description, String image, List<Pdf> pdfList) {
        this.nom = nom;
        this.description = description;
        this.image = image;
        this.pdfList = pdfList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Pdf> getPdfList() {
        return pdfList;
    }

    public void setPdfList(List<Pdf> pdfList) {
        this.pdfList = pdfList;
    }
}
