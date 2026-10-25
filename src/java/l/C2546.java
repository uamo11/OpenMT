package l;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.function.Supplier;

/* compiled from: S7CW */
/* renamed from: l.ۖ۬ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2546 extends AbstractC3957 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String f8068 = C1707.getDefault().getSeparator();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public FileOutputStream f8069;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC15950 f8070;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public File f8071;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public File f8072;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PrintWriter f8073;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8062(File file, String str) {
        if (this.f8072 == null) {
            this.f8072 = file;
        }
        this.f8070 = EnumC15950.FILE;
        this.f12583 = str;
    }

    @Override // l.AbstractC3957, l.InterfaceC1134
    /* renamed from: ֫ */
    public final void mo1969(String str, C16646 c16646, AbstractC19898 abstractC19898) {
        String str2;
        String sb;
        this.f12584 = str;
        int lastIndexOf = str.lastIndexOf(f8068);
        if (lastIndexOf != -1) {
            str2 = abstractC19898.m45779() ? "" : str.substring(0, lastIndexOf);
            str = str.substring(lastIndexOf + 1);
        } else {
            str2 = "";
        }
        String str3 = this.f12583;
        if (str3 != null) {
            StringBuilder m15339 = C5368.m15339(str3);
            m15339.append((String) c16646.orElse(""));
            sb = m15339.toString();
        } else {
            StringBuilder m153392 = C5368.m15339(str);
            m153392.append((String) c16646.orElse(""));
            sb = m153392.toString();
        }
        File file = this.f8072;
        if (file == null) {
            abstractC19898.m45778(C19462.m44858("writing to ", str2, " ", sb), new Object[0]);
            this.f8071 = new File(str2, sb);
        } else {
            this.f8071 = C8763.get(file.getPath(), str2, sb).toFile();
            abstractC19898.m45762(new Supplier() { // from class: l.ۡ۬ۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C2546.m8060(C2546.this);
                }
            });
            File file2 = new File(this.f8071.getParent());
            if (!file2.exists() && !file2.mkdirs()) {
                abstractC19898.mo11946("Cannot create {0}", file2.getPath());
                return;
            }
        }
        this.f8069 = new FileOutputStream(this.f8071);
        this.f8073 = new PrintWriter(new OutputStreamWriter(this.f8069));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8061(File file) {
        this.f8072 = file;
        if (this.f8070 == null) {
            this.f8070 = EnumC15950.DIR;
        }
    }

    public final String toString() {
        String obj = super.toString();
        File file = this.f8072;
        if (file != null && this.f8071 != null) {
            String concat = obj.concat(file != null ? file.toString() : "").concat(f8068);
            File file2 = this.f8071;
            concat.concat(file2 != null ? file2.toString() : "");
        }
        return obj;
    }

    @Override // l.InterfaceC1134
    /* renamed from: ܽ */
    public final void mo1973(String str) {
        this.f8073.println(str);
    }

    @Override // l.InterfaceC1134
    /* renamed from: ֫ */
    public final void mo1968(String str) {
        this.f8073.print(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8060(C2546 c2546) {
        return C20087.m46306("writing -d ", c2546.f8072.getPath(), " = \"", c2546.f8071.getAbsolutePath(), "\"");
    }

    @Override // l.AbstractC3957, l.InterfaceC1134
    /* renamed from: ۧ */
    public final void mo1971(String str) {
        super.mo1971(str);
        flush();
        try {
            PrintWriter printWriter = this.f8073;
            if (printWriter != null) {
                printWriter.close();
            }
        } finally {
            FileOutputStream fileOutputStream = this.f8069;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }

    @Override // l.InterfaceC1134
    public final void flush() {
        FileOutputStream fileOutputStream = this.f8069;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // l.InterfaceC1134
    /* renamed from: ֫ */
    public final DataOutputStream mo1967() {
        return new DataOutputStream(new BufferedOutputStream(this.f8069));
    }

    @Override // l.AbstractC3957
    /* renamed from: ۧ */
    public final String mo1970() {
        File file = this.f8071;
        return file != null ? file.toString() : "file stream";
    }
}
