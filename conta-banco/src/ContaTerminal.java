public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Terá uma variável denominada saldo do tipo double contendo o valor inicial igual a 25;
        //de valor solicitado do tipo double contendo o valor inicial igual a 18;
        double saldo=25.0;
        double valorSolicitado = 18.0;

        if ( saldo >= valorSolicitado)
        {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        }
        else //Caso o saldo seja menor que o valor solicitado, devemos exibir a mensagem "Saldo insuficiente";
        {
            System.out.println("Saldo insuficiente.");
        }
        
        System.out.println("Saldo atual: " + saldo); //Imprima o valor do saldo;

        saldo = 15.0;
        valorSolicitado = 22.0;

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Saldo atual: " + saldo);
    }
}
