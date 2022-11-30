package stream;


public class Product {

    private String name;
    private int amonut;


    public Product(){
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAmonut(int amount){
        this.amonut = amount;
    }

    public int getAmonut(){
        return  this.amonut;
    }
}
