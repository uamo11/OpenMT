package l;

import com.tencent.connect.common.AssistActivity;

/* compiled from: 51RR */
/* renamed from: l.ܿܶۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC17422 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f53282;

    public RunnableC17422(AssistActivity assistActivity) {
        this.f53282 = assistActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AssistActivity assistActivity = this.f53282;
        str = assistActivity.f892;
        C9145.m23518(str, "onActivityResult finish delay");
        assistActivity.finish();
    }
}
