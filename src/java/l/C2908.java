package l;

import android.graphics.Matrix;
import android.util.Xml;
import com.alipay.sdk.m.p.a;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.prng.X931RNG;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: KB7N */
/* renamed from: l.ۗ֨ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2908 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f9259;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f9262;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f9267;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C16312 f9260 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC3738 f9258 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f9264 = false;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f9266 = false;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC21958 f9268 = null;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public StringBuilder f9263 = null;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f9265 = false;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public StringBuilder f9261 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16312 m8890(InputStream inputStream, boolean z) {
        this.f9259 = z;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            m8878(inputStream);
            if (z && !this.f9267) {
                throw new C19136("SVG root element is missing");
            }
            return this.f9260;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m8878(InputStream inputStream) {
        String text;
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                C4319 c4319 = new C4319(newPullParser);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        this.f9260 = new C16312();
                        this.f9267 = false;
                    } else if (eventType == 8) {
                        newPullParser.getText();
                        C19842 c19842 = new C19842(newPullParser.getText());
                        String m45650 = c19842.m45650();
                        m8884(c19842);
                        m45650.equals("xml-stylesheet");
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            m8855(newPullParser.getNamespace(), newPullParser.getName(), name, c4319);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            m8854(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            m8871(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            m8883(newPullParser.getText());
                        } else if (eventType == 6 && (text = newPullParser.getText()) != null) {
                            m8883(text);
                        }
                    } else if (this.f9260.m38409() == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            inputStream.reset();
                            m8852(inputStream);
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                }
            } catch (XmlPullParserException e) {
                throw new C19136("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new C19136("Stream error", e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8852(InputStream inputStream) {
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            if (this.f9259) {
                newInstance.setNamespaceAware(true);
            }
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            C14901 c14901 = new C14901(this);
            xMLReader.setContentHandler(c14901);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c14901);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new C19136("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new C19136("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new C19136("SVG parse error", e3);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8858(C2908 c2908) {
        c2908.f9260 = new C16312();
        c2908.f9267 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04bd, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0689, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x09c5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012f, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x0c04, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0907 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m8855(java.lang.String r22, java.lang.String r23, java.lang.String r24, org.xml.sax.Attributes r25) {
        /*
            Method dump skipped, instructions count: 3684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2908.m8855(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m8883(String str) {
        if (this.f9264) {
            return;
        }
        if (this.f9266) {
            if (this.f9263 == null) {
                this.f9263 = new StringBuilder(str.length());
            }
            this.f9263.append(str);
        } else if (this.f9265) {
            if (this.f9261 == null) {
                this.f9261 = new StringBuilder(str.length());
            }
            this.f9261.append(str);
        } else if (this.f9258 instanceof AbstractC10088) {
            m8853(str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8871(char[] cArr, int i, int i2) {
        if (this.f9264) {
            return;
        }
        if (this.f9266) {
            if (this.f9263 == null) {
                this.f9263 = new StringBuilder(i2);
            }
            this.f9263.append(cArr, i, i2);
        } else if (this.f9265) {
            if (this.f9261 == null) {
                this.f9261 = new StringBuilder(i2);
            }
            this.f9261.append(cArr, i, i2);
        } else if (this.f9258 instanceof AbstractC10088) {
            m8853(new String(cArr, i, i2));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8853(String str) {
        AbstractC15731 abstractC15731 = (AbstractC15731) this.f9258;
        int size = abstractC15731.f48531.size();
        C5149 c5149 = size == 0 ? null : (C5149) abstractC15731.f48531.get(size - 1);
        if (c5149 instanceof C13614) {
            C13614 c13614 = (C13614) c5149;
            c13614.f40613 = C9045.m23341(new StringBuilder(), c13614.f40613, str);
        } else {
            InterfaceC3738 interfaceC3738 = this.f9258;
            C13614 c136142 = new C13614();
            c136142.f40613 = str;
            interfaceC3738.mo7197(c136142);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m8854(String str, String str2, String str3) {
        if (this.f9264) {
            int i = this.f9262 - 1;
            this.f9262 = i;
            if (i == 0) {
                this.f9264 = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            switch (EnumC21958.m49445(str2).ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f9258 = ((C5149) this.f9258).f16091;
                    break;
                case 5:
                case 26:
                    this.f9266 = false;
                    if (this.f9263 != null) {
                        EnumC21958 enumC21958 = this.f9268;
                        if (enumC21958 == EnumC21958.title) {
                            this.f9260.getClass();
                        } else if (enumC21958 == EnumC21958.desc) {
                            this.f9260.getClass();
                        }
                        this.f9263.setLength(0);
                        break;
                    }
                    break;
                case 21:
                    StringBuilder sb = this.f9261;
                    if (sb != null) {
                        this.f9265 = false;
                        this.f9260.m38404(new C23200(EnumC0622.screen, EnumC11912.Document).m51495(sb.toString()));
                        this.f9261.setLength(0);
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HashMap m8884(C19842 c19842) {
        HashMap hashMap = new HashMap();
        c19842.m45643();
        while (true) {
            String m45639 = c19842.m45639(false, a.h);
            if (m45639 == null) {
                return hashMap;
            }
            c19842.m45640(a.h);
            hashMap.put(m45639, c19842.m45645());
            c19842.m45643();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        continue;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m8880(org.xml.sax.Attributes r6) {
        /*
            r5 = this;
            l.ۢۚܺ r0 = new l.ۢۚܺ
            r0.<init>()
            l.ܽ֨ܺ r1 = r5.f9260
            r0.f16090 = r1
            l.ۘۚܺ r1 = r5.f9258
            r0.f16091 = r1
            m8867(r0, r6)
            m8879(r0, r6)
            m8863(r0, r6)
            m8869(r0, r6)
            r1 = 0
        L1a:
            int r2 = r6.getLength()
            if (r1 >= r2) goto L7a
            java.lang.String r2 = r6.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r6.getLocalName(r1)
            l.᩸֨ܺ r3 = l.EnumC21253.m48257(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L63
            r4 = 79
            if (r3 == r4) goto L6f
            switch(r3) {
                case 81: goto L4e;
                case 82: goto L47;
                case 83: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L6f
        L40:
            l.֨֡ܺ r2 = m8889(r2)
            r0.f28499 = r2
            goto L6f
        L47:
            l.֨֡ܺ r2 = m8889(r2)
            r0.f28500 = r2
            goto L6f
        L4e:
            l.֨֡ܺ r2 = m8889(r2)
            r0.f28498 = r2
            boolean r2 = r2.m2931()
            if (r2 != 0) goto L5b
            goto L6f
        L5b:
            l.᩵֨ܺ r6 = new l.᩵֨ܺ
            java.lang.String r0 = "Invalid <svg> element. width cannot be negative"
            r6.<init>(r0)
            throw r6
        L63:
            l.֨֡ܺ r2 = m8889(r2)
            r0.f28501 = r2
            boolean r2 = r2.m2931()
            if (r2 != 0) goto L72
        L6f:
            int r1 = r1 + 1
            goto L1a
        L72:
            l.᩵֨ܺ r6 = new l.᩵֨ܺ
            java.lang.String r0 = "Invalid <svg> element. height cannot be negative"
            r6.<init>(r0)
            throw r6
        L7a:
            l.ۘۚܺ r6 = r5.f9258
            if (r6 != 0) goto L84
            l.ܽ֨ܺ r6 = r5.f9260
            r6.m38403(r0)
            goto L87
        L84:
            r6.mo7197(r0)
        L87:
            r5.f9258 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2908.m8880(org.xml.sax.Attributes):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8870(Attributes attributes) {
        if (this.f9258 == null) {
            throw new C19136("Invalid document. Root element must be <svg>");
        }
        C23347 c23347 = new C23347();
        c23347.f16090 = this.f9260;
        c23347.f16091 = this.f9258;
        m8867((AbstractC19261) c23347, attributes);
        m8879(c23347, attributes);
        m8856((InterfaceC0063) c23347, attributes);
        m8863((InterfaceC8677) c23347, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (ordinal == 6) {
                c23347.f75015 = m8889(trim);
            } else if (ordinal == 7) {
                c23347.f75016 = m8889(trim);
            } else if (ordinal != 49) {
                continue;
            } else {
                C0769 m8889 = m8889(trim);
                c23347.f75014 = m8889;
                if (m8889.m2931()) {
                    throw new C19136("Invalid <circle> element. r cannot be negative");
                }
            }
        }
        this.f9258.mo7197(c23347);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8864(C9943 c9943, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC21253.m48257(attributes.getLocalName(i)) == EnumC21253.points) {
                C19842 c19842 = new C19842(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c19842.m45643();
                while (!c19842.m45644()) {
                    float m45648 = c19842.m45648();
                    if (Float.isNaN(m45648)) {
                        throw new C19136(C4860.m14172("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c19842.m45649();
                    float m456482 = c19842.m45648();
                    if (Float.isNaN(m456482)) {
                        throw new C19136(C4860.m14172("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c19842.m45649();
                    arrayList.add(Float.valueOf(m45648));
                    arrayList.add(Float.valueOf(m456482));
                }
                c9943.f30025 = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c9943.f30025[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8865(AbstractC11499 abstractC11499, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                abstractC11499.f34356 = m8873(trim);
            } else if (ordinal == 10) {
                abstractC11499.f34357 = m8873(trim);
            } else if (ordinal == 82) {
                abstractC11499.f34358 = m8873(trim);
            } else if (ordinal == 83) {
                abstractC11499.f34355 = m8873(trim);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8863(InterfaceC8677 interfaceC8677, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (ordinal != 73) {
                switch (ordinal) {
                    case 52:
                        C19842 c19842 = new C19842(trim);
                        HashSet hashSet = new HashSet();
                        while (!c19842.m45644()) {
                            String m45650 = c19842.m45650();
                            if (m45650.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(m45650.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            c19842.m45643();
                        }
                        interfaceC8677.mo7587(hashSet);
                        break;
                    case 53:
                        interfaceC8677.mo7586(trim);
                        break;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        C19842 c198422 = new C19842(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!c198422.m45644()) {
                            hashSet2.add(c198422.m45650());
                            c198422.m45643();
                        }
                        interfaceC8677.mo7594(hashSet2);
                        break;
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        ArrayList m8886 = m8886(trim);
                        interfaceC8677.mo7591(m8886 != null ? new HashSet(m8886) : new HashSet(0));
                        break;
                }
            } else {
                C19842 c198423 = new C19842(trim);
                HashSet hashSet3 = new HashSet();
                while (!c198423.m45644()) {
                    String m456502 = c198423.m45650();
                    int indexOf = m456502.indexOf(45);
                    if (indexOf != -1) {
                        m456502 = m456502.substring(0, indexOf);
                    }
                    hashSet3.add(new Locale(m456502, "", "").getLanguage());
                    c198423.m45643();
                }
                interfaceC8677.mo7589(hashSet3);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8857(AbstractC2181 abstractC2181, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (ordinal == 23) {
                abstractC2181.f7183 = m8874(trim);
            } else if (ordinal != 24) {
                if (ordinal != 26) {
                    if (ordinal != 60) {
                        continue;
                    } else {
                        try {
                            abstractC2181.f7182 = EnumC3592.valueOf(trim);
                        } catch (IllegalArgumentException unused) {
                            throw new C19136(C4860.m14172("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    abstractC2181.f7180 = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                abstractC2181.f7181 = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    throw new C19136("Invalid value for attribute gradientUnits");
                }
                abstractC2181.f7181 = Boolean.TRUE;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8867(AbstractC19261 abstractC19261, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC19261.f60633 = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    abstractC19261.f60631 = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new C19136(C20094.m46315("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    abstractC19261.f60631 = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m8879(AbstractC19261 abstractC19261, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int ordinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
                if (ordinal == 0) {
                    C18968 c18968 = new C18968(trim);
                    ArrayList arrayList = null;
                    while (!c18968.m45644()) {
                        String m45650 = c18968.m45650();
                        if (m45650 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(m45650);
                            c18968.m45643();
                        }
                    }
                    abstractC19261.f60634 = arrayList;
                } else if (ordinal != 72) {
                    if (abstractC19261.f60632 == null) {
                        abstractC19261.f60632 = new C20672();
                    }
                    m8868(abstractC19261.f60632, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    m8866(abstractC19261, trim, false);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8866(AbstractC19261 abstractC19261, String str, boolean z) {
        C19842 c19842 = new C19842(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String m45639 = c19842.m45639(false, ':');
            c19842.m45643();
            if (!c19842.m45640(':')) {
                return;
            }
            c19842.m45643();
            String m456392 = c19842.m45639(true, ';');
            if (m456392 == null) {
                return;
            }
            c19842.m45643();
            if (c19842.m45644() || c19842.m45640(';')) {
                if (!z || m8881(m45639)) {
                    if (abstractC19261.f60635 == null) {
                        abstractC19261.f60635 = new C20672();
                    }
                    m8868(abstractC19261.f60635, m45639, m456392);
                }
                c19842.m45643();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m8881(String str) {
        int ordinal = EnumC21253.m48257(str).ordinal();
        if (ordinal == 2 || ordinal == 15 || ordinal == 35 || ordinal == 64) {
            return true;
        }
        switch (ordinal) {
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8868(C20672 c20672, String str, String str2) {
        C0769 c0769;
        C0769 m45647;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int ordinal = EnumC21253.m48257(str).ordinal();
        C14174 c14174 = null;
        C0769 c07692 = null;
        EnumC7120 enumC7120 = null;
        EnumC16437 enumC16437 = null;
        EnumC10794 enumC10794 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        C0769[] c0769Arr = null;
        EnumC17849 enumC17849 = null;
        EnumC1621 enumC1621 = null;
        String str3 = null;
        EnumC7120 enumC71202 = null;
        EnumC14320 enumC14320 = null;
        EnumC17143 enumC17143 = null;
        EnumC6560 enumC6560 = null;
        Boolean bool = null;
        EnumC23493 enumC23493 = null;
        c14174 = null;
        c14174 = null;
        if (ordinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                C19842 c19842 = new C19842(str2.substring(5));
                c19842.m45643();
                C0769 m8877 = m8877(c19842);
                c19842.m45649();
                C0769 m88772 = m8877(c19842);
                c19842.m45649();
                C0769 m88773 = m8877(c19842);
                c19842.m45649();
                C0769 m88774 = m8877(c19842);
                c19842.m45643();
                if (c19842.m45640(')') || c19842.m45644()) {
                    c14174 = new C14174();
                    c14174.f42807 = m8877;
                    c14174.f42806 = m88772;
                    c14174.f42804 = m88773;
                    c14174.f42805 = m88774;
                }
            }
            c20672.f66609 = c14174;
            if (c14174 != null) {
                c20672.f66591 |= 1048576;
                return;
            }
            return;
        }
        if (ordinal == 2) {
            c20672.f66611 = m8882(str2);
            c20672.f66591 |= 268435456;
            return;
        }
        if (ordinal == 4) {
            if ("nonzero".equals(str2)) {
                enumC7120 = EnumC7120.NonZero;
            } else if ("evenodd".equals(str2)) {
                enumC7120 = EnumC7120.EvenOdd;
            }
            c20672.f66606 = enumC7120;
            c20672.f66591 |= 536870912;
            return;
        }
        try {
            if (ordinal == 5) {
                c20672.f66583 = m8885(str2);
                c20672.f66591 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                return;
            }
            if (ordinal == 8) {
                if (str2.equals("ltr")) {
                    enumC23493 = EnumC23493.LTR;
                } else if (str2.equals("rtl")) {
                    enumC23493 = EnumC23493.RTL;
                }
                c20672.f66580 = enumC23493;
                if (enumC23493 != null) {
                    c20672.f66591 |= 68719476736L;
                    return;
                }
                return;
            }
            if (ordinal == 35) {
                c20672.f66602 = m8882(str2);
                c20672.f66591 |= 1073741824;
                return;
            }
            if (ordinal == 40) {
                c20672.f66598 = m8888(str2);
                c20672.f66591 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                return;
            }
            if (ordinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                }
                c20672.f66614 = bool;
                if (bool != null) {
                    c20672.f66591 |= 524288;
                    return;
                }
                return;
            }
            if (ordinal == 78) {
                if (str2.equals("none")) {
                    enumC6560 = EnumC6560.None;
                } else if (str2.equals("non-scaling-stroke")) {
                    enumC6560 = EnumC6560.NonScalingStroke;
                }
                c20672.f66612 = enumC6560;
                if (enumC6560 != null) {
                    c20672.f66591 |= 34359738368L;
                    return;
                }
                return;
            }
            if (ordinal == 58) {
                if (str2.equals("currentColor")) {
                    c20672.f66587 = C9237.m23679();
                } else {
                    try {
                        c20672.f66587 = m8885(str2);
                    } catch (C19136 e) {
                        e.getMessage();
                        return;
                    }
                }
                c20672.f66591 |= 2147483648L;
                return;
            }
            if (ordinal == 59) {
                c20672.f66608 = m8888(str2);
                c20672.f66591 |= Blake2xsDigest.MAX_NUMBER_BLOCKS;
                return;
            }
            if (ordinal == 74) {
                switch (str2) {
                    case "middle":
                        enumC17143 = EnumC17143.Middle;
                        break;
                    case "end":
                        enumC17143 = EnumC17143.End;
                        break;
                    case "start":
                        enumC17143 = EnumC17143.Start;
                        break;
                }
                c20672.f66599 = enumC17143;
                if (enumC17143 != null) {
                    c20672.f66591 |= 262144;
                    return;
                }
                return;
            }
            if (ordinal != 75) {
                switch (ordinal) {
                    case 14:
                        if (str2.indexOf(124) < 0) {
                            if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                                c20672.f66596 = Boolean.valueOf(!str2.equals("none"));
                                c20672.f66591 |= 16777216;
                                break;
                            }
                        }
                        break;
                    case 15:
                        AbstractC0915 m8875 = m8875(str2);
                        c20672.f66595 = m8875;
                        if (m8875 != null) {
                            c20672.f66591 |= 1;
                            break;
                        }
                        break;
                    case 16:
                        if ("nonzero".equals(str2)) {
                            enumC71202 = EnumC7120.NonZero;
                        } else if ("evenodd".equals(str2)) {
                            enumC71202 = EnumC7120.EvenOdd;
                        }
                        c20672.f66586 = enumC71202;
                        if (enumC71202 != null) {
                            c20672.f66591 |= 2;
                            break;
                        }
                        break;
                    case 17:
                        Float m8888 = m8888(str2);
                        c20672.f66592 = m8888;
                        if (m8888 != null) {
                            c20672.f66591 |= 4;
                            break;
                        }
                        break;
                    case 18:
                        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                            C19842 c198422 = new C19842(str2);
                            Integer num = null;
                            EnumC1621 enumC16212 = null;
                            String str4 = null;
                            while (true) {
                                String m45639 = c198422.m45639(false, '/');
                                c198422.m45643();
                                if (m45639 != null) {
                                    if (num == null || enumC16212 == null) {
                                        if (!m45639.equals("normal") && (num != null || (num = C7846.m21029(m45639)) == null)) {
                                            if (enumC16212 == null) {
                                                switch (m45639) {
                                                    case "oblique":
                                                        enumC16212 = EnumC1621.Oblique;
                                                        break;
                                                    case "italic":
                                                        enumC16212 = EnumC1621.Italic;
                                                        break;
                                                    case "normal":
                                                        enumC16212 = EnumC1621.Normal;
                                                        break;
                                                    default:
                                                        enumC16212 = null;
                                                        break;
                                                }
                                                if (enumC16212 != null) {
                                                    continue;
                                                }
                                            }
                                            if (str4 == null && m45639.equals("small-caps")) {
                                                str4 = m45639;
                                            }
                                        }
                                    }
                                    try {
                                        c0769 = C0790.m2994(m45639);
                                        if (c0769 == null) {
                                            c0769 = m8889(m45639);
                                        }
                                    } catch (C19136 unused) {
                                        c0769 = null;
                                    }
                                    if (c198422.m45640('/')) {
                                        c198422.m45643();
                                        String m45650 = c198422.m45650();
                                        if (m45650 != null) {
                                            m8889(m45650);
                                        }
                                        c198422.m45643();
                                    }
                                    if (!c198422.m45644()) {
                                        int i = c198422.f64103;
                                        c198422.f64103 = c198422.f64101;
                                        str3 = c198422.f64100.substring(i);
                                    }
                                    c20672.f66594 = m8886(str3);
                                    c20672.f66613 = c0769;
                                    c20672.f66588 = Integer.valueOf(num == null ? 400 : num.intValue());
                                    if (enumC16212 == null) {
                                        enumC16212 = EnumC1621.Normal;
                                    }
                                    c20672.f66597 = enumC16212;
                                    c20672.f66591 |= 122880;
                                    break;
                                } else {
                                    break;
                                }
                            }
                        }
                        break;
                    case 19:
                        ArrayList m8886 = m8886(str2);
                        c20672.f66594 = m8886;
                        if (m8886 != null) {
                            c20672.f66591 |= 8192;
                            break;
                        }
                        break;
                    case 20:
                        try {
                            C0769 m2994 = C0790.m2994(str2);
                            c07692 = m2994 == null ? m8889(str2) : m2994;
                        } catch (C19136 unused2) {
                        }
                        c20672.f66613 = c07692;
                        if (c07692 != null) {
                            c20672.f66591 |= 16384;
                            break;
                        }
                        break;
                    case 21:
                        Integer m21029 = C7846.m21029(str2);
                        c20672.f66588 = m21029;
                        if (m21029 != null) {
                            c20672.f66591 |= X931RNG.BLOCK64_RESEED_MAX;
                            break;
                        }
                        break;
                    case 22:
                        switch (str2) {
                            case "oblique":
                                enumC1621 = EnumC1621.Oblique;
                                break;
                            case "italic":
                                enumC1621 = EnumC1621.Italic;
                                break;
                            case "normal":
                                enumC1621 = EnumC1621.Normal;
                                break;
                        }
                        c20672.f66597 = enumC1621;
                        if (enumC1621 != null) {
                            c20672.f66591 |= 65536;
                            break;
                        }
                        break;
                    default:
                        switch (ordinal) {
                            case 27:
                                switch (str2) {
                                    case "optimizeQuality":
                                        enumC17849 = EnumC17849.optimizeQuality;
                                        break;
                                    case "auto":
                                        enumC17849 = EnumC17849.auto;
                                        break;
                                    case "optimizeSpeed":
                                        enumC17849 = EnumC17849.optimizeSpeed;
                                        break;
                                }
                                c20672.f66578 = enumC17849;
                                if (enumC17849 != null) {
                                    c20672.f66591 |= 137438953472L;
                                    break;
                                }
                                break;
                            case 28:
                                String m8882 = m8882(str2);
                                c20672.f66603 = m8882;
                                c20672.f66601 = m8882;
                                c20672.f66593 = m8882;
                                c20672.f66591 |= 14680064;
                                break;
                            case 29:
                                c20672.f66603 = m8882(str2);
                                c20672.f66591 |= 2097152;
                                break;
                            case 30:
                                c20672.f66601 = m8882(str2);
                                c20672.f66591 |= 4194304;
                                break;
                            case 31:
                                c20672.f66593 = m8882(str2);
                                c20672.f66591 |= X931RNG.BLOCK128_RESEED_MAX;
                                break;
                            default:
                                switch (ordinal) {
                                    case 62:
                                        if (str2.equals("currentColor")) {
                                            c20672.f66590 = C9237.m23679();
                                        } else {
                                            try {
                                                c20672.f66590 = m8885(str2);
                                            } catch (C19136 e2) {
                                                e2.getMessage();
                                                return;
                                            }
                                        }
                                        c20672.f66591 |= 67108864;
                                        break;
                                    case 63:
                                        c20672.f66600 = m8888(str2);
                                        c20672.f66591 |= 134217728;
                                        break;
                                    case 64:
                                        AbstractC0915 m88752 = m8875(str2);
                                        c20672.f66579 = m88752;
                                        if (m88752 != null) {
                                            c20672.f66591 |= 8;
                                            break;
                                        }
                                        break;
                                    case 65:
                                        if ("none".equals(str2)) {
                                            c20672.f66582 = null;
                                            c20672.f66591 |= 512;
                                            break;
                                        } else {
                                            C19842 c198423 = new C19842(str2);
                                            c198423.m45643();
                                            if (!c198423.m45644() && (m45647 = c198423.m45647()) != null && !m45647.m2931()) {
                                                float f = m45647.f2855;
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(m45647);
                                                while (true) {
                                                    if (!c198423.m45644()) {
                                                        c198423.m45649();
                                                        C0769 m456472 = c198423.m45647();
                                                        if (m456472 != null && !m456472.m2931()) {
                                                            arrayList.add(m456472);
                                                            f += m456472.f2855;
                                                        }
                                                    } else if (f != 0.0f) {
                                                        c0769Arr = (C0769[]) arrayList.toArray(new C0769[arrayList.size()]);
                                                    }
                                                }
                                            }
                                            c20672.f66582 = c0769Arr;
                                            if (c0769Arr != null) {
                                                c20672.f66591 |= 512;
                                                break;
                                            }
                                        }
                                        break;
                                    case 66:
                                        c20672.f66604 = m8889(str2);
                                        c20672.f66591 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
                                        break;
                                    case 67:
                                        if ("butt".equals(str2)) {
                                            enumC10794 = EnumC10794.Butt;
                                        } else if ("round".equals(str2)) {
                                            enumC10794 = EnumC10794.Round;
                                        } else if ("square".equals(str2)) {
                                            enumC10794 = EnumC10794.Square;
                                        }
                                        c20672.f66605 = enumC10794;
                                        if (enumC10794 != null) {
                                            c20672.f66591 |= 64;
                                            break;
                                        }
                                        break;
                                    case 68:
                                        if ("miter".equals(str2)) {
                                            enumC16437 = EnumC16437.Miter;
                                        } else if ("round".equals(str2)) {
                                            enumC16437 = EnumC16437.Round;
                                        } else if ("bevel".equals(str2)) {
                                            enumC16437 = EnumC16437.Bevel;
                                        }
                                        c20672.f66576 = enumC16437;
                                        if (enumC16437 != null) {
                                            c20672.f66591 |= 128;
                                            break;
                                        }
                                        break;
                                    case 69:
                                        c20672.f66585 = Float.valueOf(m8887(str2));
                                        c20672.f66591 |= 256;
                                        break;
                                    case 70:
                                        Float m88882 = m8888(str2);
                                        c20672.f66577 = m88882;
                                        if (m88882 != null) {
                                            c20672.f66591 |= 16;
                                            break;
                                        }
                                        break;
                                    case 71:
                                        c20672.f66589 = m8889(str2);
                                        c20672.f66591 |= 32;
                                        break;
                                    default:
                                        switch (ordinal) {
                                            case 88:
                                                if (str2.equals("currentColor")) {
                                                    c20672.f66607 = C9237.m23679();
                                                } else {
                                                    try {
                                                        c20672.f66607 = m8885(str2);
                                                    } catch (C19136 e3) {
                                                        e3.getMessage();
                                                        return;
                                                    }
                                                }
                                                c20672.f66591 |= 8589934592L;
                                                break;
                                            case 89:
                                                c20672.f66584 = m8888(str2);
                                                c20672.f66591 |= 17179869184L;
                                                break;
                                            case 90:
                                                if (str2.indexOf(124) < 0) {
                                                    if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                        c20672.f66581 = Boolean.valueOf(str2.equals("visible"));
                                                        c20672.f66591 |= 33554432;
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                }
                        }
                }
                return;
            }
            switch (str2) {
                case "line-through":
                    enumC14320 = EnumC14320.LineThrough;
                    break;
                case "underline":
                    enumC14320 = EnumC14320.Underline;
                    break;
                case "none":
                    enumC14320 = EnumC14320.None;
                    break;
                case "blink":
                    enumC14320 = EnumC14320.Blink;
                    break;
                case "overline":
                    enumC14320 = EnumC14320.Overline;
                    break;
            }
            c20672.f66610 = enumC14320;
            if (enumC14320 != null) {
                c20672.f66591 |= 131072;
            }
        } catch (C19136 unused3) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8869(AbstractC21377 abstractC21377, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC21253.m48257(attributes.getLocalName(i)).ordinal();
            if (ordinal == 48) {
                m8862(abstractC21377, trim);
            } else if (ordinal != 80) {
                continue;
            } else {
                C19842 c19842 = new C19842(trim);
                c19842.m45643();
                float m45648 = c19842.m45648();
                c19842.m45649();
                float m456482 = c19842.m45648();
                c19842.m45649();
                float m456483 = c19842.m45648();
                c19842.m45649();
                float m456484 = c19842.m45648();
                if (Float.isNaN(m45648) || Float.isNaN(m456482) || Float.isNaN(m456483) || Float.isNaN(m456484)) {
                    throw new C19136("Invalid viewBox definition - should have four numbers");
                }
                if (m456483 < 0.0f) {
                    throw new C19136("Invalid viewBox. width cannot be negative");
                }
                if (m456484 >= 0.0f) {
                    abstractC21377.f68869 = new C16997(m45648, m456482, m456483, m456484);
                } else {
                    throw new C19136("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8856(InterfaceC0063 interfaceC0063, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC21253.m48257(attributes.getLocalName(i)) == EnumC21253.transform) {
                interfaceC0063.mo1005(m8874(attributes.getValue(i)));
            }
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static Matrix m8874(String str) {
        Matrix matrix = new Matrix();
        C19842 c19842 = new C19842(str);
        c19842.m45643();
        while (!c19842.m45644()) {
            String str2 = c19842.f64100;
            String str3 = null;
            if (!c19842.m45644()) {
                int i = c19842.f64103;
                int charAt = str2.charAt(i);
                while (true) {
                    if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                        charAt = c19842.m45637();
                    }
                }
                int i2 = c19842.f64103;
                while (C19842.m45635(charAt)) {
                    charAt = c19842.m45637();
                }
                if (charAt == 40) {
                    c19842.f64103++;
                    str3 = str2.substring(i, i2);
                } else {
                    c19842.f64103 = i;
                }
            }
            if (str3 == null) {
                throw new C19136("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (str3) {
                case "matrix":
                    c19842.m45643();
                    float m45648 = c19842.m45648();
                    c19842.m45649();
                    float m456482 = c19842.m45648();
                    c19842.m45649();
                    float m456483 = c19842.m45648();
                    c19842.m45649();
                    float m456484 = c19842.m45648();
                    c19842.m45649();
                    float m456485 = c19842.m45648();
                    c19842.m45649();
                    float m456486 = c19842.m45648();
                    c19842.m45643();
                    if (!Float.isNaN(m456486) && c19842.m45640(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{m45648, m456483, m456485, m456482, m456484, m456486, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                case "rotate":
                    c19842.m45643();
                    float m456487 = c19842.m45648();
                    c19842.m45649();
                    float m456488 = c19842.m45648();
                    c19842.m45649();
                    float m456489 = c19842.m45648();
                    c19842.m45643();
                    if (Float.isNaN(m456487) || !c19842.m45640(')')) {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(m456488)) {
                        matrix.preRotate(m456487);
                        break;
                    } else if (!Float.isNaN(m456489)) {
                        matrix.preRotate(m456487, m456488, m456489);
                        break;
                    } else {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    break;
                case "scale":
                    c19842.m45643();
                    float m4564810 = c19842.m45648();
                    c19842.m45649();
                    float m4564811 = c19842.m45648();
                    c19842.m45643();
                    if (!Float.isNaN(m4564810) && c19842.m45640(')')) {
                        if (!Float.isNaN(m4564811)) {
                            matrix.preScale(m4564810, m4564811);
                            break;
                        } else {
                            matrix.preScale(m4564810, m4564810);
                            break;
                        }
                    } else {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewX":
                    c19842.m45643();
                    float m4564812 = c19842.m45648();
                    c19842.m45643();
                    if (!Float.isNaN(m4564812) && c19842.m45640(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(m4564812)), 0.0f);
                        break;
                    } else {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    c19842.m45643();
                    float m4564813 = c19842.m45648();
                    c19842.m45643();
                    if (!Float.isNaN(m4564813) && c19842.m45640(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(m4564813)));
                        break;
                    } else {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    break;
                case "translate":
                    c19842.m45643();
                    float m4564814 = c19842.m45648();
                    c19842.m45649();
                    float m4564815 = c19842.m45648();
                    c19842.m45643();
                    if (!Float.isNaN(m4564814) && c19842.m45640(')')) {
                        if (!Float.isNaN(m4564815)) {
                            matrix.preTranslate(m4564814, m4564815);
                            break;
                        } else {
                            matrix.preTranslate(m4564814, 0.0f);
                            break;
                        }
                    } else {
                        throw new C19136("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new C19136(C4860.m14172("Invalid transform list fn: ", str3, MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (c19842.m45644()) {
                return matrix;
            }
            c19842.m45649();
        }
        return matrix;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C0769 m8889(String str) {
        if (str.length() == 0) {
            throw new C19136("Invalid length value (empty string)");
        }
        int length = str.length();
        EnumC7265 enumC7265 = EnumC7265.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            enumC7265 = EnumC7265.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                enumC7265 = EnumC7265.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C19136("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new C0769(m8848(length, str), enumC7265);
        } catch (NumberFormatException e) {
            throw new C19136("Invalid length value: ".concat(str), e);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8873(String str) {
        if (str.length() == 0) {
            throw new C19136("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C19842 c19842 = new C19842(str);
        c19842.m45643();
        while (!c19842.m45644()) {
            float m45648 = c19842.m45648();
            if (Float.isNaN(m45648)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = c19842.f64100;
                int i = c19842.f64103;
                while (!c19842.m45644() && !C19842.m45635((int) str2.charAt(c19842.f64103))) {
                    c19842.f64103++;
                }
                String substring = str2.substring(i, c19842.f64103);
                c19842.f64103 = i;
                sb.append(substring);
                throw new C19136(sb.toString());
            }
            EnumC7265 m45642 = c19842.m45642();
            if (m45642 == null) {
                m45642 = EnumC7265.px;
            }
            arrayList.add(new C0769(m45648, m45642));
            c19842.m45649();
        }
        return arrayList;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static float m8887(String str) {
        int length = str.length();
        if (length == 0) {
            throw new C19136("Invalid float value (empty string)");
        }
        return m8848(length, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m8848(int i, String str) {
        float m20562 = new C7678().m20562(0, i, 0, str);
        if (Float.isNaN(m20562)) {
            throw new C19136(C20094.m46315("Invalid float value: ", str));
        }
        return m20562;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Float m8888(String str) {
        try {
            float m8887 = m8887(str);
            if (m8887 < 0.0f) {
                m8887 = 0.0f;
            } else if (m8887 > 1.0f) {
                m8887 = 1.0f;
            }
            return Float.valueOf(m8887);
        } catch (C19136 unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8862(AbstractC7971 abstractC7971, String str) {
        EnumC10648 enumC10648;
        C19842 c19842 = new C19842(str);
        c19842.m45643();
        String m45650 = c19842.m45650();
        if ("defer".equals(m45650)) {
            c19842.m45643();
            m45650 = c19842.m45650();
        }
        EnumC1475 m1044 = C0084.m1044(m45650);
        c19842.m45643();
        if (c19842.m45644()) {
            enumC10648 = null;
        } else {
            String m456502 = c19842.m45650();
            m456502.getClass();
            if (m456502.equals("meet")) {
                enumC10648 = EnumC10648.meet;
            } else if (m456502.equals("slice")) {
                enumC10648 = EnumC10648.slice;
            } else {
                throw new C19136("Invalid preserveAspectRatio definition: ".concat(str));
            }
        }
        abstractC7971.f24627 = new C16291(m1044, enumC10648);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC0915 m8875(String str) {
        boolean startsWith = str.startsWith("url(");
        AbstractC0915 abstractC0915 = C20526.f66137;
        AbstractC0915 abstractC09152 = null;
        if (startsWith) {
            int indexOf = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_END);
            if (indexOf != -1) {
                String trim = str.substring(4, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim2.length() > 0) {
                    if (!trim2.equals("none")) {
                        if (trim2.equals("currentColor")) {
                            abstractC0915 = C9237.m23679();
                        } else {
                            try {
                                abstractC0915 = m8885(trim2);
                            } catch (C19136 unused) {
                                abstractC0915 = null;
                            }
                        }
                    }
                    abstractC09152 = abstractC0915;
                }
                return new C19821(trim, abstractC09152);
            }
            return new C19821(str.substring(4).trim(), null);
        }
        if (str.equals("none")) {
            return abstractC0915;
        }
        if (str.equals("currentColor")) {
            return C9237.m23679();
        }
        try {
            return m8885(str);
        } catch (C19136 unused2) {
            return null;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C20526 m8885(String str) {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C14027 c14027 = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j = j2 * 16;
                            i = charAt - 'A';
                        } else {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = charAt - 'a';
                        }
                        j2 = j + i + 10;
                    } else {
                        j2 = (j2 * 16) + (charAt - '0');
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    c14027 = new C14027(i2, j2);
                }
            }
            if (c14027 == null) {
                throw new C19136("Bad hex colour value: ".concat(str));
            }
            int m33643 = c14027.m33643();
            if (m33643 == 4) {
                int m33644 = c14027.m33644();
                int i3 = m33644 & 3840;
                int i4 = m33644 & 240;
                int i5 = m33644 & 15;
                return new C20526(i5 | (i3 << 8) | (-16777216) | (i3 << 12) | (i4 << 8) | (i4 << 4) | (i5 << 4));
            }
            if (m33643 != 5) {
                if (m33643 == 7) {
                    return new C20526(c14027.m33644() | (-16777216));
                }
                if (m33643 == 9) {
                    return new C20526((c14027.m33644() << 24) | (c14027.m33644() >>> 8));
                }
                throw new C19136("Bad hex colour value: ".concat(str));
            }
            int m336442 = c14027.m33644();
            int i6 = 61440 & m336442;
            int i7 = m336442 & 3840;
            int i8 = m336442 & 240;
            int i9 = m336442 & 15;
            return new C20526((i9 << 24) | (i9 << 28) | (i6 << 8) | (i6 << 4) | (i7 << 4) | i7 | i8 | (i8 >> 4));
        }
        boolean m8872 = m8872(str, "rgba(");
        if (m8872 || m8872(str, "rgb(")) {
            C19842 c19842 = new C19842(str, m8872 ? 5 : 4);
            c19842.m45643();
            float m45648 = c19842.m45648();
            if (!Float.isNaN(m45648) && c19842.m45640('%')) {
                m45648 = (m45648 * 256.0f) / 100.0f;
            }
            float m45636 = c19842.m45636(m45648);
            if (!Float.isNaN(m45636) && c19842.m45640('%')) {
                m45636 = (m45636 * 256.0f) / 100.0f;
            }
            float m456362 = c19842.m45636(m45636);
            if (!Float.isNaN(m456362) && c19842.m45640('%')) {
                m456362 = (m456362 * 256.0f) / 100.0f;
            }
            if (!m8872) {
                c19842.m45643();
                if (Float.isNaN(m456362) || !c19842.m45640(')')) {
                    throw new C19136("Bad rgb() colour value: ".concat(str));
                }
                return new C20526((m8849(m45648) << 16) | (-16777216) | (m8849(m45636) << 8) | m8849(m456362));
            }
            float m456363 = c19842.m45636(m456362);
            c19842.m45643();
            if (Float.isNaN(m456363) || !c19842.m45640(')')) {
                throw new C19136("Bad rgba() colour value: ".concat(str));
            }
            return new C20526((m8849(m456363 * 256.0f) << 24) | (m8849(m45648) << 16) | (m8849(m45636) << 8) | m8849(m456362));
        }
        boolean m88722 = m8872(str, "hsla(");
        if (!m88722 && !m8872(str, "hsl(")) {
            String lowerCase = str.toLowerCase(Locale.US);
            Integer m14518 = C5024.m14518(lowerCase);
            if (m14518 != null) {
                return new C20526(m14518.intValue());
            }
            throw new C19136(C20094.m46315("Invalid colour keyword: ", lowerCase));
        }
        C19842 c198422 = new C19842(str, m88722 ? 5 : 4);
        c198422.m45643();
        float m456482 = c198422.m45648();
        float m456364 = c198422.m45636(m456482);
        if (!Float.isNaN(m456364)) {
            c198422.m45640('%');
        }
        float m456365 = c198422.m45636(m456364);
        if (!Float.isNaN(m456365)) {
            c198422.m45640('%');
        }
        if (!m88722) {
            c198422.m45643();
            if (Float.isNaN(m456365) || !c198422.m45640(')')) {
                throw new C19136("Bad hsl() colour value: ".concat(str));
            }
            return new C20526(m8850(m456482, m456364, m456365) | (-16777216));
        }
        float m456366 = c198422.m45636(m456365);
        c198422.m45643();
        if (Float.isNaN(m456366) || !c198422.m45640(')')) {
            throw new C19136("Bad hsla() colour value: ".concat(str));
        }
        return new C20526((m8849(m456366 * 256.0f) << 24) | m8850(m456482, m456364, m456365));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8872(String str, String str2) {
        if (str.length() >= str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = (char) (charAt + ' ');
                }
                if (charAt == str2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8849(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8850(float f, float f2, float f3) {
        float f4 = f % 360.0f;
        if (f < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f8 = f7 >= 0.0f ? f7 > 1.0f ? 1.0f : f7 : 0.0f;
        float f9 = f8 <= 0.5f ? (f6 + 1.0f) * f8 : (f8 + f6) - (f6 * f8);
        float f10 = (f8 * 2.0f) - f9;
        return m8849(m8876(f10, f9, f5 - 2.0f) * 256.0f) | (m8849(m8876(f10, f9, f5 + 2.0f) * 256.0f) << 16) | (m8849(m8876(f10, f9, f5) * 256.0f) << 8);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m8876(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return C20382.m46695(f2, f, f3, f);
        }
        return f3 < 3.0f ? f2 : f3 < 4.0f ? C20382.m46695(4.0f, f3, f2 - f, f) : f;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8886(String str) {
        C19842 c19842 = new C19842(str);
        ArrayList arrayList = null;
        do {
            String m45645 = c19842.m45645();
            if (m45645 == null) {
                m45645 = c19842.m45639(true, ',');
            }
            if (m45645 == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(m45645);
            c19842.m45649();
        } while (!c19842.m45644());
        return arrayList;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C0769 m8877(C19842 c19842) {
        if (c19842.m45641("auto")) {
            return new C0769(0.0f);
        }
        return c19842.m45647();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m8882(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }
}
