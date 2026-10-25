package l;

import java.util.ArrayList;

/* compiled from: X5LN */
/* renamed from: l.ܽۙܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16415 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f50493;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f50494;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f50492 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f50491 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f50490 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m38677() {
        this.f50490 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m38678(C12182 c12182) {
        if (this.f50490) {
            this.f50492.add(c12182);
        }
    }

    public C16415(String str, String str2) {
        this.f50493 = str;
        this.f50494 = str2;
    }
}
