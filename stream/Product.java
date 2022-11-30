package stream;


public class Product {

    private int iphone;
    private int ipad;
    private int macboook;

    public Product(){
        this.iphone = 10;
        this.ipad = 15;
        this.macboook = 5;
    }

    public int  getIphone(){
        return this.iphone;
    }

    public int getIpad(){
        return this.ipad;
    }

    public int getMacboook(){
        return this.macboook;
    }
}
