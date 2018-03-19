/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jouerscanner;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Formation
 */
public class Equipe implements Ressource {
    
    
    private String nom;
    private String jeux;
    private List<Joueur> listeJoueurs = new ArrayList<Joueur>();
 
    
    
    public Equipe(String nom, List<Joueur> listeJoueurs) { // Constructeur
        this.nom = nom;
        this.listeJoueurs = listeJoueurs;
    }

        
    public String getNom() {
        return nom;
    }
    
    public List<Joueur> getListeJoueurs() {
        return listeJoueurs;
    }
    
    @Override
    public String getJeux() {
        return jeux;
    }

    @Override
    public void setJeux(String jeux) {
        this.jeux = jeux;
    }

    @Override
    public Color getCouleur() {
        return Color.RED;
    }
    
    // une interface, une classe, un enum sont des types, mais le new ne se fait que pour les class.
    
}
