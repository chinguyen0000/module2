package ss4_oop.bai_tap;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        this.startTime = LocalTime.now();
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public void start() {
        this.startTime = LocalTime.now();
    }
    public void stop() {
        this.endTime = LocalTime.now();
    }
    public int getElapsedTime() {
        return ((endTime.getHour()-startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60 + (endTime.getSecond()-startTime.getSecond())*1000);
    }
}
