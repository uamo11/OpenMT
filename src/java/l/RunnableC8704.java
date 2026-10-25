package l;

/* compiled from: A6XJ */
/* renamed from: l.ۡۛ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8704 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26496;

    public /* synthetic */ RunnableC8704(int i) {
        this.f26496 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26496) {
            case 0:
                int i = ServiceC19288.f60689;
                try {
                    C20586.m47136();
                    break;
                } catch (C9297 e) {
                    C19926.m45879("MT MCP radare2 prewarm failed", e);
                    return;
                }
            default:
                C4715.m13814();
                break;
        }
    }
}
