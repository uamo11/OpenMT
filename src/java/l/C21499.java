package l;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: H8OG */
/* renamed from: l.᩸ۢۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21499 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1037 m48666(C17714 c17714, boolean z, boolean z2) {
        if (z) {
            m48668(3, c17714, false);
        }
        c17714.m41459((int) c17714.m41480(), StandardCharsets.UTF_8);
        long m41480 = c17714.m41480();
        String[] strArr = new String[(int) m41480];
        for (int i = 0; i < m41480; i++) {
            strArr[i] = c17714.m41459((int) c17714.m41480(), StandardCharsets.UTF_8);
        }
        if (z2 && (c17714.m41456() & 1) == 0) {
            throw C9080.m23440("framing bit expected to be set", (Throwable) null);
        }
        return new C1037(strArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23896 m48667(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = C3603.f11424;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                C19956.m46037("Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C3133.m9555(new C17714(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    C19956.m46036("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C13215(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C23896(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48668(int i, C17714 c17714, boolean z) {
        if (c17714.m41457() < 7) {
            if (z) {
                return false;
            }
            throw C9080.m23440("too short header: " + c17714.m41457(), (Throwable) null);
        }
        if (c17714.m41456() != i) {
            if (z) {
                return false;
            }
            throw C9080.m23440("expected header type " + Integer.toHexString(i), (Throwable) null);
        }
        if (c17714.m41456() == 118 && c17714.m41456() == 111 && c17714.m41456() == 114 && c17714.m41456() == 98 && c17714.m41456() == 105 && c17714.m41456() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw C9080.m23440("expected characters 'vorbis'", (Throwable) null);
    }
}
