package Model;
import Controller.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class EscrituraPPL {
    private String nameArch;
    private ObjectOutputStream flujoSalida;
    private FileOutputStream path;
    private ArrayList<PersonaPrivadaLibertad> listPPL;
    private int idxPPL;
    public EscrituraPPL(String namepath, ArrayList<PersonaPrivadaLibertad> PPL) {
        this.nameArch = namepath;
        this.listPPL = PPL;
    }

    public void escribirListPPL() {  
        try {
            path=new FileOutputStream(nameArch);
            flujoSalida = new ObjectOutputStream(path);
            flujoSalida.writeObject(listPPL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setIdx (int idx){
        this.idxPPL=idx;
    }
    public void eliminarPPL() {
        listPPL.remove(idxPPL);
        try {
            path=new FileOutputStream(nameArch);
            flujoSalida = new ObjectOutputStream(path);
            flujoSalida.writeObject(listPPL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

