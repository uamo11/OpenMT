package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: 31PG */
/* renamed from: l.ۡۡۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8777 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f26744;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16742 f26745;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f26746;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f26747;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f26748;

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 m36526;
        C8777 c8777 = this;
        AbstractC15440 m40800 = C17448.m40800();
        SecureRandom secureRandom = new SecureRandom();
        while (true) {
            long currentTimeMillis = System.currentTimeMillis();
            m36526 = m40800.m36526(String.format("%08x%04x", Integer.valueOf((int) (currentTimeMillis ^ (currentTimeMillis >>> 32))), Integer.valueOf(secureRandom.nextInt() & 65535)));
            if (!m36526.mo23120()) {
                break;
            } else {
                c8777 = this;
            }
        }
        m36526.m36508();
        String name = m36526.getName();
        C16742 c16742 = c8777.f26745;
        c16742.f51390 = name;
        c8777.f26748 = m36526;
        C22933 c22933 = c8777.f26746;
        C11003.requireNonNull(c22933);
        C23595 c23595 = new C23595(c22933);
        C22933 c229332 = c8777.f26746;
        C11003.requireNonNull(c229332);
        AbstractC15440 m40799 = C17448.m40799(c16742);
        AbstractC15440 m365262 = m40799.m36526("packageUpload");
        AbstractC15440 m365263 = m40799.m36526("packageLocal");
        AbstractC15440 m365264 = m40799.m36526("temp");
        String str = c8777.f26747;
        C4611 c4611 = new C4611(C16999.m39866(str, new String[0]), false);
        if (c16742.f51396.f33315 && !c4611.m13537()) {
            throw new C1637(R.string.MT_Protector_res_0x7f120092);
        }
        C18090 c18090 = new C18090(str);
        try {
            C8918 c8918 = new C8918(m365264);
            try {
                C8918 c89182 = new C8918(m365263);
                try {
                    c8918.m23018(0);
                    HashSet hashSet = new HashSet();
                    C3545 entry = c18090.getEntry(C16458.m38762(1));
                    int i = 2;
                    while (true) {
                        hashSet.add(entry.getName());
                        c8918.m23013(entry);
                        C22194.m49852(c18090.m42189(entry), c8918.m23007());
                        int i2 = i + 1;
                        C3545 entry2 = c18090.getEntry(C16458.m38762(i));
                        if (entry2 == null) {
                            break;
                        }
                        i = i2;
                        entry = entry2;
                    }
                    C3545 entry3 = c18090.getEntry("AndroidManifest.xml");
                    hashSet.add(entry3.getName());
                    c8918.m23013(entry3);
                    C22194.m49852(c18090.m42189(entry3), c8918.m23007());
                    byte[] m13528 = c4611.m13528();
                    if (m13528 != null) {
                        c8918.m23012("_mt_protector/signature");
                        c8918.write(m13528);
                    }
                    C22203 m49881 = C22203.m49881(c16742.f51396.f33312);
                    if (!m49881.f72040.isEmpty()) {
                        c8918.m23012("_mt_protector/mapping");
                        c8918.write(m49881.toString().getBytes(Charset.defaultCharset()));
                    }
                    for (C3545 c3545 : c18090.m42210()) {
                        if (!c3545.isDirectory()) {
                            String name2 = c3545.getName();
                            if (name2.startsWith("META-INF/")) {
                                String lowerCase = name2.substring(9).toLowerCase(Locale.US);
                                if (!"manifest.mf".equals(lowerCase)) {
                                    if (!lowerCase.endsWith(".sf")) {
                                        if (!lowerCase.endsWith(".rsa")) {
                                            if (!lowerCase.endsWith(".dsa")) {
                                                if (!lowerCase.endsWith(".ec")) {
                                                    if (lowerCase.startsWith("sig-")) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!hashSet.contains(name2)) {
                                c89182.m23014(c3545, c18090);
                            }
                        }
                    }
                    c89182.close();
                    c8918.close();
                    c18090.close();
                    if (c229332.m51053()) {
                        return;
                    }
                    C19277 c19277 = new C19277(m365264.mo23127());
                    c19277.m44459(c23595);
                    OutputStream m3766 = C1096.m3766(m365262.mo23555(false), 2);
                    try {
                        InputStream mo27926 = m365264.mo27926();
                        try {
                            byte[] bArr = new byte[1048576];
                            do {
                                int m49844 = C22194.m49844(mo27926, bArr, 1048576);
                                if (m49844 > 0) {
                                    m3766.write(bArr, 0, m49844);
                                    if (m49844 < 1048576) {
                                        m3766.flush();
                                    }
                                    c19277.m44460(m49844);
                                } else {
                                    if (mo27926 != null) {
                                        mo27926.close();
                                    }
                                    m3766.close();
                                    m365264.mo23552();
                                    String m47627 = C20812.m47627(m365263, "MD5");
                                    c16742.f51387 = m47627;
                                    if (m47627 != null) {
                                        C10130 c10130 = new C10130();
                                        c10130.m25439(c16742.f51390);
                                        c10130.m25439(c16742.f51391);
                                        c10130.m25439(c16742.f51395);
                                        c10130.m25439(c16742.f51393);
                                        c10130.m25439(c16742.f51397);
                                        c10130.m25439(c16742.f51387);
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        c16742.f51394.compress(Bitmap.CompressFormat.PNG, 80, byteArrayOutputStream);
                                        c10130.m25434(byteArrayOutputStream.toByteArray());
                                        c10130.m25431(c16742.f51389);
                                        c10130.m25439(c16742.f51396.m27532());
                                        byte[] m25428 = c10130.m25428();
                                        int length = m25428.length;
                                        for (int i3 = 0; i3 < length; i3++) {
                                            m25428[i3] = (byte) (m25428[i3] ^ (i3 ^ length));
                                        }
                                        m40799.m36526("info").m36503(m25428, 0, m25428.length);
                                        return;
                                    }
                                    throw new Exception("Get md5 fail");
                                }
                            } while (!c229332.m51053());
                            if (mo27926 != null) {
                                mo27926.close();
                            }
                            m3766.close();
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public C8777(ActivityC7365 activityC7365, C16742 c16742, String str) {
        this.f26744 = activityC7365;
        this.f26745 = c16742;
        this.f26747 = str;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f26744);
        c22933.m51049(R.string.MT_Protector_res_0x7f1200b1);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f26746 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C15831 c15831;
        C15831 c158312;
        C15831 c158313;
        C15831 c158314;
        if (this.f26746.m51053()) {
            AbstractC15440 abstractC15440 = this.f26748;
            if (abstractC15440 != null) {
                abstractC15440.mo23552();
                return;
            }
            return;
        }
        boolean m23216 = ServiceC8982.m23216(this.f26745);
        ActivityC7365 activityC7365 = this.f26744;
        if (m23216) {
            activityC7365.f22625 = C20195.unmodifiableList(C17448.m40795());
            c158312 = activityC7365.f22624;
            c158312.notifyItemRangeInserted(0, 1);
            c158313 = activityC7365.f22624;
            c158314 = activityC7365.f22624;
            c158313.notifyItemRangeChanged(1, c158314.getItemCount() - 1);
            return;
        }
        activityC7365.f22625 = C20195.unmodifiableList(C17448.m40795());
        c15831 = activityC7365.f22624;
        c15831.notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractC15440 abstractC15440 = this.f26748;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
        this.f26744.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f26746.m51051();
    }
}
