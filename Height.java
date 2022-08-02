public class Height implements Comparable<Height> {
    int feet;
    int inches;

    public Height() {
        setFeet(0);
        setInches(0);
    }

    public Height(int feet, int inches) {
        setFeet(feet);
        setInches(inches);
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
        if (inches >= 12)
            feet = feet + inches / 12;
        this.inches = inches % 12;
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }

    public int compareTo(Height h) {
        if (feet - h.feet != 0)
            return (feet - h.feet);
        else
            return (inches - h.inches);
    }

    public String toString() {
        return "Height: " + feet + " feet " + inches + " inches";
    }
}
