package l;

import java.io.FileNotFoundException;

/* compiled from: 77UM */
/* renamed from: l.ۖ֡ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2175 extends FileNotFoundException {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7191(Exception exc) {
        for (Exception exc2 = exc; exc2 != null; exc2 = exc2.getCause()) {
            if (exc2 instanceof C2175) {
                return true;
            }
        }
        return false;
    }
}
