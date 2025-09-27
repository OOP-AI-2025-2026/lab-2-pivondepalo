package ua.opnu;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void add(int h, int m) {
        if (h < 0 || m < 0 || m > 59) return;

        int totalMinutes = this.hours * 60 + this.minutes + h * 60 + m;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    public void addTimeSpan(TimeSpan other) {
        if (other == null) return;
        add(other.hours, other.minutes);
    }

    public double getTotalHours() {
        return hours + minutes / 60.0;
    }

    public int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    public void subtract(TimeSpan other) {
        if (other == null) return;
        int totalThis = this.getTotalMinutes();
        int totalOther = other.getTotalMinutes();

        if (totalOther > totalThis) {
            return;
        }

        int result = totalThis - totalOther;
        this.hours = result / 60;
        this.minutes = result % 60;
    }

    public void scale(int factor) {
        if (factor <= 0) return;

        int total = getTotalMinutes() * factor;
        this.hours = total / 60;
        this.minutes = total % 60;
    }
}
