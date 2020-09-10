package mage.abilities.costs.common;

import mage.abilities.Ability;
import mage.abilities.costs.Cost;
import mage.abilities.costs.CostImpl;
import mage.counters.CounterType;
import mage.game.Game;
import mage.game.permanent.Permanent;

import java.util.UUID;

/**
 * @author TheElk801
 */
public class RemoveAllCountersSourceCost extends CostImpl {

    private final CounterType counterType;
    private int removedCounters = 0;

    public RemoveAllCountersSourceCost(CounterType counterType) {
        this.counterType = counterType;
        this.text = "Remove all " + counterType.getName() + " counters from {this}";
    }

    public RemoveAllCountersSourceCost(RemoveAllCountersSourceCost cost) {
        super(cost);
        this.counterType = cost.counterType;
    }

    @Override
    public boolean canPay(Ability ability, UUID sourceId, UUID controllerId, Game game) {
        Permanent permanent = game.getPermanent(sourceId);
        return permanent != null;
    }

    @Override
    public boolean pay(Ability ability, Game game, UUID sourceId, UUID controllerId, boolean noMana, Cost costToPay) {
        Permanent permanent = game.getPermanent(ability.getSourceId());
        if (permanent != null) {
            this.removedCounters = permanent.getCounters(game).getCount(counterType);
            if (this.removedCounters > 0) {
                permanent.removeCounters(counterType.createInstance(this.removedCounters), game);
            }
        }
        this.paid = true;
        return true;
    }

    @Override
    public RemoveAllCountersSourceCost copy() {
        return new RemoveAllCountersSourceCost(this);
    }

    public int getRemovedCounters() {
        return removedCounters;
    }
}
