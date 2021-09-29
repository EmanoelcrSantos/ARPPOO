package com.company;

public class Filme extends Item {

    private int duracao;

    public Filme(String titulo, String genero, String diretor, int duracao) {
        super(titulo,genero,diretor);
        this.duracao=duracao;
    }

    @Override
    public int getDuracao() {
        return this.duracao;
    }

    @Override
    public void imprimir(){
        System.out.println("Titulo: " + titulo + "\n" + "Genero: " + genero + "\n" + "Diretor: " + diretor + "\n" + "Duração: " + duracao + "\n");
    }

}
