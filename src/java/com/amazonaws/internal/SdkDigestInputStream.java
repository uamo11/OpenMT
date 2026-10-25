package com.amazonaws.internal;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.OutputStream;
import java.security.DigestInputStream;
import l.C0794;
import l.InterfaceC14905;

/* loaded from: classes.dex */
public class SdkDigestInputStream extends DigestInputStream implements MetricAware, InterfaceC14905 {
    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    /* renamed from: ֫ */
    public final boolean mo279() {
        if (((DigestInputStream) this).in instanceof MetricAware) {
            return ((MetricAware) ((DigestInputStream) this).in).mo279();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return j;
        }
        int min = (int) Math.min(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX, j);
        byte[] bArr = new byte[min];
        long j2 = j;
        while (j2 > 0) {
            int read = read(bArr, 0, (int) Math.min(j2, min));
            if (read == -1) {
                if (j2 == j) {
                    return -1L;
                }
                return j - j2;
            }
            j2 -= read;
        }
        return j;
    }
}
