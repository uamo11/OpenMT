package l;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.sdk.m.y.o;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: 49SV */
/* renamed from: l.۬ܶܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13198 extends C8966 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3321 f39466;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r1.close();
     */
    /* renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean m32024() {
        /*
            r9 = this;
            r0 = r9
            monitor-enter(r0)
            l.ۗܶܿ r1 = r9.f39466     // Catch: java.lang.Throwable -> L52
            r2 = 1
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return r2
        L9:
            android.net.Uri r1 = r9.mo31567()     // Catch: java.lang.Throwable -> L52
            android.net.Uri r4 = l.C14609.m34869(r1)     // Catch: java.lang.Throwable -> L52
            android.content.ContentResolver r3 = l.C4925.m14336()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "mt_extras"
            java.lang.String[] r5 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L52
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L52
            r3 = 0
            if (r1 == 0) goto L4b
            boolean r4 = r1.moveToNext()     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L4b
            boolean r4 = r1.isNull(r3)     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L32
            goto L4b
        L32:
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L41
            l.ۗܶܿ r3 = m32029(r3)     // Catch: java.lang.Throwable -> L41
            r9.f39466 = r3     // Catch: java.lang.Throwable -> L41
            r1.close()     // Catch: java.lang.Throwable -> L52
            monitor-exit(r0)
            return r2
        L41:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L46
            goto L4a
        L46:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L52
        L4a:
            throw r2     // Catch: java.lang.Throwable -> L52
        L4b:
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.lang.Throwable -> L52
        L50:
            monitor-exit(r0)
            return r3
        L52:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13198.m32024():boolean");
    }

    @Override // l.AbstractC15440
    /* renamed from: ֨ۧ */
    public final boolean mo27912() {
        return true;
    }

    @Override // l.C8966, l.AbstractC9155
    /* renamed from: ֫ */
    public final void mo23115(File file, Uri uri, boolean z) {
    }

    @Override // l.C8966, l.AbstractC9155
    /* renamed from: ۟ۧ */
    public final boolean mo23118() {
        return true;
    }

    @Override // l.AbstractC15440
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13198 mo32036() {
        return this;
    }

    @Override // l.C8966, l.AbstractC9155, l.C14798, l.AbstractC15440
    /* renamed from: ۤ */
    public final boolean mo23120() {
        if (this.f39466 != null) {
            return true;
        }
        return super.mo23120();
    }

    @Override // l.C8966, l.AbstractC9155, l.C14798
    /* renamed from: ᩶ۧ */
    public final void mo23125() {
        super.mo23125();
        this.f39466 = null;
    }

    @Override // l.C8966, l.AbstractC9155
    /* renamed from: ֫ */
    public final C8966 mo18536(File file, Uri uri) {
        return new C13198(file, uri, m23116());
    }

    @Override // l.C8966, l.AbstractC9155
    /* renamed from: ֫ */
    public final AbstractC9155 mo18536(File file, Uri uri) {
        return new C13198(file, uri, m23116());
    }

    @Override // l.AbstractC9155
    /* renamed from: ۤۧ */
    public final String[] mo23548() {
        return new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified", "mt_extras", "mt_path"};
    }

    @Override // l.AbstractC9155
    /* renamed from: ֫ */
    public final AbstractC15440 mo23543(File file, Uri uri, Cursor cursor) {
        C13198 mo32036 = super.mo23543(file, uri, cursor).mo32036();
        if (!cursor.isNull(5)) {
            mo32036.f39466 = m32029(cursor.getString(5));
        }
        return mo32036;
    }

    @Override // l.AbstractC9155
    /* renamed from: ۬ۧ */
    public final String[] mo23553() {
        return new String[]{"mime_type", "_size", "last_modified", "mt_path", "mt_extras"};
    }

    @Override // l.AbstractC9155
    /* renamed from: ֫ */
    public final C12619 mo23541(Cursor cursor) {
        return m32021(cursor, 0, 1, 2, 4);
    }

    @Override // l.AbstractC9155
    /* renamed from: ۧ */
    public final C12619 mo23550(Cursor cursor) {
        return m32021(cursor, 2, 3, 4, 5);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12619 m32021(Cursor cursor, int i, int i2, int i3, int i4) {
        EnumC3447 enumC3447;
        long j = cursor.isNull(i2) ? -1L : cursor.getLong(i2);
        long j2 = cursor.isNull(i3) ? -1L : cursor.getLong(i3);
        if (m32034()) {
            return new C12619(this, EnumC3447.DIRECTORY, -1L, j2, null);
        }
        boolean isNull = cursor.isNull(i4);
        File file = this.f27709;
        if (!isNull) {
            try {
                C3321 m32029 = m32029(cursor.getString(i4));
                char m10168 = m32029.m10168();
                if (m10168 == '-') {
                    enumC3447 = EnumC3447.REGULAR;
                } else if (m10168 == 'd') {
                    enumC3447 = EnumC3447.DIRECTORY;
                } else if (m10168 == 'l') {
                    enumC3447 = EnumC3447.LINK;
                } else {
                    enumC3447 = EnumC3447.OTHER;
                }
                EnumC3447 enumC34472 = enumC3447;
                EnumC3447 enumC34473 = EnumC3447.LINK;
                if (enumC34472 == enumC34473 && m32029.m10170() == null) {
                    throw new IOException("Missing MT provider link target: " + file.getPath());
                }
                return new C12619(this, enumC34472, enumC34472 == EnumC3447.DIRECTORY ? -1L : j, j2, enumC34472 == enumC34473 ? m32029.m10170() : null);
            } catch (RuntimeException e) {
                throw new IOException("Invalid MT provider metadata: " + file.getPath(), e);
            }
        }
        if (this.f27235) {
            return m23542(cursor, i, i2, i3);
        }
        throw new IOException("Missing MT provider metadata: " + file.getPath());
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C3321 m32029(String str) {
        String[] split = str.split("\\|", 4);
        return new C3321(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), split.length == 4 ? split[3] : null);
    }

    /* renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public final boolean m32034() {
        C4027 m23116 = m23116();
        File file = this.f27709;
        String path = file.getParentFile().getPath();
        if (path.length() != 18 ? false : path.equalsIgnoreCase(m23116.m12120())) {
            String name = file.getName();
            name.getClass();
            switch (name) {
                case "user_de_data":
                case "android_data":
                case "data":
                case "android_obb":
                    return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC15440
    /* renamed from: ֫ */
    public final boolean mo18537(long j) {
        Uri mo31567 = mo31567();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", mo31567);
        bundle.putLong("time", j);
        Bundle call = C4925.m14336().call(mo31567, "mt:setLastModified", (String) null, bundle);
        if (call == null) {
            return false;
        }
        if (call.getBoolean(o.c)) {
            C9861 c9861 = this.f27710;
            if (c9861 == null) {
                return true;
            }
            c9861.f29834 = j;
            return true;
        }
        String string = call.getString("message");
        if (string == null) {
            return false;
        }
        System.err.println(string);
        return false;
    }

    @Override // l.AbstractC15440
    /* renamed from: ֫ */
    public final AbstractC21087 mo27915(InterfaceC6975 interfaceC6975) {
        return new C4732(this, this, interfaceC6975);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32030(int i) {
        int i2;
        Uri mo31567 = mo31567();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", mo31567);
        bundle.putInt("permissions", i);
        Bundle call = C4925.m14336().call(mo31567, "mt:setPermissions", (String) null, bundle);
        if (call == null) {
            return false;
        }
        if (call.getBoolean(o.c)) {
            C3321 c3321 = this.f39466;
            if (c3321 == null) {
                return true;
            }
            i2 = c3321.f10405;
            c3321.f10405 = i | (i2 & (-4096));
            return true;
        }
        String string = call.getString("message");
        if (string == null) {
            return false;
        }
        System.err.println(string);
        return false;
    }

    /* renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public final String m32037() {
        if (C10975.m27285()) {
            return (String) C14798.m35183(new Callable() { // from class: l.᩹ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String m32027;
                    m32027 = C13198.this.m32027();
                    return m32027;
                }
            }, this.f27709.getPath(), 500);
        }
        return m32027();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public String m32027() {
        Cursor query = C4925.m14336().query(C14609.m34869(mo31567()), new String[]{"mt_path"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToNext() && !query.isNull(0)) {
                    String string = query.getString(0);
                    query.close();
                    return string;
                }
            } catch (Throwable th) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
        return this.f27709.getPath();
    }

    @Override // l.AbstractC15440
    /* renamed from: ܿ֫ */
    public final String mo27935() {
        String str;
        if (m32034()) {
            return m32037();
        }
        m32033();
        C3321 c3321 = this.f39466;
        if (c3321 == null) {
            return null;
        }
        str = c3321.f10407;
        return str;
    }

    @Override // l.AbstractC15440
    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 mo32032() {
        return C16999.m39866(m32037(), new String[0]).m36514();
    }

    @Override // l.AbstractC15440
    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final String mo32031() {
        return m36533() ? m36519() : m32037();
    }

    @Override // l.AbstractC15440
    /* renamed from: ܽ */
    public final void mo27934(final String str) {
        if (C10975.m27285()) {
            C14798.m35182(new Callable() { // from class: l.᩶ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C13198.this.m32025(str);
                    return null;
                }
            });
        } else {
            m32025(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m32025(String str) {
        Uri mo31567 = mo31567();
        Bundle bundle = new Bundle();
        bundle.putParcelable("uri", mo31567);
        bundle.putString(MotionUtils.EASING_TYPE_PATH, str);
        Bundle call = C4925.m14336().call(mo31567, "mt:createSymlink", (String) null, bundle);
        if (call != null) {
            if (call.getBoolean(o.c)) {
                return;
            }
            String string = call.getString("message");
            if (string != null) {
                throw new IOException(string);
            }
        }
        throw new IOException("Unable to create link '" + this.f27709.getPath() + "' to '" + str + "'");
    }

    /* renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public final boolean m32033() {
        if (this.f39466 != null) {
            return true;
        }
        if (C10975.m27285()) {
            return ((Boolean) C14798.m35183(new Callable() { // from class: l.᩸ܶܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean m32024;
                    m32024 = C13198.this.m32024();
                    return Boolean.valueOf(m32024);
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return m32024();
    }

    /* renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public final C3321 m32035() {
        C3321 c3321 = this.f39466;
        C11003.requireNonNull(c3321);
        return c3321;
    }
}
