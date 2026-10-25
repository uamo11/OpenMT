package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.bouncycastle.asn1.util.ASN1Dump;

/* compiled from: Y43E */
/* renamed from: l.ۗᩴ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3419 extends C12696 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f10792 = {"", EnumC0121.f1143, ASN1Dump.TAB, "      ", EnumC0121.f1160, "          ", "            ", "              ", "                ", "                  ", "                    "};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4935 f10793;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f10794 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PrintWriter f10795;

    public C3419(PrintWriter printWriter, C21290 c21290) {
        this.f10795 = new PrintWriter(printWriter);
        this.f10793 = c21290;
    }

    @Override // l.C10580, l.AbstractC8463
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10386(C0052 c0052, Object obj) {
        m10394((InterfaceC11970) c0052, Boolean.FALSE);
        boolean m954 = c0052.m954();
        PrintWriter printWriter = this.f10795;
        if (m954) {
            printWriter.println("// Unnamed module");
            return this;
        }
        if (c0052.f916.contains(EnumC18398.OPEN)) {
            printWriter.print("open ");
        }
        printWriter.println("module " + ((Object) c0052.f17562) + " {");
        this.f10794 = this.f10794 + 1;
        c0052.m16103();
        InterfaceC6403 interfaceC6403 = c0052.f923;
        InterfaceC6403 interfaceC64032 = InterfaceC6403.f19811;
        if (interfaceC6403 != interfaceC64032) {
            c0052.f923 = interfaceC64032;
            interfaceC6403.mo7076(c0052);
        }
        for (InterfaceC11286 interfaceC11286 : C20195.unmodifiableList(c0052.f920)) {
            m10381();
            interfaceC11286.mo24769(new C4830(printWriter));
            printWriter.println(l.b);
        }
        this.f10794--;
        printWriter.println(l.d);
        return this;
    }

    @Override // l.C10580, l.AbstractC8463
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10387(C3581 c3581, Object obj) {
        EnumC23258 mo952 = c3581.mo952();
        if (mo952 != EnumC23258.STATIC_INIT && mo952 != EnumC23258.INSTANCE_INIT) {
            InterfaceC11970 mo7176 = c3581.mo7176();
            if (mo952 != EnumC23258.CONSTRUCTOR || mo7176 == null || EnumC23985.ANONYMOUS != mo7176.mo951(new C22469(), null)) {
                m10394((InterfaceC11970) c3581, Boolean.TRUE);
                m10383((InterfaceC7052) c3581, true);
                int i = C15412.f47205[mo952.ordinal()];
                PrintWriter printWriter = this.f10795;
                if (i == 1) {
                    printWriter.print(c3581.mo7176().mo960());
                } else if (i == 2) {
                    printWriter.print(c3581.mo7179().toString());
                    printWriter.print(" ");
                    printWriter.print(c3581.mo960().toString());
                }
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
                m10384((InterfaceC14085) c3581);
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
                AbstractC8624 mo7175 = c3581.mo7175();
                if (mo7175 != null) {
                    printWriter.print(" default " + mo7175);
                }
                C2609 mo7174 = c3581.mo7174();
                int m8245 = mo7174.m8245();
                if (m8245 != 0) {
                    printWriter.print(" throws");
                    Iterator it = mo7174.iterator();
                    int i2 = 1;
                    while (it.hasNext()) {
                        InterfaceC5641 interfaceC5641 = (InterfaceC5641) it.next();
                        if (i2 == 1) {
                            printWriter.print(" ");
                        }
                        if (i2 == 2) {
                            this.f10794++;
                        }
                        if (i2 >= 2) {
                            m10381();
                        }
                        printWriter.print(interfaceC5641);
                        if (i2 != m8245) {
                            printWriter.println(", ");
                        }
                        i2++;
                    }
                    if (m8245 >= 2) {
                        this.f10794--;
                    }
                }
                printWriter.println(l.b);
            }
        }
        return this;
    }

    @Override // l.C10580, l.AbstractC8463
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10388(C4287 c4287, Object obj) {
        this.f10795.print(c4287.f17562);
        return this;
    }

    @Override // l.C10580
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo10389(AbstractC5698 abstractC5698, Object obj) {
        m10394((InterfaceC11970) abstractC5698, (Boolean) obj);
        return this;
    }

    @Override // l.C10580, l.AbstractC8463
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10390(C7814 c7814, Object obj) {
        m10394((InterfaceC11970) c7814, Boolean.FALSE);
        boolean m20880 = c7814.m20880();
        PrintWriter printWriter = this.f10795;
        if (!m20880) {
            printWriter.println("package " + ((Object) c7814.f24143) + l.b);
            return this;
        }
        printWriter.println("// Unnamed package");
        return this;
    }

    @Override // l.C10580, l.AbstractC8463
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10391(C12048 c12048, Object obj) {
        EnumC23258 mo952 = c12048.mo952();
        m10394((InterfaceC11970) c12048, (Boolean) obj);
        EnumC23258 enumC23258 = EnumC23258.ENUM_CONSTANT;
        PrintWriter printWriter = this.f10795;
        if (mo952 == enumC23258) {
            printWriter.print(c12048.mo960());
            return this;
        }
        printWriter.print(c12048.mo29242().toString() + " " + ((Object) c12048.mo960()));
        Object m29424 = c12048.m29424();
        if (m29424 != null) {
            printWriter.print(" = ");
            ((C21290) this.f10793).getClass();
            printWriter.print(C21953.m49443(m29424));
        }
        printWriter.println(l.b);
        return this;
    }

    @Override // l.AbstractC8463
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10392(C14163 c14163, Object obj) {
        EnumC23258 mo952 = c14163.mo952();
        EnumC23985 m33812 = c14163.m33812();
        EnumC23985 enumC23985 = EnumC23985.ANONYMOUS;
        int i = 0;
        PrintWriter printWriter = this.f10795;
        if (enumC23985 == m33812) {
            printWriter.print("new ");
            C2609 m33806 = c14163.m33806();
            if (m33806.isEmpty()) {
                printWriter.print(c14163.mo23577());
            } else {
                printWriter.print(m33806.get(0));
            }
            printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
            if (m33806.isEmpty()) {
                ArrayList m36585 = C15517.m36585(c14163.mo958());
                if (!m36585.isEmpty()) {
                    m10384((InterfaceC14085) m36585.get(0));
                }
            }
            printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
        } else {
            if (m33812 == EnumC23985.TOP_LEVEL) {
                C7814 m48321 = ((C21290) this.f10793).m48321(c14163);
                if (!m48321.m20880()) {
                    printWriter.print("package " + ((Object) m48321.f24143) + ";\n");
                }
            }
            m10394((InterfaceC11970) c14163, Boolean.TRUE);
            if (C15412.f47205[mo952.ordinal()] != 3) {
                printWriter.print(mo952.toString().toLowerCase(Locale.US));
            } else {
                printWriter.print("@interface");
            }
            printWriter.print(" ");
            printWriter.print(c14163.f17562);
            m10383((InterfaceC7052) c14163, false);
            if (mo952 == EnumC23258.RECORD) {
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
                printWriter.print((String) C5378.stream(c14163.m33809()).map(new C14205(this)).collect(C22976.joining(", ")));
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            if (mo952 == EnumC23258.CLASS) {
                InterfaceC5641 mo23577 = c14163.mo23577();
                EnumC0701 mo3256 = mo23577.mo3256();
                EnumC0701 enumC0701 = EnumC0701.NONE;
                if (mo3256 != enumC0701 && ((InterfaceC9169) ((InterfaceC19753) mo23577).mo45454()).mo23577().mo3256() != enumC0701) {
                    printWriter.print(" extends " + mo23577);
                }
            }
            EnumC23258 mo9522 = c14163.mo952();
            if (mo9522 != EnumC23258.ANNOTATION_TYPE) {
                C2609 m338062 = c14163.m33806();
                if (!m338062.isEmpty()) {
                    printWriter.print(mo9522.m51578() ? " implements " : " extends ");
                    printWriter.print((String) C5378.stream(m338062).map(new C16599(7)).collect(C22976.joining(", ")));
                }
            }
            C2609 m8243 = c14163.f42765.m8243((Function) new C22827(6));
            if (!m8243.isEmpty()) {
                printWriter.print(" permits ");
                printWriter.print((String) C5378.stream(m8243).map(new C6639(6)).collect(C22976.joining(", ")));
            }
        }
        printWriter.println(" {");
        this.f10794++;
        if (mo952 == EnumC23258.ENUM) {
            ArrayList arrayList = new ArrayList(c14163.mo958());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC11970 interfaceC11970 = (InterfaceC11970) it.next();
                if (interfaceC11970.mo952() == EnumC23258.ENUM_CONSTANT) {
                    arrayList2.add(interfaceC11970);
                }
            }
            if (!arrayList2.isEmpty()) {
                while (i < arrayList2.size() - 1) {
                    ((InterfaceC11970) arrayList2.get(i)).mo951(this, Boolean.TRUE);
                    printWriter.print(",");
                    i++;
                }
                ((InterfaceC11970) arrayList2.get(i)).mo951(this, Boolean.TRUE);
                printWriter.println(";\n");
                arrayList.removeAll(arrayList2);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC11970) it2.next()).mo951(this, null);
            }
        } else {
            Iterator it3 = (mo952 != EnumC23258.RECORD ? c14163.mo958() : C5378.stream(c14163.mo958()).filter(new Predicate() { // from class: l.᩸ᩴ۠
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((C21290) C3419.this.f10793).m48326((InterfaceC11970) obj2) == EnumC20458.EXPLICIT;
                }
            }).toList()).iterator();
            while (it3.hasNext()) {
                ((InterfaceC11970) it3.next()).mo951(this, null);
            }
        }
        this.f10794--;
        m10381();
        printWriter.println(l.d);
        return this;
    }

    @Override // l.C10580, l.AbstractC8463
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10393(C21221 c21221, Object obj) {
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10394(InterfaceC11970 interfaceC11970, Boolean bool) {
        PrintWriter printWriter = this.f10795;
        if (bool != null && bool.booleanValue()) {
            printWriter.println();
        }
        String m48325 = ((C21290) this.f10793).m48325(interfaceC11970);
        if (m48325 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(m48325, "\n\r");
            m10381();
            printWriter.println("/**");
            while (stringTokenizer.hasMoreTokens()) {
                m10381();
                printWriter.print(" *");
                printWriter.println(stringTokenizer.nextToken());
            }
            m10381();
            printWriter.println(" */");
        }
        m10385(interfaceC11970);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m10378(InterfaceC9875 interfaceC9875) {
        return m10379((InterfaceC11970) interfaceC9875) + interfaceC9875.mo29242().toString() + " " + ((Object) interfaceC9875.mo960());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m10385(InterfaceC11970 interfaceC11970) {
        EnumC23258 mo952 = interfaceC11970.mo952();
        EnumC23258 enumC23258 = EnumC23258.PARAMETER;
        PrintWriter printWriter = this.f10795;
        if (mo952 == enumC23258 || mo952 == EnumC23258.RECORD_COMPONENT) {
            printWriter.print(m10379(interfaceC11970));
        } else {
            Iterator it = interfaceC11970.mo7180().iterator();
            while (it.hasNext()) {
                InterfaceC12675 interfaceC12675 = (InterfaceC12675) it.next();
                boolean z = false;
                if (((C21290) this.f10793).m48323(interfaceC12675) == EnumC20458.MANDATED) {
                    Set entrySet = interfaceC12675.mo30950().entrySet();
                    if (entrySet.size() == 1) {
                        AbstractC19810 mo45454 = interfaceC12675.mo30951().mo45454();
                        InterfaceC10559 interfaceC10559 = (InterfaceC10559) ((Map.Entry) entrySet.iterator().next()).getValue();
                        if (mo45454.mo952() == EnumC23258.ANNOTATION_TYPE) {
                            ArrayList m36586 = C15517.m36586(mo45454.mo958());
                            if (m36586.size() == 1) {
                                InterfaceC14085 interfaceC14085 = (InterfaceC14085) m36586.get(0);
                                AbstractC4308 mo7179 = interfaceC14085.mo7179();
                                if (b.d.equals(interfaceC14085.mo960().toString()) && mo7179.mo3256() == EnumC0701.ARRAY) {
                                    z = ((Boolean) interfaceC10559.mo5381(new C20353(this))).booleanValue();
                                }
                            }
                        }
                    }
                }
                if (!z) {
                    m10381();
                    printWriter.println(interfaceC12675);
                }
            }
            m10381();
        }
        if (mo952 == EnumC23258.ENUM_CONSTANT || mo952 == EnumC23258.RECORD_COMPONENT) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(interfaceC11970.mo10965());
        switch (C15412.f47205[mo952.ordinal()]) {
            case 2:
            case 7:
                InterfaceC11970 mo7176 = interfaceC11970.mo7176();
                if (mo7176 != null && mo7176.mo952().m51580()) {
                    linkedHashSet.remove(EnumC2113.f7050);
                    linkedHashSet.remove(EnumC2113.f7060);
                    linkedHashSet.remove(EnumC2113.f7061);
                    linkedHashSet.remove(EnumC2113.f7049);
                    break;
                }
                break;
            case 3:
            case 4:
                linkedHashSet.remove(EnumC2113.f7060);
                break;
            case 5:
                linkedHashSet.remove(EnumC2113.f7049);
                linkedHashSet.remove(EnumC2113.f7060);
                linkedHashSet.remove(EnumC2113.f7054);
                break;
            case 6:
                linkedHashSet.remove(EnumC2113.f7049);
                break;
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        printWriter.print((String) C5378.stream(linkedHashSet).map(new C17576(9)).collect(C22976.joining(" ", "", " ")));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10383(InterfaceC7052 interfaceC7052, boolean z) {
        C2609 mo7178 = interfaceC7052.mo7178();
        if (mo7178.isEmpty()) {
            return;
        }
        String str = (String) C5378.stream(mo7178).map(new C22536(this)).collect(C22976.joining(", ", "<", ">"));
        PrintWriter printWriter = this.f10795;
        printWriter.print(str);
        if (z) {
            printWriter.print(" ");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m10380(InterfaceC16223 interfaceC16223) {
        return m10379((InterfaceC11970) interfaceC16223) + interfaceC16223.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10379(InterfaceC11970 interfaceC11970) {
        C2609 mo7180 = interfaceC11970.mo7180();
        return mo7180.isEmpty() ? "" : (String) C5378.stream(mo7180).map(new C21673(5)).collect(C22976.joining(" ", "", " "));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10384(InterfaceC14085 interfaceC14085) {
        C2609 parameters = interfaceC14085.getParameters();
        int m8245 = parameters.m8245();
        if (m8245 != 0) {
            PrintWriter printWriter = this.f10795;
            if (m8245 == 1) {
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    InterfaceC4230 interfaceC4230 = (InterfaceC4230) it.next();
                    m10385(interfaceC4230);
                    if (interfaceC14085.mo10957()) {
                        AbstractC4308 mo29242 = interfaceC4230.mo29242();
                        if (mo29242.mo3256() != EnumC0701.ARRAY) {
                            throw new AssertionError("Var-args parameter is not an array type: " + mo29242);
                        }
                        printWriter.print(((InterfaceC19047) InterfaceC19047.class.cast(mo29242)).mo1358());
                        printWriter.print("...");
                    } else {
                        printWriter.print(interfaceC4230.mo29242());
                    }
                    printWriter.print(" " + ((Object) interfaceC4230.mo960()));
                }
                return;
            }
            Iterator it2 = parameters.iterator();
            int i = 1;
            while (it2.hasNext()) {
                InterfaceC4230 interfaceC42302 = (InterfaceC4230) it2.next();
                if (i == 2) {
                    this.f10794++;
                }
                if (i > 1) {
                    m10381();
                }
                m10385(interfaceC42302);
                if (i == m8245 && interfaceC14085.mo10957()) {
                    AbstractC4308 mo292422 = interfaceC42302.mo29242();
                    if (mo292422.mo3256() != EnumC0701.ARRAY) {
                        throw new AssertionError("Var-args parameter is not an array type: " + mo292422);
                    }
                    printWriter.print(((InterfaceC19047) InterfaceC19047.class.cast(mo292422)).mo1358());
                    printWriter.print("...");
                } else {
                    printWriter.print(interfaceC42302.mo29242());
                }
                printWriter.print(" " + ((Object) interfaceC42302.mo960()));
                if (i < m8245) {
                    printWriter.println(",");
                }
                i++;
            }
            if (parameters.m8245() >= 2) {
                this.f10794--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m10381() {
        int i = this.f10794;
        if (i < 0) {
            return;
        }
        while (true) {
            String[] strArr = f10792;
            PrintWriter printWriter = this.f10795;
            if (i > 10) {
                printWriter.print(strArr[10]);
                i -= 10;
            } else {
                printWriter.print(strArr[i]);
                return;
            }
        }
    }
}
