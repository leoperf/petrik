package mage.cards.b;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.common.BecomesTappedAttachedTriggeredAbility;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.DestroyAttachedToEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.target.TargetPermanent;

/**
 *
 * @author nantuko
 */
public final class BrinkOfDisaster extends CardImpl {

    public BrinkOfDisaster(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{2}{B}{B}");
        this.subtype.add(SubType.AURA);


        // Enchant creature or land
        TargetPermanent auraTarget = new TargetPermanent(StaticFilters.FILTER_PERMANENT_CREATURE_OR_LAND);
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.AddAbility));
        Ability ability = new EnchantAbility(auraTarget);
        this.addAbility(ability);

        // When enchanted permanent becomes tapped, destroy it.
        this.addAbility(new BecomesTappedAttachedTriggeredAbility(new DestroyAttachedToEffect("it"), "")
                .setTriggerPhrase("When enchanted permanent becomes tapped, "));
    }

    private BrinkOfDisaster(final BrinkOfDisaster card) {
        super(card);
    }

    @Override
    public BrinkOfDisaster copy() {
        return new BrinkOfDisaster(this);
    }
}
