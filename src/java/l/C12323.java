package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: 07LE */
/* renamed from: l.۫ۢ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12323 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6319 f36880;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6136 f36881;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3151 f36882;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f36879 = new LinkedHashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f36878 = new LinkedHashMap();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13028 f36883 = new C13028(this);

    public C12323(C6319 c6319, C6136 c6136) {
        this.f36880 = c6319;
        this.f36881 = c6136;
        this.f36882 = new C3151(this, c6319);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29889(AbstractC4308 abstractC4308) {
        return C13028.m31613(this.f36883, this.f36880.m17519(abstractC4308));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29893(AbstractC4308 abstractC4308) {
        AbstractC4308 m17519 = this.f36880.m17519(abstractC4308);
        C3151 c3151 = this.f36882;
        c3151.f9843.f45449 = 0;
        c3151.mo8627(m17519);
        C14896 c14896 = c3151.f9843;
        C6136 c6136 = c3151.f9844.f36881;
        byte[] bArr = c14896.f45448;
        return C13028.m31613(this.f36883, c6136.f18880.mo15926(0, c14896.f45449, bArr));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m29895(AbstractC5698 abstractC5698) {
        AbstractC10370 mo15926;
        EnumC1296 enumC1296 = abstractC5698.f17559;
        EnumC1296 enumC12962 = EnumC1296.f4582;
        C3151 c3151 = this.f36882;
        C13028 c13028 = this.f36883;
        if (enumC1296 == enumC12962) {
            AbstractC4308 abstractC4308 = abstractC5698.f17560;
            c3151.f9843.f45449 = 0;
            C2609 mo12938 = abstractC4308.mo12938();
            if (mo12938.m8249()) {
                c3151.m8622(mo12938);
            }
            C6319 c6319 = this.f36880;
            c3151.mo8627(c6319.m17562(abstractC4308));
            Iterator it = c6319.m17510(abstractC4308).iterator();
            while (it.hasNext()) {
                c3151.mo8627((AbstractC4308) it.next());
            }
            C14896 c14896 = c3151.f9843;
            C6136 c6136 = c3151.f9844.f36881;
            byte[] bArr = c14896.f45448;
            mo15926 = c6136.f18880.mo15926(0, c14896.f45449, bArr);
        } else {
            AbstractC4308 abstractC43082 = abstractC5698.f17560;
            c3151.f9843.f45449 = 0;
            c3151.mo8627(abstractC43082);
            C14896 c148962 = c3151.f9843;
            C6136 c61362 = c3151.f9844.f36881;
            byte[] bArr2 = c148962.f45448;
            mo15926 = c61362.f18880.mo15926(0, c148962.f45449, bArr2);
        }
        return C13028.m31613(c13028, mo15926);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29888(Object obj) {
        if (obj instanceof Integer) {
            return m29891((InterfaceC8090) new C1034(3, (Integer) obj));
        }
        if (obj instanceof Float) {
            return m29891((InterfaceC8090) new C1034(4, (Float) obj));
        }
        if (obj instanceof Long) {
            return m29891((InterfaceC8090) new C1034(5, (Long) obj));
        }
        if (obj instanceof Double) {
            return m29891((InterfaceC8090) new C1034(6, (Double) obj));
        }
        if (obj instanceof String) {
            return m29891((InterfaceC8090) C5268.m15194((String) obj));
        }
        throw new AssertionError(C5368.m15337(obj, "unexpected constant: "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29891(InterfaceC8090 interfaceC8090) {
        int mo953 = interfaceC8090.mo953();
        if (mo953 == 7) {
            return m29889((AbstractC4308) interfaceC8090);
        }
        C13028 c13028 = this.f36883;
        if (mo953 == 16) {
            return C13028.m31613(c13028, this.f36880.m17519((AbstractC4308) interfaceC8090));
        }
        return C13028.m31613(c13028, interfaceC8090);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29894(AbstractC5698 abstractC5698) {
        AbstractC10370 abstractC10370 = abstractC5698.f17562;
        EnumC1296 enumC1296 = abstractC5698.f17559;
        EnumC1296 enumC12962 = EnumC1296.f4571;
        C6319 c6319 = this.f36880;
        return C13028.m31613(this.f36883, new C15144(abstractC10370, enumC1296 == enumC12962 ? abstractC5698.m16096(c6319) : abstractC5698.mo16091(c6319)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29892(C14163 c14163) {
        if (c14163.f17560.mo5146()) {
            throw new AssertionError("Unexpected intersection type: " + c14163.f17560);
        }
        c14163.mo16101();
        if (c14163.f17561.m16071() != null) {
            LinkedHashSet linkedHashSet = this.f36879;
            if (linkedHashSet.contains(c14163)) {
                return;
            }
            m29892(c14163.f17561.m16071());
            linkedHashSet.add(c14163);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29890(AbstractC5698 abstractC5698) {
        EnumC1296 enumC1296 = abstractC5698.f17559;
        EnumC1296 enumC12962 = EnumC1296.f4571;
        C6319 c6319 = this.f36880;
        return m29893(enumC1296 == enumC12962 ? abstractC5698.m16096(c6319) : abstractC5698.mo16091(c6319));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29885(C12323 c12323, InterfaceC0328 interfaceC0328) {
        C19380 mo1748 = interfaceC0328.mo1748(c12323.f36880);
        LinkedHashMap linkedHashMap = c12323.f36878;
        Integer num = (Integer) linkedHashMap.get(mo1748);
        if (num == null) {
            num = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(mo1748, num);
        }
        return num.intValue();
    }
}
