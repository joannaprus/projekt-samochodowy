public class Main {
    public static void main(String[] args){

        Car audi = new Car("red",5,"A4",false);
        System.out.println(audi.getautomaticGearbox());
        audi.setAutomaticGearbox(true);
        System.out.println(audi.getautomaticGearbox());
        System.out.println(audi.getColour());
        audi.setColour("red");
        System.out.println(audi.getDoorsAmount());
        audi.setDoorsAmount(5);
        System.out.println(audi.getBrand());
        audi.setBrand("A4");
    }
}
