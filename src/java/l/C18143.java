package l;

import java.io.IOException;

/* compiled from: C9PC */
/* renamed from: l.ᩳܶ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C18143 extends AbstractC18587 {
    @Override // l.InterfaceC12050
    public C14614 parsePartialFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        C17437 newBuilder = C14614.newBuilder();
        try {
            newBuilder.mergeFrom(abstractC7297, c17798);
            return newBuilder.buildPartial();
        } catch (C2025 e) {
            e.m6587(newBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C2025 c2025 = new C2025(e2.getMessage(), e2);
            c2025.m6587(newBuilder.buildPartial());
            throw c2025;
        } catch (C17715 e3) {
            C2025 m41494 = e3.m41494();
            m41494.m6587(newBuilder.buildPartial());
            throw m41494;
        }
    }
}
