package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    static final double WIDTH = 700, HEIGHT = 600;
    Enemy enemy, opEnemy;
    Group root, root1;
    VBox buttonContainer, buttonContainer1;
    MainCharacter main, main1;
    Prop    iA1, iA2, iA3, iA4, iA5, iA6,iA7, iA8, iA9, iA10, iA11, iA12,
            iB1, iB2, iB3, iB4, iB5, iB6, iB7, iB8, iB9, iB10, iB11, iB12,
            iC1, iC2, iC3, iC4, iC5, iC6, iC7, iC8, iC9, iC10, iC11, iC12,
            iD1, iD2, iD3, iD4, iD5, iD6, iD7, iD8, iD9, iD10, iD11, iD12,
            iE1, iE2, iE3, iE4, iE5, iE6, iE7, iE8, iE9, iE10, iE11, iE12,
            iF1, iF2, iF3, iF4, iF5, iF6, iF7, iF8, iF9, iF10, iF11, iF12,
            iG1, iG2, iG3, iG4, iG5, iG6, iG7, iG8, iG9, iG10, iG11, iG12,
            iH1, iH2, iH3, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, iH12,
            iK1, iK2, iK3, iK4, iK5, iK6, iK7, iK8, iK9, iK10, iK11, iK12,
            iL1, iL2, iL3, iL4, iL5, iL6, iL7, iL8, iL9, iL10, iL11, iL12;
    Prop    iAA1, iAA2, iAA3, iAA4, iAA5, iAA8, iAA9, iAA10, iAA11, iAA12, iAA13, iAA14, iAA15,
            iBB1, iBB2, iBB3, iBB31, iBB4, iBB5, iBB10, iBB101, iBB11, iBB14, iBB15,
            iCC1, iCC2, iCC3, iCC31, iCC4, iCC41, iCC5, iCC10, iCC11, iCC14, iCC15,
            iDD1, iDD2, iDD21, iDD3, iDD4, iDD5, iDD6, iDD7, iDD14, iDD15,
            iEE1, iEE2, iEE5, iEE6, iEE61, iEE7, iEE14, iEE15,
            iFF1, iFF2, iFF5, iFF6, iFF7, iFF8, iFF9, iFF12, iFF121, iFF13, iFF14, iFF15,
            iGG1, iGG2, iGG12, iGG121, iGG13, iGG14, iGG141, iGG15,
            iHH1, iHH2, iHH12, iHH121, iHH13, iHH14, iHH15,
            iII1, iII2, iII3, iII31, iII41, iII4, iII5, iII6, iII7, iII71, iII8, iII9, iII10, iII11, iII12, iII13, iII131, iII141, iII14, iII15,
            iJJ1, iJJ2, iJJ3, iJJ4, iJJ41, iJJ5, iJJ6, iJJ61, iJJ7, iJJ71, iJJ8, iJJ9, iJJ10, iJJ11, iJJ12, iJJ13, iJJ14, iJJ15,
            iKK1, iKK2, iKK3, iKK4, iKK5, iKK6, iKK7, iKK8, iKK9, iKK10, iKK11, iKK12, iKK13, iKK14, iKK15,
            iLL1, iLL2, iLL21, iLL3, iLL4, iLL5, iLL6, iLL7, iLL8, iLL9, iLL10, iLL101, iLL11, iLL12, iLL13, iLL14, iLL15,
            iMM1, iMM2, iMM3, iMM4, iMM5, iMM6, iMM7, iMM8, iMM9, iMM10, iMM11, iMM12, iMM13, iMM14, iMM15,
            iNN1, iNN2, iNN3, iNN4, iNN5, iNN6, iNN7, iNN8, iNN9, iNN91, iNN10, iNN11, iNN12, iNN13, iNN14, iNN15,
            iOO1, iOO2, iOO3, iOO4, iOO5, iOO6, iOO7, iOO8, iOO81, iOO91, iOO9, iOO10, iOO11, iOO111, iOO121, iOO12, iOO13, iOO14, iOO15,
            PathA0, PathA1,
            PathB5, PathB6, PathB7, PathB8, PathB11, PathB12,
            PathC5, PathC6, PathC7, PathC8, PathC11, PathC12,
            PathD7, PathD8, PathD9, PathD10, PathD11, PathD12,
            PathE2, PathE3, PathE7, PathE8, PathE9, PathE10, PathE11, PathE12,
            PathF2, PathF3, PathF9, PathF10,
            PathG2, PathG3, PathG4, PathG5, PathG6, PathG7, PathG8, PathG9, PathG10,
            PathH2, PathH3, PathH4, PathH5, PathH6, PathH7, PathH8, PathH9, PathH10,
            PathI9, PathI10,
            PathJ8, PathJ9, PathJ10, PathJ11,
            PathK7, PathK8, PathK9, PathK10, PathK11,
            PathL4 ,PathL5, PathL6, PathL7, PathL8, PathL10, PathL11,
            PathM3, PathM4 ,PathM5, PathM6, PathM7, PathM11, PathM12,
            PathN3, PathN4, PathN11, PathN12,
            PathO3, PathO4;
    Projectile iBullet, iCheese;
    Prop iPR0, iPR1, iPR2, iPR3, iPR4, iPR5, iPR6, iPR7, iPR8;
    Prop iTW0, iTW1, iTW2, iTW3, iTW4, iTW5, iTW6, iTW7, iTW8, iTW9, iTW10, iTW11, iTW12, iTW13, iTW14, iTW15, iTW16, iTW17, iTW18, iTW19, iTW20, iTW21, iTW22, iTW23, iTW24, iTW25, iTW26, iTW27, iTW28, iTW29, iTW30, iTW31, iTW32, iTW33, iTW34, iTW35, iTW36, iTW37, iTW38, iTW39, iTW40, iTW41, iTW42, iTW43;
    private boolean up, down, left, right, Aup, Adown, Aleft, Aright, aKey, dKey, sKey, wKey, Enter;
    private Image iTheWay;

    private Image Path;
    private Image ixB0, ixB1, ixB2, ixB3, ixB4, ixB5, ixB6, ixB7, ixB8, ixP0, iT0, iT1, ixE0, ixC0, ixC1, a1, a2, a3, a4, a5, a6, a9, a10;
    private Image backgroundiMMage;

    private Scene scene, scene0, scene2, scene1;
    private Image backgroundImage;
    private GamePlayLoop gamePlayLoop;
    CastingDirector castDirector, castingDirector1;
    ImageView background;
    Button playGameButton, howToPlayButton, settingButton, exitButton;

    @Override
    public void start(Stage primaryStage) throws IOException {
        // create scene0 ( menu)

        Button playGameButton = new Button("PLAY GAME");
        playGameButton.setFont(new Font("Candara Bold", 35.5));

        Button howToPlayButton = new Button("How to Play");
        howToPlayButton.setFont(new Font("Candara", 35.5));

        Button settingButton = new Button("Settings");
        settingButton.setFont(new Font("Candara", 35.5));

        Button quitButton = new Button("Quit");
        quitButton.setFont(new Font("Candara", 35.5));
        buttonContainer = new VBox();

        buttonContainer.getChildren().addAll(playGameButton, howToPlayButton, settingButton, quitButton);
        buttonContainer.setSpacing(50);
        buttonContainer.setAlignment(Pos.CENTER);

        scene0 = new Scene(buttonContainer, WIDTH, HEIGHT, Color.BROWN);

        // create scene 1 - choose mode

        Button easyButton = new Button("EASY");
        easyButton.setFont(new Font("Candara Bold", 35.5));

        Button hardButton = new Button("HARD");
        hardButton.setFont(new Font("Candara", 35.5));

        buttonContainer1 = new VBox();

        buttonContainer1.getChildren().addAll(easyButton, hardButton);
        buttonContainer1.setSpacing(50);
        buttonContainer1.setAlignment(Pos.CENTER);
        scene1 = new Scene(buttonContainer1, WIDTH, HEIGHT, Color.BROWN);
        primaryStage.setTitle("RPG Game Team 17");

        // mode detail
        playGameButton.setOnAction(actionEvent -> {
            primaryStage.setScene(scene1);
        });
        easyButton.setOnAction(e->{
            primaryStage.setScene(scene);
        });
        hardButton.setOnAction(e->{
            primaryStage.setScene(scene);
            root1.getChildren().add(opEnemy.spriteFrame);
            castDirector.addCurrentCast(opEnemy);
            enemy.health = 20;
        });
        root = new Group();
        root1 = new Group();
        //map1
        scene = new Scene(root, WIDTH, HEIGHT, Color.GREEN);
        //map2
        scene2 = new Scene(root1, 750, 750, Color.RED);
        primaryStage.setScene(scene0);
        primaryStage.setResizable(false);
        primaryStage.show();
        loadImageAssets();
        createGameActors();
        addGameActorNodes();
        createCastingDirection();
        createStartGameLoop();
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {

                case W: up = true; break;
                case S: down = true; break;
                case A: left = true; break;
                case D: right = true; break;

                case I: Aup = true; break;
                case K: Adown = true; break;
                case J: Aleft = true; break;
                case L: Aright = true; break;
                case ENTER: {
                    primaryStage.setScene(scene2);
                    castDirector.removeAll();
                    castDirector.addCurrentCast(iEE2, iFF2, iGG2, iHH2, iDD3, iII3, iII31, iMM3, iNN3, iOO3, iDD4, iII4, iII41, iLL4,
                            iAA5, iBB5, iCC5, iEE5, iFF5, iII5, iKK5, iDD6, iFF6, iII6, iKK6, iNN6, iDD7, iEE7, iFF7, iII7, iII71, iKK7,
                            iNN7, iOO7, iAA8, iFF8, iII8, iJJ8, iNN8, iAA9, iFF9, iII9, iMM9, iBB10, iBB101, iCC10, iLL10, iLL101, iBB11, iCC11,
                            iMM11, iNN11, iAA12, iFF12, iFF121, iGG12, iGG121, iHH12, iHH121, iII12, iOO12, iOO121, iAA13,
                            iFF13, iJJ13, iKK13, iLL13, iOO13, iBB14, iCC14, iDD14, iEE14, iMM14, iNN14);
                }break;
            }
        });
        scene.setOnKeyReleased((KeyEvent event) -> {
            switch (event.getCode()) {
                case W: up = false; break;
                case S: down = false; break;
                case A: left = false; break;
                case D: right = false; break;

                case I: Aup = false; break;
                case K: Adown = false; break;
                case J: Aleft = false; break;
                case L: Aright = false; break;
                case ENTER: Enter = false; break;
            }
        });
        scene2.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {

                case W: up = true; break;
                case S: down = true; break;
                case A: left = true; break;
                case D: right = true; break;

                case I: Aup = true; break;
                case K: Adown = true; break;
                case J: Aleft = true; break;
                case L: Aright = true; break;
                case ENTER: {

                }
                break;
            }
        });
        scene2.setOnKeyReleased((KeyEvent event) -> {
            switch (event.getCode()) {
                case W: up = false; break;
                case S: down = false; break;
                case A: left = false; break;
                case D: right = false; break;

                case I: Aup = false; break;
                case K: Adown = false; break;
                case J: Aleft = false; break;
                case L: Aright = false; break;
                case ENTER: Enter = false; break;
            }
        });

    }



    public static void main(String[] args) {
        launch(args);
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isAup() { return Aup; }

    public void setAup(boolean aup) { Aup = aup; }

    public boolean isAdown() { return Adown; }

    public void setAdown(boolean adown) { Adown = adown; }

    public boolean isAleft() { return Aleft; }

    public void setAleft(boolean aleft) { Aleft = aleft; }

    public boolean isAright() { return Aright; }

    public void setAright(boolean aright) { Aright = aright; }

    public boolean isaKey() {
        return aKey;
    }

    public void setaKey(boolean aKey) {
        this.aKey = aKey;
    }

    public boolean isdKey() {
        return dKey;
    }

    public void setdKey(boolean dKey) {
        this.dKey = dKey;
    }

    public boolean issKey() {
        return sKey;
    }

    public void setsKey(boolean sKey) {
        this.sKey = sKey;
    }

    public boolean iswKey() {
        return wKey;
    }

    public void setwKey(boolean wKey) {
        this.wKey = wKey;
    }

    private void loadImageAssets() {
        ixP0 = new Image("/proper1.png", 50, 50, false, false, true);

        ixB0 = new Image("/pngegg_1.png", 40, 40, false, false, true);
        ixB1 = new Image("/right2.png", 40, 40, false, false, true);
        ixB2 = new Image("/right1.png", 40, 40, false, false, true);
        ixB3 = new Image("/behind1.png", 40, 40, false, false, true);
        ixB4 = new Image("/behind2.png", 40, 40, false, false, true);
        ixB5 = new Image("/front1.png",40, 40, false, false, true);
        ixB6 = new Image("/front2.png", 40, 40, false, false, true);


        ixE0 = new Image("/enemy.png", 25, 25, false, false, true);
        ixC0 = new Image("/bullet.png", 64, 24, false, false, true);
        ixC1 = new Image("/cheese.png", 32, 29, false, false, true);
        backgroundImage = new Image("/background4.png", 700, 600, false, false, true);

        a1 = new Image("/a1.png",50, 50, false, false, true);
        a2= new Image("/a2.png",50, 50, false, false, true);
        a3 = new Image("/a3.png",50, 50, false, false, true);
        a4 = new Image("/a4.png",50, 50, false, false, true);
        a5 = new Image("/a5.png",50, 50, false, false, true);
        a6 = new Image("/a6.png",50, 50, false, false, true);
        iTheWay = new Image("/a7.png", 50, 50, false, false, true);
        Path = new Image("/a7.png", 50, 50, false, false, true);

    }

    private void createGameActors() {
        main = new MainCharacter(this,
                "M58,8 L58,8 43,24 32,28 32,41 18,41 28,54 40,61 35,73 41,79 45,54 55,39 65,40 69,25 Z",
                50, 300, ixB0, ixB1, ixB2, ixB3, ixB4, ixB5, ixB6, ixB7, ixB8);
        main1 = new MainCharacter(this,
                "M58,8 L58,8 43,24 32,28 32,41 18,41 28,54 40,61 35,73 41,79 45,54 55,39 65,40 69,25 Z",
                50, 300, ixB0, ixB1, ixB2, ixB3, ixB4, ixB5, ixB6, ixB7, ixB8);
        //Yen

        iPR0 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 100, ixP0);
        iPR1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 150, ixP0);
        iPR2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 100, ixP0);

        iA1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 50, a2); // A, B, C,D,... chỉ số hàng
        iA2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 50, a3); // 1,2,3 ... chỉ số cột
        iA3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 50, a3);
        iA4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 50, a3);
        iA5 = new Prop("M0,0 L0,32 72,32 72,0 Z",250 , 50, a3); //1
        iA6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 50, a3);
        iA7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 50, a3);
        iA8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 50, a3);
        iA9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 50, a3);
        iA10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 50, a2);
        iA11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 50, a2);
        iA12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 50, a3);

        iB1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 100, a2);
        iB2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 100, a3);
        iB3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 100, a1);
        iB4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 100, a1);
        iB5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 100, a1); //2
        iB6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 100, a1);
        iB7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 100, a1);
        iB8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 100, a2);
        iB9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 100, a1);
        iB10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 100, a1);
        iB11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 100, a1);
        iB12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 100, a1);

        iC1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 150, a2);
        iC2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 150, a4);
//        iC3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iC4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iC5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iC6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iC7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iC8= new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 150, a1); //3
//        iC9= new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iC10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iC11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iC12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);

        iD1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 200, a2);
        iD2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 200, a2);
        iD3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 200, a3);
        iD4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 200, a4);
//        iD5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iD6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 200, a5); //4
//        iD7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iD8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iD9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iD10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iD11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 200, a6);
        iD12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 200, a5);

        iE1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 250, a1);
        iE2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 250, a1);
        iE3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 250, a2); //5
        iE4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 250, a4);
//        iE5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iE6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 250, a6);
//        iE7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iE8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 250, a3);
//        iE9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iE10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iE11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iE12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 250, a4);

//        iF1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iF2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iF3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 300, a1);
        iF4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 300, a1);
//        iF5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iF6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 300, a5); //6
//        iF7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iF8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 300, a3);
//        iF9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iF10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iF11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iF12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 300, a2); //NOTE

        iG1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 350, a4);
//        iG2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iG3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iG4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iG5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iG6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iG7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 350, a2);
        iG8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 350, a3); //7
        iG9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 350, a5);
        iG10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 350, a3);
        iG11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 350, a5);
        iG12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 350, a3);

        iH1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 400, a4);
        iH2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 400, a5);
        iH3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 400, a5);
//        iH4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iH5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 400, a3); //8
//        iH6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iH7= new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 400, a1);
        iH8= new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 400, a1);
        iH9= new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 400, a1);
        iH10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 400, a1);
        iH11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 400, a1);
        iH12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 400, a4);

        iK1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 450, a4);
//        iK2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iK3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iK4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iK5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 450, a3); //9
//        iK6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iK7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iK8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iK9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iK10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
//        iK11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, iP0);
        iK12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 450, a4);

        iL1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 500, a1);
        iL2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 500, a5);
        iL3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 500, a5);
        iL4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 500, a6);
        iL5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 500, a1);
        iL6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 500, a5); //10
        iL7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 500, a3);
        iL8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 500, a3);
        iL9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 500, a5);
        iL10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 500, a3);
        iL11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 500, a5);
        iL12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 500, a3);

        //Tung

        iTW0 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 300, iTheWay);
        iTW1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 350, iTheWay);
        iTW2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 450, iTheWay);

        iTW3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 150, iTheWay);
        iTW4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 350, iTheWay);
        iTW5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 450, iTheWay);

        iTW6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 150, iTheWay);
        iTW7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 350, iTheWay);
        iTW8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 400, iTheWay);
        iTW9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 450, iTheWay);

        iTW10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 150, iTheWay);
        iTW11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 200, iTheWay);
        iTW12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 250, iTheWay);
        iTW13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 300, iTheWay);
        iTW14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 350, iTheWay);

        iTW15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 150, iTheWay);
        iTW16 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 350, iTheWay);
        iTW17 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 400, iTheWay);
        iTW18 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 450, iTheWay);

        iTW19 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 150, iTheWay);
        iTW20 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 200, iTheWay);
        iTW21 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 250, iTheWay);
        iTW22 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 300, iTheWay);
        iTW23 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 450, iTheWay);

        iTW24 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 200, iTheWay);
        iTW25 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 450, iTheWay);

        iTW26 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 150, iTheWay);
        iTW27 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 200, iTheWay);
        iTW28 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 250, iTheWay);
        iTW29 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 300, iTheWay);
        iTW30 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 450, iTheWay);

        iTW31 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 150, iTheWay);
        iTW32 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 250, iTheWay);
        iTW33 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 300, iTheWay);
        iTW34 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 450, iTheWay);

        iTW35 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 150, iTheWay);
        iTW36 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 250, iTheWay);
        iTW37 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 300, iTheWay);

        iTW38 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 150, iTheWay);
        iTW39 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 200, iTheWay);
        iTW40 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 250, iTheWay);
        iTW41 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 300, iTheWay);
        iTW42 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 450, iTheWay);

        iTW43 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 300, iTheWay);



        ///
        background = new ImageView(backgroundImage);


        enemy = new Enemy(this, "M0 6 L0 52 70 52 70 70 70 93 115 45 115 0 84 0 68 16 Z", 310, 450, 10,ixE0);
        opEnemy = new Enemy(this, "M0 6 L0 52 70 52 70 70 70 93 115 45 115 0 84 0 68 16 Z", 300, 481, 20,ixE0);





        //scene 2

        PathA0 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 250, Path);
        PathA1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 300, Path);

        PathB5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 250, Path);
        PathB6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 300, Path);
        PathB7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 350, Path);
        PathB8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 400, Path);
        PathB11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 550, Path);
        PathB12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 600, Path);

        PathC5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 250, Path);
        PathC6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 300, Path);
        PathC7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 350, Path);
        PathC8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 400, Path);
        PathC11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 550, Path);
        PathC12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 600, Path);

        PathD7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 350, Path);
        PathD8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 400, Path);
        PathD9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 450, Path);
        PathD10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 500, Path);
        PathD11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 550, Path);
        PathD12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 600, Path);

        PathE2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 100, Path);
        PathE3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 150, Path);
        PathE7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 350, Path);
        PathE8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 400, Path);
        PathE9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 450, Path);
        PathE10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 500, Path);
        PathE11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 550, Path);
        PathE12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 600, Path);

        PathF2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 100, Path);
        PathF3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 150, Path);
        PathF9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 450, Path);
        PathF10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 500, Path);

        PathG2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 100, Path);
        PathG3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 150, Path);
        PathG4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 200, Path);
        PathG5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 250, Path);
        PathG6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 300, Path);
        PathG7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 350, Path);
        PathG8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 400, Path);
        PathG9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 450, Path);
        PathG10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 500, Path);

        PathH2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 100, Path);
        PathH3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 150, Path);
        PathH4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 200, Path);
        PathH5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 250, Path);
        PathH6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 300, Path);
        PathH7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 350, Path);
        PathH8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 400, Path);
        PathH9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 450, Path);
        PathH10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 500, Path);

        PathI9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 450, Path);
        PathI10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 500, Path);

        PathJ8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 400, Path);
        PathJ9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 450, Path);
        PathJ10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 500, Path);
        PathJ11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 550, Path);

        PathK7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 350, Path);
        PathK8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 400, Path);
        PathK9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 450, Path);
        PathK10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 500, Path);
        PathK11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 550, Path);

        PathL4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 200, Path);
        PathL5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 250, Path);
        PathL6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 300, Path);
        PathL7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 350, Path);
        PathL8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 400, Path);
        PathL10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 500, Path);
        PathL11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 550, Path);

        PathM3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 150, Path);
        PathM4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 200, Path);
        PathM5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 250, Path);
        PathM6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 300, Path);
        PathM7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 350, Path);
        PathM11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 550, Path);
        PathM12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 600, Path);

        PathN3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 150, Path);
        PathN4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 200, Path);
        PathN11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 550, Path);
        PathN12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 600, Path);

        PathO3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 150, Path);
        PathO4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 200, Path);
        iAA1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 0, a3);
        iAA2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 50, a3);
        iAA3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 100, a3);
        iAA4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 150, a3);
        iAA5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 200, a1);
//        iAA6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 250, a3);
//        iAA7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 300, a3);
        iAA8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 350, a4);
        iAA9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 400, a4);
        iAA10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 450, a3);
        iAA11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 500, a4);
        iAA12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 550, a4);
        iAA13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 600, a4);
        iAA14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 650, a3);
        iAA15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 0, 700, a1);


        iBB1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 0, a3);
        iBB2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 50, a3);
        iBB3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 100, a3);
        iBB31 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 100, a5);
        iBB4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 150, a3);
        iBB5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 200, a1); //2
//        iBB6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 250, a1);
//        iBB7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 300, a1);
//        iBB8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 350, a2);
//        iBB9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 400, a1);
        iBB10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 450, a3);
        iBB101 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 450, a6);
        iBB11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 500, a1);
//        iBB12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 550, a1);
//        iBB13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 600, a1);
        iBB14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 650, a3);
        iBB15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 50, 700, a1);


        iCC1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 0, a3);
        iCC2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 50, a3);
        iCC3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 100, a3);
        iCC31 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 100, a10);
        iCC4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 150, a3);
        iCC41 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 150, a9);
        iCC5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 200, a1);
//        iCC6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 250, iP0);
//        iCC7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 300, iP0);
//        iCC8= new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 350, a1);
//        iCC9= new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 400, iP0);
        iCC10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 450, a4);
        iCC11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 500, a1);
//        iCC12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 550, iP0);
//        iCC13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 600, iP0);
        iCC14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 650, a3);
        iCC15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 100, 700, a1);

        iDD1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 0, a3);
        iDD2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 50, a3);
        iDD21 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 50, a6);
        iDD3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 100, a3);
        iDD4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 150, a3);
        iDD5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 200, a3);
        iDD6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 250, a2);
        iDD7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 300, a1);
//        iDD8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 350, iP0);
//        iDD9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 400, iP0);
//        iDD10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 450, iP0);
//        iDD11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 500, a6);
//        iDD12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 550, a5);
//        iDD13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 600, a5);
        iDD14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 650, a3);
        iDD15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 150, 700, a1);

        iEE1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 0, a3);
        iEE2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 50, a1);
//        iEE3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 100, a2);
//        iEE4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 150, a4);
        iEE5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 200, a3);
        iEE6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 250, a3);
        iEE61 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 250, a6);
        iEE7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 300, a1);
//        iEE8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 350, a3);
//        iEE9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 400, iP0);
//        iEE10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 450, iP0);
//        iEE11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 500, iP0);
//        iEE12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 550, a4);
//        iEE13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 600, a4);
        iEE14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 650, a3);
        iEE15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 200, 700, a1);

        iFF1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 0, a3);
        iFF2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 50, a1);
//        iFF3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 100, a1);
//        iFF4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 150, a1);
        iFF5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 200, a4);
        iFF6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 250, a4);
        iFF7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 300, a4);
        iFF8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 350, a4);
        iFF9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 400, a1);
//        iFF10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 450, iP0);
//        iFF11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 500, iP0);
        iFF12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 550, a3);
        iFF121 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 550, a6);
        iFF13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 600, a3);
        iFF14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 650, a3);
        iFF15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 250, 700, a1);

        iGG1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 0, a3);
        iGG2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 50, a1);
//        iGG3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 100, iP0);
//        iGG4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 150, iP0);
//        iGG5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 200, iP0);
//        iGG6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 250, iP0);
//        iGG7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 300, a2);
//        iGG8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 350, a3);
//        iGG9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 400, a5);
//        iGG10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 450, a3);
//        iGG11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 500, a5);
        iGG12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 550, a3);
        iGG121 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 550, a5);
        iGG13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 600, a3);
        iGG14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 650, a3);
        iGG141 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 650, a5);
        iGG15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 300, 700, a1);

        iHH1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 0, a3);
        iHH2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 50, a1);
//        iHH3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 100, a5);
//        iHH4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 150, iP0);
//        iHH5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 200, a3);
//        iHH6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 250, iP0);
//        iHH7= new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 300, a1);
//        iHH8= new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 350, a1);
//        iHH9= new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 400, a1);
//        iHH10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 450, a1);
//        iHH11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 500, a1);
        iHH12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 550, a3);
        iHH121 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 550, a5);
        iHH13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 600, a3);
        iHH14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 650, a3);
        iHH15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 350, 700, a1);

        iII1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 0, a3);
        iII2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 50, a2);
        iII3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 100, a2);
        iII31 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 100, a10);
        iII4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 150, a2);
        iII41 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 150, a9);
        iII5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 200, a2);
        iII6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 250, a2);
        iII7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 300, a2);
        iII71 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 300, a6);
        iII8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 350, a2);
        iII9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 400, a1);
//        iII10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 450, iP0);
//        iII11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 500, iP0);
        iII12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 550, a3);
        iII13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 600, a3);
        iII131 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 600, a10);
        iII14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 650, a3);
        iII141 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 650, a9);
        iII15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 400, 700, a1);

        iJJ1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 0, a3);
        iJJ2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 50, a3);
        iJJ3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 100, a3);
        iJJ4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 150, a3);
        iJJ41 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 150, a5);
        iJJ5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 200, a3);
        iJJ6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 250, a3);
        iJJ61 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 250, a10);
        iJJ7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 300, a4);
        iJJ71 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 300, a9);
        iJJ8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 350, a1);
//        iJJ9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 400, a1);
//        iJJ10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 450, iP0);
//        iJJ11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 500, iP0);
//        iJJ12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 550, a4);
        iJJ13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 600, a3);
        iJJ14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 650, a3);
        iJJ15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 450, 700, a1);


        iKK1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 0, a3);
        iKK2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 50, a3);
        iKK3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 100, a3);
        iKK4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 150, a4);
        iKK5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 200, a4);
        iKK6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 250, a4);
        iKK7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 300, a1);
//        iKK8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 350, iP0);
//        iKK9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 400, iP0);
//        iKK10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 450, iP0);
//        iKK11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 500, iP0);
//        iKK12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 550, a4);
        iKK13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 600, a3);
        iKK14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 650, a3);
        iKK15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 500, 700, a1);

        iLL1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 0, a3);
        iLL2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 50, a3);
        iLL21 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 50, a5);
        iLL3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 100, a4);
        iLL4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 150, a1);
//        iLL5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 200, a1);
//        iLL6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 250, a5);
//        iLL7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 300, a3);
//        iLL8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 350, a3);
//        iLL9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 400, a5);
        iLL10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 450, a3);
        iLL101 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 450, a6);
//        iLL11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 500, a5);
//        iLL12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 550, a3);
        iLL13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 600, a4);
        iLL14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 650, a3);
        iLL15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 550, 700, a1);

        iMM1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 0, a3);
        iMM2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 50, a3);
        iMM3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 100, a1);
//        iMM4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 150, a6);
//        iMM5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 200, a1);
//        iMM6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 250, a5);
//        iMM7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 300, a3);
//        iMM8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 350. a3);
        iMM9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 400, a3);
        iMM10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 450, a3);
        iMM11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 500, a1);
//        iMM12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 550, a3);
//        iMM13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 600, a3);
        iMM14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 650, a3);
        iMM15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 600, 700, a1);


        iNN1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 0, a3);
        iNN2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 50, a3);
        iNN3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 100, a1);
//        iNN4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 150, a6);
//        iNN5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 200, a1);
        iNN6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 250, a3);
        iNN7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 300, a3);
        iNN8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 350, a3);
        iNN9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 400, a3);
        iNN91 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 400, a5);
        iNN10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 450, a3);
        iNN11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 500, a1);
//        iNN12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 550, a3);
//        iNN13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 600, a3);
        iNN14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 650, a3);
        iNN15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 650, 700, a1);

        iOO1 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 0, a3);
        iOO2 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 50, a3);
        iOO3 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 100, a1);
//        iOO4 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 150, a6);
//        iOO5 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 200, a1);
//        iOO6 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 250, a5);
        iOO7 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 300, a3);
        iOO8 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 350, a3);
        iOO81 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 350, a10);
        iOO9 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 400, a3);
        iOO91 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 400, a9);
        iOO10 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 450, a3);
        iOO11 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 500, a3);
        iOO111 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 500, a10);
        iOO12 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 550, a3);
        iOO121 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 550, a9);
        iOO13 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 600, a3);
        iOO14 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 650, a3);
        iOO15 = new Prop("M0,0 L0,32 72,32 72,0 Z", 700, 700, a1);
    }

    private void addGameActorNodes() {
        // add background
        root.getChildren().add(background);

        root.getChildren().add(iTW0.spriteFrame);
        root.getChildren().add(iTW1.spriteFrame);
        root.getChildren().add(iTW2.spriteFrame);
        root.getChildren().add(iTW3.spriteFrame);
        root.getChildren().add(iTW4.spriteFrame);
        root.getChildren().add(iTW5.spriteFrame);
        root.getChildren().add(iTW6.spriteFrame);
        root.getChildren().add(iTW7.spriteFrame);
        root.getChildren().add(iTW8.spriteFrame);
        root.getChildren().add(iTW9.spriteFrame);
        root.getChildren().add(iTW10.spriteFrame);
        root.getChildren().add(iTW11.spriteFrame);
        root.getChildren().add(iTW12.spriteFrame);
        root.getChildren().add(iTW13.spriteFrame);
        root.getChildren().add(iTW14.spriteFrame);
        root.getChildren().add(iTW15.spriteFrame);
        root.getChildren().add(iTW16.spriteFrame);
        root.getChildren().add(iTW17.spriteFrame);
        root.getChildren().add(iTW18.spriteFrame);
        root.getChildren().add(iTW19.spriteFrame);
        root.getChildren().add(iTW20.spriteFrame);
        root.getChildren().add(iTW21.spriteFrame);
        root.getChildren().add(iTW22.spriteFrame);
        root.getChildren().add(iTW23.spriteFrame);
        root.getChildren().add(iTW24.spriteFrame);
        root.getChildren().add(iTW25.spriteFrame);
        root.getChildren().add(iTW26.spriteFrame);
        root.getChildren().add(iTW27.spriteFrame);
        root.getChildren().add(iTW28.spriteFrame);
        root.getChildren().add(iTW29.spriteFrame);
        root.getChildren().add(iTW30.spriteFrame);
        root.getChildren().add(iTW31.spriteFrame);
        root.getChildren().add(iTW32.spriteFrame);
        root.getChildren().add(iTW33.spriteFrame);
        root.getChildren().add(iTW34.spriteFrame);
        root.getChildren().add(iTW35.spriteFrame);
        root.getChildren().add(iTW36.spriteFrame);
        root.getChildren().add(iTW37.spriteFrame);
        root.getChildren().add(iTW38.spriteFrame);
        root.getChildren().add(iTW39.spriteFrame);
        root.getChildren().add(iTW40.spriteFrame);
        root.getChildren().add(iTW41.spriteFrame);
        root.getChildren().add(iTW42.spriteFrame);
        root.getChildren().add(iTW43.spriteFrame);


        root.getChildren().add(iA2.spriteFrame);
        root.getChildren().add(iA3.spriteFrame);
        root.getChildren().add(iA4.spriteFrame);
        root.getChildren().add(iA5.spriteFrame);
        root.getChildren().add(iA6.spriteFrame);
        root.getChildren().add(iA7.spriteFrame);
        root.getChildren().add(iA9.spriteFrame); //1
        root.getChildren().add(iA10.spriteFrame);
        root.getChildren().add(iA11.spriteFrame);
        root.getChildren().add(iA12.spriteFrame);

        root.getChildren().add(iB1.spriteFrame);
        root.getChildren().add(iB2.spriteFrame);
        root.getChildren().add(iB3.spriteFrame);
        root.getChildren().add(iB4.spriteFrame);
        root.getChildren().add(iB5.spriteFrame);
        root.getChildren().add(iB6.spriteFrame); //2
        root.getChildren().add(iB7.spriteFrame);
        root.getChildren().add(iB8.spriteFrame);
        root.getChildren().add(iB9.spriteFrame);
        root.getChildren().add(iB10.spriteFrame);
        root.getChildren().add(iB11.spriteFrame);
        root.getChildren().add(iB12.spriteFrame);

        root.getChildren().add(iC1.spriteFrame); //3
        root.getChildren().add(iC2.spriteFrame);
        root.getChildren().add(iC8.spriteFrame);

        root.getChildren().add(iD1.spriteFrame);
        root.getChildren().add(iD2.spriteFrame);
        root.getChildren().add(iD3.spriteFrame);
        root.getChildren().add(iD4.spriteFrame); //4
        root.getChildren().add(iD6.spriteFrame);
        root.getChildren().add(iD11.spriteFrame);
        root.getChildren().add(iD12.spriteFrame);

        root.getChildren().add(iE1.spriteFrame); //5
        root.getChildren().add(iE2.spriteFrame);
        root.getChildren().add(iE3.spriteFrame);
        root.getChildren().add(iE4.spriteFrame);
        root.getChildren().add(iE6.spriteFrame);
        root.getChildren().add(iE8.spriteFrame);
        root.getChildren().add(iE12.spriteFrame);

        root.getChildren().add(iF3.spriteFrame); //6
        root.getChildren().add(iF4.spriteFrame);
        root.getChildren().add(iF6.spriteFrame);
        root.getChildren().add(iF8.spriteFrame);
        root.getChildren().add(iF12.spriteFrame);


        root.getChildren().add(iG1.spriteFrame); //7
        root.getChildren().add(iG7.spriteFrame);
        root.getChildren().add(iG8.spriteFrame);
        root.getChildren().add(iG9.spriteFrame);
        root.getChildren().add(iG10.spriteFrame);
        root.getChildren().add(iG11.spriteFrame);
        root.getChildren().add(iG12.spriteFrame);

        root.getChildren().add(iH1.spriteFrame); //8
        root.getChildren().add(iH2.spriteFrame);
        root.getChildren().add(iH3.spriteFrame);
        root.getChildren().add(iH5.spriteFrame);
        root.getChildren().add(iH7.spriteFrame);
        root.getChildren().add(iH8.spriteFrame);
        root.getChildren().add(iH9.spriteFrame);
        root.getChildren().add(iH10.spriteFrame);
        root.getChildren().add(iH11.spriteFrame);
        root.getChildren().add(iH12.spriteFrame);

        root.getChildren().add(iK1.spriteFrame);
        root.getChildren().add(iK5.spriteFrame);
        root.getChildren().add(iK12.spriteFrame);

        root.getChildren().add(iL1.spriteFrame);
        root.getChildren().add(iL2.spriteFrame);
        root.getChildren().add(iL3.spriteFrame);
        root.getChildren().add(iL4.spriteFrame);
        root.getChildren().add(iL5.spriteFrame);
        root.getChildren().add(iL6.spriteFrame);
        root.getChildren().add(iL7.spriteFrame);
        root.getChildren().add(iL8.spriteFrame);
        root.getChildren().add(iL9.spriteFrame);
        root.getChildren().add(iL10.spriteFrame);
        root.getChildren().add(iL11.spriteFrame);
        root.getChildren().add(iL12.spriteFrame);





        // add player and monster
        root.getChildren().add(enemy.spriteFrame);
        root.getChildren().add(main.spriteFrame);
        //root.getChildren().add(iCheese.spriteFrame);
        //root.getChildren().add(iBullet.spriteFrame);


        // root1


        root1.getChildren().add(PathA0.spriteFrame);
        root1.getChildren().add(PathA1.spriteFrame);

        root1.getChildren().add(PathB5.spriteFrame);
        root1.getChildren().add(PathB6.spriteFrame);
        root1.getChildren().add(PathB7.spriteFrame);
        root1.getChildren().add(PathB8.spriteFrame);
        root1.getChildren().add(PathB11.spriteFrame);
        root1.getChildren().add(PathB12.spriteFrame);

        root1.getChildren().add(PathC5.spriteFrame);
        root1.getChildren().add(PathC6.spriteFrame);
        root1.getChildren().add(PathC7.spriteFrame);
        root1.getChildren().add(PathC8.spriteFrame);
        root1.getChildren().add(PathC11.spriteFrame);
        root1.getChildren().add(PathC12.spriteFrame);

        root1.getChildren().add(PathD7.spriteFrame);
        root1.getChildren().add(PathD8.spriteFrame);
        root1.getChildren().add(PathD9.spriteFrame);
        root1.getChildren().add(PathD10.spriteFrame);
        root1.getChildren().add(PathD11.spriteFrame);
        root1.getChildren().add(PathD12.spriteFrame);

        root1.getChildren().add(PathE2.spriteFrame);
        root1.getChildren().add(PathE3.spriteFrame);
        root1.getChildren().add(PathE7.spriteFrame);
        root1.getChildren().add(PathE8.spriteFrame);
        root1.getChildren().add(PathE9.spriteFrame);
        root1.getChildren().add(PathE10.spriteFrame);
        root1.getChildren().add(PathE11.spriteFrame);
        root1.getChildren().add(PathE12.spriteFrame);

        root1.getChildren().add(PathF2.spriteFrame);
        root1.getChildren().add(PathF3.spriteFrame);
        root1.getChildren().add(PathF9.spriteFrame);
        root1.getChildren().add(PathF10.spriteFrame);

        root1.getChildren().add(PathG2.spriteFrame);
        root1.getChildren().add(PathG3.spriteFrame);
        root1.getChildren().add(PathG4.spriteFrame);
        root1.getChildren().add(PathG5.spriteFrame);
        root1.getChildren().add(PathG6.spriteFrame);
        root1.getChildren().add(PathG7.spriteFrame);
        root1.getChildren().add(PathG8.spriteFrame);
        root1.getChildren().add(PathG9.spriteFrame);
        root1.getChildren().add(PathG10.spriteFrame);

        root1.getChildren().add(PathH2.spriteFrame);
        root1.getChildren().add(PathH3.spriteFrame);
        root1.getChildren().add(PathH4.spriteFrame);
        root1.getChildren().add(PathH5.spriteFrame);
        root1.getChildren().add(PathH6.spriteFrame);
        root1.getChildren().add(PathH7.spriteFrame);
        root1.getChildren().add(PathH8.spriteFrame);
        root1.getChildren().add(PathH9.spriteFrame);
        root1.getChildren().add(PathH10.spriteFrame);

        root1.getChildren().add(PathI9.spriteFrame);
        root1.getChildren().add(PathI10.spriteFrame);

        root1.getChildren().add(PathJ8.spriteFrame);
        root1.getChildren().add(PathJ9.spriteFrame);
        root1.getChildren().add(PathJ10.spriteFrame);
        root1.getChildren().add(PathJ11.spriteFrame);

        root1.getChildren().add(PathK7.spriteFrame);
        root1.getChildren().add(PathK8.spriteFrame);
        root1.getChildren().add(PathK9.spriteFrame);
        root1.getChildren().add(PathK10.spriteFrame);
        root1.getChildren().add(PathK11.spriteFrame);

        root1.getChildren().add(PathL4.spriteFrame);
        root1.getChildren().add(PathL5.spriteFrame);
        root1.getChildren().add(PathL6.spriteFrame);
        root1.getChildren().add(PathL7.spriteFrame);
        root1.getChildren().add(PathL8.spriteFrame);
        root1.getChildren().add(PathL10.spriteFrame);
        root1.getChildren().add(PathL11.spriteFrame);

        root1.getChildren().add(PathM3.spriteFrame);
        root1.getChildren().add(PathM4.spriteFrame);
        root1.getChildren().add(PathM5.spriteFrame);
        root1.getChildren().add(PathM6.spriteFrame);
        root1.getChildren().add(PathM7.spriteFrame);
        root1.getChildren().add(PathM11.spriteFrame);
        root1.getChildren().add(PathM12.spriteFrame);

        root1.getChildren().add(PathN3.spriteFrame);
        root1.getChildren().add(PathN4.spriteFrame);
        root1.getChildren().add(PathN11.spriteFrame);
        root1.getChildren().add(PathN12.spriteFrame);

        root1.getChildren().add(PathO3.spriteFrame);
        root1.getChildren().add(PathO4.spriteFrame);

        root1.getChildren().add(iAA1.spriteFrame);
        root1.getChildren().add(iAA2.spriteFrame);
        root1.getChildren().add(iAA3.spriteFrame);
        root1.getChildren().add(iAA4.spriteFrame);
        root1.getChildren().add(iAA5.spriteFrame);
        root1.getChildren().add(iAA8.spriteFrame);
        root1.getChildren().add(iAA9.spriteFrame);
        root1.getChildren().add(iAA10.spriteFrame);
        root1.getChildren().add(iAA11.spriteFrame);
        root1.getChildren().add(iAA12.spriteFrame);
        root1.getChildren().add(iAA13.spriteFrame);
        root1.getChildren().add(iAA14.spriteFrame);
        root1.getChildren().add(iAA15.spriteFrame);

        root1.getChildren().add(iBB1.spriteFrame);
        root1.getChildren().add(iBB2.spriteFrame);
        root1.getChildren().add(iBB3.spriteFrame);
        root1.getChildren().add(iBB31.spriteFrame);
        root1.getChildren().add(iBB4.spriteFrame);
        root1.getChildren().add(iBB5.spriteFrame);
        root1.getChildren().add(iBB10.spriteFrame);
        root1.getChildren().add(iBB101.spriteFrame);
        root1.getChildren().add(iBB11.spriteFrame);
        root1.getChildren().add(iBB14.spriteFrame);
        root1.getChildren().add(iBB15.spriteFrame);

        root1.getChildren().add(iCC1.spriteFrame);
        root1.getChildren().add(iCC2.spriteFrame);
        root1.getChildren().add(iCC3.spriteFrame);
        root1.getChildren().add(iCC31.spriteFrame);
        root1.getChildren().add(iCC4.spriteFrame);
        root1.getChildren().add(iCC41.spriteFrame);
        root1.getChildren().add(iCC5.spriteFrame);
        root1.getChildren().add(iCC10.spriteFrame);
        root1.getChildren().add(iCC11.spriteFrame);
        root1.getChildren().add(iCC14.spriteFrame);
        root1.getChildren().add(iCC15.spriteFrame);

        root1.getChildren().add(iDD1.spriteFrame);
        root1.getChildren().add(iDD2.spriteFrame);
        root1.getChildren().add(iDD21.spriteFrame);
        root1.getChildren().add(iDD3.spriteFrame);
        root1.getChildren().add(iDD4.spriteFrame);
        root1.getChildren().add(iDD5.spriteFrame);
        root1.getChildren().add(iDD6.spriteFrame);
        root1.getChildren().add(iDD7.spriteFrame);
        root1.getChildren().add(iDD14.spriteFrame);
        root1.getChildren().add(iDD15.spriteFrame);

        root1.getChildren().add(iEE1.spriteFrame);
        root1.getChildren().add(iEE2.spriteFrame);
        root1.getChildren().add(iEE5.spriteFrame);
        root1.getChildren().add(iEE6.spriteFrame);
        root1.getChildren().add(iEE61.spriteFrame);
        root1.getChildren().add(iEE7.spriteFrame);
        root1.getChildren().add(iEE14.spriteFrame);
        root1.getChildren().add(iEE15.spriteFrame);

        root1.getChildren().add(iFF1.spriteFrame);
        root1.getChildren().add(iFF2.spriteFrame);
        root1.getChildren().add(iFF5.spriteFrame);
        root1.getChildren().add(iFF6.spriteFrame);
        root1.getChildren().add(iFF7.spriteFrame);
        root1.getChildren().add(iFF8.spriteFrame);
        root1.getChildren().add(iFF9.spriteFrame);
        root1.getChildren().add(iFF12.spriteFrame);
        root1.getChildren().add(iFF121.spriteFrame);
        root1.getChildren().add(iFF13.spriteFrame);
        root1.getChildren().add(iFF14.spriteFrame);
        root1.getChildren().add(iFF15.spriteFrame);

        root1.getChildren().add(iGG1.spriteFrame);
        root1.getChildren().add(iGG2.spriteFrame);
        root1.getChildren().add(iGG12.spriteFrame);
        root1.getChildren().add(iGG121.spriteFrame);
        root1.getChildren().add(iGG13.spriteFrame);
        root1.getChildren().add(iGG14.spriteFrame);
        root1.getChildren().add(iGG15.spriteFrame);

        root1.getChildren().add(iHH1.spriteFrame);
        root1.getChildren().add(iHH2.spriteFrame);
        root1.getChildren().add(iHH12.spriteFrame);
        root1.getChildren().add(iHH121.spriteFrame);
        root1.getChildren().add(iHH13.spriteFrame);
        root1.getChildren().add(iHH14.spriteFrame);
        root1.getChildren().add(iHH15.spriteFrame);




        root1.getChildren().add(iII1.spriteFrame);
        root1.getChildren().add(iII2.spriteFrame);
        root1.getChildren().add(iII3.spriteFrame);
        root1.getChildren().add(iII31.spriteFrame);
        root1.getChildren().add(iII4.spriteFrame);
        root1.getChildren().add(iII41.spriteFrame);
        root1.getChildren().add(iII5.spriteFrame);
        root1.getChildren().add(iII6.spriteFrame);
        root1.getChildren().add(iII7.spriteFrame);
        root1.getChildren().add(iII71.spriteFrame);
        root1.getChildren().add(iII8.spriteFrame);
        root1.getChildren().add(iII9.spriteFrame);
//            root1.getChildren().add(iII10.spriteFrame);
//            root1.getChildren().add(iII11.spriteFrame);
        root1.getChildren().add(iII12.spriteFrame);
        root1.getChildren().add(iII13.spriteFrame);
        root1.getChildren().add(iII131.spriteFrame);
        root1.getChildren().add(iII14.spriteFrame);
        root1.getChildren().add(iII141.spriteFrame);
        root1.getChildren().add(iII15.spriteFrame);

        root1.getChildren().add(iJJ1.spriteFrame);
        root1.getChildren().add(iJJ2.spriteFrame);
        root1.getChildren().add(iJJ3.spriteFrame);
        root1.getChildren().add(iJJ4.spriteFrame);
        root1.getChildren().add(iJJ41.spriteFrame);
        root1.getChildren().add(iJJ5.spriteFrame);
        root1.getChildren().add(iJJ6.spriteFrame);
        root1.getChildren().add(iJJ61.spriteFrame);
        root1.getChildren().add(iJJ7.spriteFrame);
        root1.getChildren().add(iJJ71.spriteFrame);
        root1.getChildren().add(iJJ8.spriteFrame);
//            root1.getChildren().add(iJJ9.spriteFrame);
//            root1.getChildren().add(iJJ10.spriteFrame);
//            root1.getChildren().add(iJJ11.spriteFrame);
//            root1.getChildren().add(iJJ12.spriteFrame);
        root1.getChildren().add(iJJ13.spriteFrame);
        root1.getChildren().add(iJJ14.spriteFrame);
        root1.getChildren().add(iJJ15.spriteFrame);

        root1.getChildren().add(iKK1.spriteFrame);
        root1.getChildren().add(iKK2.spriteFrame);
        root1.getChildren().add(iKK3.spriteFrame);
        root1.getChildren().add(iKK4.spriteFrame);
        root1.getChildren().add(iKK5.spriteFrame);
        root1.getChildren().add(iKK6.spriteFrame);
        root1.getChildren().add(iKK7.spriteFrame);
//            root1.getChildren().add(iKK8.spriteFrame);
//            root1.getChildren().add(iKK9.spriteFrame);
//            root1.getChildren().add(iKK10.spriteFrame);
//            root1.getChildren().add(iKK11.spriteFrame);
//            root1.getChildren().add(iKK12.spriteFrame);
        root1.getChildren().add(iKK13.spriteFrame);
        root1.getChildren().add(iKK14.spriteFrame);
        root1.getChildren().add(iKK15.spriteFrame);

        root1.getChildren().add(iLL1.spriteFrame);
        root1.getChildren().add(iLL2.spriteFrame);
        root1.getChildren().add(iLL21.spriteFrame);
        root1.getChildren().add(iLL3.spriteFrame);
        root1.getChildren().add(iLL4.spriteFrame);
//            root1.getChildren().add(iLL5.spriteFrame);
//            root1.getChildren().add(iLL6.spriteFrame);
//            root1.getChildren().add(iLL7.spriteFrame);
//            root1.getChildren().add(iLL8.spriteFrame);
//            root1.getChildren().add(iLL9.spriteFrame);
        root1.getChildren().add(iLL10.spriteFrame);
        root1.getChildren().add(iLL101.spriteFrame);
//            root1.getChildren().add(iLL11.spriteFrame);
//            root1.getChildren().add(iLL12.spriteFrame);
        root1.getChildren().add(iLL13.spriteFrame);
        root1.getChildren().add(iLL14.spriteFrame);
        root1.getChildren().add(iLL15.spriteFrame);

        root1.getChildren().add(iMM1.spriteFrame);
        root1.getChildren().add(iMM2.spriteFrame);
        root1.getChildren().add(iMM3.spriteFrame);
//            root1.getChildren().add(iMM4.spriteFrame);
//            root1.getChildren().add(iMM5.spriteFrame);
//            root1.getChildren().add(iMM6.spriteFrame);
//            root1.getChildren().add(iMM7.spriteFrame);
//            root1.getChildren().add(iMM8.spriteFrame);
        root1.getChildren().add(iMM9.spriteFrame);
        root1.getChildren().add(iMM10.spriteFrame);
        root1.getChildren().add(iMM11.spriteFrame);
//            root1.getChildren().add(iMM12.spriteFrame);
//            root1.getChildren().add(iMM13.spriteFrame);
        root1.getChildren().add(iMM14.spriteFrame);
        root1.getChildren().add(iMM15.spriteFrame);

        root1.getChildren().add(iNN1.spriteFrame);
        root1.getChildren().add(iNN2.spriteFrame);
        root1.getChildren().add(iNN3.spriteFrame);
//            root1.getChildren().add(iNN4.spriteFrame);
//            root1.getChildren().add(iNN5.spriteFrame);
        root1.getChildren().add(iNN6.spriteFrame);
        root1.getChildren().add(iNN7.spriteFrame);
        root1.getChildren().add(iNN8.spriteFrame);
        root1.getChildren().add(iNN9.spriteFrame);
        root1.getChildren().add(iNN91.spriteFrame);
        root1.getChildren().add(iNN10.spriteFrame);
        root1.getChildren().add(iNN11.spriteFrame);
//            root1.getChildren().add(iNN12.spriteFrame);
//            root1.getChildren().add(iNN13.spriteFrame);
        root1.getChildren().add(iNN14.spriteFrame);
        root1.getChildren().add(iNN15.spriteFrame);

        root1.getChildren().add(iOO1.spriteFrame);
        root1.getChildren().add(iOO2.spriteFrame);
        root1.getChildren().add(iOO3.spriteFrame);
        root1.getChildren().add(iOO7.spriteFrame);
        root1.getChildren().add(iOO8.spriteFrame);
        root1.getChildren().add(iOO81.spriteFrame);
        root1.getChildren().add(iOO9.spriteFrame);
        root1.getChildren().add(iOO91.spriteFrame);
        root1.getChildren().add(iOO10.spriteFrame);
        root1.getChildren().add(iOO11.spriteFrame);
        root1.getChildren().add(iOO111.spriteFrame);
        root1.getChildren().add(iOO12.spriteFrame);
        root1.getChildren().add(iOO121.spriteFrame);
        root1.getChildren().add(iOO13.spriteFrame);
        root1.getChildren().add(iOO14.spriteFrame);
        root1.getChildren().add(iOO15.spriteFrame);

        // Add player
        root1.getChildren().add(main1.spriteFrame);
        
    }

    private void createCastingDirection() {
        castDirector = new CastingDirector();
        castDirector.addCurrentCast(iPR0, iPR1, main, main1, enemy);

        castDirector.addCurrentCast(iB3, iB4, iB5,iB6, iB7, iB9, iB10, iB11, iB12, iC2, iC8, iD3, iD4, iD6, iD11, iD12,
                iE4, iE6, iE8, iE12, iF3, iF4, iF6, iF8, iF12, iG1, iG7, iG9, iG10, iG11, iH2, iH3, iH5, iH7, iH8, iH9,
                iH10, iH11, iK1, iK5, iK12, iL2, iL3, iL4, iL6, iL7, iL8, iL9, iL10, iL11);
        castingDirector1 = new CastingDirector();
        //castingDirector1.addCurrentCast();

    }


    private void createStartGameLoop() {
        gamePlayLoop = new GamePlayLoop(this);
        gamePlayLoop.start();
    }

}