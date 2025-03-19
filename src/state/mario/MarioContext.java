package state.mario;

import state.mario_states.SmallMario;
import state.mario_states.State;

public class MarioContext {

    private State currentState;
    private int points;

    public MarioContext() {
        this.currentState = new SmallMario(this);
        this.points = 0;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void increasePoints(int value) {
        points = points + value;
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getPoints() {
        return points;
    }
}