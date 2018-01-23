package rules;

/**
 *
 * @author niklaswittenbrink
 */
public class RulesFactory {

    public IGameMode getGameMode() {
        return new NormalRules();
    }
}