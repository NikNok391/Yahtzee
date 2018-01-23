package rules;

/**
 *
 * @author niklaswittenbrink
 */
import java.io.Serializable;

public class NormalRules implements IGameMode, Serializable {


    public String getGameMode() {
        return "NormalRules";
    }
}
