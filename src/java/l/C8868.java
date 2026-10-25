package l;

import com.umeng.analytics.pro.bo;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: 51FV */
/* renamed from: l.ۡۨ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8868 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19452 f27004;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f27005 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f27006 = new ArrayList();

    public C8868(C19452 c19452) {
        this.f27004 = c19452;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22905() {
        Map map;
        map = this.f27004.f62921;
        for (C0732 c0732 : ((HashMap) map).values()) {
            if (c0732.f2760 != null) {
                this.f27006.add(c0732);
            } else if (c0732.f2765 != null) {
                this.f27005.add(c0732);
            } else {
                throw new IOException("Bad xml item: " + c0732.f2758);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m22906() {
        ArrayList arrayList = this.f27005;
        Collections.sort(arrayList);
        ArrayList arrayList2 = this.f27006;
        Collections.sort(arrayList2);
        MessageDigest m34534 = C14460.m34534();
        m34534.update((byte) -127);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m34534.update(((C0732) it.next()).f2758.getBytes(Charset.defaultCharset()));
        }
        m34534.update(bo.h);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C0732 c0732 = (C0732) it2.next();
            m34534.update(c0732.f2758.getBytes(Charset.defaultCharset()));
            m34534.update(c0732.f2760.m27337());
        }
        m34534.update((byte) -123);
        return m34534.digest();
    }
}
