import java.util.Calendar;

/**
 * Created by inf.bontempig3107 on 23/11/2019.
 */
public class Oliva {
    private String codiceOliva;
    private ColoreOliva coloreOliva;
    private MaturazioneOliva maturazioneOliva;
    private Calendar dataScadenza;

    public Oliva() {
    }

    public Oliva(String codiceOliva, ColoreOliva coloreOliva, MaturazioneOliva maturazioneOliva, Calendar dataScadenza) {

        this.codiceOliva = codiceOliva;
        this.coloreOliva = coloreOliva;
        this.maturazioneOliva = maturazioneOliva;
        this.dataScadenza = dataScadenza;
    }

    public String getCodiceOliva() {
        return codiceOliva;
    }

    public void setCodiceOliva(String codiceOliva) {
        this.codiceOliva = codiceOliva;
    }

    public Calendar getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(Calendar dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public ColoreOliva getColoreOliva() {
        return coloreOliva;
    }

    public void setColoreOliva(ColoreOliva coloreOliva) {
        this.coloreOliva = coloreOliva;
    }

    public MaturazioneOliva getMaturazioneOliva() {
        return maturazioneOliva;
    }

    public void setMaturazioneOliva(MaturazioneOliva maturazioneOliva) {
        this.maturazioneOliva = maturazioneOliva;
    }

    @Override
    public String toString() {
        return "Oliva{" +
                "codiceOliva='" + codiceOliva + '\'' +
                ", coloreOliva=" + coloreOliva +
                ", maturazioneOliva=" + maturazioneOliva +
                ", dataScadenza=" + dataScadenza +
                '}';
    }
}
