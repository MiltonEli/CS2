public class SwapVariables {
    public static void main(String[] args) {
        String x="koolaid";
        String y="water";
        String temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x is "+x);
        System.out.println("y is "+y);
    }
}
