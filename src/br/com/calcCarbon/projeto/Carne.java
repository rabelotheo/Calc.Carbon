package br.com.calcCarbon.projeto;

public class Carne {
/*Voc� come carne? 
sim ou n�o 
se sim:
aproximadamente quantos kg de carne por semana (1 bife = 90g)
1 kg de carne = 152 kg de CO2e
*/
	private double qntCarne = 0.0;
	private double total;
	private double indice = 152.0;
	private int decisao;
	
	public Carne (String nome) {
		System.out.println("\n/////////////////////////////////////////////////////////////////////");
		System.out.println(nome + ", vamos precisar de uma informa��o sobre sua alimenta��o, ok?\n");
	}
	
	public void pergunta1() {
			System.out.println("Voc� come carne?\n 1 - SIM \n 2 - N�O" );
		}
	
	public void pergunta2() {
		if(decisao == 1) {
			System.out.println("\nQuanto voc� consome em kgs por semana? \n(Insira um valor com pelo menos um decimal. Exemplo: 2,0)"
					+ "\n(Um bife � aproximadamente 90g)");
		}
	} 	
		
	public double getQntCarne() {
		return qntCarne;
	}

	public void setQntCarne(double carne) {
		this.qntCarne = carne;
	}
		
	public double calculo() {
		return this.total = this.qntCarne * this.indice;	
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setDecisao(int decisao) {
		this.decisao = decisao;
	}
	
	public int getDecisao() {
		return decisao;
	}	
}
