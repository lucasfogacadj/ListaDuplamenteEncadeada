import java.util.Scanner;

public class Elemento {
	
	String valor;
	Elemento proximo;
	Elemento anterior;
	
	Scanner tc = new Scanner(System.in);
	
	public void mostrar(){
		
		System.out.println(valor);
		
	}
	
	public void ler(){
		System.out.println("Digite o valor");
		this.valor = tc.next();
		
	}
	

}
