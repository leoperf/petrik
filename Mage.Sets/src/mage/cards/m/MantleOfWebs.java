package mage.cards.m;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.AttachEffect;
import mage.abilities.effects.common.continuous.BoostEnchantedEffect;
import mage.abilities.effects.common.continuous.GainAbilityAttachedEffect;
import mage.abilities.keyword.EnchantAbility;
import mage.abilities.keyword.ReachAbility;
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
 * @author emerald000
 */
public final class MantleOfWebs extends CardImpl {

    public MantleOfWebs(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{1}{G}");
        this.subtype.add(SubType.AURA);

        // Enchant creature
        TargetPermanent auraTarget = new TargetCreaturePermanent();
        this.getSpellAbility().addTarget(auraTarget);
        this.getSpellAbility().addEffect(new AttachEffect(Outcome.BoostCreature));
        Ability ability = new EnchantAbility(auraTarget);
        this.addAbility(ability);
        
        // Enchanted creature gets +1/+3 and has reach.
        Ability ability1 = new SimpleStaticAbility(new BoostEnchantedEffect(1, 3));
        ability1.addEffect(new GainAbilityAttachedEffect(ReachAbility.getInstance(), AttachmentType.AURA).setText("and has reach"));
        this.addAbility(ability1);
    }

    private MantleOfWebs(final MantleOfWebs card) {
        super(card);
    }

    @Override
    public MantleOfWebs copy() {
        return new MantleOfWebs(this);
    }
}
