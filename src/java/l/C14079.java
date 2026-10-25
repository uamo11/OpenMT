package l;

import java.util.HashMap;
import java.util.Queue;

/* compiled from: T57T */
/* renamed from: l.ܰ᩸֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14079 implements InterfaceC16923 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f42529 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4224 f42530;

    public C14079(C4224 c4224) {
        this.f42530 = c4224;
    }

    @Override // l.InterfaceC16923
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo33691(C9869 c9869) {
        ((Queue) C13843.computeIfAbsent(this.f42529, c9869.f29845.f6079.f17186.mo955(), new C7680(8))).add(c9869);
    }

    @Override // l.InterfaceC16923
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo33690(C1755 c1755) {
        HashMap hashMap = this.f42529;
        if (hashMap.isEmpty()) {
            return;
        }
        C4224 c4224 = this.f42530;
        InterfaceC16923 interfaceC16923 = c4224.f13711;
        try {
            c4224.f13711 = c4224.f13710;
            Queue queue = (Queue) hashMap.get(c1755.f6079.f17186.mo955());
            while (queue != null) {
                if (queue.isEmpty()) {
                    break;
                } else {
                    c4224.m12722((C9869) queue.remove());
                }
            }
        } finally {
            c4224.f13711 = interfaceC16923;
        }
    }
}
