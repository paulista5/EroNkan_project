import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

public class MainClass {
	public static void feeCalculatorUtil(){
		
		BuildJsonObject jsonObject = new BuildJsonObject();
		JSONObject feeObject = jsonObject.getFeeObject();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int ch = 0;
			String choice ="";
			
			
			
			String names[] = JSONObject.getNames(feeObject) ;
			System.out.println("Choose the type of fee:");
			for(int i=1;names!=null&&i<=names.length;i++){
				System.out.println(i+". "+names[i-1]);
			}
			System.out.println();
			while(true){
				ch =  sc.nextInt();
				if(ch>=1 && ch<=names.length)
					break;
				else	
					System.out.println("Choose  correct option from range !!");
			}
			choice = names[ch-1];
			JSONObject nationality = null;
			try {
				nationality = feeObject.getJSONObject(choice);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(nationality!=null)
				names = JSONObject.getNames(nationality);
			System.out.println("Choose your nationality:");
			for(int i=1;names!=null&&i<=names.length;i++){
				System.out.println(i+". "+names[i-1]);
			}
			System.out.println();
			while(true){
				ch =  sc.nextInt();
				if(ch>=1 && ch<=names.length)
					break;
				else	
					System.out.println("Choose  correct option from range !!");
			}
			choice = names[ch-1];
			JSONObject levels = null;
			try {
				levels = nationality.getJSONObject(choice).getJSONObject("ALL_COURSES");
				//System.out.println(levels.toString());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Enter your choice of course:\n 1. Medical\n 2. Dental\n 3. Ayurveda\n");
			System.out.println();
			while(true){
				ch =  sc.nextInt();
				if(ch>=1 && ch<=3)
					break;
				else	
					System.out.println("Choose  correct option from range !!");
			}
			if(levels!=null && levels.length() == 1){
				System.out.print("Enter your choice of degree:\n1. UG\n2. PG\n3. DIPLOMA\n4. Ph.D\n\n");
				while(true){
					ch =  sc.nextInt();
					if(ch>=1 && ch<=4)
						break;
					else	
						System.out.println("Choose  correct option from range !!");
				}
				int amount = 0;
				try {
					amount = (levels.getJSONObject("ALL_LEVEL")).getInt("amount");
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Fee amount: "+amount);
			}
			else {
				System.out.print("Enter your choice of degree:\n");
				for(int i=1; i<=JSONObject.getNames(levels).length; i++){
					System.out.println(i+". "+JSONObject.getNames(levels)[i-1] );
				}
				System.out.println();
				while(true){
					ch =  sc.nextInt();
					if(ch>=1 && ch<=JSONObject.getNames(levels).length)
						break;
					else	
						System.out.println("Choose  correct option from range !!");
				}
				int amount = 0;
				try {
					amount = levels.getJSONObject(JSONObject.getNames(levels)[ch-1]).getInt("amount");
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Fee amount: "+amount);
		}
			System.out.println("Do you want to calculate another fee amount \n1. Yes\n2. No");
			while(true){
				ch = sc.nextInt();
				if(ch<1 || ch > 2)
					System.out.println("Choose  correct option from range !!");
				break;
			}
			if(ch == 2)
				break;
		
		}
	}
	public static void main(String[] args) {
		feeCalculatorUtil();
	}

}
