package l;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: 94PF */
/* renamed from: l.֡᩸ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0684 extends AbstractViewOnClickListenerC12490 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f2623;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f2624;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f2625;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2772(C0684 c0684, C19736 c19736, C19736 c197362) {
        c0684.getClass();
        int bindingAdapterPosition = c19736.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c197362.getBindingAdapterPosition();
        C3318 c3318 = c0684.f37526;
        int m10143 = (bindingAdapterPosition - c3318.m10143(c0684)) - 1;
        int m101432 = (bindingAdapterPosition2 - c3318.m10143(c0684)) - 1;
        ArrayList arrayList = c0684.f37525;
        C6055.m16890(m10143, m101432, arrayList);
        c3318.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        String[] strArr = (String[]) C5378.stream(arrayList).map(new C7035()).toArray(new C21147());
        int i = C15757.f48591;
        C1802.m5991(new RunnableC8885(2, strArr), C15757.class, 1000L);
    }

    static {
        AbstractC15440 m36526 = C16293.f50118.m36526("projects");
        f2624 = m36526;
        f2623 = C16293.f50116.m36514().m36526("projects");
        if (m36526.mo23119()) {
            m36526.mo23552();
            m36526.mo23546();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0684(bin.mt.plus.Main r3, l.C3318 r4) {
        /*
            r2 = this;
            r0 = 2131886730(0x7f12028a, float:1.9408047E38)
            java.lang.String r0 = l.C4925.m14327(r0)
            r2.<init>(r3, r0, r0, r4)
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            r2.f2625 = r4
            r2.m2773()
            l.ۢۘܳ r4 = r3.m132()
            l.᩹᩶۠ r0 = new l.᩹᩶۠
            r1 = 2
            r0.<init>(r1, r2)
            r4.m24057(r0)
            l.۟ۢ֫ r3 = r3.getLifecycle()
            l.ۢ᩸ܳ r4 = new l.ۢ᩸ܳ
            r4.<init>()
            r3.mo19833(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0684.<init>(bin.mt.plus.Main, l.ۗܶܳ):void");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m2775() {
        if (m2773()) {
            this.f37526.notifyDataSetChanged();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m2773() {
        boolean z;
        List m37157 = C15757.m37157(f2624, f2623);
        if (this.f2625.size() != m37157.size() || !this.f2625.containsAll(m37157)) {
            this.f2625 = m37157;
            ArrayList arrayList = this.f37525;
            if (arrayList.isEmpty()) {
                z = true;
            } else {
                arrayList.clear();
                z = false;
            }
            Iterator it = m37157.iterator();
            while (it.hasNext()) {
                arrayList.add(new C19030(this, this.f34527, (AbstractC15440) it.next()));
            }
            if (!z || !arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2774(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606, int i) {
        String str;
        String str2;
        C11813 c11813;
        C19736 c19736 = (C19736) abstractViewOnLongClickListenerC14606;
        C19030 c19030 = (C19030) this.f37525.get(i);
        c19736.f63763 = c19030;
        TextView textView = c19736.f44703;
        str = c19030.f59950;
        textView.setText(str);
        TextView textView2 = c19736.f44700;
        str2 = c19030.f59948;
        textView2.setText(str2);
        C10402 c10402 = c19736.f44704;
        c11813 = c19030.f59952;
        c10402.m26232(c11813);
        c19736.itemView.setOnClickListener(c19030);
        this.f37526.m10148((AbstractViewOnLongClickListenerC14606) c19736);
    }
}
