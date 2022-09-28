import java.util.ArrayList;
import java.util.Scanner;
public class ThisHomework {


    public static Color blue;
    public String pink;


        public static void main(String []args) {

            ThisHomework pink =new ThisHomework();



            blue= new Color("blue");
            System.out.println(blue.color);
        }

        private ThisHomework(){
            System.out.println("default constructor");
        }

        private String colorList(){
            ArrayList colorList=new ArrayList();
            colorList.add("blue");
            colorList.add("pink");
            colorList.add("red");
            colorList.add("green");
            colorList.add("purple");
            colorList.add("Yellow");
            System.out.println(colorList);
            return null;
        }

}
