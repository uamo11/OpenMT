package l;

import java.util.function.Predicate;

/* compiled from: R450 */
/* renamed from: l.ۤ᩵֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C10490 extends AbstractC14016 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C14722 f31466 = new C14722(null, null, null, null);

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f31467;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10490 f31468;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14722 f31469;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31470;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f31471;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14722[] f31472;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31473;

    public /* synthetic */ C10490(C23895 c23895, AbstractC5698 abstractC5698, C14722[] c14722Arr) {
        this((C10490) c23895, abstractC5698, c14722Arr);
    }

    public C10490(C10490 c10490, AbstractC5698 abstractC5698, C14722[] c14722Arr) {
        super(abstractC5698);
        this.f31470 = 0;
        this.f31473 = 0;
        this.f31468 = c10490;
        C12171.m29642(abstractC5698 != null);
        this.f31472 = c14722Arr;
        this.f31471 = c14722Arr.length - 1;
    }

    public C10490(C10490 c10490, AbstractC5698 abstractC5698, C14722[] c14722Arr, int i) {
        this(c10490, abstractC5698, c14722Arr);
        this.f31470 = i;
    }

    public C10490(AbstractC5698 abstractC5698) {
        this((C10490) null, abstractC5698, new C14722[16]);
    }

    @Override // l.AbstractC14016
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC14016 mo26380(AbstractC5698 abstractC5698) {
        C10490 c10490 = new C10490(this, abstractC5698, this.f31472, this.f31470);
        this.f31467++;
        return c10490;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r4 = r4 + 1;
        r2[r3] = r5;
     */
    @Override // l.AbstractC14016
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.AbstractC14016 mo26383(l.AbstractC5698 r8) {
        /*
            r7 = this;
            int r0 = r7.f31467
            if (r0 <= 0) goto L44
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1 = r7
        Le:
            if (r1 == 0) goto L16
            r0.add(r1)
            l.ۤ᩵֨ r1 = r1.f31468
            goto Le
        L16:
            l.ܳ᩵֨[] r1 = r7.f31472
            int r2 = r1.length
            l.ܳ᩵֨[] r2 = new l.C14722[r2]
            r3 = 0
            r4 = 0
        L1d:
            int r5 = r1.length
            if (r3 >= r5) goto L3e
            r5 = r1[r3]
        L22:
            if (r5 == 0) goto L35
            l.ܳ᩵֨ r6 = l.C10490.f31466
            if (r5 == r6) goto L35
            l.ۤ᩵֨ r6 = r5.f44962
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L35
            l.ܳ᩵֨ r5 = l.C14722.m35026(r5)
            goto L22
        L35:
            if (r5 == 0) goto L3b
            int r4 = r4 + 1
            r2[r3] = r5
        L3b:
            int r3 = r3 + 1
            goto L1d
        L3e:
            l.ۤ᩵֨ r0 = new l.ۤ᩵֨
            r0.<init>(r7, r8, r2, r4)
            return r0
        L44:
            l.ۤ᩵֨ r0 = new l.ۤ᩵֨
            l.ܳ᩵֨[] r1 = r7.f31472
            java.lang.Object r1 = r1.clone()
            l.ܳ᩵֨[] r1 = (l.C14722[]) r1
            int r2 = r7.f31470
            r0.<init>(r7, r8, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10490.mo26383(l.ۛ֡֨):l.ܰ᩵֨");
    }

    @Override // l.AbstractC14016
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC14016 mo26377() {
        C14722 c14722;
        C12171.m29642(this.f31467 == 0);
        C14722[] c14722Arr = this.f31472;
        C10490 c10490 = this.f31468;
        if (c14722Arr != c10490.f31472) {
            return c10490;
        }
        while (true) {
            C14722 c147222 = this.f31469;
            if (c147222 == null) {
                break;
            }
            int m26376 = m26376(c147222.f44963.f17562);
            C14722 c147223 = this.f31472[m26376];
            C14722 c147224 = this.f31469;
            C12171.m29639(c147224.f44963, c147223 == c147224);
            C14722[] c14722Arr2 = this.f31472;
            c14722 = this.f31469.f44964;
            c14722Arr2[m26376] = c14722;
            this.f31469 = this.f31469.f44960;
        }
        C12171.m29642(c10490.f31467 > 0);
        c10490.f31467--;
        c10490.f31470 = this.f31470;
        return c10490;
    }

    @Override // l.AbstractC14016
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void mo26382(AbstractC5698 abstractC5698) {
        int i = 0;
        C12171.m29642(this.f31467 == 0);
        int i2 = this.f31470 * 3;
        int i3 = this.f31471 * 2;
        C14722 c14722 = f31466;
        if (i2 >= i3) {
            C12171.m29642(this.f31467 == 0);
            C14722[] c14722Arr = this.f31472;
            int length = c14722Arr.length * 2;
            C14722[] c14722Arr2 = new C14722[length];
            C10490 c10490 = this;
            while (c10490 != null) {
                if (c10490.f31472 == c14722Arr) {
                    C12171.m29642(c10490 == this || c10490.f31467 != 0);
                    c10490.f31472 = c14722Arr2;
                    c10490.f31471 = length - 1;
                }
                c10490 = c10490.f31468;
            }
            int length2 = c14722Arr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                C14722 c147222 = c14722Arr[length2];
                if (c147222 != null && c147222 != c14722) {
                    this.f31472[m26376(c147222.f44963.f17562)] = c147222;
                    i++;
                }
            }
            this.f31470 = i;
        }
        int m26376 = m26376(abstractC5698.f17562);
        C14722 c147223 = this.f31472[m26376];
        if (c147223 == null) {
            this.f31470++;
        } else {
            c14722 = c147223;
        }
        C14722 c147224 = new C14722(abstractC5698, c14722, this.f31469, this);
        this.f31472[m26376] = c147224;
        this.f31469 = c147224;
        this.f23672.m29027(this, abstractC5698);
    }

    /* JADX WARN: Incorrect condition in loop: B:25:0x0032 */
    @Override // l.AbstractC14016
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo26384(final l.AbstractC5698 r6) {
        /*
            r5 = this;
            int r0 = r5.f31467
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            l.C12171.m29642(r0)
            l.ۤܶ۠ r0 = r6.f17562
            l.ۗ᩵֨ r2 = new l.ۗ᩵֨
            r2.<init>()
            l.ܳ᩵֨ r0 = r5.m26378(r0, r2)
            l.ۤ᩵֨ r2 = r0.f44962
            if (r2 != 0) goto L1b
            return
        L1b:
            l.ۤܶ۠ r2 = r6.f17562
            int r2 = r5.m26376(r2)
            l.ܳ᩵֨[] r3 = r5.f31472
            r4 = r3[r2]
            if (r4 != r0) goto L2e
            l.ܳ᩵֨ r4 = l.C14722.m35026(r0)
            r3[r2] = r4
            goto L3b
        L2e:
            l.ܳ᩵֨ r2 = l.C14722.m35026(r4)
            if (r2 != r0) goto L6b
            l.ܳ᩵֨ r2 = l.C14722.m35026(r0)
            l.C14722.m35027(r4, r2)
        L3b:
            l.ܳ᩵֨ r2 = r5.f31469
            if (r2 != r0) goto L49
            l.ܳ᩵֨ r0 = r0.f44960
            r5.f31469 = r0
            if (r0 == 0) goto L5f
            r1 = 0
            r0.f44961 = r1
            goto L5f
        L49:
            l.ܳ᩵֨ r2 = r0.f44961
            if (r2 == 0) goto L4e
            r1 = 1
        L4e:
            l.ۛ֡֨ r2 = r0.f44963
            l.C12171.m29639(r2, r1)
            l.ܳ᩵֨ r1 = r0.f44961
            l.ܳ᩵֨ r2 = r0.f44960
            r1.f44960 = r2
            l.ܳ᩵֨ r0 = r0.f44960
            if (r0 == 0) goto L5f
            r0.f44961 = r1
        L5f:
            int r0 = r5.f31473
            int r0 = r0 + 1
            r5.f31473 = r0
            l.ۨ᩵֨ r0 = r5.f23672
            r0.m29028(r5, r6)
            return
        L6b:
            l.ܳ᩵֨ r4 = l.C14722.m35026(r4)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10490.mo26384(l.ۛ֡֨):void");
    }

    @Override // l.AbstractC14016
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo26379(AbstractC5698 abstractC5698) {
        C10490 c10490;
        C12171.m29642(this.f31467 == 0);
        C14722 mo26381 = mo26381(abstractC5698.f17562);
        while (true) {
            c10490 = mo26381.f44962;
            if (c10490 != this || mo26381.f44963.f17559 == abstractC5698.f17559) {
                break;
            } else {
                mo26381 = mo26381.m35028();
            }
        }
        if (c10490 != this) {
            mo26382(abstractC5698);
        }
    }

    @Override // l.AbstractC7667
    /* renamed from: ۧ */
    public boolean mo20482(AbstractC5698 abstractC5698) {
        for (C14722 mo26381 = mo26381(abstractC5698.f17562); mo26381.f44962 == this; mo26381 = mo26381.m35028()) {
            if (mo26381.f44963 == abstractC5698) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14722 mo26381(AbstractC10370 abstractC10370) {
        return m26378(abstractC10370, null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14722 m26378(AbstractC10370 abstractC10370, Predicate predicate) {
        C14722 c14722 = this.f31472[m26376(abstractC10370)];
        C14722 c147222 = f31466;
        if (c14722 == null || c14722 == c147222) {
            return c147222;
        }
        while (c14722.f44962 != null) {
            AbstractC5698 abstractC5698 = c14722.f44963;
            if (abstractC5698.f17562 == abstractC10370 && (predicate == null || predicate.test(abstractC5698))) {
                break;
            }
            c14722 = c14722.f44964;
        }
        return c14722;
    }

    @Override // l.AbstractC7667
    /* renamed from: ֫ */
    public AbstractC5698 mo20478(AbstractC10370 abstractC10370, Predicate predicate) {
        return m26378(abstractC10370, predicate).f44963;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26376(AbstractC10370 abstractC10370) {
        int hashCode = abstractC10370.hashCode();
        int i = this.f31471;
        int i2 = hashCode & i;
        int i3 = i - ((hashCode + (hashCode >> 16)) << 1);
        int i4 = -1;
        while (true) {
            C14722 c14722 = this.f31472[i2];
            if (c14722 != null) {
                if (c14722 == f31466) {
                    if (i4 < 0) {
                        i4 = i2;
                    }
                } else if (c14722.f44963.f17562 == abstractC10370) {
                    break;
                }
                i2 = (i2 + i3) & this.f31471;
            } else if (i4 >= 0) {
                return i4;
            }
        }
        return i2;
    }

    @Override // l.AbstractC7667
    /* renamed from: ֫ */
    public boolean mo20481(C18709 c18709) {
        return ((C20368) mo20475(c18709, EnumC1317.NON_RECURSIVE)).iterator().hasNext();
    }

    @Override // l.AbstractC7667
    /* renamed from: ֫ */
    public Iterable mo20475(Predicate predicate, EnumC1317 enumC1317) {
        return new C20368(this, enumC1317, predicate);
    }

    @Override // l.AbstractC7667
    /* renamed from: ֫ */
    public Iterable mo20477(AbstractC10370 abstractC10370, Predicate predicate, EnumC1317 enumC1317) {
        return new C4845(this, abstractC10370, predicate, enumC1317);
    }

    @Override // l.AbstractC7667
    /* renamed from: ֫ */
    public AbstractC7667 mo20479(AbstractC5698 abstractC5698) {
        for (C14722 mo26381 = mo26381(abstractC5698.f17562); mo26381.f44962 != null; mo26381 = mo26381.m35028()) {
            if (mo26381.f44963 == abstractC5698) {
                return this;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Scope[");
        for (C10490 c10490 = this; c10490 != null; c10490 = c10490.f31468) {
            if (c10490 != this) {
                sb.append(" | ");
            }
            for (C14722 c14722 = c10490.f31469; c14722 != null; c14722 = c14722.f44960) {
                if (c14722 != c10490.f31469) {
                    sb.append(", ");
                }
                sb.append(c14722.f44963);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
