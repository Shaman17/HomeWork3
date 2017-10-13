package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите количество ноутбуков: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(reader.readLine());

        String[] arrayName = {"Alexander", "Benjamin", "Samuel", "Michael", "William", "Matthew", "Jackson", "James", "Christopher", "Liam"};
        String[] arrayLastName = {"Johnson", "Williams", "Brown", "Miller", "White", "Thompson", "Walker", "Jones", "Scott", "Hill"};

        Laptop[] mylaptop = new Laptop[number];

        for (int x = 0; x < mylaptop.length; x++) {
            mylaptop[x] = new Laptop();
            mylaptop[x].setPrice(Math.round((Math.random() * 700.0 + 300.0) * 100.0) / 100.0);
            mylaptop[x].setDiagonal(Math.round((Math.random() * 8.0 + 10.0) * 10.0) / 10.0);
            mylaptop[x].owner.setName(arrayName[(int) (Math.random() * (arrayName.length))]);
            mylaptop[x].owner.setLastName(arrayLastName[(int) (Math.random() * (arrayLastName.length))]);
        }

        for (int x = 0; x < mylaptop.length; x++) {
            System.out.print("Ноутбук с диагональю " + mylaptop[x].getDiagonal() + " дюймов стоит " +
                    mylaptop[x].getPrice() + " долларов. Владельца ноутбука зовут " + mylaptop[x].owner.getName() +
                    " " + mylaptop[x].owner.getLastName());
            System.out.println();
        }

        System.out.println("\nВыберете тип сортировки ноутбуков (1 - по цене, 2 - по диагонали):");
        Integer type = Integer.parseInt(reader.readLine());

        bubbleSorting(mylaptop, type);

        for (int x = 0; x < mylaptop.length; x++) {
            System.out.println("Ноутбук с диагональю " + mylaptop[x].getDiagonal() + " дюймов стоит " +
                    mylaptop[x].getPrice() + " долларов. Владельца ноутбука зовут " + mylaptop[x].owner.getName() +
                    " " + mylaptop[x].owner.getLastName());
        }
    }

    static void bubbleSorting(Laptop[] array, int choice) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (choice == 1) {
                    if (array[j].getPrice() > array[j + 1].getPrice()) {
                        Laptop buffer = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = buffer;
                    }
                } else if (choice == 2) {
                    if (array[j].getDiagonal() > array[j + 1].getDiagonal()) {
                        Laptop buffer = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = buffer;
                    }
                }
            }
        }
    }
}