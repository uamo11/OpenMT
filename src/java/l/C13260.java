package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: 45YI */
/* renamed from: l.۬ܿܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13260 extends AbstractC21023 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39708 = 0;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f39709;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f39712 = new HashMap();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f39711 = new HashMap();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f39710 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m32182(String str) {
        C3383 c3383 = new C3383(this, str);
        this.f39710.add(c3383);
        this.f39712.put(str, c3383);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13260 m32176(InterfaceC12743 interfaceC12743) {
        C3383 c3383;
        C21916[] mo10320;
        C13260 c13260 = new C13260();
        c13260.f39709 = interfaceC12743.mo3391();
        for (InterfaceC3571 interfaceC3571 : ((AbstractC21023) interfaceC12743).m47857()) {
            if (interfaceC3571.mo10323()) {
                if (interfaceC3571 instanceof C3383) {
                    mo10320 = interfaceC3571.mo10322();
                } else {
                    mo10320 = interfaceC3571.mo10320();
                }
                c3383 = new C3383(c13260, interfaceC3571.getValue(), mo10320, false);
            } else {
                c3383 = new C3383(c13260, interfaceC3571.getValue());
            }
            c13260.f39710.add(c3383);
            if (c3383.mo10323()) {
                c13260.f39711.put(c3383, c3383);
            } else {
                c13260.f39712.put(c3383.getValue(), c3383);
            }
        }
        return c13260;
    }

    @Override // l.InterfaceC12743
    public final int size() {
        return this.f39710.size();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m32185() {
        return this.f39710.size();
    }

    @Override // l.InterfaceC12743
    public final C3383 getItem(int i) {
        if (i < 0 || i >= this.f39710.size()) {
            return new C3383(this, "Error!!");
        }
        return (C3383) this.f39710.get(i);
    }

    @Override // l.InterfaceC12743
    /* renamed from: ֫ */
    public final InterfaceC3571 mo3389(int i) {
        if (i < 0 || i >= this.f39710.size()) {
            throw C22412.m50343(i, this.f39710.size());
        }
        return (InterfaceC3571) this.f39710.get(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32181(boolean z) {
        this.f39709 = z;
    }

    @Override // l.InterfaceC12743
    /* renamed from: ֫ */
    public final boolean mo3391() {
        return this.f39709;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32183() {
        Iterator it = this.f39710.iterator();
        while (it.hasNext()) {
            ((C3383) it.next()).f10682 = false;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m32188() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f39710.iterator();
        while (it.hasNext()) {
            C3383 c3383 = (C3383) it.next();
            if (c3383.f10682 && c3383.mo10323()) {
                for (C21916 c21916 : c3383.mo10322()) {
                    hashSet.add(c21916.f70169);
                }
            }
        }
        ArrayList arrayList = new ArrayList(this.f39710.size());
        Iterator it2 = this.f39710.iterator();
        while (it2.hasNext()) {
            C3383 c33832 = (C3383) it2.next();
            if (c33832.f10682 || (!c33832.mo10323() && hashSet.contains(c33832.getValue()))) {
                arrayList.add(c33832);
            } else if (c33832.mo10323()) {
                this.f39711.remove(c33832);
            } else {
                this.f39712.remove(c33832.getValue());
            }
        }
        this.f39710 = arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C3383 m32179(String str, C21916[] c21916Arr) {
        if (c21916Arr != null) {
            C3383 c3383 = new C3383(this, str, c21916Arr, true);
            C3383 c33832 = (C3383) this.f39711.get(c3383);
            if (c33832 != null) {
                return c33832;
            }
            this.f39710.add(c3383);
            this.f39711.put(c3383, c3383);
            return c3383;
        }
        return m32186(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized C3383 m32186(String str) {
        C3383 c3383 = (C3383) this.f39712.get(str);
        if (c3383 != null) {
            if (c3383.mo10323() || !c3383.getValue().equals(str)) {
                throw new RuntimeException("No-Style item from map has been modified.");
            }
            return c3383;
        }
        C3383 c33832 = new C3383(this, str);
        this.f39710.add(c33832);
        this.f39712.put(str, c33832);
        return c33832;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32187() {
        boolean z = true;
        for (int i = 0; i < this.f39710.size(); i++) {
            C3383 c3383 = (C3383) this.f39710.get(i);
            if (c3383.mo10323()) {
                if (!z) {
                    LinkedList linkedList = new LinkedList();
                    LinkedList linkedList2 = new LinkedList();
                    Iterator it = this.f39710.iterator();
                    while (it.hasNext()) {
                        C3383 c33832 = (C3383) it.next();
                        if (c33832.mo10323()) {
                            linkedList.add(c33832);
                        } else {
                            linkedList2.add(c33832);
                        }
                    }
                    this.f39710.clear();
                    this.f39710.addAll(linkedList);
                    this.f39710.addAll(linkedList2);
                    for (int i2 = 0; i2 < this.f39710.size(); i2++) {
                        ((C3383) this.f39710.get(i2)).f10684 = i2;
                    }
                    return;
                }
            } else if (z) {
                z = false;
            }
            c3383.f10684 = i;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m32184(String str) {
        for (int i = 0; i < this.f39710.size(); i++) {
            C3383 c3383 = (C3383) this.f39710.get(i);
            if (!c3383.mo10323() && c3383.getValue().equals(str)) {
                return i;
            }
        }
        C3383 c33832 = new C3383(this, str);
        this.f39710.add(c33832);
        this.f39712.put(str, c33832);
        return this.f39710.size() - 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32178(C3383 c3383) {
        for (int i = 0; i < this.f39710.size(); i++) {
            if (this.f39710.get(i) == c3383) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m32180(l.InterfaceC4485 r32, boolean r33, l.C19277 r34) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13260.m32180(l.ۙۜܽ, boolean, l.᩵ۛۡ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32175(InterfaceC4485 interfaceC4485, int i) {
        if (i < 0 || i > 32767) {
            throw new IOException(C19370.m44628(i, "UTF-8 string length is out of range: "));
        }
        if (i <= 127) {
            interfaceC4485.writeByte(i);
            return 1;
        }
        interfaceC4485.writeByte((i >>> 8) | 128);
        interfaceC4485.writeByte(i & 255);
        return 2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m32177(int i) {
        if (i < 0 || i > 32767) {
            throw new IOException(C19370.m44628(i, "UTF-8 string length is out of range: "));
        }
        return i <= 127 ? 1 : 2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32174(long j, String str) {
        if (j >= 0 && j <= 2147483647L) {
            return (int) j;
        }
        throw new IOException(str + " is too large: " + j);
    }
}
