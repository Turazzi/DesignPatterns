package state.mario_states;

import state.mario.MarioContext;

public class SmallMario implements State {

    private final MarioContext mario;

    public SmallMario(MarioContext mario) {
        this.mario = mario;
    }

    @Override
    public void pickUpMushroom() {
        System.out.println("Mario picked up a Mushroom: turned into BIG MARIO");
        mario.setCurrentState(new BigMario(mario));
    }

    @Override
    public void pickUpFlower() {
        System.out.println("Mario picked up a Flower: turned into FIRE MARIO");
        mario.setCurrentState(new FireMario(mario));
    }

    @Override
    public void pickUpFeather() {
        System.out.println("Mario picked up a Feather: turned into CAPE MARIO");
        mario.setCurrentState(new CapeMario(mario));
    }

    @Override
    public void takeDamage() {
        System.out.println("Mario took damage: MARIO IS DEAD");
        mario.setCurrentState(new DeadMario(mario));
    }
}

