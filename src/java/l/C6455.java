package l;

import bin.mt.plus.R;
import java.io.IOException;

/* compiled from: J57U */
/* renamed from: l.ۜ֫ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6455 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f19938;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2222 f19939;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18450 f19940;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16684 f19941;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18177 f19942;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16059 f19943;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6807 f19944;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C16765 f19945;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f19946;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19156 f19947;

    public C6455(ViewOnClickListenerC19156 viewOnClickListenerC19156, C18450 c18450, C18177 c18177, C16684 c16684, C2222 c2222, byte[] bArr, byte[] bArr2, C6807 c6807) {
        this.f19947 = viewOnClickListenerC19156;
        this.f19940 = c18450;
        this.f19942 = c18177;
        this.f19941 = c16684;
        this.f19939 = c2222;
        this.f19946 = bArr;
        this.f19938 = bArr2;
        this.f19944 = c6807;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        ViewOnClickListenerC5396 viewOnClickListenerC5396;
        C18450 c18450 = this.f19940;
        ViewOnClickListenerC19156 viewOnClickListenerC19156 = this.f19947;
        ViewOnClickListenerC19156.m44225(viewOnClickListenerC19156, c18450);
        this.f19945 = this.f19942.m42397();
        viewOnClickListenerC5396 = viewOnClickListenerC19156.f60359;
        m20269(viewOnClickListenerC5396, R.string.MT_Protector_res_0x7f1207a7, 200, new Runnable() { // from class: l.ܳ֫ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C6455.m17831(C6455.this);
            }
        });
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17831(C6455 c6455) {
        c6455.f23322.m31860((Runnable) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17830(C6455 c6455) {
        C13136 c13136 = c6455.f23322;
        if (c6455.f19940.mo1526()) {
            return true;
        }
        return c13136 != null && c13136.m31868();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [l.᩻֫ܳ] */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C18177 c18177 = this.f19942;
        C16684 c16684 = this.f19941;
        try {
            boolean m39218 = c16684.m39218();
            C2222 c2222 = this.f19939;
            if (!m39218) {
                c2222.f7276 = C8572.m22281();
            } else {
                try {
                    C16059 m39444 = this.f19945.m39444(new InterfaceC17066() { // from class: l.᩻֫ܳ
                        @Override // l.InterfaceC17066
                        /* renamed from: ᩻ */
                        public final boolean mo1526() {
                            return C6455.m17830(C6455.this);
                        }
                    });
                    this.f19943 = m39444;
                    c2222.f7276 = ViewOnClickListenerC19156.m44221(c18177, m39444, this.f19946, this.f19938, new InterfaceC17066() { // from class: l.᩻֫ܳ
                        @Override // l.InterfaceC17066
                        /* renamed from: ᩻ */
                        public final boolean mo1526() {
                            return C6455.m17830(C6455.this);
                        }
                    });
                    c2222.f7273 = c18177.m42385();
                } finally {
                    c16684.m39221();
                }
            }
        } finally {
            ViewOnClickListenerC19156.m44223(this.f19945);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C8572 c8572;
        boolean m44227;
        boolean z;
        this.f19941.m39219();
        C2222 c2222 = this.f19939;
        c8572 = c2222.f7276;
        m44227 = this.f19947.m44227(this.f19942);
        if (!m44227 || c8572 == null) {
            return;
        }
        long j = c8572.f26173;
        if (c8572.f26172) {
            return;
        }
        if (j == 0) {
            C13136 c13136 = this.f23322;
            if (this.f19940.mo1526()) {
                return;
            }
            if (c13136 == null || !c13136.m31868()) {
                C21374.m48457(R.string.MT_Protector_res_0x7f120228);
                return;
            }
            return;
        }
        z = c2222.f7272;
        if (z) {
            C21374.m48458(1, this.f19944.getContext().getString(R.string.MT_Protector_res_0x7f120897, Long.valueOf(j))).m48468();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (exc instanceof C23821) {
            return;
        }
        ViewOnClickListenerC19156.m44224(this.f19947, this.f19944, this.f19942, exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C16684 c16684 = this.f19941;
        c16684.m39221();
        c16684.m39219();
        ViewOnClickListenerC19156.m44223(this.f19945);
        C16059 c16059 = this.f19943;
        if (c16059 != null) {
            try {
                c16059.close();
            } catch (IOException unused) {
            }
        }
        m20273();
        c16684.close();
        ViewOnClickListenerC19156.m44230(this.f19947, this.f19940);
    }
}
