import java.util.*;

public class book {
    public list<string> paragrafe;
    public list<string> imagini;
    public list<string> tabele;

    public book() {
        paragrafe = new ArrayList<>();
        imagini = new ArrayList<>();
        tabele = new ArrayList<>();
    }

    public void createNewParagraf(String paragraf) {
        paragrafe.add(paragraf);
    }
    public void createNewimagine(String imagine){
        imagini.add(imagine);
    }
    public void createNewTabel(String tabel){
        tabele.add(tabel);
    }

    public void println(){
        System.out.println(paragrafe);
        System.out.println(imagini);
        System.out.println(tabele);
    }
}
