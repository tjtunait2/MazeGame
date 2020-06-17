package sample;

import javafx.scene.image.Image;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

import java.util.Random;

public class Enemy extends Actor{

    protected static final Random randomNum = new Random();
    int attackCounter = 0;
    int attackFrequency = 250;
    boolean takeSides = false;
    int attackBoundary = 300;
    boolean onScreen = false;
    boolean callAttack = false;
    boolean shootBullet = false;
    int pauseCounter = 0;
    boolean launchIt = false;
    boolean bulletType = false;
    int spriteMoveR, spriteMoveL, destination;
    int randomLocation, bulletRange, bulletOffset;
    double randomOffset, bulletGravity = 0.2, cheeseGravity = 0.1;
    Main main;
    int iBagelLocation;
    protected double dx;
    protected double dy;

    protected double maxSpeed = 4;
    protected double acc = 2f;
    protected double deacc = 0.3f;

    protected boolean up = false;
    protected boolean down = false;
    protected boolean right = false;
    protected boolean left = false;

    private boolean enemyCollide = false;

    public Enemy(Main main, String SVGdata, double xLocation, double yLocation, int health, Image... spriteCels) {
        super(SVGdata, xLocation, yLocation, spriteCels);
        this.health = health;
        this.main = main;
        spriteFrame.setTranslateX(xLocation);
        spriteFrame.setTranslateY(yLocation);
       /* isAlive = true;
        isBonus = true;
        hasValu = true;*/
    }

    @Override
    public void update() {
        enemyCollide = false;
        checkCollision();
        if(!enemyCollide){

            setXY();}
        moveEnemy(iX, iY);

        /*if(!callAttack) {
            if(attackCounter >= attackFrequency) {
                attackCounter = 0;
                spriteMoveR = 700;
                spriteMoveL = -70;
                randomLocation = randomNum.nextInt(attackBoundary);
                iBagelLocation = (int) main.main.getiY();
                bulletType = randomNum.nextBoolean();
                if(bulletType) {
                    spriteFrame.setTranslateY(randomLocation);
                    randomOffset = randomLocation + 5;
                } else {
                    spriteFrame.setTranslateY(iBagelLocation);
                    randomOffset = iBagelLocation + 5;
                }
                takeSides = randomNum.nextBoolean();
                callAttack = true;
            } else {
                attackCounter++;
            }
        } else {
            initiateAttack();
        }
        if(shootBullet) {
            shootProjectile();
            if (pauseCounter >= 60) {
                launchIt = true;
                pauseCounter = 0;
            } else {
                pauseCounter++;
            }
        }*/
    }

    private void moveEnemy(double x, double y) {
        spriteFrame.setTranslateX(x);
        spriteFrame.setTranslateY(y);
    }

    public void setXY() {
        if(main.main.IsInRange(main.enemy)) {
            if (main.enemy.iY> main.main.iY) {

                dy -= acc;
                if (dy < -maxSpeed) {
                    dy = -maxSpeed;
                }
            } else {
                if (dy < 0) {
                    dy += deacc;
                    if (dy > 0) {
                        dy = 0;
                    }
                }
            }

            if (main.enemy.iY< main.main.iY) {

                dy += acc;
                if (dy > maxSpeed) {
                    dy = maxSpeed;
                }
            } else {
                if (dy > 0) {
                    dy -= deacc;
                    if (dy < 0) {
                        dy = 0;
                    }
                }
            }

            if (main.enemy.iX> main.main.iX) {

                dx -= acc;
                if (dx < -maxSpeed) {
                    dx = -maxSpeed;
                }
            } else {
                if (dx < 0) {
                    dx += deacc;
                    if (dx > 0) {
                        dx = 0;
                    }
                }
            }

            if (main.enemy.iX< main.main.iX) {

                dx += acc;
                if (dx > maxSpeed) {
                    dx = maxSpeed;
                }
            } else {
                if (dx > 0) {
                    dx -= deacc;
                    if (dx < 0) {
                        dx = 0;
                    }
                }
            }
        } else {
            dx=0;
            dy=0;
        }
        iX+=dx/5;
        iY+=dy/5;
    }
    //Attack

    @Override
    public boolean collide(Actor object) {
        boolean collisionDetect = false;

        if (main.enemy.spriteFrame.getBoundsInParent().intersects(object.getSpriteFrame().getBoundsInParent())) {
            Shape intersection = SVGPath.intersect(main.main.getSpriteBound(), object.getSpriteBound());
            if (intersection.getBoundsInLocal().getWidth() != -1) {
                collisionDetect = true;
            }
        }
        return collisionDetect;
    }

    public void checkCollision() {
        for (int i = 0; i < main.castDirector.getCurrentCast().size(); i++) {
            Actor object = main.castDirector.getCurrentCast().get(i);

            if (collide(object) && !(object instanceof Enemy) ) {
                enemyCollide = true;
            }
        }
    }

    @Override
    public void die(){
        System.out.println(" :((((((((((((((((((((((((((((((((((((((((");
        main.root.getChildren().remove(this.spriteFrame);
        main.castDirector.removeCurrentCast(this);
    }

}