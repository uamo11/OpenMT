package l;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Z754 */
/* renamed from: l.ܽ᩸֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16903 implements InterfaceC18315 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7110 f51953;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9849 f51954;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f51955;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Cipher f51957 = null;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SecretKeySpec f51956 = null;

    @Override // l.InterfaceC18315
    /* renamed from: ֫ */
    public final void mo27867(long j) {
    }

    public C16903(File file) {
        this.f51953 = new C7110(file);
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫ */
    public final boolean mo27872() {
        return this.f51953.m19126();
    }

    @Override // l.InterfaceC18315
    public final void delete() {
        this.f51953.m19124();
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫ */
    public final void mo27869(HashMap hashMap, SparseArray sparseArray) {
        C22632.m50634(!this.f51955);
        C7110 c7110 = this.f51953;
        if (c7110.m19126()) {
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(c7110.m19127());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int readInt = dataInputStream2.readInt();
                    if (readInt >= 0 && readInt <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            Cipher cipher = this.f51957;
                            if (cipher != null) {
                                byte[] bArr = new byte[16];
                                dataInputStream2.readFully(bArr);
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                try {
                                    SecretKeySpec secretKeySpec = this.f51956;
                                    String str = C3603.f11424;
                                    cipher.init(2, secretKeySpec, ivParameterSpec);
                                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                } catch (InvalidAlgorithmParameterException e) {
                                    e = e;
                                    throw new IllegalStateException(e);
                                } catch (InvalidKeyException e2) {
                                    e = e2;
                                    throw new IllegalStateException(e);
                                }
                            }
                        }
                        int readInt2 = dataInputStream2.readInt();
                        int i = 0;
                        for (int i2 = 0; i2 < readInt2; i2++) {
                            C2087 m39763 = m39763(readInt, dataInputStream2);
                            String str2 = m39763.f6961;
                            hashMap.put(str2, m39763);
                            sparseArray.put(m39763.f6960, str2);
                            i += m39762(m39763, readInt);
                        }
                        int readInt3 = dataInputStream2.readInt();
                        boolean z = dataInputStream2.read() == -1;
                        if (readInt3 == i && z) {
                            C3603.m11024(dataInputStream2);
                            return;
                        }
                    }
                    C3603.m11024(dataInputStream2);
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C3603.m11024(dataInputStream);
                    }
                    hashMap.clear();
                    sparseArray.clear();
                    c7110.m19124();
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C3603.m11024(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
            hashMap.clear();
            sparseArray.clear();
            c7110.m19124();
        }
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫ */
    public final void mo27868(HashMap hashMap) {
        if (this.f51955) {
            mo27873(hashMap);
        }
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫ */
    public final void mo27870(C2087 c2087) {
        this.f51955 = true;
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫ */
    public final void mo27871(C2087 c2087, boolean z) {
        this.f51955 = true;
    }

    @Override // l.InterfaceC18315
    /* renamed from: ۧ */
    public final void mo27873(HashMap hashMap) {
        C7110 c7110 = this.f51953;
        DataOutputStream dataOutputStream = null;
        try {
            OutputStream m19128 = c7110.m19128();
            C9849 c9849 = this.f51954;
            if (c9849 == null) {
                this.f51954 = new C9849(m19128);
            } else {
                c9849.m24920(m19128);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream(this.f51954);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(hashMap.size());
                int i = 0;
                for (C2087 c2087 : hashMap.values()) {
                    dataOutputStream2.writeInt(c2087.f6960);
                    dataOutputStream2.writeUTF(c2087.f6961);
                    C17609.m41158(c2087.m6859(), dataOutputStream2);
                    i += m39762(c2087, 2);
                }
                dataOutputStream2.writeInt(i);
                c7110.m19125(dataOutputStream2);
                String str = C3603.f11424;
                this.f51955 = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                C3603.m11024(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m39762(C2087 c2087, int i) {
        int hashCode = c2087.f6961.hashCode() + (c2087.f6960 * 31);
        if (i < 2) {
            long m32306 = C13325.m32306(c2087.m6859());
            return (hashCode * 31) + ((int) (m32306 ^ (m32306 >>> 32)));
        }
        return c2087.m6859().hashCode() + (hashCode * 31);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2087 m39763(int i, DataInputStream dataInputStream) {
        C7026 m41157;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            C23959 c23959 = new C23959();
            C23959.m52785(c23959, readLong);
            m41157 = C7026.f21670.m18995(c23959);
        } else {
            m41157 = C17609.m41157(dataInputStream);
        }
        return new C2087(readInt, readUTF, m41157);
    }
}
