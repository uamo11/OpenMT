package l;

import java.io.File;

/* compiled from: 173H */
/* renamed from: l.᩺ܶ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23064 implements Comparable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f74188;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f74189;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f74190;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f74191;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final File f74192;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f74193;

    public C23064(String str, long j, long j2, long j3, File file) {
        this.f74191 = str;
        this.f74190 = j;
        this.f74188 = j2;
        this.f74193 = file != null;
        this.f74192 = file;
        this.f74189 = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C23064 c23064) {
        String str = c23064.f74191;
        String str2 = this.f74191;
        if (!str2.equals(str)) {
            return str2.compareTo(c23064.f74191);
        }
        long j = this.f74190 - c23064.f74190;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f74190);
        sb.append(", ");
        return C15942.m37718(sb, this.f74188, "]");
    }
}
