import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int arrLenght;
        Random random = new Random();

        do {
            //Тутачки сканер и дебаг
            //System.out.println("Work! (0)");
            Scanner mainScanner = new Scanner(System.in);
            System.out.println("   ");  //Сие для красоты надо
            System.out.println("Array lenght: ");
            arrLenght = mainScanner.nextInt();

            if (arrLenght >= 3){
                //Тож дебаг
                //System.out.println("Work! (1)");

                //Тутачки мутится массив
                int[] numbers = new int[arrLenght];

                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = random.nextInt(arrLenght);
                    System.out.print(numbers[i] + " ");
                }


                System.out.println("   ");  //Сие для красоты тожк надо
                System.out.println("Chetnye:");

                //Тутачки определяется четное число или нет
                for(int i1 = 0; i1 < numbers.length; i1++){
                    if ((numbers[i1] %2)==0) {
                        System.out.print(numbers[i1] + " ");

                    } } }else{

                System.out.println("Wrong array lenght!");
            }

        } while(false == !true); //Офигел когда это писал
    }
}