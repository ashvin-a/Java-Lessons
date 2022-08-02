import java.util.Scanner;

class InvalidMark extends Exception {
    InvalidMark(String s) {
        super(s);
    }
}

class CustomException {

    static void score(int mark) throws InvalidMark {
        if (mark < 0)
            throw new InvalidMark("Not Valid");
        else if (mark > 100)
            throw new InvalidMark("Not Valid");
        else
            System.out.println("Marks Registered");
    }

    public static void main(String args[]) {
        try {
            System.out.println("Enter marks: ");
            Scanner sc = new Scanner(System.in);
            int mark = sc.nextInt();
            score(mark);
            sc.close();
           
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }
}