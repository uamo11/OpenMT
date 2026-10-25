package l;

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: Y8PY */
/* renamed from: l.ᩳۚ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17839 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54488 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f54490 = {0, 0, 0, 1};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f54489 = {"", "A", "B", "C"};

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f54491 = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m41769(int i, int i2, int i3, int[] iArr, boolean z, int i4) {
        Object[] objArr = {f54489[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = C3603.f11424;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x016d, code lost:
    
        if (r9.equals("L60") == false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0277  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair m41767(java.lang.String r8, java.lang.String[] r9, l.C21054 r10) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17839.m41767(java.lang.String, java.lang.String[], l.᩷ᩴ֫):android.util.Pair");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m41770(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(f54490, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0416 A[Catch: NumberFormatException -> 0x0420, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x0420, blocks: (B:225:0x03c8, B:227:0x03da, B:238:0x03f7, B:241:0x0416), top: B:224:0x03c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024e  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair m41768(l.C8353 r27) {
        /*
            Method dump skipped, instructions count: 2192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17839.m41768(l.۠ᩴ֫):android.util.Pair");
    }
}
