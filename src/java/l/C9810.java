package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* compiled from: 63ZD */
/* renamed from: l.ۢ᩶ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9810 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24843(Object obj) {
        Class<?> cls = obj.getClass();
        String replace = cls.getName().replace('.', '/');
        if (replace.startsWith("org/objectweb/asm/") && (replace.contains("Test$") || Pattern.matches("org/objectweb/asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", replace) || Pattern.matches("org/objectweb/asm/util/Check(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Adapter(\\$.*)?", replace))) {
            return;
        }
        InputStream resourceAsStream = cls.getClassLoader().getResourceAsStream(replace.concat(".class"));
        if (resourceAsStream == null) {
            throw new IllegalStateException("Bytecode not available, can't check class version");
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
            try {
                dataInputStream.readInt();
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (readUnsignedShort != 65535) {
                    throw new IllegalStateException("ASM10_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                }
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e) {
            throw new IllegalStateException("I/O error, can't check class version", e);
        }
    }
}
