package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import java.math.BigInteger;

/* compiled from: 95HF */
/* renamed from: l.᩹ܰܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22329 implements TextWatcher {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f72371;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f72372;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final TextView f72373;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f72374;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f72375 = true;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EditText f72376;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f72377;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f72369 = BigInteger.valueOf(C13132.FOREVER_NS);

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f72370 = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f72368 = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C22329(EditText editText, TextView textView, int i, boolean z) {
        this.f72376 = editText;
        this.f72373 = textView;
        this.f72374 = i;
        this.f72371 = z;
        m50064();
        editText.addTextChangedListener(this);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50064() {
        String obj = this.f72376.getText().toString();
        boolean isEmpty = obj.isEmpty();
        TextView textView = this.f72373;
        if (isEmpty) {
            this.f72377 = null;
            this.f72372 = false;
            this.f72375 = true;
            textView.setText(R.string.MT_Protector_res_0x7f120304);
            return;
        }
        this.f72375 = false;
        this.f72372 = false;
        int i = this.f72374;
        if (i == R.id.MT_Protector_res_0x7f0a0527) {
            try {
                long parseLong = Long.parseLong(obj);
                if (parseLong >= -128 && parseLong <= 127) {
                    this.f72377 = new byte[]{(byte) (parseLong & 255)};
                    m50062();
                    return;
                }
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f12030d);
                return;
            } catch (NumberFormatException unused) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
        }
        if (i == R.id.MT_Protector_res_0x7f0a065f) {
            try {
                long parseLong2 = Long.parseLong(obj);
                if (parseLong2 >= 0 && parseLong2 <= 255) {
                    this.f72377 = new byte[]{(byte) (parseLong2 & 255)};
                    m50062();
                    return;
                }
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f12030d);
                return;
            } catch (NumberFormatException unused2) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
        }
        if (i == R.id.MT_Protector_res_0x7f0a052a) {
            try {
                long parseLong3 = Long.parseLong(obj);
                if (parseLong3 >= -32768 && parseLong3 <= 32767) {
                    m50063(2, parseLong3);
                    return;
                }
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f12030d);
                return;
            } catch (NumberFormatException unused3) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
        }
        if (i == R.id.MT_Protector_res_0x7f0a0662) {
            try {
                long parseLong4 = Long.parseLong(obj);
                if (parseLong4 >= 0 && parseLong4 <= 65535) {
                    m50063(2, parseLong4);
                    return;
                }
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f12030d);
                return;
            } catch (NumberFormatException unused4) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
        }
        if (i == R.id.MT_Protector_res_0x7f0a0528) {
            try {
                long parseLong5 = Long.parseLong(obj);
                if (parseLong5 >= -2147483648L && parseLong5 <= 2147483647L) {
                    m50063(4, parseLong5);
                    return;
                }
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f12030d);
                return;
            } catch (NumberFormatException unused5) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
        }
        if (i == R.id.MT_Protector_res_0x7f0a0660) {
            try {
                long parseLong6 = Long.parseLong(obj);
                if (parseLong6 >= 0 && parseLong6 <= 4294967295L) {
                    m50063(4, parseLong6);
                    return;
                }
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f12030d);
                return;
            } catch (NumberFormatException unused6) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
        }
        if (i == R.id.MT_Protector_res_0x7f0a0529) {
            try {
                BigInteger bigInteger = new BigInteger(obj);
                if (bigInteger.compareTo(f72370) >= 0 && bigInteger.compareTo(f72369) <= 0) {
                    m50063(8, bigInteger.longValue());
                    return;
                }
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f12030d);
                return;
            } catch (NumberFormatException unused7) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
        }
        if (i == R.id.MT_Protector_res_0x7f0a0661) {
            try {
                BigInteger bigInteger2 = new BigInteger(obj);
                if (bigInteger2.compareTo(BigInteger.ZERO) >= 0 && bigInteger2.compareTo(f72368) <= 0) {
                    m50063(8, bigInteger2.longValue());
                    return;
                }
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f12030d);
                return;
            } catch (NumberFormatException unused8) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
        }
        if (i == R.id.MT_Protector_res_0x7f0a025c) {
            try {
                m50063(4, Float.floatToRawIntBits(Float.parseFloat(obj)));
                return;
            } catch (NumberFormatException unused9) {
                this.f72372 = true;
                textView.setText(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
        }
        if (i != R.id.MT_Protector_res_0x7f0a025b) {
            throw new IllegalStateException();
        }
        try {
            m50063(8, Double.doubleToRawLongBits(Double.parseDouble(obj)));
        } catch (NumberFormatException unused10) {
            this.f72372 = true;
            textView.setText(R.string.MT_Protector_res_0x7f120b48);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50062() {
        StringBuilder sb = new StringBuilder(this.f72377.length * 3);
        for (byte b : this.f72377) {
            sb.append(String.format("%02X ", Integer.valueOf(b & 255)));
        }
        this.f72373.setText(sb.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50063(int i, long j) {
        this.f72377 = new byte[i];
        if (this.f72371) {
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                this.f72377[i] = (byte) (j & 255);
                j >>>= 8;
            }
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                this.f72377[i2] = (byte) (j & 255);
                j >>>= 8;
            }
        }
        m50062();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m50064();
    }
}
