package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.ZipException;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: I6L2 */
/* renamed from: l.֡᩵ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0616 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17760 f2371;

    public C0616(C17760 c17760) {
        this.f2371 = c17760;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m2546(JSONObject jSONObject) {
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "recursive", "simple", "cursor", "limit");
        final String m15720 = C5556.m15720(jSONObject, "entryPath");
        C5556.m15718(m15720, "entryPath", true);
        final boolean m15719 = C5556.m15719(jSONObject, "recursive");
        final boolean m157192 = C5556.m15719(jSONObject, "simple");
        final String m157202 = C5556.m15720(jSONObject, "cursor");
        final int m15710 = C5556.m15710(jSONObject, "limit", 1, 1000);
        if (!m15720.isEmpty() && !m15720.endsWith("/")) {
            throw C5556.m15714(JSON.value(m15720), "entryPath", "A ZIP directory path must end with /; use an empty string for the root");
        }
        return m2538(jSONObject, m15720, false, new InterfaceC19668() { // from class: l.ۖ᩵ۜ
            @Override // l.InterfaceC19668
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final JSONObject mo8480(String str, C18090 c18090, C12619 c12619, C7383 c7383) {
                return C0616.m2542(m15720, m15719, m157202, m15710, m157192, str, c18090, c12619, c7383);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m2542(String str, boolean z, String str2, int i, boolean z2, String str3, C18090 c18090, C12619 c12619, C7383 c7383) {
        int i2;
        String str4;
        boolean z3;
        String str5;
        String str6;
        int i3;
        String str7;
        C23734 c23734 = new C23734(c18090.m42210());
        if (!str.isEmpty() && c18090.getEntry(str) == null && c23734.m4933(str) == null) {
            throw m2544("ZIP_ENTRY_NOT_FOUND", "The ZIP directory does not exist", str3, str);
        }
        String m34531 = C14460.m34531(C14460.m34534().digest(C7416.m19939("layout", "zip-list-v2", MotionUtils.EASING_TYPE_PATH, str3).add("entryPath", str).add("recursive", z).add("size", c12619.m30884()).add("modifiedAt", c12619.m30883()).add(am.bp, c7383.f22729).toString().getBytes(StandardCharsets.UTF_8)));
        String str8 = "The ZIP cursor is no longer valid; restart with cursor=\"\"";
        if (!str2.isEmpty()) {
            int indexOf = str2.indexOf(46);
            if (indexOf > 0 && indexOf <= 10 && str2.substring(indexOf + 1).equals(m34531)) {
                try {
                    int parseInt = Integer.parseInt(str2.substring(0, indexOf));
                    if (parseInt > 0) {
                        i2 = Integer.toString(parseInt).equals(str2.substring(0, indexOf)) ? parseInt : 0;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            throw m2544("ZIP_INVALID_CURSOR", "The ZIP cursor is no longer valid; restart with cursor=\"\"", str3, str);
        }
        JSONArray array = JSON.array();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c23734.m4934(str, C8200.comparing(new C6639(2))).iterator());
        int i4 = 0;
        while (true) {
            if (arrayDeque.isEmpty()) {
                str4 = str8;
                z3 = false;
                break;
            }
            C5556.m15716();
            Iterator it = (Iterator) arrayDeque.peek();
            if (it.hasNext()) {
                C3545 c3545 = (C3545) it.next();
                int i5 = i4 + 1;
                if (i4 < i2) {
                    str6 = str8;
                    i3 = i5;
                } else {
                    if (array.size() == i) {
                        z3 = true;
                        str4 = str8;
                        i4 = i5;
                        break;
                    }
                    i3 = i5;
                    String substring = c3545.getName().substring(str.length());
                    if (z2) {
                        str6 = str8;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        long size = c3545.getSize();
                        String str9 = "-";
                        sb.append(size >= 0 ? Long.toString(size) : "-");
                        sb.append(" ");
                        long m10793 = c3545.m10793();
                        if (m10793 >= 0) {
                            str6 = str8;
                            str7 = Long.toString(m10793);
                        } else {
                            str6 = str8;
                            str7 = "-";
                        }
                        sb.append(str7);
                        sb.append(" ");
                        if (!c3545.isDirectory() && c3545.m10808()) {
                            str9 = "e";
                        }
                        substring = C23202.m51498(sb, str9, " ", substring);
                    }
                    array.add(substring);
                }
                if (z && c3545.isDirectory()) {
                    arrayDeque.push(c23734.m4934(c3545.getName(), C8200.comparing(new C6639(2))).iterator());
                }
                i4 = i3;
                str8 = str6;
            } else {
                arrayDeque.pop();
            }
        }
        if (i2 > i4) {
            throw m2544("ZIP_INVALID_CURSOR", str4, str3, str);
        }
        JSONObject add = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "entryPath", str).add("listing", array);
        JSONObject add2 = JSON.object().add("hasMore", z3);
        if (z3) {
            str5 = (array.size() + i2) + "." + m34531;
        } else {
            str5 = "";
        }
        return add.add("pagination", add2.add("nextCursor", str5));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final JSONObject m2548(JSONObject jSONObject) {
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "password", "encoding", "startLine", "startColumn", "limit", "maxChars");
        final String m15720 = C5556.m15720(jSONObject, "entryPath");
        C5556.m15718(m15720, "entryPath", false);
        final String m157202 = C5556.m15720(jSONObject, "password");
        final String m157203 = C5556.m15720(jSONObject, "encoding");
        final long m48626 = C21474.m48626(jSONObject, "startLine", 0L, 9007199254740991L);
        final long m486262 = C21474.m48626(jSONObject, "startColumn", 0L, 9007199254740991L);
        final int m15710 = C5556.m15710(jSONObject, "limit", 1, 2000);
        final int m157102 = C5556.m15710(jSONObject, "maxChars", 2, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        return m2538(jSONObject, m15720, false, new InterfaceC19668() { // from class: l.ۡ᩵ۜ
            @Override // l.InterfaceC19668
            /* renamed from: ֫ */
            public final JSONObject mo8480(String str, C18090 c18090, C12619 c12619, C7383 c7383) {
                return C0616.m2540(m15720, m157202, m157203, m48626, m486262, m15710, m157102, str, c18090);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m2540(String str, String str2, String str3, long j, long j2, int i, int i2, String str4, C18090 c18090) {
        try {
            C18962 c18962 = new C18962(c18090.m42189(m2545(c18090, str4, str, str2)));
            try {
                C23089 m5241 = C1532.m5241(c18962, str3, j, j2, i, i2);
                c18962.close();
                if (m5241.f74245) {
                    return C7416.m19939(MotionUtils.EASING_TYPE_PATH, str4, "entryPath", str).add(TextBundle.TEXT_ENTRY, m5241.f74238).add("encoding", m5241.f74236).add("startLine", j).add("startColumn", j2).add("nextLine", m5241.f74240).add("nextColumn", m5241.f74242).add("returnedLineCount", m5241.f74244).add("returnedCodePoints", m5241.f74237).add("hasMore", m5241.f74243);
                }
                C3059 m2544 = m2544("ZIP_OFFSET_OUT_OF_RANGE", "The requested text position is outside the ZIP entry", str4, str);
                m2544.f9609.add("finalLine", m5241.f74241).add("finalColumn", m5241.f74239);
                throw m2544;
            } finally {
            }
        } catch (CharacterCodingException | C6156 unused) {
            throw m2544("ZIP_TEXT_DECODE_FAILED", "The ZIP entry is not valid in the selected text encoding", str4, str);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final JSONObject m2547(JSONObject jSONObject) {
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "entryPath", "password", "byteOffset", "maxBytes");
        final String m15720 = C5556.m15720(jSONObject, "entryPath");
        C5556.m15718(m15720, "entryPath", false);
        final String m157202 = C5556.m15720(jSONObject, "password");
        final long m48626 = C21474.m48626(jSONObject, "byteOffset", 0L, 9007199254740991L);
        final int m15710 = C5556.m15710(jSONObject, "maxBytes", 1, 65536);
        return m2538(jSONObject, m15720, false, new InterfaceC19668() { // from class: l.ܺ᩵ۜ
            @Override // l.InterfaceC19668
            /* renamed from: ֫ */
            public final JSONObject mo8480(String str, C18090 c18090, C12619 c12619, C7383 c7383) {
                return C0616.m2539(m15720, m157202, m15710, m48626, str, c18090);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m2539(String str, String str2, int i, long j, String str3, C18090 c18090) {
        C3545 m2545 = m2545(c18090, str3, str, str2);
        byte[] bArr = new byte[i];
        C18962 c18962 = new C18962(c18090.m42189(m2545));
        long j2 = 0;
        while (true) {
            if (j2 < j) {
                try {
                    int read = c18962.read(bArr, 0, (int) Math.min(i, j - j2));
                    if (read < 0) {
                        C3059 m2544 = m2544("ZIP_OFFSET_OUT_OF_RANGE", "The byte offset is past the end of the ZIP entry", str3, str);
                        m2544.f9609.add("size", j2);
                        throw m2544;
                    }
                    j2 += read;
                } finally {
                }
            } else {
                int i2 = 0;
                while (i2 < i) {
                    int read2 = c18962.read(bArr, i2, i - i2);
                    if (read2 < 0) {
                        break;
                    }
                    i2 += read2;
                }
                boolean z = c18962.read() >= 0;
                long m48627 = C21474.m48627("byteOffset", j, i2);
                long size = z ? m2545.getSize() : m48627;
                if (size < 0 || size > 9007199254740991L) {
                    size = -1;
                }
                long j3 = size;
                JSONObject add = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str3).add("entryPath", str).add("byteOffset", j);
                if (i2 != i) {
                    bArr = Arrays.copyOf(bArr, i2);
                }
                JSONObject add2 = add.add("hex", C13573.m32618(bArr)).add("nextByteOffset", m48627).add("totalBytes", j3).add("hasMore", z);
                c18962.close();
                return add2;
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final JSONObject m2549(JSONObject jSONObject) {
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "password");
        final String m15720 = C5556.m15720(jSONObject, "password");
        return m2538(jSONObject, "", true, new InterfaceC19668() { // from class: l.ۘ᩵ۜ
            @Override // l.InterfaceC19668
            /* renamed from: ֫ */
            public final JSONObject mo8480(String str, C18090 c18090, C12619 c12619, C7383 c7383) {
                return C0616.m2541(m15720, str, c18090);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m2541(String str, String str2, C18090 c18090) {
        int i = 0;
        try {
            byte[] bArr = new byte[65536];
            for (C3545 c3545 : c18090.m42205()) {
                c3545.getName();
                C5556.m15716();
                if (!c3545.isDirectory()) {
                    if (c3545.m10808() && str.isEmpty()) {
                        throw m2544("ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password", str2, c3545.getName());
                    }
                    c18090.m42192(str);
                    C18962 c18962 = new C18962(c18090.m42202(c3545));
                    while (c18962.read(bArr) >= 0) {
                        try {
                            C5556.m15716();
                        } catch (Throwable th) {
                            try {
                                c18962.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    c18962.close();
                    i++;
                }
            }
            return JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2).add("checkedEntries", i);
        } catch (IOException e) {
            C3059 m2543 = m2543(e, str2, "", true);
            m2543.f9609.put("checkedEntries", 0);
            throw m2543;
        } catch (RuntimeException unused) {
            C3059 m2544 = m2544("ZIP_TEST_FAILED", "The ZIP test could not be completed", str2, "");
            m2544.f9609.put("checkedEntries", 0);
            throw m2544;
        } catch (C3059 e2) {
            e2.f9609.put(MotionUtils.EASING_TYPE_PATH, str2).put("entryPath", "").put("checkedEntries", 0);
            throw e2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private JSONObject m2538(JSONObject jSONObject, String str, boolean z, InterfaceC19668 interfaceC19668) {
        boolean z2;
        C17760 c17760 = this.f2371;
        C7383 m41607 = c17760.m41607();
        String m41599 = C17760.m41599(C5556.m15720(jSONObject, MotionUtils.EASING_TYPE_PATH), m41607, MotionUtils.EASING_TYPE_PATH);
        try {
            C10000 m41608 = c17760.m41608(m41599);
            try {
                C5556.m15716();
                C12619 m15715 = C5556.m15715(c17760, m41599, false);
                JSONObject jSONObject2 = null;
                try {
                    try {
                        C18090 m42167 = C18090.m42167(m15715.m30882(), z);
                        try {
                            try {
                                JSONObject mo8480 = interfaceC19668.mo8480(m41599, m42167, m15715, m41607);
                                C5556.m15716();
                                C12619 m41613 = c17760.m41613(m41599);
                                if (m41613.m30885() != EnumC3447.REGULAR || m15715.m30884() != m41613.m30884() || m15715.m30883() != m41613.m30883()) {
                                    throw m2544("ZIP_CHANGED_DURING_READ", "The ZIP file changed during this read; start again", m41599, str);
                                }
                                c17760.m41607().m19883(m41599);
                                m42167.close();
                                m41608.close();
                                return mo8480;
                            } catch (IOException e) {
                                e = e;
                                z2 = true;
                                C3059 m2543 = m2543(e, m41599, str, z && !z2 && ((e instanceof ZipException) || (e instanceof EOFException)));
                                if (z && "ZIP_READ_FAILED".equals(m2543.f9610)) {
                                    m2543 = m2544("ZIP_TEST_FAILED", "The ZIP test could not be completed", m41599, str);
                                }
                                if (z && 0 != 0) {
                                    m2543.f9609.put("checkedEntries", jSONObject2.getInt("checkedEntries"));
                                }
                                throw m2543;
                            }
                        } finally {
                        }
                    } catch (RuntimeException unused) {
                        throw m2544(z ? "ZIP_TEST_FAILED" : "ZIP_READ_FAILED", "The ZIP operation could not be completed", m41599, str);
                    }
                } catch (IOException e2) {
                    e = e2;
                    z2 = false;
                }
            } finally {
            }
        } catch (C3059 e3) {
            e = e3;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f9610)) {
                e = m2544("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", m41599, str);
            }
            JSONObject jSONObject3 = e.f9609;
            jSONObject3.put(MotionUtils.EASING_TYPE_PATH, m41599);
            if (jSONObject3.get("entryPath") == null) {
                jSONObject3.put("entryPath", str);
            }
            if (z && jSONObject3.get("checkedEntries") == null) {
                jSONObject3.put("checkedEntries", 0);
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3545 m2545(C18090 c18090, String str, String str2, String str3) {
        C3545 entry = c18090.getEntry(str2);
        if (entry == null) {
            throw m2544("ZIP_ENTRY_NOT_FOUND", "The ZIP entry does not exist", str, str2);
        }
        if (entry.isDirectory()) {
            throw m2544("ZIP_ENTRY_IS_DIRECTORY", "A directory cannot be read as file content", str, str2);
        }
        if (entry.m10808() && str3.isEmpty()) {
            throw m2544("ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password", str, entry.getName());
        }
        c18090.m42192(str3);
        return entry;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m2543(IOException iOException, String str, String str2, boolean z) {
        if (Thread.currentThread().isInterrupted()) {
            return m2544("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", str, str2);
        }
        boolean z2 = false;
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if (th instanceof InterruptedIOException) {
                return m2544("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", str, str2);
            }
            if (th instanceof C13855) {
                z2 = true;
            }
        }
        if (z2) {
            return m2544(z ? "ZIP_TEST_FAILED" : "ZIP_READ_FAILED", "The ZIP storage could not be read", str, str2);
        }
        if (iOException instanceof C3979) {
            return m2544("ZIP_BAD_PASSWORD", "The password could not decrypt the ZIP entry", str, str2);
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("unsupported") || lowerCase.contains("not supported") || lowerCase.contains("not implemented") || lowerCase.contains("requires a dictionary")) {
            return C3059.m9369("ZIP_UNSUPPORTED", "The ZIP uses an unsupported compression, encryption, or archive feature", "fatal", null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "entryPath", str2));
        }
        return m2544(z ? "ZIP_INVALID" : "ZIP_READ_FAILED", z ? "ZIP structure, length, checksum, or authentication validation failed" : "The ZIP file or entry could not be read", str, str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m2544(String str, String str2, String str3, String str4) {
        return C5556.m15713(C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "entryPath", str4), str, str2);
    }
}
