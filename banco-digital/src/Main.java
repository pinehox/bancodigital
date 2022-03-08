
public class Main {
	
	public static void main (String[] args) {
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme");
		
		Conta cc = new ContaCorrente(guilherme);
		Conta cp = new ContaPoupanca(guilherme);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
