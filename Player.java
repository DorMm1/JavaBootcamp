package TestLearning;

import java.util.Stack;

public class Player {

    Stack<GameMap> saves;
    GameMap currentMap;
    boolean dead;

    public Player(GameMap currentMap) {

        this.currentMap = currentMap;
        this.saves = new Stack<>();
        this.dead = false;
    }

    private boolean isDead() {
        if (this.saves.isEmpty()) System.out.println("You Died");
        else {
            System.out.println("Loading Last Save");
            this.currentMap = saves.pop();
            return false;
        }
        return true;
    }
    public boolean gameStatus(){
        return dead;
    }



    public void play(char key) {

        switch (key) {
            case '1':
                if (this.currentMap.getyLocation() != 0)
                    this.currentMap.MoveUp();
                else dead = isDead();
                break;
            case '2':
                if (this.currentMap.getyLocation() != 4)
                    this.currentMap.MoveDown();
                else dead = isDead();
                break;
            case '3':
                if (this.currentMap.getxLocation() != 4)
                    this.currentMap.MoveRight();
                else dead = isDead();
                break;
            case '4':
                if (this.currentMap.getxLocation() != 0)
                    this.currentMap.MoveLeft();
                else dead = isDead();
                break;
            case '+':
                this.currentMap.incrementChar();
                break;
            case '-':
                this.currentMap.decrementChar();
                break;
            case 's':
                System.out.println("Saving location");
                this.saves.push(this.currentMap.cloneMap());
                break;
            case 'x':
                System.out.println("Exiting game");
                dead = true;
                break;
            case 'l':
                if(this.saves.isEmpty()) System.out.println("You don't have a save available");
                else{
                    System.out.println("Loading Last Location, you have :"+(saves.size()-1)+" left");
                    this.currentMap.loadMap(saves.pop());
                }
        }
        if (!dead) this.currentMap.printMap();
    }

}
/*
                1 2 3 4 5
                1 2 3 4 5
                1 2 3 4 5
                1 2 3 4 5
                1 2 3 4 5    */