package l;

import java.util.ArrayList;

/* compiled from: VB9Q */
/* renamed from: l.᩹ۘܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22041 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f70654;

    public C22041(int i) {
        InterfaceC9775 c4130;
        this.f70654 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = this.f70654;
            if (i <= 3072) {
                c4130 = new C22746(i);
            } else {
                c4130 = new C4130();
            }
            arrayList.add(c4130);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49588(int i, int i2) {
        InterfaceC9775 c4130;
        int max = Math.max(i, i2) + 1;
        ArrayList arrayList = this.f70654;
        arrayList.ensureCapacity(max);
        for (int size = arrayList.size(); size < max; size++) {
            if (max <= 3072) {
                c4130 = new C22746(max);
            } else {
                c4130 = new C4130();
            }
            arrayList.add(c4130);
        }
        ((InterfaceC9775) arrayList.get(i)).add(i2);
        ((InterfaceC9775) arrayList.get(i2)).add(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49589(int i, InterfaceC9775 interfaceC9775) {
        ArrayList arrayList = this.f70654;
        if (i < arrayList.size()) {
            interfaceC9775.mo12405((InterfaceC9775) arrayList.get(i));
        }
    }
}
