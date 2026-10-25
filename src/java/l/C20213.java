package l;

import android.text.style.BackgroundColorSpan;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.math.BigInteger;

/* compiled from: 95HF */
/* renamed from: l.᩶ܰܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20213 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65391;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65392;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC5396 f65393;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65394;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65395;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65396;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65397;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65398;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CompoundButton f65399;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65400;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65401;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BackgroundColorSpan f65402 = new BackgroundColorSpan(1627389951 & C21943.f70257);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f65403;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65404;

    public C20213(ViewOnClickListenerC5396 viewOnClickListenerC5396) {
        this.f65393 = viewOnClickListenerC5396;
        CompoundButton compoundButton = (CompoundButton) viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a029a);
        this.f65399 = compoundButton;
        this.f65403 = (TextView) viewOnClickListenerC5396.m10241(R.id.MT_Protector_res_0x7f0a025a);
        this.f65398 = new ViewOnLongClickListenerC21624(this, 1, R.id.MT_Protector_res_0x7f0a0527);
        this.f65404 = new ViewOnLongClickListenerC21624(this, 1, R.id.MT_Protector_res_0x7f0a065f);
        this.f65397 = new ViewOnLongClickListenerC21624(this, 2, R.id.MT_Protector_res_0x7f0a052a);
        this.f65391 = new ViewOnLongClickListenerC21624(this, 2, R.id.MT_Protector_res_0x7f0a0662);
        this.f65396 = new ViewOnLongClickListenerC21624(this, 4, R.id.MT_Protector_res_0x7f0a0528);
        this.f65400 = new ViewOnLongClickListenerC21624(this, 4, R.id.MT_Protector_res_0x7f0a0660);
        this.f65394 = new ViewOnLongClickListenerC21624(this, 8, R.id.MT_Protector_res_0x7f0a0529);
        this.f65395 = new ViewOnLongClickListenerC21624(this, 8, R.id.MT_Protector_res_0x7f0a0661);
        this.f65392 = new ViewOnLongClickListenerC21624(this, 4, R.id.MT_Protector_res_0x7f0a025c);
        this.f65401 = new ViewOnLongClickListenerC21624(this, 8, R.id.MT_Protector_res_0x7f0a025b);
        compoundButton.setOnCheckedChangeListener(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46453() {
        int min;
        byte[] bArr;
        this.f65403.setText("");
        this.f65398.m48846(0);
        this.f65404.m48846(0);
        this.f65397.m48846(0);
        this.f65391.m48846(0);
        this.f65396.m48846(0);
        this.f65400.m48846(0);
        this.f65394.m48846(0);
        this.f65395.m48846(0);
        this.f65392.m48846(0);
        this.f65401.m48846(0);
        C6807 c6807 = this.f65393.f16793;
        C18177 m27414 = c6807.f21109.m27414();
        try {
            synchronized (m27414) {
                int length = m27414.length();
                int max = Math.max(0, Math.min(c6807.f21109.m27418(), length));
                long j = length;
                if (c6807.f21109.m27406()) {
                    j = Math.min(j, c6807.f21109.m27404() + 1);
                }
                min = (int) Math.min(8L, Math.max(0L, j - max));
                bArr = new byte[min];
                m27414.m42392(max, min, bArr);
            }
            if (min > 0) {
                StringBuilder sb = new StringBuilder(min * 3);
                for (int i = 0; i < min; i++) {
                    sb.append(String.format("%02X ", Integer.valueOf(bArr[i] & 255)));
                }
                sb.deleteCharAt(sb.length() - 1);
                this.f65403.setText(sb.toString());
            }
            if (this.f65398.m48846(min)) {
                this.f65398.m48845(String.valueOf((int) ((byte) this.f65398.m48844(bArr))));
            }
            if (this.f65404.m48846(min)) {
                this.f65404.m48845(String.valueOf(this.f65404.m48844(bArr)));
            }
            if (this.f65397.m48846(min)) {
                this.f65397.m48845(String.valueOf((int) ((short) this.f65397.m48844(bArr))));
            }
            if (this.f65391.m48846(min)) {
                this.f65391.m48845(String.valueOf(this.f65391.m48844(bArr)));
            }
            if (this.f65396.m48846(min)) {
                this.f65396.m48845(String.valueOf((int) this.f65396.m48844(bArr)));
            }
            if (this.f65400.m48846(min)) {
                this.f65400.m48845(String.valueOf(this.f65400.m48844(bArr)));
            }
            if (this.f65394.m48846(min)) {
                this.f65394.m48845(String.valueOf(this.f65394.m48844(bArr)));
            }
            if (this.f65395.m48846(min)) {
                ViewOnLongClickListenerC21624 viewOnLongClickListenerC21624 = this.f65395;
                int i2 = viewOnLongClickListenerC21624.f69416;
                byte[] bArr2 = new byte[i2];
                if (viewOnLongClickListenerC21624.f69414.f65399.isChecked()) {
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                } else {
                    for (int i3 = 1; i3 <= i2; i3++) {
                        bArr2[i3 - 1] = bArr[i2 - i3];
                    }
                }
                viewOnLongClickListenerC21624.m48845(new BigInteger(1, bArr2).toString());
            }
            if (this.f65392.m48846(min)) {
                this.f65392.m48845(Float.toString(Float.intBitsToFloat((int) this.f65392.m48844(bArr))));
            }
            if (this.f65401.m48846(min)) {
                this.f65401.m48845(Double.toString(Double.longBitsToDouble(this.f65401.m48844(bArr))));
            }
        } catch (IOException e) {
            this.f65393.m15384(e);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m46453();
    }
}
