package l;

import java.util.IdentityHashMap;

/* compiled from: 06PW */
/* renamed from: l.᩵᩹ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19761 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f63819 = new IdentityHashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10130 f63820;

    public C19761(C10130 c10130) {
        this.f63820 = c10130;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45459(C11999 c11999) {
        int i = c11999.f35927;
        C10130 c10130 = this.f63820;
        c10130.writeInt(i);
        c10130.writeInt(c11999.f35928);
        m45458(c11999.f35929);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45458(AbstractC20466 abstractC20466) {
        C10130 c10130 = this.f63820;
        if (abstractC20466 == null) {
            c10130.writeInt(-1);
            return;
        }
        IdentityHashMap identityHashMap = this.f63819;
        Integer num = (Integer) identityHashMap.get(abstractC20466);
        if (num != null) {
            c10130.writeInt(num.intValue());
            return;
        }
        c10130.writeInt(identityHashMap.size());
        identityHashMap.put(abstractC20466, Integer.valueOf(identityHashMap.size()));
        int i = 0;
        if (abstractC20466 instanceof C21877) {
            C21877 c21877 = (C21877) abstractC20466;
            c10130.writeByte(1);
            c10130.writeInt(c21877.f65976);
            c10130.writeByte(c21877.m49267() ? 1 : 0);
            C15525 m49269 = c21877.m49269();
            while (i < c21877.f65976) {
                try {
                    char m27310 = m49269.f47458.m27310(i);
                    if (c21877.m49267()) {
                        c10130.writeByte(m27310);
                    } else {
                        c10130.mo13227(m27310);
                    }
                    i++;
                } catch (Throwable th) {
                    try {
                        m49269.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            m49269.close();
            return;
        }
        AbstractC20466[] abstractC20466Arr = ((C23993) abstractC20466).f77779;
        c10130.writeByte(2);
        c10130.writeInt(abstractC20466Arr.length);
        int length = abstractC20466Arr.length;
        while (i < length) {
            m45458(abstractC20466Arr[i]);
            i++;
        }
    }
}
