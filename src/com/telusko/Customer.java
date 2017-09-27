package com.telusko;

public class Customer {
	
	private String name;
	private int age;
	private String address;
	private String randomid;
	
	//default access specifier as the visibility is avaiable to all classes in the package.
	int reverse =0;

	
	public Customer() {
		super();
	}
	
	
	public void getRandomId(){
		
		//reversing a number
		while(this.age !=0){
			reverse = reverse *10;
			reverse = reverse + age%10;
			this.age = this.age/10;
			}
			
		//Generate random id with Characters + reverse Id
			
			String substring = this.name.substring(0, 3);
			this.randomid = substring + reverse;
			
			System.out.println(this.randomid);
		
		
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the randomid
	 */
	public String getRandomid() {
		return randomid;
	}


	/**
	 * @param randomid the randomid to set
	 */
	public void setRandomid(String randomid) {
		this.randomid = randomid;
	}


	/**
	 * @return the reverse
	 */
	public int getReverse() {
		return reverse;
	}


	/**
	 * @param reverse the reverse to set
	 */
	public void setReverse(int reverse) {
		this.reverse = reverse;
	}
	
	
	
	
	
	
	
	

}
