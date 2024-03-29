package mage.abilities.condition.common;

import mage.abilities.Ability;
import mage.abilities.SpellAbility;
import mage.abilities.condition.Condition;
import mage.game.Game;

/**
 * @author LevelX2
 */

public enum SourceIsSpellCondition implements Condition {

    instance;

    @Override
    public boolean apply(Game game, Ability source) {
        return source instanceof SpellAbility;
    }
}
