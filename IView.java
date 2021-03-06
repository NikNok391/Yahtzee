package view;

/**
 *
 * @author niklaswittenbrink
 */
import model.Dice;
import model.Player;
import rules.IGameMode;

import java.util.ArrayList;


public interface IView {

    public enum InputValue {
        ROLL, SCORE, LOAD, SKIP, QUIT, NEW, NOTHING
    }

    void WelcomeMessage(); //Startup Window
    String GetInput();         //Get the input choice from the user
    InputValue CheckInput(String input);       //Check what to send to the controller
    void DisplayScoreSheet( Player p, IGameMode gameMode, int currentRound);     //To show the score of per player
    void DisplayDiceRoll(ArrayList<Dice> dice);        //Parameter should get the dice from the game
    int[] DisplayHold();
    boolean DisplaySave();     //Not sure of the parameter
    void DisplayGameOver(Player player);
    void DisplayBye();
    void PrintScoreSheet (Player player);
}