package l;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: D9OF */
/* renamed from: l.۫᩹ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12699 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f38222;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10583[] f38223;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AssetManager f38224;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11226 f38225;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File f38226;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f38227 = false;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f38228;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f38229;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Executor f38230;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30963(final int i, final Serializable serializable) {
        this.f38230.execute(new Runnable() { // from class: l.۬᩹ۧ
            @Override // java.lang.Runnable
            public final void run() {
                C12699.this.f38225.mo6738(i, serializable);
            }
        });
    }

    public C12699(AssetManager assetManager, Executor executor, InterfaceC11226 interfaceC11226, String str, File file) {
        this.f38224 = assetManager;
        this.f38230 = executor;
        this.f38225 = interfaceC11226;
        this.f38222 = str;
        this.f38226 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = C18987.f59862;
                    break;
                case 26:
                    bArr = C18987.f59864;
                    break;
                case 27:
                    bArr = C18987.f59863;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C18987.f59861;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = C18987.f59865;
                    break;
            }
        }
        this.f38228 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30965() {
        if (this.f38228 == null) {
            m30963(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.f38226;
        if (file.exists()) {
            if (!file.canWrite()) {
                m30963(4, (Serializable) null);
                return false;
            }
        } else {
            try {
                file.createNewFile();
            } catch (IOException unused) {
                m30963(4, (Serializable) null);
                return false;
            }
        }
        this.f38227 = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C12699 m30966() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12699.m30966():l.۫᩹ۧ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private FileInputStream m30962(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30967() {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        InterfaceC11226 interfaceC11226 = this.f38225;
        C10583[] c10583Arr = this.f38223;
        if (c10583Arr == null || (bArr = this.f38228) == null) {
            return;
        }
        if (!this.f38227) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(C9815.f29669);
                byteArrayOutputStream.write(bArr);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            interfaceC11226.mo6738(7, e);
        } catch (IllegalStateException e2) {
            interfaceC11226.mo6738(8, e2);
        }
        if (!C9815.m24882(byteArrayOutputStream, bArr, c10583Arr)) {
            interfaceC11226.mo6738(5, null);
            this.f38223 = null;
            byteArrayOutputStream.close();
        } else {
            this.f38229 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f38223 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m30968() {
        byte[] bArr = this.f38229;
        if (bArr != null) {
            if (!this.f38227) {
                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.f38226);
                        try {
                            byte[] bArr2 = new byte[512];
                            while (true) {
                                int read = byteArrayInputStream.read(bArr2);
                                if (read > 0) {
                                    fileOutputStream.write(bArr2, 0, read);
                                } else {
                                    m30963(1, (Serializable) null);
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    return true;
                                }
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } finally {
                    this.f38229 = null;
                    this.f38223 = null;
                }
            } catch (FileNotFoundException e) {
                m30963(6, e);
                return false;
            } catch (IOException e2) {
                m30963(7, e2);
                return false;
            }
        }
        return false;
    }
}
