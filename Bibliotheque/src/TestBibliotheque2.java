import java.util.Scanner;

public class TestBibliotheque2 {
    public static void main(String[] args){
        ListeMembre listeDesMembre = new ListeMembre();
        CatalogueBibliotheque catalogueDesDocs = new CatalogueBibliotheque();


        DocumentBibliotheque document1 = new DocumentBibliotheque("Book1", 2000, "Author1");
        catalogueDesDocs.addElement(document1);
        MembreBibliotheque membre1 = new MembreBibliotheque("Doe", "John", 30);
        listeDesMembre.addMembre(membre1);


        int menuOption;
        Scanner entry = new Scanner(System.in);
        do{
            System.out.println("============================================================================================================================");
            System.out.println(" Options du Menu \n");
            System.out.println("1. Afficher le catalogue des documents de la bibliotheque.");
            System.out.println("2. Afficher la liste des membres.");
            System.out.println("2. Connaître l’état d’un document ");
            System.out.println("3. Changer l’état d’un document par les opérations d’emprunt, de retour ou de remise sur les étagères ");
            System.out.println("4. Changer la reservation");
            System.out.println("5. Afficher le nombre de documents empruntés, sur la pile des retours ou dans la section spéciale réservations" );
            System.out.println("6. Afficher des informations sur les membres empruntant ou réservant un document s’ils existent");
            System.out.println("0. Fin du programme \n");
            System.out.print("Choisir une option en tappant son numero: ");
            menuOption = entry.nextInt();
            System.out.println("============================================================================================================================ \n");

            switch (menuOption){
                case 0:
                    System.out.println("============================================================================================================================");
                    System.out.println("Fin d'execution du programme.");
                    System.out.println("============================================================================================================================");
                    break;

                case 1:
                    System.out.println("============================================================================================================================");
                    catalogueDesDocs.getListElement();
                    System.out.println("============================================================================================================================ \n");
                    break;

                case 2:
                    System.out.println("============================================================================================================================");
                    listeDesMembre.getListMembre();
                    System.out.println("============================================================================================================================ \n");
                    break;


                default:
                    System.out.println("Choix non valide, veuillez recommencer la selection");
                    break;
            }

        }while (menuOption != 0 );
    }
}
