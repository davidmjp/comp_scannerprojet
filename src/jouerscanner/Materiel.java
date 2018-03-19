/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jouerscanner;

/**
 *
 * @author Formation
 */
public class Materiel implements Ressource {
    
    private String nomDuMateriel;

    public Materiel(String nomDuMateriel) {
        this.nomDuMateriel = nomDuMateriel;
    }

    public String getNomDuMateriel() {
        return nomDuMateriel;
    }
    
    

    
}
