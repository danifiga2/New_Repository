import java.util.Scanner;
public class Stock {
    public double cost;
    public String name_product;
    public boolean availability;
    public Stock(double cost,String name_product,boolean availability){
        this.cost = cost;
        this.name_product = name_product;
        this.availability = availability;
    }

    public void view_data(){
        System.out.println("------------------------------");
        System.out.println("Наименование товара: "+ this.name_product);
        System.out.println("Стоимость товара: "+ this.cost);
        if(this.availability){
            System.out.println("Товар имеется");}
        else System.out.println("Товар отсутствует");
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
