package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: G4EL */
/* renamed from: l.ۙۧ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4596 implements Closeable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Logger f14658 = Logger.getLogger(C18002.class.getName());

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f14659;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20119 f14660;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1774 f14661;

    public C4596(InterfaceC6171 interfaceC6171) {
        this.f14659 = interfaceC6171;
        C20119 c20119 = new C20119(interfaceC6171);
        this.f14660 = c20119;
        this.f14661 = new C1774(c20119);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13508(boolean z, C21530 c21530) {
        short readByte;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        try {
            this.f14659.mo12313(9L);
            int m13504 = m13504(this.f14659);
            if (m13504 < 0 || m13504 > 16384) {
                C18002.m42040("FRAME_SIZE_ERROR: %s", Integer.valueOf(m13504));
                throw null;
            }
            byte readByte2 = (byte) (this.f14659.readByte() & 255);
            if (z && readByte2 != 4) {
                C18002.m42040("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte2));
                throw null;
            }
            byte readByte3 = (byte) (this.f14659.readByte() & 255);
            int readInt = this.f14659.readInt();
            int i = readInt & Integer.MAX_VALUE;
            Logger logger = f14658;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C18002.m42038(true, i, m13504, readByte2, readByte3));
            }
            switch (readByte2) {
                case 0:
                    InterfaceC6171 interfaceC6171 = this.f14659;
                    if (i == 0) {
                        C18002.m42040("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z2 = (readByte3 & 1) != 0;
                    if ((readByte3 & UTF8.S_CS3) != 0) {
                        C18002.m42040("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    readByte = (readByte3 & 8) != 0 ? (short) (interfaceC6171.readByte() & 255) : (short) 0;
                    int m13503 = m13503(m13504, readByte3, readByte);
                    C22235 c22235 = c21530.f69210;
                    if (i != 0 && (readInt & 1) == 0) {
                        c22235.m49927(i, interfaceC6171, m13503, z2);
                    } else {
                        C10241 m49923 = c22235.m49923(i);
                        if (m49923 == null) {
                            c22235.m49935(i, EnumC13499.PROTOCOL_ERROR);
                            long j = m13503;
                            c22235.m49939(j);
                            interfaceC6171.skip(j);
                        } else {
                            m49923.m25936(interfaceC6171, m13503);
                            if (z2) {
                                m49923.m25946();
                            }
                        }
                    }
                    interfaceC6171.skip(readByte);
                    return true;
                case 1:
                    m13505(c21530, m13504, readByte3, i);
                    return true;
                case 2:
                    if (m13504 != 5) {
                        C18002.m42040("TYPE_PRIORITY length: %d != 5", Integer.valueOf(m13504));
                        throw null;
                    }
                    if (i == 0) {
                        C18002.m42040("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    InterfaceC6171 interfaceC61712 = this.f14659;
                    interfaceC61712.readInt();
                    interfaceC61712.readByte();
                    return true;
                case 3:
                    if (m13504 != 4) {
                        C18002.m42040("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(m13504));
                        throw null;
                    }
                    if (i == 0) {
                        C18002.m42040("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int readInt2 = this.f14659.readInt();
                    EnumC13499 m32529 = EnumC13499.m32529(readInt2);
                    if (m32529 == null) {
                        C18002.m42040("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                        throw null;
                    }
                    C22235 c222352 = c21530.f69210;
                    if (i != 0 && (readInt & 1) == 0) {
                        c222352.m49928(i, m32529);
                        return true;
                    }
                    C10241 m49934 = c222352.m49934(i);
                    if (m49934 != null) {
                        m49934.m25943(m32529);
                    }
                    return true;
                case 4:
                    InterfaceC6171 interfaceC61713 = this.f14659;
                    if (i != 0) {
                        C18002.m42040("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((readByte3 & 1) == 0) {
                        if (m13504 % 6 != 0) {
                            C18002.m42040("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(m13504));
                            throw null;
                        }
                        C1938 c1938 = new C1938();
                        for (int i2 = 0; i2 < m13504; i2 += 6) {
                            int readShort = interfaceC61713.readShort() & HPKE.aead_EXPORT_ONLY;
                            int readInt3 = interfaceC61713.readInt();
                            if (readShort != 2) {
                                if (readShort == 3) {
                                    readShort = 4;
                                } else if (readShort == 4) {
                                    if (readInt3 < 0) {
                                        C18002.m42040("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        throw null;
                                    }
                                    readShort = 7;
                                } else if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                    C18002.m42040("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt3));
                                    throw null;
                                }
                            } else if (readInt3 != 0 && readInt3 != 1) {
                                C18002.m42040("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                            c1938.m6391(readShort, readInt3);
                        }
                        C22235 c222353 = c21530.f69210;
                        try {
                            scheduledThreadPoolExecutor = c222353.f72146;
                            scheduledThreadPoolExecutor.execute(new C8124(c21530, new Object[]{c222353.f72148}, c1938));
                        } catch (RejectedExecutionException unused) {
                        }
                    } else if (m13504 != 0) {
                        C18002.m42040("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                    return true;
                case 5:
                    InterfaceC6171 interfaceC61714 = this.f14659;
                    if (i == 0) {
                        C18002.m42040("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    }
                    readByte = (readByte3 & 8) != 0 ? (short) (interfaceC61714.readByte() & 255) : (short) 0;
                    int readInt4 = interfaceC61714.readInt() & Integer.MAX_VALUE;
                    int m135032 = m13503(m13504 - 4, readByte3, readByte);
                    C20119 c20119 = this.f14660;
                    c20119.f65159 = m135032;
                    c20119.f65157 = m135032;
                    c20119.f65155 = readByte;
                    c20119.f65158 = readByte3;
                    c20119.f65156 = i;
                    C1774 c1774 = this.f14661;
                    c1774.m5925();
                    c21530.f69210.m49930(c1774.m5923(), readInt4);
                    return true;
                case 6:
                    m13507(c21530, m13504, readByte3, i);
                    return true;
                case 7:
                    m13506(c21530, m13504, i);
                    return true;
                case 8:
                    if (m13504 != 4) {
                        C18002.m42040("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(m13504));
                        throw null;
                    }
                    long readInt5 = this.f14659.readInt() & 2147483647L;
                    if (readInt5 == 0) {
                        C18002.m42040("windowSizeIncrement was 0", Long.valueOf(readInt5));
                        throw null;
                    }
                    if (i == 0) {
                        synchronized (c21530.f69210) {
                            C22235 c222354 = c21530.f69210;
                            c222354.f72161 += readInt5;
                            c222354.notifyAll();
                        }
                        return true;
                    }
                    C10241 m499232 = c21530.f69210.m49923(i);
                    if (m499232 != null) {
                        synchronized (m499232) {
                            m499232.f30866 += readInt5;
                            if (readInt5 > 0) {
                                m499232.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f14659.skip(m13504);
                    return true;
            }
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13505(C21530 c21530, int i, byte b, int i2) {
        boolean z;
        ThreadPoolExecutor threadPoolExecutor;
        if (i2 == 0) {
            C18002.m42040("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z2 = (b & 1) != 0;
        short readByte = (b & 8) != 0 ? (short) (this.f14659.readByte() & 255) : (short) 0;
        if ((b & UTF8.S_CS3) != 0) {
            InterfaceC6171 interfaceC6171 = this.f14659;
            interfaceC6171.readInt();
            interfaceC6171.readByte();
            i -= 5;
        }
        int m13503 = m13503(i, b, readByte);
        C20119 c20119 = this.f14660;
        c20119.f65159 = m13503;
        c20119.f65157 = m13503;
        c20119.f65155 = readByte;
        c20119.f65158 = b;
        c20119.f65156 = i2;
        C1774 c1774 = this.f14661;
        c1774.m5925();
        ArrayList m5923 = c1774.m5923();
        C22235 c22235 = c21530.f69210;
        if (i2 != 0 && (i2 & 1) == 0) {
            c22235.m49931(m5923, i2, z2);
            return;
        }
        synchronized (c22235) {
            C10241 m49923 = c21530.f69210.m49923(i2);
            if (m49923 == null) {
                z = c21530.f69210.f72154;
                if (z) {
                    return;
                }
                C22235 c222352 = c21530.f69210;
                if (i2 <= c222352.f72162) {
                    return;
                }
                if (i2 % 2 == c222352.f72145 % 2) {
                    return;
                }
                C10241 c10241 = new C10241(i2, c21530.f69210, false, z2, C20032.m46178(m5923));
                C22235 c222353 = c21530.f69210;
                c222353.f72162 = i2;
                c222353.f72144.put(Integer.valueOf(i2), c10241);
                threadPoolExecutor = C22235.f72139;
                threadPoolExecutor.execute(new C1068(c21530, new Object[]{c21530.f69210.f72148, Integer.valueOf(i2)}, c10241));
                return;
            }
            m49923.m25935(m5923);
            if (z2) {
                m49923.m25946();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13507(C21530 c21530, int i, byte b, int i2) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        if (i != 8) {
            C18002.m42040("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C18002.m42040("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int readInt = this.f14659.readInt();
        int readInt2 = this.f14659.readInt();
        if ((b & 1) == 0) {
            try {
                scheduledThreadPoolExecutor = c21530.f69210.f72146;
                scheduledThreadPoolExecutor.execute(new C5302(c21530.f69210, readInt, readInt2));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (c21530.f69210) {
            try {
                if (readInt == 1) {
                    C22235.m49917(c21530.f69210);
                } else if (readInt == 2) {
                    C22235.m49920(c21530.f69210);
                } else if (readInt == 3) {
                    C22235.m49913(c21530.f69210);
                    c21530.f69210.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13506(C21530 c21530, int i, int i2) {
        C10241[] c10241Arr;
        if (i < 8) {
            C18002.m42040("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C18002.m42040("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int readInt = this.f14659.readInt();
        int readInt2 = this.f14659.readInt();
        int i3 = i - 8;
        if (EnumC13499.m32529(readInt2) == null) {
            C18002.m42040("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        }
        C11816 c11816 = C11816.f35248;
        if (i3 > 0) {
            c11816 = this.f14659.mo12305(i3);
        }
        c11816.mo2336();
        synchronized (c21530.f69210) {
            c10241Arr = (C10241[]) c21530.f69210.f72144.values().toArray(new C10241[c21530.f69210.f72144.size()]);
            c21530.f69210.f72154 = true;
        }
        for (C10241 c10241 : c10241Arr) {
            if (c10241.f30871 > readInt && c10241.m25944()) {
                c10241.m25943(EnumC13499.REFUSED_STREAM);
                c21530.f69210.m49934(c10241.f30871);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14659.close();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13504(InterfaceC6171 interfaceC6171) {
        return (interfaceC6171.readByte() & 255) | ((interfaceC6171.readByte() & 255) << 16) | ((interfaceC6171.readByte() & 255) << 8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13503(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C18002.m42040("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
