
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author North
 */
public final class FallenEmpires extends ExpansionSet {

    private static final FallenEmpires instance = new FallenEmpires();

    public static FallenEmpires getInstance() {
        return instance;
    }

    private FallenEmpires() {
        super("Fallen Empires", "FEM", ExpansionSet.buildDate(1994, 10, 1), SetType.EXPANSION);
        this.hasBasicLands = false;
        this.hasBoosters = true; // note: paper boosters had only 8 cards
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Aeolipile", 81, Rarity.RARE, mage.cards.a.Aeolipile.class));
        cards.add(new SetCardInfo("Armor Thrull", "33a", Rarity.COMMON, mage.cards.a.ArmorThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Armor Thrull", "33b", Rarity.COMMON, mage.cards.a.ArmorThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Armor Thrull", "33c", Rarity.COMMON, mage.cards.a.ArmorThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Armor Thrull", "33d", Rarity.COMMON, mage.cards.a.ArmorThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Balm of Restoration", 82, Rarity.RARE, mage.cards.b.BalmOfRestoration.class));
        cards.add(new SetCardInfo("Basal Thrull", "34a", Rarity.COMMON, mage.cards.b.BasalThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Basal Thrull", "34b", Rarity.COMMON, mage.cards.b.BasalThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Basal Thrull", "34c", Rarity.COMMON, mage.cards.b.BasalThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Basal Thrull", "34d", Rarity.COMMON, mage.cards.b.BasalThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bottomless Vault", 92, Rarity.RARE, mage.cards.b.BottomlessVault.class));
        cards.add(new SetCardInfo("Brassclaw Orcs", "49a", Rarity.COMMON, mage.cards.b.BrassclawOrcs.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brassclaw Orcs", "49b", Rarity.COMMON, mage.cards.b.BrassclawOrcs.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brassclaw Orcs", "49c", Rarity.COMMON, mage.cards.b.BrassclawOrcs.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brassclaw Orcs", "49d", Rarity.COMMON, mage.cards.b.BrassclawOrcs.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Breeding Pit", 35, Rarity.UNCOMMON, mage.cards.b.BreedingPit.class));
        cards.add(new SetCardInfo("Combat Medic", "1a", Rarity.COMMON, mage.cards.c.CombatMedic.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Combat Medic", "1b", Rarity.COMMON, mage.cards.c.CombatMedic.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Combat Medic", "1c", Rarity.COMMON, mage.cards.c.CombatMedic.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Combat Medic", "1d", Rarity.COMMON, mage.cards.c.CombatMedic.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Conch Horn", 83, Rarity.RARE, mage.cards.c.ConchHorn.class));
        cards.add(new SetCardInfo("Deep Spawn", 17, Rarity.UNCOMMON, mage.cards.d.DeepSpawn.class));
        cards.add(new SetCardInfo("Delif's Cone", 84, Rarity.COMMON, mage.cards.d.DelifsCone.class));
        cards.add(new SetCardInfo("Delif's Cube", 85, Rarity.RARE, mage.cards.d.DelifsCube.class));
        cards.add(new SetCardInfo("Derelor", 36, Rarity.RARE, mage.cards.d.Derelor.class));
        cards.add(new SetCardInfo("Draconian Cylix", 86, Rarity.RARE, mage.cards.d.DraconianCylix.class));
        cards.add(new SetCardInfo("Dwarven Armorer", 50, Rarity.RARE, mage.cards.d.DwarvenArmorer.class));
        cards.add(new SetCardInfo("Dwarven Catapult", 51, Rarity.UNCOMMON, mage.cards.d.DwarvenCatapult.class));
        cards.add(new SetCardInfo("Dwarven Hold", 93, Rarity.RARE, mage.cards.d.DwarvenHold.class));
        cards.add(new SetCardInfo("Dwarven Lieutenant", 52, Rarity.UNCOMMON, mage.cards.d.DwarvenLieutenant.class));
        cards.add(new SetCardInfo("Dwarven Ruins", 94, Rarity.UNCOMMON, mage.cards.d.DwarvenRuins.class));
        cards.add(new SetCardInfo("Dwarven Soldier", "53a", Rarity.COMMON, mage.cards.d.DwarvenSoldier.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dwarven Soldier", "53b", Rarity.COMMON, mage.cards.d.DwarvenSoldier.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dwarven Soldier", "53c", Rarity.COMMON, mage.cards.d.DwarvenSoldier.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ebon Praetor", 37, Rarity.RARE, mage.cards.e.EbonPraetor.class));
        cards.add(new SetCardInfo("Ebon Stronghold", 95, Rarity.UNCOMMON, mage.cards.e.EbonStronghold.class));
        cards.add(new SetCardInfo("Elven Fortress", "65a", Rarity.COMMON, mage.cards.e.ElvenFortress.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elven Fortress", "65b", Rarity.COMMON, mage.cards.e.ElvenFortress.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elven Fortress", "65c", Rarity.COMMON, mage.cards.e.ElvenFortress.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elven Fortress", "65d", Rarity.COMMON, mage.cards.e.ElvenFortress.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elven Lyre", 87, Rarity.RARE, mage.cards.e.ElvenLyre.class));
        cards.add(new SetCardInfo("Elvish Farmer", 66, Rarity.RARE, mage.cards.e.ElvishFarmer.class));
        cards.add(new SetCardInfo("Elvish Hunter", "67a", Rarity.COMMON, mage.cards.e.ElvishHunter.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elvish Hunter", "67b", Rarity.COMMON, mage.cards.e.ElvishHunter.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elvish Hunter", "67c", Rarity.COMMON, mage.cards.e.ElvishHunter.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elvish Scout", "68a", Rarity.COMMON, mage.cards.e.ElvishScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elvish Scout", "68b", Rarity.COMMON, mage.cards.e.ElvishScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elvish Scout", "68c", Rarity.COMMON, mage.cards.e.ElvishScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Farrel's Mantle", 2, Rarity.UNCOMMON, mage.cards.f.FarrelsMantle.class));
        cards.add(new SetCardInfo("Farrel's Zealot", "3a", Rarity.COMMON, mage.cards.f.FarrelsZealot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Farrel's Zealot", "3b", Rarity.COMMON, mage.cards.f.FarrelsZealot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Farrel's Zealot", "3c", Rarity.COMMON, mage.cards.f.FarrelsZealot.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Farrelite Priest", 4, Rarity.UNCOMMON, mage.cards.f.FarrelitePriest.class));
        cards.add(new SetCardInfo("Feral Thallid", 69, Rarity.UNCOMMON, mage.cards.f.FeralThallid.class));
        cards.add(new SetCardInfo("Fungal Bloom", 70, Rarity.RARE, mage.cards.f.FungalBloom.class));
        cards.add(new SetCardInfo("Goblin Chirurgeon", "54a", Rarity.COMMON, mage.cards.g.GoblinChirurgeon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin Chirurgeon", "54b", Rarity.COMMON, mage.cards.g.GoblinChirurgeon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin Chirurgeon", "54c", Rarity.COMMON, mage.cards.g.GoblinChirurgeon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin Flotilla", 55, Rarity.RARE, mage.cards.g.GoblinFlotilla.class));
        cards.add(new SetCardInfo("Goblin Grenade", "56a", Rarity.COMMON, mage.cards.g.GoblinGrenade.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin Grenade", "56b", Rarity.COMMON, mage.cards.g.GoblinGrenade.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin Grenade", "56c", Rarity.COMMON, mage.cards.g.GoblinGrenade.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin Kites", 57, Rarity.UNCOMMON, mage.cards.g.GoblinKites.class));
        cards.add(new SetCardInfo("Goblin War Drums", "58a", Rarity.COMMON, mage.cards.g.GoblinWarDrums.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin War Drums", "58b", Rarity.COMMON, mage.cards.g.GoblinWarDrums.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin War Drums", "58c", Rarity.COMMON, mage.cards.g.GoblinWarDrums.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin War Drums", "58d", Rarity.COMMON, mage.cards.g.GoblinWarDrums.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Goblin Warrens", 59, Rarity.RARE, mage.cards.g.GoblinWarrens.class));
        cards.add(new SetCardInfo("Hand of Justice", 5, Rarity.RARE, mage.cards.h.HandOfJustice.class));
        cards.add(new SetCardInfo("Havenwood Battleground", 96, Rarity.UNCOMMON, mage.cards.h.HavenwoodBattleground.class));
        cards.add(new SetCardInfo("Heroism", 6, Rarity.UNCOMMON, mage.cards.h.Heroism.class));
        cards.add(new SetCardInfo("High Tide", "18a", Rarity.COMMON, mage.cards.h.HighTide.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("High Tide", "18b", Rarity.COMMON, mage.cards.h.HighTide.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("High Tide", "18c", Rarity.COMMON, mage.cards.h.HighTide.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hollow Trees", 97, Rarity.RARE, mage.cards.h.HollowTrees.class));
        cards.add(new SetCardInfo("Homarid Shaman", 20, Rarity.RARE, mage.cards.h.HomaridShaman.class));
        cards.add(new SetCardInfo("Homarid Spawning Bed", 21, Rarity.UNCOMMON, mage.cards.h.HomaridSpawningBed.class));
        cards.add(new SetCardInfo("Homarid Warrior", "22a", Rarity.COMMON, mage.cards.h.HomaridWarrior.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Homarid Warrior", "22b", Rarity.COMMON, mage.cards.h.HomaridWarrior.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Homarid Warrior", "22c", Rarity.COMMON, mage.cards.h.HomaridWarrior.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Homarid", "19a", Rarity.COMMON, mage.cards.h.Homarid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Homarid", "19b", Rarity.COMMON, mage.cards.h.Homarid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Homarid", "19c", Rarity.COMMON, mage.cards.h.Homarid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Homarid", "19d", Rarity.COMMON, mage.cards.h.Homarid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hymn to Tourach", "38a", Rarity.COMMON, mage.cards.h.HymnToTourach.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hymn to Tourach", "38b", Rarity.COMMON, mage.cards.h.HymnToTourach.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hymn to Tourach", "38c", Rarity.COMMON, mage.cards.h.HymnToTourach.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hymn to Tourach", "38d", Rarity.COMMON, mage.cards.h.HymnToTourach.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Infantry", "7a", Rarity.COMMON, mage.cards.i.IcatianInfantry.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Infantry", "7b", Rarity.COMMON, mage.cards.i.IcatianInfantry.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Infantry", "7c", Rarity.COMMON, mage.cards.i.IcatianInfantry.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Infantry", "7d", Rarity.COMMON, mage.cards.i.IcatianInfantry.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Javelineers", "8a", Rarity.COMMON, mage.cards.i.IcatianJavelineers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Javelineers", "8b", Rarity.COMMON, mage.cards.i.IcatianJavelineers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Javelineers", "8c", Rarity.COMMON, mage.cards.i.IcatianJavelineers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Lieutenant", 9, Rarity.RARE, mage.cards.i.IcatianLieutenant.class));
        cards.add(new SetCardInfo("Icatian Moneychanger", "10a", Rarity.COMMON, mage.cards.i.IcatianMoneychanger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Moneychanger", "10b", Rarity.COMMON, mage.cards.i.IcatianMoneychanger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Moneychanger", "10c", Rarity.COMMON, mage.cards.i.IcatianMoneychanger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Phalanx", 11, Rarity.UNCOMMON, mage.cards.i.IcatianPhalanx.class));
        cards.add(new SetCardInfo("Icatian Priest", 12, Rarity.UNCOMMON, mage.cards.i.IcatianPriest.class));
        cards.add(new SetCardInfo("Icatian Scout", "13a", Rarity.COMMON, mage.cards.i.IcatianScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Scout", "13b", Rarity.COMMON, mage.cards.i.IcatianScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Scout", "13c", Rarity.COMMON, mage.cards.i.IcatianScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Scout", "13d", Rarity.COMMON, mage.cards.i.IcatianScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Icatian Skirmishers", 14, Rarity.RARE, mage.cards.i.IcatianSkirmishers.class));
        cards.add(new SetCardInfo("Icatian Store", 98, Rarity.RARE, mage.cards.i.IcatianStore.class));
        cards.add(new SetCardInfo("Icatian Town", 15, Rarity.RARE, mage.cards.i.IcatianTown.class));
        cards.add(new SetCardInfo("Implements of Sacrifice", 88, Rarity.RARE, mage.cards.i.ImplementsOfSacrifice.class));
        cards.add(new SetCardInfo("Initiates of the Ebon Hand", "39a", Rarity.COMMON, mage.cards.i.InitiatesOfTheEbonHand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Initiates of the Ebon Hand", "39b", Rarity.COMMON, mage.cards.i.InitiatesOfTheEbonHand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Initiates of the Ebon Hand", "39c", Rarity.COMMON, mage.cards.i.InitiatesOfTheEbonHand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Merseine", "23a", Rarity.COMMON, mage.cards.m.Merseine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Merseine", "23b", Rarity.COMMON, mage.cards.m.Merseine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Merseine", "23c", Rarity.COMMON, mage.cards.m.Merseine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Merseine", "23d", Rarity.COMMON, mage.cards.m.Merseine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mindstab Thrull", "40a", Rarity.COMMON, mage.cards.m.MindstabThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mindstab Thrull", "40b", Rarity.COMMON, mage.cards.m.MindstabThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mindstab Thrull", "40c", Rarity.COMMON, mage.cards.m.MindstabThrull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Necrite", "41a", Rarity.COMMON, mage.cards.n.Necrite.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Necrite", "41b", Rarity.COMMON, mage.cards.n.Necrite.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Necrite", "41c", Rarity.COMMON, mage.cards.n.Necrite.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Night Soil", "71a", Rarity.COMMON, mage.cards.n.NightSoil.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Night Soil", "71b", Rarity.COMMON, mage.cards.n.NightSoil.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Night Soil", "71c", Rarity.COMMON, mage.cards.n.NightSoil.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Orcish Captain", 60, Rarity.UNCOMMON, mage.cards.o.OrcishCaptain.class));
        cards.add(new SetCardInfo("Orcish Spy", "61a", Rarity.COMMON, mage.cards.o.OrcishSpy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Orcish Spy", "61b", Rarity.COMMON, mage.cards.o.OrcishSpy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Orcish Spy", "61c", Rarity.COMMON, mage.cards.o.OrcishSpy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Orcish Veteran", "62a", Rarity.COMMON, mage.cards.o.OrcishVeteran.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Orcish Veteran", "62b", Rarity.COMMON, mage.cards.o.OrcishVeteran.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Orcish Veteran", "62c", Rarity.COMMON, mage.cards.o.OrcishVeteran.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Orcish Veteran", "62d", Rarity.COMMON, mage.cards.o.OrcishVeteran.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Order of Leitbur", "16a", Rarity.COMMON, mage.cards.o.OrderOfLeitbur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Order of Leitbur", "16b", Rarity.COMMON, mage.cards.o.OrderOfLeitbur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Order of Leitbur", "16c", Rarity.COMMON, mage.cards.o.OrderOfLeitbur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Order of the Ebon Hand", "42a", Rarity.COMMON, mage.cards.o.OrderOfTheEbonHand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Order of the Ebon Hand", "42b", Rarity.COMMON, mage.cards.o.OrderOfTheEbonHand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Order of the Ebon Hand", "42c", Rarity.COMMON, mage.cards.o.OrderOfTheEbonHand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Orgg", 63, Rarity.RARE, mage.cards.o.Orgg.class));
        cards.add(new SetCardInfo("Raiding Party", 64, Rarity.UNCOMMON, mage.cards.r.RaidingParty.class));
        cards.add(new SetCardInfo("Rainbow Vale", 99, Rarity.RARE, mage.cards.r.RainbowVale.class));
        cards.add(new SetCardInfo("Ring of Renewal", 89, Rarity.RARE, mage.cards.r.RingOfRenewal.class));
        cards.add(new SetCardInfo("River Merfolk", 24, Rarity.RARE, mage.cards.r.RiverMerfolk.class));
        cards.add(new SetCardInfo("Ruins of Trokair", 100, Rarity.UNCOMMON, mage.cards.r.RuinsOfTrokair.class));
        cards.add(new SetCardInfo("Sand Silos", 101, Rarity.RARE, mage.cards.s.SandSilos.class));
        cards.add(new SetCardInfo("Seasinger", 25, Rarity.UNCOMMON, mage.cards.s.Seasinger.class));
        cards.add(new SetCardInfo("Soul Exchange", 43, Rarity.UNCOMMON, mage.cards.s.SoulExchange.class));
        cards.add(new SetCardInfo("Spirit Shield", 90, Rarity.RARE, mage.cards.s.SpiritShield.class));
        cards.add(new SetCardInfo("Spore Cloud", "72a", Rarity.COMMON, mage.cards.s.SporeCloud.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Spore Cloud", "72b", Rarity.COMMON, mage.cards.s.SporeCloud.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Spore Cloud", "72c", Rarity.COMMON, mage.cards.s.SporeCloud.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Spore Flower", 73, Rarity.UNCOMMON, mage.cards.s.SporeFlower.class));
        cards.add(new SetCardInfo("Svyelunite Priest", 26, Rarity.UNCOMMON, mage.cards.s.SvyelunitePriest.class));
        cards.add(new SetCardInfo("Svyelunite Temple", 102, Rarity.UNCOMMON, mage.cards.s.SvyeluniteTemple.class));
        cards.add(new SetCardInfo("Thallid Devourer", 75, Rarity.UNCOMMON, mage.cards.t.ThallidDevourer.class));
        cards.add(new SetCardInfo("Thallid", "74a", Rarity.COMMON, mage.cards.t.Thallid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thallid", "74b", Rarity.COMMON, mage.cards.t.Thallid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thallid", "74c", Rarity.COMMON, mage.cards.t.Thallid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thallid", "74d", Rarity.COMMON, mage.cards.t.Thallid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thelon's Chant", 76, Rarity.UNCOMMON, mage.cards.t.ThelonsChant.class));
        cards.add(new SetCardInfo("Thelon's Curse", 77, Rarity.RARE, mage.cards.t.ThelonsCurse.class));
        cards.add(new SetCardInfo("Thelonite Druid", 78, Rarity.UNCOMMON, mage.cards.t.TheloniteDruid.class));
        cards.add(new SetCardInfo("Thelonite Monk", 79, Rarity.RARE, mage.cards.t.TheloniteMonk.class));
        cards.add(new SetCardInfo("Thorn Thallid", "80a", Rarity.COMMON, mage.cards.t.ThornThallid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thorn Thallid", "80b", Rarity.COMMON, mage.cards.t.ThornThallid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thorn Thallid", "80c", Rarity.COMMON, mage.cards.t.ThornThallid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thorn Thallid", "80d", Rarity.COMMON, mage.cards.t.ThornThallid.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thrull Champion", 44, Rarity.RARE, mage.cards.t.ThrullChampion.class));
        cards.add(new SetCardInfo("Thrull Retainer", 45, Rarity.UNCOMMON, mage.cards.t.ThrullRetainer.class));
        cards.add(new SetCardInfo("Thrull Wizard", 46, Rarity.UNCOMMON, mage.cards.t.ThrullWizard.class));
        cards.add(new SetCardInfo("Tidal Flats", "27a", Rarity.COMMON, mage.cards.t.TidalFlats.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tidal Flats", "27b", Rarity.COMMON, mage.cards.t.TidalFlats.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tidal Flats", "27c", Rarity.COMMON, mage.cards.t.TidalFlats.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tidal Influence", 28, Rarity.UNCOMMON, mage.cards.t.TidalInfluence.class));
        cards.add(new SetCardInfo("Tourach's Chant", 47, Rarity.UNCOMMON, mage.cards.t.TourachsChant.class));
        cards.add(new SetCardInfo("Tourach's Gate", 48, Rarity.RARE, mage.cards.t.TourachsGate.class));
        cards.add(new SetCardInfo("Vodalian Knights", 29, Rarity.RARE, mage.cards.v.VodalianKnights.class));
        cards.add(new SetCardInfo("Vodalian Mage", "30a", Rarity.COMMON, mage.cards.v.VodalianMage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vodalian Mage", "30b", Rarity.COMMON, mage.cards.v.VodalianMage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vodalian Mage", "30c", Rarity.COMMON, mage.cards.v.VodalianMage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vodalian Soldiers", "31a", Rarity.COMMON, mage.cards.v.VodalianSoldiers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vodalian Soldiers", "31b", Rarity.COMMON, mage.cards.v.VodalianSoldiers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vodalian Soldiers", "31c", Rarity.COMMON, mage.cards.v.VodalianSoldiers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vodalian Soldiers", "31d", Rarity.COMMON, mage.cards.v.VodalianSoldiers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vodalian War Machine", 32, Rarity.RARE, mage.cards.v.VodalianWarMachine.class));
        cards.add(new SetCardInfo("Zelyon Sword", 91, Rarity.RARE, mage.cards.z.ZelyonSword.class));
    }
}
