package starcraft;

import java.util.Random;

class Other extends GroundUnit implements Repairable {

	Other() {
		super("Other", 70);
	}
	private static void attack (Attackable unit) {
		Random ran = new Random();
		if(unit instanceof Attackable) {
			Unit target = (Unit) unit;
			Other other = (Other) other;
			
			
		 if (target.attack > other.attack) {
			  String message = String.format("상대방 공격이 높습니다.[%d/%d]", other, target.attack,other.attack);
			  System.out.println(message);
		 } 
		 else if(target.attack < other.attack) {
			  String message = String.format("상대방 공격이 낮습니다.[%d/%d]", other, target.attack,other.attack);
			  System.out.println(message); 
		 }
		 else if(target.attack == other.attack) {
			  String message = String.format("상대방 공격력과 같습니다.[%d/%d]", other, target.attack,other.attack);
			  System.out.println(message); 
		 }

			  try {
					Thread.sleep(50);
				}catch(Exception e) {
				}
			}
		
		  System.out.println("공격을 중지하자");

	}
}
	
	
	