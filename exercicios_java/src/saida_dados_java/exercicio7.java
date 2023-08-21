package saida_dados_java;
public class exercicio7 {
    public static void main (String[] args) throws Exception {
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");

        System.out.printf("%s, wihich price is $ %.2f%n", product1, price1);
        System.out.printf("%s, wihich price is $ %.2f%n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);

        String measureFormatted = String.format("%.3f", measure).replace(",", ".");
        System.out.println("US decimal point:" + measureFormatted);
    }
}