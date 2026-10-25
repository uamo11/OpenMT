package l;

import android.widget.ListView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: P676 */
/* renamed from: l.ۨ᩹ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11997 extends AbstractC12889 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35920;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f35921;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11997(ActivityC21107 activityC21107, ActivityC21107 activityC211072, boolean z) {
        super(R.layout.MT_Protector_res_0x7f0d009e, activityC211072, "dex_search_type_constant");
        this.f35921 = activityC21107;
        this.f35920 = z;
    }

    @Override // l.AbstractC12889
    /* renamed from: ֫ */
    public final void mo17649(String str, String str2, boolean z) {
        C18284 c18284;
        ArrayList<C13889> arrayList;
        C18284 c182842;
        C0644 c0644;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        C18284 c182847;
        ListView listView;
        ActivityC21107 activityC21107 = this.f35921;
        c18284 = activityC21107.f68093;
        if (!c18284.f56854.isEmpty()) {
            c182847 = activityC21107.f68093;
            C0644 c06442 = (C0644) c182847.f56854.peek();
            listView = activityC21107.f68089;
            c06442.f2493 = listView.getFirstVisiblePosition();
        }
        if (this.f35920) {
            c182846 = activityC21107.f68093;
            arrayList = ((C0644) c182846.f56854.peek()).f2492;
        } else {
            arrayList = new ArrayList();
            c182842 = activityC21107.f68093;
            C7540 m27863 = c182842.f56834.m27863();
            if (m27863 != null) {
                Collections.addAll(arrayList, m27863.m20249());
                Collections.addAll(arrayList, m27863.m20254());
            }
        }
        if (!z) {
            c0644 = new C0644();
            c0644.f2494 = str2;
            try {
                long parseLong = Long.parseLong(str);
                for (C13889 c13889 : arrayList) {
                    if (C5584.m15861(c13889, parseLong)) {
                        c0644.f2492.add(c13889);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            c0644 = new C0644();
            c0644.f2494 = str2;
            String lowerCase = str.toLowerCase();
            for (C13889 c138892 : arrayList) {
                if (C5584.m15862(c138892, lowerCase)) {
                    c0644.f2492.add(c138892);
                }
            }
        }
        c182843 = activityC21107.f68093;
        c182843.f56854.push(c0644);
        c182844 = activityC21107.f68093;
        c182845 = activityC21107.f68093;
        c182844.f56851 = c182845.m42621();
    }

    @Override // l.AbstractC12889
    /* renamed from: ֫ */
    public final void mo17648() {
        C18284 c18284;
        ActivityC21107 activityC21107 = this.f35921;
        c18284 = activityC21107.f68093;
        activityC21107.setTitle(((C0644) c18284.f56854.peek()).f2494);
        activityC21107.m48049(EnumC6995.SEARCH_RESULT_METHOD);
    }
}
