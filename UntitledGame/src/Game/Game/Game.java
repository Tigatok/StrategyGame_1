package Game.Game;

import Game.Entity.Player;
import Game.location.Location;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by Tyler on 2/22/2015.
 */
public class Game extends BasicGameState {
    private int id;
    private SpriteSheet playerSpriteSheet, player_move_left_sprite, player_move_right_sprite, player_move_up_sprite, player_move_down_sprite;
    private Animation playerAnimation, player_move_left, player_move_right, player_move_up, player_move_down;
    private Player player;
    private int tick;
    private int second;

    public Game(int id) {
        this.id = id;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {

        player_move_left_sprite = new SpriteSheet("images/characterSprites/male_walk_left_1.png", 32, 32);
        player_move_left = new Animation(player_move_left_sprite, 100); //100 miliseconds before the image jumps to the next one.

        player_move_right_sprite = new SpriteSheet("images/characterSprites/male_walk_right_1.png", 32, 32);
        player_move_right = new Animation(player_move_right_sprite, 100); //100 miliseconds before the image jumps to the next one.

        player_move_up_sprite = new SpriteSheet("images/characterSprites/male_walk_backward_1.png", 32, 32);
        player_move_up = new Animation(player_move_up_sprite, 100); //100 miliseconds before the image jumps to the next one.

        player_move_down_sprite = new SpriteSheet("images/characterSprites/male_walk_forward_1.png", 32, 32);
        player_move_down = new Animation(player_move_down_sprite, 100); //100 miliseconds before the image jumps to the next one.

        playerSpriteSheet = player_move_down_sprite;
        playerAnimation = player_move_down;



        player = new Player(new Location(32, 32, 1, 0));
    }

    /**
     * @param gameContainer
     * @param stateBasedGame
     * @param graphics
     * @throws SlickException
     * @todo, instead of calling it 4 times, just update and have the direction be rendered already. in the class.
     */
    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
        playerAnimation.draw(player.getLocation().getX(), player.getLocation().getY());
    }


    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int delta) throws SlickException {
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
                playerAnimation.start();
                playerAnimation.update(delta);
                playerSpriteSheet = player_move_left_sprite;
                playerAnimation = player_move_left;
                player.setDir(1);
                player.setX(player.getX() - 1);
            } else {
                playerAnimation.stop();
            }
            if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
                playerAnimation.start();
                playerAnimation.update(delta);
                playerSpriteSheet = player_move_right_sprite;
                playerAnimation = player_move_right;
                player.setDir(2);
                player.setX(player.getX() + 1);
            } else {
                playerAnimation.stop();
            }
            if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)) {
                playerAnimation.start();
                playerAnimation.update(delta);
                playerSpriteSheet = player_move_down_sprite;
                playerAnimation = player_move_down;
                player.setDir(3);
                player.setY(player.getY() + 1);
            } else {
                playerAnimation.stop();
            }
            if (gameContainer.getInput().isKeyDown(Input.KEY_UP)) {
                playerAnimation.start();
                playerAnimation.update(delta);
                playerSpriteSheet = player_move_up_sprite;
                playerAnimation = player_move_up;
                player.setDir(4);
                player.setY(player.getY() - 1);
            } else {
                playerAnimation.stop();
            }
            if (gameContainer.getInput().isKeyPressed(Input.KEY_LEFT)) {
                playerSpriteSheet = player_move_left_sprite;
                playerAnimation = player_move_left;
                player.setDir(1);
                player.setX(player.getX() - 1);
            }
            if (gameContainer.getInput().isKeyPressed(Input.KEY_RIGHT)) {
                playerSpriteSheet = player_move_right_sprite;
                playerAnimation = player_move_right;
                player.setDir(2);
                player.setX(player.getX() + 1);
            }
            if (gameContainer.getInput().isKeyPressed(Input.KEY_DOWN)) {
                playerSpriteSheet = player_move_down_sprite;
                playerAnimation = player_move_down;
                player.setDir(3);
                player.setY(player.getY() + 1);
            }
            if (gameContainer.getInput().isKeyPressed(Input.KEY_UP)) {
                playerAnimation = player_move_up;
                playerSpriteSheet = player_move_up_sprite;
                player.setDir(4);
                player.setY(player.getY() - 1);
            }
        }

}
