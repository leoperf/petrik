package mage.cards.s;

import java.util.UUID;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.DoIfCostPaid;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;
import mage.game.permanent.token.DjinnMonkToken;

/**
 *
 * @author LevelX2
 */
public final class SkywiseTeachings extends CardImpl {

    public SkywiseTeachings(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{U}");

        // Whenever you cast a noncreature spell, you may pay {1}{U}. If you do, create a 2/2 blue Djinn Monk creature token with flying.
        this.addAbility(new SpellCastControllerTriggeredAbility(new DoIfCostPaid(new CreateTokenEffect(new DjinnMonkToken()), new ManaCostsImpl<>("{1}{U}")),
                StaticFilters.FILTER_SPELL_A_NON_CREATURE, false));

    }

    private SkywiseTeachings(final SkywiseTeachings card) {
        super(card);
    }

    @Override
    public SkywiseTeachings copy() {
        return new SkywiseTeachings(this);
    }
}
