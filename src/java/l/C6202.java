package l;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;

/* compiled from: N8QX */
/* renamed from: l.ۛܿۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6202 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f19023;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f19024;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f19025 = 2000;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14185 f19022 = InterfaceC16427.f50519;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f19026 = true;

    public C6202(ContextWrapper contextWrapper) {
        this.f19023 = contextWrapper.getApplicationContext();
        HashMap hashMap = new HashMap(8);
        this.f19024 = hashMap;
        hashMap.put(0, 1000000L);
        hashMap.put(2, -9223372036854775807L);
        hashMap.put(3, -9223372036854775807L);
        hashMap.put(4, -9223372036854775807L);
        hashMap.put(5, -9223372036854775807L);
        hashMap.put(10, -9223372036854775807L);
        hashMap.put(9, -9223372036854775807L);
        hashMap.put(7, -9223372036854775807L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11847 m17123() {
        return new C11847(this.f19023, this.f19024, this.f19025, this.f19022, this.f19026);
    }
}
