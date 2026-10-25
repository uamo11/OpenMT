package l;

import android.os.Bundle;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Q6TQ */
/* renamed from: l.᩵ۘᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19222 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TreeMap f60524;

    public C19222(TreeMap treeMap) {
        this.f60524 = treeMap;
        if (!(treeMap.get("filePath") instanceof String)) {
            throw new IOException("Legacy config has no source path");
        }
        if (treeMap.containsKey("pageMode") && !(treeMap.get("pageMode") instanceof Boolean)) {
            throw new IOException("Invalid legacy page mode");
        }
        if (m44357()) {
            Object obj = treeMap.get("pageCount");
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num.intValue() >= 1 && num.intValue() <= 1024) {
                    Object obj2 = treeMap.get("currentPageIndex");
                    if (obj2 instanceof Integer) {
                        Integer num2 = (Integer) obj2;
                        if (num2.intValue() >= 0 && num2.intValue() < num.intValue()) {
                            return;
                        }
                    }
                }
            }
            throw new IOException("Invalid legacy page manifest");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19222 m44353(int i, Bundle bundle) {
        TreeMap treeMap = new TreeMap();
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (str == null || (obj != null && !(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long))) {
                    throw new IOException("Unsupported legacy config value type");
                }
                treeMap.put(str, obj);
            }
            C19222 c19222 = new C19222(treeMap);
            c19222.m44354(i);
            return c19222;
        } catch (RuntimeException e) {
            throw new IOException("Invalid legacy fragment values", e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m44357() {
        return Boolean.TRUE.equals(this.f60524.get("pageMode"));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m44359() {
        if (m44357()) {
            return ((Integer) this.f60524.get("pageCount")).intValue();
        }
        return 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44355() {
        if (m44357()) {
            return ((Integer) this.f60524.get("currentPageIndex")).intValue();
        }
        return 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Bundle m44358() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f60524.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null || (value instanceof String)) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Integer) value).intValue());
            } else {
                bundle.putLong(str, ((Long) value).longValue());
            }
        }
        bundle.remove("pageMode");
        bundle.remove("pageCount");
        bundle.remove("currentPageIndex");
        return bundle;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m44356(int i) {
        C10130 c10130 = new C10130(m44354(i));
        c10130.writeInt(1295140419);
        c10130.writeInt(1);
        TreeMap treeMap = this.f60524;
        c10130.writeInt(treeMap.size());
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            c10130.writeInt(str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                c10130.mo13231(str.charAt(i2));
            }
            Object value = entry.getValue();
            if (value == null) {
                c10130.writeByte(0);
            } else if (!(value instanceof String)) {
                if (value instanceof Boolean) {
                    c10130.writeByte(2);
                    c10130.m25425(((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    c10130.writeByte(3);
                    c10130.writeInt(((Integer) value).intValue());
                } else {
                    c10130.writeByte(4);
                    c10130.m25431(((Long) value).longValue());
                }
            } else {
                String str2 = (String) value;
                c10130.writeByte(1);
                c10130.writeInt(str2.length());
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    c10130.mo13231(str2.charAt(i3));
                }
            }
        }
        return c10130.m25444();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        r3 = true;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C19222 m44352(int r6, long r7, java.io.InputStream r9) {
        /*
            l.᩻᩶ᩳ r9 = l.C23930.m52696(r7, r9)
            if (r6 < 0) goto Lb7
            long r0 = (long) r6
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto Lb7
            int r7 = r9.readInt()     // Catch: java.lang.Throwable -> Lbf
            r8 = 1295140419(0x4d324643, float:1.8693432E8)
            if (r7 != r8) goto Laf
            int r7 = r9.readInt()     // Catch: java.lang.Throwable -> Lbf
            r8 = 1
            if (r7 != r8) goto Laf
            int r7 = r9.readInt()     // Catch: java.lang.Throwable -> Lbf
            if (r7 < 0) goto La7
            long r0 = (long) r7     // Catch: java.lang.Throwable -> Lbf
            long r2 = r9.m52707()     // Catch: java.lang.Throwable -> Lbf
            r4 = 5
            long r2 = r2 / r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto La7
            java.util.TreeMap r0 = new java.util.TreeMap     // Catch: java.lang.Throwable -> Lbf
            r0.<init>()     // Catch: java.lang.Throwable -> Lbf
            r1 = 0
        L33:
            if (r1 >= r7) goto L9b
            java.lang.String r2 = r9.m52700(r6)     // Catch: java.lang.Throwable -> Lbf
            boolean r3 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto L93
            int r3 = r9.readByte()     // Catch: java.lang.Throwable -> Lbf
            if (r3 == 0) goto L8c
            if (r3 == r8) goto L87
            r4 = 2
            if (r3 == r4) goto L6a
            r4 = 3
            if (r3 == r4) goto L61
            r4 = 4
            if (r3 != r4) goto L59
            long r3 = r9.readLong()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lbf
            goto L8d
        L59:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "Unsupported fragment config value"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            throw r6     // Catch: java.lang.Throwable -> Lbf
        L61:
            int r3 = r9.readInt()     // Catch: java.lang.Throwable -> Lbf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lbf
            goto L8d
        L6a:
            int r3 = r9.readByte()     // Catch: java.lang.Throwable -> Lbf
            if (r3 == 0) goto L7d
            r4 = 255(0xff, float:3.57E-43)
            if (r3 != r4) goto L75
            goto L7d
        L75:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "Invalid fragment config boolean"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            throw r6     // Catch: java.lang.Throwable -> Lbf
        L7d:
            if (r3 == 0) goto L81
            r3 = 1
            goto L82
        L81:
            r3 = 0
        L82:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Lbf
            goto L8d
        L87:
            java.lang.String r3 = r9.m52700(r6)     // Catch: java.lang.Throwable -> Lbf
            goto L8d
        L8c:
            r3 = 0
        L8d:
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lbf
            int r1 = r1 + 1
            goto L33
        L93:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "Duplicate fragment config key"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            throw r6     // Catch: java.lang.Throwable -> Lbf
        L9b:
            r9.m52709()     // Catch: java.lang.Throwable -> Lbf
            l.᩵ۘᩳ r6 = new l.᩵ۘᩳ     // Catch: java.lang.Throwable -> Lbf
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            r9.close()
            return r6
        La7:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "Invalid fragment config entry count"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            throw r6     // Catch: java.lang.Throwable -> Lbf
        Laf:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "Unsupported fragment config format"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            throw r6     // Catch: java.lang.Throwable -> Lbf
        Lb7:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "Fragment config exceeds app state limit"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            throw r6     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r6 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> Lc4
            goto Lc8
        Lc4:
            r7 = move-exception
            r6.addSuppressed(r7)
        Lc8:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19222.m44352(int, long, java.io.InputStream):l.᩵ۘᩳ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m44354(int i) {
        long j;
        long j2 = 12;
        for (Map.Entry entry : this.f60524.entrySet()) {
            long m21450 = C8083.m21450(((String) entry.getKey()).length(), 2L, 5L, j2);
            Object value = entry.getValue();
            if (value instanceof String) {
                j2 = C8083.m21450(((String) value).length(), 2L, 4L, m21450);
            } else {
                if (!(value instanceof Boolean)) {
                    if (value instanceof Integer) {
                        m21450 += 4;
                    } else {
                        j = value instanceof Long ? 8L : 1L;
                    }
                    j2 = m21450;
                }
                m21450 += j;
                j2 = m21450;
            }
            if (j2 > i) {
                throw new IOException("Fragment config exceeds app state limit");
            }
        }
        if (j2 <= i) {
            return (int) j2;
        }
        throw new IOException("Fragment config exceeds app state limit");
    }
}
