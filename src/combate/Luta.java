package combate;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1,Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
			this.aprovada=true;
			this.desafiado=l1;
			this.desafiante=l2;					
		}else {
			this.aprovada=false;
			this.desafiado=null;
			this.desafiante=null;
			
		}
		
	}
	
	public void lutar() {
		if(this.aprovada) {
			System.out.println("------ DESAFIADO ------");
			this.desafiado.apresentar();
			System.out.println("------- DESAFIANTE -------");
			this.desafiante.apresentar();
			Random n= new Random();
			int vencedor=n.nextInt(3);
			System.out.println("===========RESULTADO DA LUTA===========");
			switch(vencedor) {
			case 0://EMPATE
				System.out.println("EMPATOU");
				this.desafiado.empatar();
				this.desafiante.empatar();
				break;
			case 1: //DESAFIADO VENCE
				System.out.println(this.desafiado.getNome()+" VENCEU A LUTA");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: // DESAFIANTE VENCE
				System.out.println(this.desafiante.getNome()+" VENCEU A LUTA");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;				
			}
			System.out.println("=========================================");		
		}else {
			System.out.println("LUTA NAO PODE ACONTECER.");
		}
		
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	

}
