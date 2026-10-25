package net.engio.mbassy.dispatch;

import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.subscription.ISubscriptionContextAware;

/* loaded from: classes.dex */
public interface IMessageDispatcher extends ISubscriptionContextAware {
    void dispatch(MessagePublication messagePublication, Object obj, Iterable iterable);

    IHandlerInvocation getInvocation();
}
