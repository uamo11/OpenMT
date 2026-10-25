package l;

import com.google.android.material.motion.MotionUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: B7ZY */
/* renamed from: l.ܺۡۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15826 extends AbstractC9478 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f48905;

    @Override // l.AbstractC9478
    /* renamed from: ֫ */
    public final boolean mo7854(C7381 c7381) {
        super.mo7854(c7381);
        this.f28798.m21457();
        this.f28797.m38234((byte) 5);
        C16261 c16261 = this.f28797;
        Charset charset = StandardCharsets.UTF_8;
        c16261.m38256("ssh-userauth".getBytes(charset));
        c7381.m19872(this.f28798);
        C20413 c20413 = c7381.f22696;
        c20413.m46777().getClass();
        C16261 c162612 = this.f28797;
        c7381.m19863(c162612);
        this.f28797 = c162612;
        boolean z = c162612.f50016[5] == 6;
        c20413.m46777().getClass();
        if (!z || !c7381.m19856("enable_auth_none").equals("yes")) {
            return false;
        }
        byte[] m44592 = C19356.m44592(this.f28800, charset);
        this.f28798.m21457();
        this.f28797.m38234((byte) 50);
        this.f28797.m38256(m44592);
        this.f28797.m38256("ssh-connection".getBytes(charset));
        this.f28797.m38256("none".getBytes(charset));
        c7381.m19872(this.f28798);
        while (true) {
            C16261 c162613 = this.f28797;
            c7381.m19863(c162613);
            this.f28797 = c162613;
            int i = c162613.f50016[5] & 255;
            if (i == 52) {
                return true;
            }
            if (i != 53) {
                if (i != 51) {
                    throw new C12651(C18307.m42645(i, "USERAUTH fail (", MotionUtils.EASING_TYPE_FORMAT_END));
                }
                c162613.m38250();
                this.f28797.m38233();
                this.f28797.m38233();
                byte[] m38257 = this.f28797.m38257();
                this.f28797.m38233();
                this.f48905 = new String(m38257, 0, m38257.length, StandardCharsets.UTF_8);
                return false;
            }
            c162613.m38250();
            this.f28797.m38233();
            this.f28797.m38233();
            byte[] m382572 = this.f28797.m38257();
            this.f28797.m38257();
            new String(m382572, 0, m382572.length, StandardCharsets.UTF_8);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m37457() {
        return this.f48905;
    }
}
