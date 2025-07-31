package Day10;

import java.util.ArrayList;

public class JavaCollections {
	
	static class department{
		private String name;
		private double sales;
		private double expenses;
		public department(String name, double sales, double expenses) {
			super();
			this.name = name;
			this.sales = sales;
			this.expenses = expenses;
		}
		public double getProfit() {
			return sales-expenses;
		}
		
		public String getName() {
			return name;
			
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<department> store = new ArrayList<>();
		// store.add(new javaCollections().new department("pen",200000,1000));
		store.add(new department("Sales",20000,15000)); // or we can write like this.
		store.add(new department("Marketing",25000,12000));
		store.add(new department("Research",30000,10000));
		
		for(department d: store) {
			System.out.println(d.getName()+" profit :"+d.getProfit());
		}
		
		store.sort((d1,d2)->Double.compare(d2.getProfit(), d1.getProfit()));
		
		System.out.println("Sorting Done");
		
		for(department d: store) {
			System.out.println(d.getName()+" profit :"+d.getProfit());
		}
	}

}
