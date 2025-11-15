package org.example;

    
public class Prodotto {
    private String nome;
    private int quantita;
    private String codice;

    public Prodotto (String nome, int quantita, String codice){
        this.nome = nome;
        this.quantita = quantita;
        this.codice = codice;
    }
    public String getNome() {
        return nome;
    }
    public int getQuantita() {
        return quantita;
    }
    public String getCodice() {
        return codice;
    }
    public void setQuantita (int quantita) {
        this.quantita = quantita;}
    @Override
    public String toString() {
        return "Prodotto [nome:" + nome+ ", quantita:" + quantita+", codice" + codice +"]";
    }
}