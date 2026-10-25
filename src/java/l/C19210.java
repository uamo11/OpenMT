package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: 29QV */
/* renamed from: l.᩵ۘۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19210 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C19210 f60475;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f60476 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21368 f60477;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f60478;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f60479;

    public /* synthetic */ C19210(C21368 c21368, int i) {
        this(c21368);
    }

    public C19210() {
        this.f60477 = new C2318(16);
    }

    public C19210(C21368 c21368) {
        this.f60477 = c21368;
        m44326();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C19210 m44301() {
        return new C19210();
    }

    public final C19210 clone() {
        C21368 c21368;
        C19210 c19210 = new C19210();
        int i = 0;
        while (true) {
            c21368 = this.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            Map.Entry m48428 = c21368.m48428(i);
            c19210.m44316((InterfaceC18504) m48428.getKey(), m48428.getValue());
            i++;
        }
        for (Map.Entry entry : c21368.m48429()) {
            c19210.m44316((InterfaceC18504) entry.getKey(), entry.getValue());
        }
        c19210.f60478 = this.f60478;
        return c19210;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C19210 m44302() {
        return f60475;
    }

    static {
        C19210 c19210 = new C19210(new C2318(0));
        c19210.m44326();
        f60475 = c19210;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m44324() {
        return this.f60477.isEmpty();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44326() {
        if (this.f60479) {
            return;
        }
        int i = 0;
        while (true) {
            C21368 c21368 = this.f60477;
            if (i < c21368.m48427()) {
                Map.Entry m48428 = c21368.m48428(i);
                if (m48428.getValue() instanceof AbstractC21760) {
                    AbstractC21760 abstractC21760 = (AbstractC21760) m48428.getValue();
                    abstractC21760.getClass();
                    C11345 m28053 = C11345.m28053();
                    m28053.getClass();
                    m28053.m28054(abstractC21760.getClass()).mo24198((Object) abstractC21760);
                    abstractC21760.m49082();
                }
                i++;
            } else {
                c21368.mo7575();
                this.f60479 = true;
                return;
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m44322() {
        return this.f60479;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19210) {
            return this.f60477.equals(((C19210) obj).f60477);
        }
        return false;
    }

    public final int hashCode() {
        return this.f60477.hashCode();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map m44320() {
        boolean z = this.f60478;
        C21368 c21368 = this.f60477;
        if (!z) {
            return c21368.m48430() ? c21368 : C20195.unmodifiableMap(c21368);
        }
        C2318 m44292 = m44292(c21368, false, true);
        if (c21368.m48430()) {
            m44292.mo7575();
        }
        return m44292;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2318 m44292(C21368 c21368, boolean z, boolean z2) {
        int i = C21368.f68833;
        C2318 c2318 = new C2318(16);
        for (int i2 = 0; i2 < c21368.m48427(); i2++) {
            m44294(c2318, c21368.m48428(i2), z, z2);
        }
        Iterator it = c21368.m48429().iterator();
        while (it.hasNext()) {
            m44294(c2318, (Map.Entry) it.next(), z, z2);
        }
        return c2318;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44294(Map map, Map.Entry entry, boolean z, boolean z2) {
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof C9081)) {
            ((C2318) map).m48425(interfaceC18504, ((C9081) value).m23442());
        } else if (!z || !(value instanceof List)) {
            ((C2318) map).m48425(interfaceC18504, value);
        } else {
            ((C2318) map).m48425(interfaceC18504, new ArrayList((List) value));
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Iterator m44319() {
        boolean z = this.f60478;
        C21368 c21368 = this.f60477;
        if (z) {
            return new C9787(((C15016) c21368.entrySet()).iterator());
        }
        return ((C15016) c21368.entrySet()).iterator();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Iterator m44313() {
        boolean z = this.f60478;
        C21368 c21368 = this.f60477;
        if (z) {
            return new C9787(((C18546) c21368.m48426()).iterator());
        }
        return ((C18546) c21368.m48426()).iterator();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44318(C0117 c0117) {
        if (c0117.mo1129()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f60477.get(c0117) != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m44312(InterfaceC18504 interfaceC18504) {
        Object obj = this.f60477.get(interfaceC18504);
        return obj instanceof C9081 ? ((C9081) obj).m23442() : obj;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44316(InterfaceC18504 interfaceC18504, Object obj) {
        if (interfaceC18504.mo1129()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m44308(interfaceC18504, it.next());
            }
            obj = arrayList;
        } else {
            m44308(interfaceC18504, obj);
        }
        if (obj instanceof C9081) {
            this.f60478 = true;
        }
        this.f60477.m48425(interfaceC18504, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44314(C0117 c0117, Object obj) {
        List list;
        if (!c0117.mo1129()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m44308(c0117, obj);
        Object m44312 = m44312((InterfaceC18504) c0117);
        if (m44312 == null) {
            list = new ArrayList();
            this.f60477.m48425(c0117, list);
        } else {
            list = (List) m44312;
        }
        list.add(obj);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m44308(InterfaceC18504 interfaceC18504, Object obj) {
        if (!m44310(interfaceC18504.mo1142(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC18504.getNumber()), interfaceC18504.mo1142().m19146(), obj.getClass().getName()));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m44310(EnumC7132 enumC7132, Object obj) {
        byte[] bArr = C13997.f41722;
        obj.getClass();
        switch (C2276.f7370[enumC7132.m19146().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC5886) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC3415)) {
                }
                break;
            case 9:
                if ((obj instanceof InterfaceC8522) || (obj instanceof C9081)) {
                }
                break;
        }
        return false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m44327() {
        int i = 0;
        while (true) {
            C21368 c21368 = this.f60477;
            if (i < c21368.m48427()) {
                if (!m44309(c21368.m48428(i))) {
                    return false;
                }
                i++;
            } else {
                Iterator it = c21368.m48429().iterator();
                while (it.hasNext()) {
                    if (!m44309((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m44309(Map.Entry entry) {
        boolean z;
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        if (interfaceC18504.mo1140() == EnumC1694.MESSAGE) {
            if (interfaceC18504.mo1129()) {
                for (Object obj : (List) entry.getValue()) {
                    if (obj instanceof InterfaceC15576) {
                        z = ((InterfaceC15576) obj).isInitialized();
                    } else {
                        if (!(obj instanceof C9081)) {
                            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                        }
                        z = true;
                    }
                    if (!z) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC15576) {
                    return ((InterfaceC15576) value).isInitialized();
                }
                if (value instanceof C9081) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44317(C19210 c19210) {
        C21368 c21368;
        int i = 0;
        while (true) {
            c21368 = c19210.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            m44311(c21368.m48428(i));
            i++;
        }
        Iterator it = c21368.m48429().iterator();
        while (it.hasNext()) {
            m44311((Map.Entry) it.next());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m44306(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m44311(Map.Entry entry) {
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C9081;
        boolean mo1129 = interfaceC18504.mo1129();
        C21368 c21368 = this.f60477;
        if (mo1129) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object m44312 = m44312(interfaceC18504);
            if (m44312 == null) {
                m44312 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) m44312).add(m44306(it.next()));
            }
            c21368.m48425(interfaceC18504, m44312);
            return;
        }
        if (interfaceC18504.mo1140() != EnumC1694.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            c21368.m48425(interfaceC18504, m44306(value));
            return;
        }
        Object m443122 = m44312(interfaceC18504);
        if (m443122 == null) {
            c21368.m48425(interfaceC18504, m44306(value));
            if (z) {
                this.f60478 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C9081) value).m23442();
        }
        c21368.m48425(interfaceC18504, interfaceC18504.mo1124(((InterfaceC8522) m443122).toBuilder(), (InterfaceC8522) value).build());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44321(AbstractC14766 abstractC14766) {
        C21368 c21368;
        int i = 0;
        while (true) {
            c21368 = this.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            Map.Entry m48428 = c21368.m48428(i);
            m44297((InterfaceC18504) m48428.getKey(), m48428.getValue(), abstractC14766);
            i++;
        }
        for (Map.Entry entry : c21368.m48429()) {
            m44297((InterfaceC18504) entry.getKey(), entry.getValue(), abstractC14766);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44315(AbstractC14766 abstractC14766) {
        C21368 c21368;
        int i = 0;
        while (true) {
            c21368 = this.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            m44293(c21368.m48428(i), abstractC14766);
            i++;
        }
        Iterator it = c21368.m48429().iterator();
        while (it.hasNext()) {
            m44293((Map.Entry) it.next(), abstractC14766);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44293(Map.Entry entry, AbstractC14766 abstractC14766) {
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        if (interfaceC18504.mo1140() == EnumC1694.MESSAGE && !interfaceC18504.mo1129() && !interfaceC18504.mo1143()) {
            Object value = entry.getValue();
            if (value instanceof C9081) {
                abstractC14766.mo35103(((InterfaceC18504) entry.getKey()).getNumber(), ((C9081) value).m38047());
                return;
            } else {
                abstractC14766.mo35108(((InterfaceC18504) entry.getKey()).getNumber(), (InterfaceC8522) value);
                return;
            }
        }
        m44297(interfaceC18504, entry.getValue(), abstractC14766);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44295(AbstractC14766 abstractC14766, EnumC7132 enumC7132, int i, Object obj) {
        if (enumC7132 == EnumC7132.f21904) {
            abstractC14766.m35091(i, (InterfaceC8522) obj);
        } else {
            abstractC14766.mo35107(i, enumC7132.m19147());
            m44296(abstractC14766, enumC7132, obj);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44296(AbstractC14766 abstractC14766, EnumC7132 enumC7132, Object obj) {
        switch (C2276.f7369[enumC7132.ordinal()]) {
            case 1:
                double doubleValue = ((Double) obj).doubleValue();
                abstractC14766.getClass();
                abstractC14766.mo35095(Double.doubleToRawLongBits(doubleValue));
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                abstractC14766.getClass();
                abstractC14766.mo35086(Float.floatToRawIntBits(floatValue));
                break;
            case 3:
                abstractC14766.mo35105(((Long) obj).longValue());
                break;
            case 4:
                abstractC14766.mo35105(((Long) obj).longValue());
                break;
            case 5:
                abstractC14766.mo35100(((Integer) obj).intValue());
                break;
            case 6:
                abstractC14766.mo35095(((Long) obj).longValue());
                break;
            case 7:
                abstractC14766.mo35086(((Integer) obj).intValue());
                break;
            case 8:
                abstractC14766.mo35085(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                abstractC14766.getClass();
                ((InterfaceC8522) obj).writeTo(abstractC14766);
                break;
            case 10:
                abstractC14766.mo35099((InterfaceC8522) obj);
                break;
            case 11:
                if (obj instanceof AbstractC5886) {
                    abstractC14766.mo35098((AbstractC5886) obj);
                    break;
                } else {
                    abstractC14766.mo35096((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof AbstractC5886) {
                    abstractC14766.mo35098((AbstractC5886) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    abstractC14766.getClass();
                    abstractC14766.mo35094(bArr.length, bArr);
                    break;
                }
            case 13:
                abstractC14766.mo35106(((Integer) obj).intValue());
                break;
            case 14:
                abstractC14766.mo35086(((Integer) obj).intValue());
                break;
            case 15:
                abstractC14766.mo35095(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                abstractC14766.mo35106((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                abstractC14766.mo35105((longValue >> 63) ^ (longValue << 1));
                break;
            case 18:
                if (obj instanceof InterfaceC3415) {
                    abstractC14766.mo35100(((InterfaceC3415) obj).getNumber());
                    break;
                } else {
                    abstractC14766.mo35100(((Integer) obj).intValue());
                    break;
                }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44297(InterfaceC18504 interfaceC18504, Object obj, AbstractC14766 abstractC14766) {
        EnumC7132 mo1142 = interfaceC18504.mo1142();
        int number = interfaceC18504.getNumber();
        if (interfaceC18504.mo1129()) {
            List list = (List) obj;
            if (interfaceC18504.mo1143()) {
                if (list.isEmpty()) {
                    return;
                }
                abstractC14766.mo35107(number, 2);
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += m44304(mo1142, it.next());
                }
                abstractC14766.mo35106(i);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    m44296(abstractC14766, mo1142, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                m44295(abstractC14766, mo1142, number, it3.next());
            }
            return;
        }
        if (obj instanceof C9081) {
            m44295(abstractC14766, mo1142, number, ((C9081) obj).m23442());
        } else {
            m44295(abstractC14766, mo1142, number, obj);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m44325() {
        C21368 c21368;
        int i = 0;
        int i2 = 0;
        while (true) {
            c21368 = this.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            Map.Entry m48428 = c21368.m48428(i);
            i2 += m44305((InterfaceC18504) m48428.getKey(), m48428.getValue());
            i++;
        }
        for (Map.Entry entry : c21368.m48429()) {
            i2 += m44305((InterfaceC18504) entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m44323() {
        C21368 c21368;
        int i = 0;
        int i2 = 0;
        while (true) {
            c21368 = this.f60477;
            if (i >= c21368.m48427()) {
                break;
            }
            i2 += m44303(c21368.m48428(i));
            i++;
        }
        Iterator it = c21368.m48429().iterator();
        while (it.hasNext()) {
            i2 += m44303((Map.Entry) it.next());
        }
        return i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44303(Map.Entry entry) {
        int m35084;
        int m35082;
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC18504.mo1140() == EnumC1694.MESSAGE && !interfaceC18504.mo1129() && !interfaceC18504.mo1143()) {
            if (value instanceof C9081) {
                int number = ((InterfaceC18504) entry.getKey()).getNumber();
                m35084 = AbstractC14766.m35084(2, number) + (AbstractC14766.m35073(1) * 2);
                m35082 = AbstractC14766.m35069(3, (C9081) value);
            } else {
                int number2 = ((InterfaceC18504) entry.getKey()).getNumber();
                m35084 = AbstractC14766.m35084(2, number2) + (AbstractC14766.m35073(1) * 2);
                m35082 = AbstractC14766.m35082(3, (InterfaceC8522) value);
            }
            return m35082 + m35084;
        }
        return m44305(interfaceC18504, value);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44304(EnumC7132 enumC7132, Object obj) {
        int m38045;
        AbstractC5886 abstractC5886;
        switch (C2276.f7369[enumC7132.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                int i = AbstractC14766.f45086;
                return 8;
            case 2:
                ((Float) obj).getClass();
                int i2 = AbstractC14766.f45086;
                return 4;
            case 3:
                return AbstractC14766.m35077(((Long) obj).longValue());
            case 4:
                return AbstractC14766.m35077(((Long) obj).longValue());
            case 5:
                return AbstractC14766.m35077(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                int i3 = AbstractC14766.f45086;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                int i4 = AbstractC14766.f45086;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                int i5 = AbstractC14766.f45086;
                return 1;
            case 9:
                int i6 = AbstractC14766.f45086;
                return ((InterfaceC8522) obj).getSerializedSize();
            case 10:
                if (obj instanceof C9081) {
                    int i7 = AbstractC14766.f45086;
                    m38045 = ((C9081) obj).m38045();
                    return AbstractC14766.m35083(m38045) + m38045;
                }
                return AbstractC14766.m35071((InterfaceC8522) obj);
            case 11:
                if (obj instanceof AbstractC5886) {
                    abstractC5886 = (AbstractC5886) obj;
                    int i8 = AbstractC14766.f45086;
                    m38045 = abstractC5886.size();
                    return AbstractC14766.m35083(m38045) + m38045;
                }
                return AbstractC14766.m35070((String) obj);
            case 12:
                if (obj instanceof AbstractC5886) {
                    abstractC5886 = (AbstractC5886) obj;
                    int i9 = AbstractC14766.f45086;
                    m38045 = abstractC5886.size();
                    return AbstractC14766.m35083(m38045) + m38045;
                }
                int i10 = AbstractC14766.f45086;
                m38045 = ((byte[]) obj).length;
                return AbstractC14766.m35083(m38045) + m38045;
            case 13:
                return AbstractC14766.m35083(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i11 = AbstractC14766.f45086;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i12 = AbstractC14766.f45086;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return AbstractC14766.m35083((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return AbstractC14766.m35077((longValue >> 63) ^ (longValue << 1));
            case 18:
                return obj instanceof InterfaceC3415 ? AbstractC14766.m35077(((InterfaceC3415) obj).getNumber()) : AbstractC14766.m35077(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44305(InterfaceC18504 interfaceC18504, Object obj) {
        EnumC7132 mo1142 = interfaceC18504.mo1142();
        int number = interfaceC18504.getNumber();
        if (!interfaceC18504.mo1129()) {
            int m35073 = AbstractC14766.m35073(number);
            if (mo1142 == EnumC7132.f21904) {
                m35073 *= 2;
            }
            return m35073 + m44304(mo1142, obj);
        }
        List list = (List) obj;
        int i = 0;
        if (interfaceC18504.mo1143()) {
            if (list.isEmpty()) {
                return 0;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += m44304(mo1142, it.next());
            }
            return AbstractC14766.m35083(i) + AbstractC14766.m35073(number) + i;
        }
        for (Object obj2 : list) {
            int m350732 = AbstractC14766.m35073(number);
            if (mo1142 == EnumC7132.f21904) {
                m350732 *= 2;
            }
            i += m350732 + m44304(mo1142, obj2);
        }
        return i;
    }
}
