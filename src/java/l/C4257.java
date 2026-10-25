package l;

import java.util.HashMap;

/* compiled from: C4R6 */
/* renamed from: l.ۘ᩺ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4257 implements AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f13793;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f13794;

    public C4257(String str) {
        this.f13794 = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Object obj;
        HashMap hashMap;
        HashMap hashMap2;
        Object obj2;
        HashMap hashMap3;
        obj = C19780.f63862;
        synchronized (obj) {
            if (this.f13793) {
                return;
            }
            this.f13793 = true;
            hashMap = C19780.f63861;
            Integer num = (Integer) hashMap.get(this.f13794);
            if (num != null && num.intValue() > 1) {
                hashMap3 = C19780.f63861;
                hashMap3.put(this.f13794, Integer.valueOf(num.intValue() - 1));
            }
            hashMap2 = C19780.f63861;
            hashMap2.remove(this.f13794);
            obj2 = C19780.f63862;
            obj2.notifyAll();
        }
    }
}
