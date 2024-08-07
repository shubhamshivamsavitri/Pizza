public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice =150;
    private int backPackPrice = 20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }

    public void addExtraCheese(){
        System.out.println("Extra cheese added");
        isExtraCheeseAdded=true;
        this.price+=extraCheesePrice;
    }
    public void addExtraToppings(){
        System.out.println("Extra Toppings added");
        isExtraToppingAdded = true;
        this.price+=extraToppingsPrice;
    }
    public void takeAway(){
        System.out.println("takeaway opted");
        isOptedForTakeAway = true;
        this.price+=backPackPrice;
    }

    public void getBill(){

        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra Cheese Added: "+extraCheesePrice+ "\n";
        }
        if(isExtraToppingAdded){
            bill+="Extra Toppings Added: "+extraToppingsPrice+ "\n";
        }
        if(isOptedForTakeAway){
            bill+="Take away: "+backPackPrice+ "\n";
        }
        bill+="Bill: "+this.price + "\n";
        System.out.println(bill);
    }
}
