package ExerciseN3;

import java.util.List;

public class Carrello {
    private Cliente clienteAssociato;
    private List<Articolo> elencoArticoli;
    private double totaleCostoArticoli;

    public Carrello() {
        // Default constructor
    }

    public Carrello ( Cliente clienteAssociato,List<Articolo>elencoArticoli,double totaleCostoArticoli){
        this.clienteAssociato=clienteAssociato;
        this.elencoArticoli=elencoArticoli;
        this.totaleCostoArticoli=totaleCostoArticoli;

        System.out.println("Cliente associato : " + this.clienteAssociato);
        System.out.println("elencoArticoli : " + this.elencoArticoli);
        System.out.println("totaleCostoArticoli : " + this.totaleCostoArticoli);
    }
    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public void setClienteAssociato(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
    }

    public List<Articolo> getElencoArticoli() {
        return elencoArticoli;
    }

    public void setElencoArticoli(List<Articolo> elencoArticoli) {
        this.elencoArticoli = elencoArticoli;
    }

    public double getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }

    public void setTotaleCostoArticoli(double totaleCostoArticoli) {
        this.totaleCostoArticoli = totaleCostoArticoli;
    }
}
