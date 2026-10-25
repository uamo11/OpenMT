package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: O7FP */
/* renamed from: l.᩷ۛۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20687 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47299(String str, C14335 c14335) {
        C23508 c23508;
        C14335 m47301 = m47301(c14335);
        if (str.isEmpty() || m47301 == null) {
            m47302(str);
            return;
        }
        ArrayList m47296 = m47296();
        Iterator it = m47296.iterator();
        while (true) {
            if (!it.hasNext()) {
                c23508 = null;
                break;
            } else {
                c23508 = (C23508) it.next();
                if (c23508.f75458.equals(str)) {
                    break;
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (c23508 != null) {
            c23508.f75459 = m47301;
            c23508.f75457 = currentTimeMillis;
        } else {
            m47296.add(new C23508(str, m47301, currentTimeMillis));
        }
        if (m47296.size() > 100) {
            Collections.sort(m47296, new C17864());
            while (m47296.size() > 100) {
                C18473.m42953(m47296, 1);
            }
        }
        m47300(m47296);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14335 m47297(String str) {
        if (str.isEmpty()) {
            return null;
        }
        ArrayList m47296 = m47296();
        Iterator it = m47296.iterator();
        while (it.hasNext()) {
            C23508 c23508 = (C23508) it.next();
            if (c23508.f75458.equals(str)) {
                C14335 m47301 = m47301(c23508.f75459);
                if (m47301 == null) {
                    return null;
                }
                c23508.f75457 = System.currentTimeMillis();
                m47300(m47296);
                return m47301;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m47302(String str) {
        if (str.isEmpty()) {
            return;
        }
        ArrayList m47296 = m47296();
        for (int i = 0; i < m47296.size(); i++) {
            if (((C23508) m47296.get(i)).f75458.equals(str)) {
                m47296.remove(i);
                m47300(m47296);
                return;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C14335 m47301(C14335 c14335) {
        int i = C17158.f52563[c14335.m34209().ordinal()];
        if (i == 1) {
            return new C14335(EnumC6575.OFF, -1, null);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IncompatibleClassChangeError();
            }
            if (c14335.m34208() != null && !c14335.m34208().isEmpty()) {
                return new C14335(EnumC6575.FILE, -1, c14335.m34208());
            }
        } else if (c14335.m34207() >= 0) {
            return new C14335(EnumC6575.TRACK, c14335.m34207(), null);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m47296() {
        byte[] mo18253;
        ArrayList arrayList = new ArrayList();
        try {
            InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
            if (interfaceC12344 != null && (mo18253 = interfaceC12344.mo18253("vsts", (byte[]) null)) != null && mo18253.length != 0) {
                C12951 m31485 = C12951.m31485(mo18253);
                m31485.m31490(1699025495);
                int readByte = m31485.readByte() & 255;
                for (int i = 0; i < readByte; i++) {
                    arrayList.add(C23508.m51947(m31485));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47300(ArrayList arrayList) {
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        if (interfaceC12344 == null) {
            return;
        }
        C10130 m43030 = C18515.m43030(1699025495);
        m43030.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C23508 c23508 = (C23508) it.next();
            m43030.m25439(c23508.f75458);
            int i = C17158.f52563[c23508.f75459.m34209().ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                } else {
                    continue;
                }
            }
            m43030.writeByte(i2);
            m43030.writeInt(c23508.f75459.m34207());
            m43030.m25424(c23508.f75459.m34208());
            m43030.m25431(c23508.f75457);
        }
        interfaceC12344.edit().mo25855("vsts", m43030.m25427()).apply();
    }
}
