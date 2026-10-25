package l;

import android.content.DialogInterface;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import bin.mt.plugin.api.translation.TranslationEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 56B1 */
/* renamed from: l.᩵ۧᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19429 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f62851 = new ArrayList();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC5317 f62852;

    public C19429(DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317) {
        this.f62852 = dialogInterfaceOnDismissListenerC5317;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        AbstractActivityC12266 abstractActivityC12266;
        abstractActivityC12266 = this.f62852.f16596;
        m20266(abstractActivityC12266);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        ArrayList arrayList = new ArrayList();
        if (C23196.m51454()) {
            for (C16709 c16709 : C13265.m32202()) {
                c16709.m39318(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        TranslationEngine translationEngine = (TranslationEngine) ((Class) it.next()).newInstance();
                        translationEngine.init(c16709.m39304());
                        this.f62851.add(new C0377(c16709, translationEngine));
                    } catch (Throwable th) {
                        c16709.m39290(th);
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        ArrayList arrayList;
        AbstractActivityC12266 abstractActivityC12266;
        ArrayList arrayList2;
        AbstractActivityC12266 abstractActivityC122662;
        boolean m51454 = C23196.m51454();
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f62852;
        if (!m51454) {
            m44772();
            arrayList2 = dialogInterfaceOnDismissListenerC5317.f16593;
            abstractActivityC122662 = dialogInterfaceOnDismissListenerC5317.f16596;
            arrayList2.add(0, new C17311(abstractActivityC122662));
            return;
        }
        ArrayList arrayList3 = this.f62851;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            C0377 c0377 = (C0377) it.next();
            abstractActivityC12266 = dialogInterfaceOnDismissListenerC5317.f16596;
            arrayList4.add(new C6728(abstractActivityC12266, c0377.f1794, c0377.f1793));
        }
        m44772();
        arrayList = dialogInterfaceOnDismissListenerC5317.f16593;
        arrayList.addAll(0, arrayList4);
        dialogInterfaceOnDismissListenerC5317.f16589 = C13265.m32218();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC12266 abstractActivityC12266;
        m44772();
        abstractActivityC12266 = this.f62852.f16596;
        abstractActivityC12266.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m44772() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f62852;
        arrayList = dialogInterfaceOnDismissListenerC5317.f16593;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            arrayList2 = dialogInterfaceOnDismissListenerC5317.f16593;
            if (arrayList2.get(size) instanceof C6728) {
                arrayList3 = dialogInterfaceOnDismissListenerC5317.f16593;
                arrayList3.remove(size);
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        Spinner spinner;
        Spinner spinner2;
        Spinner spinner3;
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f62852;
        spinner = dialogInterfaceOnDismissListenerC5317.f16594;
        ((BaseAdapter) spinner.getAdapter()).notifyDataSetChanged();
        dialogInterfaceOnDismissListenerC5317.m15253();
        spinner2 = dialogInterfaceOnDismissListenerC5317.f16594;
        AdapterView.OnItemSelectedListener onItemSelectedListener = spinner2.getOnItemSelectedListener();
        spinner3 = dialogInterfaceOnDismissListenerC5317.f16594;
        onItemSelectedListener.onItemSelected(null, null, spinner3.getSelectedItemPosition(), 0L);
        m20273();
    }
}
