package l;

import android.content.Intent;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: F1PL */
/* renamed from: l.ۡܺۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ServiceC8982 extends AbstractServiceC11215 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C17209 f27295;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C18955 f27297 = new C18955();

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C18955 f27299 = new C18955();

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C18955 f27296 = new C18955();

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static HashMap f27298 = new HashMap();

    static {
        C17915 m21306 = C7987.m21306();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        m21306.m41904(1L, timeUnit);
        m21306.m41906(1L, timeUnit);
        m21306.m41896(1L, timeUnit);
        m21306.m41898(new C15041());
        m21306.m41903(new C5860());
        f27295 = m21306.m41894();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23216(C16742 c16742) {
        if (f27298.containsKey(c16742.f51390) || f27299.contains(c16742.f51390)) {
            return false;
        }
        f27297.add(c16742.f51390);
        Intent intent = new Intent();
        intent.putExtra("task", new C9688(c16742));
        AbstractServiceC11215.m27783(C4925.m14335(), intent);
        return true;
    }

    @Override // l.AbstractServiceC11215
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23218(Intent intent) {
        String str;
        C9688 c9688 = (C9688) intent.getParcelableExtra("task");
        C11003.requireNonNull(c9688);
        String str2 = c9688.f29296;
        f27297.remove(str2);
        C18955 c18955 = f27296;
        c18955.remove(str2);
        HashMap hashMap = f27298;
        if (hashMap.containsKey(str2)) {
            return;
        }
        AbstractC15440 m36526 = C17448.m40800().m36526(str2);
        AbstractC15440 m365262 = m36526.m36526("packageUpload");
        AbstractC15440 m365263 = m36526.m36526("key");
        if (m365262.mo23120()) {
            final C6865 c6865 = new C6865(str2);
            hashMap.put(str2, c6865);
            try {
                m36526.m36526(d.O).mo23552();
                if (m365263.mo23120()) {
                    str = m365263.m36489();
                    c6865.m18551(100);
                } else {
                    String[] m6341 = C1926.m6341(m365262, c9688.f29297);
                    C19277 c19277 = new C19277(m365262.mo23127());
                    c19277.m44459(new InterfaceC2343() { // from class: l.ܳܺۢ
                        @Override // l.InterfaceC2343
                        /* renamed from: ֫ */
                        public final void mo6264(int i) {
                            C6865.this.m18551(i);
                        }
                    });
                    C23798 c23798 = new C23798();
                    c23798.f77007 = str2;
                    c23798.f77005 = m365262;
                    c23798.f77006 = c19277;
                    C9449 c9449 = new C9449();
                    c9449.m24282(m6341[0]);
                    c9449.m24277("PUT", c23798);
                    c9449.m24283("Content-Md5", m6341[2]);
                    InterfaceC16687 m40469 = f27295.m40469(c9449.m24274());
                    c23798.f77004 = m40469;
                    C18621 execute = m40469.execute();
                    if (m40469.mo39223()) {
                        return;
                    }
                    if (!execute.m43173()) {
                        throw new IOException("Unexpected response code " + execute);
                    }
                    str = m6341[1];
                    m365263.m36510(str);
                }
                if (c18955.contains(str2)) {
                    return;
                }
                int m6338 = C1926.m6338(str, c9688);
                m365262.mo23552();
                m365263.mo23552();
                f27299.add(str2);
                Intent intent2 = new Intent("bin.mt.protect.ProtectUploadService.ACTION_SUCCESS");
                intent2.putExtra("taskID", str2);
                intent2.putExtra("id", m6338);
                C4925.m14312(intent2);
            } catch (Exception e) {
                Intent intent3 = new Intent("bin.mt.protect.ProtectUploadService.ACTION_FAIL");
                intent3.putExtra("taskID", str2);
                if ((e instanceof C1637) || (e instanceof C19401)) {
                    intent3.putExtra("message", e.getMessage());
                }
                C4925.m14312(intent3);
            } finally {
                hashMap.remove(str2);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m23217(String str) {
        return f27298.containsKey(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23215(String str) {
        int i;
        C6865 c6865 = (C6865) f27298.get(str);
        if (c6865 == null) {
            return f27297.contains(str) ? 0 : 100;
        }
        i = c6865.f21221;
        return i;
    }
}
