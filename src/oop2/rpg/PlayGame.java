package oop2.rpg;

public class PlayGame extends Player{

	public static void main(String[] args) {
		
		Princess chP = new Princess();
		chP.move(5, 10);
		chP.getXY("∞¯¡÷");
		chP.heal();
		
		Shooter chS = new Shooter();
		chS.move(8, 7);
		chS.getXY("Ω¥≈Õ");
		chS.shot();
	}



}
