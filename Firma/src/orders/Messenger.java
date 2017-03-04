package orders;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Messenger {

	public void manWriteText(Human Human) {
		File text = new File("text.txt");
		Scanner scanner = new Scanner(System.in);
		System.out.println("input your text");
		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(
					new FileWriter(text, true)));
			if (Human.getName().equals("roman")) {
				String message = scanner.next();
				writer.println(Human.getName() + " " + Human.getAge());
				writer.println(message);
			} else if (Human.getName().equals("tanya")) {
				String message1 = scanner.next();
				writer.println("                                                                                             "
						+ Human.getName() + " " + Human.getAge());
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
