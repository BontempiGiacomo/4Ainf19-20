import java.util.ArrayList;
import java.util.List;
/**
 * Created by inf.bontempig3107 on 23/11/2019.
 */
public class Frantoio {

    //List è un interfacia di ArrayListe<E>
    //ArrayListe<E> implementa List<E>
    private List<Oliva> listaOlive;

    public Frantoio(List<Oliva> listaOlive){
        this.listaOlive = new ArrayList<Oliva>();
    }
}
