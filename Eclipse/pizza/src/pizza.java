import java.util.Scanner;


public class pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double LARGE = 14;
		final double MEDIUM = 12;
		final double SMALL = 10;
		double subtotal = 0;
		double total = 0;
		double pizzaCostRT = 0;
		double pizzaCostPT = 0;
		double pizzaCostALL = 0;
		double shippingCost = 0;
		double plainPizzaCost = 0;
		double pizzaCostAll2 = 0;
		double pizzaCostAll3 = 0;
		
		//variables above
		String name = "G. Hopper";
		//customer name
		double A = Math.pow(MEDIUM/2, 2);
		A = A * Math.PI;
		subtotal = (A * .05)*3;
		double tax = subtotal * .07;
		shippingCost = Math.min((subtotal + tax) / 10, 5);
		total = shippingCost + subtotal + tax;
		//toppings 
		//the cost of the pizza
		System.out.println("Geometry Joe's Pizza Parlor");
		System.out.println("Customer: " + name);
		System.out.print("3 Medium Pizzas: ");
		System.out.printf("%4.2f", subtotal);
		System.out.println();
		System.out.printf("%-5s%4.2f", "Tax: ", tax);
		System.out.println();
		System.out.printf("%-10s%4.2f", "Shipping: ", shippingCost);
		System.out.println();
		System.out.print("Total: ");
		System.out.printf("%9.2f", total);
		
//Above is all of the customer 1 print statements. Most work for customer 2 is below
		String name2 = "B. Gates";
		
		
		A = Math.pow(SMALL/2, 2);
		A = A * Math.PI;
		plainPizzaCost = A * .05;
		pizzaCostRT = SMALL * 0.49;
		pizzaCostPT = SMALL * 0.79;
		pizzaCostALL = Math.sqrt(pizzaCostRT) + Math.sqrt(pizzaCostPT)*2 + plainPizzaCost;
		pizzaCostALL = pizzaCostALL*2;
		
		//above is pizza cost for the 2 veggie pizzas for Bill Gates
		//below is the math for the meat lover pizza
		A = Math.pow(LARGE/2, 2);
		A = A * Math.PI;
		plainPizzaCost = A * .05;
		pizzaCostRT = LARGE * 0.49;
		pizzaCostPT = LARGE * 0.79;
		pizzaCostAll2 = Math.sqrt(pizzaCostRT)*2 + Math.sqrt(pizzaCostPT) + plainPizzaCost;
		
		//Tax, shipping and total math below.
		tax = (pizzaCostALL + pizzaCostAll2) * .07;
		shippingCost = Math.min((pizzaCostALL + pizzaCostAll2 + tax) / 10, 5);
		total = pizzaCostALL + pizzaCostAll2 + tax + shippingCost;
		
		//Print statements for bill gates
		System.out.println();
		System.out.println("Geometry Joe's Pizza Parlor");
		System.out.println("Customer: " + name2);
		System.out.print("2 Veggie Pizzas: ");
		System.out.printf("%9.2f", pizzaCostALL);
		System.out.println();
		System.out.print("1 Large Meat Lover Pizza: ");
		System.out.printf("%9.2f", pizzaCostAll2);
		System.out.println();
		System.out.print("Tax: ");
		System.out.printf("%9.2f", tax);
		System.out.println();
		System.out.print("Shipping: ");
		System.out.printf("%4.2f", shippingCost);
		System.out.println();
		System.out.print("Total: ");
		System.out.printf("%9.2f", total);
		
		//START OF J. GOSLING BELOW
		String name3 = "J. Gossling";
				
		//LARGE PEPPERONI EXTRA CHEESE
		A = Math.pow(LARGE/2, 2);
		A = A * Math.PI;
		plainPizzaCost = A * .05;
		pizzaCostRT = LARGE * 0.49;
		pizzaCostALL = Math.sqrt(pizzaCostRT)*2 + plainPizzaCost;
		
		//2(TWO) SMALL MUSHROOM + SAUSAGE
		A = Math.pow(SMALL/2, 2);
		A = A * Math.PI;
		plainPizzaCost = A * .05;
		pizzaCostRT = SMALL * 0.49;
		pizzaCostAll2 = Math.sqrt(pizzaCostRT)*2 + plainPizzaCost;
		pizzaCostAll2 = pizzaCostAll2*2;
		
		//1 MEDIUM WITH EVERY TOPPING
		A = Math.pow(MEDIUM/2, 2);
		A = A * Math.PI;
		plainPizzaCost = A * .05;
		pizzaCostRT = MEDIUM * 0.49;
		pizzaCostPT = MEDIUM * 0.79;
		pizzaCostAll3 = Math.sqrt(pizzaCostRT)*6 + Math.sqrt(pizzaCostPT)*4 + plainPizzaCost;
		//TAX, SHIPPING AND TOTAL
		tax = (pizzaCostALL + pizzaCostAll2 + pizzaCostAll3)*.07;
		shippingCost = Math.min(pizzaCostALL + pizzaCostAll2 + pizzaCostAll3 + tax, 5);
		total = pizzaCostALL + pizzaCostAll2 + pizzaCostAll3 + shippingCost + tax;
		
		//PRINT STATEMENTS J GOSSLING
		
		System.out.println();
		System.out.println("Geometry Joe's Pizza Parlor");
		System.out.println("Customer: " + name3);
		System.out.print("Large Pepperoni w/ Extra Cheese Pizza: ");
		System.out.printf("%9.2f", pizzaCostALL);
		System.out.println();
		System.out.print("2 Small Mushroom and Sausage Pizza");
		System.out.printf("%9.2f", pizzaCostAll2);
		System.out.println();
		System.out.print("Medium with everything :");
		System.out.printf("%9.2f", pizzaCostAll3);
		System.out.println();
		System.out.print("Tax: ");
		System.out.printf("%9.2f", tax);
		System.out.println();
		System.out.print("Shipping: ");
		System.out.printf("%9.2f", shippingCost);
		System.out.println();
		System.out.print("Total: ");
		System.out.printf("%9.2f", total);
		
		//MY ORDER BELOW
		String name4 = "N. Markou";
		
		//LARGE WITH EXTRA CHEESE
		A = Math.pow(LARGE/2, 2);
		A = A * Math.PI;
		plainPizzaCost = A * .05;
		pizzaCostRT = LARGE * .49;
		pizzaCostALL = Math.sqrt(pizzaCostRT) + plainPizzaCost;
		
		//TAX, SHIPPING, TOTAL
		tax = pizzaCostALL * .07;
		shippingCost = Math.min((pizzaCostALL + tax) / 10, 5);
		total = shippingCost + tax + pizzaCostALL;
		
		//PRINT STATEMENTS
		System.out.println();
		System.out.println("Geometry Joe's Pizza Parlor");
		System.out.println("Customer: " + name4);
		System.out.print("Large with Extra Cheese");
		System.out.printf("%9.2f", pizzaCostALL);
		System.out.println();
		System.out.print("Tax: ");
		System.out.printf("%9.2f", tax);
		System.out.println();
		System.out.print("Shipping: ");
		System.out.printf("%9.2f", shippingCost);
		System.out.println();
		System.out.print("Total: ");
		System.out.printf("%9.2f", total);
		
	}

}
