import java.util.ArrayList;
public class ListeMembre {
    private final ArrayList<MembreBibliotheque> listeMembre;

    ListeMembre(){
        listeMembre = new ArrayList<MembreBibliotheque>();
    }

    public boolean addMembre(MembreBibliotheque newMembre){
        return listeMembre.add(newMembre);
    }

    public boolean removeMembre(MembreBibliotheque newMembre){
        return listeMembre.remove(newMembre);
    }

    public MembreBibliotheque accesMembre(int num){
        for (int i=0; listeMembre.size()>i; i++){
            if (listeMembre.get(i).getCode() == num){
                return listeMembre.get(i);
            }

        }
        return null;
    }

    public void getListMembre(){
        for (int i = 0; i < listeMembre.size(); i++){
            System.out.println(listeMembre.get(i).getName());
        }
    }
}
