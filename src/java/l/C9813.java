package l;

import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* compiled from: BBKO */
/* renamed from: l.ۢ᩶ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9813 {

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Logger f29650 = Logger.getLogger("SvgTree");

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C11224 f29656;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f29659;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DecimalFormat f29661;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f29662;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f29663;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float[] f29665;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f29651 = -1.0f;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f29652 = -1.0f;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0639 f29660 = new C0639();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f29653 = 1.0f;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f29666 = new ArrayList();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f29667 = new HashMap();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f29655 = new HashSet();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final HashSet f29657 = new HashSet();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f29658 = new LinkedHashMap();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f29654 = new HashMap();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f29664 = new HashMap();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float m24863() {
        return this.f29651;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m24869() {
        return this.f29652;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m24870() {
        this.f29659 = true;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m24862() {
        this.f29662 = true;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] m24877() {
        return this.f29665;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24865() {
        this.f29656.mo6733(new C0639());
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24860() {
        this.f29656.mo27793();
        if (!this.f29666.isEmpty() || this.f29659) {
            return;
        }
        m24854("No vector content found", (Node) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Document m24849(String str, ArrayList arrayList, byte[] bArr) {
        this.f29663 = str;
        try {
            return C4873.m14231(arrayList, bArr);
        } catch (ParserConfigurationException e) {
            throw new Error("Internal error", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24850() {
        f29650.log(Level.FINE, "file: " + this.f29663);
        this.f29656.mo6731("");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24866(C11224 c11224) {
        this.f29656 = c11224;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24854(String str, Node node) {
        m24855(str, node, EnumC21102.ERROR);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24855(String str, Node node, EnumC21102 enumC21102) {
        C4025.m12110(!str.isEmpty());
        this.f29666.add(new C23923(enumC21102, node == null ? 0 : C4873.m14230(node).m10600() + 1, str));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m24875() {
        ArrayList arrayList = this.f29666;
        if (arrayList.isEmpty()) {
            return "";
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C23923 c23923 = (C23923) it.next();
            if (sb.length() != 0) {
                sb.append('\n');
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c23923.f77595.name());
            int i = c23923.f77596;
            sb2.append(i == 0 ? "" : C19370.m44628(i, " @ line "));
            sb2.append(": ");
            sb2.append(c23923.f77594);
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m24874() {
        return this.f29659;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final double m24873(String str) {
        return m24846(str, this.f29665 == null ? -1.0f : r0[2]);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m24868(String str) {
        return m24846(str, this.f29665 == null ? -1.0f : r0[3]);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24859(org.w3c.dom.Element r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9813.m24859(org.w3c.dom.Element):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m24846(String str, double d) {
        if (str.endsWith("%")) {
            return (Double.parseDouble(str.substring(0, str.length() - 1)) / 100.0d) * d;
        }
        return Double.parseDouble(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24867(AbstractC14750 abstractC14750, String str) {
        this.f29667.put(str, abstractC14750);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14750 m24872(String str) {
        return (AbstractC14750) this.f29667.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24856(C11224 c11224) {
        this.f29657.add(c11224);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet m24878() {
        return this.f29657;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24852(String str) {
        this.f29655.add(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m24876(String str) {
        return this.f29655.contains(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24858(AbstractC14750 abstractC14750, C11224 c11224, String str) {
        this.f29658.put(abstractC14750, Pair.create(c11224, str));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Set m24871() {
        return this.f29658.entrySet();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24857(AbstractC14750 abstractC14750, String str) {
        HashMap hashMap = this.f29654;
        if (hashMap.containsKey(str)) {
            ((Set) hashMap.get(str)).add(abstractC14750);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(abstractC14750);
        hashMap.put(str, hashSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24853(String str, String str2) {
        this.f29664.put(str, str2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m24864(String str) {
        return (String) this.f29664.get(str);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Set m24861() {
        return this.f29654.entrySet();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11224 m24848(AbstractC14750 abstractC14750) {
        return this.f29656.m27791(abstractC14750);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24847(double d) {
        if (this.f29661 == null) {
            float[] fArr = this.f29665;
            int floor = 4 - ((int) Math.floor(Math.log10(Math.max(fArr != null ? fArr[3] : -1.0f, fArr == null ? -1.0f : fArr[2]))));
            StringBuilder sb = new StringBuilder("#");
            if (floor > 0) {
                if (floor > 6) {
                    floor = 6;
                }
                sb.append('.');
                for (int i = 0; i < floor; i++) {
                    sb.append('#');
                }
            }
            DecimalFormat decimalFormat = new DecimalFormat(sb.toString(), new DecimalFormatSymbols(Locale.ROOT));
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            this.f29661 = decimalFormat;
        }
        return C3395.m10362(this.f29661.format(d));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24851(ByteArrayOutputStream byteArrayOutputStream) {
        if (this.f29656 == null) {
            throw new IllegalStateException("SvgTree is not fully initialized");
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8);
        outputStreamWriter.write("<vector xmlns:android=\"http://schemas.android.com/apk/res/android\"");
        outputStreamWriter.write("\n");
        if (this.f29662) {
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("xmlns:aapt=\"http://schemas.android.com/aapt\"");
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:width=\"");
        float f = this.f29651;
        float f2 = this.f29653;
        outputStreamWriter.write(m24847(f * f2));
        outputStreamWriter.write("dp\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:height=\"");
        outputStreamWriter.write(m24847(this.f29652 * f2));
        outputStreamWriter.write("dp\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:viewportWidth=\"");
        outputStreamWriter.write(m24847(this.f29665 == null ? -1.0f : r1[2]));
        outputStreamWriter.write("\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:viewportHeight=\"");
        outputStreamWriter.write(m24847(this.f29665 != null ? r1[3] : -1.0f));
        outputStreamWriter.write("\">");
        outputStreamWriter.write("\n");
        float[] fArr = this.f29665;
        C0639 c0639 = new C0639(-fArr[0], -fArr[1]);
        C0639 c06392 = this.f29660;
        c06392.m2611(c0639);
        this.f29656.mo6736(c06392);
        f29650.log(Level.FINE, "matrix=" + c06392);
        this.f29656.mo6730(outputStreamWriter, EnumC0121.f1143);
        outputStreamWriter.write("</vector>");
        outputStreamWriter.write("\n");
        outputStreamWriter.close();
    }
}
