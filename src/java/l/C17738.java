package l;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: U15W */
/* renamed from: l.ᩳ֫ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17738 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashSet f54283 = new HashSet();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashSet f54284 = new HashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f54281 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f54282 = 0;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m41552() {
        return this.f54284.size();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m41553() {
        return this.f54283.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41548() {
        return this.f54281;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41550() {
        return this.f54282;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41551(C16326 c16326) {
        this.f54283.addAll(c16326.f50273);
        this.f54284.addAll(c16326.f50274);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41549(C16326 c16326) {
        HashSet hashSet = this.f54283;
        int size = hashSet.size();
        HashSet hashSet2 = this.f54284;
        int size2 = hashSet2.size();
        Iterator it = c16326.f50273.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains((C14209) it.next())) {
                size++;
            }
        }
        Iterator it2 = c16326.f50274.iterator();
        while (it2.hasNext()) {
            if (!hashSet2.contains((C23382) it2.next())) {
                size2++;
            }
        }
        this.f54281 = size;
        this.f54282 = size2;
    }

    public final String toString() {
        return "DexEmulator{fields=" + this.f54283.size() + ", methods=" + this.f54284.size() + '}';
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m41554() {
        return this.f54284.size() > 65536 || this.f54283.size() > 65536;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m41555() {
        return this.f54282 > 65536 || this.f54281 > 65536;
    }
}
