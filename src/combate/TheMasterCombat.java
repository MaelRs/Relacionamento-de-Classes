package combate;

public class TheMasterCombat {

	public static void main(String[] args) {
		Lutador l[]= new Lutador[6];
				
				
		l[0]=new Lutador("Alan Silva","Brasil",31,1.75f,64.8f,13,1,2);
		l[1]=new Lutador("Jose Aldo","Brasil",39,1.83f,68.1f,18,3,1);
		l[2]=new Lutador("Bruce Lee","EUA",29,1.72f,78.2f,22,0,0);
		l[3]=new Lutador("Van Daime","Inglaterra",42,1.75f,80.0f,18,2,2);
		l[4]=new Lutador("Jack Chan","Japao",39,1.62f,119.6f,15,3,1);
		l[5]=new Lutador("Borella Monster","Canada",36,1.92f,105.3f,12,4,2);
		
		//l[0].apresentar();
		//l[1].apresentar();
		
		Luta estreia=new Luta();
		estreia.marcarLuta(l[4],l[5]);
		estreia.lutar();
		//l[0].status();
		//l[1].status();

	}

}
