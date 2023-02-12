package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class PhyrexiaAllWillBeOneCommander extends ExpansionSet {

    private static final PhyrexiaAllWillBeOneCommander instance = new PhyrexiaAllWillBeOneCommander();

    public static PhyrexiaAllWillBeOneCommander getInstance() {
        return instance;
    }

    private PhyrexiaAllWillBeOneCommander() {
        super("Phyrexia: All Will Be One Commander", "ONC", ExpansionSet.buildDate(2023, 1, 10), SetType.SUPPLEMENTAL);
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Adriana, Captain of the Guard", 114, Rarity.RARE, mage.cards.a.AdrianaCaptainOfTheGuard.class));
        cards.add(new SetCardInfo("Arcane Signet", 125, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Assemble the Legion", 115, Rarity.RARE, mage.cards.a.AssembleTheLegion.class));
        cards.add(new SetCardInfo("Battle Screech", 59, Rarity.UNCOMMON, mage.cards.b.BattleScreech.class));
        cards.add(new SetCardInfo("Beast Within", 104, Rarity.SPECIAL, mage.cards.b.BeastWithin.class));
        cards.add(new SetCardInfo("Blight Mamba", 105, Rarity.COMMON, mage.cards.b.BlightMamba.class));
        cards.add(new SetCardInfo("Bojuka Bog", 145, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Boros Charm", 116, Rarity.UNCOMMON, mage.cards.b.BorosCharm.class));
        cards.add(new SetCardInfo("Boros Garrison", 146, Rarity.UNCOMMON, mage.cards.b.BorosGarrison.class));
        cards.add(new SetCardInfo("Boros Signet", 126, Rarity.UNCOMMON, mage.cards.b.BorosSignet.class));
        cards.add(new SetCardInfo("Buried Ruin", 147, Rarity.UNCOMMON, mage.cards.b.BuriedRuin.class));
        cards.add(new SetCardInfo("Call the Coppercoats", 60, Rarity.RARE, mage.cards.c.CallTheCoppercoats.class));
        cards.add(new SetCardInfo("Canopy Vista", 148, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Caress of Phyrexia", 92, Rarity.UNCOMMON, mage.cards.c.CaressOfPhyrexia.class));
        cards.add(new SetCardInfo("Carrion Call", 106, Rarity.UNCOMMON, mage.cards.c.CarrionCall.class));
        cards.add(new SetCardInfo("Castle Ardenvale", 149, Rarity.RARE, mage.cards.c.CastleArdenvale.class));
        cards.add(new SetCardInfo("Castle Embereth", 150, Rarity.RARE, mage.cards.c.CastleEmbereth.class));
        cards.add(new SetCardInfo("Chain Reaction", 97, Rarity.RARE, mage.cards.c.ChainReaction.class));
        cards.add(new SetCardInfo("Chromatic Lantern", 127, Rarity.RARE, mage.cards.c.ChromaticLantern.class));
        cards.add(new SetCardInfo("Clever Concealment", 5, Rarity.RARE, mage.cards.c.CleverConcealment.class));
        cards.add(new SetCardInfo("Collective Effort", 61, Rarity.RARE, mage.cards.c.CollectiveEffort.class));
        cards.add(new SetCardInfo("Command Tower", 151, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 128, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Contagion Clasp", 129, Rarity.UNCOMMON, mage.cards.c.ContagionClasp.class));
        cards.add(new SetCardInfo("Court of Grace", 62, Rarity.RARE, mage.cards.c.CourtOfGrace.class));
        cards.add(new SetCardInfo("Culling Ritual", 117, Rarity.RARE, mage.cards.c.CullingRitual.class));
        cards.add(new SetCardInfo("Cultivate", 107, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Cut a Deal", 63, Rarity.UNCOMMON, mage.cards.c.CutADeal.class));
        cards.add(new SetCardInfo("Dragonmaster Outcast", 98, Rarity.MYTHIC, mage.cards.d.DragonmasterOutcast.class));
        cards.add(new SetCardInfo("Elspeth Tirel", 64, Rarity.MYTHIC, mage.cards.e.ElspethTirel.class));
        cards.add(new SetCardInfo("Emeria Angel", 65, Rarity.RARE, mage.cards.e.EmeriaAngel.class));
        cards.add(new SetCardInfo("Evolution Sage", 108, Rarity.UNCOMMON, mage.cards.e.EvolutionSage.class));
        cards.add(new SetCardInfo("Exotic Orchard", 152, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Felidar Retreat", 66, Rarity.RARE, mage.cards.f.FelidarRetreat.class));
        cards.add(new SetCardInfo("Fellwar Stone", 130, Rarity.UNCOMMON, mage.cards.f.FellwarStone.class));
        cards.add(new SetCardInfo("Finale of Glory", 67, Rarity.MYTHIC, mage.cards.f.FinaleOfGlory.class));
        cards.add(new SetCardInfo("Flawless Maneuver", 68, Rarity.RARE, mage.cards.f.FlawlessManeuver.class));
        cards.add(new SetCardInfo("Forgotten Cave", 153, Rarity.UNCOMMON, mage.cards.f.ForgottenCave.class));
        cards.add(new SetCardInfo("Fortified Village", 154, Rarity.RARE, mage.cards.f.FortifiedVillage.class));
        cards.add(new SetCardInfo("Fumigate", 69, Rarity.RARE, mage.cards.f.Fumigate.class));
        cards.add(new SetCardInfo("Furycalm Snarl", 155, Rarity.RARE, mage.cards.f.FurycalmSnarl.class));
        cards.add(new SetCardInfo("Generous Gift", 70, Rarity.UNCOMMON, mage.cards.g.GenerousGift.class));
        cards.add(new SetCardInfo("Ghostly Prison", 71, Rarity.UNCOMMON, mage.cards.g.GhostlyPrison.class));
        cards.add(new SetCardInfo("Glimmer Lens", 6, Rarity.RARE, mage.cards.g.GlimmerLens.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glimmer Lens", 44, Rarity.RARE, mage.cards.g.GlimmerLens.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glistening Sphere", 20, Rarity.RARE, mage.cards.g.GlisteningSphere.class));
        cards.add(new SetCardInfo("Goldnight Commander", 72, Rarity.UNCOMMON, mage.cards.g.GoldnightCommander.class));
        cards.add(new SetCardInfo("Golgari Signet", 131, Rarity.UNCOMMON, mage.cards.g.GolgariSignet.class));
        cards.add(new SetCardInfo("Grafted Exoskeleton", 132, Rarity.UNCOMMON, mage.cards.g.GraftedExoskeleton.class));
        cards.add(new SetCardInfo("Grateful Apparition", 73, Rarity.UNCOMMON, mage.cards.g.GratefulApparition.class));
        cards.add(new SetCardInfo("Harmonious Archon", 74, Rarity.MYTHIC, mage.cards.h.HarmoniousArchon.class));
        cards.add(new SetCardInfo("Hate Mirage", 99, Rarity.UNCOMMON, mage.cards.h.HateMirage.class));
        cards.add(new SetCardInfo("Heroic Reinforcements", 118, Rarity.UNCOMMON, mage.cards.h.HeroicReinforcements.class));
        cards.add(new SetCardInfo("Hordeling Outburst", 100, Rarity.UNCOMMON, mage.cards.h.HordelingOutburst.class));
        cards.add(new SetCardInfo("Hour of Reckoning", 75, Rarity.RARE, mage.cards.h.HourOfReckoning.class));
        cards.add(new SetCardInfo("Ichor Rats", 93, Rarity.UNCOMMON, mage.cards.i.IchorRats.class));
        cards.add(new SetCardInfo("Ichorclaw Myr", 133, Rarity.COMMON, mage.cards.i.IchorclawMyr.class));
        cards.add(new SetCardInfo("Idol of Oblivion", 134, Rarity.RARE, mage.cards.i.IdolOfOblivion.class));
        cards.add(new SetCardInfo("Increasing Devotion", 76, Rarity.RARE, mage.cards.i.IncreasingDevotion.class));
        cards.add(new SetCardInfo("Intangible Virtue", 77, Rarity.UNCOMMON, mage.cards.i.IntangibleVirtue.class));
        cards.add(new SetCardInfo("Ixhel, Scion of Atraxa", 1, Rarity.MYTHIC, mage.cards.i.IxhelScionOfAtraxa.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ixhel, Scion of Atraxa", 29, Rarity.MYTHIC, mage.cards.i.IxhelScionOfAtraxa.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ixhel, Scion of Atraxa", 37, Rarity.MYTHIC, mage.cards.i.IxhelScionOfAtraxa.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jor Kadeen, the Prevailer", 119, Rarity.RARE, mage.cards.j.JorKadeenThePrevailer.class));
        cards.add(new SetCardInfo("Karn's Bastion", 156, Rarity.RARE, mage.cards.k.KarnsBastion.class));
        cards.add(new SetCardInfo("Kher Keep", 157, Rarity.RARE, mage.cards.k.KherKeep.class));
        cards.add(new SetCardInfo("Krosan Verge", 158, Rarity.UNCOMMON, mage.cards.k.KrosanVerge.class));
        cards.add(new SetCardInfo("Legion Warboss", 101, Rarity.RARE, mage.cards.l.LegionWarboss.class));
        cards.add(new SetCardInfo("Loxodon Warhammer", 135, Rarity.RARE, mage.cards.l.LoxodonWarhammer.class));
        cards.add(new SetCardInfo("Loyal Apprentice", 102, Rarity.UNCOMMON, mage.cards.l.LoyalApprentice.class));
        cards.add(new SetCardInfo("Mace of the Valiant", 78, Rarity.RARE, mage.cards.m.MaceOfTheValiant.class));
        cards.add(new SetCardInfo("Martial Coup", 79, Rarity.RARE, mage.cards.m.MartialCoup.class));
        cards.add(new SetCardInfo("Mask of Memory", 136, Rarity.UNCOMMON, mage.cards.m.MaskOfMemory.class));
        cards.add(new SetCardInfo("Maul of the Skyclaves", 80, Rarity.RARE, mage.cards.m.MaulOfTheSkyclaves.class));
        cards.add(new SetCardInfo("Mentor of the Meek", 81, Rarity.RARE, mage.cards.m.MentorOfTheMeek.class));
        cards.add(new SetCardInfo("Merciless Eviction", 120, Rarity.RARE, mage.cards.m.MercilessEviction.class));
        cards.add(new SetCardInfo("Midnight Haunting", 82, Rarity.UNCOMMON, mage.cards.m.MidnightHaunting.class));
        cards.add(new SetCardInfo("Mind Stone", 137, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Mirage Mockery", 22, Rarity.RARE, mage.cards.m.MirageMockery.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mirage Mockery", 32, Rarity.RARE, mage.cards.m.MirageMockery.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Moldervine Reclamation", 121, Rarity.UNCOMMON, mage.cards.m.MoldervineReclamation.class));
        cards.add(new SetCardInfo("Monumental Corruption", 24, Rarity.RARE, mage.cards.m.MonumentalCorruption.class));
        cards.add(new SetCardInfo("Mortify", 122, Rarity.UNCOMMON, mage.cards.m.Mortify.class));
        cards.add(new SetCardInfo("Mycosynth Fiend", 109, Rarity.UNCOMMON, mage.cards.m.MycosynthFiend.class));
        cards.add(new SetCardInfo("Myr Battlesphere", 138, Rarity.RARE, mage.cards.m.MyrBattlesphere.class));
        cards.add(new SetCardInfo("Myriad Landscape", 159, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Necroblossom Snarl", 160, Rarity.RARE, mage.cards.n.NecroblossomSnarl.class));
        cards.add(new SetCardInfo("Night's Whisper", 94, Rarity.COMMON, mage.cards.n.NightsWhisper.class));
        cards.add(new SetCardInfo("Norn's Annex", 83, Rarity.RARE, mage.cards.n.NornsAnnex.class));
        cards.add(new SetCardInfo("Noxious Revival", 110, Rarity.UNCOMMON, mage.cards.n.NoxiousRevival.class));
        cards.add(new SetCardInfo("Otharri, Suns' Glory", 3, Rarity.MYTHIC, mage.cards.o.OtharriSunsGlory.class));
        cards.add(new SetCardInfo("Painful Truths", 95, Rarity.RARE, mage.cards.p.PainfulTruths.class));
        cards.add(new SetCardInfo("Path of Ancestry", 161, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Path to Exile", 84, Rarity.UNCOMMON, mage.cards.p.PathToExile.class));
        cards.add(new SetCardInfo("Phantom General", 85, Rarity.UNCOMMON, mage.cards.p.PhantomGeneral.class));
        cards.add(new SetCardInfo("Phyrexian Rebirth", 86, Rarity.RARE, mage.cards.p.PhyrexianRebirth.class));
        cards.add(new SetCardInfo("Phyrexian Swarmlord", 111, Rarity.RARE, mage.cards.p.PhyrexianSwarmlord.class));
        cards.add(new SetCardInfo("Plague Myr", 139, Rarity.UNCOMMON, mage.cards.p.PlagueMyr.class));
        cards.add(new SetCardInfo("Plague Stinger", 96, Rarity.COMMON, mage.cards.p.PlagueStinger.class));
        cards.add(new SetCardInfo("Prava of the Steel Legion", 87, Rarity.UNCOMMON, mage.cards.p.PravaOfTheSteelLegion.class));
        cards.add(new SetCardInfo("Putrefy", 123, Rarity.UNCOMMON, mage.cards.p.Putrefy.class));
        cards.add(new SetCardInfo("Rip Apart", 124, Rarity.UNCOMMON, mage.cards.r.RipApart.class));
        cards.add(new SetCardInfo("Roar of Resistance", 15, Rarity.RARE, mage.cards.r.RoarOfResistance.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Roar of Resistance", 53, Rarity.RARE, mage.cards.r.RoarOfResistance.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sandsteppe Citadel", 162, Rarity.UNCOMMON, mage.cards.s.SandsteppeCitadel.class));
        cards.add(new SetCardInfo("Scavenging Ooze", 112, Rarity.RARE, mage.cards.s.ScavengingOoze.class));
        cards.add(new SetCardInfo("Secluded Steppe", 163, Rarity.UNCOMMON, mage.cards.s.SecludedSteppe.class));
        cards.add(new SetCardInfo("Shineshadow Snarl", 164, Rarity.RARE, mage.cards.s.ShineshadowSnarl.class));
        cards.add(new SetCardInfo("Siege-Gang Commander", 103, Rarity.RARE, mage.cards.s.SiegeGangCommander.class));
        cards.add(new SetCardInfo("Silverwing Squadron", 88, Rarity.RARE, mage.cards.s.SilverwingSquadron.class));
        cards.add(new SetCardInfo("Skyhunter Strike Force", 21, Rarity.RARE, mage.cards.s.SkyhunterStrikeForce.class));
        cards.add(new SetCardInfo("Slayers' Stronghold", 165, Rarity.RARE, mage.cards.s.SlayersStronghold.class));
        cards.add(new SetCardInfo("Sol Ring", 140, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 141, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Soul-Guide Lantern", 142, Rarity.UNCOMMON, mage.cards.s.SoulGuideLantern.class));
        cards.add(new SetCardInfo("Sungrass Prairie", 166, Rarity.RARE, mage.cards.s.SungrassPrairie.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 89, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Tainted Field", 167, Rarity.UNCOMMON, mage.cards.t.TaintedField.class));
        cards.add(new SetCardInfo("Tainted Wood", 168, Rarity.UNCOMMON, mage.cards.t.TaintedWood.class));
        cards.add(new SetCardInfo("Talisman of Conviction", 143, Rarity.UNCOMMON, mage.cards.t.TalismanOfConviction.class));
        cards.add(new SetCardInfo("Temple of Malady", 169, Rarity.RARE, mage.cards.t.TempleOfMalady.class));
        cards.add(new SetCardInfo("Temple of Plenty", 170, Rarity.RARE, mage.cards.t.TempleOfPlenty.class));
        cards.add(new SetCardInfo("Temple of Silence", 171, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of Triumph", 173, Rarity.RARE, mage.cards.t.TempleOfTriumph.class));
        cards.add(new SetCardInfo("Temple of the False God", 172, Rarity.UNCOMMON, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Trailblazer's Boots", 144, Rarity.UNCOMMON, mage.cards.t.TrailblazersBoots.class));
        cards.add(new SetCardInfo("Urtet, Remnant of Memnarch", 28, Rarity.MYTHIC, mage.cards.u.UrtetRemnantOfMemnarch.class));
        cards.add(new SetCardInfo("Viridian Corrupter", 113, Rarity.UNCOMMON, mage.cards.v.ViridianCorrupter.class));
        cards.add(new SetCardInfo("Vishgraz, the Doomhive", 4, Rarity.MYTHIC, mage.cards.v.VishgrazTheDoomhive.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vishgraz, the Doomhive", 40, Rarity.MYTHIC, mage.cards.v.VishgrazTheDoomhive.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("White Sun's Zenith", 90, Rarity.RARE, mage.cards.w.WhiteSunsZenith.class));
        cards.add(new SetCardInfo("Windborn Muse", 91, Rarity.RARE, mage.cards.w.WindbornMuse.class));
        cards.add(new SetCardInfo("Windbrisk Heights", 174, Rarity.RARE, mage.cards.w.WindbriskHeights.class));
    }
}
