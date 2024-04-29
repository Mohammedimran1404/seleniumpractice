package automationTask;

	import java.net.URL;
	import java.util.HashMap;
	import java.util.Map;

	public class ValidationForUrl {
	    public static void main(String[] args) {
	    	boolean value=false;
	    	String strValue="true";
	    	String strParam="Home-Kitchen";
	        try {
	            URL url = new URL("https://www.example.com/page?Home-Kitchen=true&Home-Kitchen1=true&Home-Kitchen3=true");

	            String query = url.getQuery();

	            Map parameters = new HashMap();
	            for (String param : query.split("&")) {
	                String[] pair = param.split("=");
	                parameters.put(pair[0], pair[1]); 
	            }
	            if (parameters.get(strParam).equals(strValue))	
	            {
	                value=true;
	            } 
               System.out.println(value);

	        } catch (Exception e) {
	            e.printStackTrace(); 
	        }
	    }
	}
