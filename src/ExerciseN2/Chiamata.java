package ExerciseN2;

public class Chiamata {
    private int minuti;
    private Long numeroChiamato;

    public Chiamata(int minuti, Long numeroChiamato) {
        this.minuti =minuti;
        this.numeroChiamato = numeroChiamato;
    }


    @Override
    public String toString() {
        return "Chiamata [Durata=" + minuti + " min, Numero Chiamato=" + numeroChiamato + "]";
    }

}
