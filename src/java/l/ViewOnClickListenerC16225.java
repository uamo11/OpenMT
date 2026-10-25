package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* compiled from: L1RG */
/* renamed from: l.ܺ᩹ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC16225 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f49953;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49954;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0640 f49955;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f49956;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49957;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f49958;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f49959;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnClickListenerC16225(AbstractActivityC3346 abstractActivityC3346, InterfaceC9171 interfaceC9171) {
        this.f49958 = abstractActivityC3346;
        this.f49956 = (AbstractActivityC3346) interfaceC9171;
        this.f49955 = (C0640) abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a05bd);
        abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00b6).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00c3).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00b1).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00ae).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00b8).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00b5).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00bd).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00bc).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00ba).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00c2).setOnClickListener(this);
        View m10241 = abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00c4);
        m10241.setOnClickListener(this);
        ViewOnTouchListenerC9877.m24971(m10241);
        View m102412 = abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00b3);
        m102412.setOnClickListener(this);
        ViewOnTouchListenerC9877.m24971(m102412);
        View m102413 = abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00b9);
        m102413.setOnClickListener(this);
        ViewOnTouchListenerC9877.m24971(m102413);
        View m102414 = abstractActivityC3346.m10241(R.id.MT_Protector_res_0x7f0a00c1);
        m102414.setOnClickListener(this);
        ViewOnTouchListenerC9877.m24971(m102414);
        this.f49957 = ((TextView) m102414).getTextColors().getDefaultColor();
        this.f49954 = C21238.m48210(abstractActivityC3346.getTheme(), R.attr.MT_Protector_res_0x7f0400f3);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۗܺ᩷, l.ۡ᩹ۢ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.MT_Protector_res_0x7f0a00b6) {
            i = UMErrorCode.E_UM_BE_CREATE_FAILED;
        } else if (id == R.id.MT_Protector_res_0x7f0a00c3) {
            i = 61;
        } else {
            int i2 = this.f49957;
            int i3 = this.f49954;
            if (id == R.id.MT_Protector_res_0x7f0a00b1) {
                boolean z = this.f49953;
                this.f49953 = !z;
                if (!z) {
                    ApplicationC20075.m46265(false);
                }
                TextView textView = (TextView) view;
                if (this.f49953) {
                    i2 = i3;
                }
                textView.setTextColor(i2);
            } else if (id == R.id.MT_Protector_res_0x7f0a00ae) {
                boolean z2 = this.f49959;
                this.f49959 = !z2;
                if (!z2) {
                    ApplicationC20075.m46265(false);
                }
                TextView textView2 = (TextView) view;
                if (this.f49959) {
                    i2 = i3;
                }
                textView2.setTextColor(i2);
            } else if (id == R.id.MT_Protector_res_0x7f0a00c4) {
                i = 19;
            } else if (id == R.id.MT_Protector_res_0x7f0a00b3) {
                i = 20;
            } else if (id == R.id.MT_Protector_res_0x7f0a00b9) {
                i = 21;
            } else if (id == R.id.MT_Protector_res_0x7f0a00c1) {
                i = 22;
            } else if (id == R.id.MT_Protector_res_0x7f0a00b8) {
                i = 122;
            } else if (id == R.id.MT_Protector_res_0x7f0a00b5) {
                i = 123;
            } else if (id == R.id.MT_Protector_res_0x7f0a00bd) {
                i = 92;
            } else if (id == R.id.MT_Protector_res_0x7f0a00bc) {
                i = 93;
            } else {
                ?? r3 = this.f49956;
                if (id == R.id.MT_Protector_res_0x7f0a00ba) {
                    r3.mo20746(view);
                    return;
                } else if (id == R.id.MT_Protector_res_0x7f0a00c2) {
                    r3.mo20747();
                    return;
                }
            }
            i = 0;
        }
        if (i != 0) {
            KeyEvent keyEvent = new KeyEvent(0, i);
            C0640 c0640 = this.f49955;
            c0640.dispatchKeyEvent(keyEvent);
            c0640.dispatchKeyEvent(new KeyEvent(1, i));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38185() {
        if (!this.f49953) {
            return false;
        }
        this.f49953 = false;
        ((TextView) this.f49958.m10241(R.id.MT_Protector_res_0x7f0a00b1)).setTextColor(this.f49957);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38184() {
        if (!this.f49959) {
            return false;
        }
        this.f49959 = false;
        ((TextView) this.f49958.m10241(R.id.MT_Protector_res_0x7f0a00ae)).setTextColor(this.f49957);
        return true;
    }
}
