package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 998H */
/* renamed from: l.ۜܶۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC6844 extends AbstractC3255 implements InterfaceC1008, View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC3817 f21181;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f21182;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f21183;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f21184;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f21185;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10402 f21186;

    public ViewOnClickListenerC6844(Main main, ViewGroup viewGroup) {
        super(LayoutInflater.from(main).inflate(R.layout.MT_Protector_res_0x7f0d011b, viewGroup, false));
        this.f21185 = main;
        this.f21183 = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a03d6);
        this.f21184 = (TextView) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        this.f21186 = (C10402) this.itemView.findViewById(R.id.icon);
        ProgressBar progressBar = (ProgressBar) this.itemView.findViewById(R.id.MT_Protector_res_0x7f0a0458);
        this.f21182 = progressBar;
        C10392 c10392 = new C10392(main);
        c10392.m26205(true);
        progressBar.setIndeterminateDrawable(c10392);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC3817 abstractC3817 = this.f21181;
        if (abstractC3817 == null) {
            return;
        }
        boolean m11516 = abstractC3817.m11516();
        AbstractActivityC3346 abstractActivityC3346 = this.f21185;
        if (m11516) {
            C17222 m11537 = this.f21181.m11537();
            if (m11537.m40525()) {
                m11537.m40523(abstractActivityC3346);
                return;
            }
            return;
        }
        this.f21181.m11550(abstractActivityC3346);
    }

    @Override // l.InterfaceC1008
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo1617(AbstractC3817 abstractC3817) {
        boolean z;
        AbstractC3817 abstractC38172 = this.f21181;
        if (abstractC38172 != abstractC3817) {
            if (abstractC38172 != null) {
                abstractC38172.m11532().m1670((InterfaceC1008) this);
            }
            if (abstractC3817 != null) {
                abstractC3817.m11532().m1668(this.f21185, this);
            }
            this.f21181 = abstractC3817;
        }
        if (abstractC3817 == null) {
            return;
        }
        this.f21186.m26232(abstractC3817.mo2779());
        if (!abstractC3817.m11516()) {
            z = false;
        } else if (!abstractC3817.m11537().m40525()) {
            return;
        } else {
            z = true;
        }
        CharSequence m11557 = abstractC3817.m11557();
        CharSequence m11534 = abstractC3817.m11534();
        int m11539 = abstractC3817.m11539();
        TextView textView = this.f21183;
        if (m11557 != null) {
            textView.setText(abstractC3817.m11557());
        } else {
            textView.setText("...");
        }
        TextView textView2 = this.f21184;
        if (m11534 == null) {
            if (textView2.getVisibility() != 8) {
                textView2.setVisibility(8);
            }
        } else {
            if (textView2.getVisibility() != 0) {
                textView2.setVisibility(0);
            }
            if (m11534.length() > 50) {
                textView2.setText(C6554.m18061(50, m11534.toString()));
            } else {
                textView2.setText(m11534);
            }
        }
        ProgressBar progressBar = this.f21182;
        if (z) {
            if (progressBar.getVisibility() != 8) {
                progressBar.setVisibility(8);
                return;
            }
            return;
        }
        if (progressBar.getVisibility() != 0) {
            progressBar.setVisibility(0);
        }
        if (m11539 != -1) {
            progressBar.setIndeterminate(false);
            progressBar.setProgress(m11539);
        } else {
            progressBar.setIndeterminate(true);
        }
    }
}
