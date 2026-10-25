package l;

import android.graphics.Typeface;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Features;
import bin.mt.plus.R;

/* compiled from: 77HY */
/* renamed from: l.᩵ۨܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19445 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44784(C12598 c12598) {
        String m27180;
        String m56;
        String m562;
        String str;
        AbstractC15440 m30863 = c12598.m30863();
        String str2 = "unknown";
        if (m30863 instanceof C12993) {
            if (C9255.m23770()) {
                try {
                    C17642 m46724 = C20402.m46724(m30863.mo23554());
                    m27180 = C10881.m27180(m46724.m41289());
                    try {
                        m56 = Features.m56(m46724.m41283());
                        try {
                            m562 = Features.m56(m46724.m41281());
                            str2 = m562;
                        } catch (ErrnoException | Exception unused) {
                        }
                    } catch (ErrnoException | Exception unused2) {
                        m56 = "unknown";
                    }
                } catch (ErrnoException | Exception unused3) {
                    m27180 = "unknown";
                    m56 = m27180;
                }
                str = str2;
                str2 = m27180;
            }
            str = "unknown";
            m56 = str;
        } else {
            if (m30863 instanceof C11893) {
                StructStat lstat = Os.lstat(((C11893) m30863).m29018());
                m27180 = C10881.m27180(lstat.st_mode);
                m56 = Features.m56(lstat.st_uid);
                m562 = Features.m56(lstat.st_gid);
                str2 = m562;
                str = str2;
                str2 = m27180;
            }
            str = "unknown";
            m56 = str;
        }
        StringBuilder sb = new StringBuilder("AndroidDataFileUnreadableException///");
        sb.append(m30863.mo23554());
        sb.append("///");
        sb.append(str2);
        sb.append("///");
        return C23202.m51498(sb, m56, "///", str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44785(AbstractActivityC3346 abstractActivityC3346, String str) {
        String[] split = str.split("///");
        if (split.length == 5) {
            m44786(abstractActivityC3346, split[1], split[2], split[3], split[4]);
        } else {
            abstractActivityC3346.m10221(str, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44786(AbstractActivityC3346 abstractActivityC3346, String str, String str2, String str3, String str4) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d0071);
        int indexOf = str.indexOf("Android");
        if (indexOf != -1) {
            str = str.substring(indexOf);
        }
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a01e0);
        TextView textView2 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a01e2);
        TextView textView3 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0434);
        TextView textView4 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a041d);
        TextView textView5 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0232);
        ViewOnClickListenerC14813.m35216(textView, C9523.m24404(str));
        ViewOnClickListenerC14813.m35216(textView2, C9523.m24406(str));
        ViewOnClickListenerC14813.m35216(textView3, str2);
        ViewOnClickListenerC14813.m35216(textView4, str3);
        ViewOnClickListenerC14813.m35216(textView5, str4);
        if ("unknown".equals(str2)) {
            textView3.setTypeface(Typeface.DEFAULT);
        }
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a053d).setOnClickListener(new ViewOnClickListenerC20259(3, abstractActivityC3346));
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44438();
    }
}
