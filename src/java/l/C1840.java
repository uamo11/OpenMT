package l;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: EBHF */
/* renamed from: l.֫۬ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1840 implements InterfaceC23712 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f6295;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6296 = false;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public MessageDigest f6297 = null;

    @Override // l.InterfaceC23712
    public String getName() {
        return "bytes/bytes";
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo6123() {
    }

    public C1840(byte[] bArr) {
        this.f6295 = bArr;
    }

    public C1840() {
    }

    @Override // l.InterfaceC23712
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23712 mo6121(boolean z) {
        this.f6296 = z;
        return this;
    }

    @Override // l.InterfaceC23712
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MessageDigest mo6122() {
        return this.f6297;
    }

    @Override // l.InterfaceC23712
    public final int getSize() {
        return this.f6295.length;
    }

    public final String toString() {
        return getName();
    }

    @Override // l.InterfaceC23712
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DataInputStream mo6119(C16646 c16646) {
        mo6123();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f6295);
            if (this.f6296) {
                this.f6297 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                return new DataInputStream(new DigestInputStream(byteArrayInputStream, this.f6297));
            }
            return new DataInputStream(byteArrayInputStream);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC23712
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection mo6120() {
        mo6123();
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(this.f6295), "utf-8"));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    arrayList.add(readLine);
                } else {
                    bufferedReader.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
