package l;

import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: M5NX */
/* renamed from: l.ۛ۠ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5935 extends AbstractViewOnClickListenerC12490 {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static WeakReference f18216;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5935(bin.mt.plus.Main r2, l.C3318 r3) {
        /*
            r1 = this;
            r0 = 2131886358(0x7f120116, float:1.9407293E38)
            java.lang.String r0 = l.C4925.m14327(r0)
            r1.<init>(r2, r0, r0, r3)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            l.C5935.f18216 = r2
            r1.m16665()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5935.<init>(bin.mt.plus.Main, l.ۗܶܳ):void");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m16666() {
        C5935 c5935;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4925.m14315(new RunnableC5505(1));
            return;
        }
        WeakReference weakReference = f18216;
        if (weakReference == null || (c5935 = (C5935) weakReference.get()) == null) {
            return;
        }
        c5935.m16665();
        c5935.f37526.notifyDataSetChanged();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m16665() {
        ArrayList arrayList = this.f37525;
        arrayList.clear();
        Main main = this.f34527;
        if (main.m132() != null) {
            C11971 m24094 = main.m132().m24094();
            m24094.m29245();
            try {
                Iterator<E> it = m24094.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C12990(this, main, (AbstractC16891) it.next()));
                }
            } finally {
                m24094.m29244();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m16667() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m16666();
        } else {
            m16665();
            this.f37526.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* renamed from: ֫ */
    public final void mo2774(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606, int i) {
        String str;
        String str2;
        C11813 c11813;
        C12285 c12285 = (C12285) abstractViewOnLongClickListenerC14606;
        C12990 c12990 = (C12990) this.f37525.get(i);
        c12285.f36597 = c12990;
        TextView textView = c12285.f44703;
        str = c12990.f38903;
        textView.setText(str);
        TextView textView2 = c12285.f44700;
        str2 = c12990.f38901;
        textView2.setText(str2);
        C10402 c10402 = c12285.f44704;
        c11813 = c12990.f38904;
        c10402.m26232(c11813);
        c12285.itemView.setOnClickListener(c12990);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16664(C5935 c5935, C12285 c12285) {
        C12990 c12990;
        C3318 c3318 = c5935.f37526;
        ArrayList arrayList = c5935.f37525;
        c12990 = c12285.f36597;
        C9340 m132 = c5935.f34527.m132();
        if (c12990 == null || m132 == null) {
            c5935.m16667();
            return;
        }
        int mo25527 = c12990.mo25527();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            View.OnClickListener onClickListener = (AbstractViewOnClickListenerC1201) arrayList.get(i);
            if ((onClickListener instanceof InterfaceC10169) && ((InterfaceC10169) onClickListener).mo25527() == mo25527) {
                break;
            } else {
                i++;
            }
        }
        int bindingAdapterPosition = c12285.getBindingAdapterPosition();
        int m10143 = c3318.m10143(c5935);
        if (i != -1 && bindingAdapterPosition != -1 && m10143 != -1 && bindingAdapterPosition == m10143 + 1 + i) {
            z = true;
        }
        if (m132.m24066(mo25527) && z && i >= 0 && i < arrayList.size()) {
            Object obj = arrayList.get(i);
            if ((obj instanceof InterfaceC10169) && ((InterfaceC10169) obj).mo25527() == mo25527) {
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c3318.notifyItemRangeRemoved(bindingAdapterPosition - 1, 2);
                    return;
                } else {
                    c3318.notifyItemRangeRemoved(bindingAdapterPosition, 1);
                    return;
                }
            }
        }
        c5935.m16667();
    }
}
