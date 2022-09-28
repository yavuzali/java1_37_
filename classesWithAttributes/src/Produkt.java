public class Produkt {



    public Produkt(int id, String name, String eigenscaften,double price,int lagestatus,String renk,String kod){
        System.out.println("Yapici Blok calisti");

        this.id=id;
        this.renk=renk;
        this.name=name;
        this.price=price;
        this.eigenscaften=eigenscaften;
        this.lagestatus=lagestatus;

    }
    public Produkt(){

    }








    //attribute || field
    int id;
    private String name;

    // ürünün aciklamasi
    private String eigenscaften;
    private double price;
    private int lagestatus;

    private String renk;
    private String kod;


    //getter
    public int getid() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEigenscaften() {
        return eigenscaften;
    }

    public void setEigenscaften(String eigenscaften) {
        this.eigenscaften = eigenscaften;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLagestatus() {
        return lagestatus;
    }

    public void setLagestatus(int lagestatus) {
        this.lagestatus = lagestatus;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }


}


