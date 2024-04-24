package edu.rafael.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int media = 8;
        if (media < 6)
            System.out.println("Reprovado");
        else if (media == 6)
            System.out.println("Prova de Minerva");
        else
            System.out.println("Aprovado com certeza!");

    }
}
