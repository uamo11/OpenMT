package l;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: T8RT */
/* renamed from: l.ۛ֫ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5749 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC15097 f17680;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20419 f17681;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC11058 f17683;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C10045 f17686;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f17684 = new HashMap();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f17685 = new HashMap();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f17682 = true;

    public C5749(InterfaceC20419 interfaceC20419, C10045 c10045) {
        this.f17681 = interfaceC20419;
        this.f17686 = c10045;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8840 m16173(int i) {
        InterfaceC6141 interfaceC6141;
        InterfaceC6141 interfaceC61412;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f17685;
        InterfaceC8840 interfaceC8840 = (InterfaceC8840) hashMap.get(valueOf);
        if (interfaceC8840 != null) {
            return interfaceC8840;
        }
        Integer valueOf2 = Integer.valueOf(i);
        HashMap hashMap2 = this.f17684;
        InterfaceC6141 interfaceC61413 = (InterfaceC6141) hashMap2.get(valueOf2);
        if (interfaceC61413 == null) {
            final InterfaceC15097 interfaceC15097 = this.f17680;
            interfaceC15097.getClass();
            if (i == 0) {
                final Class<? extends U> asSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC8840.class);
                interfaceC6141 = new InterfaceC6141() { // from class: l.ۙ֫ۧ
                    @Override // l.InterfaceC6141
                    public final Object get() {
                        return C22682.m50666(asSubclass, interfaceC15097);
                    }
                };
            } else if (i == 1) {
                final Class<? extends U> asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC8840.class);
                interfaceC6141 = new InterfaceC6141() { // from class: l.ۗ֫ۧ
                    @Override // l.InterfaceC6141
                    public final Object get() {
                        return C22682.m50666(asSubclass2, interfaceC15097);
                    }
                };
            } else if (i != 2) {
                if (i == 3) {
                    final Class<? extends U> asSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC8840.class);
                    interfaceC61412 = new InterfaceC6141() { // from class: l.۫֫ۧ
                        @Override // l.InterfaceC6141
                        public final Object get() {
                            try {
                                return (InterfaceC8840) asSubclass3.getConstructor(null).newInstance(null);
                            } catch (Exception e) {
                                throw new IllegalStateException(e);
                            }
                        }
                    };
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException(C19370.m44628(i, "Unrecognized contentType: "));
                    }
                    interfaceC61412 = new InterfaceC6141() { // from class: l.ۤ֫ۧ
                        @Override // l.InterfaceC6141
                        public final Object get() {
                            return C5749.m16172(C5749.this, interfaceC15097);
                        }
                    };
                }
                interfaceC61413 = interfaceC61412;
                hashMap2.put(Integer.valueOf(i), interfaceC61413);
            } else {
                final Class asSubclass4 = C10264.class.asSubclass(InterfaceC8840.class);
                interfaceC6141 = new InterfaceC6141() { // from class: l.۬֫ۧ
                    @Override // l.InterfaceC6141
                    public final Object get() {
                        return C22682.m50666(asSubclass4, interfaceC15097);
                    }
                };
            }
            interfaceC61413 = interfaceC6141;
            hashMap2.put(Integer.valueOf(i), interfaceC61413);
        }
        InterfaceC8840 interfaceC88402 = (InterfaceC8840) interfaceC61413.get();
        InterfaceC11058 interfaceC11058 = this.f17683;
        if (interfaceC11058 != null) {
            interfaceC88402.mo22839(interfaceC11058);
        }
        interfaceC88402.mo22838(this.f17686);
        interfaceC88402.mo22840(this.f17682);
        interfaceC88402.mo22837();
        hashMap.put(Integer.valueOf(i), interfaceC88402);
        return interfaceC88402;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16177(InterfaceC15097 interfaceC15097) {
        if (interfaceC15097 != this.f17680) {
            this.f17680 = interfaceC15097;
            this.f17684.clear();
            this.f17685.clear();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16178(boolean z) {
        this.f17682 = z;
        this.f17681.mo18050(z);
        Iterator it = this.f17685.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC8840) it.next()).mo22840(z);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16175(C10045 c10045) {
        this.f17686 = c10045;
        this.f17681.mo18049(c10045);
        Iterator it = this.f17685.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC8840) it.next()).mo22838(c10045);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16174() {
        this.f17681.mo18048();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16176(InterfaceC11058 interfaceC11058) {
        this.f17683 = interfaceC11058;
        Iterator it = this.f17685.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC8840) it.next()).mo22839(interfaceC11058);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16179() {
        InterfaceC20419 interfaceC20419 = this.f17681;
        if (interfaceC20419 instanceof C19008) {
            ((C19008) interfaceC20419).m43850();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C14647 m16172(C5749 c5749, InterfaceC15097 interfaceC15097) {
        return new C14647(interfaceC15097, c5749.f17681);
    }
}
