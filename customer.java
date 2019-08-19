import java.util.*;

public class customer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
		String ans = "";
		do {
		System.out.println("1. Register or Login");
		System.out.println("2. Add a product");
		System.out.println("3. Make an order");
		System.out.println("4. view order");
		System.out.println("5. exit");
		int n = scan.nextInt();
		Map<String, String> maplogin = new HashMap<String, String>();
		Map<String, Integer> mapproduct = new HashMap<String, Integer>();
		Map<String, String> maporder = new HashMap<String, String>();
		switch(n) {
		case 1:
			System.out.print("Enter Your Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Enter your Password:");
			String password = scan.nextLine();
			maplogin.put(name, password);
			continue;
		
		case 2:
			System.out.println("Enter Product Name");
			scan.nextLine();
			String product = scan.nextLine();
			System.out.print("Enter Price");
			int price = scan.nextInt();
			mapproduct.put(product, price);
			continue;
			
		case 3:
			System.out.print("Enter Your name:");
			String name1 = scan.nextLine();
			System.out.print("Enter your Password:");
			String password1 = scan.nextLine();
			Set set=maplogin.entrySet();
		    Iterator itr=set.iterator();
		    int f=0;
		    while(itr.hasNext()){  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        if((entry.getKey() == name1) && (entry.getValue() == password1)) {
		        	System.out.println("Logged In Successfully");
		        	f = 1;
		        	continue;
		        }
		    }
		    if(f == 0) {
		    	System.out.println("Login Details Incorrect");
		    	break;
		    }
		    else {
		    	System.out.println("Place an order by selecting the product shown below");
		    	Set set1=mapproduct.entrySet();
			    Iterator itr1=set1.iterator();
			    int i=1;
			    System.out.println("Product list");
			    while(itr1.hasNext()){  
			        Map.Entry entry=(Map.Entry)itr1.next();  
			        System.out.println(i+". "+entry.getKey()+" "+entry.getValue());
			        i++;
			    }
			    
		    }
		    cotinue;
		    
		case 4:
			Set set2=maporder.entrySet();
			Iterator itr2=set2.iterator();
			System.out.println("Order list");
		    while(itr2.hasNext()){  
		        Map.Entry entry=(Map.Entry)itr2.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());
		    }
		continue;
			
		case 5:
			System.out.println("Exit");
			System.exit(0);
			break;		    
		}
		
		}while(ans.equals("Yes") || ans.equals("yes"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}