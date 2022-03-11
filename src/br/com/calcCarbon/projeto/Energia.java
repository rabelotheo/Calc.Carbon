package br.com.calcCarbon.projeto;

public class Energia {
	
	/*
  qual o gasto m�dio de energia em kwh da sua casa por m�s? (da� dividir por 4 semanas do m�s e pela quantidade de pessoas da casa)
= 0,11kgCO2e/kWh
Quantos botij�es de g�s utilizam na sua casa durante o ano? (da� divide 52 semanas e pelas pessoas da casa/ 1 botij�o de g�s = 5,4 m�)
1 botij�o de g�s = 38 kg de CO2e */
	
	private double mEnergia = 0.0;
	private double gAnos = 0.0;
	private int decisao;
	private double eTotal;

	public Energia(String nome) {
			System.out.println("\n/////////////////////////////////////////////////////////////");
			System.out.println(nome + ", precisaremos tamb�m das suas informa��es de consumo.\n");
		}
		
		public void pergunta1() {
				System.out.println("Qual o gasto m�dio de energia em kWh da sua resid�ncia por m�s?" );
			}	
		public void pergunta2() {
			System.out.println("Quantos botij�es de g�s voc� utiliza na sua resid�ncia ao decorrer do ano?\n(1 botij�o de g�s = 5,4 m�)" );
		}	
		
	public double getmEnergia() {
		return mEnergia;
	}
	public void setmEnergia(double mEnergia) {
		this.mEnergia = mEnergia;
	}
	public double getgAnos() {
		return gAnos;
	}
	public void setgAnos(double gAnos) {
		this.gAnos = gAnos;
	}
	public int getDecisao() {
		return decisao;
	}
	public void setDecisao(int decisao) {
		this.decisao = decisao;
		}
	public double calculo(int pessoas) {
		return this.eTotal =((this.mEnergia / pessoas) / 4) + (this.gAnos / 52);
	}	
	public double geteTotal() {
		return eTotal;
	}
}