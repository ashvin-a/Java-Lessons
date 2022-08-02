public class Time implements Comparable<Time>{

    int hours;
    int minutes;

    public Time() {
        setHours(0);
        setMinutes(0);
    }

    public Time(int hours, int minutes) {
        setHours(hours);
        setMinutes(minutes);
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 60)
            hours = hours + minutes / 60;
        this.minutes = minutes % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int compareTo(Time t) {
        if (hours - t.hours != 0)
            return (hours - t.hours);
        else
            return (minutes - t.minutes);
    }

    public String toString() {
        return "Time: " + hours + "hours " + minutes + " minutes";
    }
}
