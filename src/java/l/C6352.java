package l;

import android.widget.ListView;
import bin.mt.plus.R;
import java.util.Collection;

/* compiled from: P676 */
/* renamed from: l.ۛ᩹ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6352 extends AbstractC12889 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f19671;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f19672;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6352(ActivityC21107 activityC21107, ActivityC21107 activityC211072, boolean z) {
        super(R.layout.MT_Protector_res_0x7f0d009e, activityC211072, "dex_search_type_constant");
        this.f19672 = activityC21107;
        this.f19671 = z;
    }

    @Override // l.AbstractC12889
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17649(String str, String str2, boolean z) {
        C18284 c18284;
        C18284 c182842;
        Collection<C11258> values;
        C0644 c0644;
        AbstractC16404 abstractC16404;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        boolean z2;
        AbstractC16404 abstractC164042;
        C18284 c182846;
        C18284 c182847;
        ListView listView;
        ActivityC21107 activityC21107 = this.f19672;
        c18284 = activityC21107.f68093;
        if (!c18284.f56846.isEmpty()) {
            c182847 = activityC21107.f68093;
            C0644 c06442 = (C0644) c182847.f56846.peek();
            listView = activityC21107.f68089;
            c06442.f2493 = listView.getFirstVisiblePosition();
        }
        if (this.f19671) {
            c182846 = activityC21107.f68093;
            values = ((C0644) c182846.f56846.peek()).f2492;
        } else {
            c182842 = activityC21107.f68093;
            values = c182842.f56832.values();
        }
        int i = 1;
        if (!z) {
            c0644 = new C0644();
            c0644.f2494 = str2;
            try {
                long parseLong = Long.parseLong(str);
                for (C11258 c11258 : values) {
                    C7540 m27863 = c11258.m27863();
                    if (m27863 != null) {
                        C23062[] m20250 = m27863.m20250();
                        AbstractC16404[] abstractC16404Arr = c11258.m27861().m32314().f19421;
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 < abstractC16404Arr.length) {
                            C23062 c23062 = m20250[i2];
                            if (c23062.m51223() && c23062.m51222() && (abstractC16404 = abstractC16404Arr[i2]) != null) {
                                int i3 = C19696.f63627[abstractC16404.mo5435().ordinal()];
                                if (i3 != i) {
                                    if (i3 != 2) {
                                        if (i3 == 3 && ((C8644) abstractC16404).f26391 == parseLong) {
                                            c0644.f2492.add(c11258);
                                            z3 = true;
                                        }
                                    } else if (((C6527) abstractC16404).f20170 == parseLong) {
                                        c0644.f2492.add(c11258);
                                        z3 = true;
                                    }
                                } else if (((C23460) abstractC16404).f75291 == parseLong) {
                                    c0644.f2492.add(c11258);
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                break;
                            }
                            i2++;
                            i = 1;
                        }
                        if (!z3) {
                            C13889[] m20249 = m27863.m20249();
                            int length = m20249.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    break;
                                }
                                if (C5584.m15861(m20249[i4], parseLong)) {
                                    c0644.f2492.add(c11258);
                                    z3 = true;
                                    break;
                                }
                                i4++;
                            }
                            if (!z3) {
                                C13889[] m20254 = m27863.m20254();
                                int length2 = m20254.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length2) {
                                        break;
                                    }
                                    if (C5584.m15861(m20254[i5], parseLong)) {
                                        c0644.f2492.add(c11258);
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                    }
                    i = 1;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            c0644 = new C0644();
            c0644.f2494 = str2;
            String lowerCase = str.toLowerCase();
            for (C11258 c112582 : values) {
                C7540 m278632 = c112582.m27863();
                if (m278632 != null) {
                    C23062[] m202502 = m278632.m20250();
                    AbstractC16404[] abstractC16404Arr2 = c112582.m27861().m32314().f19421;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= abstractC16404Arr2.length) {
                            z2 = false;
                            break;
                        }
                        C23062 c230622 = m202502[i6];
                        if (c230622.m51223() && c230622.m51222() && c230622.f74187.f57397.m50835().equals("Ljava/lang/String;") && (abstractC164042 = abstractC16404Arr2[i6]) != null && abstractC164042.mo5435() == EnumC3705.VALUE_STRING && ((C15698) abstractC164042).f48387.m28273().toLowerCase().contains(lowerCase)) {
                            c0644.f2492.add(c112582);
                            z2 = true;
                            break;
                        }
                        i6++;
                    }
                    if (!z2) {
                        C13889[] m202492 = m278632.m20249();
                        int length3 = m202492.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length3) {
                                break;
                            }
                            if (C5584.m15862(m202492[i7], lowerCase)) {
                                c0644.f2492.add(c112582);
                                z2 = true;
                                break;
                            }
                            i7++;
                        }
                        if (!z2) {
                            C13889[] m202542 = m278632.m20254();
                            int length4 = m202542.length;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= length4) {
                                    break;
                                }
                                if (C5584.m15862(m202542[i8], lowerCase)) {
                                    c0644.f2492.add(c112582);
                                    break;
                                }
                                i8++;
                            }
                        }
                    }
                }
            }
        }
        c182843 = activityC21107.f68093;
        c182843.f56846.push(c0644);
        c182844 = activityC21107.f68093;
        c182845 = activityC21107.f68093;
        c182844.f56833 = c182845.m42621();
    }

    @Override // l.AbstractC12889
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17648() {
        C18284 c18284;
        ActivityC21107 activityC21107 = this.f19672;
        c18284 = activityC21107.f68093;
        activityC21107.setTitle(((C0644) c18284.f56846.peek()).f2494);
        activityC21107.m48049(EnumC6995.SEARCH_RESULT_CLASS);
    }
}
