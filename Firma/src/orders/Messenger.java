package orders;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Messenger {

	public static void manWriteText(Object object) {
		File text = new File("text.txt");
		Scanner scanner = new Scanner(System.in);
		System.out.println("input your text:");
		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(
					new FileWriter(text, true)));
			if (object  instanceof Man) {
				String message = scanner.next();
				writer.println(((Human) object).getName() + " " + ((Human) object).getAge());
				writer.println(message);
			} else if (object instanceof Woman) {
				String message1 = scanner.next();
				writer.println("                                                                                 "
						+ ((Human) object).getName() + " " + ((Human) object).getAge());
				writer.println("                                                                                             "
						+ message1);
			}
			writer.close();
		} catch (IOException ex) {
			ex.printStackTrace();
			scanner.close();
		}

	}

}
