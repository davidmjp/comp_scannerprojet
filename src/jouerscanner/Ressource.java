/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jouerscanner;

import java.awt.Color;

/**
 *
 * @author Formation
 */
public interface Ressource {
    
    public String getJeux();
    public void setJeux(String jeux);
    public Color getCouleur();
    
}

/* une interface peut hériter d'une interface
une class impléments (= utiliser / "lier" (donc redéclarer les méthodes de l'interface)) une interface
une interface est toujours public, elle peut manipuler des données privées d'une class,  (méthodes?)


*/