package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isCheese=false, istopping=false, istakeaway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
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
        if(isVeg){
            System.out.println("Base Price Of The Pizza: 300");
        }else{
            System.out.println("Base Price Of The Pizza: 400");
        }
        if(isCheese){
            System.out.println("Extra Cheese Added: 80");
        }
        if(istopping){
            if(isVeg){
                System.out.println("Extra Toppings Added: 70");
            }else{
                System.out.println("Extra Toppings Added: 120");
            }
        }
        if(istakeaway){
            System.out.println("Paperbag Added: 20");
        }
        System.out.println("Total Price: "+this.price);
        bill = "";
        return this.bill;
    }
}
