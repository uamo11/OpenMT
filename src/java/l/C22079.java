package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: CAQ7 */
/* renamed from: l.᩹ۚۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22079 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f71728;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f71729 = Collections.EMPTY_LIST;

    public C22079() {
        this.f71728 = C9255.m23780() && !C9886.m24978();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49672() {
        if (this.f71728) {
            this.f71729 = C17721.m41501();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49673(AbstractC15440 abstractC15440, EnumC16309 enumC16309) {
        C1493 m5162 = C1493.m5162(abstractC15440, enumC16309);
        if (m5162 == null) {
            return;
        }
        m49675(m5162);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49674(AbstractC15440 abstractC15440, EnumC16309 enumC16309, AbstractC15440 abstractC154402, EnumC16309 enumC163092) {
        C1493 m5162 = C1493.m5162(abstractC15440, enumC16309);
        C1493 m51622 = C1493.m5162(abstractC154402, enumC163092);
        if (m5162 == null && m51622 == null) {
            return;
        }
        m49675(m5162, m51622);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m49675(C1493... c1493Arr) {
        C10666 m49671;
        String m24406;
        C10666 m496712;
        if (this.f71728) {
            HashSet hashSet = new HashSet(c1493Arr.length);
            HashSet hashSet2 = new HashSet(c1493Arr.length);
            for (C1493 c1493 : c1493Arr) {
                if (c1493 != null) {
                    String str = c1493.f5334;
                    EnumC16309 enumC16309 = c1493.f5335;
                    if (enumC16309.f50180) {
                        ArrayList arrayList = C17721.f54213;
                        try {
                            str = C20402.m46728(str);
                        } catch (IOException unused) {
                        }
                    }
                    String m50489 = C22518.m50489(str);
                    if (C17721.m41506(C16999.m39866(m50489, new String[0])) && (m49671 = m49671(m50489)) != null && !m49671.f32081) {
                        hashSet.add(m49671);
                        if (enumC16309.f50181 && (m24406 = C9523.m24406(m50489)) != null && (m496712 = m49671(m24406)) != null && !m496712.f32081 && !m496712.equals(m49671)) {
                            hashSet2.add(m496712);
                        }
                    }
                }
            }
            hashSet2.removeAll(hashSet);
            if (hashSet.isEmpty()) {
                return;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C10666 c10666 = (C10666) it.next();
                C9255.m23761(c10666);
                c10666.f32081 = true;
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C10666 c106662 = (C10666) it2.next();
                C9255.m23761(c106662);
                c106662.f32081 = true;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10666 m49671(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C10666 c10666 : this.f71729) {
            if (lowerCase.startsWith(c10666.f32079)) {
                return c10666;
            }
        }
        return null;
    }
}
