package rules;

/**
 *
 * @author niklaswittenbrink
 */
import java.io.Serializable;


public class TopDownRules implements IGameMode, Serializable {


    public String getGameMode() {
        return "TopDownRules";
    }
}