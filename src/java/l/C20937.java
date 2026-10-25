package l;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: 27BS */
/* renamed from: l.᩷ܳܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20937 implements InterfaceC22347 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File f67698;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FileOutputStream f67699;

    public C20937(File file) {
        File createTempFile = File.createTempFile("NanoHTTPD-", "", file);
        this.f67698 = createTempFile;
        this.f67699 = new FileOutputStream(createTempFile);
    }

    @Override // l.InterfaceC22347
    public final void delete() {
        AbstractC4708.m13790(this.f67699);
        File file = this.f67698;
        if (file.delete()) {
            return;
        }
        throw new Exception("could not delete temporary file: " + file.getAbsolutePath());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m47759() {
        return this.f67698.getAbsolutePath();
    }
}
