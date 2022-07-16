public enum Vehicles {

    Lamborghin("Yallow", 500000), Ferrari("Red", 350000), Maseratti("Purple", 120000), AlfaRomeo("Green", 75000);


    public int price;
    public String color;

    Vehicles(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public int Price() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Vehicles Lamborghin = Vehicles.Lamborghin;
        Vehicles Ferrari = Vehicles.Ferrari;
        Vehicles Maseratti = Vehicles.Maseratti;
        Vehicles AlfaRomeo = Vehicles.AlfaRomeo;


        System.out.println(Lamborghin.name() + " " + Lamborghin.getColor() + " " + Lamborghin.Price() + "$");
        System.out.println(Ferrari.name() + " " + Ferrari.getColor() + " " + Ferrari.Price() + "$");
        System.out.println(Maseratti.name() + " " + Maseratti.getColor() + " " + Maseratti.Price() + "$");
        System.out.println(AlfaRomeo.name() + " " + AlfaRomeo.getColor() + " " + AlfaRomeo.Price() + "$");

    }

}
