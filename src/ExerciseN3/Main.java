package ExerciseN3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Articolo articolo = new Articolo("sdafasdL","bellissimo utensile da cucina",54,5);
        Cliente cliente = new Cliente("sfgsad","Raffaele","Caravetta","rafafag@gmail.com", 2021);

        Articolo articolo1 = new Articolo("asdL","bellissimo utensile da bagno",45,51);
        Cliente cliente1 = new Cliente("sfgsssssd","Raff","vetta","fag@gmail.com", 2022);

        Articolo articolo2 = new Articolo("sda","bellissimo utensile da salotto",54,15);
        Cliente cliente2 = new Cliente("sfgsajhjyad","Raff","Cara","rafa@gmail.com", 2023);
        List<Articolo> articoloList = new ArrayList<>();
        articoloList.add(articolo);
        Carrello carrello = new Carrello(cliente, articoloList,articolo.getPrezzo());

    }

}
