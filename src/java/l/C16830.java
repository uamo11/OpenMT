package l;

import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: W6QR */
/* renamed from: l.ܽᩴܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16830 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f51668;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51669;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f51670;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f51667 = new BitSet();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f51671 = new ArrayList();

    public C16830(StringBuilder sb, String str) {
        this.f51670 = str;
        this.f51668 = sb;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return;
            }
            if (str.charAt(i) != '\\') {
                i = i2;
            } else if (str.charAt(i2) != 'Q') {
                i += 2;
            } else {
                int i3 = i + 2;
                int indexOf = str.indexOf("\\E", i3);
                int length = indexOf < 0 ? str.length() : indexOf + 2;
                this.f51671.add(new int[]{i, i3, indexOf < 0 ? length : indexOf, length});
                i = length;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39603(int i, int i2) {
        StringBuilder sb;
        String str;
        int[] iArr;
        int i3;
        BitSet bitSet = this.f51667;
        int nextSetBit = bitSet.nextSetBit(i);
        while (true) {
            int i4 = this.f51669;
            ArrayList arrayList = this.f51671;
            int size = arrayList.size();
            sb = this.f51668;
            str = this.f51670;
            if (i4 >= size || (i3 = (iArr = (int[]) arrayList.get(this.f51669))[0]) >= i2) {
                break;
            }
            this.f51669++;
            if (i3 >= i && iArr[3] <= i2) {
                while (nextSetBit >= 0 && nextSetBit < iArr[0]) {
                    nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
                }
                if (nextSetBit < 0 || nextSetBit >= iArr[3]) {
                    C21065.m47930(i, iArr[0], str, sb);
                    C21065.m47931(str, iArr[1], iArr[2], sb, true);
                    i = iArr[3];
                }
            }
        }
        C21065.m47930(i, i2, str, sb);
    }
}
