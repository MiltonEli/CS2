import java.util.Scanner;
//we have overloaded the "test" method by creating 4 methods with the name test. However, java doesn't get mad at you
// because the parameters are what allow it to differentiate between different test methods
public class Overloading {


    public String color;

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        Overloading g=new Overloading("purple");
        Overloading o=new Overloading("red");
//        o.test(6,7);
//        o.test(3);
        Overloading b = new Overloading();


    }
    public Overloading(){
        System.out.println("default constructor");
    }
    public Overloading(String color){
        //this. color refers to the class color as opposed to the string color
        //this keyword tells the computer to search for the variables to search for the instance variable color thats beyond that method.
       this.color= color;
        System.out.println("constructor");
        System.out.println("character color is "+this.color);
    }

    public void test (){
        System.out.println("empty test");
    }

    public void test (int x){
        System.out.println("number is "+x);

    }
    public void test (double x){
        System.out.println("number is "+x);
    }
    public void test (double x, double potato){
        double meal =x +potato;
        System.out.println("number is " + meal );
    }

}
