package com.umeng.analytics.pro;

import com.umeng.analytics.pro.bo;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: G4P0 */
/* loaded from: classes.dex */
public class ay {
    public final bu a;
    public final ch b;

    public ay() {
        this(new bo.a());
    }

    public ay(bw bwVar) {
        ch chVar = new ch();
        this.b = chVar;
        this.a = bwVar.a(chVar);
    }

    public void a(av avVar, byte[] bArr) {
        try {
            this.b.a(bArr);
            avVar.read(this.a);
        } finally {
            this.b.e();
            this.a.B();
        }
    }

    public void a(av avVar, String str, String str2) {
        try {
            try {
                a(avVar, str.getBytes(str2));
            } catch (UnsupportedEncodingException unused) {
                throw new bb("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } finally {
            this.a.B();
        }
    }

    public void a(av avVar, byte[] bArr, bc bcVar, bc... bcVarArr) {
        try {
            try {
                if (j(bArr, bcVar, bcVarArr) != null) {
                    avVar.read(this.a);
                }
            } catch (Exception e) {
                throw new bb(e);
            }
        } finally {
            this.b.e();
            this.a.B();
        }
    }

    public Boolean a(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Boolean) a((byte) 2, bArr, bcVar, bcVarArr);
    }

    public Byte b(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Byte) a((byte) 3, bArr, bcVar, bcVarArr);
    }

    public Double c(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Double) a((byte) 4, bArr, bcVar, bcVarArr);
    }

    public Short d(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Short) a((byte) 6, bArr, bcVar, bcVarArr);
    }

    public Integer e(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Integer) a((byte) 8, bArr, bcVar, bcVarArr);
    }

    public Long f(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (Long) a((byte) 10, bArr, bcVar, bcVarArr);
    }

    public String g(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (String) a((byte) 11, bArr, bcVar, bcVarArr);
    }

    public ByteBuffer h(byte[] bArr, bc bcVar, bc... bcVarArr) {
        return (ByteBuffer) a((byte) 100, bArr, bcVar, bcVarArr);
    }

    public Short i(byte[] bArr, bc bcVar, bc... bcVarArr) {
        try {
            try {
                if (j(bArr, bcVar, bcVarArr) != null) {
                    this.a.j();
                    return Short.valueOf(this.a.l().c);
                }
                this.b.e();
                this.a.B();
                return null;
            } catch (Exception e) {
                throw new bb(e);
            }
        } finally {
            this.b.e();
            this.a.B();
        }
    }

    private Object a(byte b, byte[] bArr, bc bcVar, bc... bcVarArr) {
        try {
            try {
                bp j = j(bArr, bcVar, bcVarArr);
                if (j != null) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b != 6) {
                                    if (b != 8) {
                                        if (b != 100) {
                                            if (b != 10) {
                                                if (b == 11 && j.b == 11) {
                                                    return this.a.z();
                                                }
                                            } else if (j.b == 10) {
                                                return Long.valueOf(this.a.x());
                                            }
                                        } else if (j.b == 11) {
                                            return this.a.A();
                                        }
                                    } else if (j.b == 8) {
                                        return Integer.valueOf(this.a.w());
                                    }
                                } else if (j.b == 6) {
                                    return Short.valueOf(this.a.v());
                                }
                            } else if (j.b == 4) {
                                return Double.valueOf(this.a.y());
                            }
                        } else if (j.b == 3) {
                            return Byte.valueOf(this.a.u());
                        }
                    } else if (j.b == 2) {
                        return Boolean.valueOf(this.a.t());
                    }
                }
                this.b.e();
                this.a.B();
                return null;
            } catch (Exception e) {
                throw new bb(e);
            }
        } finally {
            this.b.e();
            this.a.B();
        }
    }

    private bp j(byte[] bArr, bc bcVar, bc... bcVarArr) {
        this.b.a(bArr);
        int length = bcVarArr.length + 1;
        bc[] bcVarArr2 = new bc[length];
        int i = 0;
        bcVarArr2[0] = bcVar;
        int i2 = 0;
        while (i2 < bcVarArr.length) {
            int i3 = i2 + 1;
            bcVarArr2[i3] = bcVarArr[i2];
            i2 = i3;
        }
        this.a.j();
        bp bpVar = null;
        while (i < length) {
            bpVar = this.a.l();
            if (bpVar.b == 0 || bpVar.c > bcVarArr2[i].a()) {
                return null;
            }
            if (bpVar.c != bcVarArr2[i].a()) {
                bx.a(this.a, bpVar.b);
                this.a.m();
            } else {
                i++;
                if (i < length) {
                    this.a.j();
                }
            }
        }
        return bpVar;
    }

    public void a(av avVar, String str) {
        a(avVar, str.getBytes());
    }
}
