package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: W78J */
/* renamed from: l.֡᩻ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0741 {

    /* renamed from: ᩷ۗ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f2789 = {5974, 11294, 11285, 11279, 11273, 11266, 11300, 11279, 11294, 11267, 11279, 11290, 11267, 11286, 11287, 11295, 11294, 11267, 11300, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282, 11295, 11294, 11267, 11300, 11286, 11294, 11279, 11283, 11284, 11295, 11300, 11272, 11286, 11290, 11287, 11282, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282, 11295, 11294, 11267, 11300, 11293, 11282, 11294, 11287, 11295, 11300, 11272, 11286, 11290, 11287, 11282, 11310, 11285, 11272, 11278, 11275, 11275, 11284, 11273, 11279, 11294, 11295, 11355, 11273, 11294, 11290, 11295, 11355, 11280, 11282, 11285, 11295, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282, 11293, 11282, 11294, 11287, 11295, 11288, 11287, 11290, 11272, 11272, 11300, 11272, 11286, 11290, 11287, 11282};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15799 f2790;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10247 f2791;

    public C0741(C15799 c15799, C10247 c10247) {
        this.f2790 = c15799;
        this.f2791 = c10247;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11243 m2857(C14852 c14852, C1656 c1656) {
        String str = c1656.f5782;
        C17884 c17884 = c1656.f5784;
        C9042 m25979 = this.f2791.m25979(c14852, this.f2790, str);
        String str2 = c14852.f45300;
        try {
            if (m25979.m23336(c17884.f54613, m2851(c14852, str)) == null) {
                throw C18081.m42153(str2, str);
            }
            m25979.m23338();
            return new C11243(1);
        } catch (C3059 e) {
            if (C15799.m37396(str)) {
                C10247.m25972(c14852, e);
            }
            if (!"INVALID_ARGUMENT".equals(e.f9610)) {
                throw e;
            }
            JSONObject jSONObject = e.f9609;
            if (!"variant".equals(jSONObject.getString("argument", null)) || jSONObject.getJSONArray("availableVariants") == null) {
                throw e;
            }
            JSONObject add = C7416.m19939("workspaceId", str2, "editSessionId", str).add("reads", JSON.array().add(JSON.object().add("locator", C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, c17884.f54613)).add("variant", "default"))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0);
            JSONArray jSONArray = new JSONArray(e.f9604);
            jSONArray.add(C10115.m25398(add, "mt_apk_resource_read", "retry", "Retry reading the same resource with batch resource_read arguments"));
            throw e.m9370(jSONArray);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13649 m2855(C14852 c14852, C16472 c16472) {
        String str;
        C16472 c164722 = c16472;
        String str2 = c164722.f50627;
        C9042 m25979 = this.f2791.m25979(c14852, this.f2790, str2);
        HashSet m2851 = m2851(c14852, str2);
        ArrayList arrayList = c164722.f50632;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < arrayList.size()) {
            try {
                C10829 c10829 = (C10829) arrayList.get(i);
                String str3 = c10829.f32572;
                String str4 = c10829.f32572;
                int i2 = i;
                ArrayList arrayList3 = arrayList;
                str = str2;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                try {
                    C23110 m23335 = m25979.m23335(str3, c10829.f32573, c164722.f50629, c164722.f50630, c164722.f50628, c164722.f50631, m2851);
                    if (m23335 != null) {
                        ArrayList arrayList4 = m23335.f74347;
                        if (!linkedHashMap2.containsKey(str3)) {
                            linkedHashMap2.put(str3, new C16886(str3, m23335.f74345));
                        }
                        if (arrayList4.isEmpty()) {
                            arrayList2.add(new C22822(i2, str4, c10829.f32573, "RESOURCE_VARIANT_NOT_FOUND", "Resource variant not found.", m23335.f74346, null));
                        } else {
                            C11159 c11159 = (C11159) arrayList4.get(0);
                            arrayList2.add(new C22822(i2, str4, c11159.f33488, null, null, m23335.f74346, c11159));
                        }
                    } else {
                        arrayList2.add(new C22822(i2, str4, c10829.f32573, "RESOURCE_NOT_FOUND", "Resource not found.", null, null));
                    }
                    i = i2 + 1;
                    c164722 = c16472;
                    linkedHashMap = linkedHashMap2;
                    arrayList = arrayList3;
                    str2 = str;
                } catch (C3059 e) {
                    e = e;
                    if (C15799.m37396(str)) {
                        C10247.m25972(c14852, e);
                    }
                    throw e;
                }
            } catch (C3059 e2) {
                e = e2;
                str = str2;
            }
        }
        return new C13649(c14852.f45300, m25979.m23338(), new ArrayList(linkedHashMap.values()), arrayList2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private HashSet m2851(C14852 c14852, String str) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2790.m37430(c14852, str).iterator();
        while (it.hasNext()) {
            hashSet.add(((C13874) it.next()).f41355);
        }
        return hashSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9832 m2854(C14852 c14852, C1656 c1656, C15923 c15923) {
        String str = c1656.f5782;
        String str2 = c1656.f5790;
        C17884 c17884 = c1656.f5784;
        C17675 m2852 = m2852(c14852, str, c17884, c15923);
        try {
            return new C9832(c14852.f45300, c17884, m2852.f54072, C15799.m37347(m2852.f54073), C8163.m21639(m2852.f54073, c1656.f5783, c1656.f5791, c1656.f5793, c1656.f5785), m2852.f54075, m2852.f54074, c1656.f5793, c1656.f5785, m2852.f54071);
        } catch (C3059 e) {
            if (!"INVALID_ARGUMENT".equals(e.f9610) || !"lineCharOffset".equals(e.f9609.getString("argument", null))) {
                throw e;
            }
            JSONValue jSONValue = c1656.f5787;
            if (str2 == null) {
                throw e;
            }
            if ("startColumn".equals(str2)) {
                throw C3059.m9364("Invalid startColumn", "startColumn", jSONValue, JSON.array(0, Integer.MAX_VALUE), JSON.object().add("startColumn", 0));
            }
            if ("nextCursor".equals(str2)) {
                throw C3059.m9364("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22117 m2856(C14852 c14852, C1656 c1656) {
        C18090 c18090;
        Throwable th;
        InputStream inputStream;
        Throwable th2;
        C4695 m37432;
        String str = c14852.f45300;
        C17884 c17884 = c1656.f5784;
        int i = c1656.f5789;
        String str2 = c1656.f5782;
        String str3 = c17884.f54612;
        int i2 = c1656.f5792;
        if (!"entry_text".equals(c17884.f54616)) {
            throw C3059.m9364("Byte reads are valid only for zip_entry locators", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        boolean equals = "resources.arsc".equals(str3);
        C15799 c15799 = this.f2790;
        if (equals && (m37432 = c15799.m37432(c14852, str2)) != null) {
            return m2853(str, c1656, m37432.f14917);
        }
        C3284 m37434 = c15799.m37434(c14852, str2, str3);
        boolean z = false;
        if (m37434 != null) {
            String str4 = c14852.f45300;
            AbstractC15440 abstractC15440 = m37434.f10327;
            long mo23127 = abstractC15440.mo23127();
            int i3 = c1656.f5789;
            long j = i3;
            if (j >= mo23127) {
                return new C22117(str4, c17884, new byte[0], i3, c1656.f5792, mo23127, i3, false);
            }
            int min = (int) Math.min(i2, mo23127 - j);
            byte[] bArr = new byte[min];
            try {
                C23411 m36513 = abstractC15440.m36513("r");
                try {
                    m36513.seek(i);
                    m36513.m51858(bArr, 0, min);
                    m36513.close();
                    int i4 = c1656.f5789;
                    long j2 = i4 + min;
                    if (j2 < mo23127 && j2 <= 2147483647L) {
                        z = true;
                    }
                    return new C22117(str4, c17884, bArr, i4, c1656.f5792, mo23127, (int) Math.min(j2, 2147483647L), z);
                } finally {
                }
            } catch (IOException | RuntimeException unused) {
                throw C3059.m9368("ENTRY_READ_FAILED", "Failed to read entry overlay.");
            }
        } else {
            C4695 m37431 = c15799.m37431(c14852, str2, str3);
            if (m37431 != null) {
                return m2853(str, c1656, m37431.f14917);
            }
            try {
                C18090 c180902 = new C18090(c14852.m35253());
                try {
                    C3545 entry = c180902.getEntry(str3);
                    try {
                        if (entry == null) {
                            throw C3059.m9363("ENTRY_NOT_FOUND", "ZIP entry not found");
                        }
                        if (!entry.isDirectory()) {
                            long size = entry.getSize();
                            if (size >= 0) {
                                try {
                                    int i5 = c1656.f5789;
                                    if (i5 >= size) {
                                        C22117 c22117 = new C22117(c14852.f45300, c17884, new byte[0], i5, c1656.f5792, size, i5, false);
                                        c180902.close();
                                        return c22117;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c18090 = c180902;
                                    try {
                                        c18090.close();
                                        throw th;
                                    } catch (Throwable th4) {
                                        th.addSuppressed(th4);
                                        throw th;
                                    }
                                }
                            }
                            int i6 = size >= 0 ? i2 : i2 + 1;
                            InputStream m42189 = c180902.m42189(entry);
                            try {
                                try {
                                    C22194.m49856(i, m42189);
                                    int i7 = 8192;
                                    C0521 c0521 = new C0521(Math.min(i6, 8192));
                                    byte[] bArr2 = new byte[8192];
                                    while (i6 > 0) {
                                        int read = m42189.read(bArr2, 0, Math.min(i7, i6));
                                        if (read == -1) {
                                            break;
                                        }
                                        c0521.write(bArr2, 0, read);
                                        i6 -= read;
                                        i7 = 8192;
                                    }
                                    byte[] bArr3 = c0521.f2176;
                                    int length = bArr3.length;
                                    int i8 = c0521.f2177;
                                    if (length != i8) {
                                        bArr3 = Arrays.copyOf(bArr3, i8);
                                    }
                                    m42189.close();
                                    boolean z2 = size < 0 && bArr3.length > i2;
                                    if (z2) {
                                        bArr3 = Arrays.copyOf(bArr3, i2);
                                    }
                                    byte[] bArr4 = bArr3;
                                    int i9 = c1656.f5789;
                                    long length2 = i9 + bArr4.length;
                                    if (size >= 0) {
                                        z2 = length2 < size;
                                    }
                                    C22117 c221172 = new C22117(c14852.f45300, c17884, bArr4, i9, c1656.f5792, size, (int) Math.min(length2, 2147483647L), (!z2 || length2 <= 2147483647L) ? z2 : false);
                                    c180902.close();
                                    return c221172;
                                } catch (Throwable th5) {
                                    c18090 = c180902;
                                    th2 = th5;
                                    inputStream = m42189;
                                    try {
                                        inputStream.close();
                                        throw th2;
                                    } catch (Throwable th6) {
                                        th2.addSuppressed(th6);
                                        throw th2;
                                    }
                                }
                            } catch (EOFException unused2) {
                                c18090 = c180902;
                                try {
                                    String str5 = c14852.f45300;
                                    byte[] bArr5 = new byte[0];
                                    int i10 = c1656.f5789;
                                    inputStream = m42189;
                                    try {
                                        C22117 c221173 = new C22117(str5, c17884, bArr5, i10, c1656.f5792, size, i10, false);
                                        inputStream.close();
                                        c18090.close();
                                        return c221173;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th2 = th;
                                        inputStream.close();
                                        throw th2;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    inputStream = m42189;
                                }
                            }
                        } else {
                            throw C3059.m9368("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        th = th;
                        c18090.close();
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    c18090 = c180902;
                }
            } catch (C3059 e) {
                throw e;
            } catch (Exception e2) {
                throw C3059.m9368("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22117 m2853(String str, C1656 c1656, byte[] bArr) {
        C17884 c17884 = c1656.f5784;
        int i = c1656.f5789;
        if (i >= bArr.length) {
            return new C22117(str, c17884, new byte[0], i, c1656.f5792, bArr.length, i, false);
        }
        int min = Math.min(c1656.f5792, bArr.length - i);
        int i2 = c1656.f5789;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i2 + min);
        int i3 = c1656.f5789;
        int i4 = i3 + min;
        return new C22117(str, c17884, copyOfRange, i3, c1656.f5792, bArr.length, i4, i4 < bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        if (l.C11340.f33930 < 0) goto L18;
     */
    /* JADX WARN: Type inference failed for: r2v62, types: [bin.mt.json.JSONArray, bin.mt.json.JSONObject, bin.mt.json.JSONValue, java.lang.String] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C17675 m2852(l.C14852 r41, java.lang.String r42, l.C17884 r43, l.C15923 r44) {
        /*
            Method dump skipped, instructions count: 2088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0741.m2852(l.ܳ᩻ۜ, java.lang.String, l.ᩳۜۜ, l.ܺۨ᩻):l.ܿ᩻ۜ");
    }
}
