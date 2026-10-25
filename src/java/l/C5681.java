package l;

import bin.mt.json.JSON;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: 3791 */
/* renamed from: l.ۚ᩻ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5681 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9915 f17534;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10247 f17535;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f17536 = new LinkedHashMap();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8495 f17537;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8420 f17538;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7092 f17539;

    public C5681(C8420 c8420, C9915 c9915, C7092 c7092, C8495 c8495, C10247 c10247) {
        this.f17538 = c8420;
        this.f17534 = c9915;
        this.f17539 = c7092;
        this.f17537 = c8495;
        this.f17535 = c10247;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14852 m15992(String str) {
        int i;
        C9915 c9915 = this.f17534;
        c9915.getClass();
        m15985(System.currentTimeMillis());
        LinkedHashMap linkedHashMap = this.f17536;
        C14852 c14852 = (C14852) linkedHashMap.get(str);
        C8420 c8420 = this.f17538;
        if (c14852 != null) {
            m15988(c14852);
            long currentTimeMillis = System.currentTimeMillis();
            c14852.f45305 = currentTimeMillis;
            try {
                AbstractC15440 abstractC15440 = c14852.f45298;
                c8420.getClass();
                C8420.m22041(abstractC15440, currentTimeMillis);
            } catch (IOException unused) {
            }
            return c14852;
        }
        try {
            C0658 m22052 = c8420.m22052(str);
            if (m22052.f2540) {
                throw C3059.m9367(JSON.array(), "TEMPORARY_WORKSPACE_REOPEN_UNSUPPORTED", "Temporary workspaces cannot be reopened. Open the APK path again instead.", "fatal");
            }
            C14852 m19096 = this.f17539.m19096(c8420.m22057(m22052.f2550));
            long currentTimeMillis2 = System.currentTimeMillis();
            m19096.f45305 = currentTimeMillis2;
            try {
                AbstractC15440 abstractC154402 = m19096.f45298;
                c8420.getClass();
                C8420.m22041(abstractC154402, currentTimeMillis2);
            } catch (IOException unused2) {
            }
            linkedHashMap.put(m19096.f45300, m19096);
            c9915.getClass();
            m15985(System.currentTimeMillis());
            m15986(false);
            m15986(true);
            return m19096;
        } finally {
            i = C8869.f27007;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15991(C14852 c14852) {
        this.f17536.put(c14852.f45300, c14852);
        this.f17534.getClass();
        m15985(System.currentTimeMillis());
        m15986(false);
        m15986(true);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14852 m15997(String str) {
        this.f17534.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        m15985(currentTimeMillis);
        C14852 c14852 = (C14852) this.f17536.get(str);
        if (c14852 == null) {
            return m15992(str);
        }
        m15988(c14852);
        c14852.f45305 = currentTimeMillis;
        try {
            C8420 c8420 = this.f17538;
            AbstractC15440 abstractC15440 = c14852.f45298;
            c8420.getClass();
            C8420.m22041(abstractC15440, currentTimeMillis);
        } catch (IOException unused) {
        }
        return c14852;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14852 m15990(String str) {
        C14852 c14852 = (C14852) this.f17536.get(str);
        if (c14852 == null || c14852.f45299) {
            return null;
        }
        return c14852;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m15996(String str) {
        C14852 c14852 = (C14852) this.f17536.get(str);
        if (c14852 != null) {
            this.f17537.m22190(c14852);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15995(String str) {
        C14852 m15989 = m15989(str);
        if (m15989 == null) {
            return;
        }
        m15989.f45299 = true;
        this.f17537.m22189(m15989);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C14852 m15989(String str) {
        this.f17535.m25977(str);
        return (C14852) this.f17536.remove(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m15988(C14852 c14852) {
        boolean z = c14852.f45299;
        String str = c14852.f45300;
        if (z) {
            throw c14852.f45304;
        }
        try {
            this.f17538.m22057(str);
            if (c14852.f45299) {
                throw c14852.f45304;
            }
        } catch (C3059 e) {
            c14852.f45299 = true;
            c14852.f45304 = e;
            this.f17535.m25977(str);
            C8495 c8495 = this.f17537;
            c8495.m22189(c14852);
            if (!c8495.m22187(str) && this.f17536.get(str) == c14852) {
                m15989(str);
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15986(boolean z) {
        LinkedHashMap linkedHashMap = this.f17536;
        Iterator it = linkedHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C14852) it.next()).f45296 == z) {
                i++;
            }
        }
        HashSet hashSet = new HashSet();
        while (i > 2) {
            String str = null;
            long j = Long.MAX_VALUE;
            C14852 c14852 = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((C14852) entry.getValue()).f45296 == z && !hashSet.contains(entry.getKey())) {
                    if (!this.f17537.m22187((String) entry.getKey()) && ((C14852) entry.getValue()).f45305 < j) {
                        j = ((C14852) entry.getValue()).f45305;
                        str = (String) entry.getKey();
                        c14852 = (C14852) entry.getValue();
                    }
                }
            }
            if (str == null) {
                return;
            }
            if (z && !m15987(c14852)) {
                hashSet.add(str);
            } else {
                m15989(str);
                i--;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15985(long j) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f17536.entrySet()) {
            C14852 c14852 = (C14852) entry.getValue();
            if (c14852.f45296 && j - c14852.f45305 > 600000) {
                if (!this.f17537.m22187((String) entry.getKey()) && m15987(c14852)) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m15989((String) it.next());
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m15987(C14852 c14852) {
        try {
            C8420 c8420 = this.f17538;
            AbstractC15440 abstractC15440 = c14852.f45298;
            c8420.getClass();
            C8420.m22048(abstractC15440);
            c14852.f45299 = true;
            this.f17537.m22189(c14852);
            C15972.m37753();
            return true;
        } catch (IOException e) {
            C19926.m45879("MT MCP temporary workspace eviction delete failed, workspaceId=" + c14852.f45300, e);
            return false;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m15994(String str) {
        try {
            C9575 c9575 = new C9575(this.f17538, new C21498(1, this));
            C18081.m42150();
            int m45803 = C19911.m45803();
            this.f17534.getClass();
            Iterator it = c9575.m24455(str, m45803, System.currentTimeMillis()).iterator();
            while (it.hasNext()) {
                m15989((String) it.next());
            }
        } catch (Exception e) {
            C19926.m45879("MT MCP session cleanup failed", e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15993(C14852 c14852) {
        boolean z = c14852.f45299;
        String str = c14852.f45300;
        if (z && this.f17536.get(str) == c14852 && !this.f17537.m22187(str)) {
            m15989(str);
        }
    }
}
