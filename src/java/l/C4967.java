package l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: I78P */
/* renamed from: l.ۙ᩺᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4967 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f15653;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f15655;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f15657;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f15658;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15656 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15654 = new ArrayList();

    public C4967(int i, int i2, int i3, int i4, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        this.f15653 = i;
        this.f15655 = i2;
        this.f15657 = i3;
        this.f15658 = i4;
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            this.f15656.add((String) it.next());
        }
        Iterator it2 = abstractCollection2.iterator();
        while (it2.hasNext()) {
            this.f15654.add((String) it2.next());
        }
    }
}
