package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import java.util.ArrayList;

/* compiled from: 56B1 */
/* renamed from: l.ܺۧᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15899 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2495 f49139;

    public C15899(C2495 c2495) {
        this.f49139 = c2495;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C10856 c10856;
        C10856 c108562;
        C10856 c108563;
        ArrayList arrayList;
        CheckBox checkBox;
        ArrayList arrayList2;
        String m15247;
        C10856 c108564;
        CheckBox checkBox2;
        CheckBox checkBox3;
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f49139.f7946;
        c10856 = dialogInterfaceOnDismissListenerC5317.f16591;
        View childAt = c10856.getChildAt(0);
        c108562 = dialogInterfaceOnDismissListenerC5317.f16591;
        c108562.removeAllViewsInLayout();
        c108563 = dialogInterfaceOnDismissListenerC5317.f16591;
        c108563.addView(childAt);
        arrayList = dialogInterfaceOnDismissListenerC5317.f16593;
        if (i < arrayList.size()) {
            arrayList2 = dialogInterfaceOnDismissListenerC5317.f16593;
            AbstractC1083 abstractC1083 = (AbstractC1083) arrayList2.get(i);
            m15247 = DialogInterfaceOnDismissListenerC5317.m15247(abstractC1083);
            if (m15247 != null) {
                ApplicationC20075.f65008.edit().putString("auto_translation_record", m15247).apply();
            }
            c108564 = dialogInterfaceOnDismissListenerC5317.f16591;
            abstractC1083.mo3733(c108564);
            if (abstractC1083.mo3744()) {
                checkBox3 = dialogInterfaceOnDismissListenerC5317.f16592;
                checkBox3.setVisibility(0);
                return;
            } else {
                checkBox2 = dialogInterfaceOnDismissListenerC5317.f16592;
                checkBox2.setVisibility(8);
                return;
            }
        }
        checkBox = dialogInterfaceOnDismissListenerC5317.f16592;
        checkBox.setVisibility(0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C10856 c10856;
        C10856 c108562;
        C10856 c108563;
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f49139.f7946;
        c10856 = dialogInterfaceOnDismissListenerC5317.f16591;
        View childAt = c10856.getChildAt(0);
        c108562 = dialogInterfaceOnDismissListenerC5317.f16591;
        c108562.removeAllViewsInLayout();
        c108563 = dialogInterfaceOnDismissListenerC5317.f16591;
        c108563.addView(childAt);
    }
}
