package sec3;

public class Singletoneex {

	public static void main(String[] args) {
		Singletone = single1 = Singletone.getInstance();
		Singletone = single2 = Singletone.getInstance();
		Singletone = single3 = Singletone.getInstance();

	}

}
