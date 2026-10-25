package l;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: 313O */
/* renamed from: l.ۜ۠ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6644 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f20615;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f20616;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3822 f20617;

    public C6644(C3822 c3822) {
        List list;
        this.f20617 = c3822;
        list = c3822.f12239;
        this.f20616 = list;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C1315 c1315;
        C1315 c13152;
        Drawable drawable;
        ViewOnClickListenerC2411 viewOnClickListenerC2411 = (ViewOnClickListenerC2411) abstractC3255;
        C8761 c8761 = (C8761) this.f20616.get(i);
        viewOnClickListenerC2411.f7685 = c8761;
        viewOnClickListenerC2411.f7683.setText(c8761.f26714);
        ImageView imageView = viewOnClickListenerC2411.f7686;
        Drawable drawable2 = c8761.f26712;
        if (drawable2 != null) {
            imageView.setImageDrawable(drawable2);
            return;
        }
        String m8898 = c8761.f26709.m8898();
        c1315 = C3822.f12232;
        synchronized (c1315) {
            c13152 = C3822.f12232;
            drawable = (Drawable) c13152.m4553(m8898);
            c8761.f26712 = drawable;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            return;
        }
        imageView.setTag(c8761.f26709);
        RunnableC9467 runnableC9467 = c8761.f26711;
        if (runnableC9467.f28789) {
            return;
        }
        runnableC9467.f28789 = true;
        runnableC9467.f28790 = imageView;
        C1802.f6208.execute(runnableC9467);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18162(String str) {
        this.f20615 = str;
        m18161();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18161() {
        List list;
        List list2;
        String str = this.f20615;
        C3822 c3822 = this.f20617;
        if (str == null || str.isEmpty()) {
            list = c3822.f12239;
            this.f20616 = list;
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = new ArrayList();
        list2 = c3822.f12239;
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            C8761 c8761 = (C8761) it.next();
            if (C9679.m24616((CharSequence) c8761.f26714, (CharSequence) str)) {
                arrayList.add(c8761);
            } else {
                C2910 c2910 = c8761.f26709;
                if (c2910 != null && C9679.m24616((CharSequence) c2910.m8897(), (CharSequence) str)) {
                    arrayList.add(c8761);
                }
            }
        }
        this.f20616 = arrayList;
        notifyDataSetChanged();
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractActivityC3346 abstractActivityC3346;
        C3822 c3822 = this.f20617;
        abstractActivityC3346 = c3822.f12233;
        return new ViewOnClickListenerC2411(c3822, LayoutInflater.from(abstractActivityC3346).inflate(R.layout.MT_Protector_res_0x7f0d00f0, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f20616.size();
    }
}
