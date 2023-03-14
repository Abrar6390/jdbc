package com.Abrar;


class Mobile
{
	String mobilename;
	int price;
	String mobname;
	String color;
public Mobile(String mobilename, int price, String mobname, String color) {
		super();
		this.mobilename = mobilename;
		this.price = price;
		this.mobname = mobname;
		this.color = color;
	}
}

public class MobileShop {
	String shopname;
	String city;
	String customername;
	Mobile mobile;
	
	public MobileShop(String shopname, String city, String customername, Mobile mobile) {
		super();
		this.shopname = shopname;
		this.city = city;
		this.customername = customername;
		this.mobile = mobile;
		
	}
	void display()
	{
		System.out.println(shopname+" "+city+" "+customername);
		System.out.println(mobile.mobilename+" "+mobile.price+" "+mobile.mobname+" "+mobile.color);
	}

	public static void main(String[] args) {
		Mobile mobile2 = new Mobile("oppo",9000,"iphone","black");
        MobileShop mobileShop = new MobileShop("javed mobile shop","bagh nagar","salman", mobile2);
        mobileShop.display();
	}

}
