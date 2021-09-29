package com.company;

public class Serie extends ItemAgrupado {

    private int temporadas;

    public Serie(String titulo, String genero, String diretor, int temporadas) {
        super(titulo, genero, diretor);
        this.temporadas=temporadas;
    }

    public int getTemporadas() {
        return this.temporadas;
    }

    @Override
    public void imprimir(){
        System.out.println("Titulo: " + titulo + "\n" + "Genero: " + genero + "\n" + "Diretor: " + diretor + "\n" + "Temporadas: " + temporadas + "\n");
        super.imprimir();
    }

}
