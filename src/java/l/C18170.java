package l;

import net.engio.mbassy.bus.error.IPublicationErrorHandler;
import net.engio.mbassy.bus.error.PublicationError;

/* compiled from: V9DJ */
/* renamed from: l.ᩳܽۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18170 implements IPublicationErrorHandler {
    @Override // net.engio.mbassy.bus.error.IPublicationErrorHandler
    public final void handleError(PublicationError publicationError) {
        InterfaceC2148 interfaceC2148;
        InterfaceC2148 interfaceC21482;
        if (publicationError.getCause() != null) {
            interfaceC21482 = C17464.f53375;
            interfaceC21482.mo7091(publicationError.toString(), publicationError.getCause());
        } else {
            interfaceC2148 = C17464.f53375;
            interfaceC2148.mo7080(publicationError.toString());
        }
    }
}
