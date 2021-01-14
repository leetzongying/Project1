package foods;

import java.util.*;

public class MainMenu {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String name, fm, ages;
			
		System.out.println("What is your name?");
		name = in.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.println("How old are you?");
		ages = in.nextLine();
		System.out.println("You are " + ages +" years old!");
		//System.out.print("Enter your IC number: ");
		//IC = in.nextLong();
		System.out.println("Enter your gender :");
		fm = in.nextLine();
		System.out.println();
		
		//do while loop
		System.out.println("Please check your data again!");
		String[] data1 = {"Name", "Age", "Gender"};
		String[] data2 = {name, ages, fm};
		int i=0;
		do {
			System.out.println(data1[i] + "\t: " + data2[i]);
			i++;
		}while(i<data1.length);
		
		System.out.println("Welcome to Group 5 Cafe!");
		System.out.println("Services we provide: Bread, Cake, Rice, Desserts, Fruits");
		System.out.println("Please choose");
		System.out.println("Type 1 for bread, type 2 for cake, type 3 for rice, type 4 for desserts, type 5 for fruits");
		
		int type = in.nextInt();
		
		switch(type) {
		case 1:
			Bread();
			break;
		case 2:
			Cake();
			break;
		case 3:
			Rice();
			break;
		case 4:
			Desserts();
			break;
		case 5:
			Fruits();
		}
		}
	
	private static void Bread(){
		int  num1, num2, num3, num4, num5, num6, ans;
		long IC;
		double sum;
		char answer;
	
		
		boolean running = true;
		System.out.println("Start your great day with a fresh baked bread!");
		Scanner in = new Scanner (System.in);
		
		System.out.println("\n\tWould you like to buy breads?");
		System.out.println("\t1. Yes Of Course!");
		System.out.println("\t2. No Bye-bye!");
			
		
		String input1 = in.nextLine();
		if(!input1.equals("1") && !input1.equals("2")) {
			System.out.println("Invalid Command");
			input1 = in.nextLine();
		
		}else if(input1.equals("1")) {
        	 do {//do while loop
			System.out.println("Welcome to The Bakery House!");
		
System.out.println();
		
		
		//2.&3.
		//System.out.println("Product provided(per one quantity): ");
		//System.out.println("White bread 	  = RM  5.00");
		//System.out.println("Wheat bread 	  = RM  7.00");
		//System.out.println("Whole Grain bread = RM  9.00");
		//System.out.println("Rye Bread 	  = RM  3.00");
		//System.out.println("French Bread 	  = RM 10.00");
		//System.out.println("Hot-Dog Bread 	  = RM 13.00");
		//System.out.println();
		//System.out.print("Please enter the code of product required: ");
		
		
		//For loop & Array
		//System.out.println("Product we provide with the price!");
		//String[] breads = {"White bread		= RM5.00", "Wheat bread 		= RM7.00", "Whole Grain bread  	= RM9.00", "Rye Bread		= RM3.00", "French Bread		= RM10.00", "Hot-Dog Bread		= RM13.00"};
		//for (String j : breads) {
		//	System.out.println(j);
		//}
		//System.out.println();	
		
		//For loop & Array
		System.out.println("Product we provide with the price!");
		String[] breads = new String[6];
		breads[0] = "White bread		= RM5.00";
		breads[1] = "Wheat bread 		= RM7.00";
		breads[2] = "Whole Grain bread  	= RM9.00";
		breads[3] = "Rye Bread		= RM3.00";
		breads[4] = "French Bread		= RM10.00";
		breads[5] = "Hot-Dog Bread		= RM13.00";
		for(int j=0; j<breads.length; j++){
				System.out.println(breads[j]);
		}
		System.out.println();	
		
		//4.
		System.out.println("Quantity of Item wanted: ");
		//integer1 = sc.nextInt();
		System.out.print("White Bread		=");
		num1 = in.nextInt();
		System.out.print("Wheat Bread 		=");
		num2 = in.nextInt();
		System.out.print("Whole Grain Bread  	=");
		num3 = in.nextInt();
		System.out.print("Rye Bread		=");
		num4 = in.nextInt();
		System.out.print("French Bread		=");
		num5 = in.nextInt();
		System.out.print("Hot-Dog Bread		=");
		num6 = in.nextInt();
		System.out.println();

		
		System.out.println();
		
		//5.
		 sum = ((num1*5) + (num2*7) + (num3*9) + (num4*3) + (num5*10) + (num6*13));
		 
			System.out.println("Total Price: RM " + sum);
			
			if (sum > 100) {
				System.out.println("Discount : RM" + sum*0.20);
				System.out.println("Price need to be paid : RM" + (sum-(sum*0.20)));
			}else if (sum < 100) {
				System.out.println("No Discount for this purchase!");
				System.out.println("Price need to be paid : RM " + sum);
			}
				System.out.println();
					
			
			System.out.println("Please rate our service / shop quality!");
			System.out.println("Please enter either of the three rates below!");
			System.out.println("Excellent!(1)");
			System.out.println("Good!(2)");
			System.out.println("Still have room of improvement!(3)");
			
			//while loop
			String rate1 = in.next();
			String[] rating = {rate1};
			int k = 0;
			//while (k<rating.length) {
				while(!rate1.equals("1") && !rate1.equals("2") && !rate1.equals("3")) {
					System.out.println("I have no idea!Good Bye!");
					rate1 = in.nextLine();
				}
				if (rate1.equals("1")) {
				System.out.println("I think the service / shop quality of The Bakery House is excellent!");
				}
				else if(rate1.equals("2")) {
					System.out.println("I think the service / shop quality of The Bakery House is good!");
				}
				else if(rate1.equals("3")) {
					System.out.println("I think the service / shop quality of The Bakery House is still have room of improvement!");
					break;
				}
				System.out.println("Do you want to shop again?(Y/y or N/n)");
				answer = in.next().charAt(0);
		}while(answer == 'y' || answer == 'Y');
			
			}else if(input1.equals("2")) {
				System.out.println("Bye-bye! Have a good day!");
			
			
	}
	}
	
    private static void Cake() {
    	
		String[] cake = {"blackforest","carrot","redvelvet"};
		int[] price = {120,90,130};
		
		name (cake);
		System.out.println();
		
		money (price);
		System.out.println();
		System.out.println();
		
		calculation();
		
		System.out.println("-------------------------------------");
		}
	
	
	public static void name (String[] x) {
	
		System.out.println("The lists of cake: " );
		for (int i = 0; i<x.length;i++) {
			System.out.println(x[i]);
		}	
	}
	
	public static void money (int[] y) {
		System.out.println("The price of blackforest cake, carrot cake and redvelvet cake is " );
			for (int j =0; j<y.length;j++) {
				System.out.print("RM"+ y[j]+" ");
			}
			
	}
	
	public static void calculation() {
		Scanner in = new Scanner(System.in);
		
		String[] cake = {"blackforest","carrot","redvelvet"};
		int[] price = {120,90,130};
		
		System.out.print("Quantity of "+cake[0]+ " cake:");
		int qcake1 = in.nextInt();
		System.out.print("Quantity of "+cake[1]+ " cake:");
		int qcake2 = in.nextInt();
		System.out.print("Quantity of "+cake[2]+ " cake:");
		int qcake3 = in.nextInt();
		System.out.println();
		
		double sum, dis, paid;
		sum = (price[0]*qcake1)+(price[1]*qcake2)+(price[2]*qcake3);
		
		if(sum > 200 && sum <=400) {//if sum more than 200 got 10% discount
			paid = sum * 90/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}else if (sum > 400 && sum <=600) {//if sum more than 400 got 20% discount
			paid = sum * 80/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}else if (sum > 600) {//if sum more than 600 got 30% discount
			paid = sum * 70/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}
		
	}
	
	public static void Rice() {
		Scanner in = new Scanner (System.in);
	String[] product = {"White Rice", "Brown Rice", "Red Rice", " Black Rice", "Jasmine Rice", 
				"Basmati Rice", "Japonica Rice", "Glutinous Rice", "Wild Rice"};
		int [] price = {20,25,45,46,50,50,52,54,30};
	
		for (int i = 0; i<product.length;i++) {
			
			System.out.println(product[i] + " : RM" + price[i] +" per pack");}
		
		System.out.print("What type of rice would you like to purchase?");
		double WhiteRice = 20;
		double BrownRice = 25;
		double RedRice = 45;
		double BlackRice = 46;
		double JasmineRice = 50;
		double BasmatiRice = 50;
		double JaponicaRice = 52;
		double GlutinousRice = 54;
		double WildRice = 30;
		
		int q_item1, q_item2, q_item3, q_item4, q_item5, q_item6, q_item7, q_item8, q_item9;
		double p_item1 = 0, p_item2 = 0, p_item3 = 0, p_item4 = 0, p_item5 = 0, p_item6 = 0, p_item7 = 0, p_item8 = 0, p_item9 = 0;
		System.out.println("Enter 'y' for yes and enter 'n' for no" );
		System.out.print("Your answer is: ");
		char answer = in.next().charAt(0);
		if (answer == 'y') {
			System.out.println("How many pack of White Rice you want to buy?");
			 q_item1 = in.nextInt();
			 p_item1 = WhiteRice * q_item1;
			 System.out.println("How many pack of Brown Rice you want to buy?");
			 q_item2 = in.nextInt();
			 p_item2 = BrownRice * q_item2;
			 System.out.println("How many pack ofRed Rice you want to buy?");
			 q_item3 = in.nextInt();
			 p_item3 = RedRice * q_item3;
			 System.out.println("How many pack of Black Rice you want to buy?");
			 q_item4 = in.nextInt();
			 p_item4 = BlackRice * q_item4;
			 System.out.println("How many pack of Jasmine Rice you want to buy?");
			 q_item5 = in.nextInt();
			 p_item5 = JasmineRice * q_item5;
			 System.out.println("How many pack of Basmati Rice you want to buy?");
			 q_item6 = in.nextInt();
			 p_item6 = BasmatiRice * q_item6;
			 System.out.println("How many pack of Japonica Rice you want to buy?");
			 q_item7 = in.nextInt();
			 p_item7 = JaponicaRice * q_item7;
			 System.out.println("How many pack of Glutinous Rice you want to buy?");
			 q_item8 = in.nextInt();
			 p_item8 = GlutinousRice * q_item8;
			 System.out.println("How many pack of Wild Rice you want to buy?");
			 q_item9 = in.nextInt();
			 p_item9 = WildRice * q_item9; 
			 
		}else if (answer == 'n') {
					System.out.println("Thank You!");
				
		}
		int i=0;
		while(i<1){
		double Totalprice = p_item1 + p_item2 + p_item3 + p_item4 + p_item5 + p_item6 + p_item7 + p_item8 + p_item9;
		System.out.println ("The total price is: " + Totalprice);

			//Discount
				if (Totalprice > 100) {
					double discount = Totalprice * 0.2;
					double total = (Totalprice - discount);
					System.out.println("Discount received: RM" + discount );
					System.out.println("price to be paid: RM" + total);
				}
					else {
						double discount = Totalprice * 0.1;
						double total = (Totalprice - discount);
						System.out.println("Discount received: RM" + discount );
						System.out.println("price to be paid: RM" + total);
					}
				System.out.println("Thank you very much!");
				
				i++;
			} 
		
	}

	public static void Desserts() {
        Scanner in = new Scanner (System.in);
	    
	    System.out.println("Here is the list of menu of our desserts:");
	    String[] menu = {"Cookies","Puddings","Pastries"};
	    System.out.println();
	    System.out.println("---------------");
	    System.out.println(menu[0]);
	    System.out.println(menu[1]);
	    System.out.println(menu[2]);
	    
	    System.out.println("Price of Cookies: RM1.00");
	    System.out.println("Price of Puddings: RM1.20");
	    System.out.println("Price of Pastries: RM1.30");
	    						
	    for(int f=1; f <50; f++) {
	    System.out.print("_");}
	            
	    System.out.println();
	    System.out.println("Cookies purchased? (true or false)");
		boolean cookies = in.nextBoolean();
		System.out.println("Puddings purchased? (true or false)");
	    boolean puddings = in.nextBoolean();
		System.out.println("Pastries purchased? (true or false)");
	    boolean pastries = in.nextBoolean();
	    
	    if(cookies && !(puddings || pastries)) {
	    	System.out.println("Enter the quantity of cookies purchased:");
			int quantity = in.nextInt();
			double price1 = 1.00;
			double total = quantity*price1 ;
			System.out.println("Total price: RM" + total + "0");
			}
		else if(puddings && !(cookies || pastries)) {
			System.out.println("Enter the quantity of puddings purchased:");
			int quantity = in.nextInt();
			double price2 = 1.20;
			double total = quantity*price2;
			System.out.println("Total price: RM" + total + "0");
		}
		else if(pastries && !(cookies || puddings)) {
			System.out.println("Enter the quantity of pastries purchased:");
			int quantity = in.nextInt();
			double price3 = 1.30;
			double total = quantity*price3;
			System.out.println("Total price: RM" + total + "0");
			}
		else if(puddings && pastries && !(cookies)) {
			System.out.println("Enter the quantity of puddings purchased:");
			int quantity = in.nextInt();
			System.out.println("Enter the quantity of pastries purchased:");
			int quantity1 = in.nextInt();
			double price2 = 1.20;
			double price3 = 1.30;
			double total [] = {(quantity*price2), (quantity1*price3)};
			double total1 =  0;
			for(int i=0; i<total.length;i++) {
				total1 = total1 + total[i];
			}
			System.out.println("Total price: RM" + total1 + "0");
			}
		else if(cookies && pastries && !(puddings)) {
			System.out.println("Enter the quantity of cookies purchased:");
			int quantity = in.nextInt();
			System.out.println("Enter the quantity of pastries purchased:");
			int quantity1 = in.nextInt();
			double price1 = 1.00;
			double price3 = 1.30;
			double total [] = {(quantity*price1), (quantity1*price3)};
			double total1 =  0;
			for(int i=0; i<total.length;i++) {
				total1 = total1 + total[i];}
			
			System.out.println("Total price: RM" + total1 + "0");
		}
		else if(cookies && puddings && !(pastries)) {
			System.out.println("Enter the quantity of cookies purchased:");
			int quantity = in.nextInt();
			System.out.println("Enter the quantity of puddings purchased:");
			int quantity1 = in.nextInt();
			double price1 = 1.00;
			double price2 = 1.20;
			double total [] = {(quantity*price1), (quantity1*price2)};
			double total1 =  0;
			for(int i=0; i<total.length;i++) {
				total1 = total1 + total[i];}
			
			System.out.println("Total price: RM" + total1 + "0");
			}
		else if(cookies && puddings && pastries) {
			System.out.println("Enter the quantity of cookies purchased:");
			int quantity = in.nextInt();
			System.out.println("Enter the quantity of puddings purchased:");
			int quantity1 = in.nextInt();
			System.out.println("Enter the quantity of pastries purchased:");
			int quantity2 = in.nextInt();
			double price1 = 1.00;
			double price2 = 1.20;
			double price3 = 1.30;
			double total [] = {(quantity*price1), (quantity1*price2), (quantity2*price3)};
			double total1 =  0;
			for(int i=0; i<total.length;i++) {
				total1 = total1 + total[i];}
			
			System.out.println("Total price: RM" + total1 + "0");
	}
		else {
			System.out.println("Purchased failed, please try again. :( ");
		}
	    }

	public static void Fruits() {
		Scanner in = new Scanner (System.in);
		String [][] product = {{"Price of Apple","Price of Orange","Price of Pineapple"},{"RM1.20","RM1.30","RM1.50"}};
		System.out.println(product[0][0] + " " +product[1][0]);
        System.out.println(product[0][1] + " " +product[1][1]);
        System.out.println(product[0][2] + " " +product[1][2]);
        
		System.out.println();
		
		for (int i=0; i<50; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		System.out.println("Apple purchased? (true or false)");
			boolean apple = in.nextBoolean();
			System.out.println("Oranges purchased? (true or false)");
		    boolean orange = in.nextBoolean();
			System.out.println("Pineapples purchased? (true or false)");
		    boolean pineapple = in.nextBoolean();
		    
		    
			if(apple && !(orange || pineapple)) {
				PrintMethod1();
				}
			else if(orange && !(apple || pineapple)) {
				PrintMethod2();
			}
			else if(pineapple && !(apple || orange)) {
				PrintMethod3();
				}
			else if(orange && pineapple && !(apple)) {
				PrintMethod4();
				}
			else if(apple && pineapple && !(orange)) {
				PrintMethod5();
			}
			else if(apple && orange && !(pineapple)) {
				PrintMethod6();
				}
			else if(apple && orange && pineapple) {
				PrintMethod7();
		}
			else {
				System.out.println("Purchased failed, please try again. :( ");
			}
			
			in.close();

	}

	private static void PrintMethod1() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of apples purchased:");
		int quantity = in.nextInt();
		double price1 = 1.20;
		double total = quantity*price1 ;
		System.out.println("Total price: RM" + total + "0");
		in.close();
	}
	private static void PrintMethod2() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of oranges purchased:");
		int quantity = in.nextInt();
		double price2 = 1.30;
		double total = quantity*price2;
		System.out.println("Total price: RM" + total + "0");
		in.close();
	}
	private static void PrintMethod3() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of pineapple purchased:");
		int quantity = in.nextInt();
		double price3 = 1.50;
		double total = quantity*price3;
		System.out.println("Total price: RM" + total + "0");
		in.close();
	}
	private static void PrintMethod4() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of orange purchased:");
		int quantity = in.nextInt();
		System.out.println("Enter the quantity of pineapple purchased:");
		int quantity1 = in.nextInt();
		double price2 = 1.30;
		double price3 = 1.50;
		double total [] = {(quantity*price2), (quantity1*price3)};
		double total1 =  0;
		for(int i=0; i<total.length;i++) {
			total1 = total1 + total[i];
		}
		System.out.println("Total price: RM" + total1 + "0");
		in.close();
	}
	private static void PrintMethod5() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of apples purchased:");
		int quantity = in.nextInt();
		System.out.println("Enter the quantity of pineapple purchased:");
		int quantity1 = in.nextInt();
		double price1 = 1.20;
		double price3 = 1.50;
		double total [] = {(quantity*price1), (quantity1*price3)};
		double total1 =  0;
		for(int i=0; i<total.length;i++) {
			total1 = total1 + total[i];}
		
		System.out.println("Total price: RM" + total1 + "0");
		in.close();
	}
	private static void PrintMethod6() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of apples purchased:");
		int quantity = in.nextInt();
		System.out.println("Enter the quantity of oranges purchased:");
		int quantity1 = in.nextInt();
		double price1 = 1.20;
		double price2 = 1.30;
		double total [] = {(quantity*price1), (quantity1*price2)};
		double total1 =  0;
		for(int i=0; i<total.length;i++) {
			total1 = total1 + total[i];}
		
		System.out.println("Total price: RM" + total1 + "0");
		in.close();
	}
	private static void PrintMethod7() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the quantity of apples purchased:");
		int quantity = in.nextInt();
		System.out.println("Enter the quantity of oranges purchased:");
		int quantity1 = in.nextInt();
		System.out.println("Enter the quantity of pineapples purchased:");
		int quantity2 = in.nextInt();
		double price1 = 1.20;
		double price2 = 1.30;
		double price3 = 1.50;
		double total [] = {(quantity*price1), (quantity1*price2), (quantity2*price3)};
		double total1 =  0;
		for(int i=0; i<total.length;i++) {
			total1 = total1 + total[i];}
		
		System.out.println("Total price: RM" + total1 + "0");
		in.close();
	}
	}

