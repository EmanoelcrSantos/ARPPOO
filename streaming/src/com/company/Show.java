package com.company;

public class Show extends ItemAgrupado{

    public Show(String titulo, String genero, String diretor) {
        super(titulo, genero, diretor);
    }

    @Override
    public void imprimir(){
        System.out.println("Titulo: " + titulo + "\n" + "Genero: " + genero + "\n" + "Diretor: " + diretor + "\n");
        super.imprimir();
    }
}
