package it.itis.cuneo;

public class ContenitoreDiProgrammi {

    private Programma programma1;
    private Programma programma2;
    private Programma programma3;

    public void setProgramma1(Programma programma1){
        this.programma1 = new Programma(programma1);
    }

    public Programma getProgramma1() {
        return this.programma1;
    }

    public void setProgramma2(Programma programma2) {
        this.programma2 = new Programma(programma2);
    }

    public Programma getProgramma2() {
        return programma2;
    }

    public void setProgramma3(Programma programma3) {
        this.programma3 = new Programma(programma3);
    }

    public Programma getProgramma3() {
        return programma3;
    }


    public ContenitoreDiProgrammi(Programma programma1, Programma programma2, Programma programma3){
        setProgramma1(programma1);
        setProgramma2(programma2);
        setProgramma3(programma3);
    }

    public ContenitoreDiProgrammi(ContenitoreDiProgrammi contenitore){
        setProgramma1(contenitore.getProgramma1());
        setProgramma2(contenitore.getProgramma2());
        setProgramma3(contenitore.getProgramma3());
    }



    public static void main(String[] args) {
        Programma programma1 = new Programma("A", "M", "1.0.11", "5S", "2000");
        Programma programma2 = new Programma("B", "J", "1.2.47", "2124E", "2000");
        Programma programma3 = new Programma("A", "M", "1.0.11", "5S", "2000");

        ContenitoreDiProgrammi contenitoreDiProgrammi = new ContenitoreDiProgrammi(programma1, programma2, programma3);

        System.out.println(programma1.toString2(contenitoreDiProgrammi));

    }

}
