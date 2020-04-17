class Bill{
	int itemPrice;
	
	public Bill(int itemPrice){
		this.itemPrice = itemPrice;
	}
	
	void display(){
		int itemPrice = 20;
		System.out.println(itemPrice);
	}
}



public class Main {

	public static void main(String[] args) {
		
		Bill obj = new Bill(10);
		
		System.out.println(obj.itemPrice);
		
		obj.display();

	}

}
