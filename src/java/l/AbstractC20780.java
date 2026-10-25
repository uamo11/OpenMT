package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: T9Y2 */
/* renamed from: l.᩷ۡ᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC20780 extends AbstractC1729 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f67294 = C11321.m27962(AbstractC20780.class.getName());

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f67295 = C13038.f39042;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f67296;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC7394 f67297;

    /* renamed from: ֫ */
    public abstract C14780 mo18196(C14780 c14780);

    /* renamed from: ֫ */
    public abstract C14780 mo18197(C20095 c20095, C14780 c14780);

    /* renamed from: ܽ */
    public abstract void mo18198();

    /* renamed from: ܿ */
    public abstract C14780 mo18199();

    /* renamed from: ᩳ */
    public abstract boolean mo18200();

    /* renamed from: ᩷ */
    public abstract void mo18201();

    /* renamed from: ᩻ */
    public abstract String mo18202();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int m47575() {
        return f67295;
    }

    public AbstractC20780(C8806 c8806, int i) {
        super(c8806);
        this.f67297 = null;
        this.f67296 = i;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m47581() {
        return this.f67296;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47577(EnumC7394 enumC7394) {
        synchronized (m5776()) {
            m5776().m22734(this, enumC7394);
        }
        Iterator it = ((ConcurrentMapC10942) m5776().m22751()).values().iterator();
        while (it.hasNext()) {
            ((C20095) ((AbstractC10134) it.next())).m46328(this, enumC7394);
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m47579() {
        synchronized (m5776()) {
            m5776().m22733(this);
        }
        Iterator it = ((ConcurrentMapC10942) m5776().m22751()).values().iterator();
        while (it.hasNext()) {
            ((C20095) ((AbstractC10134) it.next())).m46327(this);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C14780 mo18199 = mo18199();
        try {
        } catch (Throwable th) {
            f67294.mo7083(mo5781() + ".run() exception ", th);
            mo18201();
        }
        if (!mo18200()) {
            cancel();
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (m5776()) {
            if (m5776().m22749(this, this.f67297)) {
                f67294.mo7092("{}.run() JmDNS {} {}", mo5781(), mo18202(), m5776().getName());
                arrayList.add(m5776());
                mo18199 = mo18196(mo18199);
            }
        }
        Iterator it = ((ConcurrentMapC10942) m5776().m22751()).values().iterator();
        while (it.hasNext()) {
            C20095 c20095 = (C20095) ((AbstractC10134) it.next());
            synchronized (c20095) {
                if (c20095.m46336(this, this.f67297)) {
                    f67294.mo7092("{}.run() JmDNS {} {}", mo5781(), mo18202(), c20095.mo25450());
                    arrayList.add(c20095);
                    mo18199 = mo18197(c20095, mo18199);
                }
            }
        }
        if (!mo18199.m42651()) {
            f67294.mo7092("{}.run() JmDNS {} #{}", mo5781(), mo18202(), this.f67297);
            m5776().m22728(mo18199);
            m47576(arrayList);
            mo18198();
            return;
        }
        m47576(arrayList);
        cancel();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47576(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC3492 interfaceC3492 = (InterfaceC3492) it.next();
            synchronized (interfaceC3492) {
                interfaceC3492.mo10674(this);
            }
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC7394 m47578() {
        return this.f67297;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47580(EnumC7394 enumC7394) {
        this.f67297 = enumC7394;
    }
}
