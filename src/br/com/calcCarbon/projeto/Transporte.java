package br.com.calcCarbon.projeto;

public class Transporte implements Calculo {
/*Voc� tem automovel? 
se sim, quanto em Litros voc� utiliza de combustivel por semana 
1 L de gasolina = 1,6 kg de CO2e

se n�o, voce utiliza onibus?
se sim, quantos km em m�dia voc� anda de onibus por semana?
(0,01l x km) -> 1 L de gasolina = 1,6 kg de CO2e
*/		
		
		private double km;
		private double gasolina;
		private int decisao1;
		private int decisao2;
		private double totalTr;
		private double indiceCarro = 1.6;
		private double indiceTransporte = 0.011;
		
		public Transporte (String nome) {
			System.out.println("\n///////////////////////////////////////////////////////////////////////////////////");
			System.out.println(nome + ", agora vamos precisar de algumas informa��es sobre seus meios de transporte\n");
		}
	
		public double getTotalTr() {
			return totalTr;
		}

		public void setTotalTr(double totalTr) {
			this.totalTr = totalTr;
		}

		
		public void pergunta1() {
			System.out.println("Voc� tem um automovel?\n 1 - SIM \n 2 - N�O" );
		}
	
		public void pergunta2() {
		if(this.decisao1 == 1) {
			System.out.println("\nQuanto em Litros voc� utiliza de combustivel por semana?\n"
					+ "(Insira um valor com pelo menos um decimal. Exemplo: 2,0)");
			}
		}
		
		public void pergunta3 () {
			System.out.println("Voc� utiliza �nibus?\n 1 - SIM \n 2 - N�O");
		}
		public void pergunta4 () {
			if(this.decisao2 == 1) {
				System.out.println("Quantos Km em m�dia voc� anda de onibus por semana?");	
			}
			
		}

		public double getKm() {
			return km;
		}

		public void setKm(double km) {
			this.km = km;
		}

		public double getGasolina() {
			return gasolina;
		}

		public void setGasolina(double gasolina) {
			this.gasolina = gasolina;
		}


		public int getDecisao1() {
			return decisao1;
		}

		public void setDecisao1(int decisao1) {
			this.decisao1 = decisao1;
		}

		public int getDecisao2() {
			return decisao2;
		}

		public void setDecisao2(int decisao2) {
			this.decisao2 = decisao2;
		}
		
		@Override
		public double calculo() {
			return this.totalTr = (this.gasolina * this.indiceCarro) + ((this.km * this.indiceTransporte) * this.indiceCarro);
			                                                              //              p/litro                 indi. de emiss�o por l
			
		} 	
	
}
