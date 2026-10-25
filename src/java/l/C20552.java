package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: YA21 */
/* renamed from: l.᩷֨᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20552 extends AbstractRunnableC7146 implements InterfaceC9263 {

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f66209 = C11321.m27961(C20552.class);

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InputStream f66210;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18663 f66212;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public long f66213;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC17065 f66214;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final boolean f66216;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public Socket f66220;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20594 f66221;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f66222;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public OutputStream f66223;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC3846 f66225;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f66215 = false;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f66217 = new AtomicLong();

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final byte[] f66226 = new byte[1024];

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final LinkedList f66224 = new LinkedList();

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public String f66211 = null;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Semaphore f66218 = new Semaphore(1, true);

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public byte[] f66219 = new byte[64];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C23373 m47102(InterfaceC18663 interfaceC18663, String str, String str2) {
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Currently " + this.f66224.size() + " session(s) active for " + this);
        }
        if (str != null) {
            str = str.toLowerCase(Locale.ROOT);
        }
        if (str2 != null) {
            str2 = str2.toUpperCase(Locale.ROOT);
        }
        ListIterator listIterator = this.f66224.listIterator();
        while (listIterator.hasNext()) {
            C23373 c23373 = (C23373) listIterator.next();
            if (c23373.m51801(interfaceC18663, str, str2)) {
                InterfaceC2148 interfaceC21482 = f66209;
                if (interfaceC21482.mo7099()) {
                    interfaceC21482.mo7101("Reusing existing session " + c23373);
                }
                c23373.m51800();
                return c23373;
            }
            InterfaceC2148 interfaceC21483 = f66209;
            if (interfaceC21483.mo7099()) {
                interfaceC21483.mo7101("Existing session " + c23373 + " does not match " + interfaceC18663.mo6355());
            }
        }
        if (((C13722) interfaceC18663.mo27540()).m32976() > 0) {
            long j = this.f66213;
            long currentTimeMillis = System.currentTimeMillis();
            if (j < currentTimeMillis) {
                this.f66213 = ((C13722) interfaceC18663.mo27540()).m32976() + currentTimeMillis;
                ListIterator listIterator2 = this.f66224.listIterator();
                while (listIterator2.hasNext()) {
                    C23373 c233732 = (C23373) listIterator2.next();
                    if (c233732.m51814() != null && c233732.m51814().longValue() < currentTimeMillis && !c233732.m51795()) {
                        InterfaceC2148 interfaceC21484 = f66209;
                        if (interfaceC21484.mo7086()) {
                            interfaceC21484.mo7088("Closing session after timeout " + c233732);
                        }
                        c233732.m51802(false, false);
                    }
                }
            }
        }
        C23373 c233733 = new C23373(interfaceC18663, str, str2, this);
        InterfaceC2148 interfaceC21485 = f66209;
        if (interfaceC21485.mo7086()) {
            interfaceC21485.mo7088("Establishing new session " + c233733 + " on " + this.f21940);
        }
        this.f66224.add(c233733);
        return c233733;
    }

    @Override // l.AbstractRunnableC7146
    /* renamed from: ۧ */
    public final synchronized boolean mo19175(boolean z, boolean z2) {
        boolean z3;
        InterfaceC18663 interfaceC18663;
        ListIterator listIterator = this.f66224.listIterator();
        long m19176 = m19176();
        if ((!z2 || m19176 == 1) && (z2 || m19176 <= 0)) {
            z3 = false;
        } else {
            f66209.mo7104("Disconnecting transport while still in use " + this + ": " + this.f66224);
            z3 = true;
        }
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Disconnecting transport " + this);
        }
        try {
            try {
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7101("Currently " + this.f66224.size() + " session(s) active for " + this);
                }
                while (listIterator.hasNext()) {
                    try {
                        try {
                            z3 |= ((C23373) listIterator.next()).m51802(z, false);
                        } finally {
                            listIterator.remove();
                        }
                    } catch (Exception e) {
                        f66209.mo7081("Failed to close session", e);
                    }
                }
                Socket socket = this.f66220;
                if (socket != null) {
                    socket.shutdownOutput();
                    this.f66223.close();
                    this.f66210.close();
                    this.f66220.close();
                    f66209.mo7101("Socket closed");
                } else {
                    f66209.mo7101("Not yet initialized");
                }
                this.f66220 = null;
                this.f66214 = null;
                this.f66211 = null;
                interfaceC18663 = this.f66212;
            } catch (Exception e2) {
                f66209.mo7081("Exception in disconnect", e2);
                this.f66220 = null;
                this.f66214 = null;
                this.f66211 = null;
                interfaceC18663 = this.f66212;
            }
            ((C15611) interfaceC18663.mo27538()).m36796(this);
        } catch (Throwable th) {
            this.f66220 = null;
            this.f66214 = null;
            this.f66211 = null;
            ((C15611) this.f66212.mo27538()).m36796(this);
            throw th;
        }
        return z3;
    }

    public C20552(InterfaceC18663 interfaceC18663, InterfaceC3846 interfaceC3846, int i, boolean z) {
        boolean z2 = false;
        this.f66212 = interfaceC18663;
        if (z) {
            z2 = true;
        } else {
            interfaceC18663.mo27540().getClass();
        }
        this.f66216 = z2;
        this.f66213 = System.currentTimeMillis() + ((C13722) interfaceC18663.mo27540()).m32976();
        this.f66225 = interfaceC3846;
        this.f66222 = i;
    }

    @Override // l.AbstractRunnableC7146
    /* renamed from: ۧ */
    public final int mo19173(InterfaceC7578 interfaceC7578) {
        if (interfaceC7578 != null) {
            interfaceC7578.getClass();
        }
        return ((C13722) this.f66212.mo27540()).m33015();
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3846 m47109() {
        return this.f66225;
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m47108() {
        return this.f66211;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m47118() {
        return this.f66224.size();
    }

    @Override // l.AbstractRunnableC7146
    /* renamed from: ᩻ */
    public final boolean mo19180() {
        Socket socket = this.f66220;
        return super.mo19180() || socket == null || socket.isClosed();
    }

    @Override // l.AbstractRunnableC7146
    /* renamed from: ۜ */
    public final boolean mo19172() {
        Socket socket = this.f66220;
        return super.mo19172() || socket == null || socket.isClosed();
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC20594 m47117() {
        try {
            if (this.f66221 == null) {
                m19174(((C13722) this.f66212.mo27540()).m33015());
            }
            InterfaceC20594 interfaceC20594 = this.f66221;
            if (interfaceC20594 != null) {
                return interfaceC20594;
            }
            throw new C3037("Connection did not complete, failed to get negotiation response");
        } catch (IOException e) {
            throw new C3037(e.getMessage(), e);
        }
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m47112() {
        return this.f66215 || (m47117() instanceof C3450);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47104(InterfaceC17065 interfaceC17065) {
        this.f66214 = interfaceC17065;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC17065 m47115() {
        return this.f66214;
    }

    public final InterfaceC18663 getContext() {
        return this.f66212;
    }

    @Override // l.AbstractRunnableC7146
    /* renamed from: ֫ */
    public final void mo19166(InterfaceC7578 interfaceC7578) {
        InterfaceC2148 interfaceC2148;
        byte[] m25072 = this.f66212.mo27542().m25072();
        try {
            synchronized (this.f21938) {
                int mo10430 = interfaceC7578.mo10430(4, m25072);
                C2913.m8901(65535 & mo10430, 0, m25072);
                if (f66209.mo7099()) {
                    do {
                        interfaceC2148 = f66209;
                        interfaceC2148.mo7101(interfaceC7578.toString());
                        if (!(interfaceC7578 instanceof AbstractC10011)) {
                            break;
                        } else {
                            interfaceC7578 = ((AbstractC10011) interfaceC7578).m25186();
                        }
                    } while (interfaceC7578 != null);
                    interfaceC2148.mo7101(C12085.m29468(m25072, 4, mo10430));
                }
                this.f66223.write(m25072, 0, mo10430 + 4);
                this.f66223.flush();
            }
        } finally {
            this.f66212.mo27542().m25071(m25072);
        }
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m47119() {
        if (this.f66216) {
            return false;
        }
        InterfaceC20594 m47117 = m47117();
        return m47117.mo10550() && !m47117.mo10539();
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m47110() {
        if (this.f66216) {
            return true;
        }
        return m47117().mo10539();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9263 m47101(Class cls) {
        if (cls.isAssignableFrom(C20552.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47105(InterfaceC3846 interfaceC3846, int i, String str) {
        int i2;
        if (this.f21933 == 5 || this.f21933 == 6) {
            return false;
        }
        if (str == null) {
            str = interfaceC3846.mo1015();
        }
        String str2 = this.f66211;
        if ((str2 != null && !str.equalsIgnoreCase(str2)) || !interfaceC3846.equals(this.f66225)) {
            return false;
        }
        if (i == 0 || i == (i2 = this.f66222)) {
            return true;
        }
        return i == 445 && i2 == 139;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47113() {
        String mo1013;
        InterfaceC18663 interfaceC18663 = this.f66212;
        InterfaceC1023 mo27540 = interfaceC18663.mo27540();
        InterfaceC3846 interfaceC3846 = this.f66225;
        C16296 c16296 = new C16296(mo27540, interfaceC3846.mo1016(), 32, null);
        do {
            Socket socket = new Socket();
            this.f66220 = socket;
            socket.connect(new InetSocketAddress(interfaceC3846.mo1012(), 139), ((C13722) interfaceC18663.mo27540()).m33004());
            this.f66220.setSoTimeout(((C13722) interfaceC18663.mo27540()).m32993());
            this.f66223 = this.f66220.getOutputStream();
            this.f66210 = this.f66220.getInputStream();
            C19120 c19120 = new C19120(interfaceC18663.mo27540(), c16296, ((RunnableC9242) interfaceC18663.mo27539()).m23696());
            OutputStream outputStream = this.f66223;
            byte[] bArr = this.f66226;
            outputStream.write(bArr, 0, c19120.m44069(bArr));
            int m19158 = AbstractRunnableC7146.m19158(this.f66210, bArr, 0, 4);
            InterfaceC2148 interfaceC2148 = f66209;
            if (m19158 < 4) {
                try {
                    this.f66220.close();
                } catch (IOException e) {
                    interfaceC2148.mo7081("Failed to close socket", (Exception) e);
                }
                throw new C3037("EOF during NetBIOS session request");
            }
            int i = bArr[0] & 255;
            if (i == -1) {
                m19178();
                throw new C2186(-1);
            }
            if (i == 130) {
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("session established ok with " + interfaceC3846);
                    return;
                }
                return;
            }
            if (i == 131) {
                int read = this.f66210.read() & 255;
                if (read == 128 || read == 130) {
                    this.f66220.close();
                    mo1013 = interfaceC3846.mo1013(interfaceC18663);
                    c16296.f50125 = mo1013;
                } else {
                    m19178();
                    throw new C2186(read);
                }
            } else {
                m19178();
                throw new C2186(0);
            }
        } while (mo1013 != null);
        throw new IOException("Failed to establish session with " + interfaceC3846);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23415 m47090(int i) {
        synchronized (this.f21939) {
            try {
                if (i == 139) {
                    m47113();
                } else {
                    if (i == 0) {
                        i = 445;
                    }
                    Socket socket = new Socket();
                    this.f66220 = socket;
                    socket.connect(new InetSocketAddress(this.f66225.mo1012(), i), ((C13722) this.f66212.mo27540()).m33004());
                    this.f66220.setSoTimeout(((C13722) this.f66212.mo27540()).m32993());
                    this.f66223 = this.f66220.getOutputStream();
                    this.f66210 = this.f66220.getInputStream();
                }
                if (this.f66218.drainPermits() == 0) {
                    f66209.mo7088("It appears we previously lost some credits");
                }
                if (this.f66215) {
                    f66209.mo7088("Using SMB2 only negotiation");
                    return m47094((C3450) null);
                }
                this.f66212.mo27540().getClass();
                C9346 c9346 = new C9346(this.f66212.mo27540(), this.f66216);
                int m47089 = m47089((InterfaceC7578) c9346, true);
                m47093();
                if (this.f66215) {
                    C3450 c3450 = new C3450(this.f66212.mo27540());
                    c3450.m10431(this.f66226, 4, false);
                    c3450.mo28228();
                    if (c3450.m10541() == 767) {
                        return m47094(c3450);
                    }
                    if (c3450.m10541() != 514) {
                        throw new C19369("Server returned invalid dialect verison in multi protocol negotiation");
                    }
                    int m10462 = c3450.m10462();
                    if (m10462 > 0) {
                        this.f66218.release(m10462);
                    }
                    Arrays.fill(this.f66226, (byte) 0);
                    return new C23415(new C4861(this.f66212.mo27540(), this.f66216 ? 2 : 1), c3450, null, null);
                }
                if (((C13722) this.f66212.mo27540()).m32981().m48660()) {
                    throw new C19369("Server does not support SMB2");
                }
                C8640 c8640 = new C8640(this.f66212);
                c8640.decode(this.f66226);
                c8640.mo28228();
                InterfaceC2148 interfaceC2148 = f66209;
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7101(c8640.toString());
                    interfaceC2148.mo7101(C12085.m29468(this.f66226, 4, m47089));
                }
                int m22407 = c8640.m22407();
                if (m22407 > 0) {
                    this.f66218.release(m22407);
                }
                Arrays.fill(this.f66226, (byte) 0);
                return new C23415(c9346, c8640, null, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m47089(InterfaceC7578 interfaceC7578, boolean z) {
        if (z) {
            mo19177(interfaceC7578);
        } else {
            interfaceC7578.mo10434(0L);
            this.f66217.set(1L);
        }
        byte[] bArr = this.f66226;
        int mo10430 = interfaceC7578.mo10430(4, bArr);
        C2913.m8901(65535 & mo10430, 0, bArr);
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101(interfaceC7578.toString());
            interfaceC2148.mo7101(C12085.m29468(bArr, 4, mo10430));
        }
        this.f66223.write(bArr, 0, mo10430 + 4);
        this.f66223.flush();
        interfaceC2148.mo7101("Wrote negotiate request");
        return mo10430;
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m47093() {
        InterfaceC18663 interfaceC18663 = this.f66212;
        try {
            this.f66220.setSoTimeout(((C13722) interfaceC18663.mo27540()).m33004());
            if (mo19170() == null) {
                throw new IOException("transport closed in negotiate");
            }
            this.f66220.setSoTimeout(((C13722) interfaceC18663.mo27540()).m32993());
            byte[] bArr = this.f66226;
            int m8900 = C2913.m8900(2, bArr) & HPKE.aead_EXPORT_ONLY;
            if (m8900 < 33 || m8900 + 4 > bArr.length) {
                throw new IOException(C19370.m44628(m8900, "Invalid payload size: "));
            }
            int i = this.f66215 ? 64 : 32;
            AbstractRunnableC7146.m19158(this.f66210, bArr, i + 4, m8900 - i);
            f66209.mo7101("Read negotiate response");
        } catch (Throwable th) {
            this.f66220.setSoTimeout(((C13722) interfaceC18663.mo27540()).m32993());
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C23415 m47094(C3450 c3450) {
        Throwable th;
        byte[] bArr;
        Semaphore semaphore = this.f66218;
        byte[] bArr2 = this.f66226;
        int m47099 = m47099(c3450);
        InterfaceC18663 interfaceC18663 = this.f66212;
        C4861 c4861 = new C4861(interfaceC18663.mo27540(), m47099);
        C3450 c34502 = null;
        byte[] bArr3 = null;
        try {
            c4861.m10442(Math.max(1, 512 - semaphore.availablePermits()));
            int m47089 = m47089(c4861, c3450 != null);
            boolean m48659 = ((C13722) interfaceC18663.mo27540()).m32972().m48659(EnumC21485.SMB311);
            if (m48659) {
                bArr = new byte[m47089];
                System.arraycopy(bArr2, 4, bArr, 0, m47089);
            } else {
                bArr = null;
            }
            m47093();
            C3450 c34503 = (C3450) c4861.mo5430(interfaceC18663);
            try {
                int m10431 = c34503.m10431(bArr2, 4, false);
                c34503.mo28228();
                if (m48659) {
                    bArr3 = new byte[m10431];
                    System.arraycopy(bArr2, 4, bArr3, 0, m10431);
                } else {
                    bArr = null;
                }
                InterfaceC2148 interfaceC2148 = f66209;
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7101(c34503.toString());
                    interfaceC2148.mo7101(C12085.m29468(bArr2, 4, 0));
                }
                C23415 c23415 = new C23415(c4861, c34503, bArr, bArr3);
                int m10462 = c34503.m10462();
                semaphore.release(m10462 != 0 ? m10462 : 1);
                Arrays.fill(bArr2, (byte) 0);
                return c23415;
            } catch (Throwable th2) {
                th = th2;
                c34502 = c34503;
                int m104622 = c34502 != null ? c34502.m10462() : 0;
                semaphore.release(m104622 != 0 ? m104622 : 1);
                Arrays.fill(bArr2, (byte) 0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m47114() {
        try {
            return m19174(((C13722) this.f66212.mo27540()).m33015());
        } catch (C1708 e) {
            throw new C3037("Failed to connect: " + this.f66225, e);
        }
    }

    @Override // l.AbstractRunnableC7146
    /* renamed from: ᩳ */
    public final void mo19179() {
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Connecting in state " + this.f21933 + " addr " + this.f66225.mo1012());
        }
        try {
            C23415 m47090 = m47090(this.f66222);
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Negotiation response on " + this.f21940 + " :" + m47090);
            }
            if (!m47090.m51871().mo10538(this.f66212, m47090.m51870())) {
                throw new C3037("This client is not compatible with the server.");
            }
            boolean mo10539 = m47090.m51871().mo10539();
            boolean mo10540 = m47090.m51871().mo10540();
            if (interfaceC2148.mo7086()) {
                StringBuilder sb = new StringBuilder("Signature negotiation enforced ");
                sb.append(this.f66216);
                sb.append(" (server ");
                sb.append(mo10539);
                sb.append(") enabled false (server ");
                this.f66212.mo27540().getClass();
                sb.append(mo10540);
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                interfaceC2148.mo7088(sb.toString());
            }
            this.f66211 = this.f66225.mo1015();
            this.f66221 = m47090.m51871();
            if (m47090.m51871().mo10552().m48659(EnumC21485.SMB311)) {
                byte[] m51872 = m47090.m51872();
                synchronized (this.f66219) {
                    this.f66219 = m47107(m51872.length, m51872, this.f66219);
                }
                m47096(m47090.m51869());
                if (interfaceC2148.mo7086()) {
                    byte[] bArr = this.f66219;
                    interfaceC2148.mo7088("Preauth hash after negotiate ".concat(C12085.m29468(bArr, 0, bArr.length)));
                }
            }
        } catch (IOException e) {
            this.f66212.mo27540().getClass();
            throw e;
        }
    }

    @Override // l.AbstractRunnableC7146
    /* renamed from: ܽ */
    public final long mo19177(InterfaceC7578 interfaceC7578) {
        long incrementAndGet = this.f66217.incrementAndGet() - 1;
        if (!this.f66215) {
            incrementAndGet %= 32000;
        }
        interfaceC7578.mo10434(incrementAndGet);
        return incrementAndGet;
    }

    @Override // l.AbstractRunnableC7146
    /* renamed from: ۖ */
    public final Long mo19170() {
        byte[] bArr;
        char c;
        do {
            InputStream inputStream = this.f66210;
            bArr = this.f66226;
            c = 4;
            if (AbstractRunnableC7146.m19158(inputStream, bArr, 0, 4) < 4) {
                return null;
            }
        } while (bArr[0] == -123);
        if (AbstractRunnableC7146.m19158(this.f66210, bArr, 4, 32) < 32) {
            return null;
        }
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("New data read: " + this);
            interfaceC2148.mo7101(C12085.m29468(bArr, 4, 32));
        }
        while (true) {
            byte b = bArr[0];
            if (b == 0 && bArr[c] == -2 && bArr[5] == 83 && bArr[6] == 77 && bArr[7] == 66) {
                this.f66215 = true;
                if (AbstractRunnableC7146.m19158(this.f66210, bArr, 36, 32) < 32) {
                    return null;
                }
                return Long.valueOf((C2913.m8906(28, bArr) & 4294967295L) | ((C2913.m8906(32, bArr) & 4294967295L) << 32));
            }
            if (b != 0 || bArr[1] != 0 || bArr[4] != -1 || bArr[5] != 83 || bArr[6] != 77 || bArr[7] != 66) {
                int i = 0;
                while (i < 35) {
                    interfaceC2148.mo7104("Possibly out of phase, trying to resync ".concat(C12085.m29468(bArr, 0, 16)));
                    int i2 = i + 1;
                    bArr[i] = bArr[i2];
                    i = i2;
                }
                int read = this.f66210.read();
                if (read == -1) {
                    return null;
                }
                bArr[35] = (byte) read;
                c = 4;
            } else {
                return Long.valueOf(C2913.m8902(34, bArr) & 65535);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0236, code lost:
    
        if (r2 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c2, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x023c, code lost:
    
        if (mo19180() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0242, code lost:
    
        if (r5.mo20320() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024c, code lost:
    
        if (r5.mo5429().mo5289() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0256, code lost:
    
        if (r5.mo5429().mo28209() != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0258, code lost:
    
        if (r0 != 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0260, code lost:
    
        if (r22.f66218.availablePermits() > 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0262, code lost:
    
        if (r6 <= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0265, code lost:
    
        l.C20552.f66209.mo7104("Server " + r22 + " took away all our credits");
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x027f, code lost:
    
        l.C20552.f66209.mo7088("Server " + r22 + " returned zero credits for " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a0, code lost:
    
        if (r5.mo20320() != false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a2, code lost:
    
        r2 = l.C20552.f66209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a8, code lost:
    
        if (r2.mo7099() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02aa, code lost:
    
        r2.mo7101("Adding credits " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02bb, code lost:
    
        r22.f66218.release(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x022a, code lost:
    
        if (r2.mo28213() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x022c, code lost:
    
        r0 = r2.mo28222() + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0204, code lost:
    
        l.C20552.f66209.mo7101("Async");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00df, code lost:
    
        if ((r7 + r11) > r4) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0100, code lost:
    
        throw new l.C3037(java.lang.String.format("Request size %d exceeds allowable size %d: %s", java.lang.Integer.valueOf(r11), java.lang.Integer.valueOf(r4), r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e7, code lost:
    
        if (r8.mo7086() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e9, code lost:
    
        r8.mo7088("Breaking on error " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fd, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0202, code lost:
    
        if (r5.mo20320() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020c, code lost:
    
        r2 = r5.mo5429();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0210, code lost:
    
        if (r2 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0212, code lost:
    
        l.C20552.f66209.mo7104("Response not properly set up for" + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0232, code lost:
    
        r2 = r5.mo20322();
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c3 A[Catch: all -> 0x0393, TryCatch #0 {all -> 0x0393, blocks: (B:41:0x01b9, B:43:0x01c3, B:44:0x01d7, B:89:0x01e3, B:91:0x01e9, B:47:0x02c7), top: B:40:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e3 A[EDGE_INSN: B:88:0x01e3->B:89:0x01e3 BREAK  A[LOOP:0: B:7:0x0066->B:72:0x038b], SYNTHETIC] */
    @Override // l.AbstractRunnableC7146
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.InterfaceC1543 mo19163(l.InterfaceC7578 r23, l.InterfaceC1543 r24, java.util.Set r25) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20552.mo19163(l.۟ܺ᩵, l.֫ۖ᩵, java.util.Set):l.֫ۖ᩵");
    }

    @Override // l.AbstractRunnableC7146
    /* renamed from: ֫ */
    public final boolean mo19168(InterfaceC7578 interfaceC7578, InterfaceC13495 interfaceC13495) {
        if (!this.f66215) {
            return false;
        }
        AbstractC13306 abstractC13306 = (AbstractC13306) interfaceC7578;
        AbstractC12601 abstractC12601 = (AbstractC12601) interfaceC13495;
        synchronized (abstractC12601) {
            if (!abstractC12601.m10451() || abstractC12601.m30866() || abstractC12601.m10446() != 259 || abstractC12601.m10450() == 0) {
                return false;
            }
            abstractC12601.m30868();
            boolean m10451 = abstractC13306.m10451();
            abstractC13306.m10457(abstractC12601.m10450());
            if (abstractC12601.mo28225() != null) {
                abstractC12601.mo28203(Long.valueOf(System.currentTimeMillis() + mo19173(interfaceC7578)));
            }
            InterfaceC2148 interfaceC2148 = f66209;
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Have intermediate reply " + interfaceC13495);
            }
            if (!m10451) {
                int m10462 = abstractC12601.m10462();
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("Credit from intermediate " + m10462);
                }
                this.f66218.release(m10462);
            }
            return true;
        }
    }

    @Override // l.AbstractRunnableC7146
    /* renamed from: ֫ */
    public final void mo19167(InterfaceC13495 interfaceC13495) {
        InterfaceC13927 interfaceC13927 = (InterfaceC13927) interfaceC13495;
        this.f66221.mo10536(interfaceC13495);
        try {
            if (this.f66215) {
                m47095(interfaceC13927);
            } else {
                m47092(interfaceC13927);
            }
        } catch (Exception e) {
            f66209.mo7083("Failure decoding message, disconnecting transport", (Throwable) e);
            interfaceC13495.mo28202(e);
            synchronized (interfaceC13495) {
                interfaceC13495.notifyAll();
                throw e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
    
        return;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m47095(l.InterfaceC13927 r21) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20552.m47095(l.ܰܺ᩵):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47092(InterfaceC13927 interfaceC13927) {
        InterfaceC18663 interfaceC18663 = this.f66212;
        byte[] m25072 = interfaceC18663.mo27542().m25072();
        try {
            System.arraycopy(this.f66226, 0, m25072, 0, 36);
            int m8900 = C2913.m8900(2, m25072) & HPKE.aead_EXPORT_ONLY;
            if (m8900 < 33 || m8900 + 4 > Math.min(65535, ((C13722) interfaceC18663.mo27540()).m33009())) {
                throw new IOException("Invalid payload size: " + m8900);
            }
            int m8906 = C2913.m8906(9, m25072);
            if (interfaceC13927.mo10463() == 46 && (m8906 == 0 || m8906 == -2147483643)) {
                C0172 c0172 = (C0172) interfaceC13927;
                AbstractRunnableC7146.m19158(this.f66210, m25072, 36, 27);
                interfaceC13927.decode(m25072);
                int m1304 = c0172.m1304() - 59;
                if (c0172.m28207() > 0 && m1304 > 0 && m1304 < 4) {
                    AbstractRunnableC7146.m19158(this.f66210, m25072, 63, m1304);
                }
                if (c0172.m1303() > 0) {
                    AbstractRunnableC7146.m19158(this.f66210, c0172.m1307(), c0172.m1310(), c0172.m1303());
                }
            } else {
                AbstractRunnableC7146.m19158(this.f66210, m25072, 36, m8900 - 32);
                interfaceC13927.decode(m25072);
            }
        } finally {
            interfaceC18663.mo27542().m25071(m25072);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        r13 = l.C20552.f66209;
        r13.mo7088("Parsing notification");
        mo19167(r7);
        r13.mo7096("Received notification " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        return;
     */
    @Override // l.AbstractRunnableC7146
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo19165(java.lang.Long r13) {
        /*
            r12 = this;
            java.lang.String r1 = "Skipping message "
            java.lang.Object r0 = r12.f21939
            monitor-enter(r0)
            byte[] r2 = r12.f66226     // Catch: java.lang.Throwable -> Lc7
            r3 = 2
            short r2 = l.C2913.m8900(r3, r2)     // Catch: java.lang.Throwable -> Lc7
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            r4 = 33
            if (r2 < r4) goto Lb4
            int r4 = r2 + 4
            l.ᩴۡ᩵ r5 = r12.f66212     // Catch: java.lang.Throwable -> Lc7
            l.֨ۡ᩵ r5 = r5.mo27540()     // Catch: java.lang.Throwable -> Lc7
            l.ܰۡ᩵ r5 = (l.C13722) r5     // Catch: java.lang.Throwable -> Lc7
            int r5 = r5.m32982()     // Catch: java.lang.Throwable -> Lc7
            if (r4 <= r5) goto L26
            goto Lb4
        L26:
            l.ᩴۡ᩵ r4 = r12.f66212     // Catch: java.lang.Throwable -> Lc7
            byte[] r5 = r12.f66226     // Catch: java.lang.Throwable -> Lc7
            boolean r6 = r12.f66215     // Catch: java.lang.Throwable -> Lc7
            r7 = 0
            if (r6 == 0) goto L4f
            long r8 = r13.longValue()     // Catch: java.lang.Throwable -> Lc7
            r10 = -1
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L3a
            goto L6c
        L3a:
            r6 = 16
            short r5 = l.C2913.m8902(r6, r5)     // Catch: java.lang.Throwable -> Lc7
            r3 = r3 & r5
            r5 = 18
            if (r3 != r5) goto L6c
            l.۠᩵᩵ r7 = new l.۠᩵᩵     // Catch: java.lang.Throwable -> Lc7
            l.֨ۡ᩵ r3 = r4.mo27540()     // Catch: java.lang.Throwable -> Lc7
            r7.<init>(r3)     // Catch: java.lang.Throwable -> Lc7
            goto L6c
        L4f:
            long r8 = r13.longValue()     // Catch: java.lang.Throwable -> Lc7
            r10 = 65535(0xffff, double:3.23786E-319)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L5b
            goto L6c
        L5b:
            r3 = 8
            r3 = r5[r3]     // Catch: java.lang.Throwable -> Lc7
            r5 = 36
            if (r3 != r5) goto L6c
            l.ܳۘ᩵ r7 = new l.ܳۘ᩵     // Catch: java.lang.Throwable -> Lc7
            l.֨ۡ᩵ r3 = r4.mo27540()     // Catch: java.lang.Throwable -> Lc7
            r7.<init>(r3)     // Catch: java.lang.Throwable -> Lc7
        L6c:
            if (r7 == 0) goto L8b
            l.֫᩻֨ r13 = l.C20552.f66209     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = "Parsing notification"
            r13.mo7088(r1)     // Catch: java.lang.Throwable -> Lc7
            r12.mo19167(r7)     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = "Received notification "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc7
            r1.append(r7)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc7
            r13.mo7096(r1)     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            return
        L8b:
            l.֫᩻֨ r3 = l.C20552.f66209     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lc7
            r4.append(r13)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r13 = r4.toString()     // Catch: java.lang.Throwable -> Lc7
            r3.mo7104(r13)     // Catch: java.lang.Throwable -> Lc7
            boolean r13 = r12.m47112()     // Catch: java.lang.Throwable -> Lc7
            if (r13 == 0) goto Lab
            java.io.InputStream r13 = r12.f66210     // Catch: java.lang.Throwable -> Lc7
            int r2 = r2 + (-64)
            long r1 = (long) r2     // Catch: java.lang.Throwable -> Lc7
            r13.skip(r1)     // Catch: java.lang.Throwable -> Lc7
            goto Lc5
        Lab:
            java.io.InputStream r13 = r12.f66210     // Catch: java.lang.Throwable -> Lc7
            int r2 = r2 + (-32)
            long r1 = (long) r2     // Catch: java.lang.Throwable -> Lc7
            r13.skip(r1)     // Catch: java.lang.Throwable -> Lc7
            goto Lc5
        Lb4:
            l.֫᩻֨ r13 = l.C20552.f66209     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r1 = "Flusing stream input"
            r13.mo7104(r1)     // Catch: java.lang.Throwable -> Lc7
            java.io.InputStream r13 = r12.f66210     // Catch: java.lang.Throwable -> Lc7
            int r1 = r13.available()     // Catch: java.lang.Throwable -> Lc7
            long r1 = (long) r1     // Catch: java.lang.Throwable -> Lc7
            r13.skip(r1)     // Catch: java.lang.Throwable -> Lc7
        Lc5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            return
        Lc7:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20552.mo19165(java.lang.Long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m47106(l.AbstractC11422 r5, l.AbstractC11422 r6) {
        /*
            r4 = this;
            int r0 = r6.getErrorCode()
            r1 = 196610(0x30002, float:2.75509E-40)
            if (r0 != r1) goto L10
            r0 = -1073741225(0xffffffffc0000257, float:-2.0001428)
            r6.m28232(r0)
            goto L1b
        L10:
            int r0 = r6.getErrorCode()
            int r0 = l.C3037.m9290(r0)
            r6.m28232(r0)
        L1b:
            int r0 = r6.getErrorCode()
            if (r0 == 0) goto L80
            switch(r0) {
                case -2147483643: goto L6a;
                case -1073741802: goto L6a;
                case -1073741790: goto L6c;
                case -1073741718: goto L6c;
                case -1073741662: goto L61;
                case -1073741637: goto L5b;
                case -1073741428: goto L6c;
                case -1073741260: goto L6c;
                case -1073741225: goto L61;
                case 0: goto L80;
                default: goto L24;
            }
        L24:
            switch(r0) {
                case -1073741715: goto L6c;
                case -1073741714: goto L6c;
                case -1073741713: goto L6c;
                case -1073741712: goto L6c;
                case -1073741711: goto L6c;
                case -1073741710: goto L6c;
                default: goto L27;
            }
        L27:
            l.֫᩻֨ r0 = l.C20552.f66209
            boolean r1 = r0.mo7086()
            if (r1 == 0) goto L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error code: 0x"
            r1.<init>(r2)
            int r2 = r6.getErrorCode()
            r3 = 8
            java.lang.String r2 = l.C12085.m29467(r2, r3)
            r1.append(r2)
            java.lang.String r2 = " for "
            r1.append(r2)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.mo7088(r5)
            goto L76
        L5b:
            l.֡֨᩵ r5 = new l.֡֨᩵
            r5.<init>()
            throw r5
        L61:
            java.lang.String r0 = r5.getPath()
            r4.m47091(r6, r0, r5)
            r5 = 0
            throw r5
        L6a:
            r5 = 0
            goto L81
        L6c:
            l.᩹ۚ᩵ r5 = new l.᩹ۚ᩵
            int r6 = r6.getErrorCode()
            r5.<init>(r6)
            throw r5
        L76:
            l.ۗۚ᩵ r5 = new l.ۗۚ᩵
            int r6 = r6.getErrorCode()
            r5.<init>(r6)
            throw r5
        L80:
            r5 = 1
        L81:
            boolean r6 = r6.mo28214()
            if (r6 != 0) goto L88
            return r5
        L88:
            l.ۗۚ᩵ r5 = new l.ۗۚ᩵
            java.lang.String r6 = "Signature verification failed."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20552.m47106(l.ۨۖ᩵, l.ۨۖ᩵):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47091(InterfaceC1543 interfaceC1543, String str, InterfaceC16359 interfaceC16359) {
        InterfaceC18663 interfaceC18663 = this.f66212;
        interfaceC18663.mo27540().getClass();
        try {
            C8599 m47100 = m47100(this.f66212, str, interfaceC16359.mo6629(), interfaceC16359.mo6637(), 1);
            InterfaceC2148 interfaceC2148 = f66209;
            if (m47100 == null) {
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("Error code: 0x".concat(C12085.m29467(interfaceC1543.getErrorCode(), 8)));
                }
                throw new C3037(interfaceC1543.getErrorCode());
            }
            if (interfaceC16359.mo6637() != null) {
                interfaceC18663.mo27540().getClass();
            }
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Got referral " + m47100);
            }
            ((C13474) interfaceC18663.mo27541()).m32496(interfaceC18663, str, m47100);
            throw new C7125(m47100);
        } catch (C19369 e) {
            throw new C3037("Failed to get DFS referral", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47103(InterfaceC7578 interfaceC7578, AbstractC11422 abstractC11422) {
        m47111(interfaceC7578, abstractC11422, Collections.EMPTY_SET);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 m47111(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, Set set) {
        m47114();
        boolean z = this.f66215;
        if (z && !(interfaceC7578 instanceof AbstractC3429)) {
            throw new C3037("Not an SMB2 request ".concat(interfaceC7578.getClass().getName()));
        }
        if (!z && !(interfaceC7578 instanceof AbstractC11422)) {
            throw new C3037("Not an SMB1 request");
        }
        this.f66221.mo10543(interfaceC7578);
        if (interfaceC1543 != null) {
            interfaceC7578.mo28204(interfaceC1543);
            interfaceC1543.mo10436(interfaceC7578.getDigest());
        }
        try {
            InterfaceC2148 interfaceC2148 = f66209;
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101("Sending " + interfaceC7578);
            }
            interfaceC7578.getClass();
            if (interfaceC7578 instanceof AbstractC18246) {
                m47097(interfaceC7578, interfaceC1543, set);
            } else {
                if (interfaceC1543 != null) {
                    interfaceC1543.mo10459(interfaceC7578.mo10463());
                }
                interfaceC1543 = mo19163(interfaceC7578, interfaceC1543, set);
            }
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101("Response is " + interfaceC1543);
            }
            m47098(interfaceC7578);
            return interfaceC1543;
        } catch (C3037 e) {
            throw e;
        } catch (IOException e2) {
            throw new C3037(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[SYNTHETIC] */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m47098(l.InterfaceC7578 r6) {
        /*
            r5 = this;
        L0:
            r0 = 1
            if (r6 == 0) goto Lc9
            boolean r1 = r5.f66215
            r2 = 0
            if (r1 == 0) goto Lb3
            r1 = r6
            l.ۗᩴ᩵ r1 = (l.AbstractC3429) r1
            l.֫ۖ᩵ r3 = r6.mo5429()
            int r4 = r3.getErrorCode()
            switch(r4) {
                case -2147483643: goto L4a;
                case -2147483642: goto L65;
                case -1073741808: goto L44;
                case -1073741802: goto L64;
                case -1073741790: goto L3a;
                case -1073741718: goto L3a;
                case -1073741715: goto L3a;
                case -1073741714: goto L3a;
                case -1073741713: goto L3a;
                case -1073741712: goto L3a;
                case -1073741711: goto L3a;
                case -1073741710: goto L3a;
                case -1073741637: goto L44;
                case -1073741428: goto L3a;
                case -1073741260: goto L3a;
                case -1073741225: goto L17;
                case 0: goto L65;
                case 259: goto L64;
                case 267: goto L64;
                case 268: goto L64;
                default: goto L16;
            }
        L16:
            goto L76
        L17:
            boolean r6 = r1 instanceof l.InterfaceC16359
            if (r6 != 0) goto L2f
            l.ۗۚ᩵ r6 = new l.ۗۚ᩵
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Invalid request for a DFS NT_STATUS_PATH_NOT_COVERED response "
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
        L2f:
            l.ܽۖ᩵ r1 = (l.InterfaceC16359) r1
            java.lang.String r6 = r1.mo6641()
            r5.m47091(r3, r6, r1)
            r6 = 0
            throw r6
        L3a:
            l.᩹ۚ᩵ r6 = new l.᩹ۚ᩵
            int r0 = r3.getErrorCode()
            r6.<init>(r0)
            throw r6
        L44:
            l.֡֨᩵ r6 = new l.֡֨᩵
            r6.<init>()
            throw r6
        L4a:
            boolean r0 = r3 instanceof l.C9801
            if (r0 == 0) goto L4f
            goto L64
        L4f:
            boolean r0 = r3 instanceof l.C4156
            if (r0 == 0) goto L76
            r0 = r3
            l.ۘ᩵᩵ r0 = (l.C4156) r0
            int r0 = r0.m12559()
            r4 = 1163287(0x11c017, float:1.630112E-39)
            if (r0 == r4) goto L64
            r4 = 1130508(0x11400c, float:1.584179E-39)
            if (r0 != r4) goto L76
        L64:
            r0 = 0
        L65:
            boolean r1 = r3.mo28214()
            if (r1 != 0) goto L6e
            if (r0 != 0) goto Lc3
            goto Lc2
        L6e:
            l.۠ۚ᩵ r6 = new l.۠ۚ᩵
            java.lang.String r0 = "Signature verification failed."
            r6.<init>(r0)
            throw r6
        L76:
            l.֫᩻֨ r6 = l.C20552.f66209
            boolean r0 = r6.mo7086()
            if (r0 == 0) goto La9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Error code: 0x"
            r0.<init>(r2)
            int r2 = r3.getErrorCode()
            r4 = 8
            java.lang.String r2 = l.C12085.m29467(r2, r4)
            r0.append(r2)
            java.lang.String r2 = " for "
            r0.append(r2)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.mo7088(r0)
        La9:
            l.ۗۚ᩵ r6 = new l.ۗۚ᩵
            int r0 = r3.getErrorCode()
            r6.<init>(r0)
            throw r6
        Lb3:
            r0 = r6
            l.ۨۖ᩵ r0 = (l.AbstractC11422) r0
            l.֫ۖ᩵ r1 = r6.mo5429()
            l.ۨۖ᩵ r1 = (l.AbstractC11422) r1
            boolean r0 = r5.m47106(r0, r1)
            if (r0 != 0) goto Lc3
        Lc2:
            return r2
        Lc3:
            l.۟ܺ᩵ r6 = r6.mo20322()
            goto L0
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20552.m47098(l.۟ܺ᩵):boolean");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m47097(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, Set set) {
        long mo19177;
        interfaceC1543.mo10459(interfaceC7578.mo10463());
        AbstractC18246 abstractC18246 = (AbstractC18246) interfaceC7578;
        AbstractC17540 abstractC17540 = (AbstractC17540) interfaceC1543;
        abstractC17540.reset();
        try {
            try {
                abstractC18246.m42531(this.f66212.mo27542().m25072());
                abstractC18246.nextElement();
                if (abstractC18246.hasMoreElements()) {
                    AbstractC11422 c7188 = new C7188(this.f66212.mo27540());
                    mo19163((InterfaceC7578) abstractC18246, (InterfaceC1543) c7188, set);
                    if (c7188.getErrorCode() != 0) {
                        m47106((AbstractC11422) abstractC18246, c7188);
                    }
                    abstractC18246.nextElement();
                    mo19177 = abstractC18246.mo28210();
                } else {
                    mo19177 = mo19177(abstractC18246);
                }
                long j = mo19177;
                try {
                    abstractC17540.mo28216();
                    long mo19173 = mo19173((InterfaceC7578) abstractC18246);
                    if (set.contains(EnumC0214.NO_TIMEOUT)) {
                        abstractC17540.mo28203((Long) null);
                    } else {
                        abstractC17540.mo28203(Long.valueOf(System.currentTimeMillis() + mo19173));
                    }
                    abstractC17540.m41014(this.f66212.mo27542().m25072());
                    this.f21934.put(Long.valueOf(j), abstractC17540);
                    while (true) {
                        InterfaceC2148 interfaceC2148 = f66209;
                        try {
                            mo19166((InterfaceC7578) abstractC18246);
                            if (!abstractC18246.hasMoreElements()) {
                                break;
                            } else {
                                abstractC18246.nextElement();
                            }
                        } catch (IOException e) {
                            interfaceC2148.mo7083("send failed", (Throwable) e);
                            try {
                                m19178();
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                                interfaceC2148.mo7091("disconnect failed", (Throwable) e2);
                            }
                            throw e;
                        }
                    }
                    synchronized (abstractC17540) {
                        while (true) {
                            if (abstractC17540.mo28213() && !abstractC17540.hasMoreElements()) {
                            }
                            if (set.contains(EnumC0214.NO_TIMEOUT)) {
                                abstractC17540.wait();
                                InterfaceC2148 interfaceC21482 = f66209;
                                if (interfaceC21482.mo7099()) {
                                    interfaceC21482.mo7101("Wait returned " + mo19180());
                                }
                                if (mo19180()) {
                                    throw new EOFException("Transport closed while waiting for result");
                                }
                            } else {
                                abstractC17540.wait(mo19173);
                                mo19173 = abstractC17540.mo28225().longValue() - System.currentTimeMillis();
                                if (mo19173 <= 0) {
                                    throw new C1708(this + " timedout waiting for response to " + abstractC18246);
                                }
                            }
                        }
                    }
                    if (!abstractC17540.mo28213()) {
                        throw new C1708("Failed to read response");
                    }
                    if (abstractC17540.getErrorCode() != 0) {
                        m47106((AbstractC11422) abstractC18246, (AbstractC11422) abstractC17540);
                    }
                } finally {
                    this.f21934.remove(Long.valueOf(j));
                    this.f66212.mo27542().m25071(abstractC17540.m41016());
                }
            } catch (InterruptedException e3) {
                throw new C1708(e3);
            }
        } finally {
            this.f66212.mo27542().m25071(abstractC18246.m42532());
        }
    }

    @Override // l.AbstractRunnableC7146
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[");
        sb.append(this.f66225);
        sb.append(":");
        sb.append(this.f66222);
        sb.append(",state=");
        sb.append(this.f21933);
        sb.append(",signingEnforced=");
        sb.append(this.f66216);
        sb.append(",usage=");
        return C15942.m37718(sb, m19176(), "]");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8599 m47100(InterfaceC18663 interfaceC18663, String str, String str2, String str3, int i) {
        C2249 m15686;
        String str4 = str;
        int i2 = i;
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Resolving DFS path " + str4);
        }
        int i3 = 0;
        if (str.length() >= 2 && str4.charAt(0) == '\\' && str4.charAt(1) == '\\') {
            throw new C3037("Path must not start with double slash: ".concat(str4));
        }
        C23373 m47102 = m47102(interfaceC18663, str2, str3);
        try {
            C20552 m51804 = m47102.m51804();
            try {
                C19141 m51799 = m47102.m51799("IPC$");
                try {
                    C17040 c17040 = new C17040(str4);
                    if (m47112()) {
                        C2745 c2745 = new C2745(interfaceC18663.mo27540(), 393620);
                        c2745.m8490();
                        c2745.m8488(c17040);
                        m15686 = (C2249) ((C4156) m51799.m44197(c2745, new EnumC0214[0])).m12557(C2249.class);
                    } else {
                        C5546 c5546 = new C5546(interfaceC18663.mo27540());
                        m51799.m44196(new C0606(str4, interfaceC18663.mo27540()), c5546, Collections.EMPTY_SET);
                        m15686 = c5546.m15686();
                    }
                    C8599 c8599 = null;
                    if (m15686.m7452() == 0) {
                        m51799.m44194();
                        m51804.m19171();
                        m47102.m51813();
                        return null;
                    }
                    if (i2 == 0 || m15686.m7452() < i2) {
                        i2 = m15686.m7452();
                    }
                    long currentTimeMillis = System.currentTimeMillis() + (((C13722) interfaceC18663.mo27540()).m32998() * 1000);
                    C3660[] m7451 = m15686.m7451();
                    while (i3 < i2) {
                        C8599 m22328 = C8599.m22328(m7451[i3], str4, currentTimeMillis, m15686.m7453());
                        m22328.m22331(str3);
                        if ((m15686.m7454() & 2) == 0 && (m22328.m22342() & 2) == 0) {
                            interfaceC2148.mo7088("Non-root referral is not final " + m15686);
                            m22328.m22334();
                        }
                        if (c8599 != null) {
                            c8599.m22333(m22328);
                        }
                        i3++;
                        str4 = str;
                        c8599 = m22328;
                    }
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Got referral " + c8599);
                    }
                    m51799.m44194();
                    m51804.m19171();
                    m47102.m51813();
                    return c8599;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] m47116() {
        return this.f66219;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m47096(byte[] bArr) {
        synchronized (this.f66219) {
            this.f66219 = m47107(bArr.length, bArr, this.f66219);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m47107(int i, byte[] bArr, byte[] bArr2) {
        InterfaceC20594 interfaceC20594;
        if (!this.f66215 || (interfaceC20594 = this.f66221) == null) {
            throw new C0089();
        }
        C3450 c3450 = (C3450) interfaceC20594;
        if (!c3450.mo10552().m48659(EnumC21485.SMB311)) {
            throw new C0089();
        }
        if (c3450.m10546() == 1) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
                if (bArr2 != null) {
                    messageDigest.update(bArr2);
                }
                messageDigest.update(bArr, 0, i);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new C0317(e);
            }
        }
        throw new C0089();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47099(C3450 c3450) {
        if (this.f66216) {
            return 3;
        }
        return (c3450 == null || !c3450.mo10539()) ? 1 : 3;
    }
}
