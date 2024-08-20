import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Product product = new Product();
//        System.out.printf("Nhap id san pham: ");
//        String id = sc.nextLine();
//        System.out.printf("Nhap ten san pham: ");
//        String name = sc.nextLine();
//        System.out.printf("Nhap gia san pham: ");
//        double price = Double.parseDouble(sc.nextLine());
//        product.setId(id);
//        product.setName(name);
//        double tax= price * 0.1;
//        product.setPrice((price + tax));
//        System.out.println(product);


        System.out.println("nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten: ");
        String name = sc.nextLine();
        System.out.println("nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap so nam kinh nghiem: ");
        double experience = Double.parseDouble(sc.nextLine());
        System.out.println("nhap noi lam: ");
        String placeWork = sc.nextLine();
        Employee person = new Employee(id, name, address, age, experience, placeWork);
        System.out.println(person);
        System.out.println(person.getName());
    }
}
