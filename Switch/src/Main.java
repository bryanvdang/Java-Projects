/**
 * Created by bvdang on 7/8/2017.
 */
public class Main {
    public static void main(String[] args){
        int value = 1;

        if (value == 1){
            System.out.println("The value is 1");
        }
        else if(value == 2){
            System.out.println("The value is 2");
        }
        else{
            System.out.println("The value is not 1 or 2");
        }

        //Switch Statement
        //Good if you just want to test one variable
        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:case 4:case 5:
                System.out.println("The value was either a 3, a 4, or a 5");
                break;
            default:
                System.out.println("The value is not 1 or 2");
                break;
        }

        String month = "JANUARY";
        switch(month.toLowerCase()){
            //^^ changes variable to lowercase.
            case "january":
                System.out.println("the string is january");
                break;
            case "june":
                System.out.println("the string is june");
                break;
            default:
                System.out.println("not sure");
        }



        char letter = 'a';

        switch(letter){
            case 'a':
                System.out.println("the letter is 'a'");
                break;
            case 'b':
                System.out.println("the letter is 'b'");
                break;
            case 'c':
                System.out.println("the letter is 'c'");
                break;
            case 'd':
                System.out.println("the letter is 'd'");
            case 'e':
                System.out.println("the letter is 'e'");
                break;
            default:
                System.out.println("The letter is not either a, b, c, d, or e");
                break;
        }

    }
}
