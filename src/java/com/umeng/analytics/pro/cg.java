package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: M5EM */
/* loaded from: classes.dex */
public class cg extends ci {
    public InputStream a;
    public OutputStream b;

    @Override // com.umeng.analytics.pro.ci
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.ci
    public void b() {
    }

    public cg() {
        this.a = null;
        this.b = null;
    }

    public cg(InputStream inputStream) {
        this.b = null;
        this.a = inputStream;
    }

    public cg(OutputStream outputStream) {
        this.a = null;
        this.b = outputStream;
    }

    public cg(InputStream inputStream, OutputStream outputStream) {
        this.a = inputStream;
        this.b = outputStream;
    }

    @Override // com.umeng.analytics.pro.ci
    public void c() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.a = null;
        }
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
            }
            this.b = null;
        }
    }

    @Override // com.umeng.analytics.pro.ci
    public int a(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.a;
        if (inputStream == null) {
            throw new cj(1, "Cannot read from null inputStream");
        }
        try {
            int read = inputStream.read(bArr, i, i2);
            if (read >= 0) {
                return read;
            }
            throw new cj(4);
        } catch (IOException e) {
            throw new cj(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.ci
    public void b(byte[] bArr, int i, int i2) {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new cj(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new cj(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.ci
    public void d() {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new cj(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e) {
            throw new cj(0, e);
        }
    }
}
