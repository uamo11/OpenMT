package l;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: 82VA */
/* renamed from: l.۟֡֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7110 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File f21818;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File f21819;

    public C7110(File file) {
        this.f21819 = file;
        this.f21818 = new File(file.getPath() + ".bak");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m19126() {
        return this.f21819.exists() || this.f21818.exists();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19124() {
        this.f21819.delete();
        this.f21818.delete();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final OutputStream m19128() {
        File file = this.f21819;
        if (file.exists()) {
            File file2 = this.f21818;
            if (!file2.exists()) {
                if (!file.renameTo(file2)) {
                    C19956.m46037("Couldn't rename file " + file + " to backup file " + file2);
                }
            } else {
                file.delete();
            }
        }
        try {
            return new C13459(file);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e);
            }
            try {
                return new C13459(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file, e2);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19125(DataOutputStream dataOutputStream) {
        dataOutputStream.close();
        this.f21818.delete();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FileInputStream m19127() {
        File file = this.f21818;
        boolean exists = file.exists();
        File file2 = this.f21819;
        if (exists) {
            file2.delete();
            file.renameTo(file2);
        }
        return new FileInputStream(file2);
    }
}
