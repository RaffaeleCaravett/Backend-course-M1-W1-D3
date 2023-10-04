package ExerciseN3;

import java.util.Date;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private int dataIscrizione;


    public Cliente() {

    }

    public Cliente ( String codiceCliente,String nome,String cognome, String email,int dataIscrizione){
        this.codiceCliente=codiceCliente;
        this.nome=nome;
        this.cognome=cognome;
        this.email=email;
        this.dataIscrizione=dataIscrizione;
        System.out.println("Codice cliente : " + this.codiceCliente);
        System.out.println("nome : " + this.nome);
        System.out.println("cognome : " + this.cognome);
        System.out.println("email : " + this.email);
        System.out.println("data iscrizione : " + this.dataIscrizione);
    }


    public String getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(int dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }
}
