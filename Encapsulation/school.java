import java.util.Scanner;


class student{
    private String name;
    private int age;
    private int percentage;

    public get(){
        return name;
        return age;
        return percentage;
    }

    public set(){
        this.name=name;
        this.age=age;
        this.percentage=percentage;
    }

}

public class school{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        int percentage = sc.nextInt();

        System.out.println("Name : ",name);
        System.out.println("Age : ",age);
        System.out.println("Percentage : ",Percentage);
        

    }


}