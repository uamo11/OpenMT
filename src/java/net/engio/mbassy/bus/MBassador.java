package net.engio.mbassy.bus;

import java.util.concurrent.TimeUnit;
import net.engio.mbassy.bus.common.IMessageBus;
import net.engio.mbassy.bus.config.BusConfiguration;
import net.engio.mbassy.bus.config.Feature;
import net.engio.mbassy.bus.config.IBusConfiguration;
import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import net.engio.mbassy.bus.error.PublicationError;
import net.engio.mbassy.bus.publication.SyncAsyncPostCommand;

/* loaded from: classes2.dex */
public class MBassador extends AbstractSyncAsyncMessageBus implements IMessageBus {
    public MBassador() {
        this(new BusConfiguration().addFeature(Feature.SyncPubSub.Default()).addFeature(Feature.AsynchronousHandlerInvocation.Default()).addFeature(Feature.AsynchronousMessageDispatch.Default()));
    }

    public MBassador(IPublicationErrorHandler iPublicationErrorHandler) {
        super(new BusConfiguration().addFeature(Feature.SyncPubSub.Default()).addFeature(Feature.AsynchronousHandlerInvocation.Default()).addFeature(Feature.AsynchronousMessageDispatch.Default()).addPublicationErrorHandler(iPublicationErrorHandler));
    }

    public MBassador(IBusConfiguration iBusConfiguration) {
        super(iBusConfiguration);
    }

    public IMessagePublication publishAsync(Object obj) {
        return addAsynchronousPublication(createMessagePublication(obj));
    }

    public IMessagePublication publishAsync(Object obj, long j, TimeUnit timeUnit) {
        return addAsynchronousPublication(createMessagePublication(obj), j, timeUnit);
    }

    @Override // net.engio.mbassy.bus.common.PubSubSupport
    public IMessagePublication publish(Object obj) {
        MessagePublication createMessagePublication = createMessagePublication(obj);
        try {
            createMessagePublication.execute();
            return createMessagePublication;
        } catch (Throwable th) {
            try {
                handlePublicationError(new PublicationError().setMessage("Error during publication of message").setCause(th).setPublication(createMessagePublication));
            } catch (Throwable unused) {
            }
            return createMessagePublication;
        }
    }

    @Override // net.engio.mbassy.bus.common.IMessageBus, net.engio.mbassy.bus.common.GenericMessagePublicationSupport
    public SyncAsyncPostCommand post(Object obj) {
        return new SyncAsyncPostCommand(this, obj);
    }
}
