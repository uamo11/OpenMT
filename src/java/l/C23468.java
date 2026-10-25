package l;

import java.util.HashMap;
import java.util.Map;

/* compiled from: F1VH */
/* renamed from: l.᩻ۙۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23468 extends AbstractC2821 implements InterfaceC2548 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17824 f75302;

    public C23468(C17824 c17824) {
        super(2);
        this.f75302 = c17824;
    }

    @Override // l.AbstractC2821
    /* renamed from: ֫ */
    public final void mo8714(AbstractC12138 abstractC12138) {
        String m24169;
        String m13109 = abstractC12138.m13109();
        if (C22927.m51032(m13109) || (m24169 = C9358.m24169(abstractC12138)) == null) {
            return;
        }
        C17824 c17824 = this.f75302;
        AbstractC16412 abstractC16412 = C10769.f32418;
        Map map = (Map) c17824.get(abstractC16412);
        if (map == null) {
            map = new HashMap();
            c17824.put(abstractC16412, map);
        }
        String str = (String) map.get(m24169);
        if (str == null || (C15706.m37039(abstractC12138) instanceof C20647) || m13109.compareTo(str) < 0) {
            map.put(m24169, m13109);
        }
    }
}
