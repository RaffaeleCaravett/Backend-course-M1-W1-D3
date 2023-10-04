package Rettangoli;

import java.util.Random;

public class Rettangolo {
        Random random = new Random();
        private int id=random.nextInt(1000);
        private int altezza;
        private int larghezza;
        private String figure="Rectangles";
        public  Rettangolo(int altezza,int larghezza) {
if(altezza>0 && larghezza>0){

  this.altezza=altezza;
  this.larghezza=larghezza;

}else{
    System.out.println( "Inserisci dei valori maggiori del numero 0");
}
        }

    public Rettangolo(Rettangolo rettangolo1,Rettangolo rettangolo2){
        System.out.println(stampaDueRettangoli(rettangolo1,rettangolo2));
        System.out.println(rettangolo1.altezza);}













    public int calculateArea (int altezza,int larghezza){
        if(altezza>0&&larghezza>0){
            return altezza*larghezza;
        }else{
            return 0;
        }
    };
    public int calculatePerimeter (int altezza,int larghezza){
        if(altezza>0&&larghezza>0){
            return (2*altezza)+(2*larghezza);
        }else{
            return 0;
        }
    };
    public String stampaRettangolo(int altezza,int larghezza){
        if(altezza>0&&larghezza>0){
            int area = altezza * larghezza;
            int perimetro = (2*altezza)+(2*larghezza);
            return "L'area del rettangolo è : " +area + "; mentre il perimetro è : " + perimetro;
        }else{
            return "Inserisci dei valori positivi sopra lo zero";
        }
    };


    public String stampaDueRettangoli (Rettangolo rettangolo1,Rettangolo rettangolo2){

        int sommaAree= calculateArea(rettangolo1.altezza,rettangolo1.larghezza)+calculateArea(rettangolo2.altezza,rettangolo2.larghezza);
        int sommaPerimetri= calculatePerimeter(rettangolo1.altezza,rettangolo1.larghezza)+calculatePerimeter(rettangolo2.altezza,rettangolo2.larghezza);

            return "Il perimetro del primo rettangolo è : " + calculatePerimeter(rettangolo1.altezza,rettangolo1.larghezza) + "," +
                " il perimetro del secondo rettangolo è : " + calculatePerimeter(rettangolo2.altezza,rettangolo2.larghezza) + "." +
                "L'area del primo rettangolo è : " + calculateArea(rettangolo1.altezza,rettangolo1.larghezza) + "," +
                "L'area del secondo rettangolo è : " + calculatePerimeter(rettangolo2.altezza,rettangolo2.larghezza) + "." +
                "La somma delle aree dei due rettangoli è : " + sommaAree
                + "," +
                "La somma deli perimetri dei due rettangoli è : " + sommaPerimetri + ".";

    }


    public int getId() {
        return this.id;
    }

    public int getAltezza() {
        return this.altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int setLarghezza(int larghezza){
        return this.larghezza=larghezza;
    }



}
