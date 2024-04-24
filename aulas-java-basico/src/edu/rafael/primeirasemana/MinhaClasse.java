package edu.rafael.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        System.err.println("Olá Santander!");
        String nomeCompleto = nomeCompleto("Rafael", "Adolfo");
        System.out.println(nomeCompleto);
        int media = 8;
        if (media < 6)
            System.out.println("Reprovado!");
        else if (media == 6)
            System.out.println("Caso de Minerva");
        else
            System.err.println("Aprovado!");
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Testando funcionalidade: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
