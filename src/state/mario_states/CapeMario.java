package state.mario_states;

import state.mario.MarioContext;

public class CapeMario implements State{

    private final MarioContext mario;

    public CapeMario(MarioContext mario) {
        this.mario = mario;
    }

    @Override
    public void pickUpMushroom() {
        System.out.println("Cape Mario picked up a Mushroom: + 1000 POINTS");
        mario.increasePoints(1000);
    }

    @Override
    public void pickUpFlower() {
        System.out.println("Cape Mario picked up a Flower: turned into FIRE MARIO");
        mario.setCurrentState(new FireMario(mario));
    }

    @Override
    public void pickUpFeather() {
        System.out.println("Cape Mario picked up a Feather: + 1000 POINTS");
        mario.increasePoints(1000);
    }

    @Override
    public void takeDamage() {
        System.out.println("Cape Mario took damage: turned into BIG MARIO");
        mario.setCurrentState(new BigMario(mario));
    }
}
