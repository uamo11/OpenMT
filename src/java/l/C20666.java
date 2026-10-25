package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: L73O */
/* renamed from: l.᩷ۚۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20666 implements InterfaceC21449 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f66551;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f66552;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3104 f66554;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9377 f66556;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66555 = new ArrayList();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f66553 = -1;

    public C20666(C9377 c9377) {
        this.f66556 = c9377;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        ArrayList arrayList = this.f66555;
        if (arrayList.contains(interfaceC0486)) {
            return;
        }
        arrayList.add(interfaceC0486);
        InterfaceC21449 interfaceC21449 = this.f66552;
        if (interfaceC21449 != null) {
            interfaceC21449.mo5937(interfaceC0486);
        }
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        C14895 c14895;
        C14895 c148952;
        if (this.f66552 != null) {
            throw new IOException("Data source is already open");
        }
        C9377 c9377 = this.f66556;
        c14895 = c9377.f28479;
        long m35345 = c14895.m35345();
        InterfaceC21449 mo6247 = (m35345 >= 0 ? c9377.f28480 : c9377.f28481).mo6247();
        this.f66552 = mo6247;
        this.f66554 = c3104;
        this.f66551 = 0L;
        this.f66553 = m35345;
        Iterator it = this.f66555.iterator();
        while (it.hasNext()) {
            mo6247.mo5937((InterfaceC0486) it.next());
        }
        long mo1620 = mo6247.mo1620(c3104);
        if (m35345 >= 0) {
            c148952 = c9377.f28479;
            if (!c148952.m35344(m35345)) {
                return m47283();
            }
        }
        return mo1620;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        C14895 c14895;
        if (i2 == 0) {
            return 0;
        }
        InterfaceC21449 interfaceC21449 = this.f66552;
        if (interfaceC21449 == null) {
            throw new IOException("Data source is not open");
        }
        if (this.f66553 >= 0) {
            c14895 = this.f66556.f28479;
            if (!c14895.m35344(this.f66553)) {
                C3104 c3104 = this.f66554;
                if (c3104 != null) {
                    long j = c3104.f9713;
                    if (j != -1 && this.f66551 >= j) {
                        return -1;
                    }
                }
                m47283();
                interfaceC21449 = this.f66552;
            }
        }
        int read = interfaceC21449.read(bArr, i, i2);
        if (read > 0) {
            this.f66551 += read;
        }
        return read;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m47283() {
        InterfaceC15097 interfaceC15097;
        C3104 c3104 = this.f66554;
        if (c3104 == null) {
            throw new IOException("HLS media data spec is missing");
        }
        InterfaceC21449 interfaceC21449 = this.f66552;
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } catch (IOException | RuntimeException unused) {
            }
        }
        interfaceC15097 = this.f66556.f28481;
        InterfaceC21449 mo6247 = interfaceC15097.mo6247();
        this.f66552 = mo6247;
        this.f66553 = -1L;
        Iterator it = this.f66555.iterator();
        while (it.hasNext()) {
            mo6247.mo5937((InterfaceC0486) it.next());
        }
        long j = this.f66551;
        long j2 = c3104.f9713;
        return mo6247.mo1620(c3104.m9466(j, j2 != -1 ? j2 - j : -1L));
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ */
    public final Uri mo1621() {
        InterfaceC21449 interfaceC21449 = this.f66552;
        if (interfaceC21449 == null) {
            return null;
        }
        return interfaceC21449.mo1621();
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final Map mo5936() {
        InterfaceC21449 interfaceC21449 = this.f66552;
        return interfaceC21449 == null ? Collections.EMPTY_MAP : interfaceC21449.mo5936();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC21449
    public final void close() {
        InterfaceC21449 interfaceC21449 = this.f66552;
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } finally {
                this.f66552 = null;
                this.f66554 = null;
                this.f66551 = 0L;
                this.f66553 = -1L;
            }
        }
    }
}
