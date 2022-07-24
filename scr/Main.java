import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*/

        Car audi = new Car("red",5,"A4",false);
        System.out.println(audi.getAutomaticGearbox());
        audi.setAutomaticGearbox(true);
        System.out.println(audi.getAutomaticGearbox());
        System.out.println(audi.getColour());
        audi.setColour("red");
        System.out.println(audi.getDoorsAmount());
        audi.setDoorsAmount(5);
        System.out.println(audi.getBrand());
        audi.setBrand("A4");
/*/
/*
        int a;
        int b;
        a = 10;
        b = 2;
        int c;
        c = a - b;
        System.out.println(c);
        */
        /**/
        /*

        Calculator calc = new Calculator();
        calc.add(5,2);
        System.out.println();
        */
       /* Calculator liczydlo = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podac pierwsza liczbe");
        int firstVariable = scanner.nextInt();
        System.out.println("Prosze podac druga liczbe");
        int secondVariable = scanner.nextInt();
        System.out.println("Twoj wynik to" + liczydlo.sub(firstVariable,secondVariable));
*/
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        int x = scanner.nextInt();
        System.out.println("jaka operacje chcesz wykonac + - *");
        String znak = scanner.next();
        System.out.println("podaj druga liczbe");
        int y = scanner.nextInt();
        switch (znak){
            case "+":
                System.out.println(calculator.add(x,y));
        }
    }
}