import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Здеся сканеры
        Scanner mainScanner = new Scanner(System.in);
        //Да, уже ору
        String yesOrNo = "y";

        //Здеся цикл
        while(yesOrNo.equals("y")){

            System.out.println("First number: ");
            double firstNumber = mainScanner.nextDouble();

            System.out.println("Second number: ");
            double secondNumber = mainScanner.nextDouble();

            System.out.println("Operation: ");
            String operation = mainScanner.next();

            switch(operation) {
                case "+":
                    System.out.println(firstNumber + secondNumber); break;
                case "-":
                    System.out.println(firstNumber - secondNumber); break;
                case "*":
                    System.out.println(firstNumber * secondNumber); break;
                case "/":
                    System.out.println(firstNumber / secondNumber); break;
            }
            //Сообщение
            System.out.println("Continue (y/n)?");
            yesOrNo = mainScanner.next();

        }
        //Сообщение
        System.exit(1);

    }

}