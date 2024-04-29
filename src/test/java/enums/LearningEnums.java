package enums;

public class LearningEnums {
	
	enum bikes{
		PULSAR150,DISCOVER,UNICORN,SHINE,ACTIVA
	}

	public static void main(String[] args) {
		
		bikes bike[]=bikes.values();
		
		for(bikes b:bike) {
			System.out.println(b);
			
		}

	}

}
