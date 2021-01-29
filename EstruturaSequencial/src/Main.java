import java.util.Locale;

/**
 * @author JULIO PASCHOAL
 *
 */
public class Main {

	public static void main(String[] args) {

		// int y = 35;
		// double x = 10.3584;

		// System.out.printf("%2.2f%n", x);
		// System.out.printf("%2.4f%n", x);
		// System.out.println("Bom Dia!");
		// Locale.setDefault(Locale.US);
		// System.out.printf("%2.4f%n", x);
		// System.out.println("Resultado = " + x + " Metros");
		// System.out.printf("Resultado = %2f metros%n", x);

		// String nome = "JulioPaschoal";
		// int idade = 35;
		// double renda = 4000.0;
		// System.out.printf("%s tem %d anos e ganha R$ %.2f Reais%n", nome, idade,
		// renda);

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, Which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, Which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d, years old, code %d and gender: %s ", age, code, gender);
		System.out.println();
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Us decimal point: %.3f%n", measure);
	}

}
