package l;

import java.util.List;

/* compiled from: L1LP */
/* renamed from: l.ۖܿۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2669 extends AbstractC18897 {
    @Override // l.AbstractC18897
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo8364(EnumC20224 enumC20224, int i, int i2, C22340 c22340, C22340 c223402) {
        Integer m8362 = m8362(enumC20224, i, i2, c223402, 0);
        if (m8362 != null) {
            return m8362.intValue();
        }
        Integer m8363 = m8363(enumC20224, i, i2, c22340, c223402, 0);
        if (m8363 != null) {
            return m8363.intValue();
        }
        Integer m83622 = m8362(enumC20224, i, i2, c223402, 3);
        if (m83622 != null) {
            return m83622.intValue();
        }
        Integer m83632 = m8363(enumC20224, i, i2, c22340, c223402, 3);
        if (m83632 != null) {
            return m83632.intValue();
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Integer m8362(EnumC20224 enumC20224, int i, int i2, C22340 c22340, int i3) {
        List list = (List) enumC20224.m46467((Object) this.f59562, (Object) this.f59563);
        C11003.requireNonNull(list);
        int m46474 = enumC20224.m46474(c22340.f72397, c22340.f72398);
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (((C23150) list.get(m46474 + i5)).m51331() <= i3) {
                break;
            }
            i5++;
        }
        int i6 = m46474 - 1;
        int i7 = i2 + 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (((C23150) list.get(i6 - i8)).m51331() <= i3) {
                break;
            }
            i8++;
        }
        if (i5 == -1 && i8 == -1) {
            return null;
        }
        if (i5 == 0 || i8 == 0) {
            return 0;
        }
        if (i5 == -1) {
            i5 = -i8;
        }
        return Integer.valueOf(i5);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Integer m8363(EnumC20224 enumC20224, int i, int i2, C22340 c22340, C22340 c223402, int i3) {
        EnumC20224 m46481 = enumC20224.m46481();
        List list = (List) m46481.m46467((Object) this.f59562, (Object) this.f59563);
        C11003.requireNonNull(list);
        int m46474 = m46481.m46474(c22340.f72395, c22340.f72396);
        int m464742 = m46481.m46474(c223402.f72397, c223402.f72398);
        int i4 = i + 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (((C23150) list.get(m46474 + i5)).m51331() <= i3) {
                break;
            }
            i5++;
        }
        int i6 = m464742 - 1;
        int i7 = i2 + 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                i8 = -1;
                break;
            }
            if (((C23150) list.get(i6 - i8)).m51331() <= i3) {
                break;
            }
            i8++;
        }
        if (i5 == -1 && i8 == -1) {
            return null;
        }
        if (i5 == 0 || i8 == 0) {
            return 0;
        }
        if (i5 == -1) {
            i5 = -i8;
        }
        return Integer.valueOf(i5);
    }
}
