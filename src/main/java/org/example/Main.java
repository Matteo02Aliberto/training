package org.example;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        IO.println("Hello and welcome!");

        Prodotto mela = new Prodotto("Mela", 10,  " 0001");
        Prodotto banana = new Prodotto("banana", 20,  " 2001");

        inventario.aggiungiProdotto(mela);
        inventario.aggiungiProdotto(banana);

        inventario.visualizzaInventario();
    }
}