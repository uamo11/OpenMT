package l;

import java.net.InetAddress;
import java.util.Iterator;
import java.util.Random;

/* compiled from: C9Z9 */
/* renamed from: l.᩹᩷᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC22542 extends AbstractC13660 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f72927 = C11321.m27962(AbstractC22542.class.getName());

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f72928;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InetAddress f72929;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f72930;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f72931;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f72932;

    /* renamed from: ֫ */
    public abstract C15154 mo2714(C8806 c8806);

    /* renamed from: ֫ */
    public abstract C20095 mo2715(boolean z);

    /* renamed from: ֫ */
    public abstract void mo2717(C17603 c17603);

    /* renamed from: ۧ */
    public abstract boolean mo2718(C8806 c8806);

    /* renamed from: ܽ */
    public abstract boolean mo2719(C8806 c8806);

    /* renamed from: ܽ */
    public abstract boolean mo2720(AbstractC22542 abstractC22542);

    /* renamed from: ᩴ */
    public abstract boolean mo2721();

    public AbstractC22542(String str, EnumC11628 enumC11628, EnumC5983 enumC5983, boolean z, int i) {
        super(str, enumC11628, enumC5983, z);
        this.f72931 = i;
        this.f72928 = System.currentTimeMillis();
        int nextInt = new Random().nextInt(3);
        this.f72930 = nextInt;
        this.f72932 = nextInt + 80;
    }

    @Override // l.AbstractC13660
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC22542) && super.equals(obj) && mo2720((AbstractC22542) obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50539(C11254 c11254) {
        try {
            Iterator it = c11254.m42648().iterator();
            while (it.hasNext()) {
                AbstractC22542 abstractC22542 = (AbstractC22542) it.next();
                if (equals(abstractC22542) && abstractC22542.f72931 > this.f72931 / 2) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            f72927.mo7083("suppressedBy() message " + c11254 + " exception ", (Throwable) e);
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m50537(int i) {
        return (i * this.f72931 * 10) + this.f72928;
    }

    @Override // l.AbstractC13660
    /* renamed from: ֫ */
    public final boolean mo32824(long j) {
        return m50537(100) <= j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m50544(long j) {
        return m50537(50) <= j;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m50546(long j) {
        return m50537(this.f72932) <= j;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m50541() {
        int i = this.f72932 + 5;
        this.f72932 = i;
        if (i > 100) {
            this.f72932 = 100;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50543(AbstractC22542 abstractC22542) {
        this.f72928 = abstractC22542.f72928;
        this.f72931 = abstractC22542.f72931;
        this.f72932 = this.f72930 + 80;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m50547(long j) {
        this.f72928 = j;
        this.f72931 = 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50538(InetAddress inetAddress) {
        this.f72929 = inetAddress;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InetAddress m50545() {
        return this.f72929;
    }

    @Override // l.AbstractC13660
    /* renamed from: ֫ */
    public void mo2716(StringBuilder sb) {
        int max = (int) Math.max(0L, (m50537(100) - System.currentTimeMillis()) / 1000);
        sb.append(" ttl: '");
        sb.append(max);
        sb.append('/');
        sb.append(this.f72931);
        sb.append('\'');
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m50540() {
        return this.f72931;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m50542() {
        return this.f72928;
    }
}
