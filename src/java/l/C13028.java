package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;

/* compiled from: 07LE */
/* renamed from: l.۬ۢ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13028 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12323 f39002;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f38999 = new HashMap(64);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14896 f39003 = new C14896(EnumC5983.f18409);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f38998 = 1;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f39000 = new ArrayDeque();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f39001 = null;

    public C13028(C12323 c12323) {
        this.f39002 = c12323;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31613(C13028 c13028, InterfaceC21496 interfaceC21496) {
        C6319 c6319;
        AbstractC10370 m17058;
        ArrayDeque arrayDeque = c13028.f39000;
        C12323 c12323 = c13028.f39002;
        C13028 c130282 = c12323.f36883;
        c6319 = c12323.f36880;
        Object mo3574 = interfaceC21496.mo3574(c6319);
        HashMap hashMap = c13028.f38999;
        Integer num = (Integer) hashMap.get(mo3574);
        if (num == null) {
            int i = c13028.f38998;
            c13028.f38998 = i + 1;
            num = Integer.valueOf(i);
            hashMap.put(mo3574, num);
            boolean isEmpty = arrayDeque.isEmpty();
            arrayDeque.addLast(interfaceC21496);
            if (isEmpty) {
                while (!arrayDeque.isEmpty()) {
                    InterfaceC21496 interfaceC214962 = (InterfaceC21496) arrayDeque.peekFirst();
                    C14896 c14896 = c13028.f39003;
                    int mo953 = interfaceC214962.mo953();
                    switch (mo953) {
                        case 1:
                            AbstractC10370 abstractC10370 = (AbstractC10370) interfaceC214962;
                            c14896.m35348(mo953);
                            int mo2759 = abstractC10370.mo2759();
                            byte[] bArr = new byte[mo2759];
                            abstractC10370.m26174(0, bArr);
                            c14896.m35351(mo2759);
                            c14896.m35349(0, mo2759, bArr);
                            if (c13028.f39001 == null && mo2759 > 65535) {
                                c13028.f39001 = new String(bArr);
                                break;
                            }
                            break;
                        case 2:
                        case 13:
                        case 14:
                        default:
                            throw new AssertionError(C19370.m44628(mo953, "Unexpected constant tag: "));
                        case 3:
                            c14896.m35348(mo953);
                            c14896.m35352(((Integer) ((C1034) interfaceC214962).f3779).intValue());
                            break;
                        case 4:
                            c14896.m35348(mo953);
                            float floatValue = ((Float) ((C1034) interfaceC214962).f3779).floatValue();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
                            try {
                                new DataOutputStream(byteArrayOutputStream).writeFloat(floatValue);
                                c14896.m35349(0, 4, byteArrayOutputStream.toByteArray());
                                break;
                            } catch (IOException unused) {
                                throw new AssertionError("write");
                            }
                        case 5:
                            c13028.f38998++;
                            c14896.m35348(mo953);
                            long longValue = ((Long) ((C1034) interfaceC214962).f3779).longValue();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8);
                            try {
                                new DataOutputStream(byteArrayOutputStream2).writeLong(longValue);
                                c14896.m35349(0, 8, byteArrayOutputStream2.toByteArray());
                                break;
                            } catch (IOException unused2) {
                                throw new AssertionError("write");
                            }
                        case 6:
                            c13028.f38998++;
                            c14896.m35348(mo953);
                            double doubleValue = ((Double) ((C1034) interfaceC214962).f3779).doubleValue();
                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(8);
                            try {
                                new DataOutputStream(byteArrayOutputStream3).writeDouble(doubleValue);
                                c14896.m35349(0, 8, byteArrayOutputStream3.toByteArray());
                                break;
                            } catch (IOException unused3) {
                                throw new AssertionError("write");
                            }
                        case 7:
                            AbstractC4308 abstractC4308 = (AbstractC4308) interfaceC214962;
                            if (abstractC4308.m12913(EnumC9454.ARRAY)) {
                                C3151 c3151 = c12323.f36882;
                                c3151.f9843.f45449 = 0;
                                c3151.mo8627(abstractC4308);
                                C14896 c148962 = c3151.f9843;
                                C6136 c6136 = c3151.f9844.f36881;
                                m17058 = c6136.f18880.mo15926(0, c148962.f45449, c148962.f45448);
                            } else {
                                m17058 = c12323.f36881.m17058(C18382.m42812(abstractC4308.f13890.mo16083()));
                            }
                            c14896.m35348(mo953);
                            c14896.m35351(m31613(c130282, m17058));
                            if (!abstractC4308.m12913(EnumC9454.CLASS)) {
                                break;
                            } else {
                                c12323.m29892((C14163) abstractC4308.f13890);
                                break;
                            }
                        case 8:
                            AbstractC10370 m30652 = c12323.f36881.f18880.m30652((String) ((C1034) interfaceC214962).f3779);
                            c14896.m35348(mo953);
                            c14896.m35351(m31613(c130282, m30652));
                            break;
                        case 9:
                        case 10:
                        case 11:
                            AbstractC5698 abstractC5698 = (AbstractC5698) interfaceC214962;
                            c14896.m35348(mo953);
                            c14896.m35351(c12323.m29889(((C14163) abstractC5698.f17561).f17560));
                            c14896.m35351(c12323.m29894(abstractC5698));
                            break;
                        case 12:
                            C15144 c15144 = (C15144) interfaceC214962;
                            c14896.m35348(mo953);
                            c14896.m35351(m31613(c130282, c15144.f46278));
                            c14896.m35351(c12323.m29893(c15144.f46279));
                            break;
                        case 15:
                            C15574 c15574 = (C15574) interfaceC214962;
                            c14896.m35348(mo953);
                            c14896.m35348(c15574.m36708());
                            c14896.m35351(m31613(c130282, c15574.mo7048()));
                            break;
                        case 16:
                            c14896.m35348(mo953);
                            c14896.m35351(c12323.m29893(((C10658) interfaceC214962).mo2973()));
                            break;
                        case 17:
                            C8520 c8520 = (C8520) interfaceC214962;
                            c14896.m35348(mo953);
                            c14896.m35351(C12323.m29885(c12323, c8520));
                            c14896.m35351(c12323.m29894(c8520));
                            break;
                        case 18:
                            C9226 c9226 = (C9226) interfaceC214962;
                            c14896.m35348(mo953);
                            c14896.m35351(C12323.m29885(c12323, c9226));
                            c14896.m35351(c12323.m29894(c9226));
                            break;
                        case 19:
                            int m31613 = m31613(c130282, ((C0052) interfaceC214962).f17562);
                            c14896.m35348(19);
                            c14896.m35351(m31613);
                            break;
                        case 20:
                            AbstractC10370 m170582 = c12323.f36881.m17058(C18382.m42812(((C7814) interfaceC214962).f24143));
                            c14896.m35348(mo953);
                            c14896.m35351(m31613(c130282, m170582));
                            break;
                    }
                    arrayDeque.removeFirst();
                }
            }
        }
        return num.intValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31614() {
        this.f38999.clear();
        this.f38998 = 1;
        this.f39000.clear();
        this.f39001 = null;
        this.f39003.f45449 = 0;
    }
}
