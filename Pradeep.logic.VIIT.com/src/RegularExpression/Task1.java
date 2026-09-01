package RegularExpression;

import java.util.function.BiConsumer;

public class Task1 {

	public void add() {

		BiConsumer<Integer, Integer> addition = (x, y) -> System.out.println(x + y);

		addition.accept(10, 20);
	}

	public static void main(String[] args) {

		Task1 t = new Task1();

		t.add();
	}
}