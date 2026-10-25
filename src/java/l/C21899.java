package l;

import net.sf.sevenzipjbinding.ArchiveFormat;

/* compiled from: 4B7C */
/* renamed from: l.᩸᩺᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C21899 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int[] f70110;

    static {
        int[] iArr = new int[ArchiveFormat.values().length];
        f70110 = iArr;
        try {
            iArr[ArchiveFormat.SEVEN_ZIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f70110[ArchiveFormat.ZIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f70110[ArchiveFormat.BZIP2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f70110[ArchiveFormat.GZIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f70110[ArchiveFormat.TAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
