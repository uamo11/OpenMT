package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: 78HI */
/* renamed from: l.۠᩵ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8382 implements InterfaceC9773 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f25709;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f25710;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f25711;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f25712;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f25713;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f25714;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17714 f25715 = new C17714();

    @Override // l.InterfaceC9773
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫ */
    public final /* synthetic */ InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        return C14710.m35002(this, bArr, i2);
    }

    public C8382(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f25714 = bArr[24];
            this.f25712 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            int length = bArr.length - 43;
            String str = C3603.f11424;
            this.f25713 = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.f25709 = i;
            boolean z = (bArr[0] & UTF8.S_CS3) != 0;
            this.f25710 = z;
            if (z) {
                this.f25711 = C3603.m10997(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.f25711 = 0.85f;
                return;
            }
        }
        this.f25714 = 0;
        this.f25712 = -1;
        this.f25713 = "sans-serif";
        this.f25710 = false;
        this.f25711 = 0.85f;
        this.f25709 = -1;
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫ */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        String m41459;
        C17714 c17714 = this.f25715;
        c17714.m41462(i + i2, bArr);
        c17714.m41484(i);
        int i3 = 1;
        int i4 = 2;
        C22632.m50631(c17714.m41457() >= 2);
        int m41464 = c17714.m41464();
        if (m41464 == 0) {
            m41459 = "";
        } else {
            int m41485 = c17714.m41485();
            Charset m41475 = c17714.m41475();
            int m414852 = m41464 - (c17714.m41485() - m41485);
            if (m41475 == null) {
                m41475 = StandardCharsets.UTF_8;
            }
            m41459 = c17714.m41459(m414852, m41475);
        }
        if (m41459.isEmpty()) {
            interfaceC23483.accept(new C12866(-9223372036854775807L, -9223372036854775807L, AbstractC14545.of()));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m41459);
        m21991(spannableStringBuilder, this.f25714, 0, 0, spannableStringBuilder.length(), 16711680);
        m21990(spannableStringBuilder, this.f25712, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f25713;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f25711;
        while (c17714.m41457() >= 8) {
            int m414853 = c17714.m41485();
            int m41493 = c17714.m41493();
            int m414932 = c17714.m41493();
            if (m414932 == 1937013100) {
                C22632.m50631(c17714.m41457() >= i4);
                int m414642 = c17714.m41464();
                int i5 = 0;
                while (i5 < m414642) {
                    C22632.m50631(c17714.m41457() >= 12);
                    int m414643 = c17714.m41464();
                    int m414644 = c17714.m41464();
                    c17714.m41478(i4);
                    int m41456 = c17714.m41456();
                    c17714.m41478(i3);
                    int m414933 = c17714.m41493();
                    if (m414644 > spannableStringBuilder.length()) {
                        StringBuilder m32308 = C13325.m32308(m414644, "Truncating styl end (", ") to cueText.length() (");
                        m32308.append(spannableStringBuilder.length());
                        m32308.append(").");
                        C19956.m46037(m32308.toString());
                        m414644 = spannableStringBuilder.length();
                    }
                    if (m414643 >= m414644) {
                        C19956.m46037("Ignoring styl with start (" + m414643 + ") >= end (" + m414644 + ").");
                    } else {
                        int i6 = m414644;
                        m21991(spannableStringBuilder, m41456, this.f25714, m414643, i6, 0);
                        m21990(spannableStringBuilder, m414933, this.f25712, m414643, i6, 0);
                    }
                    i5++;
                    i3 = 1;
                    i4 = 2;
                }
            } else if (m414932 == 1952608120 && this.f25710) {
                C22632.m50631(c17714.m41457() >= 2);
                f = C3603.m10997(c17714.m41464() / this.f25709, 0.0f, 0.95f);
                c17714.m41484(m414853 + m41493);
                i3 = 1;
                i4 = 2;
            }
            c17714.m41484(m414853 + m41493);
            i3 = 1;
            i4 = 2;
        }
        C21927 c21927 = new C21927();
        c21927.m49389(spannableStringBuilder);
        c21927.m49385(f, 0);
        c21927.m49386(0);
        interfaceC23483.accept(new C12866(-9223372036854775807L, -9223372036854775807L, AbstractC14545.of((Object) c21927.m49383())));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m21991(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21990(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }
}
