package l;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SB7W */
/* renamed from: l.ۖ֡ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC2181 extends AbstractC19261 implements InterfaceC3738 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f7179 = new ArrayList();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f7180;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Boolean f7181;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC3592 f7182;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Matrix f7183;

    @Override // l.InterfaceC3738
    public final List getChildren() {
        return this.f7179;
    }

    @Override // l.InterfaceC3738
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7197(C5149 c5149) {
        if (c5149 instanceof C13469) {
            this.f7179.add(c5149);
            return;
        }
        throw new C19136("Gradient elements cannot contain " + c5149 + " elements.");
    }
}
