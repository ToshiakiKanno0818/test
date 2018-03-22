
public class Robot {
	public String name = null;

	public Robot(){}


	public Robot(String name){
		this.name = name;
	}

	public void talk(){
		System.out.println(this.name + "が話す");
	}

}
