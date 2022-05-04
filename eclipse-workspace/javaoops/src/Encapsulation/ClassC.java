package Encapsulation;

public class ClassC implements InterfaceA,InterfaceB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassC ob2 = new ClassC();
		ob2.carromboard();
		ob2.chess();
		ob2.cricket();
		ob2.football();
		ob2.kabbadi();
	}

	@Override
	public void carromboard() {
		// TODO Auto-generated method stub
		System.out.println("carromboard :" + "it allows 4 players to play");
	}

	@Override
	public void chess() {
		// TODO Auto-generated method stub
		System.out.println("chess :" + "it allows 2 players to play");

	}

	@Override
	public void kabbadi() {
		// TODO Auto-generated method stub
		System.out.println("kabaddi :" + "it allows 7 players to play on each side");

	}

	@Override
	public void cricket() {
		// TODO Auto-generated method stub
		System.out.println("cricket :" + "it allows 11 players to play on each side");

	}

	@Override
	public void football() {
		// TODO Auto-generated method stub
		System.out.println("football :" + "it allows 11 players to play on each side");

	}
	
	

}
