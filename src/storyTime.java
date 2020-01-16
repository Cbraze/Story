import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class storyTime {

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("......I see you are here for an adventure... make your choice");
		try {
			TimeUnit.MILLISECONDS.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("..keep one thing in mind... and dont forget.... YOUR decisions.. change everything");

		System.out.println("..do you understand?");

	}

}
