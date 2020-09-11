package com.codegym.task.task25.task2506;

public class LoggingStateThread extends Thread{
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        //record initial state;
        State state = thread.getState();
        System.out.println(state);
        //start new
        super.run();

        //if state stop, this also stop
        while(!state.equals(State.TERMINATED)) {
            State currentState = thread.getState();
            if(!state.equals(currentState)) {
                System.out.println(currentState);
                //chang state to the newest state and waiting next change
                state = currentState;
            }
        }


    }
}
