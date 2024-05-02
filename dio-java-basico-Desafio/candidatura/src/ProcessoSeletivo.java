import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = { "FELIPE", "ANA", "CARLOS", "MARIA", "JOÃO", "LUCIA", "PEDRO", "SOFIA", "GABRIEL",
                "ISABELA" };
        int candidatoAtual = 0;
        int candidatosSelecionados = 0;
        double salarioBase = 2000.00;
        ArrayList<Integer> indiceSelecionados = new ArrayList<>();

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou o salário de R$"
                    + String.format("%.2f", salarioPretendido));
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
                indiceSelecionados.add(candidatoAtual);
            }
            candidatoAtual++;
        }
        String[] selecionados = candidatosSelecionados(candidatos, indiceSelecionados);

        System.out.println("----------------------------------------------");
        System.out.println("              Processo Seletivo               ");
        System.out.println("----------------------------------------------");
        for (String candidato : selecionados) {
            entrandoEmContato(candidato);
        }

        System.out.println("----------------------------------------------");
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while (continuarTentando && tentativas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com candidato " + candidato + " na quantidade de " + tentativas
                    + " tentativas");
        } else {
            System.out.println("Não foi possível contato com candidato " + candidato + " na quantidade de " + tentativas
                    + " tentativas");
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }

    static String[] candidatosSelecionados(String[] candidatos, ArrayList<Integer> indice) {
        ArrayList<String> candidatosSelecionados = new ArrayList<>();
        for (int i = 0; i < candidatos.length; i++) {
            if (indice.contains(i)) {
                candidatosSelecionados.add(candidatos[i]);
            }
        }

        return candidatosSelecionados.toArray(new String[0]);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioPretendido < salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
