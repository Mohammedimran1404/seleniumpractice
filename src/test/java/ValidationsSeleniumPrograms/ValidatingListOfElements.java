package ValidationsSeleniumPrograms;


public class ValidatingListOfElements {
	public static void main(String[] args) {
		ValidatingListOfElements val=new ValidatingListOfElements();
			val.validateElementInList();
		     // val.validateElementNotInList();
		}
		
	
		
		// by using this logic we can use for table to
		//validate the table that particular data is present in table or not
		//if data is present it will move forward
		//if data is not present it will print as false
		
		public void validateElementInList() {
		String[] a={"Imran","basha","khaja","praneeth"};
		
		boolean value =false;
		for(int i=0;i<a.length;i++) {
			String b=a[i];
			if(b.equals("Imran")) {
				value=true;
				System.out.println(b);
				break;
			}
		}
		if(!value) {
		System.out.println(value);
		
		
	   }
	}
		

		public void validateElementNotInList() {
			String[] a={"Imran","basha","khaja","praneeth"};
			
			boolean value =true;
			for(int i=0;i<a.length;i++) {
				String b=a[i];
				if(b.equals("Imran")) {
					value=false;
					System.out.println(b);
					break;
				}
			}
			if(!value) {
			System.out.println(value);
			
			
		   }
		}
	
	
	
}
