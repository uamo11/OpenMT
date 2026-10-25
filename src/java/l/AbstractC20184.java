package l;

import java.util.Map;

/* compiled from: A8XS */
/* renamed from: l.᩶۬ۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC20184 implements InterfaceC15243 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map f65319;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f65320 = -1;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f65321;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f65322;

    public AbstractC20184(Map map, int i, String str) {
        this.f65321 = str;
        this.f65322 = i;
        this.f65319 = map;
    }

    @Override // l.InterfaceC15243
    public final String name() {
        return this.f65321;
    }

    @Override // l.InterfaceC15243
    public final int start() {
        return this.f65322;
    }

    @Override // l.InterfaceC15243
    public final int end() {
        return this.f65320;
    }

    @Override // l.InterfaceC15243
    public Map attributes() {
        return this.f65319;
    }

    @Override // l.InterfaceC15243
    public final boolean isClosed() {
        return this.f65320 > -1;
    }
}
