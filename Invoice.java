/* program to represent an invoice for a store
author gbemisola */
public class Invoice{
        String number;
        String description;
        int quantity;
        double price;
    public Invoice(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public double getInvoiceAmount(){
        //double amount = quantity * price;
        if( quantity < 0){
           return quantity =0;
        }
        if (price < 0){
            return price = 0.0;
        }
        double amount = quantity * price;
        return amount;
    }
 
}
    class InvoiceTest{
        public static void main(String[] args){
            Invoice Invoice1 = new Invoice("12y4","I am naimat",5,76.90);
            System.out.print(Invoice1.getInvoiceAmount());
        }
    }
    