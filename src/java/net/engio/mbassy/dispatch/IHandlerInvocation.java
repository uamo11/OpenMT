package net.engio.mbassy.dispatch;

import net.engio.mbassy.bus.MessagePublication;
import net.engio.mbassy.subscription.ISubscriptionContextAware;

/* loaded from: classes.dex */
public interface IHandlerInvocation extends ISubscriptionContextAware {
    void invoke(Object obj, Object obj2, MessagePublication messagePublication);
}
