import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Testing out my banking class.
//        System.out.println("Output for Banking Class");
//        Banking bank = new Banking("Blake Harris", 1000,"12181990bh");
//        bank.addMoney(50);
//        System.out.println(bank);
//        bank.subtractMoney(100);
//        System.out.println(bank);
//        bank.subtractMoney(3000);
//        System.out.println(bank);
//        System.out.println("-----------------------------------");

//        System.out.println("Output for BasketballTeam class");
//        BasketballTeam team = new BasketballTeam("Dogs");
//
//        //prints array in [] format, has null if no player added.
//        team.addPlayer("Adam");
//        team.addPlayer("Andy");
//        System.out.println(team.getPlayer());
//        team.addPlayer("Andrew");
//        team.addPlayer("Arnold");
//        team.addPlayer("Ansley");
//        System.out.println(team.getPlayer());
//        team.addPlayer("Cole");
//
//        team.addAssists(5000);
//        team.addPoints(400);
//        System.out.println("assists = " + team.getAssists() + " points = " + team.getPoints());
//        System.out.println("--------------------------------------");

//        EasyMath easy = new EasyMath();
//        Scanner scanner = new Scanner(System.in);
//        //loop until user enters a '-1'
//        while(true) {
//            System.out.printf("Enter an int number(-1 to exit): ");
//            int num = Integer.parseInt(scanner.nextLine());
//
//            if(num == -1) {
//                break;
//            }
//            easy.addNumbers(num);
//        }
//        System.out.println(easy.getSum());
//        System.out.println(easy.getAverage());

        Car car = new Car("Honda", "Accord", 2015);
        car.calculateHighwayMileage(55,15);

        System.out.println(car);






    }
}
