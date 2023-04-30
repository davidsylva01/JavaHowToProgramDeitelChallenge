package deitelJavaHowToProgramChallenge.chapter3.clockTask;

public class Clock {
    private  int hour;
    private  int minute;
    private  int seconds;

    public Clock(int hour, int minute, int seconds) {
        if (hour > 23)hour=0;
        this.hour=hour;

        if (minute>59)minute = 0;
        this.minute = minute;
        if (seconds>59)seconds=0;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour>23) hour = 0;
        this.hour=hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute>59)minute = 0;
        this.minute = minute;

    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds > 59) seconds=0;
        this.seconds=seconds;

    }
    public void displayTime(){
        System.out.printf("%2d:%2d:%2d",hour,minute,seconds);
    }
}
