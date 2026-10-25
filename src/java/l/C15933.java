package l;

/* compiled from: F6OD */
/* renamed from: l.ܺ۫ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15933 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f49202;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C0411 f49203;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f49204;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C19012 f49205;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f49206;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f49207;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f49208;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49209 = -1;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f49210 = -1;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f49211;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f49212;

    public C15933(C0411 c0411, C3463 c3463, C19237 c19237, boolean z, C19012 c19012) {
        String str;
        char charAt;
        this.f49203 = c0411;
        this.f49207 = z;
        int i = 0;
        if (c3463.m10602()) {
            str = "\t";
        } else {
            int max = Math.max(0, c3463.m10601());
            if (max < 0) {
                throw new IllegalArgumentException(C19370.m44628(max, "count is negative: "));
            }
            if (max == 0) {
                str = "";
            } else if (max == 1) {
                str = " ";
            } else {
                if (1 > Integer.MAX_VALUE / max) {
                    throw new OutOfMemoryError(C18307.m42645(max, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(max);
                for (int i2 = 0; i2 < max; i2++) {
                    sb.append(" ");
                }
                str = sb.toString();
            }
        }
        this.f49204 = str;
        this.f49202 = c19237.m44370();
        String str2 = "\n";
        if (!z) {
            if (c19237.m44371().isEmpty()) {
                CharSequence charSequence = c0411.f1868;
                while (true) {
                    if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n') {
                        break;
                    }
                    if (charAt == '\r') {
                        int i3 = i + 1;
                        str2 = (i3 >= charSequence.length() || charSequence.charAt(i3) != '\n') ? "\r" : "\r\n";
                    } else {
                        i++;
                    }
                }
            } else {
                str2 = c19237.m44371();
            }
        }
        this.f49211 = str2;
        this.f49205 = c19012;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0300, code lost:
    
        if (((l.InterfaceC0463) r3.get(r12)).getType() != 97) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x04f1, code lost:
    
        if (r9.equals("finally") != false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0545, code lost:
    
        if (r6.equals("new") != false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x030c, code lost:
    
        if (r9.equals(com.google.android.material.motion.MotionUtils.EASING_TYPE_FORMAT_START) == false) goto L198;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x059d  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m37712() {
        /*
            Method dump skipped, instructions count: 1578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15933.m37712():void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m37711() {
        char charAt;
        C19012 c19012 = this.f49205;
        if (c19012.length() == 0 || (charAt = c19012.charAt(c19012.length() - 1)) == ' ' || charAt == '\t' || charAt == '\n' || charAt == '\r') {
            return;
        }
        c19012.append(' ');
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37710(int i) {
        String str = this.f49211;
        C19012 c19012 = this.f49205;
        c19012.append((CharSequence) str);
        if (this.f49207) {
            return;
        }
        c19012.append((CharSequence) this.f49202);
        int max = Math.max(0, i);
        if (max < 0) {
            throw new IllegalArgumentException(C19370.m44628(max, "count is negative: "));
        }
        String str2 = this.f49204;
        int length = str2.length();
        if (max == 0 || length == 0) {
            str2 = "";
        } else if (max != 1) {
            if (str2.length() > Integer.MAX_VALUE / max) {
                throw new OutOfMemoryError("Repeating " + str2.length() + " bytes String " + max + " times will produce a String exceeding maximum size.");
            }
            StringBuilder sb = new StringBuilder(length * max);
            for (int i2 = 0; i2 < max; i2++) {
                sb.append(str2);
            }
            str2 = sb.toString();
        }
        c19012.append((CharSequence) str2);
    }
}
