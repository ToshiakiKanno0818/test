public class Test {

	public static void main(String[] arg){
		Person taro = new Person();
  		taro.setName("taro");
 		taro.setAge(20);

 /*		Person taro = new Person("taro",20);	*/

		System.out.println(taro.getName());
		System.out.println(taro.getAge());
	}
}
