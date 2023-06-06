package cgg.collections;
import java.util.Arrays;
public class Product {

		void sort(String...a) {
			Arrays.sort(a);
			Arrays.toString(a);
		}
		    public static void main(String[] args) {
		        String[] products = { "LapTop", "Table", "Monitor", "KeyBoard" };
		        Product p=new Product();
		        p.sort(products);
		    }}
