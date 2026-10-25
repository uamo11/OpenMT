package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: J57U */
/* renamed from: l.ۢ֫ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9278 implements TextWatcher, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f28104;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28105;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Spinner f28106;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f28107;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f28108;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f28109;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f28110 = true;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5062 f28111;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f28112;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Charset f28100 = StandardCharsets.US_ASCII;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static Charset f28102 = StandardCharsets.UTF_8;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static Charset f28099 = StandardCharsets.UTF_16LE;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static Charset f28103 = Charset.forName("GBK");

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final BigInteger f28101 = BigInteger.valueOf(C13132.FOREVER_NS);

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final BigInteger f28097 = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final BigInteger f28098 = new BigInteger("FFFFFFFFFFFFFFFF", 16);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C9278(boolean z, C5062 c5062, TextView textView, Spinner spinner, CheckBox checkBox) {
        this.f28107 = z;
        this.f28111 = c5062;
        this.f28109 = textView;
        this.f28106 = spinner;
        this.f28104 = checkBox;
        spinner.setSelection(ApplicationC20075.f65008.getInt(z ? "hex_search_type" : "hex_replace_type", 0));
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean(z ? "hex_search_high_byte_first" : "hex_replace_high_byte_first", false));
        m23804();
        c5062.m14600(this);
        spinner.setOnItemSelectedListener(this);
        checkBox.setOnCheckedChangeListener(this);
        checkBox.setEnabled(false);
        ViewOnClickListenerC14813.m35215(textView);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23801() {
        C5062 c5062 = this.f28111;
        String obj = c5062.m14611().toString();
        if (obj.equals(this.f28108)) {
            return;
        }
        this.f28108 = obj;
        c5062.m14610();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23804() {
        String obj = this.f28111.m14611().toString();
        boolean isEmpty = obj.isEmpty();
        byte[] bArr = null;
        int i = 0;
        TextView textView = this.f28109;
        if (isEmpty) {
            this.f28112 = null;
            this.f28105 = false;
            this.f28110 = true;
            textView.setTextColor(C21943.f70273);
            textView.setText(this.f28107 ? R.string.MT_Protector_res_0x7f120304 : R.string.MT_Protector_res_0x7f1202ea);
            return;
        }
        this.f28110 = false;
        this.f28105 = false;
        switch (this.f28106.getSelectedItemPosition()) {
            case 0:
                String replaceAll = obj.replaceAll("\\s+", "");
                int length = replaceAll.length();
                if (length % 2 != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(replaceAll.substring(0, replaceAll.length() - 1));
                    sb.append("0");
                    replaceAll = C20087.m46305(replaceAll.length() - 1, replaceAll, sb);
                    length++;
                }
                byte[] bArr2 = new byte[length / 2];
                while (i < length) {
                    int i2 = i + 2;
                    try {
                        bArr2[i / 2] = (byte) Integer.parseInt(replaceAll.substring(i, i2), 16);
                        i = i2;
                    } catch (NumberFormatException unused) {
                    }
                }
                bArr = bArr2;
                if (bArr != null) {
                    this.f28112 = bArr;
                    m23803();
                    return;
                } else {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            case 1:
                this.f28112 = obj.getBytes(f28100);
                break;
            case 2:
                this.f28112 = obj.getBytes(f28099);
                break;
            case 3:
                this.f28112 = obj.getBytes(f28102);
                break;
            case 4:
                this.f28112 = obj.getBytes(f28103);
                break;
            case 5:
                try {
                    long parseLong = Long.parseLong(obj);
                    if (parseLong >= -128 && parseLong <= 127) {
                        this.f28112 = new byte[]{(byte) (parseLong & 255)};
                        m23803();
                        return;
                    }
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f12030d);
                    return;
                } catch (NumberFormatException unused2) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            case 6:
                try {
                    long parseLong2 = Long.parseLong(obj);
                    if (parseLong2 >= 0 && parseLong2 <= 255) {
                        this.f28112 = new byte[]{(byte) (parseLong2 & 255)};
                        m23803();
                        return;
                    }
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f12030d);
                    return;
                } catch (NumberFormatException unused3) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            case 7:
                try {
                    long parseLong3 = Long.parseLong(obj);
                    if (parseLong3 >= -32768 && parseLong3 <= 32767) {
                        m23802(2, parseLong3);
                        return;
                    }
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f12030d);
                    return;
                } catch (NumberFormatException unused4) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            case 8:
                try {
                    long parseLong4 = Long.parseLong(obj);
                    if (parseLong4 >= 0 && parseLong4 <= 65535) {
                        m23802(2, parseLong4);
                        return;
                    }
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f12030d);
                    return;
                } catch (NumberFormatException unused5) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            case 9:
                try {
                    long parseLong5 = Long.parseLong(obj);
                    if (parseLong5 >= -2147483648L && parseLong5 <= 2147483647L) {
                        m23802(4, parseLong5);
                        return;
                    }
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f12030d);
                    return;
                } catch (NumberFormatException unused6) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            case 10:
                try {
                    long parseLong6 = Long.parseLong(obj);
                    if (parseLong6 >= 0 && parseLong6 <= 4294967295L) {
                        m23802(4, parseLong6);
                        return;
                    }
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f12030d);
                    return;
                } catch (NumberFormatException unused7) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            case 11:
                try {
                    BigInteger bigInteger = new BigInteger(obj);
                    if (bigInteger.compareTo(f28097) >= 0 && bigInteger.compareTo(f28101) <= 0) {
                        m23802(8, bigInteger.longValue());
                        return;
                    }
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f12030d);
                    return;
                } catch (NumberFormatException unused8) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            case 12:
                try {
                    BigInteger bigInteger2 = new BigInteger(obj);
                    if (bigInteger2.compareTo(BigInteger.ZERO) >= 0 && bigInteger2.compareTo(f28098) <= 0) {
                        m23802(8, bigInteger2.longValue());
                        return;
                    }
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f12030d);
                    return;
                } catch (NumberFormatException unused9) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            case 13:
                try {
                    m23802(4, Float.floatToRawIntBits(Float.parseFloat(obj)));
                    return;
                } catch (NumberFormatException unused10) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            case 14:
                try {
                    m23802(8, Double.doubleToRawLongBits(Double.parseDouble(obj)));
                    return;
                } catch (NumberFormatException unused11) {
                    this.f28105 = true;
                    textView.setTextColor(C21943.f70293);
                    textView.setText(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
            default:
                return;
        }
        m23803();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23803() {
        int min = Math.min(this.f28112.length, 50);
        StringBuilder sb = new StringBuilder(min * 2);
        for (int i = 0; i < min; i++) {
            byte b = this.f28112[i];
            if (i != 0) {
                sb.append(' ');
            }
            sb.append("0123456789ABCDEF".charAt((b >>> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(b & 15));
        }
        if (min < this.f28112.length) {
            sb.append("…");
        }
        int i2 = C21943.f70291;
        TextView textView = this.f28109;
        textView.setTextColor(i2);
        textView.setText(sb.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23802(int i, long j) {
        this.f28112 = new byte[i];
        if (this.f28104.isChecked()) {
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                this.f28112[i] = (byte) (j & 255);
                j >>>= 8;
            }
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                this.f28112[i2] = (byte) (j & 255);
                j >>>= 8;
            }
        }
        m23803();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        m23804();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ApplicationC20075.f65008.edit().mo25853(i, this.f28107 ? "hex_search_type" : "hex_replace_type").apply();
        this.f28104.setEnabled(i > 4);
        m23804();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ApplicationC20075.f65008.edit().putBoolean(this.f28107 ? "hex_search_high_byte_first" : "hex_replace_high_byte_first", z);
        m23804();
    }
}
