package functionalAndLambda;

import java.util.function.BiConsumer;

public class BiConsumerTable {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> con = (a, b) -> {
			for (int i = a; i <= b; i++) {
				System.out.println("***********tables********" + i);
				for (int j = 1; j <= 20; j++) {

					System.out.println(i + "*" + j + "=" + j * i);

				}
			}
		};
		con.accept(10, 20);
	}

}
