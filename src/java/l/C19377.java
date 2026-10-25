package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Vector;

/* compiled from: T7YQ */
/* renamed from: l.᩵ۢۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19377 implements InterfaceC19002 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1031 f62719;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C20413 f62720;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Vector f62721;

    public C19377(C20413 c20413) {
        this.f62721 = null;
        this.f62720 = c20413;
        if (this.f62719 == null) {
            String m46768 = C20413.m46768("hmac-sha1");
            try {
                this.f62719 = (InterfaceC1031) Class.forName(m46768).asSubclass(InterfaceC1031.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                this.f62720.m46777().getClass();
                throw new IllegalArgumentException(C4860.m14172("instantiation of ", m46768, " lead to an error"), e);
            }
        }
        this.f62721 = new Vector();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44639(String str, byte[] bArr) {
        if (str == null) {
            return 1;
        }
        try {
            C4185 c4185 = new C4185(str, 0, bArr);
            synchronized (this.f62721) {
                int i = 1;
                for (int i2 = 0; i2 < this.f62721.size(); i2++) {
                    C4185 c41852 = (C4185) this.f62721.elementAt(i2);
                    if (c41852.mo12631(str) && c41852.f13636 == c4185.f13636) {
                        if (C19356.m44591(c41852.f13634, bArr)) {
                            return 0;
                        }
                        i = 2;
                    }
                }
                return (i == 1 && str.startsWith("[") && str.indexOf("]:") > 1) ? m44639(str.substring(1, str.indexOf("]:")), bArr) : i;
            }
        } catch (Exception unused) {
            this.f62720.m46777().getClass();
            return 1;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44640(C4185 c4185, InterfaceC18650 interfaceC18650) {
        int i = c4185.f13636;
        String str = c4185.f13633;
        synchronized (this.f62721) {
            for (int i2 = 0; i2 < this.f62721.size(); i2++) {
                ((C4185) this.f62721.elementAt(i2)).mo12631(str);
            }
        }
        this.f62721.addElement(c4185);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4185[] m44641(String str, String str2) {
        C4185[] c4185Arr;
        synchronized (this.f62721) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f62721.size(); i++) {
                C4185 c4185 = (C4185) this.f62721.elementAt(i);
                if (c4185.f13636 != -1 && (str == null || (c4185.mo12631(str) && (str2 == null || c4185.m12630().equals(str2))))) {
                    arrayList.add(c4185);
                }
            }
            int size = arrayList.size();
            c4185Arr = new C4185[size];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                c4185Arr[i2] = (C4185) arrayList.get(i2);
            }
            if (str != null && str.startsWith("[") && str.indexOf("]:") > 1) {
                C4185[] m44641 = m44641(str.substring(1, str.indexOf("]:")), str2);
                if (m44641.length > 0) {
                    C4185[] c4185Arr2 = new C4185[m44641.length + size];
                    System.arraycopy(c4185Arr, 0, c4185Arr2, 0, size);
                    System.arraycopy(m44641, 0, c4185Arr2, size, m44641.length);
                    c4185Arr = c4185Arr2;
                }
            }
        }
        return c4185Arr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44642(String str, String str2) {
        synchronized (this.f62721) {
            int i = 0;
            while (i < this.f62721.size()) {
                C4185 c4185 = (C4185) this.f62721.elementAt(i);
                if (str == null || (c4185.mo12631(str) && (str2 == null || c4185.m12630().equals(str2)))) {
                    String str3 = c4185.f13633;
                    if (str != null && !str3.equals(str) && (!(c4185 instanceof C18671) || !((C18671) c4185).m43289())) {
                        int length = str.length();
                        int length2 = str3.length();
                        int i2 = 0;
                        while (i2 < length2) {
                            int indexOf = str3.indexOf(44, i2);
                            if (indexOf != -1) {
                                if (str.equals(str3.substring(i2, indexOf))) {
                                    str3 = str3.substring(0, i2) + str3.substring(indexOf + 1);
                                    break;
                                }
                                i2 = indexOf + 1;
                            } else {
                                break;
                            }
                        }
                        if (str3.endsWith(str) && length2 - i2 == length) {
                            str3 = str3.substring(0, length == length2 ? 0 : (length2 - length) - 1);
                        }
                        c4185.f13633 = str3;
                    }
                    this.f62721.removeElement(c4185);
                    i--;
                }
                i++;
            }
        }
    }

    static {
        byte[] bArr = C19356.f62660;
        C19356.m44592("\n", StandardCharsets.UTF_8);
    }
}
