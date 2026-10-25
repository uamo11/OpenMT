package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 55FS */
/* renamed from: l.۬۬ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13136 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f39292;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f39293;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f39294;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f39295;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f39296;

    public C13136(AbstractActivityC3346 abstractActivityC3346) {
        this.f39292 = abstractActivityC3346;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00ce);
        m10216.setKeepScreenOn(true);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        this.f39295 = textView;
        textView.setText("...");
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(m10216);
        c19258.m44428(false);
        this.f39294 = c19258.m44415();
    }

    public C13136(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f39292 = abstractActivityC3346;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00ce);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        this.f39295 = textView;
        textView.setText(i);
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(m10216);
        c19258.m44428(false);
        this.f39294 = c19258.m44415();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31860(Runnable runnable) {
        this.f39293 = false;
        this.f39294.m1437(new DialogInterfaceOnKeyListenerC3259(this, runnable));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m31868() {
        return this.f39293;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31866(int i) {
        this.f39296 = false;
        C4925.m14316(new RunnableC21604(0, this), i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31854(C13136 c13136) {
        if (c13136.f39296) {
            return;
        }
        AbstractActivityC3346 abstractActivityC3346 = c13136.f39292;
        if (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
            return;
        }
        c13136.f39294.m1449();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m31864() {
        AbstractActivityC3346 abstractActivityC3346 = this.f39292;
        if (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
            return;
        }
        this.f39294.m1449();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31857() {
        this.f39296 = true;
        if (this.f39294.m1442()) {
            this.f39294.dismiss();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31859(CharSequence charSequence) {
        this.f39295.setText(charSequence);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m31867() {
        this.f39295.setText(R.string.MT_Protector_res_0x7f120b85);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31858(final int i) {
        this.f39292.runOnUiThread(new Runnable() { // from class: l.᩶۬ܿ
            @Override // java.lang.Runnable
            public final void run() {
                C13136.this.f39295.setText(i);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31861(final String str) {
        this.f39292.runOnUiThread(new Runnable() { // from class: l.᩹۬ܿ
            @Override // java.lang.Runnable
            public final void run() {
                C13136.this.f39295.setText(str);
            }
        });
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31863(final int i) {
        this.f39292.runOnUiThread(new Runnable() { // from class: l.ۙ۬ܿ
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView = C13136.this.f39295;
                textView.setSingleLine(false);
                textView.setText(i);
            }
        });
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView m31865() {
        return this.f39295;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m31862() {
        return this.f39294;
    }
}
