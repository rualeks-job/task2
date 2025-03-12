package org.example.practicalwork2;

import java.util.concurrent.atomic.AtomicBoolean;

public class Task5 implements Task {
    private int startTime = 10;
    private final AtomicBoolean running = new AtomicBoolean(false);

    public static void main(String[] args) throws InterruptedException {
        Task5 task5 = new Task5();
        task5.start();
        Thread.sleep(4000);
        task5.stop();
    }

    @Override
    public void start() {
        if (running.get()) {
            System.out.println("Таймер уже отработал");
            return;
        }
        running.set(true);
        Thread thread = new Thread(() -> {
            try {
                while (startTime > 0 && running.get()) {
                    Thread.sleep(1000);
                    System.out.println("До окончания таймера осталось: " + startTime + " секунд");
                    startTime--;
                }
                if (running.get()) {
                    System.out.println("Время истекло");
                } else {
                    System.out.println("Таймер остановлен");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }

    @Override
    public void stop() {
        running.set(false);
    }

}
