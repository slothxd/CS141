
//CS141
//Project 3
//3/2/2015


	public class Customer extends Person{

		private String customerNumber;
		private boolean mailingList;

	public Customer(){}

	public Customer(String n, String a, String p, String c, boolean m){

		super(n,a,p);
		this.customerNumber = c;
		this.mailingList = m;	
	}

	public void setCustomerNumber(String c){
		customerNumber = c;
	}

	public void setMillingList(boolean m){
		mailingList = m;
	}

	public String getCustomerNumber(){
		return customerNumber;
	}

	public boolean getMailingList(){
		return mailingList;
	}
	public String toString(){
		return  "Customer name: " + getName()+ 
			"\nCustomer Name: " + customerNumber +
			"\nPhone Number: " +getPhone()+
			"\nMailing List Status: " + mailingList;
	}

}
