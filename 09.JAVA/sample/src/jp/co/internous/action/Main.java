package jp.co.internous.action;

public class Main {

	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println(hikizan(10,7));
		System.out.println(warizan(100,20));
		System.out.println(kakezan(3,7));
	}

	public static int hikizan(int a,int b){
		return a-b;
	}

	public static int warizan(int a,int b){
		return a/b;
	}

	public static int kakezan(int a,int b){
		return a*b;
	}
}
