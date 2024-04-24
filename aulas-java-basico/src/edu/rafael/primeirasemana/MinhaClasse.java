package edu.rafael.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        // Printando com o sistema
        System.err.println("Olá Santander!");
        // Funcionamento dos metodos publicos, repare na questão da chama estatica
        String nomeCompleto = nomeCompleto("Rafael", "Adolfo");
        System.out.println(nomeCompleto);
        // observando a melhora na questão da identação!
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
