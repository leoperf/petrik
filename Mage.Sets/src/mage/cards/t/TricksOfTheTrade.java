
package mage.cards.t;

import java.util.UUID;

import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.combat.CantBeBlockedAttachedEffect;
import mage.abilities.effects.common.continuous.BoostEnchantedEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.AttachmentType;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Outcome;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author North
 */
public final class TricksOfTheTrade extends CardImpl {

    public TricksOfTheTrade(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{3}{U}");
        this.subtype.add(SubType.AURA);


        // Enchant creature
        TargetPermanent auraTarget = new TargetCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.AddAbility));
        this.addAbility(new EnchantAbility(auraTarget));

        // Enchanted creature gets +2/+0 and can't be blocked.
        Ability ability = new SimpleStaticAbility(new BoostEnchantedEffect(2, 0));
        ability.addEffect(new CantBeBlockedAttachedEffect(AttachmentType.AURA).setText("and can't be blocked"));
        this.addAbility(ability);
    }

    private TricksOfTheTrade(final TricksOfTheTrade card) {
        super(card);
    }

    @Override
    public TricksOfTheTrade copy() {
        return new TricksOfTheTrade(this);
    }
}
