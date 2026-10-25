package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: S4VX */
/* renamed from: l.ܶۙ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15009 implements Iterator {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21361 f45767;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45768 = -1;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f45769;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f45770;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C4882 f45771;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C15009(C21361 c21361) {
        CharSequence charSequence;
        this.f45767 = c21361;
        charSequence = c21361.f68808;
        int length = ((String) charSequence).length();
        if (length < 0) {
            throw new IllegalArgumentException(C18307.m42645(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f45770 = length;
        this.f45769 = length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m35541() {
        CharSequence charSequence;
        InterfaceC19763 interfaceC19763;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int i = this.f45769;
        if (i < 0) {
            this.f45768 = 0;
            this.f45771 = null;
            return;
        }
        C21361 c21361 = this.f45767;
        charSequence = c21361.f68808;
        if (i > ((String) charSequence).length()) {
            int i2 = this.f45770;
            charSequence4 = c21361.f68808;
            this.f45771 = new C4882(i2, C7249.m19396(charSequence4), 1);
            this.f45769 = -1;
        } else {
            interfaceC19763 = c21361.f68807;
            charSequence2 = c21361.f68808;
            C15818 c15818 = (C15818) ((C13598) interfaceC19763).mo6973(charSequence2, Integer.valueOf(this.f45769));
            if (c15818 == null) {
                int i3 = this.f45770;
                charSequence3 = c21361.f68808;
                this.f45771 = new C4882(i3, C7249.m19396(charSequence3), 1);
                this.f45769 = -1;
            } else {
                int intValue = ((Number) c15818.m37450()).intValue();
                int intValue2 = ((Number) c15818.m37451()).intValue();
                this.f45771 = intValue <= Integer.MIN_VALUE ? C4882.f15426 : new C4882(this.f45770, intValue - 1, 1);
                int i4 = intValue + intValue2;
                this.f45770 = i4;
                this.f45769 = i4 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f45768 = 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f45768 == -1) {
            m35541();
        }
        if (this.f45768 == 0) {
            throw new NoSuchElementException();
        }
        C4882 c4882 = this.f45771;
        C11233.m27800((Object) c4882, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f45771 = null;
        this.f45768 = -1;
        return c4882;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f45768 == -1) {
            m35541();
        }
        return this.f45768 == 1;
    }
}
