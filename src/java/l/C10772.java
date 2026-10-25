package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.concurrent.ExecutorService;

/* compiled from: X5LN */
/* renamed from: l.ۧۙܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10772 extends BaseAdapter {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f32420;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9503 f32421;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16415 f32422;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C10772(C16415 c16415, C16560 c16560, C9503 c9503) {
        this.f32422 = c16415;
        this.f32420 = c16560;
        this.f32421 = c9503;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f32422.f50492.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C17121 c17121;
        ExecutorService executorService;
        C16560 c16560 = this.f32420;
        if (view == null) {
            view = c16560.m39056().getLayoutInflater().inflate(R.layout.MT_Protector_res_0x7f0d016a, viewGroup, false);
            c17121 = new C17121(0);
            c17121.f52464 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
            c17121.f52463 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0534);
            c17121.f52465 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0535);
            c17121.f52462 = (ImageView) view.findViewById(R.id.MT_Protector_res_0x7f0a01e9);
            view.setTag(c17121);
        } else {
            c17121 = (C17121) view.getTag();
        }
        AbstractC16891 m39044 = c16560.m39044();
        C16415 c16415 = this.f32422;
        if (c16415.f50493.equals(m39044.mo6007())) {
            C12182 c12182 = (C12182) c16415.f50492.get(i);
            c17121.f52464.setText(C6554.m18061(100, c12182.m29661()));
            InterfaceC17889 m29658 = c12182.m29658();
            StringBuilder sb = new StringBuilder(C17283.m40577(m29658.getTime()));
            if (m29658.mo24437()) {
                sb.append(EnumC0121.f1143);
                sb.append(C22927.m51020(m29658.getSize()));
            }
            c17121.f52463.setText(sb.toString());
            c17121.f52465.setText(C6554.m18063(250, c12182.m29662()));
            ImageView imageView = c17121.f52462;
            executorService = C14298.f43089;
            c12182.m29660(m39044, imageView, executorService, this.f32421);
            view.setAlpha(c12182.f36324 ? 0.5f : 1.0f);
        }
        return view;
    }
}
