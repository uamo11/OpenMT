package l;

import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: P676 */
/* renamed from: l.֡᩹ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0707 extends AbstractViewOnClickListenerC16166 {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f2681;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f2682;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0707(ActivityC21107 activityC21107, ActivityC21107 activityC211072, boolean z) {
        super(activityC211072);
        this.f2682 = activityC21107;
        this.f2681 = z;
    }

    @Override // l.AbstractViewOnClickListenerC16166
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2796(Pattern pattern, String str) {
        C18284 c18284;
        ArrayList<C13889> arrayList;
        C18284 c182842;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        C18284 c182847;
        ListView listView;
        ActivityC21107 activityC21107 = this.f2682;
        c18284 = activityC21107.f68093;
        if (!c18284.f56854.isEmpty()) {
            c182847 = activityC21107.f68093;
            C0644 c0644 = (C0644) c182847.f56854.peek();
            listView = activityC21107.f68089;
            c0644.f2493 = listView.getFirstVisiblePosition();
        }
        if (this.f2681) {
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
        C0644 c06442 = new C0644();
        c06442.f2494 = str;
        for (C13889 c13889 : arrayList) {
            if (C5584.m15863(c13889, pattern)) {
                c06442.f2492.add(c13889);
            }
        }
        c182843 = activityC21107.f68093;
        c182843.f56854.push(c06442);
        c182844 = activityC21107.f68093;
        c182845 = activityC21107.f68093;
        c182844.f56851 = c182845.m42621();
    }

    @Override // l.AbstractViewOnClickListenerC16166
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2795() {
        C18284 c18284;
        ActivityC21107 activityC21107 = this.f2682;
        c18284 = activityC21107.f68093;
        activityC21107.setTitle(((C0644) c18284.f56854.peek()).f2494);
        activityC21107.m48049(EnumC6995.SEARCH_RESULT_METHOD);
    }
}
