package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: N673 */
/* renamed from: l.ۢ֨ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9262 extends AbstractC13389 {
    public final String e;
    public final String f = "/";
    public volatile C14199 g;

    @Override // l.AbstractC13389
    public final String getScheme() {
        return "file";
    }

    public C9262(String str) {
        this.e = str;
    }

    @Override // l.AbstractC13389
    public final AbstractC7145 newFileSystem(URI uri, Map map) {
        i(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // l.AbstractC13389
    public final AbstractC7145 getFileSystem(URI uri) {
        C14199 c14199;
        i(uri);
        C14199 c141992 = this.g;
        if (c141992 != null) {
            return c141992;
        }
        synchronized (this) {
            c14199 = this.g;
            if (c14199 == null) {
                c14199 = new C14199(this, this.e, this.f);
                this.g = c14199;
            }
        }
        return c14199;
    }

    @Override // l.AbstractC13389
    public final InterfaceC20758 getPath(URI uri) {
        byte b;
        C14199 c14199 = this.g;
        String str = this.e;
        String str2 = this.f;
        char[] cArr = AbstractC2206.c;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("URI has an authority component");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("URI has a fragment component");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("URI has a query component");
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            throw new IllegalArgumentException("URI path component is empty");
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArr = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char charAt = rawPath.charAt(i);
            if (charAt == '%') {
                int i4 = i + 2;
                i += 3;
                b = (byte) ((AbstractC2206.a(rawPath.charAt(i3)) << 4) | AbstractC2206.a(rawPath.charAt(i4)));
                if (b == 0) {
                    throw new IllegalArgumentException("Nul character not allowed");
                }
            } else {
                if (charAt == 0 || charAt >= 128) {
                    throw new IllegalArgumentException("Bad escape");
                }
                b = (byte) charAt;
                i = i3;
            }
            bArr[i2] = b;
            i2++;
        }
        if (i2 != length) {
            bArr = Arrays.copyOf(bArr, i2);
        }
        return new C15610(c14199, new String(bArr, AbstractC3617.a), str, str2);
    }

    @Override // l.AbstractC13389
    public final DirectoryStream newDirectoryStream(InterfaceC20758 interfaceC20758, DirectoryStream.Filter filter) {
        filter.getClass();
        C6439 c6439 = new C6439();
        c6439.a = new C20551(this, interfaceC20758, filter);
        return c6439;
    }

    @Override // l.AbstractC13389
    public final void createDirectory(InterfaceC20758 interfaceC20758, InterfaceC22168... interfaceC22168Arr) {
        if (interfaceC20758.getParent() != null && !C17229.exists(interfaceC20758.getParent(), new EnumC14406[0])) {
            throw new NoSuchFileException(interfaceC20758.toString());
        }
        if (!interfaceC20758.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(interfaceC20758.toString());
        }
    }

    @Override // l.AbstractC13389
    public final void delete(InterfaceC20758 interfaceC20758) {
        try {
            checkAccess(interfaceC20758, new EnumC11379[0]);
            c(interfaceC20758);
        } catch (IOException unused) {
            throw new NoSuchFileException(interfaceC20758.toString());
        }
    }

    @Override // l.AbstractC13389
    public final boolean c(InterfaceC20758 interfaceC20758) {
        return interfaceC20758.toFile().delete();
    }

    @Override // l.AbstractC13389
    public final SeekableByteChannel newByteChannel(InterfaceC20758 interfaceC20758, Set set, InterfaceC22168... interfaceC22168Arr) {
        return f(interfaceC20758, set, interfaceC22168Arr);
    }

    @Override // l.AbstractC13389
    public final FileChannel f(InterfaceC20758 interfaceC20758, Set set, InterfaceC22168... interfaceC22168Arr) {
        if (interfaceC20758.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: " + interfaceC20758);
        }
        return AbstractC22791.T(interfaceC20758, set);
    }

    @Override // l.AbstractC13389
    public final C9968 e(InterfaceC20758 interfaceC20758, Set set, ExecutorService executorService, InterfaceC22168... interfaceC22168Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final void a(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC207582) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final void b(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC207582, InterfaceC22168... interfaceC22168Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13389
    public final InterfaceC20758 h(InterfaceC20758 interfaceC20758) {
        return new C15610(this.g, interfaceC20758.toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // l.AbstractC13389
    public final void copy(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC207582, InterfaceC22667... interfaceC22667Arr) {
        if (!j(interfaceC22667Arr, EnumC2413.REPLACE_EXISTING) && C17229.exists(interfaceC207582, new EnumC14406[0])) {
            throw new FileAlreadyExistsException(interfaceC207582.toString());
        }
        if (j(interfaceC22667Arr, EnumC2413.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(interfaceC20758.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(interfaceC207582.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 8192);
                    if (read >= 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC13389
    public final void move(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC207582, InterfaceC22667... interfaceC22667Arr) {
        if (!j(interfaceC22667Arr, EnumC2413.REPLACE_EXISTING) && C17229.exists(interfaceC207582, new EnumC14406[0])) {
            throw new FileAlreadyExistsException(interfaceC207582.toString());
        }
        if (j(interfaceC22667Arr, EnumC2413.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        interfaceC20758.toFile().renameTo(interfaceC207582.toFile());
    }

    public static boolean j(InterfaceC22667[] interfaceC22667Arr, EnumC2413 enumC2413) {
        for (InterfaceC22667 interfaceC22667 : interfaceC22667Arr) {
            if (interfaceC22667 == enumC2413) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC13389
    public final boolean isSameFile(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC207582) {
        if (interfaceC20758.equals(interfaceC207582)) {
            return true;
        }
        checkAccess(interfaceC20758, new EnumC11379[0]);
        checkAccess(interfaceC207582, new EnumC11379[0]);
        return interfaceC20758.toFile().equals(interfaceC207582.toFile());
    }

    @Override // l.AbstractC13389
    public final boolean isHidden(InterfaceC20758 interfaceC20758) {
        return interfaceC20758.toFile().isHidden();
    }

    @Override // l.AbstractC13389
    public final AbstractC13494 getFileStore(InterfaceC20758 interfaceC20758) {
        throw new SecurityException("getFileStore");
    }

    @Override // l.AbstractC13389
    public final InterfaceC20052 getFileAttributeView(InterfaceC20758 interfaceC20758, Class cls, EnumC14406... enumC14406Arr) {
        cls.getClass();
        if (cls == InterfaceC16728.class) {
            return (InterfaceC20052) cls.cast(new C7269(interfaceC20758));
        }
        return null;
    }

    @Override // l.AbstractC13389
    public final void checkAccess(InterfaceC20758 interfaceC20758, EnumC11379... enumC11379Arr) {
        boolean canRead;
        File file = interfaceC20758.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(interfaceC20758.toString());
        }
        boolean z = true;
        for (EnumC11379 enumC11379 : enumC11379Arr) {
            int i = AbstractC23372.a[enumC11379.ordinal()];
            if (i == 1) {
                canRead = file.canRead();
            } else if (i == 2) {
                canRead = file.canWrite();
            } else if (i == 3) {
                canRead = file.canExecute();
            }
            z &= canRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", interfaceC20758));
        }
    }

    @Override // l.AbstractC13389
    public final InterfaceC15111 readAttributes(InterfaceC20758 interfaceC20758, Class cls, EnumC14406... enumC14406Arr) {
        if (cls != InterfaceC15111.class) {
            throw new UnsupportedOperationException();
        }
        return (InterfaceC15111) cls.cast(((InterfaceC16728) getFileAttributeView(interfaceC20758, InterfaceC16728.class, enumC14406Arr)).readAttributes());
    }

    @Override // l.AbstractC13389
    public final Map readAttributes(InterfaceC20758 interfaceC20758, String str, EnumC14406... enumC14406Arr) {
        String[] split;
        int indexOf = str.indexOf(":");
        if (indexOf == -1) {
            split = str.split(",");
        } else {
            String substring = str.substring(0, indexOf);
            if (!"basic".equals(substring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + substring + " is not available.");
            }
            split = str.substring(indexOf + 1).split(",");
        }
        C7269 c7269 = new C7269(interfaceC20758);
        Set set = C7269.b;
        C13618 c13618 = new C13618();
        c13618.a = new HashSet();
        c13618.b = new HashMap();
        for (String str2 : split) {
            if (str2.equals("*")) {
                c13618.c = true;
            } else {
                if (!((HashSet) set).contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                ((HashSet) c13618.a).add(str2);
            }
        }
        InterfaceC15111 readAttributes = c7269.readAttributes();
        if (c13618.b("size")) {
            c13618.a(Long.valueOf(((C1500) readAttributes).size()), "size");
        }
        if (c13618.b("creationTime")) {
            c13618.a(((C1500) readAttributes).creationTime(), "creationTime");
        }
        if (c13618.b("lastAccessTime")) {
            c13618.a(((C1500) readAttributes).lastAccessTime(), "lastAccessTime");
        }
        if (c13618.b("lastModifiedTime")) {
            c13618.a(((C1500) readAttributes).lastModifiedTime(), "lastModifiedTime");
        }
        if (c13618.b("fileKey")) {
            c13618.a(((C1500) readAttributes).fileKey(), "fileKey");
        }
        if (c13618.b("isDirectory")) {
            c13618.a(Boolean.valueOf(((C1500) readAttributes).isDirectory()), "isDirectory");
        }
        if (c13618.b("isRegularFile")) {
            c13618.a(Boolean.valueOf(((C1500) readAttributes).isRegularFile()), "isRegularFile");
        }
        if (c13618.b("isSymbolicLink")) {
            c13618.a(Boolean.valueOf(((C1500) readAttributes).isSymbolicLink()), "isSymbolicLink");
        }
        if (c13618.b("isOther")) {
            c13618.a(Boolean.valueOf(((C1500) readAttributes).isOther()), "isOther");
        }
        return Collections.unmodifiableMap(c13618.b);
    }

    @Override // l.AbstractC13389
    public final void setAttribute(InterfaceC20758 interfaceC20758, String str, Object obj, EnumC14406... enumC14406Arr) {
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            if (!"basic".equals(substring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + substring + " is not available.");
            }
            str = str.substring(indexOf + 1);
        }
        C7269 c7269 = new C7269(interfaceC20758);
        if (str.equals("lastModifiedTime")) {
            c7269.a((C4529) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            c7269.a(null, (C4529) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    public static void i(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals("/")) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }
}
