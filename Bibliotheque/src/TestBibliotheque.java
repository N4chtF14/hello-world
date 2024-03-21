import java.util.Scanner;

public class TestBibliotheque {
    public static void main(String[] args){
        MembreBibliotheque membre1 = new MembreBibliotheque("Doe", "John", 30);
        MembreBibliotheque membre2 = new MembreBibliotheque("Smith", "Alice", 25);
        MembreBibliotheque membre3 = new MembreBibliotheque("Brown", "Bob", 40);
        MembreBibliotheque membre8 = new MembreBibliotheque("Doe", "John", 30);
        MembreBibliotheque membre9 = new MembreBibliotheque("Smith", "Alice", 25);
        MembreBibliotheque membre10 = new MembreBibliotheque("Brown", "Bob", 40);
        MembreBibliotheque membre4 = new MembreBibliotheque("Garcia", "Maria", 35);
        MembreBibliotheque membre5 = new MembreBibliotheque("Kim", "Jae", 22);
        MembreBibliotheque membre6 = new MembreBibliotheque("Li", "Wei", 28);
        MembreBibliotheque membre7 = new MembreBibliotheque("Patel", "Priya", 32);
        ListeMembre listeDesMembre = new ListeMembre();
        listeDesMembre.addMembre(membre1);
        listeDesMembre.addMembre(membre2);
        listeDesMembre.addMembre(membre3);
        listeDesMembre.addMembre(membre4);
        listeDesMembre.addMembre(membre5);
        listeDesMembre.addMembre(membre6);
        listeDesMembre.addMembre(membre7);
        listeDesMembre.addMembre(membre8);
        listeDesMembre.addMembre(membre9);
        listeDesMembre.addMembre(membre10);

        DocumentBibliotheque document1 = new DocumentBibliotheque("Book1", 2000, "Author1");
        DocumentBibliotheque document2 = new DocumentBibliotheque("Book2", 2010, "Author2");
        DocumentBibliotheque document3 = new DocumentBibliotheque("Book3", 1995, "Author3");
        DocumentBibliotheque document4 = new DocumentBibliotheque("Book4", 2021, "Author4");
        DocumentBibliotheque document5 = new DocumentBibliotheque("Book5", 1987, "Author5");
        DocumentBibliotheque document6 = new DocumentBibliotheque("Book6", 2005, "Author6");
        DocumentBibliotheque document7 = new DocumentBibliotheque("Book7", 2015, "Author7");
        DocumentBibliotheque document8 = new DocumentBibliotheque("Book8", 1999, "Author8");
        DocumentBibliotheque document9 = new DocumentBibliotheque("Book9", 2018, "Author9");
        DocumentBibliotheque document10 = new DocumentBibliotheque("Book10", 2008, "Author10");
        CatalogueBibliotheque catalogueDesDocs = new CatalogueBibliotheque();
        catalogueDesDocs.addElement(document1);
        catalogueDesDocs.addElement(document2);
        catalogueDesDocs.addElement(document3);
        catalogueDesDocs.addElement(document4);
        catalogueDesDocs.addElement(document5);
        catalogueDesDocs.addElement(document6);
        catalogueDesDocs.addElement(document7);
        catalogueDesDocs.addElement(document8);
        catalogueDesDocs.addElement(document9);
        catalogueDesDocs.addElement(document10);
        int arretBoucle;
        Scanner entry = new Scanner(System.in);
        int menuOption;
        do{
            System.out.println("============================================================================================================================");
            System.out.println("\n Options du Menu");
            System.out.println("1. Afficher la liste des documents de la bibliotheque");
            System.out.println("2. Connaître l’état d’un document ");
            System.out.println("3. Changer l’état d’un document par les opérations d’emprunt, de retour ou de remise sur les étagères ");
            System.out.println("4. Changer la reservation");
            System.out.println("5. Afficher le nombre de documents empruntés, sur la pile des retours ou dans la section spéciale réservations" );
            System.out.println("6. Afficher des informations sur les membres empruntant ou réservant un document s’ils existent");
            System.out.println("0. Fin du programme");
            System.out.println("Choisir une option en tappant son numero: ");
            System.out.println("============================================================================================================================");
            menuOption = entry.nextInt();
            arretBoucle=menuOption;

            switch(menuOption){

                case 0:
                    System.out.println("============================================================================================================================");
                    System.out.println(" ");
                    System.out.println("Fin du programme");
                    System.out.println("============================================================================================================================");
                    break;
                case 1:
                    System.out.println("============================================================================================================================");
                    catalogueDesDocs.getListElement();
                    System.out.println("============================================================================================================================");
                    System.out.println(" ");
                    break;


                case 2:
                    System.out.println("============================================================================================================================");
                    System.out.println("Choisir le document ou vous voulez connaitre l'état:");
                    catalogueDesDocs.getListElement();
                    System.out.println("tappez le numero du document pour le selectionner");

                    menuOption = entry.nextInt();
                    System.out.println(catalogueDesDocs.etatEmprunt(menuOption));
                    System.out.println(" ");
                    System.out.println("============================================================================================================================");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Choisir le document ou vous voulez changer l'état:");
                    System.out.println("tappez le numero du document pour le selectionner");
                    System.out.println("1. Document1");
                    System.out.println("2. Document2");
                    System.out.println("3. Document3");
                    System.out.println("4. Document4");
                    System.out.println("5. Document5");
                    System.out.println("6. Document6");
                    System.out.println("7. Document7");
                    System.out.println("8. Document8");
                    System.out.println("9. Document9");
                    System.out.println("10. Document11");
                    menuOption = entry.nextInt();


                    switch(menuOption){

                        case 1:
                            System.out.println("Changer la position par 1.etager, 2.pile retour, 3.pile reservation, 4.emprunté");
                            menuOption = entry.nextInt();
                            switch(menuOption){
                                case 1:
                                    document1.setPosition("etagere");
                                    break;
                                case 2:
                                    document1.setPosition("pileRetour");
                                    break;
                                case 3:
                                    document1.setPosition("pileReservation");
                                    break;
                                case 4:
                                    document1.setPosition("emprunte");
                                    document1.setPersonneAyantEmprunte(membre1);
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Changer la position par 1.etager, 2.pile retour, 3.pile reservation, 4.emprunté");
                            menuOption = entry.nextInt();
                            switch(menuOption){
                                case 1:
                                    document2.setPosition("etagere");
                                    break;
                                case 2:
                                    document2.setPosition("pileRetour");
                                    break;
                                case 3:
                                    document2.setPosition("pileReservation");
                                    break;
                                case 4:
                                    document2.setPosition("emprunte");
                                    document2.setPersonneAyantEmprunte(membre1);
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Changer la position par 1.etager, 2.pile retour, 3.pile reservation, 4.emprunté");
                            menuOption = entry.nextInt();
                            switch(menuOption){
                                case 1:
                                    document3.setPosition("etagere");
                                    break;
                                case 2:
                                    document3.setPosition("pileRetour");
                                    break;
                                case 3:
                                    document3.setPosition("pileReservation");
                                    break;
                                case 4:
                                    document3.setPosition("emprunte");
                                    document3.setPersonneAyantEmprunte(membre1);
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("Changer la position par 1.etager, 2.pile retour, 3.pile reservation, 4.emprunté");
                            menuOption = entry.nextInt();
                            switch(menuOption){
                                case 1:
                                    document4.setPosition("etagere");
                                    break;
                                case 2:
                                    document4.setPosition("pileRetour");
                                    break;
                                case 3:
                                    document4.setPosition("pileReservation");
                                    break;
                                case 4:
                                    document4.setPosition("emprunte");
                                    document4.setPersonneAyantEmprunte(membre1);
                                    break;
                            }
                            break;
                        case 5:
                            System.out.println("Changer la position par 1.etager, 2.pile retour, 3.pile reservation, 4.emprunté");
                            menuOption = entry.nextInt();
                            switch(menuOption){
                                case 1:
                                    document5.setPosition("etagere");
                                    break;
                                case 2:
                                    document5.setPosition("pileRetour");
                                    break;
                                case 3:
                                    document5.setPosition("pileReservation");
                                    break;
                                case 4:
                                    document5.setPosition("emprunte");
                                    document5.setPersonneAyantEmprunte(membre1);
                                    break;
                            }
                            break;
                        case 6:
                            System.out.println("Changer la position par 1.etager, 2.pile retour, 3.pile reservation, 4.emprunté");
                            menuOption = entry.nextInt();
                            switch(menuOption){
                                case 1:
                                    document6.setPosition("etagere");
                                    break;
                                case 2:
                                    document6.setPosition("pileRetour");
                                    break;
                                case 3:
                                    document6.setPosition("pileReservation");
                                    break;
                                case 4:
                                    document6.setPosition("emprunte");
                                    document6.setPersonneAyantEmprunte(membre1);
                                    break;
                            }
                            break;
                        case 7:
                            System.out.println("Changer la position par 1.etager, 2.pile retour, 3.pile reservation, 4.emprunté");
                            menuOption = entry.nextInt();
                            switch(menuOption){
                                case 1:
                                    document7.setPosition("etagere");
                                    break;
                                case 2:
                                    document7.setPosition("pileRetour");
                                    break;
                                case 3:
                                    document7.setPosition("pileReservation");
                                    break;
                                case 4:
                                    document7.setPosition("emprunte");
                                    document7.setPersonneAyantEmprunte(membre1);
                                    break;
                            }
                            break;
                        case 8:
                            System.out.println("Changer la position par 1.etager, 2.pile retour, 3.pile reservation, 4.emprunté");
                            menuOption = entry.nextInt();
                            switch(menuOption){
                                case 1:
                                    document8.setPosition("etagere");
                                    break;
                                case 2:
                                    document8.setPosition("pileRetour");
                                    break;
                                case 3:
                                    document8.setPosition("pileReservation");
                                    break;
                                case 4:
                                    document8.setPosition("emprunte");
                                    document8.setPersonneAyantEmprunte(membre1);
                                    break;
                            }
                            break;
                        case 9:
                            System.out.println("Changer la position par 1.etager, 2.pile retour, 3.pile reservation, 4.emprunté");
                            menuOption = entry.nextInt();
                            switch(menuOption){
                                case 1:
                                    document9.setPosition("etagere");
                                    break;
                                case 2:
                                    document9.setPosition("pileRetour");
                                    break;
                                case 3:
                                    document9.setPosition("pileReservation");
                                    break;
                                case 4:
                                    document9.setPosition("emprunte");
                                    document9.setPersonneAyantEmprunte(membre1);
                                    break;
                            }
                            break;
                        case 10:
                            System.out.println("Changer la position par 1.etager, 2.pile retour, 3.pile reservation, 4.emprunté");
                            menuOption = entry.nextInt();
                            switch(menuOption){
                                case 1:
                                    document10.setPosition("etagere");
                                    break;
                                case 2:
                                    document10.setPosition("pileRetour");
                                    break;
                                case 3:
                                    document10.setPosition("pileReservation");
                                    break;
                                case 4:
                                    document10.setPosition("emprunte");
                                    document10.setPersonneAyantEmprunte(membre1);
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Le document n'existe pas.");
                            break;
                    }
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("reservation changer");
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println("reservation changer");
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println(" ");
                    System.out.println("reservation changer");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Choix incorrect");
                    System.out.println(" ");
                    break;
            }
        }while (arretBoucle != 0);
    }
}


