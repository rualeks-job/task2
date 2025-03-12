package org.example.practicalWork2;

public class Task5 implements Task {
    int startTime = 10;
    boolean running = false;
    Thread thread;

    public static void main(String[] args) throws InterruptedException {
        Task5 task5 = new Task5();
        task5.start();
        Thread.sleep(4000);
        task5.stop();
    }

    @Override
    public void start() {
        if (running) {
            System.out.println("Таймкер уже запущен");
            return;
        }
        running = true;
        thread = new Thread(() -> {
            try {
                while (startTime > 0 && running) {
                    Thread.sleep(1000);
                    System.out.println("До окончания таймера осталось: " + startTime-- + " секунд");
                }
                if (running) {
                    System.out.println("Время истекло");
                }else {
                    System.out.println("Таймер остановлен");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            running = false;
        });
        thread.start();
    }

    @Override
    public void stop() {
        running = false;
    }

}
