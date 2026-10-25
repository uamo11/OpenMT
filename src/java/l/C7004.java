package l;

/* compiled from: M1T7 */
/* renamed from: l.ۜ᩷֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7004 extends AbstractC18293 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23937[] f21608;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21116 f21609;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7004(C21116 c21116, int i, int i2) {
        super(i, i2);
        this.f21609 = c21116;
        this.f21608 = new C23937[1 << (i + i2)];
        int i3 = 0;
        while (true) {
            C23937[] c23937Arr = this.f21608;
            if (i3 >= c23937Arr.length) {
                return;
            }
            c23937Arr[i3] = new C23937(this);
            i3++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18941() {
        int i = 0;
        while (true) {
            C23937[] c23937Arr = this.f21608;
            if (i >= c23937Arr.length) {
                return;
            }
            AbstractC7070.m19072(c23937Arr[i].f51799);
            i++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18940() {
        C22817 c22817;
        C22817 c228172;
        C22817 c228173;
        AbstractC5593 abstractC5593;
        C22817 c228174;
        AbstractC5593 abstractC55932;
        C21116 c21116 = this.f21609;
        c22817 = c21116.f68108;
        int m50916 = c22817.m50916(0);
        c228172 = c21116.f68108;
        C23937 c23937 = this.f21608[m42641(m50916, c228172.m50915())];
        short[] sArr = c23937.f51799;
        C21116 c211162 = c23937.f77617.f21609;
        int i = 1;
        if (c211162.f53750.m2668()) {
            do {
                abstractC55932 = c211162.f68110;
                i = (i << 1) | abstractC55932.m15878(sArr, i);
            } while (i < 256);
        } else {
            c228173 = c211162.f68108;
            int m509162 = c228173.m50916(c211162.f53746[0]);
            int i2 = 256;
            int i3 = 1;
            do {
                m509162 <<= 1;
                int i4 = m509162 & i2;
                abstractC5593 = c211162.f68110;
                int m15878 = abstractC5593.m15878(sArr, i2 + i4 + i3);
                i3 = (i3 << 1) | m15878;
                i2 &= (~i4) ^ (0 - m15878);
            } while (i3 < 256);
            i = i3;
        }
        c228174 = c211162.f68108;
        c228174.m50918((byte) i);
        c211162.f53750.m2672();
    }
}
