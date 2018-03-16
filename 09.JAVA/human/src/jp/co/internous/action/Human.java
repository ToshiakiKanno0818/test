package jp.co.internous.action;

public class Human {

	public static void main(String[]args){

		HumanName abc=new HumanName();
		System.out.println(abc.getName());

		HumanAge age=new HumanAge();
		System.out.println(age.getAge() + "歳");

		HumanAdress address=new HumanAdress();
		System.out.println(address.getAddress());

	}

}
