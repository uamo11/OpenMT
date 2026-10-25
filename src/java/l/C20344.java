package l;

import android.text.TextUtils;
import android.util.Base64;
import java.io.Serializable;

/* compiled from: 195F */
/* renamed from: l.᩶ᩳ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20344 implements Serializable {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f65671 = 0;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65674 = true;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f65669 = false;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f65676 = false;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f65665 = 10;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f65672 = 2;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f65666 = 10;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f65667 = 1000;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f65670 = true;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f65677 = "\\n";

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65673 = 0;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f65668 = true;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f65675 = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46669() {
        InterfaceC13049 edit = ApplicationC20075.f65008.edit();
        C10130 c10130 = new C10130();
        boolean z = this.f65671 == 0 ? 1 : 0;
        this.f65674 = z;
        int i = z;
        if (this.f65669) {
            i = (z ? 1 : 0) | 2;
        }
        int i2 = i;
        if (this.f65676) {
            i2 = (i == true ? 1 : 0) | 4;
        }
        c10130.writeByte(i2);
        c10130.writeInt(this.f65665);
        c10130.writeInt(this.f65672);
        c10130.writeInt(this.f65666);
        c10130.writeInt(this.f65671);
        c10130.writeInt(this.f65667);
        c10130.m25425(this.f65670);
        c10130.m25423((CharSequence) this.f65677);
        int m52559 = C23850.m52559(this.f65673);
        this.f65673 = m52559;
        c10130.writeInt(m52559);
        c10130.m25425(this.f65668);
        String str = this.f65675;
        if (str == null) {
            str = "";
        }
        c10130.m25423((CharSequence) str);
        edit.putString("smfa", Base64.encodeToString(c10130.m25444(), 2)).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46668() {
        String string = ApplicationC20075.f65008.getString("smfa", null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            C12951 c12951 = new C12951(Base64.decode(string, 2));
            byte readByte = c12951.readByte();
            this.f65674 = (readByte & 1) != 0;
            this.f65669 = (readByte & 2) != 0;
            this.f65676 = (readByte & 4) != 0;
            this.f65665 = c12951.readInt();
            this.f65672 = c12951.readInt();
            this.f65666 = c12951.readInt();
            this.f65671 = !this.f65674 ? 1 : 0;
            int readInt = c12951.readInt();
            int readInt2 = c12951.readInt();
            boolean m31498 = c12951.m31498();
            String m31504 = c12951.m31504();
            int m52559 = C23850.m52559(c12951.readInt());
            boolean m314982 = c12951.m31498();
            String m315042 = c12951.m31504();
            if (readInt >= 0 && readInt <= 3) {
                this.f65671 = readInt;
                this.f65674 = readInt == 0;
            }
            this.f65667 = readInt2;
            this.f65670 = m31498;
            this.f65677 = m31504;
            this.f65673 = m52559;
            this.f65668 = m314982;
            this.f65675 = m315042;
        } catch (Exception unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46667() {
        int i = this.f65671;
        return i == 2 || i == 3;
    }
}
