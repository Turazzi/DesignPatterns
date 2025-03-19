package state.mario_states;

import state.mario.MarioContext;

public class DeadMario implements State {

    private final MarioContext mario;

    public DeadMario(MarioContext mario) {
        this.mario = mario;
    }

    @Override
    public void pickUpMushroom() {
        System.out.println("Mario is DEAD");
    }

    @Override
    public void pickUpFlower() {
        System.out.println("Mario is DEAD");
    }

    @Override
    public void pickUpFeather() {
        System.out.println("Mario is DEAD");
    }

    @Override
    public void takeDamage() {
        System.out.println("Mario is DEAD");
    }
}