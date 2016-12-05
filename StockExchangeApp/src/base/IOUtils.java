package base;

import java.util.Scanner;

public class IOUtils {

	public static void waitEnter() {
		try (Scanner sc = new Scanner(System.in)) {
			do
				System.out.println("Press Enter to quit.");
			while (!sc.nextLine().isEmpty());
		}
	}

}
