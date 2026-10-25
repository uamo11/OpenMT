package l;

import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: X6VB */
/* renamed from: l.ۡۘۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8629 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11459 f26350;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f26351;

    public C8629(C11459 c11459, String str, boolean z) {
        List list;
        int i;
        this.f26350 = c11459;
        if (z) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int groupCount = c11459.matcher("").groupCount();
            Map m28267 = c11459.m28267();
            int i2 = 0;
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                char c = '$';
                if (charAt == '\\') {
                    i2++;
                    if (i2 == str.length()) {
                        throw m22389();
                    }
                    char charAt2 = str.charAt(i2);
                    if (charAt2 != '$') {
                        if (charAt2 == '\\') {
                            c = '\\';
                        } else if (charAt2 == 'n') {
                            c = '\n';
                        } else if (charAt2 == 'r') {
                            c = '\r';
                        } else {
                            if (charAt2 != 't') {
                                throw m22389();
                            }
                            c = '\t';
                        }
                    }
                    sb.append(c);
                } else if (charAt == '$') {
                    int i3 = i2 + 1;
                    if (i3 == str.length()) {
                        throw m22389();
                    }
                    char charAt3 = str.charAt(i3);
                    if (charAt3 == '{') {
                        int i4 = i2 + 2;
                        i3 = str.indexOf(q.h, i4);
                        if (i3 < 0 || i3 == i4) {
                            throw m22389();
                        }
                        String substring = str.substring(i4, i3);
                        if (substring.charAt(0) < '0' || substring.charAt(0) > '9') {
                            Integer num = (Integer) m28267.get(substring);
                            if (num == null) {
                                throw m22389();
                            }
                            i = num.intValue();
                        } else {
                            for (int i5 = 0; i5 < substring.length(); i5++) {
                                if (substring.charAt(i5) < '0' || substring.charAt(i5) > '9') {
                                    throw m22389();
                                }
                            }
                            try {
                                i = Integer.parseInt(substring);
                            } catch (NumberFormatException unused) {
                                throw m22389();
                            }
                        }
                    } else {
                        if (charAt3 < '0' || charAt3 > '9') {
                            throw m22389();
                        }
                        i = charAt3 - '0';
                    }
                    if (i > groupCount) {
                        throw m22389();
                    }
                    if (sb.length() != 0) {
                        arrayList.add(new C6512(sb.toString(), -1));
                        sb.setLength(0);
                    }
                    arrayList.add(new C6512(null, i));
                    i2 = i3;
                } else {
                    sb.append(charAt);
                }
                i2++;
            }
            list = arrayList;
            if (sb.length() != 0) {
                arrayList.add(new C6512(sb.toString(), -1));
                list = arrayList;
            }
        } else {
            Object[] objArr = {new C6512(str, -1)};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            C11003.requireNonNull(obj);
            arrayList2.add(obj);
            list = C20195.unmodifiableList(arrayList2);
        }
        this.f26351 = list;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9335 m22390(String str, boolean z) {
        int i;
        String str2;
        String str3;
        int i2;
        int i3;
        m22387();
        C12164 matcher = this.f26350.matcher((CharSequence) str);
        StringBuilder sb = new StringBuilder(Math.min(str.length(), 20971520));
        int i4 = 0;
        int i5 = 0;
        do {
            boolean find = matcher.find();
            m22387();
            if (matcher.m29603() || matcher.m29613()) {
                throw new C23445(EnumC20624.REGEX_FAILED);
            }
            if (!find) {
                break;
            }
            m22388(i4, matcher.start(), str, sb);
            for (C6512 c6512 : this.f26351) {
                m22387();
                i = c6512.f20103;
                if (i < 0) {
                    str2 = c6512.f20104;
                    str3 = c6512.f20104;
                    m22388(0, str3.length(), str2, sb);
                } else {
                    i2 = c6512.f20103;
                    int start = matcher.start(i2);
                    if (start >= 0) {
                        i3 = c6512.f20103;
                        m22388(start, matcher.end(i3), str, sb);
                    }
                }
            }
            i4 = matcher.end();
            i5++;
        } while (!z);
        m22388(i4, str.length(), str, sb);
        m22387();
        return new C9335(sb.toString(), i5);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22388(int i, int i2, String str, StringBuilder sb) {
        if ((sb.length() + i2) - i > 20971520) {
            throw new C23445(EnumC20624.RESULT_TOO_LARGE);
        }
        sb.append((CharSequence) str, i, i2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m22389() {
        return new IllegalArgumentException("Invalid replacement template or unknown capture group.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22387() {
        if (Thread.currentThread().isInterrupted()) {
            throw new C23445(EnumC20624.CANCELED);
        }
    }
}
