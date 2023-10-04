package ExerciseN3;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int numeroPezziDisponibiliMagazzino;


    public Articolo() {
    }


    public Articolo( String codiceArticolo,String descrizioneArticolo,double prezzo,int numeroPezziDisponibiliMagazzino){
        this.codiceArticolo=codiceArticolo;
        this.descrizioneArticolo=descrizioneArticolo;
        this.prezzo=prezzo;
        System.out.println("Codice articolo : " + this.codiceArticolo);
        System.out.println("descrizione : " + this.descrizioneArticolo);
        System.out.println("prezzo : " + this.prezzo);
        System.out.println("numero pezzi disponibili in magazzino : " + this.numeroPezziDisponibiliMagazzino);

    }


    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(String codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumeroPezziDisponibiliMagazzino() {
        return numeroPezziDisponibiliMagazzino;
    }

    public void setNumeroPezziDisponibiliMagazzino(int numeroPezziDisponibiliMagazzino) {
        this.numeroPezziDisponibiliMagazzino = numeroPezziDisponibiliMagazzino;
    }

}
