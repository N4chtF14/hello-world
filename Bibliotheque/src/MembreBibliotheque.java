
public class MembreBibliotheque {

    private final String nom;
    private final String prenom;
    private final int age;
    private static int codeDeMembre;
    private int nombreEmprunt;

    MembreBibliotheque(){
        nom=null;
        prenom=null;
        age=0;
        codeDeMembre++;
        nombreEmprunt=0;
    }

    MembreBibliotheque(String newNom, String newPrenom, int newAge){
        nom=newNom;
        prenom=newPrenom;
        age=newAge;
        codeDeMembre++;
        nombreEmprunt=0;
    }

    public String toString(){
        return "Nom : " + nom + ", Prenom : " + prenom + ", Code de membre : " + codeDeMembre;
    }

    public int getCode(){
        return codeDeMembre;
    }

    public void setNbEmprunt(int ajout){
        nombreEmprunt = nombreEmprunt + ajout;
    }

    public String getName(){
        return nom + " " + prenom;
    }



}
