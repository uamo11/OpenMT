package l;

import java.io.BufferedReader;

/* compiled from: 54IP */
/* renamed from: l.֡ۖ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0114 extends BufferedReader implements InterfaceC19140 {
    @Override // java.io.BufferedReader, l.InterfaceC19140
    public /* synthetic */ InterfaceC17664 lines() {
        return C5028.lines(this);
    }

    @Override // java.io.BufferedReader
    public final String readLine() {
        StringBuilder sb = new StringBuilder();
        synchronized (((BufferedReader) this).lock) {
            boolean z = false;
            while (true) {
                int read = read();
                if (read == -1) {
                    String sb2 = sb.toString();
                    if (sb2.isEmpty()) {
                        return null;
                    }
                    return sb2;
                }
                if (z && read == 10) {
                    return sb.substring(0, sb.length() - 1);
                }
                z = read == 13;
                sb.append((char) read);
            }
        }
    }
}
