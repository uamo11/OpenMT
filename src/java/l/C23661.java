package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import bin.mt.plugin.api.translation.TranslationEngine;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 33YQ */
/* renamed from: l.᩻ۧᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23661 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6728 f76655;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C23661(C6728 c6728) {
        this.f76655 = c6728;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Spinner spinner;
        Spinner spinner2;
        boolean z;
        boolean z2;
        List list;
        ArrayList arrayList;
        boolean z3;
        List list2;
        ArrayList arrayList2;
        TranslationEngine.Configuration configuration;
        C6728 c6728 = this.f76655;
        spinner = c6728.f20902;
        if (adapterView == spinner) {
            z3 = c6728.f20897;
            if (z3) {
                return;
            }
            list2 = c6728.f20899;
            c6728.f20908 = (String) list2.get(i);
            arrayList2 = c6728.f20898;
            C6728.f20889 = (String) arrayList2.get(i);
            configuration = c6728.f20900;
            if (configuration.targetLanguageMutable) {
                c6728.m18320();
                return;
            }
            return;
        }
        spinner2 = c6728.f20891;
        if (adapterView == spinner2) {
            z = c6728.f20897;
            if (z) {
                return;
            }
            z2 = c6728.f20894;
            if (z2) {
                return;
            }
            list = c6728.f20906;
            c6728.f20895 = (String) list.get(i);
            arrayList = c6728.f20907;
            C6728.f20890 = (String) arrayList.get(i);
        }
    }
}
