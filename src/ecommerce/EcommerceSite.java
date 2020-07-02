package ecommerce;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Bill{
	private int slNo;
	private String item;
	private double cost;
	private int quantity;
	private double total;
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Bill() {
		super();
	}
	public Bill(int slNo, String item, double cost, int quantity, double total) {
		super();
		this.slNo = slNo;
		this.item = item;
		this.cost = cost;
		this.quantity = quantity;
		this.total = total;
	}
	
}

class HomePage{
	static boolean isHomePageRepeat = false;
	static int categorieChoice;
	static int noOfItemPersentInCart;
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Bill> lists =new ArrayList<Bill>();
	public static void homePage() {
		System.out.println("             *****WELCOME TO HOME PAGE**** ");
		System.out.println("CATEGORIES "
				         + "\n1. Cloths "
				         + "\n2. Electronics "
				         + "\n3. HomeApplication "
				         + "\n4. Books "
				         + "\n5. Healths \n6. FootWears "
				         + "\n7. View Cart "
				         + "\n8. Remove Cart "
				         + "\n9. Exit "
				         + "\nselect choice: ");
		categorieChoice = scan.nextInt();
		isHomePageRepeat = true;
	}
	
	public static void viewCart() {
		System.out.println("-----------------------------------------------------");
		System.out.printf("%-5s%-15s%-10s%-5s%-13s%n","SL.NO","| Item","| Cost Rs","| Qty","| Total");
		System.out.println("-----------------------------------------------------");
		for(Bill list : lists) {
			System.out.printf("%-5s%-15s%-10s%-5s%-13s%n",list.getSlNo() + " ",list.getItem()+ " ",list.getCost()+ " ",list.getQuantity()+ " ",list.getTotal()+" ");
		}
		
	}
	
	public static void displayBill() {
		int totalQty = 0;
		double subTotal = 0;
		System.out.println("***********    ShoppingAdda Bill   ************ ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		Date date =  java.util.Calendar.getInstance().getTime();
		System.out.println("Date : " + date);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println();
		System.out.printf("%-5s%-15s%-10s%-5s%-13s%n","SL.NO"," Item"," Cost Rs"," Qty"," Total");
		for(Bill list : lists) {
			System.out.printf("%-5s%-15s%-10s%-5s%-13s%n",list.getSlNo() + " ",list.getItem()+ " ",list.getCost()+ " ",list.getQuantity()+ " ",list.getTotal()+" ");
			totalQty += list.getQuantity(); 
			subTotal += list.getTotal();
		}
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Total Qty: " + totalQty + "       " + "Sub Total:          " + subTotal);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		double gst = (subTotal*9)/100;
		System.out.println("CGST           @9%                                " + gst);
		System.out.println("SGST           @9%                                " + gst);
		System.out.println("TotalGst     @9%                                  " + gst*2);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Grand Total:                            " + (subTotal + (gst*2)));
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("        Thank you for visiting *SHOPPINGADDA* ");
		System.out.println("             Have a Nice Day ! ");
		System.out.println("                Visit again.... ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
	}
	
	public static void ExitCall() {
		System.out.println("Do you want to exit? "
		         + "\n1. Bill "
		         + "\n2. Home page "
		         + "\n3. Exit");
        int exitChoice = scan.nextInt();
        switch(exitChoice) {
        case 1:
	       HomePage.displayBill();
	       break;
        case 2:
	       HomePage.homePage();
	       break;
        case 3:
	      System.exit(0);
        default:
			System.out.println("Invalid Choice");
        }
	}
	
	public static void noOfItemInCart() {
		for(Bill list : lists) {
			HomePage.noOfItemPersentInCart += list.getQuantity();
		}
		
			
	}
	
	public static void removeCart(int slNo) {
		lists.remove(slNo-1);
	}
	
	public static class Cloths{
		static int clothChoiceFor;
	    public static void cloths(){
	    	System.out.println("*****************************************************");
	    	System.out.println("CLOTHS "
	    			         + "\n1. Men's "
	    			         + "\n2. Women's "
	    			         + "\n3. Kid's "
	    			         + "\n4. Home page "
	    			         + "\n5. Exit "
	    			         + "\nselect choice:");
	    	clothChoiceFor = scan.nextInt();
	    	
	    }
	    public static class Mens{
	    	static int clothChoice;
	    	public static void mens() {
	    		System.out.println("*****************************************************");
	    		System.out.println("MEN'S "
	    				         + "\n1. Tshirts "
	    				         + "\n2. Shirts "
	    				         + "\n3. Pants "
	    				         + "\n4. Shorts "
	    				         + "\n5. Previous page "
	    				         + "\n6. Home Page "
	    				         + "\n7. Exit "
	    				         + "\nSelect choice:");
	    		clothChoice = scan.nextInt();
	    	}
	    	public static void tshirts() {
    			System.out.println(".....................................................");
    			System.out.println("T SHIRTS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
    			
    		}
	    	public static void shirts() {
	    		System.out.println(".....................................................");
    			System.out.println("SHIRTS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
	    	}
	    	
	    	public static void pants() {
	    		System.out.println(".....................................................");
    			System.out.println("PANTS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
	    	}
	    	
	    	public static void shorts() {
	    		System.out.println(".....................................................");
    			System.out.println("SHORTS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
	    	}
	    }
	    
	    public static class Womens{
	    	static int clothChoice;
	    	public static void womens() {
	    		System.out.println("*****************************************************");
	    		System.out.println("WOMEN'S "
	    				         + "\n1. Sharee "
	    				         + "\n2. Shirts "
	    				         + "\n3. Legins "
	    				         + "\n4. Shorts "
	    				         + "\n5. Previous page "
	    				         + "\n6. Home Page "
	    				         + "\n7. Exit "
	    				         + "\nSelect choice:");
	    		clothChoice = scan.nextInt();
	    	}
	    	public static void sharee() {
    			System.out.println(".....................................................");
    			System.out.println("SHAREE "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
    			
    		}
	    	public static void shirts() {
	    		System.out.println(".....................................................");
    			System.out.println("SHIRTS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
	    	}
	    	
	    	public static void legins() {
	    		System.out.println(".....................................................");
    			System.out.println("LEGINS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
	    	}
	    	
	    	public static void shorts() {
	    		System.out.println(".....................................................");
    			System.out.println("SHORTS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity + " items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
	    	}
	    }
	    
	    public static class Kids{
	    	static int clothChoice;
	    	public static void kids() {
	    		System.out.println("*****************************************************");
	    		System.out.println("KID'S "
	    				         + "\n1. Tshirts "
	    				         + "\n2. Shirts "
	    				         + "\n3. Pants "
	    				         + "\n4. Shorts "
	    				         + "\n5. Previous page "
	    				         + "\n6. Home Page "
	    				         + "\n7. Exit "
	    				         + "\nSelect choice:");
	    		clothChoice = scan.nextInt();
	    	}
	    	public static void tshirts() {
    			System.out.println(".....................................................");
    			System.out.println("T SHIRTS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " +  noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity + " items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
    			
    		}
	    	public static void shirts() {
	    		System.out.println(".....................................................");
    			System.out.println("SHIRTS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
	    	}
	    	
	    	public static void pants() {
	    		System.out.println(".....................................................");
    			System.out.println("PANTS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
	    	}
	    	
	    	public static void shorts() {
	    		System.out.println(".....................................................");
    			System.out.println("SHORTS "
    					         + "\n1. Puma          Rate=Rs900 "
    					         + "\n2. U.S.polo      Rate=Rs850 "
    					         + "\n3. PeterEnglend  Rate=Rs840 "
    					         + "\n4. Adidas        Rate=Rs860 "
    					         + "\n5. Lacoste       Rate=Rs950 "
    					         + "\n6. Gucci         Rate=Rs908 "
    					         + "\n7. Previouspage "
    					         + "\n8. Home Page "
    					         + "\n9. Exit "
    					         + "\nSelect choice:");
    			int shirtChoice = scan.nextInt();
    			char isConfirm=' ';
    			int noOfQuantity = 0;
    			switch(shirtChoice) {
    			case 1:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 2:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"USpolo",850,noOfQuantity,noOfQuantity*850));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 3:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"PeterEnglend",840,noOfQuantity,noOfQuantity*840));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 4:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Adidas",860,noOfQuantity,noOfQuantity*860));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 5:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"Lacoste",950,noOfQuantity,noOfQuantity*950));	
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 6:
    				System.out.println();
        			System.out.println();
        			System.out.println("Enter the Quantity");
        			System.out.println();
        			System.out.println();
        			noOfQuantity = scan.nextInt();
        			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
        			isConfirm = scan.next().charAt(0);
        			if(isConfirm == 'Y') {
        				lists.add(new Bill(lists.size()+1,"OfGucci",900,noOfQuantity,noOfQuantity*900));
        			}
        			System.out.println(noOfQuantity + " Item added to cart");
        			HomePage.homePage();
        			break;
    			case 7:
    				Mens.mens();
    				break;
    			case 8:
    				HomePage.homePage();
    				break;
    			case 9:
    				HomePage.ExitCall();
    				break;
    			default:
    				System.out.println("Invalid Choice");
    			}
	    	}
	    }
	}
	
	public static class Electronics{
		static int electronicChoiceFor;
	    public static void electronics(){
	    	System.out.println("*****************************************************");
	    	System.out.println("Electronics "
	    			         + "\n1. Mobile's "  
	    			         + "\n2. Telivision "
	    			         + "\n3. Washing machine "
	    			         + "\n4. Laptop's "
	    			         + "\n5. Camera's "
	    			         + "\n6. Previous Page "
	    			         + "\n7. Home Page "
	    			         + "\nselect choice: ");
	    	electronicChoiceFor = scan.nextInt();
	    	
	    }
	    
	    public static void mobile() {
    		System.out.println(".....................................................");
			System.out.println("MOBILE "
					         + "\n1. Sony    Rate=Rs150000 "
					         + "\n2. Samsung   Rate=Rs100000 "
					         + "\n3. Onida   Rate=Rs85000 "
					         + "\n4. LG    Rate=Rs50000 "
					         + "\n5. Previous Page "
					         + "\n6. Home Page "
					         + "\nSelect choice:");
			int mobileChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(mobileChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Sony",150000,noOfQuantity,noOfQuantity*150000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Samsung",100000,noOfQuantity,noOfQuantity*100000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Onida",85000,noOfQuantity,noOfQuantity*85000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"LG",50000,noOfQuantity,noOfQuantity*50000));	
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 5:
				Electronics.electronics();
    			break;
			case 6:
    			HomePage.homePage();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
    	}
	    
	    public static void telivision() {
	    	System.out.println(".....................................................");
			System.out.println("TELIVISION "
					         + "\n1. Sony    Rate=Rs150000 "
					         + "\n2. Samsung   Rate=Rs100000 "
					         + "\n3. Onida   Rate=Rs85000 "
					         + "\n4. LG    Rate=Rs50000 "
					         + "\n5. Previous Page "
					         + "\n6. Home Page "
					         + "\nSelect choice:");
			int telivisionChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(telivisionChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Sony",150000,noOfQuantity,noOfQuantity*150000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Samsung",100000,noOfQuantity,noOfQuantity*100000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity + " items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Onida",85000,noOfQuantity,noOfQuantity*85000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity + " items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"LG",50000,noOfQuantity,noOfQuantity*50000));	
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 5:
				Electronics.electronics();
    			break;
			case 6:
    			HomePage.homePage();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
	    
        public static void washingMachine() {
        	System.out.println(".....................................................");
			System.out.println("WASHINGMACHINE "
					         + "\n1. Sony    Rate=Rs150000 "
					         + "\n2. Samsung   Rate=Rs100000 "
					         + "\n3. Onida   Rate=Rs85000 "
					         + "\n4. LG    Rate=Rs50000 "
					         + "\n5. Previous Page "
					         + "\n6. Home Page "
					         + "\nSelect choice:");
			int washingMachineChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(washingMachineChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Sony",150000,noOfQuantity,noOfQuantity*150000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Samsung",100000,noOfQuantity,noOfQuantity*100000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Onida",85000,noOfQuantity,noOfQuantity*85000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"LG",50000,noOfQuantity,noOfQuantity*50000));	
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 5:
				Electronics.electronics();
    			break;
			case 6:
    			HomePage.homePage();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
        
        public static void laptops() {
        	System.out.println(".....................................................");
			System.out.println("LAPTOPS "
					         + "\n1. Sony    Rate=Rs150000 "
					         + "\n2. Samsung   Rate=Rs100000 "
					         + "\n3. Onida   Rate=Rs85000 "
					         + "\n4. LG    Rate=Rs50000 "
					         + "\n5. Previous Page "
					         + "\n6. Home Page "
					         + "\nSelect choice:");
			int laptopsChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(laptopsChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Sony",150000,noOfQuantity,noOfQuantity*150000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Samsung",100000,noOfQuantity,noOfQuantity*100000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Onida",85000,noOfQuantity,noOfQuantity*85000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"LG",50000,noOfQuantity,noOfQuantity*50000));	
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 5:
				Electronics.electronics();
    			break;
			case 6:
    			HomePage.homePage();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
        
        public static void cameras() {
        	System.out.println(".....................................................");
			System.out.println("CAMERAS "
					         + "\n1. Sony    Rate=Rs150000 "
					         + "\n2. Samsung   Rate=Rs100000 "
					         + "\n3. Onida   Rate=Rs85000 "
					         + "\n4. LG    Rate=Rs50000 "
					         + "\n5. Previous Page "
					         + "\n6. Home Page "
					         + "\nSelect choice:");
			int camerasChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(camerasChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Sony",150000,noOfQuantity,noOfQuantity*150000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Samsung",100000,noOfQuantity,noOfQuantity*100000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Onida",85000,noOfQuantity,noOfQuantity*85000));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"LG",50000,noOfQuantity,noOfQuantity*50000));	
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 5:
				Electronics.electronics();
    			break;
			case 6:
    			HomePage.homePage();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
	}
	
    public static class HomeApplication{
		
	}
    
    public static class Books{
    	static int booksChoiceFor;
	    public static void books(){
	    	System.out.println("*****************************************************");
	    	System.out.println("BOOKS "
	    			         + "\n1. Novels "
	    			         + "\n2. Fiction Book "
	    			         + "\n3. EBooks "
	    			         + "\n4. Home Page "
	    			         + "\n5. Exit "
	    			         + "\nselect choice:");
	    	booksChoiceFor = scan.nextInt();
	    	
	    }
	    
	    public static void novels() {
    		System.out.println(".....................................................");
    		System.out.println("NOVELS "
			         + "\n1. Work Smarter Not Harder    Rate=Rs230 "
			         + "\n2. I Will Teach You Excel   Rate=Rs140 "
			         + "\n3. Google Adwords      Rate=Rs300 "
			         + "\n4. Previous Page "
			         + "\n5. Home Page \r\n"  
			         + "\n6. Exit "
			         + "\nselect choice:  ");
			int novelsChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(novelsChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Work Smarter Not Harder",230,noOfQuantity,noOfQuantity*230));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"I Will Teach You Excel",140,noOfQuantity,noOfQuantity*140));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Google Adwords",300,noOfQuantity,noOfQuantity*300));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				Books.books();
    			break;
			case 5:
    			HomePage.homePage();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
	    
	    public static void fictionBook() {
    		System.out.println(".....................................................");
    		System.out.println("FICTIONBOOK "
			         + "\n1. Work Smarter Not Harder    Rate=Rs230 "
			         + "\n2. I Will Teach You Excel   Rate=Rs140 "
			         + "\n3. Google Adwords      Rate=Rs300 "
			         + "\n4. Previous Page "
			         + "\n5. Home Page \r\n"  
			         + "\n6. Exit "
			         + "\nselect choice:  ");
			int fictionBookChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(fictionBookChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Work Smarter Not Harder",230,noOfQuantity,noOfQuantity*230));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"I Will Teach You Excel",140,noOfQuantity,noOfQuantity*140));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Google Adwords",300,noOfQuantity,noOfQuantity*300));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				Books.books();
    			break;
			case 5:
    			HomePage.homePage();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
	    
	    public static void ebooks() {
    		System.out.println(".....................................................");
    		System.out.println("EBOOKS "
			         + "\n1. Work Smarter Not Harder    Rate=Rs230 "
			         + "\n2. I Will Teach You Excel   Rate=Rs140 "
			         + "\n3. Google Adwords      Rate=Rs300 "
			         + "\n4. Previous Page "
			         + "\n5. Home Page \r\n"  
			         + "\n6. Exit "
			         + "\nselect choice:  ");
			int ebooksChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(ebooksChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Work Smarter Not Harder",230,noOfQuantity,noOfQuantity*230));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"I Will Teach You Excel",140,noOfQuantity,noOfQuantity*140));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Google Adwords",300,noOfQuantity,noOfQuantity*300));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				Books.books();
    			break;
			case 5:
    			HomePage.homePage();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }

	}
    
    public static class Healths{
    	static int healthsChoiceFor;
	    public static void healths(){
	    	System.out.println("*****************************************************");
	    	System.out.println("HEALTHS "
	    			         + "\n1. Ayurveda "
	    			         + "\n2. Vitamins "
	    			         + "\n3. SkinCare "  
	    			         + "\n4. Home Page "
	    			         + "\n5. Exit "
	    			         + "\nSelect choice:");
	    	healthsChoiceFor = scan.nextInt();
	    	
	    }
	    
	    public static void ayurveda() {
    		System.out.println(".....................................................");
    		System.out.println("AYURVEDA "
    				         + "\n1. Sports     Rate=Rs2500 "
    				         + "\n2. Family Nutrition   Rate=Rs1800 "
    				         + "\n3. Ayurveda Nutrition  Rate=Rs2220 "
    				         + "\n4.Previous Page "
    				         + "\n5. Home Page "
    				         + "\n6. Exit "
    				         + "\nSelect choice:");
			int ayurvedaChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(ayurvedaChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Sports",2500,noOfQuantity,noOfQuantity*2500));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Family Nutrition",1800,noOfQuantity,noOfQuantity*1800));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Ayurveda Nutrition",2220,noOfQuantity,noOfQuantity*2220));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				Healths.healths();
				break;
			case 5:
				HomePage.homePage();
    			break;
			case 6:
				HomePage.ExitCall();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
	    
	    public static void vitamins() {
    		System.out.println(".....................................................");
    		System.out.println("VITAMINS "
    				         + "\n1. Sports     Rate=Rs2500 "
    				         + "\n2. Family Nutrition   Rate=Rs1800 "
    				         + "\n3. Ayurveda Nutrition  Rate=Rs2220 "
    				         + "\n4.Previous Page "
    				         + "\n5. Home Page "
    				         + "\n6. Exit "
    				         + "\nSelect choice:");
			int vitaminsChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(vitaminsChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Sports",2500,noOfQuantity,noOfQuantity*2500));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Family Nutrition",1800,noOfQuantity,noOfQuantity*1800));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Ayurveda Nutrition",2220,noOfQuantity,noOfQuantity*2220));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				Healths.healths();
				break;
			case 5:
				HomePage.homePage();
    			break;
			case 6:
				HomePage.ExitCall();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
	    
	    public static void skinCare() {
    		System.out.println(".....................................................");
    		System.out.println("SKINCARE "
    				         + "\n1. Sports     Rate=Rs2500 "
    				         + "\n2. Family Nutrition   Rate=Rs1800 "
    				         + "\n3. Ayurveda Nutrition  Rate=Rs2220 "
    				         + "\n4.Previous Page "
    				         + "\n5. Home Page "
    				         + "\n6. Exit "
    				         + "\nSelect choice:");
			int skinCareChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(skinCareChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Sports",2500,noOfQuantity,noOfQuantity*2500));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Family Nutrition",1800,noOfQuantity,noOfQuantity*1800));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Ayurveda Nutrition",2220,noOfQuantity,noOfQuantity*2220));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				Healths.healths();
				break;
			case 5:
				HomePage.homePage();
    			break;
			case 6:
				HomePage.ExitCall();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
	}

    public static class FootWears{
    	static int FootWearsChoiceFor;
	    public static void footWears(){
	    	System.out.println("*****************************************************");
	    	System.out.println("FOOT WEAR'S "
	    			         + "\n1. Shoes "
	    			         + "\n2. Slippers "
	    			         + "\n3. Previous Page "
	    			         + "\n4. Home Page "
	    			         + "\n5. Exit "
	    			         + "\nSelect choice:");
	    	FootWearsChoiceFor = scan.nextInt();
	    	
	    }
	    
	    public static void shoes() {
    		System.out.println(".....................................................");
    		System.out.println("SHOES "
    				         + "\n1. Puma    Rate=Rs900 "
    				         + "\n2. Nike    Rate=Rs700 "
    				         + "\n3. Sparx       Rate=Rs800 "
    				         + "\n4. Previous Page "
    				         + "\n5. Home Page "
    				         + "\n6. Exit "
    				         + "\nSelect choice:");
			int shoesChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(shoesChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Nike",700,noOfQuantity,noOfQuantity*700));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Sparx",800,noOfQuantity,noOfQuantity*800));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				FootWears.footWears();
				break;
			case 5:
				HomePage.homePage();
    			break;
			case 6:
				HomePage.ExitCall();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
	    
	    public static void slippers() {
    		System.out.println(".....................................................");
    		System.out.println("SLIPPERS "
    				         + "\n1. Puma    Rate=Rs900 "
    				         + "\n2. Nike    Rate=Rs700 "
    				         + "\n3. Sparx       Rate=Rs800 "
    				         + "\n4. Previous Page "
    				         + "\n5. Home Page "
    				         + "\n6. Exit "
    				         + "\nSelect choice:");
			int slippersChoice = scan.nextInt();
			char isConfirm=' ';
			int noOfQuantity = 0;
			switch(slippersChoice) {
			case 1:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Puma",900,noOfQuantity,noOfQuantity*900));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 2:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Nike",700,noOfQuantity,noOfQuantity*700));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 3:
				System.out.println();
    			System.out.println();
    			System.out.println("Enter the Quantity");
    			System.out.println();
    			System.out.println();
    			noOfQuantity = scan.nextInt();
    			System.out.println("are you sure want to add " + noOfQuantity +" items to cart\nDo you want to continue? Y/N");
    			isConfirm = scan.next().charAt(0);
    			if(isConfirm == 'Y') {
    				lists.add(new Bill(lists.size()+1,"Sparx",800,noOfQuantity,noOfQuantity*800));
    			}
    			System.out.println(noOfQuantity + " Item added to cart");
    			HomePage.homePage();
    			break;
			case 4:
				FootWears.footWears();
				break;
			case 5:
				HomePage.homePage();
    			break;
			case 6:
				HomePage.ExitCall();
    			break;
			default:
				System.out.println("Invalid Choice");
			}
	    }
    }
}

public class EcommerceSite {

	public static void main(String[] args) {
		System.out.println("Enter Shoping website");
		Scanner scan = new Scanner(System.in);
		String website = scan.nextLine();
		Date date =  java.util.Calendar.getInstance().getTime();
		if(website.equalsIgnoreCase("shoppingadda.com")) {
			System.out.println();
			System.out.println();
			System.out.println("                     ****|SHOPPINGADDA|**** ");
			System.out.println();
			System.out.println();
			System.out.println("               ****WELCOME TO SHOPPINGADDA*** ");
			System.out.println();
			System.out.println();
			System.out.println("  Date and Time :" +date);
			System.out.println("*****************************************************");
			System.out.println(" HAPPY NEW YEAR dont expect any discount...!! ");
			System.out.println();
			System.out.println();
			System.out.println("Enter your name:");
			
			boolean isNameInProperFormate = true;
			boolean isNumberInProperFormate = true;
			while(isNameInProperFormate) {
				String name = scan.nextLine();
				if(name.length()==(name.replace(" ", "")).length()) {
					isNameInProperFormate=false;
					System.out.println();
					System.out.println();
					System.out.println("Enter your Phone number(10digit):");
					while(isNumberInProperFormate) {
						String number = scan.nextLine();
						if(number.length()==10) {
							isNumberInProperFormate=false;
							System.out.println();
							System.out.println();
							System.out.println("    ***Welcome abc To ShoppingADDA*** ");
							System.out.println("*****************************************************");
							HomePage.homePage();
							while(HomePage.isHomePageRepeat) {
								switch(HomePage.categorieChoice) {
								case 1:
									HomePage.isHomePageRepeat = false;
									HomePage.Cloths.cloths();
									switch(HomePage.Cloths.clothChoiceFor) {
									case 1:
										HomePage.Cloths.Mens.mens();
										switch(HomePage.Cloths.Mens.clothChoice) {
										case 1:
											HomePage.Cloths.Mens.tshirts();
											break;
										case 2:
											HomePage.Cloths.Mens.shirts();
											break;
										case 3:
											HomePage.Cloths.Mens.pants();
											break;
										case 4:
											HomePage.Cloths.Mens.shorts();
											break;
										case 5:
											HomePage.Cloths.cloths();
											break;
										case 6:
											HomePage.homePage();
											break;
										case 7:
											HomePage.ExitCall();
											break;
											default:
												System.out.println("INVALID CHOICE");
										}
										break;
									case 2:
										HomePage.Cloths.Womens.womens();;
										switch(HomePage.Cloths.Womens.clothChoice) {
										case 1:
											HomePage.Cloths.Womens.sharee();
											break;
										case 2:
											HomePage.Cloths.Womens.shirts();
											break;
										case 3:
											HomePage.Cloths.Womens.legins();
											break;
										case 4:
											HomePage.Cloths.Womens.shorts();
											break;
										case 5:
											HomePage.Cloths.cloths();
											break;
										case 6:
											HomePage.homePage();
											break;
										case 7:
											HomePage.ExitCall();
											break;
											default:
												System.out.println("INVALID CHOICE");
										}
										break;
									case 3:
										HomePage.Cloths.Kids.kids();
										switch(HomePage.Cloths.Kids.clothChoice) {
										case 1:
											HomePage.Cloths.Kids.tshirts();
											break;
										case 2:
											HomePage.Cloths.Kids.shirts();
											break;
										case 3:
											HomePage.Cloths.Kids.pants();
											break;
										case 4:
											HomePage.Cloths.Kids.shorts();;
											break;
										case 5:
											HomePage.Cloths.cloths();
											break;
										case 6:
											HomePage.homePage();
											break;
										case 7:
											HomePage.ExitCall();
											break;
											default:
												System.out.println("INVALID CHOICE");
										}
										break;
									case 4:
										HomePage.homePage();
										break;
									case 5:
										HomePage.ExitCall();
										break;
										default:
											HomePage.ExitCall();
											break;
									}
									break;
								case 2:
									HomePage.isHomePageRepeat = false;
									HomePage.Electronics.electronics();
									switch(HomePage.Electronics.electronicChoiceFor) {
									case 1:
										HomePage.Electronics.mobile();
										break;
									case 2:
										HomePage.Electronics.telivision();
										break;
									case 3:
										HomePage.Electronics.washingMachine();
										break;
									case 4:
										HomePage.Electronics.laptops();
										break;
									case 5:
										HomePage.Electronics.cameras();
										break;
									case 6:
										HomePage.homePage();
										break;
									case 7:
										HomePage.homePage();
										break;
										default:
											System.out.println("Invalid choice");
									}
									break;
								case 4:
									HomePage.isHomePageRepeat = false;
									HomePage.Books.books();
									switch(HomePage.Books.booksChoiceFor) {
									case 1:
										HomePage.Books.novels();
										break;
									case 2:
										HomePage.Books.fictionBook();
										break;
									case 3:
										HomePage.Books.ebooks();
										break;
									case 4:
										HomePage.homePage();
										break;
									case 5:
										HomePage.ExitCall();;
										break;
										default:
											System.out.println("Invalid choice");
									}
									break;
								case 5:
									HomePage.isHomePageRepeat = false;
									HomePage.Healths.healths();
									switch(HomePage.Healths.healthsChoiceFor) {
									case 1:
										HomePage.Healths.ayurveda();
										break;
									case 2:
										HomePage.Healths.vitamins();
										break;
									case 3:
										HomePage.Healths.skinCare();
										break;
									case 4:
										HomePage.homePage();
										break;
									case 5:
										HomePage.ExitCall();;
										break;
										default:
											System.out.println("Invalid choice");
									}
									break;
								case 6:
									HomePage.isHomePageRepeat = false;
									HomePage.FootWears.footWears();
									switch(HomePage.FootWears.FootWearsChoiceFor) {
									case 1:
										HomePage.FootWears.shoes();
										break;
									case 2:
										HomePage.FootWears.slippers();
										break;
									case 3:
										HomePage.FootWears.footWears();
										break;
									case 4:
										HomePage.homePage();
										break;
									case 5:
										HomePage.ExitCall();;
										break;
										default:
											System.out.println("Invalid choice");
									}
									break;
								case 7:
									HomePage.isHomePageRepeat = false;
									HomePage.viewCart();
									HomePage.homePage();
									break;
								case 8:
									HomePage.isHomePageRepeat = false;
									System.out.println("Enter slNo to remove");
									int slNo = scan.nextInt();
									HomePage.removeCart(slNo);
									HomePage.homePage();
									break;
								case 9:
									HomePage.isHomePageRepeat = false;
									HomePage.ExitCall();
									break;
									default:
										HomePage.isHomePageRepeat = false;
										System.out.println("Invalid choice");
										HomePage.homePage();
								}
							}
							
						}else {
							System.out.println("Invalid Entry!! Retype your number.. ");
						}
					}
					
				}else {
					System.out.println("Invalid Entry!! Retype your name.. ");
				}
			}
			
			
		}

	}

}
