package ExerciseN2;

import java.util.Arrays;

public class Sim {

    private Long numeroDiTelefono;
    private int creditoDisponibile;
    private Object[] listaUltime5Chiamate = new Object[5];

    @Override
    public String toString() {
        return "Sim [Numero di Telefono=" + numeroDiTelefono + ", Credito Disponibile=" + creditoDisponibile + "]";
    }

    public Sim(){
        listaUltime5Chiamate[0] = new Chiamata(10 , 1234567890L);
        listaUltime5Chiamate[1] = new Chiamata(30 , 9876543210L);
        listaUltime5Chiamate[2] = new Chiamata(45 , 5555555555L);
        listaUltime5Chiamate[3] = new Chiamata(15, 8888888888L);
        listaUltime5Chiamate[4] = new Chiamata(5, 7777777777L);
        numeroDiTelefono=3333333333L;
        creditoDisponibile=56;
        System.out.println(this.getNumeroDiTelefono());
        System.out.println(this.getcreditoDisponibile());
        System.out.println(Arrays.toString(this.getListaUltime5Chiamate()));
    }

    public Sim(Long numeroDiTelefono){
        this.numeroDiTelefono=numeroDiTelefono;
        this.creditoDisponibile=0;
        this.listaUltime5Chiamate=null;
    }


    public Long getNumeroDiTelefono() {
        return this.numeroDiTelefono;
    }

    public Long setNumeroDiTelefono(Long numeroDiTelefono) {
        return this.numeroDiTelefono=numeroDiTelefono;
    }


    public int getcreditoDisponibile() {
        return creditoDisponibile;
    }

    public int setcreditoDisponibile(int creditoDisponibile){
        return this.creditoDisponibile=creditoDisponibile;
    }

    public Object[] getListaUltime5Chiamate() {return this.listaUltime5Chiamate;
    }
    public Object[] setListaUltime5Chiamate(Object[] listaUltime5Chiamate) {return this.listaUltime5Chiamate = listaUltime5Chiamate;
    }

}
