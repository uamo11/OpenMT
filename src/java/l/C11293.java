package l;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import bin.mt.plus.Features3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: O17J */
/* renamed from: l.ۧ᩹ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11293 extends AbstractC15440 implements InterfaceC21855 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f33832;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f33833;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final File f33834;

    @Override // l.AbstractC15440
    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo27912() {
        return true;
    }

    @Override // l.AbstractC15440
    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo27917() {
        return true;
    }

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public C17642 mo27920() {
        return null;
    }

    @Override // l.AbstractC15440
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11293 mo27925() {
        return this;
    }

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public void mo27930() {
    }

    @Override // l.AbstractC15440
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean mo27933() {
        return true;
    }

    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo27938() {
        return false;
    }

    public C11293(File file, boolean z) {
        this.f33834 = file;
        this.f33833 = z;
        this.f33832 = z || C19739.m45449(file.getPath()) != null;
    }

    @Override // l.AbstractC15440
    /* renamed from: ᩺ */
    public AbstractC15440 mo23559() {
        return new C11293(this.f33834.getAbsoluteFile(), this.f33833);
    }

    @Override // l.AbstractC15440
    /* renamed from: ֫֫ */
    public String mo23544() {
        return this.f33834.getAbsolutePath();
    }

    @Override // l.AbstractC15440
    /* renamed from: ۗ */
    public final boolean mo23545() {
        if (!mo23120()) {
            if (this.f33833) {
                try {
                    return this.f33834.createNewFile();
                } catch (IOException unused) {
                }
            } else {
                C19697 c19697 = null;
                try {
                    try {
                        c19697 = mo27937();
                        c19697.m45380(this.f33834.getPath(), false).close();
                        try {
                            c19697.m45356(this.f33834.getPath(), 420, false, false);
                            c19697.m45355(this.f33834.getPath(), 0, 0, false, false);
                        } catch (IOException unused2) {
                        }
                        c19697.f63634 = 0L;
                        return true;
                    } finally {
                        if (c19697 != null) {
                            c19697.f63634 = 0L;
                        }
                    }
                } catch (IOException unused3) {
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC15440
    /* renamed from: ۙ */
    public final boolean mo23546() {
        if (this.f33833) {
            if (this.f33834.exists()) {
                return this.f33834.isDirectory();
            }
            if (this.f33834.mkdirs()) {
                return true;
            }
        }
        C19697 c19697 = null;
        try {
            c19697 = mo27937();
            c19697.m45375(this.f33834.getPath(), true);
            c19697.f63634 = 0L;
            return true;
        } catch (IOException unused) {
            if (c19697 == null) {
                return false;
            }
            c19697.f63634 = 0L;
            return false;
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ᩹ */
    public final AbstractC10503 mo23558() {
        return new C18348(this);
    }

    @Override // l.AbstractC15440
    public final String getName() {
        return this.f33834.getName();
    }

    @Override // l.AbstractC15440
    /* renamed from: ܺ֫ */
    public final String mo23554() {
        return this.f33834.getPath();
    }

    @Override // l.AbstractC15440
    public final String getParent() {
        return this.f33834.getParent();
    }

    @Override // l.AbstractC15440
    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final String mo27935() {
        try {
            C17642 mo27920 = mo27920();
            if (mo27920 == null) {
                mo27920 = mo27927();
            }
            return mo27920.m41285();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo27934(String str) {
        if (!this.f33833 || !C22518.m50492().mo2658()) {
            super.mo27934(str);
            return;
        }
        try {
            Os.symlink(str, this.f33834.getPath());
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo27919() {
        return !this.f33833 && m36488();
    }

    @Override // l.AbstractC15440
    /* renamed from: ۬ */
    public boolean mo23552() {
        if (C15843.m37503(this.f33834)) {
            return true;
        }
        C19697 c19697 = null;
        try {
            try {
                c19697 = mo27937();
                c19697.m45368(this.f33834.getPath());
                c19697.f63634 = 0L;
                return true;
            } catch (IOException unused) {
                if (m27909(c19697)) {
                    if (c19697 != null) {
                        c19697.f63634 = 0L;
                    }
                    return true;
                }
                if (c19697 == null) {
                    return false;
                }
                c19697.f63634 = 0L;
                return false;
            }
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean mo27929() {
        C19697 c19697 = null;
        try {
            try {
                c19697 = mo27937();
                c19697.m45368(this.f33834.getPath());
                c19697.f63634 = 0L;
                return true;
            } catch (IOException unused) {
                if (m27909(c19697)) {
                    if (c19697 != null) {
                        c19697.f63634 = 0L;
                    }
                    return true;
                }
                boolean delete = this.f33834.delete();
                if (c19697 != null) {
                    c19697.f63634 = 0L;
                }
                return delete;
            }
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    @Override // l.AbstractC15440
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo23551(l.AbstractC15440 r9) {
        /*
            r8 = this;
            java.lang.String r9 = r9.mo23544()
            java.io.File r0 = r8.f33834
            java.io.File r1 = new java.io.File
            r1.<init>(r9)
            boolean r0 = r0.renameTo(r1)
            r1 = 1
            if (r0 == 0) goto L13
            return r1
        L13:
            r2 = 0
            r0 = 0
            l.᩵᩶ܿ r0 = r8.mo27937()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            java.io.File r4 = r8.f33834     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            java.lang.String r4 = r4.getPath()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r0.m45383(r4, r9)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r0.f63634 = r2
            return r1
        L26:
            r9 = move-exception
            goto L61
        L28:
            byte[] r4 = r8.m27908(r0)     // Catch: java.lang.Throwable -> L26
            r5 = 0
            if (r4 == 0) goto L54
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L54
            r6.<init>()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L54
            java.lang.String r7 = r8.m36511()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L54
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L54
            r6.write(r7)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L54
            r7 = 47
            r6.write(r7)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L54
            r6.write(r4)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L54
            byte[] r4 = r6.toByteArray()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L54
            byte[] r9 = r9.getBytes()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L54
            r0.m45360(r4, r9)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L54
            r9 = 1
            goto L55
        L54:
            r9 = 0
        L55:
            if (r9 == 0) goto L5c
            if (r0 == 0) goto L5b
            r0.f63634 = r2
        L5b:
            return r1
        L5c:
            if (r0 == 0) goto L60
            r0.f63634 = r2
        L60:
            return r5
        L61:
            if (r0 == 0) goto L65
            r0.f63634 = r2
        L65:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11293.mo23551(l.ܶ᩵ܿ):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m27909(C19697 c19697) {
        byte[] m27908 = m27908(c19697);
        if (m27908 == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(m36511().getBytes());
            byteArrayOutputStream.write(47);
            byteArrayOutputStream.write(m27908);
            c19697.m45376(byteArrayOutputStream.toByteArray());
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m27908(C19697 c19697) {
        String name = this.f33834.getName();
        if (!C8751.m22652(name)) {
            return null;
        }
        try {
            for (byte[] bArr : c19697.m45377(m36511())) {
                if (name.equals(new String(bArr, StandardCharsets.UTF_8))) {
                    return bArr;
                }
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ۤ */
    public final boolean mo23120() {
        if ((this.f33833 && this.f33834.exists()) || mo27938()) {
            return true;
        }
        if (!this.f33833 && this.f33834.exists()) {
            return true;
        }
        if (this.f33833 && m27910()) {
            return false;
        }
        C19697 c19697 = null;
        try {
            c19697 = mo27937();
            boolean m45361 = c19697.m45361(this.f33834.getPath());
            c19697.f63634 = 0L;
            return m45361;
        } catch (IOException unused) {
            if (c19697 == null) {
                return false;
            }
            c19697.f63634 = 0L;
            return false;
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ۠֫ */
    public final boolean mo23119() {
        File file = this.f33834;
        boolean z = this.f33833;
        if (z && file.exists()) {
            return file.isFile();
        }
        if (!mo27938() && file.isFile()) {
            return true;
        }
        if (z && m27910()) {
            return false;
        }
        try {
            C17642 mo27927 = mo27927();
            char m41288 = mo27927.m41288();
            if (m41288 == 'l') {
                m41288 = mo27927.m41287();
            }
            return m41288 == '-';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ֨֫ */
    public final boolean mo23113() {
        File file = this.f33834;
        boolean z = this.f33833;
        if (z && file.exists()) {
            return file.isDirectory();
        }
        if (!mo27938() && file.isDirectory()) {
            return true;
        }
        if (z && m27910()) {
            return false;
        }
        try {
            C17642 mo27927 = mo27927();
            char m41288 = mo27927.m41288();
            if (m41288 == 'l') {
                m41288 = mo27927.m41287();
            }
            return m41288 == 'd';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final boolean mo27911() {
        if (this.f33833 && this.f33834.exists()) {
            return true;
        }
        try {
            C17642 mo27927 = mo27927();
            char m41288 = mo27927.m41288();
            if (m41288 == 'l') {
                m41288 = mo27927.m41287();
            }
            return m41288 == '-' || m41288 == 'd';
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ᩺֫ */
    public final long mo23127() {
        boolean z = this.f33833;
        File file = this.f33834;
        if (z && file.exists()) {
            return file.length();
        }
        if (!mo27938()) {
            long length = file.length();
            if (length > 0) {
                return length;
            }
        }
        try {
            return mo27927().m41290();
        } catch (IOException unused) {
            return -1L;
        }
    }

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public final long m27918() {
        C19697 c19697 = null;
        try {
            c19697 = mo27937();
            long m45371 = c19697.m45371(this.f33834.getPath());
            c19697.f63634 = 0L;
            return m45371;
        } catch (IOException unused) {
            if (c19697 == null) {
                return -1L;
            }
            c19697.f63634 = 0L;
            return -1L;
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ۛ֫ */
    public final long mo23117() {
        if (this.f33833 || !mo27938()) {
            try {
                return Features3.m57(this.f33834.getPath());
            } catch (IOException unused) {
            }
        }
        try {
            return mo27927().m41284();
        } catch (IOException unused2) {
            return 0L;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ֫ */
    public final boolean mo18537(long j) {
        if (j < 0) {
            return false;
        }
        if (this.f33833 && this.f33834.exists()) {
            return this.f33834.setLastModified(j);
        }
        if (this.f33834.setLastModified(j)) {
            return true;
        }
        C19697 c19697 = null;
        try {
            c19697 = mo27937();
            c19697.m45354(j, this.f33834.getPath());
            c19697.f63634 = 0L;
            return true;
        } catch (IOException unused) {
            if (c19697 == null) {
                return false;
            }
            c19697.f63634 = 0L;
            return false;
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean mo27936() {
        if (this.f33834.canRead()) {
            return true;
        }
        return mo23120() && C22518.m50492().mo2656();
    }

    @Override // l.AbstractC15440
    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean mo27924() {
        AbstractC15440 m36536;
        if (this.f33834.canWrite() || C22518.m50492().mo2657()) {
            return true;
        }
        return C22518.m50492().mo2658() && (m36536 = m36536()) != null && m36536.mo23120();
    }

    @Override // l.AbstractC15440
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC21087 mo27915(InterfaceC6975 interfaceC6975) {
        return new C2120(this, this, interfaceC6975);
    }

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public C17642 mo27927() {
        C17642 mo27920 = mo27920();
        return mo27920 != null ? mo27920 : m27932();
    }

    /* renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public final C17642 m27932() {
        C19697 c19697;
        try {
            c19697 = mo27937();
            try {
                C17642 m45366 = c19697.m45366(this.f33834.getPath());
                c19697.f63634 = 0L;
                return m45366;
            } catch (Throwable th) {
                th = th;
                if (c19697 != null) {
                    c19697.f63634 = 0L;
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c19697 = null;
        }
    }

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public final C17642 m27928() {
        return mo27927();
    }

    @Override // l.AbstractC15440
    /* renamed from: ۧ */
    public final List mo23549(boolean z) {
        if (this.f33833 && m27910()) {
            return new C15587(this.f33834).mo23549(z);
        }
        C19697 c19697 = null;
        try {
            try {
                c19697 = mo27937();
                List list = (List) C5378.stream(c19697.m45350(this.f33834.getPath(), z)).map(new Function() { // from class: l.۟᩸ܿ
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public /* synthetic */ Function mo22274andThen(Function function) {
                        return C20696.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return C11293.this.mo27914((C17642) obj);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C20696.$default$compose(this, function);
                    }
                }).collect(C22976.toList());
                c19697.f63634 = 0L;
                return list;
            } catch (IOException unused) {
                ArrayList arrayList = new ArrayList();
                if (c19697 != null) {
                    c19697.f63634 = 0L;
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public final List mo27931() {
        if (this.f33833 && m27910()) {
            return new C15587(this.f33834).mo27931();
        }
        C19697 c19697 = null;
        try {
            try {
                c19697 = mo27937();
                List m45384 = c19697.m45384(this.f33834.getPath());
                c19697.f63634 = 0L;
                return m45384;
            } catch (IOException unused) {
                ArrayList arrayList = new ArrayList();
                if (c19697 != null) {
                    c19697.f63634 = 0L;
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (c19697 != null) {
                c19697.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final InputStream mo27926() {
        C19697 c19697;
        try {
            return new C14944(this.f33834.getPath());
        } catch (FileNotFoundException unused) {
            try {
                c19697 = mo27937();
            } catch (Throwable th) {
                th = th;
                c19697 = null;
            }
            try {
                InputStream m45390 = c19697.m45390(this.f33834.getPath());
                c19697.f63634 = 0L;
                return m45390;
            } catch (Throwable th2) {
                th = th2;
                if (c19697 != null) {
                    c19697.f63634 = 0L;
                }
                throw th;
            }
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ܽ */
    public final OutputStream mo23555(boolean z) {
        C19697 c19697;
        try {
            return new FileOutputStream(this.f33834, z);
        } catch (FileNotFoundException e) {
            if (this.f33833 && e.getCause() == null) {
                throw e;
            }
            try {
                c19697 = mo27937();
                try {
                    OutputStream m45380 = c19697.m45380(this.f33834.getPath(), z);
                    c19697.f63634 = 0L;
                    return m45380;
                } catch (Throwable th) {
                    th = th;
                    if (c19697 != null) {
                        c19697.f63634 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c19697 = null;
            }
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final FileChannel mo27922() {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        try {
            convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(this.f33834, "r").getChannel());
            return convertMaybeLegacyFileChannelFromLibrary;
        } catch (IOException e) {
            if (this.f33833 && e.getCause() == null) {
                throw e;
            }
            throw new IOException("Unsupported");
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ᩷ */
    public final InterfaceC2245 mo23557(String str) {
        C19697 c19697;
        try {
            return C0127.m1199(this.f33834, str);
        } catch (FileNotFoundException e) {
            if (this.f33833 && e.getCause() == null) {
                throw e;
            }
            try {
                c19697 = mo27937();
                try {
                    InterfaceC2245 m45388 = c19697.m45388(this.f33834.getPath(), str);
                    c19697.f63634 = 0L;
                    return m45388;
                } catch (Throwable th) {
                    th = th;
                    if (c19697 != null) {
                        c19697.f63634 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c19697 = null;
            }
        }
    }

    @Override // l.AbstractC15440
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ParcelFileDescriptor mo27921(String str) {
        C19697 c19697;
        try {
            return ParcelFileDescriptor.open(this.f33834, C14798.m35185(str));
        } catch (FileNotFoundException e) {
            if (this.f33833 && e.getCause() == null) {
                throw e;
            }
            try {
                c19697 = mo27937();
                try {
                    String path = this.f33834.getPath();
                    c19697.getClass();
                    if (C22518.m50485(str)) {
                        path = C22518.m50489(path);
                    }
                    ParcelFileDescriptor m45372 = c19697.m45372(path, str);
                    c19697.f63634 = 0L;
                    return m45372;
                } catch (Throwable th) {
                    th = th;
                    if (c19697 != null) {
                        c19697.f63634 = 0L;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c19697 = null;
            }
        }
    }

    @Override // l.InterfaceC21855
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 mo27913() {
        return new C14092(this.f33834, this.f33833, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 mo27914(C17642 c17642) {
        File file = new File(this.f33834.getPath(), c17642.m41286());
        if (this.f33833) {
            return new C14092(file, true, c17642);
        }
        AbstractC15440 m39864 = C16999.m39864(file);
        if (m39864.mo27917()) {
            return new C14092(file, m39864.mo27925().f33833, c17642);
        }
        return m39864 instanceof InterfaceC21855 ? ((InterfaceC21855) m39864).mo27913() : m39864;
    }

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public C19697 mo27937() {
        return C3468.m10607(this.f33832 && C22518.m50492().mo2658());
    }

    /* renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    private boolean m27910() {
        if (this.f33832 && C22518.m50492().mo2658()) {
            return C20444.m46844();
        }
        return C3468.m10612();
    }

    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m27916() {
        return this.f33833;
    }

    /* renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m27923() {
        return this.f33832;
    }
}
