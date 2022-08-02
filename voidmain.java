public class voidmain {
    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a,int b, int c){
        return a+b-c;
    }

    public static void main(String[] args) {
        int sum1 = sum(3, 5);
        int sum2 = sum(3, 4, 5);
        System.out.println("Sums are: "+sum1 +"  "+sum2);
    }
}
