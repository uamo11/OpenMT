package l;

import android.net.Uri;
import java.io.IOException;

/* compiled from: 474R */
/* renamed from: l.ܺ۠ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15807 implements AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21453 f48765;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12053 f48766;

    public C15807(C21453 c21453, C12053 c12053) {
        this.f48765 = c21453;
        this.f48766 = c12053;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15807 m37444(C23713 c23713, final Uri uri, InterfaceC15097 interfaceC15097, C0991 c0991) {
        C21453 c21453;
        final String m48603;
        boolean z;
        try {
            c21453 = C3108.m9475(c23713, uri, interfaceC15097, null);
        } catch (IOException | RuntimeException unused) {
            c21453 = null;
        }
        try {
            m48603 = c21453.m48603();
        } catch (IOException | RuntimeException unused2) {
            if (c21453 != null) {
                c21453.close();
            }
            return null;
        }
        if (m48603 == null) {
            c21453.close();
            return null;
        }
        long m48604 = c21453.m48604();
        C16197 m52288 = c23713.m52288();
        if (m48604 <= 0 && m52288 != null) {
            m48604 = C13325.m32306(m52288.mo38139(m48603));
        }
        boolean z2 = m48604 > 0 && m52288 != null && m52288.m38148(m48603, 0L, m48604);
        Boolean m48605 = c21453.m48605();
        if (m48604 <= 0) {
            C0285 m3463 = c0991.m3463(uri, interfaceC15097);
            m48604 = m3463.m1626();
            z2 = m48604 > 0 && m52288 != null && m52288.m38148(m48603, 0L, m48604);
            z = m3463.m1627();
        } else if (z2) {
            z = true;
        } else if (m48605 != null) {
            z = m48605.booleanValue();
        } else {
            try {
                z = c0991.m3463(uri, interfaceC15097).m1627();
            } catch (IOException unused3) {
                z = false;
            }
        }
        final long j = m48604;
        if (!z2 && !z) {
            c21453.close();
        } else {
            if (j > 0 && j != -1) {
                final C17075 c17075 = new C17075(c23713, new C9315(c23713, interfaceC15097, new C7037(m48603)), m48603, z && !z2);
                return new C15807(c21453, C12053.m29427(m48603, new InterfaceC5703() { // from class: l.ۡ۠ۜ
                    @Override // l.InterfaceC5703
                    /* renamed from: ֫ */
                    public final InterfaceC7505 mo16113() {
                        return new C4871(C17075.this, uri, m48603, j);
                    }
                }, C12053.m29430(uri.getPath())));
            }
            c21453.close();
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12053 m37445() {
        return this.f48766;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f48765.close();
    }
}
