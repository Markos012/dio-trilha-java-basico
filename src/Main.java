
public class Main {

	public static void main(String[] args) {
		Cliente Markos = new Cliente();
		Markos.setNome("Markos");
		
		Conta cc = new ContaCorrente(Markos);
		Conta poupanca = new ContaPoupanca(Markos);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}