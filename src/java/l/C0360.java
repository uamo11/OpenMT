package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: M6WW */
/* renamed from: l.֡ۤ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0360 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15176 f1772;

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public C0360(C15176 c15176) {
        this.f1772 = c15176;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractActivityC3346 abstractActivityC3346;
        C15176 c15176 = this.f1772;
        abstractActivityC3346 = c15176.f46358;
        LayoutInflater from = LayoutInflater.from(abstractActivityC3346);
        if (i == 0) {
            return new C19412(from.inflate(R.layout.MT_Protector_res_0x7f0d00d4, viewGroup, false));
        }
        return new C8122(c15176, from.inflate(R.layout.MT_Protector_res_0x7f0d0161, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ArrayList arrayList;
        String str;
        String m35878;
        AbstractActivityC3346 abstractActivityC3346;
        AbstractActivityC3346 abstractActivityC33462;
        String sb;
        String sb2;
        AbstractActivityC3346 abstractActivityC33463;
        String str2;
        C15176 c15176 = this.f1772;
        if (i == 0) {
            TextView textView = (TextView) abstractC3255.itemView.findViewById(R.id.MT_Protector_res_0x7f0a0011);
            str2 = c15176.f46360;
            textView.setText(str2);
            return;
        }
        arrayList = c15176.f46366;
        C13732 c13732 = (C13732) arrayList.get(i - 1);
        C8122 c8122 = (C8122) abstractC3255;
        TextView textView2 = c8122.f25090;
        boolean m33034 = c13732.m33034();
        EnumC5972 enumC5972 = c13732.f41007;
        if (m33034) {
            abstractActivityC33463 = c15176.f46358;
            str = abstractActivityC33463.getString(R.string.MT_Protector_res_0x7f120576);
        } else {
            str = c13732.f41009;
        }
        textView2.setText(str);
        TextView textView3 = c8122.f25088;
        if (c13732.m33034()) {
            sb2 = c15176.m35878(enumC5972);
        } else {
            StringBuilder sb3 = new StringBuilder();
            m35878 = c15176.m35878(enumC5972);
            sb3.append(m35878);
            sb3.append(" · ");
            abstractActivityC3346 = c15176.f46358;
            sb3.append(abstractActivityC3346.getString(c13732.f41010 == EnumC6862.FILE ? R.string.MT_Protector_res_0x7f120393 : R.string.MT_Protector_res_0x7f1203fb));
            if (c13732.f41008) {
                sb = "";
            } else {
                StringBuilder sb4 = new StringBuilder(" · ");
                abstractActivityC33462 = c15176.f46358;
                sb4.append(abstractActivityC33462.getString(R.string.MT_Protector_res_0x7f120572));
                sb = sb4.toString();
            }
            sb3.append(sb);
            sb2 = sb3.toString();
        }
        textView3.setText(sb2);
        c8122.f25089.setVisibility(c13732.m33034() ? 4 : 0);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        ArrayList arrayList;
        arrayList = this.f1772.f46366;
        return arrayList.size() + 1;
    }
}
