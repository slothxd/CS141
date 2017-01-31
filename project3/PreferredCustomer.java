
//CS141
//Project 3
//3/2/2015

public class PreferredCustomer extends Customer implements DiscountTag{

	private double purchases;
	private double discountLevel;
	private double discountPrice;
	
	public PreferredCustomer(String n,String a,String p,String s, boolean mailList, double purchase)
	{
		super(n,a,p,s,mailList);
		this.purchases = purchase;
	}
	private void calcDiscount()
	{
		if(getPurchases() >= 2000){
			setDiscount(10);
		}
		else if(getPurchases() >= 1500){
			setDiscount(7);
		}
		else if(getPurchases() >= 1000){
			setDiscount(6);
		}
		else if(getPurchases() >= 500){
			setDiscount(5);
		}
	}
	
	public void setPurchases(double p){
		this.purchases = p;
	}
	
	private void setDiscount(double discount){
		this.discountLevel = discount;
	}
	
	public double getPurchases(){
		return purchases;
	}
	
	public double getDiscount(){
		calcDiscount();
		return discountLevel;
	}
	
	private void calcDiscountPrice(){
		discountPrice = getPurchases() - (getPurchases() * (getDiscount() / 100));
	}
	
	public void setDiscountPrice(double discountPrice){
		this.discountPrice = discountPrice;
	}

	public double getDiscountLevel(){
		calcDiscountPrice();
		return discountPrice;
	}

	public String toString(){
		String preferredCustomer = super.toString()+ 
					"\nPurchase "+getPurchases()+
					"\nDiscount "+getDiscount()+ 
					"\nDiscountPrice "+getDiscountLevel();

		return preferredCustomer;
	}

}
