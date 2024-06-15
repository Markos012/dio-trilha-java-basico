import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"MARKOS", "LETÍCIA", "LUÍSA", "JHENIFFER", "ADRIANA", "MARCOS", "MAYSA", "OCIMAR", "JHONNY", "THALES", "THALITA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        // Gera um valor aleatório entre 1500 e 2500 para o salário pretendido
        return ThreadLocalRandom.current().nextDouble(1500, 2500);
    }

    static void analisarCandidato(double salarioPretendido) { // double utilizado por nao ser um número inteiro
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) { // se o salario base for maior do que o pretendido
            System.out.println("Ligar para o candidato"); // mostrar a mensagem
        } else if (salarioBase == salarioPretendido) { // caso contrário se salario base for igual ao pretendido
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
