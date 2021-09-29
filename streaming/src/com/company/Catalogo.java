package com.company;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    public static void main(String[] args) {

        Filme filme = new Filme("Homem Aranha", "Ação", "Gustavo Alves", 100);

        Serie serie = new Serie("Round 6", "Ação", "Hwang Dong-hyuk", 1);
        serie.adicionar(new Filme("Líder","Suspense","Hwang Dong-hyuk", 32));
        serie.adicionar(new Filme("Batatinha frita:1,2,3","Suspense","Hwang Dong-hyuk", 59));
        serie.adicionar(new Filme("Fiquem juntos","Suspense","Hwang Dong-hyuk", 55));

        Show show = new Show("Turma do Pagode","Pagode", "Leiz");
        show.adicionar(new Filme("Camisa 10", "Pagode", "Turma", 4));
        show.adicionar(new Filme("Lancinho", "Pagode", "Turma", 3));

        Catalogo catalogo = new Catalogo();
        catalogo.adicionar(filme);
        catalogo.adicionar(serie);
        catalogo.adicionar(show);
        catalogo.imprimir();

    }

    List<Item> catalogo = new ArrayList<Item>();

    public void imprimir(){

        for (Item item : catalogo){
           item.imprimir();
        }
    }

    public void adicionar(Item item){
        catalogo.add(item);
    }

}