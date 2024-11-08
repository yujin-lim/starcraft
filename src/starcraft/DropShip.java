package starcraft;

class DropShip extends AirUnit implements Repairable {

	DropShip() {
		super("DropShip", 80);
	}

	@Override
	void flying() {
		System.out.println("I can fly~");

	}

}