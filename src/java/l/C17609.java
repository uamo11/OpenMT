package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Z754 */
/* renamed from: l.ܿ᩸֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17609 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC18315 f53800;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC18315 f53803;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f53799 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f53798 = new SparseArray();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f53802 = new SparseBooleanArray();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f53801 = new SparseBooleanArray();

    public C17609(C20744 c20744, File file) {
        C11260 c11260 = new C11260(c20744);
        C16903 c16903 = new C16903(new File(file, "cached_content_index.exi"));
        this.f53800 = c11260;
        this.f53803 = c16903;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41162(long j) {
        InterfaceC18315 interfaceC18315;
        InterfaceC18315 interfaceC183152 = this.f53800;
        interfaceC183152.mo27867(j);
        InterfaceC18315 interfaceC183153 = this.f53803;
        if (interfaceC183153 != null) {
            interfaceC183153.mo27867(j);
        }
        boolean mo27872 = interfaceC183152.mo27872();
        SparseArray sparseArray = this.f53798;
        HashMap hashMap = this.f53799;
        if (!mo27872 && (interfaceC18315 = this.f53803) != null && interfaceC18315.mo27872()) {
            this.f53803.mo27869(hashMap, sparseArray);
            interfaceC183152.mo27873(hashMap);
        } else {
            interfaceC183152.mo27869(hashMap, sparseArray);
        }
        InterfaceC18315 interfaceC183154 = this.f53803;
        if (interfaceC183154 != null) {
            interfaceC183154.delete();
            this.f53803 = null;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41166() {
        this.f53800.mo27868(this.f53799);
        SparseBooleanArray sparseBooleanArray = this.f53802;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.f53798.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.f53801.clear();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2087 m41164(String str) {
        HashMap hashMap = this.f53799;
        C2087 c2087 = (C2087) hashMap.get(str);
        if (c2087 != null) {
            return c2087;
        }
        SparseArray sparseArray = this.f53798;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        C2087 c20872 = new C2087(keyAt, str, C7026.f21670);
        hashMap.put(str, c20872);
        sparseArray.put(keyAt, str);
        this.f53801.put(keyAt, true);
        this.f53800.mo27870(c20872);
        return c20872;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2087 m41161(String str) {
        return (C2087) this.f53799.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection m41160() {
        return C20195.unmodifiableCollection(this.f53799.values());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41159(int i) {
        return (String) this.f53798.get(i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41167(String str) {
        HashMap hashMap = this.f53799;
        C2087 c2087 = (C2087) hashMap.get(str);
        if (c2087 != null && c2087.m6866() && c2087.m6868()) {
            hashMap.remove(str);
            int i = c2087.f6960;
            SparseBooleanArray sparseBooleanArray = this.f53801;
            boolean z = sparseBooleanArray.get(i);
            this.f53800.mo27871(c2087, z);
            SparseArray sparseArray = this.f53798;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.f53802.put(i, true);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41165() {
        AbstractC20151 it = AbstractC6079.copyOf((Collection) this.f53799.keySet()).iterator();
        while (it.hasNext()) {
            m41167((String) it.next());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41163(String str, C23959 c23959) {
        C2087 m41164 = m41164(str);
        if (m41164.m6863(c23959)) {
            this.f53800.mo27870(m41164);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7026 m41157(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new IOException(C19370.m44628(readInt2, "Invalid value size: "));
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = C3603.f11423;
            int i2 = 0;
            while (i2 != readInt2) {
                int i3 = i2 + min;
                bArr = Arrays.copyOf(bArr, i3);
                dataInputStream.readFully(bArr, i2, min);
                min = Math.min(readInt2 - i3, 10485760);
                i2 = i3;
            }
            hashMap.put(readUTF, bArr);
        }
        return new C7026(hashMap);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41158(C7026 c7026, DataOutputStream dataOutputStream) {
        Set<Map.Entry> m18994 = c7026.m18994();
        dataOutputStream.writeInt(m18994.size());
        for (Map.Entry entry : m18994) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }
}
