package l;

import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

/* compiled from: F8CE */
/* renamed from: l.ܽۨܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16621 extends GZIPOutputStream {
    public C16621(OutputStream outputStream, int i) {
        super(outputStream, 65536);
        int[] iArr;
        Deflater deflater = ((GZIPOutputStream) this).def;
        iArr = C18033.f56225;
        deflater.setLevel(iArr[i]);
    }
}
