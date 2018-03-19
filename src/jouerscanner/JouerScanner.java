
package jouerscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * 
 * @author Formation
 */
public class JouerScanner {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        try {
            
            List<Joueur> listeJoueurs = new ArrayList<Joueur>();
            Scanner sc = new Scanner(System.in);

            int choix;
            do {
            
                System.out.println("***************************************");
                System.out.println("*** 1 :     Créer un joueur de foot ***");
                System.out.println("*** 2 :    Créer un joueur de rugby ***");
                System.out.println("*** 3 : Créer un joueur de handball ***");
                System.out.println("*** 4 :            Voir les équipes ***");
                System.out.println("*** 5 :                     Quitter ***");
                System.out.println("***************************************");

                choix = sc.nextInt();
                switch(choix) {
                    case 1 : creerJoueur(listeJoueurs, new JoueurFoot());
                    break;
                    case 2 : creerJoueur(listeJoueurs, new JoueurRugby());
                    break;
                    case 3 : creerJoueur(listeJoueurs, new JoueurHand());
                    case 4 : afficherEquipes(listeJoueurs);
                    break;
                    case 5 : break;
                    default : System.out.println("Réessayez");
                    break;
                }
            } while (choix != 5);
            
                
        } catch(Exception e) {        
              System.out.println(e.getMessage());
        }
    }
    
    
    
    /**
     * 
     * @param listeJoueurs
     * @param oJ
     * @throws Exception 
     */
    public static void creerJoueur(List<Joueur> listeJoueurs, Joueur oJ) throws Exception {
        // renvoie l'exception (l'erreur) au main, et ce sera traité dans le catch

        Scanner sc = new Scanner(System.in);
        String temp; 

        System.out.println("Nom : ");
        temp = sc.next();
        if (!temp.equals("")) oJ.setNom(temp);

        System.out.println("Prénom : ");
        temp = sc.next();
        if (!temp.equals("")) oJ.setPrenom(temp);

        System.out.println("Age : ");            
        while(!sc.hasNextInt()) {
            System.out.println("Age (entrez une valeur numérique) : ");
            sc.next();
        }
        temp = sc.next();
        int age = Integer.parseInt(temp);             
        // if (age < 12) throw new Exception("Vous ne pouvez pas jouer si vous n'avez pas 12 ans.");
        if (!temp.equals("")) oJ.setAge(age);
        
        System.out.println("Pseudo : ");
        temp = sc.next();
        if (!temp.equals("")) oJ.setPseudo(temp);

        temp = "";
        do {
        System.out.println("Mot de passe : ");
        temp = sc.next();                   
        } while (temp.length() <= 2);                   
        oJ.setMdp(temp);
                       
        temp = "";
        do {
            System.out.println("Genre (M ou F) : ");
            temp = sc.next();
        }
        while(!temp.equalsIgnoreCase("F") && !temp.equalsIgnoreCase("M"));              
        oJ.setGenre(temp);

        if (age >= 12) listeJoueurs.add(oJ);
        else System.out.println("Vous ne pouvez pas jouer si vous n'avez pas 12 ans.");
    }
        
   /**
    * 
    * @param listeJoueurs 
    */
    public static void afficherEquipes(List<Joueur> listeJoueurs) {
        System.out.println("\n");
        System.out.println("********************************");
        System.out.println("*** Constitution des équipes ***");

        List<Joueur> listeJoueursFoot = new ArrayList<Joueur>();
        List<Joueur> listeJoueursRugby = new ArrayList<Joueur>();
        List<Joueur> listeJoueursHand = new ArrayList<Joueur>();

        for (Joueur oJ : listeJoueurs) {
            if (oJ instanceof JoueurFoot) listeJoueursFoot.add(oJ);
            if (oJ instanceof JoueurRugby) listeJoueursRugby.add(oJ);
            if (oJ instanceof JoueurHand) listeJoueursHand.add(oJ);
        }


        if (!listeJoueursFoot.isEmpty()) {
            System.out.println("**** Mon équipe de football ****");
            afficherContenuEquipe(listeJoueursFoot);
        }
        

        if (!listeJoueursRugby.isEmpty()) {
            System.out.println("****** Mon équipe de Rugby *****");
            afficherContenuEquipe(listeJoueursRugby);
        }
        

        if (!listeJoueursHand.isEmpty()) {
            System.out.println("**** Mon équipe de handball ****");
            afficherContenuEquipe(listeJoueursHand);
        }
        
        System.out.println("********************************");
        System.out.println("\n");
    }
    
    /**
     * 
     * @param listeJoueurs 
     */
    public static void afficherContenuEquipe(List<Joueur> listeJoueurs) {
        for (Joueur oJ : listeJoueurs) {
            if (!oJ.getNom().equals("")) System.out.print(oJ.getNom() + " ");
            if (!oJ.getPrenom().equals("")) System.out.print(oJ.getPrenom() + " ");
            if (oJ.getAge() != 0) System.out.print(oJ.getAge() + " "); // equals pour les String, pas pour les primitives
            if (!oJ.getGenre().equals("")) System.out.print(oJ.getGenre());
            System.out.println();
        }
    }

}
