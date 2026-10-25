package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.Character;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.simpleframework.xml.stream.DocumentReader;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: R1GU */
/* renamed from: l.ۧۘܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10753 implements XmlSerializer {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f32379;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17808 f32381;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f32382;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C0168 f32383;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f32386;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f32387;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f32384 = new String[12];

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f32388 = new int[4];

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String[] f32380 = new String[8];

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean[] f32385 = new boolean[4];

    public C10753(boolean z) {
        setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        if (z) {
            this.f32383 = new C0168();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26951(boolean z) {
        if (!this.f32387) {
            return;
        }
        int i = this.f32382;
        int i2 = i + 1;
        this.f32382 = i2;
        this.f32387 = false;
        boolean[] zArr = this.f32385;
        if (zArr.length <= i2) {
            boolean[] zArr2 = new boolean[i + 5];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f32385 = zArr2;
        }
        boolean[] zArr3 = this.f32385;
        int i3 = this.f32382;
        int i4 = i3 - 1;
        zArr3[i3] = zArr3[i4];
        int i5 = this.f32388[i4];
        while (true) {
            int[] iArr = this.f32388;
            int i6 = this.f32382;
            if (i5 < iArr[i6]) {
                this.f32381.write(32);
                this.f32381.write("xmlns");
                int i7 = i5 * 2;
                if (!"".equals(this.f32380[i7])) {
                    this.f32381.write(58);
                    this.f32381.write(this.f32380[i7]);
                } else if ("".equals(getNamespace()) && !"".equals(this.f32380[i7 + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
                this.f32381.write("=\"");
                m26950(34, this.f32380[i7 + 1]);
                this.f32381.write(34);
                i5++;
            } else {
                int i8 = i6 + 1;
                if (iArr.length <= i8) {
                    int[] iArr2 = new int[i6 + 8];
                    System.arraycopy(iArr, 0, iArr2, 0, i8);
                    this.f32388 = iArr2;
                }
                int[] iArr3 = this.f32388;
                int i9 = this.f32382;
                iArr3[i9 + 1] = iArr3[i9];
                this.f32381.write(z ? " />" : ">");
                C0168 c0168 = this.f32383;
                if (c0168 != null) {
                    c0168.m1296(this.f32381.getPosition());
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26948(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\r') {
                sb.append("&#");
                sb.append((int) charAt);
                sb.append(';');
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r1 != '\'') goto L31;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m26950(int r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            int r1 = r8.length()
            if (r0 >= r1) goto Lc1
            char r1 = r8.charAt(r0)
            r2 = 9
            r3 = 59
            java.lang.String r4 = "&#"
            if (r1 == r2) goto La0
            r2 = 10
            if (r1 == r2) goto La0
            r2 = 13
            if (r1 == r2) goto L8b
            r2 = 34
            if (r1 == r2) goto L4b
            r3 = 60
            if (r1 == r3) goto L42
            r3 = 62
            if (r1 == r3) goto L39
            r3 = 38
            if (r1 == r3) goto L30
            r3 = 39
            if (r1 == r3) goto L4b
            goto L5a
        L30:
            l.ᩳۘܽ r1 = r6.f32381
            java.lang.String r2 = "&amp;"
            r1.write(r2)
            goto Lbd
        L39:
            l.ᩳۘܽ r1 = r6.f32381
            java.lang.String r2 = "&gt;"
            r1.write(r2)
            goto Lbd
        L42:
            l.ᩳۘܽ r1 = r6.f32381
            java.lang.String r2 = "&lt;"
            r1.write(r2)
            goto Lbd
        L4b:
            if (r1 != r7) goto L5a
            l.ᩳۘܽ r3 = r6.f32381
            if (r1 != r2) goto L54
            java.lang.String r1 = "&quot;"
            goto L56
        L54:
            java.lang.String r1 = "&apos;"
        L56:
            r3.write(r1)
            goto Lbd
        L5a:
            r2 = 32
            if (r1 < r2) goto L68
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 >= r2) goto L68
            l.ᩳۘܽ r2 = r6.f32381
            r2.write(r1)
            goto Lbd
        L68:
            boolean r2 = m26952(r1)
            if (r2 == 0) goto L74
            l.ᩳۘܽ r2 = r6.f32381
            r2.write(r1)
            goto Lbd
        L74:
            l.ᩳۘܽ r2 = r6.f32381
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ";"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.write(r1)
            goto Lbd
        L8b:
            l.ᩳۘܽ r2 = r6.f32381
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            r2.write(r1)
            goto Lbd
        La0:
            r2 = -1
            if (r7 != r2) goto La9
            l.ᩳۘܽ r2 = r6.f32381
            r2.write(r1)
            goto Lbd
        La9:
            l.ᩳۘܽ r2 = r6.f32381
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            r2.write(r1)
        Lbd:
            int r0 = r0 + 1
            goto L1
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10753.m26950(int, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26952(char c) {
        Character.UnicodeBlock of;
        if ((c < ' ' && c != '\r' && c != '\n' && c != '\t') || c == 127) {
            return false;
        }
        if (c > 127) {
            return (!Character.isValidCodePoint(c) || (of = Character.UnicodeBlock.of(c)) == Character.UnicodeBlock.PRIVATE_USE_AREA || of == Character.UnicodeBlock.SPECIALS || of == Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A || of == Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B) ? false : true;
        }
        return true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) {
        this.f32381.write("<!DOCTYPE");
        this.f32381.write(str);
        this.f32381.write(">");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() {
        while (true) {
            if (this.f32382 > 0) {
                String[] strArr = this.f32384;
                endTag(strArr[(r0 * 3) - 3], strArr[(r0 * 3) - 1]);
            } else {
                flush();
                return;
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) {
        m26951(false);
        this.f32381.write(38);
        this.f32381.write(str);
        this.f32381.write(59);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        return "http://xmlpull.org/v1/doc/features.html#indent-output".equals(str) && this.f32385[this.f32382];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        try {
            return m26949(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m26949(String str, boolean z, boolean z2) {
        int i = this.f32388[this.f32382 + 1] * 2;
        while (true) {
            i -= 2;
            String str2 = null;
            String str3 = "";
            if (i < 0) {
                if (!z2) {
                    return null;
                }
                if (!"".equals(str)) {
                    do {
                        StringBuilder sb = new StringBuilder("n");
                        int i2 = this.f32379;
                        this.f32379 = i2 + 1;
                        sb.append(i2);
                        String sb2 = sb.toString();
                        int i3 = this.f32388[this.f32382 + 1] * 2;
                        while (true) {
                            i3 -= 2;
                            if (i3 < 0) {
                                str3 = sb2;
                                break;
                            }
                            if (sb2.equals(this.f32380[i3])) {
                                str3 = null;
                                break;
                            }
                        }
                    } while (str3 == null);
                }
                boolean z3 = this.f32387;
                this.f32387 = false;
                setPrefix(str3, str);
                this.f32387 = z3;
                return str3;
            }
            if (this.f32380[i + 1].equals(str) && (z || !this.f32380[i].equals(""))) {
                String str4 = this.f32380[i];
                int i4 = i + 2;
                while (true) {
                    if (i4 >= this.f32388[this.f32382 + 1] * 2) {
                        str2 = str4;
                        break;
                    }
                    if (this.f32380[i4].equals(str4)) {
                        break;
                    }
                    i4++;
                }
                if (str2 != null) {
                    return str2;
                }
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new RuntimeException("Unsupported property");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) {
        text(str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            this.f32385[this.f32382] = z;
            return;
        }
        throw new RuntimeException("Unsupported Feature");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new RuntimeException(C5368.m15337(obj, "Unsupported Property:"));
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) {
        m26951(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str.equals(m26949(str2, true, false))) {
            return;
        }
        int[] iArr = this.f32388;
        int i = this.f32382 + 1;
        int i2 = iArr[i];
        iArr[i] = i2 + 1;
        int i3 = i2 << 1;
        String[] strArr = this.f32380;
        int i4 = i3 + 1;
        if (strArr.length < i4) {
            String[] strArr2 = new String[strArr.length + 16];
            System.arraycopy(strArr, 0, strArr2, 0, i3);
            this.f32380 = strArr2;
        }
        String[] strArr3 = this.f32380;
        strArr3[i3] = str;
        strArr3[i4] = str2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.f32381 = new C17808(writer);
        int[] iArr = this.f32388;
        iArr[0] = 2;
        iArr[1] = 2;
        String[] strArr = this.f32380;
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = DocumentReader.RESERVED;
        strArr[3] = "http://www.w3.org/XML/1998/namespace";
        this.f32387 = false;
        this.f32379 = 0;
        this.f32382 = 0;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) {
        OutputStreamWriter outputStreamWriter;
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        if (str == null) {
            outputStreamWriter = new OutputStreamWriter(outputStream);
        } else {
            outputStreamWriter = new OutputStreamWriter(outputStream, str);
        }
        setOutput(outputStreamWriter);
        this.f32386 = str;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) {
        this.f32381.write("<?xml version='1.0' ");
        if (str != null) {
            this.f32386 = str;
        }
        if (this.f32386 != null) {
            this.f32381.write("encoding='");
            this.f32381.write(this.f32386);
            this.f32381.write("' ");
        }
        if (bool != null) {
            this.f32381.write("standalone='");
            this.f32381.write(bool.booleanValue() ? "yes" : "no");
            this.f32381.write("' ");
        }
        this.f32381.write("?>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) {
        m26951(false);
        C0168 c0168 = this.f32383;
        if (c0168 != null) {
            c0168.mo1294(str2);
        }
        if (this.f32385[this.f32382]) {
            this.f32381.write("\n");
            for (int i = 0; i < this.f32382; i++) {
                this.f32381.write(ASN1Dump.TAB);
            }
        }
        int i2 = this.f32382 * 3;
        String[] strArr = this.f32384;
        if (strArr.length < i2 + 3) {
            String[] strArr2 = new String[strArr.length + 12];
            System.arraycopy(strArr, 0, strArr2, 0, i2);
            this.f32384 = strArr2;
        }
        String m26949 = str == null ? "" : m26949(str, true, true);
        if (m26949 == null) {
            m26949 = "";
        }
        if ("".equals(str)) {
            for (int i3 = this.f32388[this.f32382]; i3 < this.f32388[this.f32382 + 1]; i3++) {
                int i4 = i3 * 2;
                if ("".equals(this.f32380[i4]) && !"".equals(this.f32380[i4 + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        String[] strArr3 = this.f32384;
        strArr3[i2] = str;
        strArr3[i2 + 1] = m26949;
        strArr3[i2 + 2] = str2;
        if (c0168 != null) {
            c0168.m1297(this.f32381.m41741(), this.f32381.m41740(), this.f32381.getPosition());
        }
        this.f32381.write(60);
        if (!"".equals(m26949)) {
            this.f32381.write(m26949);
            this.f32381.write(58);
        }
        this.f32381.write(str2);
        this.f32387 = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) {
        if (!this.f32387) {
            throw new IllegalStateException("illegal position for attribute");
        }
        C0168 c0168 = this.f32383;
        if (c0168 != null) {
            c0168.mo1291(str2, str3);
        }
        if (str == null) {
            str = "";
        }
        String m26949 = "".equals(str) ? "" : m26949(str, false, true);
        if (m26949 == null) {
            m26949 = "";
        }
        this.f32381.write(32);
        if (c0168 != null) {
            c0168.m1289(this.f32381.m41741(), this.f32381.m41740(), this.f32381.getPosition());
        }
        if (!"".equals(m26949)) {
            this.f32381.write(m26949);
            this.f32381.write(58);
        }
        this.f32381.write(str2);
        if (c0168 != null) {
            c0168.m1288(this.f32381.getPosition());
        }
        this.f32381.write(61);
        int i = str3.indexOf(34) != -1 ? 39 : 34;
        this.f32381.write(i);
        if (c0168 != null) {
            c0168.m1293(this.f32381.m41741(), this.f32381.m41740(), this.f32381.getPosition());
        }
        m26950(i, str3);
        if (c0168 != null) {
            c0168.m1292(this.f32381.getPosition());
        }
        this.f32381.write(i);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() {
        m26951(false);
        this.f32381.flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) {
        if (!this.f32387) {
            this.f32382--;
        }
        if ((str == null && this.f32384[this.f32382 * 3] != null) || ((str != null && !str.equals(this.f32384[this.f32382 * 3])) || !this.f32384[(this.f32382 * 3) + 2].equals(str2))) {
            StringBuilder m10501 = C3435.m10501("</{", str, l.d, str2, "> does not match start: <{");
            m10501.append(this.f32384[this.f32382 * 3]);
            m10501.append(l.d);
            throw new IllegalArgumentException(C9045.m23341(m10501, this.f32384[(this.f32382 * 3) + 2], ">"));
        }
        if (this.f32387) {
            m26951(true);
            this.f32382--;
        } else {
            if (this.f32385[this.f32382 + 1]) {
                this.f32381.write("\n");
                for (int i = 0; i < this.f32382; i++) {
                    this.f32381.write(ASN1Dump.TAB);
                }
            }
            this.f32381.write("</");
            String str3 = this.f32384[(this.f32382 * 3) + 1];
            if (!"".equals(str3)) {
                this.f32381.write(str3);
                this.f32381.write(58);
            }
            this.f32381.write(str2);
            this.f32381.write(62);
        }
        int[] iArr = this.f32388;
        int i2 = this.f32382;
        iArr[i2 + 1] = iArr[i2];
        C0168 c0168 = this.f32383;
        if (c0168 != null) {
            c0168.mo1290(str2);
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f32384[(getDepth() * 3) - 3];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f32384[(getDepth() * 3) - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        return this.f32387 ? this.f32382 + 1 : this.f32382;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) {
        m26951(false);
        this.f32385[this.f32382] = false;
        C0168 c0168 = this.f32383;
        if (c0168 != null) {
            boolean m1295 = c0168.m1295();
            c0168.text(str);
            if (!m1295) {
                c0168.m1299(this.f32381.m41741(), this.f32381.m41740(), this.f32381.getPosition());
            }
        }
        m26950(-1, str);
        if (c0168 != null) {
            c0168.m1298(this.f32381.getPosition());
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) {
        text(new String(cArr, i, i2));
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) {
        m26951(false);
        this.f32381.write("<![CDATA[");
        this.f32381.write(str);
        this.f32381.write("]]>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) {
        m26951(false);
        this.f32381.write("<!--");
        this.f32381.write(str);
        this.f32381.write("-->");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) {
        m26951(false);
        this.f32381.write("<?");
        this.f32381.write(str);
        this.f32381.write("?>");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19220 m26953() {
        C0168 c0168 = this.f32383;
        C11003.requireNonNull(c0168);
        return c0168.m1287();
    }
}
