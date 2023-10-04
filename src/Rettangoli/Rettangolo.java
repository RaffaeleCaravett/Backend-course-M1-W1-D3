package Rettangoli;

import java.util.Random;

public class Rettangolo {
        Random random = new Random();
        int id=random.nextInt(1000);
        int altezza;
        int larghezza;
        String figure="Rectangles";
        public  Rettangolo(int altezza,int larghezza) {
if(altezza>0 && larghezza>0){
    this.altezza=altezza;
    this.larghezza=larghezza;
    System.out.println( "Il rettangolo " + this.id + " ha una altezza ed una larghezza rispettivamente di : " +
        this.altezza + " e " + this.larghezza);
    System.out.println("L'area di questo rettangolo è : " + calculateArea(altezza,larghezza));
    System.out.println("Il perimetro di questo rettangolo è : " + calculatePerimeter(altezza,larghezza));

}else{
    System.out.println( "Inserisci dei valori maggiori del numero 0");
}
        }


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

