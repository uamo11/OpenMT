package l;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 19FV */
/* renamed from: l.᩵ܽۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19582 implements InterfaceC4059 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18918 f63271 = new C18876();

    @Override // l.InterfaceC4059
    /* renamed from: ֫ */
    public final Object mo12178(C15346 c15346, C16594 c16594, InterfaceC2648 interfaceC2648) {
        return interfaceC2648.mo8320(c16594);
    }

    @Override // l.InterfaceC4059
    /* renamed from: ֫ */
    public final Object mo12179(C15346 c15346, C16614 c16614, C16594 c16594, InterfaceC2648 interfaceC2648) {
        C3044 c3044;
        String m23341;
        if (((C23670) c16614.mo3028()).m52202() != EnumC7462.STATUS_STOPPED_ON_SYMLINK.getValue()) {
            return interfaceC2648.mo8320(c16594);
        }
        C12921 m39140 = c16614.m39140();
        if (m39140 != null) {
            Iterator it = m39140.m31430().iterator();
            while (it.hasNext()) {
                InterfaceC4455 interfaceC4455 = (InterfaceC4455) it.next();
                if (interfaceC4455 instanceof C3044) {
                    c3044 = (C3044) interfaceC4455;
                    break;
                }
            }
        }
        c3044 = null;
        if (c3044 == null) {
            throw new C16052(((C23670) c16614.mo3028()).m52202(), "Create failed for " + c16594 + ": missing symlink data");
        }
        String m39094 = c16594.m39094();
        int m9299 = c3044.m9299();
        byte[] m25370 = C10100.m25370(m39094);
        int length = m25370.length - m9299;
        Charset charset = C8208.f25225;
        String str = new String(m25370, length, m9299, charset);
        String m9298 = c3044.m9298();
        if (c3044.m9300()) {
            m23341 = C16014.m37867(m9298, str);
        } else {
            byte[] m253702 = C10100.m25370(m39094);
            String str2 = new String(m253702, 0, m253702.length - m9299, charset);
            StringBuilder sb = new StringBuilder();
            int lastIndexOf = str2.lastIndexOf("\\");
            if (lastIndexOf != -1) {
                sb.append((CharSequence) str2, 0, lastIndexOf);
                sb.append('\\');
            }
            m23341 = C9045.m23341(sb, m9298, str);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int indexOf = m23341.indexOf(92, i);
            if (indexOf == -1) {
                break;
            }
            arrayList.add(m23341.substring(i, indexOf));
            i = indexOf + 1;
        }
        arrayList.add(m23341.substring(i));
        int i2 = 0;
        while (i2 < arrayList.size()) {
            String str3 = (String) arrayList.get(i2);
            if (".".equals(str3)) {
                arrayList.remove(i2);
            } else if ("..".equals(str3)) {
                if (i2 > 0) {
                    arrayList.remove(i2);
                    i2--;
                }
                arrayList.remove(i2);
            } else {
                i2++;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (i3 > 0) {
                sb2.append('\\');
            }
            sb2.append((String) arrayList.get(i3));
        }
        return interfaceC2648.mo8320(new C16594(c16594.m39092(), c16594.m39096(), sb2.toString()));
    }

    @Override // l.InterfaceC4059
    /* renamed from: ֫ */
    public final InterfaceC18918 mo12180() {
        return this.f63271;
    }
}
