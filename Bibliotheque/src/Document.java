class DocumentBibliotheque {

    private String titre;
    private static int compteurCodeArchivage = 1;
    private final int codeArchivage;
    //private static AtomicInteger atomicInteger = new AtomicInteger(0);
    private String auteurPrincipal;
    private int anneePublication;
    private String position; //position possible etagere, pileRetour, pileReservation, emprunte
    private boolean estEmpruntee;
    private boolean estReservee;
    private MembreBibliotheque personneAyantEmpruntee;
    private MembreBibliotheque personneAyantReservee;


    DocumentBibliotheque(){
        titre = null;
        codeArchivage = compteurCodeArchivage++;
        anneePublication = 0;
        auteurPrincipal = null;
        position = "etagere";  //position possible etagere, pileRetour, pileReservation, emprunte
        estEmpruntee = false;
        estReservee = false;
        personneAyantEmpruntee = null;
        personneAyantReservee = null;
    }


    DocumentBibliotheque(String newTitre, int newAnneePublication, String newAuteur){
        titre = newTitre;
        codeArchivage = compteurCodeArchivage++;
        anneePublication = newAnneePublication;
        auteurPrincipal = newAuteur;
        position = "etagere";
        estReservee = false;
        personneAyantEmpruntee = null;
        personneAyantReservee = null;
    }

    public String toString(){
        return "Titre : " + titre + ", Auteur : " + auteurPrincipal + ", Code d'archivage : " + codeArchivage;
    }

    public String getTitre(){
        return titre;
    }

    public int getCodeArchivage(){
        return codeArchivage;
    }

    public int getAnneePublication(){
        return anneePublication;
    }

    public String getAuteur(){
        return auteurPrincipal;
    }

    public String getPosition(){
        return position;
    }

    public boolean getEstReserve(){
        return estReservee;
    }

    public boolean getEstEmprunte(){
        return estEmpruntee;
    }

    public void setTitre(String newTitre){
        titre = newTitre;
    }

    public void setPersonneAyantEmprunte(MembreBibliotheque newPAE){
        personneAyantEmpruntee = newPAE;
    }

    public void setAnneePublication(int newAnneePublication){
        anneePublication = newAnneePublication;
    }

    public void setAuteur(String newAuteur){
        auteurPrincipal = newAuteur;
    }

    public void setTitre(boolean newReservee){
        estReservee = newReservee;
    }

    public void setPosition(String newPos){
        position = newPos;
    }

    public String getPersonneAyantEmprunte(){
        return (personneAyantEmpruntee.toString());
    }

    public String getPersonneAyantReservee(){
        return (personneAyantReservee.toString());
    }

    public void rangeeLivre(){
        if (position.equals("pileRetour") == true) {
            if (estReservee == true){
                position = "pileReservation";
                personneAyantEmpruntee.setNbEmprunt(-1);
                personneAyantEmpruntee = null;
                System.out.println("Document mis dans la pile des reservations.");
            }
            else{
                position = "etagere";
                personneAyantEmpruntee = null;
                System.out.println("Document mis en etagere.");
            }
        }
        else{
            System.out.println("Document deja rangée ou empruntée.");
        }
    }


    public boolean reservation(MembreBibliotheque newReserv){
        if ( (estReservee==false) & (estEmpruntee==true)){
            position = "empruntee";
            personneAyantReservee = newReserv;
            return true;
        }
        else{
            return false;
        }
    }

    public void emprunt(MembreBibliotheque newEmprunteur){
        if (personneAyantReservee.equals(null) == true){
            position = "empruntee";
            personneAyantReservee = newEmprunteur;
            personneAyantReservee.setNbEmprunt(1);
            System.out.println("Emprunt enregistree.");
        }
        else{
            System.out.println("Emprunt impossible.");
        }
    }



    public void infoPersonneAyantEmprunte(){
        System.out.println("La personne ayant emprunte " + titre + " se nomme " + personneAyantEmpruntee.toString() + ", son code de membre est " + personneAyantEmpruntee.getCode() + ".");
    }

    public void infoPersonneAyantReserve(){
        System.out.println("La personne ayant reserve " + titre + " se nomme " + personneAyantReservee.toString() + ", son code de membre est " + personneAyantReservee.getCode() + ".");
    }
    //faire accesseur et mutateur pour les membre quand membrebiblio cree
}
