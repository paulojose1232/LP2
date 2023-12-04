package main;

//import modelo.Produto0; // precisa do import caso a .class esteja em outro pacote

public class Supermercado {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//Produto0 prod1, prod2;
		//prod1 = new Produto0();
		//prod2 = new Produto0(1, "Leite", 4.59);
		Produto0 p1, p2;
		p1 = new Produto0();
		p2 = new Produto0(1, "Leite", 4.59);
		System.out.println(p1);
		System.out.println("Código: "+p2.getCodigo());
		System.out.println("Nome: "+p2.getNome());
		System.out.println("Preço: "+p2.getValor());
		//System.out.println("Informe o código: ");
		//prod1.codigo = sc.nextInt();
		//System.out.println("Produto1: "+prod1.codigo+" "+prod1.nome+"");
		//System.out.println("Produto2: "+prod2.codigo+" "+prod2.nome+"");
		//sc.close();
	}
}