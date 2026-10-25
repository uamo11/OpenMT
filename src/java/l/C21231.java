package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: XAJ9 */
/* renamed from: l.᩸֡ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21231 extends AbstractC0436 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f68437;

    public C21231(long j, AbstractC15440 abstractC15440, String str) {
        super(str, j, Long.valueOf(j));
        this.f68437 = abstractC15440;
    }

    @Override // l.AbstractC0436
    /* renamed from: ֫ */
    public final InputStream mo1993() {
        AbstractC15440 abstractC15440 = this.f68437;
        try {
            return abstractC15440.mo27926();
        } catch (IOException e) {
            String m36519 = abstractC15440.m36519();
            if (m36519 != null) {
                return new ByteArrayInputStream(C9942.m25069(m36519));
            }
            throw e;
        }
    }
}
