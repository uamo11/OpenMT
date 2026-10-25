package l;

import java.util.ArrayList;

/* compiled from: R8WS */
/* renamed from: l.ۖۜۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2364 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f7554;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7555;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f7556;

    public C2364(C12951 c12951) {
        this.f7556 = c12951.m31506();
        int m31493 = c12951.m31493();
        this.f7554 = new ArrayList(m31493);
        this.f7555 = new ArrayList(m31493);
        for (int i = 0; i < m31493; i++) {
            this.f7554.add(c12951.m31506());
            this.f7555.add(AbstractC15768.m37179(c12951));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m7681() {
        return this.f7556;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m7679() {
        return this.f7555.size();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m7682(int i) {
        return (String) this.f7554.get(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15768 m7680(int i) {
        return (AbstractC15768) this.f7555.get(i);
    }
}
