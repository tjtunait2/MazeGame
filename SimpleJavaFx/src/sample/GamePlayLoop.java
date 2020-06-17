package sample;

import javafx.animation.AnimationTimer;
import javafx.geometry.Pos;

public class GamePlayLoop extends AnimationTimer {
    protected Main main, main1;
    Pos location;
    @Override
    public void handle(long now) {
        main.main.update();
        main.main1.update();
        main.enemy.update();
        main.opEnemy.update();
    }
    public GamePlayLoop(Main main){
        super();
        this.main = main;
    }
}
