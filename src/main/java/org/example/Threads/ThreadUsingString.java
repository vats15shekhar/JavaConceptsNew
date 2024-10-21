package org.example.Threads;

public class ThreadUsingString {

    public void threadUsingString(){
        Thread thread = new Thread("Thread using String");
        thread.start();

        System.out.println(thread.getName());
    }
}
