
package mage.cards.s;

import java.util.UUID;

import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.continuous.AddCardTypeAttachedEffect;
import mage.abilities.effects.common.continuous.BoostEquippedEffect;
import mage.abilities.keyword.EquipAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;

/**
 *
 * @author Loki
 */
public final class SilverskinArmor extends CardImpl {

    public SilverskinArmor(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{2}");
        this.subtype.add(SubType.EQUIPMENT);

        // Equipped creature gets +1/+1 and is an artifact in addition to its other types.
        Ability ability = new SimpleStaticAbility(new BoostEquippedEffect(1, 1));
        ability.addEffect(new AddCardTypeAttachedEffect(CardType.ARTIFACT, AttachmentType.EQUIPMENT));
        this.addAbility(ability);

        // Equip {2}
        this.addAbility(new EquipAbility(Outcome.BoostCreature, new ManaCostsImpl<>("{2}"), false));
    }

    private SilverskinArmor(final SilverskinArmor card) {
        super(card);
    }

    @Override
    public SilverskinArmor copy() {
        return new SilverskinArmor(this);
    }
}
