package l;

import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: 37E8 */
/* renamed from: l.ۨܽ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC11817 extends AbstractC9701 {

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public String f35252;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public EnumC6172 f35253;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f35254;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public AbstractC19898 f35255;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f35256;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public AbstractC11817 f35257;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public AbstractC11817 f35258;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f35259;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public String f35260;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public ArrayList f35261;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public boolean f35262;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f35263;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public C10242 f35264;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f35265;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C6899 f35266;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public ArrayList f35267;

    /* renamed from: ֫ */
    public boolean mo18620(DataInputStream dataInputStream, EnumC4662 enumC4662, int i) {
        return false;
    }

    /* renamed from: ۜ */
    public void mo18621(int i) {
    }

    public AbstractC11817(AbstractC11817 abstractC11817) {
        super(abstractC11817.f29325);
        this.f35252 = "";
        this.f35260 = null;
        this.f35256 = false;
        this.f35262 = false;
        this.f35253 = EnumC6172.DEFAULT_STATE;
        this.f35255 = abstractC11817.f35255;
        this.f35257 = abstractC11817;
        this.f35264 = abstractC11817.f35264;
    }

    public AbstractC11817(AbstractC19898 abstractC19898) {
        super(abstractC19898.m45780());
        this.f35252 = "";
        this.f35260 = null;
        this.f35256 = false;
        this.f35262 = false;
        this.f35253 = EnumC6172.DEFAULT_STATE;
        this.f35255 = abstractC19898;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m28908() {
        String m37867 = this.f35256 ? C16014.m37867(EnumC15204.f46459.m35967(), " ") : "";
        if (!this.f35262) {
            return m37867;
        }
        StringBuilder m15339 = C5368.m15339(m37867);
        m15339.append(EnumC15204.f46439.m35967() + " ");
        return m15339.toString();
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final EnumC6172 m28902() {
        return this.f35253;
    }

    /* renamed from: ֫ */
    public void mo22276(EnumC6172 enumC6172) {
        this.f35253 = enumC6172;
    }

    /* renamed from: ֫ */
    public void mo7967(List... listArr) {
        for (List<C6445> list : listArr) {
            if (list != null) {
                for (C6445 c6445 : list) {
                    c6445.m24647(this);
                    c6445.mo3021();
                    m24667();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28905(StringBuilder sb, String str, String str2, int i, int i2, int i3) {
        C6491 c6491;
        C6899 c6899 = this.f35266;
        if (c6899 != null) {
            c6491 = c6899.m18670(new Function() { // from class: l.۬ܽ֨
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(AbstractC11817.this.f35264.m25968(((Integer) obj).intValue()));
                }
            });
        } else {
            c6491 = new C6491("", "");
        }
        if (this.f29326) {
            sb.append('#');
            sb.append(i);
            sb.append(":#");
            sb.append(i2);
            sb.append((String) c6491.f20042);
            if (i3 != -1) {
                sb.append(" = #");
                sb.append(i3);
            }
            sb.append(str2);
            if (this.f29343) {
                m24654(sb.toString());
            } else {
                m24661(mo6398(), sb.toString());
                m24654(" // ");
                String name = this.f35257.f35264.getName(i);
                String name2 = this.f35257.f35264.getName(i2);
                Object obj = c6491.f20043;
                if (str == null) {
                    str = "";
                }
                m24654(String.format("%s:%s%s%s", name, name2, obj, str));
            }
        } else {
            sb.append(this.f35257.f35264.getName(i));
            sb.append(':');
            sb.append(this.f35257.f35264.getName(i2));
            sb.append((String) c6491.f20043);
            if (str != null) {
                sb.append(str);
            }
            m24654(((Object) sb) + str2);
        }
        m24667();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28904(DataInputStream dataInputStream) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f35261 = new ArrayList(readUnsignedShort);
        this.f35255.m45778(String.format("%s - Attributes[%d]", this.f35252, Integer.valueOf(readUnsignedShort)), new Object[0]);
        for (int i = 0; i < readUnsignedShort; i++) {
            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
            String m25965 = this.f35257.f35264.m25965(readUnsignedShort2, new C18554(7));
            this.f35255.m45778(String.format("Attribute#%d name[%d]=\"%s\"", Integer.valueOf(i), Integer.valueOf(readUnsignedShort2), m25965), new Object[0]);
            EnumC4662 m13642 = EnumC4662.m13642(m25965);
            int readInt = dataInputStream.readInt();
            C21263 c21263 = new C21263(this.f35255, m13642);
            this.f35261.add(c21263);
            int i2 = C10406.f31304[m13642.ordinal()];
            boolean z = this.f29352;
            switch (i2) {
                case 1:
                    if (readInt != 0) {
                        if (z) {
                            this.f35255.m45770().mo32596("{0}: Invalid attribute length #{1}", m13642.m13647(), Integer.valueOf(readInt));
                        } else {
                            throw new C4375(this.f35255.m45770(), "{0}: Invalid attribute length #{1}", m13642.m13647(), Integer.valueOf(readInt));
                        }
                    }
                    this.f35256 = true;
                    break;
                case 2:
                    if (readInt != 0) {
                        if (z) {
                            this.f35255.m45770().mo32596("{0}: Invalid attribute length #{1}", m13642.m13647(), Integer.valueOf(readInt));
                        } else {
                            throw new C4375(this.f35255.m45770(), "{0}: Invalid attribute length #{1}", m13642.m13647(), Integer.valueOf(readInt));
                        }
                    }
                    this.f35262 = true;
                    break;
                case 3:
                case 4:
                    short readShort = dataInputStream.readShort();
                    ArrayList arrayList = new ArrayList(readShort);
                    boolean z2 = m13642 == EnumC4662.f14790;
                    for (int i3 = 0; i3 < readShort; i3++) {
                        C6445 c6445 = new C6445(this.f35257, z2);
                        c6445.mo17803(dataInputStream);
                        arrayList.add(c6445);
                    }
                    if (z2) {
                        this.f35259 = arrayList;
                        break;
                    } else {
                        this.f35265 = arrayList;
                        break;
                    }
                case 5:
                case 6:
                    short readShort2 = dataInputStream.readShort();
                    ArrayList arrayList2 = new ArrayList(readShort2);
                    boolean z3 = m13642 == EnumC4662.f14816;
                    for (int i4 = 0; i4 < readShort2; i4++) {
                        C7604 c7604 = new C7604(this.f35257, z3);
                        c7604.mo17803(dataInputStream);
                        arrayList2.add(c7604);
                    }
                    if (z3) {
                        this.f35267 = arrayList2;
                        break;
                    } else {
                        this.f35263 = arrayList2;
                        break;
                    }
                case 7:
                    mo18621(readUnsignedShort2);
                    c21263.m48273(readUnsignedShort2, readInt, dataInputStream);
                    break;
                default:
                    if (!mo18620(dataInputStream, m13642, readInt)) {
                        c21263.m48273(readUnsignedShort2, readInt, dataInputStream);
                        break;
                    } else {
                        c21263.m48275(readUnsignedShort2);
                        c21263.m48272(readInt);
                        break;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m28903(final EnumC4662 enumC4662) {
        return C5378.stream(this.f35261).filter(new Predicate() { // from class: l.۫ܽ֨
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
            public final boolean test(Object obj) {
                return ((C21263) obj).m48274().equals(EnumC4662.this);
            }
        }).toList();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m28907(String str) {
        int length;
        int m24656;
        if (this.f29335) {
            length = str.length() + (m24669() * 2) + 7;
            m24656 = m24656();
        } else {
            length = str.length() + (m24669() * 2) + 7;
            m24656 = m24656() * 2;
        }
        return (length - m24656) - m24656();
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m28906() {
        if (this.f35260 == null) {
            this.f35260 = this.f29326 ? "default { " : " default { ";
        }
        return this.f35260;
    }
}
