package l;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: 874P */
/* renamed from: l.ۜ᩸֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7026 implements InterfaceC14786 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C7026 f21670 = new C7026(Collections.EMPTY_MAP);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f21671;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f21672;

    public C7026() {
        this(Collections.EMPTY_MAP);
    }

    public C7026(Map map) {
        this.f21672 = C20195.unmodifiableMap(map);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m18994() {
        return this.f21672.entrySet();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m18997(String str) {
        byte[] bArr = (byte[]) this.f21672.get(str);
        if (bArr != null) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m18993(long j, String str) {
        byte[] bArr = (byte[]) this.f21672.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18996(String str) {
        return this.f21672.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7026.class != obj.getClass()) {
            return false;
        }
        return m18992(this.f21672, ((C7026) obj).f21672);
    }

    public final int hashCode() {
        if (this.f21671 == 0) {
            int i = 0;
            for (Map.Entry entry : this.f21672.entrySet()) {
                i += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f21671 = i;
        }
        return this.f21671;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18992(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7026 m18995(C23959 c23959) {
        byte[] bArr;
        Map map = this.f21672;
        HashMap hashMap = new HashMap(map);
        List m52791 = c23959.m52791();
        for (int i = 0; i < m52791.size(); i++) {
            hashMap.remove(m52791.get(i));
        }
        for (Map.Entry entry : c23959.m52787().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bArr = ((String) value).getBytes(StandardCharsets.UTF_8);
            } else if (value instanceof byte[]) {
                bArr = (byte[]) value;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(str, bArr);
        }
        return m18992(map, hashMap) ? this : new C7026(hashMap);
    }
}
