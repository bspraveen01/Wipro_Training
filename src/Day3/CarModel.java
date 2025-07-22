package Day3;

class CarModel1 {
     private String model;
     private int year;
     
     public void setModel(String model, int year) {
    	 this.model = model;
    	 this.year = year;
     }
     
     public String getModel() {
    	 return model;
     }
     
     public int getYear() {
    	 return year;
     }
     
	public static void main(String[] args) {
		CarModel1 c = new CarModel1();
		c.setModel("Audi",1996);
		System.out.println("model name "+c.getModel());
		System.out.println("model name "+c.getYear());
	}
}
