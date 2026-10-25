package l;

import android.media.AudioTrack;

/* compiled from: 68UW */
/* renamed from: l.ۚۤ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5284 extends AudioTrack.StreamEventCallback {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1050 f16520;

    public C5284(C1050 c1050) {
        this.f16520 = c1050;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        InterfaceC21573 interfaceC21573;
        boolean z;
        InterfaceC21573 interfaceC215732;
        audioTrack2 = this.f16520.f3883.f25016;
        if (audioTrack.equals(audioTrack2)) {
            interfaceC21573 = this.f16520.f3883.f24996;
            if (interfaceC21573 != null) {
                z = this.f16520.f3883.f25002;
                if (z) {
                    interfaceC215732 = this.f16520.f3883.f24996;
                    interfaceC215732.mo46355();
                }
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.f16520.f3883.f25016;
        if (audioTrack.equals(audioTrack2)) {
            this.f16520.f3883.f25024 = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        InterfaceC21573 interfaceC21573;
        boolean z;
        InterfaceC21573 interfaceC215732;
        audioTrack2 = this.f16520.f3883.f25016;
        if (audioTrack.equals(audioTrack2)) {
            interfaceC21573 = this.f16520.f3883.f24996;
            if (interfaceC21573 != null) {
                z = this.f16520.f3883.f25002;
                if (z) {
                    interfaceC215732 = this.f16520.f3883.f24996;
                    interfaceC215732.mo46355();
                }
            }
        }
    }
}
