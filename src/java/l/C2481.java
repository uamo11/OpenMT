package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: P7DJ */
/* renamed from: l.ۖۧ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2481 extends AbstractC11817 {

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public int f7908;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public C6193 f7909;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f7910;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C7419 f7911;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public int f7912;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f7913;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f7914;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f7915;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public boolean f7916;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f7917;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public int f7918;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C7419 f7919;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public C7419 f7920;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f7921;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f7922;

    @Override // l.AbstractC11817
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7967(List... listArr) {
        throw null;
    }

    public C2481(C17503 c17503) {
        super(c17503);
        this.f7915 = new HashMap();
        this.f7913 = new ArrayList(0);
        this.f7914 = new ArrayList(0);
        this.f7916 = true;
        if (c17503.f29335) {
            this.f7918 = 7;
            this.f7922 = 7;
        } else {
            this.f7918 = 7;
            this.f7922 = 7 - m24669();
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m7960(int i) {
        if (i >= 0) {
            byte[] bArr = this.f7921;
            if (i < bArr.length) {
                return bArr[i];
            }
        }
        throw new IndexOutOfBoundsException(this.f35255.m45769("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    private int m7961(int i) {
        if (i >= 0) {
            byte[] bArr = this.f7921;
            if (i < bArr.length) {
                return bArr[i] & 255;
            }
        }
        throw new IndexOutOfBoundsException(this.f35255.m45769("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m7958(int i) {
        if (i >= 0) {
            int i2 = i + 1;
            byte[] bArr = this.f7921;
            if (i2 < bArr.length) {
                return (bArr[i] << 8) | (bArr[i2] & 255);
            }
        }
        throw new IndexOutOfBoundsException(this.f35255.m45769("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private int m7963(int i) {
        if (i >= 0) {
            int i2 = i + 1;
            byte[] bArr = this.f7921;
            if (i2 < bArr.length) {
                return ((bArr[i] << 8) | (bArr[i2] & 255)) & 65535;
            }
        }
        throw new IndexOutOfBoundsException(this.f35255.m45769("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    private int getInt(int i) {
        return (m7958(i + 2) & 65535) | (m7958(i) << 16);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18873 m7968(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f7915;
        C18873 c18873 = (C18873) hashMap.get(valueOf);
        if (c18873 != null) {
            return c18873;
        }
        C17503 c17503 = (C17503) this.f35257;
        C18873 c188732 = new C18873(c17503);
        c188732.f59496 = (short) 0;
        c188732.f59497 = false;
        c188732.f59499 = (C20826) c17503.f35257;
        c188732.m24647(this);
        c188732.m24664(1);
        hashMap.put(valueOf, c188732);
        return c188732;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7966(int i, DataInputStream dataInputStream) {
        C13248 c13248;
        boolean z;
        C7419 c7419;
        this.f7912 = dataInputStream.readUnsignedShort();
        this.f7908 = dataInputStream.readUnsignedShort();
        int readInt = dataInputStream.readInt();
        int i2 = 2;
        this.f35255.m45778("CodeAttr:  CodeLength=%d FullLength=%d max_stack=%d max_locals=%d", Integer.valueOf(readInt), Integer.valueOf(i), Integer.valueOf(this.f7912), Integer.valueOf(this.f7908));
        byte[] bArr = new byte[readInt];
        this.f7921 = bArr;
        dataInputStream.read(bArr, 0, readInt);
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f35255.m45778("CodeAttr:  TrapTable[%d]", Integer.valueOf(readUnsignedShort));
        this.f7914 = new ArrayList(readUnsignedShort);
        for (int i3 = 0; i3 < readUnsignedShort; i3++) {
            ArrayList arrayList = this.f7914;
            C23126 c23126 = new C23126();
            c23126.f74372 = i3;
            c23126.f74371 = dataInputStream.readUnsignedShort();
            c23126.f74369 = dataInputStream.readUnsignedShort();
            c23126.f74370 = dataInputStream.readUnsignedShort();
            c23126.f74368 = dataInputStream.readUnsignedShort();
            arrayList.add(c23126);
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        this.f35255.m45778("CodeAttr: add.attr: %d", Integer.valueOf(readUnsignedShort2));
        int i4 = 0;
        while (i4 < readUnsignedShort2) {
            int readUnsignedShort3 = dataInputStream.readUnsignedShort();
            AbstractC3186 m25953 = this.f35264.m25953(readUnsignedShort3);
            if (m25953 != null && m25953.f10052 == EnumC12358.CONSTANT_UTF8) {
                String m25965 = this.f35264.m25965(readUnsignedShort3, new C6416(7));
                this.f35255.m45778(C20094.m46315("CodeAttr:  attr: ", m25965), new Object[0]);
                final EnumC4662 m13642 = EnumC4662.m13642(m25965);
                switch (C15885.f49071[m13642.ordinal()]) {
                    case 1:
                    case 2:
                        final int readInt2 = dataInputStream.readInt();
                        final int readUnsignedShort4 = dataInputStream.readUnsignedShort();
                        this.f7909 = new C6193(m13642, this, readUnsignedShort4);
                        this.f7916 = true;
                        this.f35255.m45762(new Supplier() { // from class: l.ۡۧ֨
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return String.format("CodeAttr:  %s: attrLength=%d num=%d", EnumC4662.this.name(), Integer.valueOf(readInt2), Integer.valueOf(readUnsignedShort4));
                            }
                        });
                        int i5 = 0;
                        int i6 = 0;
                        boolean z2 = false;
                        int i7 = 0;
                        while (i5 < readUnsignedShort4) {
                            int i8 = C15885.f49071[m13642.ordinal()];
                            if (i8 == 1) {
                                c13248 = new C13248(this, dataInputStream);
                            } else {
                                if (i8 != i2) {
                                    throw new IllegalStateException("Unexpected value: " + m13642);
                                }
                                if (this.f7916) {
                                    if (i5 == 0 || ((Boolean) this.f7909.f18997.get(i5 - 1)).booleanValue()) {
                                        z = true;
                                        c13248 = new C13248(z, i6, this, dataInputStream);
                                    } else {
                                        this.f7916 = false;
                                    }
                                }
                                z = false;
                                c13248 = new C13248(z, i6, this, dataInputStream);
                            }
                            if (c13248.f39672 == EnumC23006.EARLY_LARVAL) {
                                c13248.f39667 = z2;
                                c13248.f39675 = i7;
                                this.f7909.m17113(c13248, true);
                                i7++;
                                z2 = true;
                            } else {
                                c13248.f39667 = z2;
                                c13248.f39675 = i7;
                                this.f7909.m17113(c13248, false);
                                i5++;
                                z2 = false;
                                i7 = 0;
                            }
                            i6 = c13248.f39673;
                            i2 = 2;
                        }
                        break;
                    case 3:
                        int readInt3 = dataInputStream.readInt();
                        int readUnsignedShort5 = dataInputStream.readUnsignedShort();
                        boolean z3 = this.f29346;
                        c7419 = z3 ? new C7419(this, C1233.class, readUnsignedShort5) : null;
                        AbstractC19898 abstractC19898 = this.f35255;
                        Integer valueOf = Integer.valueOf(readUnsignedShort5);
                        Integer valueOf2 = Integer.valueOf(readInt3);
                        Object[] objArr = new Object[i2];
                        objArr[0] = valueOf;
                        objArr[1] = valueOf2;
                        abstractC19898.m45778("CodeAttr:  LineNumberTable[%d] length=%d", objArr);
                        for (int i9 = 0; i9 < readUnsignedShort5; i9++) {
                            C17503 c17503 = (C17503) this.f35257;
                            C1233 c1233 = new C1233();
                            c1233.f4407 = dataInputStream.readShort();
                            c1233.f4405 = dataInputStream.readShort();
                            c1233.f29325 = c17503.f29325;
                            c1233.f4406 = C18307.m42645(c17503.f29335 ? 11 : 9, "%", "s %4d:  %7d");
                            if (z3) {
                                c7419.m19942(c1233);
                            }
                        }
                        this.f7911 = c7419;
                        break;
                    case 4:
                        int readInt4 = dataInputStream.readInt();
                        int readUnsignedShort6 = dataInputStream.readUnsignedShort();
                        boolean z4 = this.f29350;
                        c7419 = z4 ? new C7419(this, C21695.class, readUnsignedShort6) : null;
                        AbstractC19898 abstractC198982 = this.f35255;
                        Integer valueOf3 = Integer.valueOf(readUnsignedShort6);
                        Integer valueOf4 = Integer.valueOf(readInt4);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = valueOf3;
                        objArr2[1] = valueOf4;
                        abstractC198982.m45778("CodeAttr:  LocalVariableTable[%d] length=%d", objArr2);
                        for (int i10 = 0; i10 < readUnsignedShort6; i10++) {
                            C21695 c21695 = new C21695(dataInputStream, (C17503) this.f35257, EnumC15204.f46482.m35967());
                            if (z4) {
                                c7419.m19942(c21695);
                            }
                        }
                        this.f7919 = c7419;
                        break;
                    case 5:
                        int readInt5 = dataInputStream.readInt();
                        int readUnsignedShort7 = dataInputStream.readUnsignedShort();
                        boolean z5 = this.f29332;
                        c7419 = z5 ? new C7419(this, C22400.class, readUnsignedShort7) : null;
                        AbstractC19898 abstractC198983 = this.f35255;
                        Integer valueOf5 = Integer.valueOf(readUnsignedShort7);
                        Integer valueOf6 = Integer.valueOf(readInt5);
                        Object[] objArr3 = new Object[i2];
                        objArr3[0] = valueOf5;
                        objArr3[1] = valueOf6;
                        abstractC198983.m45778("CodeAttr:  LocalVariableTypeTable[%d] length=%d", objArr3);
                        for (int i11 = 0; i11 < readUnsignedShort7; i11++) {
                            C22400 c22400 = new C22400(dataInputStream, (C17503) this.f35257, EnumC15204.f46530.m35967());
                            if (z5) {
                                c7419.m19942(c22400);
                            }
                        }
                        this.f7920 = c7419;
                        break;
                    case 6:
                    case 7:
                        boolean z6 = m13642 == EnumC4662.f14816;
                        int readInt6 = dataInputStream.readInt();
                        short readShort = dataInputStream.readShort();
                        ArrayList arrayList2 = new ArrayList(readShort);
                        AbstractC19898 abstractC198984 = this.f35255;
                        String str = z6 ? "Inv" : "V";
                        Integer valueOf7 = Integer.valueOf(readInt6);
                        Integer valueOf8 = Integer.valueOf(readShort);
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = str;
                        objArr4[1] = valueOf7;
                        objArr4[i2] = valueOf8;
                        abstractC198984.m45778("CodeAttr:   Runtime%sisibleTypeAnnotation: attrLength=%d num= %d", objArr4);
                        for (int i12 = 0; i12 < readShort; i12++) {
                            C7604 c7604 = new C7604((C17503) this.f35257, z6);
                            c7604.mo17803(dataInputStream);
                            arrayList2.add(c7604);
                        }
                        if (z6) {
                            this.f7910 = arrayList2;
                            break;
                        } else {
                            this.f7917 = arrayList2;
                            break;
                        }
                    default:
                        C21263 c21263 = new C21263(this.f35255, m13642);
                        c21263.m48273(readUnsignedShort3, dataInputStream.readInt(), dataInputStream);
                        this.f7913.add(c21263);
                        break;
                }
            }
            i4++;
            i2 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x086b  */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m7965(int r22, int r23) {
        /*
            Method dump skipped, instructions count: 2304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2481.m7965(int, int):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7959(byte b, ArrayList arrayList, int i) {
        this.f29325.mo1968(m24657(18, EnumC15536.f47470.m36618()));
        StringBuilder sb = new StringBuilder();
        int i2 = C23424.f75225;
        int i3 = 2;
        while (i3 > 0 && (b >> ((i3 - 1) * 4)) == 0) {
            i3--;
        }
        sb.append(C23424.m51890(i3, b));
        sb.append(l.b);
        m24662(sb.toString());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte byteValue = ((Byte) it.next()).byteValue();
            this.f29325.mo1968(m24652(i, " "));
            this.f29325.mo1968(m24657(18, EnumC15536.f47470.m36618()));
            StringBuilder sb2 = new StringBuilder();
            int i4 = 2;
            while (i4 > 0 && (byteValue >> ((i4 - 1) * 4)) == 0) {
                i4--;
            }
            sb2.append(C23424.m51890(i4, byteValue));
            sb2.append(l.b);
            m24662(sb2.toString());
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private ArrayList m7964(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int length = this.f7921.length;
        for (int i3 = 1; i3 <= i2 && i + i3 < length; i3++) {
            arrayList.add(Byte.valueOf(this.f7921[i3]));
        }
        return arrayList;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C6491[] m7962(int i, int i2) {
        try {
            C6491[] c6491Arr = new C6491[i2];
            for (int i3 = 1; i3 <= i2; i3++) {
                int i4 = i3 * 8;
                c6491Arr[i3 - 1] = new C6491(Integer.valueOf(getInt(i + i4)), Integer.valueOf(getInt(i + 4 + i4)));
            }
            return c6491Arr;
        } catch (NegativeArraySizeException unused) {
            throw new IndexOutOfBoundsException(this.f35255.m45769("The index {0} is out of range for the code array of the method.", Integer.valueOf(i2)));
        }
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* renamed from: ۧ */
    public final void mo3021() {
        int i;
        C7419 c7419 = this.f7911;
        if (c7419 != null) {
            Iterator it = c7419.f22796.iterator();
            while (it.hasNext()) {
                C1233 c1233 = (C1233) it.next();
                m7968(c1233.f4407).f59496 = c1233.f4405;
            }
        }
        C6193 c6193 = this.f7909;
        HashMap hashMap = this.f7915;
        if (c6193 != null && !this.f29347) {
            boolean z = true;
            ArrayList arrayList = null;
            for (int i2 = 0; i2 < this.f7909.f22796.size(); i2++) {
                C13248 c13248 = (C13248) ((AbstractC9701) this.f7909.f22796.get(i2));
                if (((Boolean) this.f7909.f18997.get(i2)).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c13248);
                } else {
                    C18873 m7968 = m7968(c13248.f39673);
                    m7968.f59503 = c13248;
                    m7968.f59504 = arrayList;
                    z = false;
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                (z ? (C18873) hashMap.get(Collections.min(hashMap.keySet())) : (C18873) hashMap.get(Collections.max(hashMap.keySet()))).f59504 = arrayList;
            }
        }
        if (!((C17503) this.f35257).f29335) {
            int i3 = 0;
            while (i3 < this.f7921.length) {
                EnumC15536 m50569 = C22593.m50569(Integer.valueOf(m7961(i3)));
                if (m50569 == null) {
                    try {
                        m7968(i3).f59497 = true;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                    i = 1;
                    i3 += i;
                } else {
                    switch (C15885.f49072[m50569.ordinal()]) {
                        case 1:
                            int i4 = (i3 + 4) & (-4);
                            try {
                                int i5 = getInt(i4);
                                int i6 = getInt(i4 + 8) - getInt(i4 + 4);
                                for (int i7 = 0; i7 <= i6; i7++) {
                                    m7968(getInt((i7 * 4) + i4 + 12) + i3).f59497 = true;
                                }
                                m7968(i5 + i3).f59497 = true;
                                i = (i4 - i3) + 16 + (i6 * 4);
                                break;
                            } catch (IndexOutOfBoundsException e) {
                                this.f35255.m45761(e);
                                m7968(i3).f59497 = true;
                                break;
                            }
                        case 2:
                            int i8 = (i3 + 4) & (-4);
                            try {
                                int i9 = getInt(i8);
                                int i10 = i8 + 4;
                                int i11 = getInt(i10);
                                for (int i12 = 1; i12 <= i11; i12++) {
                                    m7968(getInt((i12 * 8) + i10) + i3).f59497 = true;
                                }
                                m7968(i9 + i3).f59497 = true;
                                i = C20094.m46314(i11, 1, 8, i8 - i3);
                                break;
                            } catch (IndexOutOfBoundsException e2) {
                                this.f35255.m45761(e2);
                                m7968(i3).f59497 = true;
                                break;
                            }
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                            try {
                                m7968(m7958(i3 + 1) + i3).f59497 = true;
                                i = 3;
                                break;
                            } catch (IndexOutOfBoundsException e3) {
                                this.f35255.m45761(e3);
                                m7968(i3).f59497 = true;
                                break;
                            }
                        case 21:
                        case 22:
                            m7968(getInt(i3 + 1) + i3).f59497 = true;
                            i = 5;
                            break;
                        case 23:
                        case 24:
                        case 25:
                            m50569 = C22593.m50569(Integer.valueOf((m50569.m36614().intValue() << 8) + m7961(i3 + 1)));
                            if (m50569 != null && (i = m50569.m36619()) != 0) {
                                break;
                            }
                            i = 1;
                            break;
                        default:
                            if (m50569 != null) {
                                break;
                            }
                            i = 1;
                            break;
                    }
                    i3 += i;
                }
                i = 1;
                i3 += i;
            }
        }
        Iterator it2 = this.f7914.iterator();
        while (it2.hasNext()) {
            C23126 c23126 = (C23126) it2.next();
            C18873 m79682 = m7968(c23126.f74371);
            if (m79682.f59494 == null) {
                m79682.f59494 = new ArrayList(4);
            }
            m79682.f59494.add(c23126);
            C18873 m79683 = m7968(c23126.f74369);
            if (m79683.f59505 == null) {
                m79683.f59505 = new ArrayList(4);
            }
            m79683.f59505.add(c23126);
            C18873 m79684 = m7968(c23126.f74370);
            if (m79684.f59502 == null) {
                m79684.f59502 = new ArrayList(4);
            }
            m79684.f59502.add(c23126);
        }
        C7419 c74192 = this.f7919;
        if (c74192 != null) {
            Iterator it3 = c74192.f22796.iterator();
            while (it3.hasNext()) {
                C21695 c21695 = (C21695) it3.next();
                C18873 m79685 = m7968(c21695.f47016);
                if (m79685.f59495 == null) {
                    m79685.f59495 = new ArrayList(4);
                }
                m79685.f59495.add(c21695);
                C18873 m79686 = m7968(c21695.f47016 + c21695.f47015);
                if (m79686.f59500 == null) {
                    m79686.f59500 = new ArrayList(4);
                }
                m79686.f59500.add(c21695);
            }
        }
        C7419 c74193 = this.f7920;
        if (c74193 != null) {
            Iterator it4 = c74193.f22796.iterator();
            while (it4.hasNext()) {
                C22400 c22400 = (C22400) it4.next();
                C18873 m79687 = m7968(c22400.f47016);
                if (m79687.f59498 == null) {
                    m79687.f59498 = new ArrayList(4);
                }
                m79687.f59498.add(c22400);
                C18873 m79688 = m7968(c22400.f47016 + c22400.f47015);
                if (m79688.f59501 == null) {
                    m79688.f59501 = new ArrayList(4);
                }
                m79688.f59501.add(c22400);
            }
        }
        m24664(1);
        m24659("%s %d  %s %d", EnumC15204.f46564.m35967(), Integer.valueOf(this.f7912), EnumC15204.f46601.m35967(), Integer.valueOf(this.f7908));
        m24653(1);
        ((C17503) this.f35257).m40892();
        m24665("{");
        C18873 c18873 = (C18873) hashMap.get(0);
        int i13 = this.f29349;
        int i14 = this.f7918;
        this.f29349 = (i13 - i14) - m24656();
        int i15 = 0;
        while (i15 < this.f7921.length) {
            int i16 = this.f7922;
            if (c18873 != null) {
                m24664(1);
                c18873.f29349 = this.f29349;
                c18873.m43593(i16);
                m24653(1);
            }
            if (((C17503) this.f35257).f29335) {
                m24664(1);
                m24658(m24657(i14, String.format("%2d:", Integer.valueOf(i15))));
            } else {
                m24658(m24657(i14, (c18873 == null || !c18873.f59497) ? " " : ((C17503) this.f35257).m24668() + i15 + ":"));
                m24664(1);
            }
            if (c18873 != null && c18873.m43591(i16)) {
                m24654(m24663(i16, ""));
            }
            i15 += m7965(i15, m24656() + i16);
            c18873 = (C18873) hashMap.get(Integer.valueOf(i15));
            if (c18873 != null) {
                c18873.m43592(i16);
                m24653(1);
            }
            m24653(1);
        }
        if (c18873 != null && c18873.f59503 != null && c18873.f59497) {
            C17503 c17503 = (C17503) this.f35257;
            if (c17503.f29335) {
                m24664(1);
                m24658(m24657(0, String.format("%2d:", Integer.valueOf(this.f7921.length))));
                m24653(1);
            } else {
                m24655(m24657(this.f7921.length, String.format("%s%d:", c17503.m24668(), Integer.valueOf(this.f7921.length))), 0);
            }
        }
        List[] listArr = {this.f7917, this.f7910};
        boolean z2 = true;
        for (int i17 = 0; i17 < 2; i17++) {
            List list = listArr[i17];
            if (list != null) {
                if (z2) {
                    this.f29325.mo1973("");
                }
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    ((C6445) it5.next()).mo3021();
                    m24667();
                    z2 = false;
                }
            }
        }
        C7419[] c7419Arr = {this.f7911, this.f7919, this.f7920, this.f7909};
        for (int i18 = 0; i18 < 4; i18++) {
            C7419 c74194 = c7419Arr[i18];
            if (c74194 != null && c74194.mo4066()) {
                c74194.f29349 = this.f29349;
                c74194.mo3021();
            }
        }
        m24665(l.d);
    }
}
