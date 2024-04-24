package edu.rafael.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Rafael";
        String segundoNome = "Adolfo";
        String nomeCompleto;
        nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do metodo = " + primeiroNome.concat(" ").concat(segundoNome);
        // concat concatena uma string para dentro de uma string.
    }
}