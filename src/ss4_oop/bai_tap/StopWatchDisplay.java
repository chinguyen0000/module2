package ss4_oop.bai_tap;

public class StopWatchDisplay {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int a = 0;
        for (int i = 0; i < 100000000; i++) {
            a++;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getStartTime() + ", " + stopWatch.getEndTime() + ", " + stopWatch.getElapsedTime());
    }
}
