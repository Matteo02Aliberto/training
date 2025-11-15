package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Prodotto> prodotti = new ArrayList<>();

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
}
public void visualizzaInventario(){
        if (prodotti.isEmpty()) {
            System.out.println("Inventario vuoto");
            return;
        } System.out.println("--------Inventario--------");
        for (Prodotto prodotto:prodotti)
            System.out.println(prodotto);
    }

}
