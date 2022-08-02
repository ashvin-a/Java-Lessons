
@SuppressWarnings("unchecked")
public class Generic{
    
    public static <T extends Comparable> T large(T[] array) {
        T big = array[0];
        for (int i = 1; i < array.length; i++) {
            if (big.compareTo(array[i]) < 0)
                big = array[i];
        }
        return big;
    }

    public static void main(String[] args) {
        Time t = new Time(10, 70);
        Height h = new Height(20, 14);
        System.out.println(t);
        System.out.println(h);

        Height[] heights = { new Height(5, 5), new Height(5, 7), new Height(4, 1) };
        System.out.println("Largest Height: ");
        System.out.println(Generic.large(heights));

        Time[] times = { new Time(8, 5), new Time(9, 7), new Time(9, 1) };
        System.out.println("Largest Time: ");
        System.out.println(Generic.large(times));
    }
}
