package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;

/* compiled from: Y7JO */
/* renamed from: l.ܿۡ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17234 extends C16528 {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String[] f52851;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f52852;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC14406[] f52853;

    @Override // l.C15817, l.InterfaceC17935
    public final /* bridge */ /* synthetic */ EnumC16523 postVisitDirectory(Object obj, IOException iOException) {
        mo38907((InterfaceC20758) obj, iOException);
        return EnumC16523.CONTINUE;
    }

    @Override // l.C15817, l.InterfaceC17935
    public final EnumC16523 visitFile(Object obj, InterfaceC15111 interfaceC15111) {
        InterfaceC20758 interfaceC20758 = (InterfaceC20758) obj;
        InterfaceC17940[] interfaceC17940Arr = C14411.f44172;
        InterfaceC20758 fileName = interfaceC20758 != null ? interfaceC20758.getFileName() : null;
        if (Arrays.binarySearch(this.f52851, fileName != null ? fileName.toString() : null) < 0) {
            EnumC14406[] enumC14406Arr = this.f52853;
            if (C17229.exists(interfaceC20758, enumC14406Arr)) {
                if (this.f52852) {
                    C14411.m34438(interfaceC20758, enumC14406Arr);
                }
                C17229.deleteIfExists(interfaceC20758);
            }
            if (C17229.isSymbolicLink(interfaceC20758)) {
                try {
                    C17229.delete(interfaceC20758);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        m38906(interfaceC15111);
        EnumC16523 enumC16523 = EnumC16523.CONTINUE;
        return EnumC16523.CONTINUE;
    }

    @Override // l.C16528
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || C17234.class != obj.getClass()) {
            return false;
        }
        C17234 c17234 = (C17234) obj;
        return this.f52852 == c17234.f52852 && Arrays.equals(this.f52851, c17234.f52851);
    }

    @Override // l.C16528
    public final int hashCode() {
        return C11003.hash(Boolean.valueOf(this.f52852)) + (((super.hashCode() * 31) + Arrays.hashCode(this.f52851)) * 31);
    }

    @Override // l.C16528
    /* renamed from: ֫ */
    public final void mo38907(InterfaceC20758 interfaceC20758, IOException iOException) {
        InterfaceC17940[] interfaceC17940Arr = C14411.f44172;
        DirectoryStream newDirectoryStream = C17229.newDirectoryStream(interfaceC20758);
        try {
            boolean hasNext = newDirectoryStream.iterator().hasNext();
            newDirectoryStream.close();
            if (!hasNext) {
                C17229.deleteIfExists(interfaceC20758);
            }
            super.mo38907(interfaceC20758, iOException);
            EnumC16523 enumC16523 = EnumC16523.CONTINUE;
        } catch (Throwable th) {
            if (newDirectoryStream != null) {
                try {
                    newDirectoryStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.C15817, l.InterfaceC17935
    /* renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final EnumC16523 preVisitDirectory(InterfaceC20758 interfaceC20758, InterfaceC15111 interfaceC15111) {
        super.preVisitDirectory(interfaceC20758, interfaceC15111);
        InterfaceC17940[] interfaceC17940Arr = C14411.f44172;
        InterfaceC20758 fileName = interfaceC20758 != null ? interfaceC20758.getFileName() : null;
        return Arrays.binarySearch(this.f52851, fileName != null ? fileName.toString() : null) < 0 ? EnumC16523.CONTINUE : EnumC16523.SKIP_SUBTREE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17234(l.InterfaceC13726 r2, l.EnumC14406[] r3, l.InterfaceC17940[] r4, java.lang.String... r5) {
        /*
            r1 = this;
            l.ۧۡ֡ r0 = new l.ۧۡ֡
            r0.<init>()
            r0.m5743(r2)
            r1.<init>(r0)
            java.lang.Object r2 = r5.clone()
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.Arrays.sort(r2)
            r1.f52851 = r2
            boolean r2 = l.EnumC9474.m24315(r4)
            r1.f52852 = r2
            if (r3 != 0) goto L27
            l.ܳ۠ᩴ[] r2 = l.C14411.f44176
            java.lang.Object r2 = r2.clone()
            l.ܳ۠ᩴ[] r2 = (l.EnumC14406[]) r2
            goto L2d
        L27:
            java.lang.Object r2 = r3.clone()
            l.ܳ۠ᩴ[] r2 = (l.EnumC14406[]) r2
        L2d:
            r1.f52853 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17234.<init>(l.ܰۢ֡, l.ܳ۠ᩴ[], l.ᩳۡ֡[], java.lang.String[]):void");
    }
}
