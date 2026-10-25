package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: B1KC */
/* renamed from: l.ۡ֫᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8579 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f26202;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12965 f26203;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C12965 f26204;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12965 f26205;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C12965 f26206;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f26208;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f26201 = new ArrayList();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f26207 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26200 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22287(C10130 c10130) {
        c10130.writeByte(this.f26208);
        ArrayList arrayList = this.f26201;
        c10130.mo13231(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12965 c12965 = (C12965) it.next();
            c10130.writeInt(c12965.f14318);
            c10130.writeInt(c12965.f14317);
        }
        ArrayList arrayList2 = this.f26207;
        c10130.mo13231(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C12965 c129652 = (C12965) it2.next();
            c10130.writeInt(c129652.f14318);
            c10130.writeInt(c129652.f14317);
        }
        if (this.f26204 != null) {
            c10130.m25425(true);
            c10130.writeInt(this.f26204.f14318);
            c10130.writeInt(this.f26204.f14317);
            c10130.writeInt(this.f26206.f14318);
            c10130.writeInt(this.f26206.f14317);
        } else {
            c10130.writeByte(0);
        }
        if (this.f26205 != null) {
            c10130.m25425(true);
            c10130.writeInt(this.f26205.f14318);
            c10130.writeInt(this.f26205.f14317);
            c10130.writeInt(this.f26203.f14318);
            c10130.writeInt(this.f26203.f14317);
        } else {
            c10130.writeByte(0);
        }
        c10130.mo13231(this.f26200 + 1);
        c10130.writeInt(this.f26202);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22288(C12951 c12951) {
        this.f26208 = c12951.readByte();
        int m31494 = c12951.m31494();
        ArrayList arrayList = this.f26201;
        arrayList.clear();
        for (int i = 0; i < m31494; i++) {
            arrayList.add(new C12965(c12951.readInt(), c12951.readInt(), false));
        }
        int m314942 = c12951.m31494();
        ArrayList arrayList2 = this.f26207;
        arrayList2.clear();
        for (int i2 = 0; i2 < m314942; i2++) {
            arrayList2.add(new C12965(c12951.readInt(), c12951.readInt(), true));
        }
        if (c12951.m31498()) {
            this.f26204 = new C12965(c12951.readInt(), c12951.readInt(), false);
            this.f26206 = new C12965(c12951.readInt(), c12951.readInt(), true);
        } else {
            this.f26206 = null;
            this.f26204 = null;
        }
        if (c12951.m31498()) {
            this.f26205 = new C12965(c12951.readInt(), c12951.readInt(), false);
            this.f26203 = new C12965(c12951.readInt(), c12951.readInt(), true);
        } else {
            this.f26203 = null;
            this.f26205 = null;
        }
        this.f26200 = c12951.m31494() - 1;
        this.f26202 = c12951.readInt();
    }
}
