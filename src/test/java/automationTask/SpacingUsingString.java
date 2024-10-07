package automationTask;

public class SpacingUsingString {

	public static void main(String[] args) {
		
String originalString = "AppleBall";
        
        int index = originalString.indexOf("Ball");
        
        String modifiedString = originalString.substring(0, index) + " " + originalString.substring(index);
        
        System.out.println(modifiedString);

	}

}
