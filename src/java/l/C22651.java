package l;

import java.util.BitSet;

/* compiled from: 07TI */
/* renamed from: l.᩺֨֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22651 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f73159;

    public C22651(BitSet bitSet) {
        this.f73159 = bitSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50653(char c) {
        if (c > 127) {
            throw new IllegalArgumentException("Can only match ASCII characters");
        }
        this.f73159.set(c);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50654(char c, char c2) {
        while (c <= c2) {
            m50653(c);
            c = (char) (c + 1);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13478 m50652() {
        return new C13478(this);
    }
}
