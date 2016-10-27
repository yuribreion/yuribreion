import java.util.ArrayList;

class TestProgram{
	public static void main(String[] args) {
		Conta mauricio = new Conta();
		
		ArrayList<String> titulares = new ArrayList<>();
		
		titulares.add("Yuri");
		titulares.add("Gerson");
		titulares.add("Laerte");
		titulares.add("Luciano");
		
		//foreach para percorrer desde o primeiro ao ultimo
		for (String titular : titulares) {
			System.out.println(titular);
		}
		
		
		mauricio.agencia = 123;
		mauricio.numero = 2394;
		mauricio.saldo = 800.00;
		
		Conta guilherme = new Conta();
		
		guilherme.agencia = 9432;
		guilherme.numero = 3412;
		guilherme.saldo = 1200.00;
		
		mauricio.transfere(200, guilherme);

	}
}