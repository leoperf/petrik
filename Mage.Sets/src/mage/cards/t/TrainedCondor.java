package mage.cards.t;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksTriggeredAbility;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.target.TargetPermanent;

/**
 *
 * @author awjackson
 */
public final class TrainedCondor extends CardImpl {

    public TrainedCondor(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");
        this.subtype.add(SubType.BIRD);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Whenever Trained Condor attacks, another target creature you control gains flying until end of turn.
        Ability ability = new AttacksTriggeredAbility(new GainAbilityTargetEffect(FlyingAbility.getInstance(), Duration.EndOfTurn));
        ability.addTarget(new TargetPermanent(StaticFilters.FILTER_ANOTHER_TARGET_CREATURE_YOU_CONTROL));
        this.addAbility(ability);
    }

    private TrainedCondor(final TrainedCondor card) {
        super(card);
    }

    @Override
    public TrainedCondor copy() {
        return new TrainedCondor(this);
    }
}
