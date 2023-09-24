// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args){
        System.out.print("Введите наименование товара: ");
        Scanner sс = new Scanner(System.in);
        String name_pr = sс.nextLine();
        System.out.print("Введите цену товара: ");
        double costt = sс.nextDouble();
        System.out.print("Введите 1 если товар присутствует,2 - если нет: ");
        boolean availability = false;
        int choise = sс.nextInt();

        if(choise == 1)availability = true;
        else availability = false;

        WriterInfo wr = new WriterInfo();

        Stock s1 = new Stock(costt,name_pr,availability);
        System.out.println("Инфа о товарах на складе:");
        wr.take_class(s1);

        Stock s2 = new Stock(2100,"Iphone 13 Pro",true);
        wr.take_class(s2);

        Stock s3 = new Stock(3260,"Телевизор LG",true);
        wr.take_class(s3);
    }
}
