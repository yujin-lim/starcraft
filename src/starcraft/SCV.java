package starcraft;


	
class SCV extends GroundUnit implements Repairable {

	SCV() {
		super("SCV", 80);
	}
	private static void repair(Repairable unit) {
		if(unit instanceof Repairable) {
			Unit target = (Unit) unit;
		
			while(target.hp < target.MAX_HP) {
				target.hp++;
				String message = String.format("%s 수리중{%d/%d]",target.name,target.hp,target.MAX_HP);
				System.out.println(message);
				
				try {
					Thread.sleep(50);
				}catch(Exception e) {
				}
			}
			System.out.println(">>>수리완료>>>");
		}
	}
}

