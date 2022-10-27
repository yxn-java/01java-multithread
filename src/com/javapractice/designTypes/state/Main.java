package com.javapractice.designTypes.state;

interface State {
    public void doAction(Context context);
}

class StartState implements State {
    public void doAction(Context context) {
        System.out.println("In start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}

class StopState implements State {

    public void doAction(Context context) {
        System.out.println("In stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}

class PlayState implements State {
    public void doAction(Context context) {
        System.out.println("In play state");
        context.setState(this);
    }
    public String toString() {
        return "Play State";
    }
}

class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        PlayState playState = new PlayState();
        playState.doAction(context);

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}

