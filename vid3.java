import java.util.*;
public class vid3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int button = sc.nextInt();
        sc.close();
        if(age >=18){
            System.out.println("You can vote");
        }
        else System.out.println("not adult");
        switch(button){
            case 1: {
                System.out.println("pressed one");
                break;
            }
            case 2: {
                System.out.println("pressed two");
            }
            default : {
                System.out.println("invalid");
            }
            // if break not there all executed below
        }
    }
}
