// versão professora
package main;

//import modelo.Empregado; // usa-se caso Empregado.java esteja na pasta modelo

public class Empresa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado2 e1,e2;
		e1 = new Empregado2("Antonio","Marques",4365.57);
		e2 = new Empregado2("Carlos","Eduardo",15650);
		System.out.println(e1);
		System.out.println("Salário anual: "+(e1.getSalMensal()*12));
		
		e1.setSalMensal(e1.getSalMensal()*1.1);
		System.out.println("Novo salário anual: "+(e1.getSalMensal()*12));
		
		System.out.println(e2);
		System.out.println("Salário anual: "+(e2.getSalMensal()*12));
		e2.setSalMensal(e2.getSalMensal()*1.1);
		System.out.println("Novo salário anual: "+(e2.getSalMensal()*12));
		
	}

}
