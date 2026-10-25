package l;

import android.graphics.Point;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.regex.PatternSyntaxException;

/* compiled from: A4TV */
/* renamed from: l.ܶۜܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15068 extends AbstractC9693 {

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C7073 f46020 = new C7073();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f46021;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Set f46022;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f46023;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f46024;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Callable f46025;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f46026;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Map f46027;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C21834 f46028;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC6603 f46029;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C7308 f46030;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f46031;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC17186 f46032;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f46033;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f46034;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f46035;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4900 f46036;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f46037;

    @Override // l.AbstractC9693
    /* renamed from: ֫ */
    public final C15068 mo24638() {
        return this;
    }

    @Override // l.AbstractC9693
    /* renamed from: ֫ */
    public final void mo1516(C10130 c10130) {
        String str;
        c10130.mo13231(20224);
        c10130.m25436();
        c10130.m25439(this.f46021);
        Set set = this.f46022;
        c10130.mo13231(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c10130.m25439((String) it.next());
        }
        c10130.m25425(this.f46034);
        ArrayList arrayList = this.f46037;
        c10130.mo13231(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC19221 interfaceC19221 = (InterfaceC19221) it2.next();
            if (interfaceC19221 instanceof C0169) {
                C0169 c0169 = (C0169) interfaceC19221;
                c10130.writeByte(0);
                c10130.m25439(c0169.f1387);
                c10130.m25425(c0169.f1386);
                c10130.m25425(c0169.f1388);
            } else if (interfaceC19221 instanceof C5109) {
                C5109 c5109 = (C5109) interfaceC19221;
                c10130.writeByte(1);
                c10130.m25439(c5109.f16021);
                c10130.m25439(c5109.f16020);
                c10130.m25425(c5109.f16018);
                c10130.m25425(c5109.f16019);
            } else {
                throw new RuntimeException();
            }
        }
        int i = C7017.f21654;
        InterfaceC17186 interfaceC17186 = InterfaceC17186.f52681;
        String str2 = null;
        InterfaceC17186 interfaceC171862 = this.f46032;
        if (interfaceC171862 == interfaceC17186) {
            str = "#BUILT_IN_LUA_FORMATTER#";
        } else if (interfaceC171862 == InterfaceC17186.f52677) {
            str = "#BUILT_IN_PYTHON_FORMATTER#";
        } else if (interfaceC171862 == null) {
            str = null;
        } else if (interfaceC171862 == InterfaceC17186.f52686) {
            str = "#BUILT_IN_MTSX_FORMATTER#";
        } else if (interfaceC171862 == InterfaceC17186.f52676) {
            str = "#BUILT_IN_CSS_FORMATTER#";
        } else if (interfaceC171862 == InterfaceC17186.f52680) {
            str = "#BUILT_IN_HTML_FORMATTER#";
        } else if (interfaceC171862 == InterfaceC17186.f52684) {
            str = "#BUILT_IN_JS_FORMATTER#";
        } else if (interfaceC171862 == InterfaceC17186.f52679) {
            str = "#BUILT_IN_TS_FORMATTER#";
        } else if (interfaceC171862 == InterfaceC17186.f52683) {
            str = "#BUILT_IN_JSON_FORMATTER#";
        } else if (interfaceC171862 == InterfaceC17186.f52678) {
            str = "#BUILT_IN_XML_FORMATTER#";
        } else if (interfaceC171862 == InterfaceC17186.f52685) {
            str = "#BUILT_IN_SMALI_FORMATTER#";
        } else {
            if (interfaceC171862 != InterfaceC17186.f52682) {
                throw new RuntimeException(interfaceC171862.toString());
            }
            str = "#BUILT_IN_JAVA_FORMATTER#";
        }
        c10130.m25424(str);
        InterfaceC6603 interfaceC6603 = this.f46029;
        if (interfaceC6603 != null) {
            if (interfaceC6603 == InterfaceC6603.f20330) {
                str2 = "#BUILT_IN_CSS_SHRINKER#";
            } else if (interfaceC6603 == InterfaceC6603.f20331) {
                str2 = "#BUILT_IN_HTML_SHRINKER#";
            } else if (interfaceC6603 == InterfaceC6603.f20332) {
                str2 = "#BUILT_IN_JS_SHRINKER#";
            } else {
                if (interfaceC6603 != InterfaceC6603.f20333) {
                    throw new RuntimeException(interfaceC6603.toString());
                }
                str2 = "#BUILT_IN_JSON_SHRINKER#";
            }
        }
        c10130.m25424(str2);
        C4900 c4900 = this.f46036;
        c10130.mo13231(c4900.m14267());
        InterfaceC12063 it3 = c4900.m14266().iterator();
        while (it3.hasNext()) {
            InterfaceC11544 interfaceC11544 = (InterfaceC11544) it3.next();
            c10130.m25439(C4900.m14262(interfaceC11544.mo15639()));
            ((C21834) interfaceC11544.getValue()).m49204(c10130);
        }
        ArrayList arrayList2 = this.f46035;
        c10130.mo13231(arrayList2.size());
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            C8014 c8014 = (C8014) it4.next();
            c10130.m25439(c8014.f24743.pattern());
            c10130.mo13231(c8014.f24743.flags());
            c8014.f24744.m49204(c10130);
        }
        List list = this.f46026;
        c10130.mo13231(list.size());
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            ((AbstractC9693) it5.next()).mo1516(c10130);
        }
        Map map = this.f46027;
        c10130.mo13231(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c10130.m25439((String) entry.getKey());
            Object value = entry.getValue();
            if (value instanceof AbstractC9693) {
                c10130.writeByte(0);
                ((AbstractC9693) value).mo1516(c10130);
            } else if (value instanceof String) {
                c10130.writeByte(1);
                c10130.m25439((String) value);
            } else if (value instanceof C7805) {
                c10130.writeByte(2);
                ((C7805) value).m20830(c10130);
            } else {
                throw new RuntimeException();
            }
        }
        ArrayList arrayList3 = this.f46031;
        if (arrayList3 == null) {
            c10130.mo13229((short) -1);
        } else {
            c10130.mo13229((short) arrayList3.size());
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                c10130.m25439((String) it6.next());
            }
        }
        c10130.m25418();
    }

    public C15068(C12951 c12951) {
        super(null);
        this.f46036 = new C4900();
        this.f46035 = new ArrayList();
        this.f46037 = new ArrayList();
        this.f46032 = null;
        this.f46029 = null;
        this.f46030 = C7017.m18975();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f46022 = C20195.unmodifiableSet(linkedHashSet);
        this.f46026 = C20195.unmodifiableList(arrayList);
        this.f46027 = C20195.unmodifiableMap(hashMap);
        C22124.m49721(c12951, 20224);
        c12951.readInt();
        this.f46021 = c12951.m31506();
        int m31494 = c12951.m31494();
        for (int i = 0; i < m31494; i++) {
            linkedHashSet.add(c12951.m31506());
        }
        this.f46034 = c12951.m31498();
        int m314942 = c12951.m31494();
        this.f46037.ensureCapacity(m314942);
        for (int i2 = 0; i2 < m314942; i2++) {
            byte readByte = c12951.readByte();
            if (readByte == 0) {
                this.f46037.add(new C0169(c12951.m31506(), c12951.m31498(), c12951.m31498()));
            } else {
                if (readByte != 1) {
                    throw new RuntimeException("Unknown comment type");
                }
                this.f46037.add(new C5109(c12951.m31506(), c12951.m31506(), c12951.m31498(), c12951.m31498()));
            }
        }
        this.f46032 = C7017.m18977(c12951.m31503());
        this.f46029 = C7017.m18981(c12951.m31503());
        int m314943 = c12951.m31494();
        for (int i3 = 0; i3 < m314943; i3++) {
            this.f46036.m14265(c12951.m31506(), C21834.m49199(c12951));
        }
        int m314944 = c12951.m31494();
        this.f46035.ensureCapacity(m314944);
        for (int i4 = 0; i4 < m314944; i4++) {
            this.f46035.add(new C8014(C7017.m18954(c12951.m31494(), c12951.m31506()), C21834.m49199(c12951)));
        }
        int m314945 = c12951.m31494();
        for (int i5 = 0; i5 < m314945; i5++) {
            arrayList.add(AbstractC9693.m24637(this, c12951));
        }
        int m314946 = c12951.m31494();
        for (int i6 = 0; i6 < m314946; i6++) {
            String m31506 = c12951.m31506();
            byte readByte2 = c12951.readByte();
            if (readByte2 == 0) {
                hashMap.put(m31506, AbstractC9693.m24637(this, c12951));
            } else if (readByte2 == 1) {
                hashMap.put(m31506, c12951.m31506());
            } else {
                if (readByte2 != 2) {
                    throw new IOException(C19370.m44628(readByte2, "Unknown syntax definition type: "));
                }
                hashMap.put(m31506, C7805.m20827(c12951));
            }
        }
        short readShort = c12951.readShort();
        if (readShort < 0) {
            this.f46031 = null;
            return;
        }
        this.f46031 = new ArrayList(readShort);
        for (int i7 = 0; i7 < readShort; i7++) {
            this.f46031.add(c12951.m31506());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15068(C12386 c12386) {
        super(null);
        Iterator it;
        ArrayList arrayList;
        Class<C7447> cls;
        Class<C4625> cls2;
        ArrayList arrayList2;
        Class<C1863> cls3;
        Class<C4625> cls4;
        C21834 m49198;
        ArrayList arrayList3 = null;
        this.f46036 = new C4900();
        this.f46035 = new ArrayList();
        this.f46037 = new ArrayList();
        this.f46032 = null;
        this.f46029 = null;
        this.f46030 = C7017.m18975();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f46022 = C20195.unmodifiableSet(linkedHashSet);
        this.f46026 = C20195.unmodifiableList(arrayList4);
        this.f46027 = C20195.unmodifiableMap(hashMap);
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = c12386.m23037(C10270.class).iterator();
        int i = 0;
        boolean z = false;
        loop0: while (true) {
            Class<C7447> cls5 = C7447.class;
            Class<C4625> cls6 = C4625.class;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    C10270 c10270 = (C10270) it3.next();
                    C4625 c4625 = (C4625) c10270.m23039(cls6, 0);
                    if (c4625 != null) {
                        C13091 c13091 = (C13091) c4625.m23039(C13091.class, 0);
                        C3214 c3214 = (C3214) c4625.m23039(C3214.class, 0);
                        C9897 c9897 = (C9897) c4625.m23039(C9897.class, 0);
                        C23675 c23675 = (C23675) c4625.m23039(C23675.class, 0);
                        String m35649 = m35649(c13091.m23038(46, 0));
                        String m356492 = c3214 == null ? null : m35649(c3214.m23038(46, 0));
                        boolean z2 = c9897 == null || m35647(c9897.m23038(48, 0));
                        boolean z3 = c23675 == null || m35647(c23675.m23038(48, 0));
                        C1372 c1372 = new C1372(this);
                        if (m356492 == null) {
                            this.f46037.add(new C0169(m35649, z2, z));
                            if (z3) {
                                c1372.m4847(C7017.m18954(z ? 2 : 0, C16014.m37867(C3939.m11985(m35649), ".*")));
                            }
                            it = it3;
                        } else {
                            it = it3;
                            this.f46037.add(new C5109(m35649, m356492, z2, z));
                            if (z3) {
                                c1372.m4847(C7017.m18954(z ? 2 : 0, C20087.m46306("(?s)", C3939.m11985(m35649), ".*?(", C3939.m11985(m356492), "|$)")));
                            }
                        }
                        if (z3) {
                            c1372.m4845(C3489.m10672(0, "comment"));
                            arrayList4.add(c1372);
                        }
                    } else {
                        it = it3;
                        C7447 c7447 = (C7447) c10270.m23039(cls5, 0);
                        Class<C1863> cls7 = C1863.class;
                        if (c7447 != null) {
                            Iterator it4 = c7447.m23037(C13796.class).iterator();
                            while (it4.hasNext()) {
                                C13796 c13796 = (C13796) it4.next();
                                String m356493 = m35649(c13796.m23038(46, 0));
                                if (hashMap.containsKey(m356493)) {
                                    throw new RuntimeException(C20094.m46315("Duplicate defines: ", m356493));
                                }
                                Iterator it5 = it4;
                                C11036 c11036 = (C11036) c13796.m23039(C11036.class, 0);
                                Class<C7447> cls8 = cls5;
                                C15207 c15207 = (C15207) c13796.m23039(C15207.class, 0);
                                List m23037 = c13796.m23037(C22596.class);
                                if (c11036 != null) {
                                    hashMap.put(m356493, m35640(this, c11036.m23037(cls7)));
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    cls4 = cls6;
                                } else if (c15207 != null) {
                                    List m230372 = c15207.m23037(C8153.class);
                                    ArrayList arrayList6 = new ArrayList(m230372.size());
                                    cls4 = cls6;
                                    ArrayList arrayList7 = new ArrayList(m230372.size());
                                    Iterator it6 = m230372.iterator();
                                    while (it6.hasNext()) {
                                        C8153 c8153 = (C8153) it6.next();
                                        Iterator it7 = it6;
                                        ArrayList arrayList8 = arrayList3;
                                        C21559 c21559 = (C21559) c8153.m23039(C21559.class, 0);
                                        Class<C1863> cls9 = cls7;
                                        InterfaceC4181 m23038 = c21559.m23038(46, 0);
                                        if (m23038 == null) {
                                            m23038 = c21559.m23038(45, 0);
                                        }
                                        arrayList6.add(m35649(m23038));
                                        arrayList7.add(m35649(c8153.m23038(46, 0)));
                                        it6 = it7;
                                        arrayList3 = arrayList8;
                                        cls7 = cls9;
                                    }
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    try {
                                        hashMap.put(m356493, C7805.m20826(arrayList6, arrayList7));
                                    } catch (IllegalArgumentException e) {
                                        Point m35638 = m35638(c15207);
                                        C3781 c3781 = new C3781(null, m35638.x, m35638.y, e.getMessage());
                                        c3781.initCause((Throwable) e);
                                        throw c3781;
                                    }
                                } else {
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    cls4 = cls6;
                                    if (m23037 == null) {
                                        throw new RuntimeException();
                                    }
                                    if (m23037.isEmpty()) {
                                        throw new RuntimeException("[Define " + c13796.m23038(46, 0).getText() + "]: Matchers cannot be empty");
                                    }
                                    if (m23037.size() == 1) {
                                        AbstractC9693 m35643 = m35643(this, (C22596) m23037.get(0), z);
                                        m35646(m35643, m356493);
                                        hashMap.put(m356493, m35643);
                                    } else {
                                        C2370 c2370 = new C2370(this);
                                        ArrayList arrayList9 = new ArrayList();
                                        Iterator it8 = m23037.iterator();
                                        int i2 = 1;
                                        while (it8.hasNext()) {
                                            AbstractC9693 m356432 = m35643(c2370, (C22596) it8.next(), z);
                                            StringBuilder m19190 = C7166.m19190(m356493, "[");
                                            m19190.append(i2);
                                            m19190.append("]");
                                            m35646(m356432, m19190.toString());
                                            arrayList9.add(m356432);
                                            i2++;
                                        }
                                        c2370.m7685(arrayList9);
                                        hashMap.put(m356493, c2370);
                                    }
                                }
                                cls5 = cls8;
                                it4 = it5;
                                cls6 = cls4;
                                arrayList3 = arrayList2;
                                cls7 = cls3;
                            }
                        } else {
                            arrayList = arrayList3;
                            cls = cls5;
                            cls2 = cls6;
                            C6036 c6036 = (C6036) c10270.m23039(C6036.class, 0);
                            if (c6036 != null) {
                                Iterator it9 = c6036.m23037(C22596.class).iterator();
                                while (it9.hasNext()) {
                                    arrayList4.add(m35643(this, (C22596) it9.next(), z));
                                }
                            } else {
                                C16245 c16245 = (C16245) c10270.m23039(C16245.class, 0);
                                if (c16245 == null) {
                                    throw new RuntimeException(c10270.getText());
                                }
                                AbstractC9693 abstractC9693 = this.f29307;
                                List m230373 = ((C11036) ((C2841) c16245.m23039(C2841.class, 0)).m23039(C11036.class, 0)).m23037(cls7);
                                try {
                                    this.f46035.add(new C8014(C7017.m18954(z ? 2 : 0, m35640(abstractC9693, m230373)), m35651(C4900.m14261(m35649(((C16679) c16245.m23039(C16679.class, 0)).m23038(46, 0))))));
                                } catch (PatternSyntaxException e2) {
                                    throw new RuntimeException(m35639(((C8931) m230373.get(0)).f27156) + " " + e2.getMessage());
                                }
                            }
                            it3 = it;
                            cls5 = cls;
                            cls6 = cls2;
                            arrayList3 = arrayList;
                        }
                    }
                    arrayList = arrayList3;
                    cls = cls5;
                    cls2 = cls6;
                    it3 = it;
                    cls5 = cls;
                    cls6 = cls2;
                    arrayList3 = arrayList;
                }
                this.f46031 = arrayList3;
                mo1517(new C20982());
                ArrayList arrayList10 = new ArrayList();
                Iterator it10 = arrayList4.iterator();
                while (it10.hasNext()) {
                    AbstractC9693 abstractC96932 = (AbstractC9693) it10.next();
                    if (abstractC96932 instanceof C0252) {
                        arrayList10.addAll(m35642(abstractC96932, new HashSet()));
                    } else {
                        arrayList10.add(abstractC96932);
                    }
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList10);
                return;
            }
            C10270 c102702 = (C10270) it2.next();
            C5663 c5663 = (C5663) c102702.m23039(C5663.class, i);
            if (c5663 != null) {
                List m23042 = ((C7779) c5663.m23039(C7779.class, i)).m23042(46);
                this.f46021 = m35649((InterfaceC4181) m23042.get(i));
                for (int i3 = 1; i3 < m23042.size(); i3++) {
                    linkedHashSet.add(m35649((InterfaceC4181) m23042.get(i3)));
                }
            } else {
                C14834 c14834 = (C14834) c102702.m23039(C14834.class, i);
                if (c14834 != null) {
                    this.f46034 = m35647(c14834.m23038(48, i));
                } else {
                    C11681 c11681 = (C11681) c102702.m23039(C11681.class, i);
                    if (c11681 != null) {
                        for (C22969 c22969 : c11681.m23037(C22969.class)) {
                            List m230422 = c22969.m23042(46);
                            List m230423 = c22969.m23042(49);
                            InterfaceC4181 m230382 = c22969.m23038(51, i);
                            String m356494 = m35649((InterfaceC4181) m230422.get(i));
                            if (m356494.startsWith("!!")) {
                                throw new RuntimeException("Illegal style name: " + m230423);
                            }
                            if (m230422.size() == 2) {
                                m49198 = m35651(C4900.m14261(m35649((InterfaceC4181) m230422.get(1))));
                                if (m230382 != null) {
                                    m49198 = m49198.m49201(m35637(m230382));
                                }
                            } else if (m230423.size() == 2) {
                                int[] iArr = new int[2];
                                m35645(c22969.m23038(49, 0).getText(), iArr);
                                int i4 = iArr[0];
                                int i5 = iArr[1];
                                m35645(c22969.m23038(49, 1).getText(), iArr);
                                m49198 = C21834.m49198(null, i4, i5, iArr[0], iArr[1], m35637(c22969.m23038(51, 0)));
                            } else {
                                m49198 = C21834.m49198(null, 1447446, 1447446, 1447446, 1447446, m35637(m230382));
                            }
                            this.f46036.m14265(m356494, m49198);
                            i = 0;
                        }
                    } else {
                        C22264 c22264 = (C22264) c102702.m23039(C22264.class, 0);
                        if (c22264 != null) {
                            this.f46032 = C7017.m18977(c22264.m23038(50, 0).getText());
                        } else {
                            C20148 c20148 = (C20148) c102702.m23039(C20148.class, 0);
                            if (c20148 != null) {
                                this.f46029 = C7017.m18981(c20148.m23038(50, 0).getText());
                            } else {
                                C6742 c6742 = (C6742) c102702.m23039(C6742.class, 0);
                                if (c6742 != null) {
                                    List<InterfaceC4181> m230424 = c6742.m23042(46);
                                    ArrayList arrayList11 = new ArrayList(m230424.size());
                                    for (InterfaceC4181 interfaceC4181 : m230424) {
                                        String m356495 = m35649(interfaceC4181);
                                        if (m356495.length() != 2 || m356495.charAt(0) == m356495.charAt(1)) {
                                            break loop0;
                                        } else {
                                            arrayList11.add(m356495);
                                        }
                                    }
                                    arrayList3 = arrayList11;
                                } else {
                                    C7074 c7074 = (C7074) c102702.m23039(C7074.class, 0);
                                    if (c7074 != null) {
                                        z = m35647(c7074.m23038(48, 0));
                                    } else if (((C4625) c102702.m23039(cls6, 0)) != null) {
                                        arrayList5.add(c102702);
                                    } else if (((C7447) c102702.m23039(cls5, 0)) != null) {
                                        arrayList5.add(c102702);
                                    } else if (((C6036) c102702.m23039(C6036.class, 0)) != null) {
                                        arrayList5.add(c102702);
                                    } else {
                                        if (((C16245) c102702.m23039(C16245.class, 0)) == null) {
                                            throw new RuntimeException(c102702.getText());
                                        }
                                        arrayList5.add(c102702);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i = 0;
        }
        throw new RuntimeException(m35639(interfaceC4181.mo12628()) + " Illegal bracket pair " + interfaceC4181.getText());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Point m35638(C8931 c8931) {
        InterfaceC0463 interfaceC0463 = c8931.f27156;
        return new Point(interfaceC0463.getLine(), interfaceC0463.mo2049());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private List m35642(AbstractC9693 abstractC9693, HashSet hashSet) {
        if (abstractC9693 instanceof C0252) {
            C0252 c0252 = (C0252) abstractC9693;
            if (hashSet.add(c0252.m1518())) {
                AbstractC9693 m35658 = m35658(c0252.m1518());
                if (m35658 instanceof C2370) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((C2370) m35658).m7684().iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(m35642((AbstractC9693) it.next(), new HashSet(hashSet)));
                    }
                    return arrayList;
                }
                return m35642(m35658, new HashSet(hashSet));
            }
        }
        if (abstractC9693.f29307 != this) {
            return Collections.singletonList(abstractC9693.mo1512(this));
        }
        return Collections.singletonList(abstractC9693);
    }

    @Override // l.AbstractC9693
    /* renamed from: ֫ */
    public final void mo1517(C20982 c20982) {
        Iterator it = this.f46026.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1517(c20982);
        }
        for (Map.Entry entry : this.f46027.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof AbstractC9693) {
                AbstractC9693 abstractC9693 = (AbstractC9693) value;
                if (c20982.f67769.add((String) entry.getKey())) {
                    abstractC9693.mo1517(c20982);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35646(AbstractC9693 abstractC9693, String str) {
        if (abstractC9693 instanceof C1372) {
            C1372 c1372 = (C1372) abstractC9693;
            if (c1372.m4855() == null) {
                c1372.m4844(str);
                return;
            }
            return;
        }
        if (abstractC9693 instanceof C8428) {
            C8428 c8428 = (C8428) abstractC9693;
            if (c8428.m22080() == null) {
                c8428.m22082(str);
                return;
            }
            return;
        }
        if (abstractC9693 instanceof C4195) {
            C4195 c4195 = (C4195) abstractC9693;
            if (c4195.m12658() == null) {
                c4195.m12654(str);
                return;
            }
            return;
        }
        if (abstractC9693 instanceof C19304) {
            C19304 c19304 = (C19304) abstractC9693;
            if (c19304.m44503() == null) {
                c19304.m44496(str);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35640(AbstractC9693 abstractC9693, List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1863 c1863 = (C1863) it.next();
            if (((C17385) c1863.m23039(C17385.class, 0)) != null) {
                Point m35638 = m35638(c1863);
                throw new C3781(null, m35638.x, m35638.y, "var() is not allowed in regex definitions or static match fields");
            }
            sb.append(m35641(abstractC9693, c1863));
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35645(String str, int[] iArr) {
        boolean z;
        int indexOf = str.indexOf(35, 4);
        if (indexOf == -1) {
            indexOf = str.indexOf(36, 4);
            z = true;
        } else {
            z = false;
        }
        if (indexOf == -1) {
            iArr[0] = m35648(str);
            iArr[1] = 1447446;
            return;
        }
        iArr[0] = m35648(str.substring(0, indexOf));
        if (z) {
            int m35648 = m35648("#" + str.substring(indexOf + 1));
            iArr[1] = m35648;
            iArr[1] = (m35648 & 16777215) | 100663296;
            return;
        }
        iArr[1] = m35648(str.substring(indexOf));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m35648(String str) {
        if (str.equalsIgnoreCase("#NULL")) {
            return 1447446;
        }
        C7073 c7073 = f46020;
        synchronized (c7073) {
            if (!C9896.m24991(str, c7073)) {
                return -65536;
            }
            return c7073.f21766;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35637(InterfaceC4181 interfaceC4181) {
        if (interfaceC4181 != null) {
            String text = interfaceC4181.getText();
            r0 = text.indexOf(66) != -1 ? 1 : 0;
            if (text.indexOf(73) != -1) {
                r0 |= 2;
            }
            if (text.indexOf(85) != -1) {
                r0 |= 4;
            }
            if (text.indexOf(83) != -1) {
                return r0 | 8;
            }
        }
        return r0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m35649(InterfaceC4181 interfaceC4181) {
        return C10035.f30194.m28254(C15472.m36561(1, 1, interfaceC4181.getText()));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m35647(InterfaceC4181 interfaceC4181) {
        return interfaceC4181.getText().equals("true");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35639(InterfaceC0463 interfaceC0463) {
        int line = interfaceC0463.getLine();
        int mo2049 = interfaceC0463.mo2049();
        StringBuilder sb = new StringBuilder();
        if (mo2049 > 0) {
            sb.append('[');
            sb.append(line);
            sb.append(':');
            sb.append(mo2049 + 1);
            sb.append(']');
        } else {
            sb.append("[line ");
            sb.append(line);
            sb.append(']');
        }
        return sb.toString();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21834 m35661() {
        C21834 c21834 = this.f46028;
        if (c21834 != null) {
            return c21834;
        }
        C21834 m35651 = m35651(C4900.f15475);
        this.f46028 = m35651;
        return m35651;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m35651(int i) {
        C4900 c4900;
        boolean z = i < 0;
        if (z) {
            i = -i;
        }
        C21834 m14263 = this.f46036.m14263(i);
        if (m14263 == null) {
            int i2 = C7017.f21654;
            C7308 c7308 = this.f46030;
            c4900 = c7308.f22433;
            C21834 m142632 = c4900.m14263(i);
            if (m142632 == null) {
                m142632 = c7308.f22434;
            }
            m14263 = m142632;
        }
        return z ? m14263.m49208() : m14263;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7308 m35669() {
        return this.f46030;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m35657() {
        return this.f46021;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Set m35662() {
        return this.f46022;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m35668() {
        return C20195.unmodifiableList(this.f46037);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m35663() {
        return this.f46031;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17186 m35665() {
        InterfaceC17186 interfaceC17186 = this.f46032;
        return (interfaceC17186 == null && "MT-Syntax".equals(this.f46021)) ? InterfaceC17186.f52686 : interfaceC17186;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6603 m35664() {
        return this.f46029;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m35655() {
        return this.f46035;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m35654() {
        return this.f46034;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        mo1514(sb, 0);
        return sb.toString();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC9693 m35658(String str) {
        Object obj = this.f46027.get(str);
        if (obj == null) {
            throw new RuntimeException(C20094.m46315("Definition not found: ", str));
        }
        if (obj instanceof AbstractC9693) {
            return (AbstractC9693) obj;
        }
        throw new RuntimeException(C20094.m46315("Not a matcher definition: ", str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7805 m35650(String str) {
        Object obj = this.f46027.get(str);
        if (obj == null) {
            throw new IllegalArgumentException(C20094.m46315("Definition not found: ", str));
        }
        if (obj instanceof C7805) {
            return (C7805) obj;
        }
        throw new IllegalArgumentException(C20094.m46315("Not a childrenSyntax mapping definition: ", str));
    }

    @Override // l.AbstractC9693
    /* renamed from: ֫ */
    public final AbstractC9693 mo1512(AbstractC9693 abstractC9693) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC9693
    /* renamed from: ֫ */
    public final void mo1514(StringBuilder sb, int i) {
        sb.append("[Language]\n");
        sb.append("Name: ");
        sb.append(this.f46021);
        sb.append('\n');
        sb.append("Suffixes: ");
        sb.append(this.f46022);
        sb.append('\n');
        sb.append("Comment: ");
        sb.append(this.f46037);
        sb.append('\n');
        Map map = this.f46027;
        if (!map.isEmpty()) {
            sb.append("Defines: ");
            sb.append('\n');
            for (Map.Entry entry : map.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                Object value = entry.getValue();
                if (value instanceof AbstractC9693) {
                    ((AbstractC9693) value).mo1514(sb, 0);
                } else if (value instanceof C7805) {
                    ((C7805) value).m20828(sb);
                } else {
                    sb.append(value);
                    sb.append("\n");
                }
            }
        }
        sb.append("Contains: ");
        sb.append('\n');
        Iterator it = this.f46026.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1514(sb, 0);
        }
    }

    @Override // l.AbstractC9693
    /* renamed from: ֫ */
    public final void mo1515(ArrayList arrayList) {
        Iterator it = this.f46026.iterator();
        while (it.hasNext()) {
            ((AbstractC9693) it.next()).mo1515(arrayList);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35659() {
        mo1515(new ArrayList());
        for (Object obj : this.f46027.values()) {
            if (obj instanceof AbstractC9693) {
                ((AbstractC9693) obj).mo1515(new ArrayList());
            }
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m35653() {
        return this.f46026;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35652(Callable callable) {
        this.f46025 = callable;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m35656() {
        return (String) this.f46025.call();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21834 m35644(C2509 c2509) {
        int[] iArr = new int[2];
        m35645(c2509.m23038(49, 0).getText(), iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        m35645(c2509.m23038(49, 1).getText(), iArr);
        return C21834.m49198(null, i, i2, iArr[0], iArr[1], m35637(c2509.m23038(51, 0)));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35660(int i) {
        if (this.f46024 && this.f46023 != i) {
            throw new IllegalStateException("Language semantic hash is already initialized");
        }
        this.f46023 = i;
        this.f46024 = true;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m35666() {
        this.f46033 = true;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m35667() {
        if (this.f46033) {
            throw new IllegalArgumentException("Cached language requires recompilation");
        }
    }

    public final int hashCode() {
        return this.f46023;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۢܺܿ, l.᩵ۜܿ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.֡ۜܿ, l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.ۢܺܿ, l.ۨ᩻ܿ] */
    /* JADX WARN: Type inference failed for: r9v3, types: [l.ۘ᩷ܿ, l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v4, types: [l.۠᩷ܿ, l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v5, types: [l.ۢܺܿ] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.֨᩷ܿ, l.ۢܺܿ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC9693 m35643(AbstractC9693 abstractC9693, C22596 c22596, boolean z) {
        ?? c19304;
        Class<C16679> cls;
        boolean z2;
        boolean z3;
        Iterator it;
        C1664 m5636;
        C20480 c20480 = (C20480) c22596.m23039(C20480.class, 0);
        if (c20480 != null) {
            c19304 = new C1372(abstractC9693);
            C19069 c19069 = (C19069) c20480.m23039(C19069.class, 0);
            if (c19069 != null) {
                c19304.m4844(m35649(c19069.m23038(46, 0)));
            }
            List<C1863> m23037 = ((C11036) ((C2841) c20480.m23039(C2841.class, 0)).m23039(C11036.class, 0)).m23037(C1863.class);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (C1863 c1863 : m23037) {
                C17385 c17385 = (C17385) c1863.m23039(C17385.class, 0);
                if (c17385 == null) {
                    sb.append(m35641(abstractC9693, c1863));
                } else {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                    arrayList2.add(m35649(c17385.m23038(46, 0)));
                }
            }
            arrayList.add(sb.toString());
            try {
                C5606 m15901 = C5606.m15901(arrayList, arrayList2, z ? 2 : 0);
                c19304.m4846(m15901);
                int m15910 = m15901.m15910();
                C10602 c10602 = (C10602) c20480.m23039(C10602.class, 0);
                if (c10602 != null) {
                    c19304.m4848(m35647(c10602.m23038(48, 0)));
                }
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (C3920 c3920 : c20480.m23037(C3920.class)) {
                    int parseInt = Integer.parseInt(c3920.m23038(44, 0).getText());
                    String m35649 = m35649(c3920.m23038(46, 0));
                    if (parseInt > m15910) {
                        Point m35638 = m35638(c3920);
                        throw new C3781(null, m35638.x, m35638.y, "No start capture group " + parseInt + " for exported variable \"" + m35649 + "\"");
                    }
                    if (!hashSet.add(Integer.valueOf(parseInt))) {
                        Point m356382 = m35638(c3920);
                        throw new C3781(null, m356382.x, m356382.y, C18307.m42645(parseInt, "Capture group ", " is exported more than once"));
                    }
                    if (!hashSet2.add(m35649)) {
                        Point m356383 = m35638(c3920);
                        throw new C3781(null, m356383.x, m356383.y, C20094.m46315("Duplicate exported variable: ", m35649));
                    }
                    arrayList3.add(new C23327(parseInt, m35649));
                }
                c19304.m4850(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i = 0;
                for (C6368 c6368 : c20480.m23037(C6368.class)) {
                    int parseInt2 = Integer.parseInt(c6368.m23038(44, 0).getText());
                    if (parseInt2 > m15910) {
                        String text = c6368.getText();
                        int indexOf = text.indexOf(58);
                        if (indexOf >= 0 && indexOf < 10) {
                            text = "\n".concat(text);
                        }
                        throw new RuntimeException(m35639(c6368.f27156) + " No group " + parseInt2 + ": " + text);
                    }
                    InterfaceC4181 m23038 = c6368.m23038(46, 0);
                    if (m23038 != null) {
                        String m356492 = m35649(m23038);
                        if (parseInt2 == 0) {
                            arrayList4.add(i, C3489.m10672(parseInt2, m356492));
                            i++;
                        } else {
                            arrayList4.add(C3489.m10672(parseInt2, m356492));
                        }
                    } else {
                        arrayList5.add(new C8987(parseInt2, m35643(c19304, (C22596) c6368.m23039(C22596.class, 0), z)));
                    }
                }
                c19304.m4853(arrayList4);
                c19304.m4856(arrayList5);
            } catch (IllegalArgumentException e) {
                Point m356384 = m35638((C8931) m23037.get(0));
                C3781 c3781 = new C3781(null, m356384.x, m356384.y, e.getMessage());
                c3781.initCause((Throwable) e);
                throw c3781;
            }
        } else {
            C13423 c13423 = (C13423) c22596.m23039(C13423.class, 0);
            Class<C16679> cls2 = C16679.class;
            if (c13423 != null) {
                c19304 = new C8428(abstractC9693);
                C19069 c190692 = (C19069) c13423.m23039(C19069.class, 0);
                if (c190692 != null) {
                    c19304.m22082(m35649(c190692.m23038(46, 0)));
                }
                Iterator it2 = c13423.m23037(C12718.class).iterator();
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (it2.hasNext()) {
                    C12718 c12718 = (C12718) it2.next();
                    C12013 c12013 = (C12013) c12718.m23039(C12013.class, 0);
                    if (c12013 != null) {
                        c19304.m22089(m35643(c19304, (C22596) c12013.m23039(C22596.class, 0), z));
                    } else {
                        C2135 c2135 = (C2135) c12718.m23039(C2135.class, 0);
                        if (c2135 != null) {
                            c19304.m22083(m35643(c19304, (C22596) c2135.m23039(C22596.class, 0), z));
                        } else {
                            C11308 c11308 = (C11308) c12718.m23039(C11308.class, 0);
                            if (c11308 != null) {
                                c19304.m22071(Integer.parseInt(c11308.m23038(44, 0).getText()));
                                if (z6) {
                                    throw new RuntimeException(C9045.m23341(new StringBuilder(), m35639(c11308.f27156), " <EndMatcher> and endPriority cannot be specified at the same time!"));
                                }
                                z9 = true;
                            } else {
                                C4252 c4252 = (C4252) c12718.m23039(C4252.class, 0);
                                if (c4252 != null) {
                                    c19304.m22075(m35647(c4252.m23038(48, 0)));
                                    z5 = true;
                                } else {
                                    C0723 c0723 = (C0723) c12718.m23039(C0723.class, 0);
                                    if (c0723 != null) {
                                        it = it2;
                                        c19304.m22084(m35647(c0723.m23038(48, 0)));
                                    } else {
                                        it = it2;
                                        C16679 c16679 = (C16679) c12718.m23039(cls2, 0);
                                        if (c16679 != null) {
                                            c19304.m22092(m35649(c16679.m23038(46, 0)));
                                        } else {
                                            C18737 c18737 = (C18737) c12718.m23039(C18737.class, 0);
                                            if (c18737 != null) {
                                                c19304.m22072(m35649(c18737.m23038(46, 0)));
                                            } else {
                                                C5331 c5331 = (C5331) c12718.m23039(C5331.class, 0);
                                                if (c5331 == null) {
                                                    cls = cls2;
                                                    z3 = z6;
                                                    z2 = z8;
                                                    C19775 c19775 = (C19775) c12718.m23039(C19775.class, 0);
                                                    if (c19775 == null) {
                                                        C23301 c23301 = (C23301) c12718.m23039(C23301.class, 0);
                                                        if (c23301 == null) {
                                                            throw new RuntimeException(c12718.getText());
                                                        }
                                                        if (z4) {
                                                            Point m356385 = m35638(c23301);
                                                            throw new C3781(null, m356385.x, m356385.y, "childrenSyntax and contains cannot be used together");
                                                        }
                                                        z6 = z3;
                                                        for (C14128 c14128 : c23301.m23037(C14128.class)) {
                                                            if (c14128.m23038(42, 0) == null) {
                                                                c19304.m22074(m35643(c19304, (C22596) c14128.m23039(C22596.class, 0), z), c14128.m23038(52, 0) != null);
                                                            } else {
                                                                if (z9) {
                                                                    throw new RuntimeException(C9045.m23341(new StringBuilder(), m35639(c14128.f27156), " <EndMatcher> and endPriority cannot be specified at the same time!"));
                                                                }
                                                                if (z6) {
                                                                    throw new RuntimeException(C9045.m23341(new StringBuilder(), m35639(c14128.f27156), " Duplicate <EndMatcher>!"));
                                                                }
                                                                c19304.m22071(((ArrayList) c19304.m22090()).size());
                                                                z6 = true;
                                                            }
                                                        }
                                                        z8 = true;
                                                        it2 = it;
                                                        cls2 = cls;
                                                    } else {
                                                        if (z7) {
                                                            Point m356386 = m35638(c19775);
                                                            throw new C3781(null, m356386.x, m356386.y, "Duplicate missingStyle");
                                                        }
                                                        c19304.m22088(m35649(c19775.m23038(46, 0)));
                                                        z7 = true;
                                                    }
                                                } else {
                                                    if (z4) {
                                                        Point m356387 = m35638(c5331);
                                                        throw new C3781(null, m356387.x, m356387.y, "Duplicate childrenSyntax");
                                                    }
                                                    if (z8) {
                                                        Point m356388 = m35638(c5331);
                                                        throw new C3781(null, m356388.x, m356388.y, "childrenSyntax and contains cannot be used together");
                                                    }
                                                    C19443 c19443 = (C19443) c5331.m23039(C19443.class, 0);
                                                    if (c19443 == null) {
                                                        m5636 = C1664.m5637(m35649(c5331.m23038(46, 0)));
                                                        cls = cls2;
                                                        z3 = z6;
                                                        z2 = z8;
                                                    } else {
                                                        int parseInt3 = Integer.parseInt(c19443.m23038(44, 0).getText());
                                                        C7074 c7074 = (C7074) c5331.m23039(C7074.class, 0);
                                                        boolean m35647 = c7074 == null ? z : m35647(c7074.m23038(48, 0));
                                                        List m230372 = c5331.m23037(C0391.class);
                                                        List m230373 = c5331.m23037(C1097.class);
                                                        ArrayList arrayList6 = new ArrayList(m230373.size());
                                                        HashSet hashSet3 = new HashSet();
                                                        Iterator it3 = m230373.iterator();
                                                        while (it3.hasNext()) {
                                                            Iterator it4 = it3;
                                                            C1097 c1097 = (C1097) it3.next();
                                                            boolean z10 = z6;
                                                            String m356493 = m35649(c1097.m23038(46, 0));
                                                            if (!hashSet3.add(m356493)) {
                                                                Point m356389 = m35638(c1097);
                                                                throw new C3781(null, m356389.x, m356389.y, C20094.m46315("Duplicate childrenSyntax include: ", m356493));
                                                            }
                                                            arrayList6.add(m356493);
                                                            it3 = it4;
                                                            z6 = z10;
                                                        }
                                                        z3 = z6;
                                                        ArrayList arrayList7 = new ArrayList(m230372.size());
                                                        ArrayList arrayList8 = new ArrayList(m230372.size());
                                                        HashSet hashSet4 = new HashSet();
                                                        Iterator it5 = m230372.iterator();
                                                        boolean z11 = false;
                                                        String str = null;
                                                        while (it5.hasNext()) {
                                                            boolean z12 = z8;
                                                            C0391 c0391 = (C0391) it5.next();
                                                            Iterator it6 = it5;
                                                            if (c0391.m23038(14, 0) == null) {
                                                                C21559 c21559 = (C21559) c0391.m23039(C21559.class, 0);
                                                                Class<C16679> cls3 = cls2;
                                                                InterfaceC4181 m230382 = c21559.m23038(46, 0);
                                                                if (m230382 == null) {
                                                                    m230382 = c21559.m23038(45, 0);
                                                                }
                                                                String m356494 = m35649(m230382);
                                                                if (!hashSet4.add(C1664.m5635(m356494, m35647))) {
                                                                    Point m3563810 = m35638(c0391);
                                                                    throw new C3781(null, m3563810.x, m3563810.y, C20094.m46315("Duplicate childrenSyntax selector: ", m356494));
                                                                }
                                                                arrayList7.add(m356494);
                                                                arrayList8.add(m35649(c0391.m23038(46, 0)));
                                                                z8 = z12;
                                                                it5 = it6;
                                                                cls2 = cls3;
                                                            } else {
                                                                if (z11) {
                                                                    Point m3563811 = m35638(c0391);
                                                                    throw new C3781(null, m3563811.x, m3563811.y, "Duplicate childrenSyntax default");
                                                                }
                                                                str = m35649(c0391.m23038(46, 0));
                                                                z11 = true;
                                                                z8 = z12;
                                                                it5 = it6;
                                                            }
                                                        }
                                                        cls = cls2;
                                                        z2 = z8;
                                                        m5636 = C1664.m5636(parseInt3, m35647, arrayList6, arrayList7, arrayList8, str);
                                                    }
                                                    c19304.m22073(m5636);
                                                    z4 = true;
                                                }
                                                z8 = z2;
                                                it2 = it;
                                                z6 = z3;
                                                cls2 = cls;
                                            }
                                        }
                                    }
                                    cls = cls2;
                                    z3 = z6;
                                    z2 = z8;
                                    z8 = z2;
                                    it2 = it;
                                    z6 = z3;
                                    cls2 = cls;
                                }
                            }
                        }
                    }
                    it = it2;
                    cls = cls2;
                    z3 = z6;
                    z2 = z8;
                    z8 = z2;
                    it2 = it;
                    z6 = z3;
                    cls2 = cls;
                }
                if (z4 && !z5) {
                    c19304.m22075(true);
                }
                c19304.m22081();
            } else {
                Class<C16679> cls4 = cls2;
                C3546 c3546 = (C3546) c22596.m23039(C3546.class, 0);
                if (c3546 != null) {
                    c19304 = new C4195(abstractC9693);
                    C19069 c190693 = (C19069) c3546.m23039(C19069.class, 0);
                    if (c190693 != null) {
                        c19304.m12654(m35649(c190693.m23038(46, 0)));
                    }
                    String m356495 = m35649(((C1429) c3546.m23039(C1429.class, 0)).m23038(46, 0));
                    String str2 = "";
                    String str3 = "";
                    for (C4957 c4957 : c3546.m23037(C4957.class)) {
                        C24007 c24007 = (C24007) c4957.m23039(C24007.class, 0);
                        if (c24007 != null) {
                            str2 = m35649(c24007.m23038(46, 0));
                        } else {
                            C16951 c16951 = (C16951) c4957.m23039(C16951.class, 0);
                            if (c16951 != null) {
                                str3 = m35649(c16951.m23038(46, 0));
                            } else {
                                Class<C16679> cls5 = cls4;
                                C16679 c166792 = (C16679) c4957.m23039(cls5, 0);
                                if (c166792 == null) {
                                    throw new RuntimeException(c4957.getText());
                                }
                                c19304.m12657(m35649(c166792.m23038(46, 0)));
                                cls4 = cls5;
                            }
                        }
                    }
                    c19304.m12655(new C2784(m356495, str2, str3));
                } else {
                    C8485 c8485 = (C8485) c22596.m23039(C8485.class, 0);
                    if (c8485 != null) {
                        String text2 = ((C20854) c8485.m23039(C20854.class, 0)).m23038(50, 0).getText();
                        c19304 = new C12039(abstractC9693);
                        c19304.m29413(text2);
                    } else {
                        C21891 c21891 = (C21891) c22596.m23039(C21891.class, 0);
                        if (c21891 != null) {
                            String m356496 = m35649(c21891.m23038(46, 0));
                            c19304 = new C0252(abstractC9693);
                            c19304.m1513(m356496);
                        } else {
                            C15539 c15539 = (C15539) c22596.m23039(C15539.class, 0);
                            if (c15539 == null) {
                                throw new RuntimeException(c22596.getText());
                            }
                            c19304 = new C19304(abstractC9693);
                            C19069 c190694 = (C19069) c15539.m23039(C19069.class, 0);
                            if (c190694 != null) {
                                c19304.m44496(m35649(c190694.m23038(46, 0)));
                            }
                            c19304.m44501(((C17657) ((C18363) c15539.m23039(C18363.class, 0)).m23039(C17657.class, 0)).getText());
                            C16679 c166793 = (C16679) c15539.m23039(cls4, 0);
                            if (c166793 != null) {
                                c19304.m44498(m35649(c166793.m23038(46, 0)));
                            }
                            Iterator it7 = ((C6036) c15539.m23039(C6036.class, 0)).m23037(C22596.class).iterator();
                            while (it7.hasNext()) {
                                c19304.m44499(m35643(c19304, (C22596) it7.next(), z));
                            }
                        }
                    }
                }
            }
        }
        c19304.f29308 = m35638(c22596);
        return c19304;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35641(AbstractC9693 abstractC9693, C1863 c1863) {
        C0958 c0958;
        int i;
        C0958 c09582;
        C0958 c09583;
        int i2;
        C0958 c09584;
        C0958 c09585;
        C0958 c09586;
        C0958 c09587;
        C0958 c09588;
        C0958 c09589;
        int i3 = 0;
        InterfaceC4181 m23038 = c1863.m23038(46, 0);
        InterfaceC4181 m230382 = c1863.m23038(47, 0);
        C9191 c9191 = (C9191) c1863.m23039(C9191.class, 0);
        C21186 c21186 = (C21186) c1863.m23039(C21186.class, 0);
        if (m23038 != null) {
            return m35649(m23038);
        }
        int i4 = 1;
        if (m230382 != null) {
            String text = m230382.getText();
            return text.substring(1, text.length() - 1).replace("\\/", "/");
        }
        if (c9191 == null) {
            if (c21186 == null) {
                throw new IllegalArgumentException("Expected a static regex fragment");
            }
            C15068 mo24638 = abstractC9693 == null ? null : abstractC9693.mo24638();
            if (mo24638 == null) {
                throw new RuntimeException("Include regex is not supported here!");
            }
            String m35649 = m35649(c21186.m23038(46, 0));
            Object obj = mo24638.f46027.get(m35649);
            if (obj == null) {
                throw new RuntimeException(C20094.m46315("Definition not found: ", m35649));
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new RuntimeException(C20094.m46315("Not a regex definition: ", m35649));
        }
        HashSet hashSet = new HashSet();
        Iterator it = c9191.m23042(46).iterator();
        while (it.hasNext()) {
            Collections.addAll(hashSet, m35649((InterfaceC4181) it.next()).split("\\s+"));
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        C5192 c5192 = new C5192("Start", i3);
        C5192 c51922 = new C5192("End", i3);
        C5192 c51923 = new C5192("StartEnd", i3);
        C5192 c51924 = new C5192("None", i3);
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!str.isEmpty()) {
                char charAt = str.charAt(i3);
                boolean z = charAt == '_' || Character.isLetterOrDigit(charAt);
                char m19937 = C7416.m19937(i4, str);
                boolean z2 = m19937 == '_' || Character.isLetterOrDigit(m19937);
                ArrayList arrayList = new ArrayList(str.length() + i4);
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                boolean z3 = true;
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt2 = str.charAt(i5);
                    if (i5 == 0) {
                        arrayList.add(C3939.m11985(String.valueOf(charAt2)));
                    } else {
                        boolean isLetterOrDigit = Character.isLetterOrDigit(charAt2);
                        if (isLetterOrDigit != z3) {
                            if (sb.length() > 0) {
                                arrayList.add(C3939.m11985(sb.toString()));
                                sb.setLength(0);
                            }
                            z3 = isLetterOrDigit;
                        }
                        sb.append(charAt2);
                    }
                }
                if (sb.length() > 0) {
                    arrayList.add(C3939.m11985(sb.toString()));
                }
                arrayList.add("");
                if (z && z2) {
                    c51923.m14962(arrayList, 0);
                } else if (z) {
                    c5192.m14962(arrayList, 0);
                } else if (z2) {
                    c51922.m14962(arrayList, 0);
                } else {
                    c51924.m14962(arrayList, 0);
                }
                i3 = 0;
                i4 = 1;
            }
        }
        C5192 c51925 = new C5192("Root", 0);
        ArrayList arrayList2 = new ArrayList(3);
        c0958 = c5192.f16274;
        if (c0958.isEmpty()) {
            i = 0;
        } else {
            arrayList2.add("\\b");
            c09589 = c5192.f16274;
            arrayList2.add(c09589.m3393());
            i = 0;
            c51925.m14962(arrayList2, 0);
            arrayList2.clear();
        }
        c09582 = c51922.f16274;
        if (!c09582.isEmpty()) {
            c09588 = c51922.f16274;
            arrayList2.add(c09588.m3393());
            arrayList2.add("\\b");
            c51925.m14962(arrayList2, i);
            arrayList2.clear();
        }
        c09583 = c51923.f16274;
        if (c09583.isEmpty()) {
            i2 = 0;
        } else {
            arrayList2.add("\\b");
            c09587 = c51923.f16274;
            arrayList2.add(c09587.m3393());
            arrayList2.add("\\b");
            i2 = 0;
            c51925.m14962(arrayList2, 0);
            arrayList2.clear();
        }
        c09584 = c51924.f16274;
        if (!c09584.isEmpty()) {
            c09586 = c51924.f16274;
            arrayList2.add(c09586.m3393());
            c51925.m14962(arrayList2, i2);
            arrayList2.clear();
        }
        c09585 = c51925.f16274;
        ArrayList arrayList3 = new ArrayList(c09585.values());
        Collections.sort(arrayList3);
        StringBuilder sb2 = new StringBuilder("(?:");
        Iterator it3 = arrayList3.iterator();
        boolean z4 = true;
        while (it3.hasNext()) {
            C5192 c51926 = (C5192) it3.next();
            if (z4) {
                z4 = false;
            } else {
                sb2.append('|');
            }
            sb2.append(c51926.m14961());
        }
        sb2.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb2.toString();
    }
}
