package automationTask;

	import java.net.URL;
	import java.util.HashMap;
	import java.util.Map;

	public class ValidationForUrl {
	    public static void main(String[] args) {
	    	boolean value=false;

	        try {
	            URL url = new URL("https://www.example.com/page?Home-Kitchen=false&Home-Kitchen1=false&Home-Kitchen3=false");

	            String query = url.getQuery();
	            

	            Map parameters = new HashMap();
	            for (String param : query.split("&")) {
	                String[] pair = param.split("=");
	                parameters.put(pair[0], pair[1]); 
	            }
	            if (parameters.containsKey("Home-Kitchen")&&parameters.get("Home-Kitchen").equals("true"))	
	            {
	                value=true;

	            } 
	            System.out.println(value);
	        } catch (Exception e) {
	            e.printStackTrace(); 
	        }
	    }
	}
