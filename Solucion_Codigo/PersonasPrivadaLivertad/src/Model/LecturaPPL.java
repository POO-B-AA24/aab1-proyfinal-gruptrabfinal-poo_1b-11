package Model;
import Controller.*;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
public class LecturaPPL {
    private String nameArch;
    private ObjectInputStream flujoEntradaPPL;
    private FileInputStream pathArch;
    private ArrayList<PersonaPrivadaLibertad> listPPL;
    private int nunPPL;
    public LecturaPPL(String nameArch) {
        this.nameArch = nameArch;
    }

    
    public ArrayList<PersonaPrivadaLibertad> leerObjetos() {
        
        listPPL = new ArrayList<PersonaPrivadaLibertad>();
        try  {
            pathArch=new FileInputStream(nameArch);
            flujoEntradaPPL =new ObjectInputStream(pathArch);
            listPPL = (ArrayList<PersonaPrivadaLibertad>) flujoEntradaPPL.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listPPL;
    }

    
}

    

