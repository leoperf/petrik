package mage.deck;

import mage.cards.decks.Constructed;

/**
 * This class validates a deck for the Old School 93/94 format, specifically the
 * EudoGames Rules.
 * <p>
 * This was originally made to follow the deck construction rules found at the
 * Old School Mtg blog found at:
 * http://oldschool-mtg.blogspot.com/p/banrestriction.html
 * <p>
 * There is no mana burn in this version of old school.
 *
 * @author jmharmon
 */
public class OldSchool9394EG extends Constructed {

    public OldSchool9394EG() {
        super("Constructed - Old School 93/94 - EudoGames Rules");

        // use the set instances to make sure that we get the correct set codes
        setCodes.add(mage.sets.LimitedEditionAlpha.getInstance().getCode());
        setCodes.add(mage.sets.LimitedEditionBeta.getInstance().getCode());
        setCodes.add(mage.sets.UnlimitedEdition.getInstance().getCode());
        setCodes.add(mage.sets.ArabianNights.getInstance().getCode());
        setCodes.add(mage.sets.Antiquities.getInstance().getCode());
        setCodes.add(mage.sets.Legends.getInstance().getCode());
        setCodes.add(mage.sets.TheDark.getInstance().getCode());
        setCodes.add(mage.sets.RevisedEdition.getInstance().getCode());
        setCodes.add(mage.sets.FallenEmpires.getInstance().getCode());
        setCodes.add(mage.sets.Chronicles.getInstance().getCode());

        // unban chaos orb, we allow it (restricted) for the xmage-errated version in Old School Constructed.
        banned.removeIf(name -> name.equals("Chaos Orb"));

        restricted.add("Ancestral Recall");
        restricted.add("Balance");
        restricted.add("Black Lotus");
        restricted.add("Braingeyser");
        restricted.add("Channel");
        restricted.add("Chaos Orb");
        restricted.add("Demonic Tutor");
        restricted.add("Library of Alexandria");
        restricted.add("Mana Drain");
        restricted.add("Mana Vault");
        restricted.add("Maze of Ith");
        restricted.add("Mind Twist");
        restricted.add("Mishra's Workshop");
        restricted.add("Mox Emerald");
        restricted.add("Mox Jet");
        restricted.add("Mox Pearl");
        restricted.add("Mox Ruby");
        restricted.add("Mox Sapphire");
        restricted.add("Regrowth");
        restricted.add("Recall");
        restricted.add("Shahrazad");
        restricted.add("Sol Ring");
        restricted.add("Strip Mine");
        restricted.add("Time Vault");
        restricted.add("Time Walk");
        restricted.add("Timetwister");
        restricted.add("Wheel of Fortune");
    }
}
