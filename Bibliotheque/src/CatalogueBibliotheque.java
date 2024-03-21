import java.util.ArrayList;


public class CatalogueBibliotheque {
    private final ArrayList<DocumentBibliotheque> listDocument;

    CatalogueBibliotheque(){
        listDocument = new ArrayList<DocumentBibliotheque>();
    }

    public void getListElement(){
        for (int i = 0; i < listDocument.size(); i++){
            System.out.println(listDocument.get(i).getTitre());
        }
    }



    public boolean addElement(DocumentBibliotheque newDoc){
        return listDocument.add(newDoc);
    }

    public boolean removeElement(DocumentBibliotheque doc){
        return listDocument.remove(doc);
    }


    public DocumentBibliotheque accesDoc(int i) {
        return listDocument.get(i);
    }


    public void afficheDocsEmpruntes(){
        for (int i=0; listDocument.size()>i; i++){
            if (listDocument.get(i).getEstEmprunte() == true){
                System.out.println(listDocument.get(i));
            }
        }
    }

    public void afficheTousLesDocs(){
        for (int i=0; listDocument.size()>i; i++){
            System.out.println(listDocument.get(i));
        }
    }

    public String etatEmprunt(int code){
        int i = 0;
        while (i<listDocument.size()){
            if (listDocument.get(i).getCodeArchivage() == code){
                if (listDocument.get(i).getEstEmprunte() == true){
                    return "Le document est emprunté";
                }
                else{
                    return "Le document est pas emprunté";
                }
            }

        }
        return "Le document existe pas";
    }
}
