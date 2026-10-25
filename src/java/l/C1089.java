package l;

import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: T65P */
/* renamed from: l.֨ۨ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1089 implements Iterator {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13788 f3984;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f3985 = 0;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f3986;

    public C1089(C13788 c13788) {
        C22256 c22256;
        this.f3984 = c13788;
        c22256 = c13788.f41105;
        this.f3986 = c22256.m49973();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C22256 c22256;
        int i = this.f3985;
        c22256 = this.f3984.f41105;
        return i < c22256.m49972();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C22256 c22256;
        int i;
        int i2 = this.f3986;
        C13788 c13788 = this.f3984;
        int mo11935 = c13788.mo11935(i2);
        int i3 = this.f3986 + 4;
        this.f3986 = i3;
        c13788.m51008(i3, mo11935, Charset.forName("US-ASCII"));
        int i4 = this.f3986 + mo11935 + 4;
        this.f3986 = i4;
        int mo119352 = c13788.mo11935(i4);
        this.f3986 += 4;
        c13788.m33107();
        byte[] m51009 = c13788.m51009();
        c22256 = c13788.f41105;
        i = c22256.f72219;
        int i5 = mo119352 + i;
        if (c13788.m33107() >= 75) {
            this.f3986 += 4;
        }
        if (c13788.m33107() >= 73) {
            this.f3986 += 4;
        }
        if (c13788.m33107() >= 131) {
            this.f3986 += 4;
        }
        if (c13788.m33107() >= 127) {
            this.f3986 += 4;
        }
        if (c13788.m33107() >= 135) {
            this.f3986 += 8;
        }
        if (c13788.m33107() < 75) {
            this.f3986 = (c13788.mo11935(i5 + 96) * 4) + this.f3986;
        }
        this.f3985++;
        return new C21551(m51009, i5);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
