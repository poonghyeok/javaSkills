package stream.thisjavaver.sec04;

public class Product {

    private int pno;
    private String name;
    private String company;
    private int price;

    public Product(int pno, String name, String company, int price) {
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public int getPno(){return this.pno;}
    public String getName() {
        return this.name;
    }
    public String getCompany() {
        return this.company;
    }
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("{")
                .append("pno : " + this.pno + ", ")
                .append("name : " + this.name + ", ")
                .append("company : " + this.company + ", ")
                .append("price : " + this.price + ", ")
                .toString();

    }
}
