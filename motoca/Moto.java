package motoca;

public class Moto {
	private int potencia;
	private Passageiro pass;
	private int tempo;
	private float combustivel;
	private float maxCombust = 20;
	
	
	public Moto(int potencia, int maxCombustivel) {
		
	}
	
	
	//INICIAR
	public void Inicializar() {
		this.potencia = 1;
		this.tempo = 0;
		this.pass = null;
		this.combustivel = 0;
	}
	//SUBIR
	public void subir(String nome, int idade) {
		if (this.pass != null) {
			System.out.println("	Ação não Concluida!\n"+
		    "	Já existe um Piloto");
		}else if(pass.getIdade() > 10 || pass.getIdade() < 1){
			System.out.println("Sinto informar! Piloto Fora Da Faixa Etária(1 á 10)");
		}else {
			System.out.println("OK! Piloto Subindo.");
			pass.setNome(nome);
			pass.setIdade(idade);
			
		}
		//DESCER
	}public void descer() {
		if (pass != null) {
			System.out.println("OK! Piloto Descendo.");
			this.pass = null;
		}else {
			System.out.println("Erro! Não Há Piloto Para Descer");
		}
		
		// COMPRAR TEMPO
	}public void comprarTempo(int t) {
		this.tempo += t; 
	}
	
		// DIRIGIR TEMPO - REVER AQUI!!!!!!!!
	public void dirigir() {
		float a = (this.combustivel - (this.tempo/2)); 
		if (pass.getIdade() < 11 || this.combustivel > 0) {
			System.out.println("Passeiando");
			this.combustivel -= this.tempo/2;
			//rever isso this.combustivel muda nesse segundo if
			if (this.combustivel < 0) {
				System.out.println("O Combustível Acabou"
						+"\n Você Pilotou por :"+ (this.combustivel - a) + "minuto(s)");
				this.combustivel = 0;
			}
		}else if((this.combustivel - (this.combustivel -= this.tempo/2))< 1) {
			System.out.println("O Combustível acabou durante o passeio!"
					+"\n Você Pilotou por : " + (this.combustivel - a) + " minuto(s)");
			
			
		}else if(this.combustivel == 0) {
			System.out.println("Não é possível passeiar,"
					+ "sem combustível, ABASTEÇA!");
			System.out.println("Você pilotou por:   " + (this.combustivel -= this.tempo/2));

			
		}
		
		//BUZINAR CONCLUIR AQUI !!!!!!!!!
	}public void buzinar() {
		for (int i = 0; i <= this.potencia; i++) {
			String vet[];
			vet[i] = "e";
			
			System.out.print("P"+ vet[i]+"M" );
		}if (this.potencia == 0) {
			System.out.println("pem");
		}
	}
	
	//ABASTECER
	
	public void abastecer(float a) {
		if (a <= 0) {
			System.out.println("Erro! Abastecimento Inválido");
			this.combustivel = 0;
		}else if ((this.combustivel + a) > this.maxCombust) {
			this.combustivel = this.maxCombust;
			
		}else {
			this.combustivel += a;
			System.out.println("Abastecimento concluido");
		}
	}
	
	
	
	public int getPotencia() {
		return this.potencia;
	}public Passageiro getPass() {
		return this.pass;
	}public int getTempo() {
		return this.tempo;
	}public float getCombustivel() {
		return this.combustivel;
	}public float maxCombust(){
		return this.maxCombust;
	}
	


}

