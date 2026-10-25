package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* compiled from: 46W4 */
/* renamed from: l.ۖܺۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2629 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23795 f8298;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17760 f8299;

    public C2629(C17760 c17760, C23795 c23795) {
        this.f8299 = c17760;
        this.f8298 = c23795;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16033 m8286(String str, boolean z, String str2, int i, String str3, C8979 c8979) {
        String str4;
        String str5;
        boolean z2;
        boolean z3;
        C11459 m8280;
        String str6;
        String str7;
        boolean z4;
        boolean z5;
        m8282();
        str4 = c8979.f27281;
        C11459 c11459 = null;
        if (str4.isEmpty()) {
            m8280 = null;
        } else {
            str5 = c8979.f27281;
            z2 = c8979.f27280;
            z3 = c8979.f27287;
            m8280 = m8280(str5, "namePattern", z2, z3, false);
        }
        str6 = c8979.f27282;
        if (!str6.isEmpty()) {
            str7 = c8979.f27282;
            z4 = c8979.f27284;
            z5 = c8979.f27278;
            c11459 = m8280(str7, "contentPattern", z4, z5, true);
        }
        C11459 c114592 = c11459;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray array = JSON.array();
        C18151 m52476 = this.f8298.m52476(str, z, str2, i, str3, new C20974(this, m8280, c8979, linkedHashMap, array, c114592));
        JSONArray array2 = JSON.array();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            array2.add(JSON.object().add("reason", (String) entry.getKey()).add("count", ((Integer) entry.getValue()).intValue()));
        }
        return new C16033(m52476, array2, array);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8283(JSONArray jSONArray, C12619 c12619, String str) {
        if (jSONArray.size() < 20) {
            jSONArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c12619.m30882().mo23554()).add("reason", str));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11459 m8280(String str, String str2, boolean z, boolean z2, boolean z3) {
        int i = z ? z3 ? 8 : 0 : 16;
        if (!z2) {
            i |= 66;
        }
        try {
            return C11459.m28259(i, str);
        } catch (PatternSyntaxException e) {
            throw C3059.m9364("Invalid regular expression: " + e.getDescription(), str2, JSON.value(str), JSON.array(), JSON.object().add(str2, ""));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8284(LinkedHashMap linkedHashMap, String str) {
        C13843.merge(linkedHashMap, str, 1, new C10697());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8282() {
        if (Thread.currentThread().isInterrupted()) {
            throw C3059.m9365("FILE_SEARCH_CANCELED", "The file search was canceled. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8285(InputStream inputStream, C11459 c11459) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new C9685(inputStream));
        bufferedInputStream.mark(32768);
        byte[] bArr = new byte[32768];
        int i = 0;
        while (i < 32768) {
            int read = bufferedInputStream.read(bArr, i, 32768 - i);
            if (read < 0) {
                break;
            }
            if (read == 0) {
                int read2 = bufferedInputStream.read();
                if (read2 < 0) {
                    break;
                }
                bArr[i] = (byte) read2;
                i++;
            } else {
                i += read;
            }
        }
        if (i < 32768) {
            bArr = Arrays.copyOf(bArr, i);
        }
        C17095 m33920 = C14272.m33920("", bArr);
        bufferedInputStream.reset();
        for (int i2 = 0; i2 < m33920.f52401; i2++) {
            if (bufferedInputStream.read() < 0) {
                throw new IOException("File ended inside its BOM.");
            }
        }
        CharsetDecoder newDecoder = m33920.f52402.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream, newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        try {
            C4131 c4131 = new C4131(inputStreamReader);
            try {
                boolean m12410 = c4131.m12410(c11459, new C10650(1), true);
                c4131.close();
                inputStreamReader.close();
                return m12410;
            } finally {
            }
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
