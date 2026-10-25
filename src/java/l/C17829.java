package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: 28VT */
/* renamed from: l.ᩳۙܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17829 extends AbstractC10771 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f54474;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f54475;

    @Override // l.AbstractC10771
    /* renamed from: ۧ */
    public final int mo1336() {
        return this.f54475.size();
    }

    @Override // l.AbstractC10771
    /* renamed from: ֫ */
    public final int mo1334() {
        return this.f54474.size();
    }

    @Override // l.AbstractC10771
    /* renamed from: ۧ */
    public final boolean mo1337(int i, int i2) {
        int indexOf;
        int indexOf2;
        String str = (String) this.f54475.get(i);
        if (!C9679.m24615((CharSequence) str) && (indexOf2 = str.indexOf("/")) != -1) {
            str = str.substring(0, indexOf2);
        }
        String str2 = (String) this.f54474.get(i2);
        if (!C9679.m24615((CharSequence) str2) && (indexOf = str2.indexOf("/")) != -1) {
            str2 = str2.substring(0, indexOf);
        }
        return str.equals(str2);
    }

    @Override // l.AbstractC10771
    /* renamed from: ֫ */
    public final boolean mo1335(int i, int i2) {
        return ((String) this.f54475.get(i)).equals(this.f54474.get(i2));
    }

    public C17829(List list, ArrayList arrayList) {
        this.f54475 = list;
        this.f54474 = arrayList;
    }
}
