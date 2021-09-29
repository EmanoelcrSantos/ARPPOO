package com.company;
import java.util.ArrayList;
import java.util.List;

public abstract class ItemAgrupado extends Item {

    List <Filme>listaDeFilmes = new ArrayList<Filme>();

    public ItemAgrupado(String titulo, String genero, String diretor) {
        super(titulo, genero, diretor);
    }

    public void adicionar(Filme filme){
        listaDeFilmes.add(filme);
    }

    public List<Filme> getFilmes(){
        return listaDeFilmes;
    }

    @Override
    public int getDuracao() {

        int duracao = 0;

        for (Filme filme : listaDeFilmes){
            duracao += filme.getDuracao();
        }
        return duracao;
    }

    @Override
    public void imprimir(){

        System.out.println("Duração total:" + getDuracao() + "\n");

        for (Filme filme : listaDeFilmes){
            System.out.println("Titulo: " + filme.getTitulo() + "\n" + "Genero: " + filme.getGenero() + "\n" + "Diretor: " + filme.getDiretor() + "\n" + "Duração: " + filme.getDuracao() + "\n");
        }

    }


}
