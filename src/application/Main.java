package src.application;

import src.entities.Products;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String response;

        System.out.print("Product Name: ");
        String name = sc.nextLine();

        System.out.print("Product price: ");
        double price = sc.nextDouble();

        System.out.print("Product quantity: ");
        int quantity = sc.nextInt();

        sc.nextLine();

        Products product = new Products(name, price, quantity);

        ///  Without Total

        String[] linesWithoutTotal = new String[] {
                product.getProductName(),
                String.valueOf(product.getProductPrice()),
                String.valueOf(product.getProductQuantity()),
        };

        String path = "/Users/fernando/Documents/Exercicio/products.txt ";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : linesWithoutTotal){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        /// With Total

        String[] linesWithTotal = new String[] {
                product.getProductName(),
                String.valueOf(product.getTotal())
        };

        path = "/Users/fernando/Documents/Exercicio/out/summary.txt ";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : linesWithTotal){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
