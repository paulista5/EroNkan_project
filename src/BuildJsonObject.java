import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BuildJsonObject {
	public JSONObject buildExamFee(){
		JSONObject finalObject = new JSONObject();
		
		for(int i=1;i<=4;i++){
			if(i==1){
				JSONObject amount = new JSONObject();
				try {
					amount.put("amount", 400);
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONObject level = new JSONObject();
				try {
					level.put("ALL_LEVEL", amount);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONObject courses = new JSONObject();
				try {
					courses.put("ALL_COURSES", level);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					finalObject.put("INDIAN", courses);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
			if(i==2){
				JSONObject amount = new JSONObject();
				try {
					amount.put("amount", 100);
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONObject level = new JSONObject();
				try {
					level.put("ALL_LEVEL", amount);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONObject courses = new JSONObject();
				try {
					courses.put("ALL_COURSES", level);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					finalObject.put("FOREIGN", courses);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
			if(i==3){
				JSONObject amount = new JSONObject();
				try {
					amount.put("amount", 600);
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONObject level = new JSONObject();
				try {
					level.put("ALL_LEVEL", amount);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONObject courses = new JSONObject();
				try {
					courses.put("ALL_COURSES", level);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					finalObject.put("NRI", courses);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
			}
			if(i==4){
				JSONObject amount = new JSONObject();
				try {
					amount.put("amount", 600);
					
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONObject level = new JSONObject();
				try {
					level.put("ALL_LEVEL", amount);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONObject courses = new JSONObject();
				try {
					courses.put("ALL_COURSES", level);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					finalObject.put("SAARC", courses);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return finalObject;
	}
	public JSONObject buildApplicationFee(){
		JSONObject finalObject = new JSONObject();
		
		for(int i=1;i<=2;i++){
			if(i==1){
				JSONObject courses = new JSONObject();
				
				JSONObject amount = new JSONObject();
				try {
					amount.put("amount", 200);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					courses.put("UG", amount);
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				amount = new JSONObject();
				try {
					amount.put("amount", 300);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					courses.put("UG-DIPLOMA", amount);
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				amount = new JSONObject();
				try {
					amount.put("amount", 500);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					courses.put("PG", amount);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONObject nationality =  new JSONObject();
				try {
					nationality.put("ALL_COURSES", courses);
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					finalObject.put("INDIAN", nationality);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(i==2){
				JSONObject courses = new JSONObject();
				
				JSONObject amount = new JSONObject();
				try {
					amount.put("amount", 400);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					courses.put("UG", amount);
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				amount = new JSONObject();
				try {
					amount.put("amount", 400);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					courses.put("UG-DIPLOMA", amount);
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				amount = new JSONObject();
				try {
					amount.put("amount", 700);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					courses.put("PG", amount);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JSONObject nationality =  new JSONObject();
				try {
					nationality.put("ALL_COURSES", courses);
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					finalObject.put("FOREIGN", nationality);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
		return finalObject;
	}
	public JSONObject getFeeObject(){
		JSONObject finalObject = new JSONObject();
		try {
			finalObject.put("Exam Fee", buildExamFee());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			finalObject.put("Application Fee", buildApplicationFee());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return finalObject;
		
	}

}
