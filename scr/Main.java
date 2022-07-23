public class Main {
    public static void main(String[] args){

        Car audi = new Car("red",5,"A4",false);
        System.out.println(audi.getautomaticGearbox());
        audi.setAutomaticGearbox(true);
        System.out.println(audi.getautomaticGearbox());
    }
}
