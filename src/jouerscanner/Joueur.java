
package jouerscanner;


public class Joueur {
    
    private String nom;
    private String prenom;
    private int age;
    private String pseudo;
    private String mdp;
    private String genre;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Joueur(String nom, String prenom, int age, String pseudo, String mdp, String genre) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.pseudo = pseudo;
        this.mdp = mdp;
        this.genre = genre;
    }
    
    // Constructeur par défaut (que je peux appeler sans paramètres, parce qu'ils ne sont pas encore initialisés dans mon main)
    // JavaDoc :
    
    /**
     * Toutes les données des attributs 
     */
    public Joueur() {
        nom = "";
        prenom = "";
        age = 0;
        pseudo = "";
        mdp = "";
        genre = "";
    }
    
/* Rôle d'un constructeur : donne une initialisation, donne l'état initial par défaut de l'objet pour fonctionner.
getNom renverrait null s'il n'y avait pas de constructeur
Si mes données doivent avoir un comportement par défaut, ou non, c'est dans le constructeur que je dois le faire.
Le constructeur par défaut est celui qui n'a pas de paramètres.
Sinon object est le constructeur par défaut (mais il ne connaît pas nos paramètres)
Si je fais un getNom avant de faire un setNom, il aura la valeur null. Pour éviter d'avoir la valuer "null" (sinon sql ne prendrait pas) on initialise nos valeurs ici avec du vide "" (qui est différent de null)
    
    constante : final static
    static : toutes les classes peuvent l'utiliser sans l'instancier
    
*/
    
}
