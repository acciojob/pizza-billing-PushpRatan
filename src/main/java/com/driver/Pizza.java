package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isCheese=false, istopping=false, istakeaway = false, printed=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.price+=80;
        isCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
            this.price+=70;
        else
            this.price+=120;
        istopping = true;

    }

    public void addTakeaway(){
        // your code goes here
        this.price+=20;
        istakeaway = true;
    }

    public String getBill(){
        // your code goes here
        if(!printed){
            printed = true;
            if (isCheese) {
                bill += "Extra Cheese Added: 80\n";
            }
            if (istopping) {
                if (isVeg) {
                    bill += "Extra Toppings Added: 70\n";
                } else {
                    bill += "Extra Toppings Added: 120\n";
                }
            }
            if (istakeaway) {
                bill += "Paperbag Added: 20\n";
            }
            bill += "Total Price: " + this.price + "\n";
        }

        return this.bill;
    }
}
