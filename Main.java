/*Reginah Chuhi
CIS221
Tuesday and Thursday 2:10pm*/

public class Main {
	String name;
	int age;

//class constructor
	public Main(String name, int age) {
		this.name=name;
		this.age = age;

	}

	public static void main(String[] args) {
		// calls the constructor
		Main User = new Main("Peter", 30);
		// prints the name and age
		System.out.println(User.name + " " + User.age + " Years Old.");

	}

}
