package l;

import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.zip.Adler32;

/* compiled from: L5VZ */
/* renamed from: l.᩸ۜۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC21411 {

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static Comparator f68915 = new C2361();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3149 f68923;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3855 f68924;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2775 f68926;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C5971 f68928;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23527 f68933;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4477[] f68938;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C20414 f68942;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6594 f68945;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2069 f68946;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7299 f68948;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C3480 f68950;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15142 f68954;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C7897 f68955;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C14416 f68957;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f68922 = new HashMap();

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f68944 = 0;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f68927 = 0;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f68919 = 0;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f68917 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f68921 = 0;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f68930 = 0;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f68952 = 0;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68951 = 0;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f68934 = 0;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f68931 = 0;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f68940 = 0;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f68916 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f68943 = 0;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f68939 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f68947 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f68918 = 0;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f68949 = 0;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f68920 = 0;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f68941 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f68953 = 0;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f68929 = false;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f68936 = 0;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f68937 = 0;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f68935 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f68925 = 0;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f68932 = 0;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Comparator f68956 = new C3772((C19357) this);

    /* renamed from: ֫ */
    public abstract C18651 mo44612();

    /* renamed from: ֫ */
    public abstract void mo44614(C0949 c0949, Object obj);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48525(C15765 c15765, int i, int i2) {
        C15765.m37166(c15765, i);
        if (i > 0) {
            C15765.m37166(c15765, i2);
        } else {
            C15765.m37166(c15765, 0);
        }
    }

    public AbstractC21411(C7897 c7897) {
        this.f68955 = c7897;
        C18651 mo44612 = mo44612();
        this.f68948 = mo44612.m43246();
        C14416 m43249 = mo44612.m43249();
        this.f68957 = m43249;
        C5971 m43253 = mo44612.m43253();
        this.f68928 = m43253;
        C3855 m43248 = mo44612.m43248();
        this.f68924 = m43248;
        C3149 m43244 = mo44612.m43244();
        this.f68923 = m43244;
        this.f68942 = mo44612.m43252();
        C2775 m43250 = mo44612.m43250();
        this.f68926 = m43250;
        C15142 m43254 = mo44612.m43254();
        this.f68954 = m43254;
        this.f68946 = mo44612.m43245();
        this.f68933 = mo44612.m43243();
        this.f68945 = mo44612.m43247();
        this.f68950 = mo44612.m43251();
        this.f68938 = new InterfaceC4477[]{m43249, m43253, m43248, m43244, m43250, m43254};
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15765 m48522(InterfaceC5245 interfaceC5245, int i) {
        return new C15765(interfaceC5245.mo3524(i), i);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m48530() {
        return (this.f68954.getItemCount() * 8) + (this.f68926.m8576() * 4) + (this.f68942.getItemCount() * 32) + (this.f68923.getItemCount() * 8) + (this.f68924.getItemCount() * 8) + (this.f68928.getItemCount() * 12) + (this.f68957.getItemCount() * 4) + (this.f68948.getItemCount() * 4) + UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48536() {
        for (InterfaceC4477 interfaceC4477 : this.f68938) {
            if (interfaceC4477.getItemCount() > 65536) {
                System.err.println("Number of section items overflowed: 65535: " + interfaceC4477.getClass().getSimpleName() + "[" + interfaceC4477.getItemCount() + "]");
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48534(InterfaceC5245 interfaceC5245) {
        InterfaceC0305 m46245 = C20062.m46245();
        C20414 c20414 = this.f68942;
        if (this.f68923.getItemCount() <= 65536) {
            if (m48536()) {
                throw new IOException("Number of section items overflowed: 65535");
            }
            C2775 c2775 = this.f68926;
            Iterator it = ((AbstractC5266) c2775.mo8571()).iterator();
            int i = -1;
            while (it.hasNext()) {
                int index = ((InterfaceC4060) ((Map.Entry) it.next()).getKey()).getIndex();
                if (index >= 0 && index < 65536 && index > i) {
                    i = index;
                }
            }
            int itemCount = (i + 1) - c2775.getItemCount();
            if (itemCount > 0) {
                c2775.m8573(itemCount);
            }
            try {
                int m48530 = m48530();
                C15765 m48522 = m48522(interfaceC5245, 0);
                C15765 m485222 = m48522(interfaceC5245, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                C15765 m485223 = m48522(interfaceC5245, m48530);
                try {
                    m48515(m485222, m485223);
                    m48518(m485222);
                    m48527(m485223);
                    m48520(m485222);
                    m48533(m485222);
                    m48521(m485222);
                    C15765 m485224 = m48522(interfaceC5245, (c2775.m8576() * 4) + (c20414.getItemCount() * 32) + m485222.getPosition());
                    try {
                        m48532(m485224);
                        m485224.close();
                        m48526(m485223);
                        C15765 m485225 = m48522(interfaceC5245, (c20414.getItemCount() * 32) + m485222.getPosition());
                        try {
                            m48529(m485225);
                            m485225.close();
                            m48531(m485223);
                            m48528(m485223);
                            m48524(m485223);
                            m48511(m485223);
                            m48516(m485223, m46245.mo1677());
                            m48510(interfaceC5245, m485222, m485223);
                            m48519(m485223);
                            m48512(m48522, m48530, m485223.getPosition());
                            m48522.close();
                            m485222.close();
                            m485223.close();
                            m48523(interfaceC5245);
                            Adler32 adler32 = new Adler32();
                            byte[] bArr = new byte[4096];
                            InputStream mo3525 = interfaceC5245.mo3525(12);
                            for (int read = mo3525.read(bArr); read >= 0; read = mo3525.read(bArr)) {
                                adler32.update(bArr, 0, read);
                            }
                            OutputStream mo3524 = interfaceC5245.mo3524(8);
                            C15765.m37166(mo3524, (int) adler32.getValue());
                            mo3524.close();
                            return;
                        } catch (Throwable th) {
                            m485225.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        m485224.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    m48522.close();
                    m485222.close();
                    m485223.close();
                    throw th3;
                }
            } finally {
                interfaceC5245.close();
            }
        }
        throw new IOException(C4925.m14327(R.string.MT_Protector_res_0x7f120285));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48535(AbstractC15440 abstractC15440) {
        if (!abstractC15440.mo23120()) {
            C1011 c1011 = new C1011(abstractC15440);
            try {
                m48534(c1011);
                c1011.close();
            } catch (Throwable th) {
                try {
                    c1011.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            AbstractC15440 m36520 = abstractC15440.m36520(".tmp");
            try {
                C1011 c10112 = new C1011(m36520);
                try {
                    m48534(c10112);
                    c10112.close();
                    m36520.m36498(abstractC15440, (Runnable) null);
                } finally {
                }
            } finally {
                m36520.mo23552();
            }
        }
        C16999.m39870(abstractC15440);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48523(InterfaceC5245 interfaceC5245) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[4096];
            InputStream mo3525 = interfaceC5245.mo3525(32);
            for (int read = mo3525.read(bArr); read >= 0; read = mo3525.read(bArr)) {
                messageDigest.update(bArr, 0, read);
            }
            byte[] digest = messageDigest.digest();
            if (digest.length != 20) {
                throw new RuntimeException(C3200.m9831(digest.length, " bytes", new StringBuilder("unexpected digest write: ")));
            }
            OutputStream mo3524 = interfaceC5245.mo3524(12);
            mo3524.write(digest);
            mo3524.close();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48515(C15765 c15765, C15765 c157652) {
        this.f68944 = c15765.getPosition();
        this.f68934 = c157652.getPosition();
        ArrayList arrayList = new ArrayList((AbstractCollection) this.f68948.mo8571());
        Collections.sort(arrayList, f68915);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            C15765.m37166(c15765, c157652.getPosition());
            String charSequence = ((CharSequence) entry.getKey()).toString();
            C15765.m37168(c157652, charSequence.length());
            c157652.m37174(charSequence);
            c157652.write(0);
            i = i2;
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m48518(C15765 c15765) {
        this.f68927 = c15765.getPosition();
        C14416 c14416 = this.f68957;
        ArrayList arrayList = new ArrayList((AbstractCollection) c14416.mo8571());
        Collections.sort(arrayList, f68915);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            C15765.m37166(c15765, this.f68948.mo8575(c14416.m34447((CharSequence) entry.getKey())));
            i = i2;
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m48520(C15765 c15765) {
        this.f68919 = c15765.getPosition();
        C5971 c5971 = this.f68928;
        ArrayList arrayList = new ArrayList((AbstractCollection) c5971.mo8571());
        Collections.sort(arrayList, new C18589());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC0531 interfaceC0531 = (InterfaceC0531) entry.getKey();
            C15765.m37166(c15765, this.f68948.mo8575(c5971.m16733(interfaceC0531)));
            C15765.m37166(c15765, this.f68957.mo8575(c5971.m16732(interfaceC0531)));
            C15765.m37166(c15765, this.f68946.mo23500(c5971.m16731(interfaceC0531)));
            i = i2;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m48533(C15765 c15765) {
        this.f68917 = c15765.getPosition();
        C3855 c3855 = this.f68924;
        ArrayList arrayList = new ArrayList((AbstractCollection) c3855.mo8571());
        Collections.sort(arrayList, new C18589());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC18877 interfaceC18877 = (InterfaceC18877) entry.getKey();
            C23589 m11612 = c3855.m11612(interfaceC18877);
            C14416 c14416 = this.f68957;
            c15765.m37175(c14416.mo8575(m11612));
            c15765.m37175(c14416.mo8575(c3855.m11613(interfaceC18877)));
            C15765.m37166(c15765, this.f68948.mo8575(c3855.m11614(interfaceC18877)));
            i = i2;
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m48521(C15765 c15765) {
        this.f68921 = c15765.getPosition();
        C3149 c3149 = this.f68923;
        ArrayList arrayList = new ArrayList((AbstractCollection) c3149.mo8571());
        Collections.sort(arrayList, new C18589());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC5471 interfaceC5471 = (InterfaceC5471) entry.getKey();
            c15765.m37175(this.f68957.mo8575(c3149.m9573(interfaceC5471)));
            c15765.m37175(this.f68928.mo8575(c3149.m9576(interfaceC5471)));
            C15765.m37166(c15765, this.f68948.mo8575(c3149.m9575(interfaceC5471)));
            i = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48510(InterfaceC5245 interfaceC5245, C15765 c15765, C15765 c157652) {
        this.f68930 = c15765.getPosition();
        this.f68931 = c157652.getPosition();
        C20414 c20414 = this.f68942;
        ArrayList arrayList = new ArrayList((AbstractCollection) c20414.mo8571());
        Collections.sort(arrayList, new C18589());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = m48508(c15765, c157652, i, (Map.Entry) it.next());
        }
        if (mo44617()) {
            c157652.m37169();
            this.f68941 = c157652.getPosition();
            ArrayList arrayList2 = new ArrayList((AbstractCollection) c20414.mo8571());
            Collections.sort(arrayList2, new C19295());
            C8005 c8005 = new C8005(interfaceC5245, c157652, arrayList2.size());
            try {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Iterator it3 = c20414.m46812((Comparable) entry.getKey()).iterator();
                    while (it3.hasNext()) {
                        c8005.m21319(c20414.m46802(it3.next()));
                    }
                    Iterator it4 = c20414.m46814((Comparable) entry.getKey()).iterator();
                    while (it4.hasNext()) {
                        c8005.m21319(c20414.m46802(it4.next()));
                    }
                    Iterator<E> it5 = c20414.m46806((Comparable) entry.getKey()).iterator();
                    while (it5.hasNext()) {
                        c8005.m21319(c20414.m46810(it5.next()));
                    }
                    Iterator<E> it6 = c20414.m46797((Comparable) entry.getKey()).iterator();
                    while (it6.hasNext()) {
                        c8005.m21319(c20414.m46810(it6.next()));
                    }
                    c8005.m21320();
                }
            } finally {
                c8005.m21318();
            }
        }
    }

    /* renamed from: ܽ */
    public boolean mo44617() {
        return this.f68929 && this.f68955.f24463 >= 29;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m48508(C15765 c15765, C15765 c157652, int i, Map.Entry entry) {
        if (entry == null || ((Integer) entry.getValue()).intValue() != -1) {
            return i;
        }
        Comparable comparable = (Comparable) entry.getKey();
        entry.setValue(0);
        C20414 c20414 = this.f68942;
        int m48508 = m48508(c15765, c157652, i, c20414.m46782((CharSequence) c20414.m46787(comparable)));
        C1717 m46807 = c20414.m46807(comparable);
        InterfaceC2069 interfaceC2069 = this.f68946;
        Iterator it = interfaceC2069.mo6809(m46807).iterator();
        while (it.hasNext()) {
            m48508 = m48508(c15765, c157652, m48508, c20414.m46782((CharSequence) it.next()));
        }
        int i2 = m48508 + 1;
        entry.setValue(Integer.valueOf(m48508));
        C23589 m46789 = c20414.m46789(comparable);
        C14416 c14416 = this.f68957;
        C15765.m37166(c15765, c14416.mo8575(m46789));
        C15765.m37166(c15765, c20414.m46781(comparable));
        C15765.m37166(c15765, c14416.mo16505(c20414.m46787(comparable)));
        C15765.m37166(c15765, interfaceC2069.mo23500(c20414.m46807(comparable)));
        C15765.m37166(c15765, this.f68948.mo16505(c20414.m46795(comparable)));
        C15765.m37166(c15765, c20414.m46798(comparable));
        SortedSet m46812 = c20414.m46812(comparable);
        SortedSet m46814 = c20414.m46814(comparable);
        AbstractC23698 m46806 = c20414.m46806(comparable);
        AbstractC23698 m46797 = c20414.m46797(comparable);
        boolean z = m46812.size() > 0 || m46814.size() > 0 || m46806.size() > 0 || m46797.size() > 0;
        if (z) {
            C15765.m37166(c15765, c157652.getPosition());
        } else {
            C15765.m37166(c15765, 0);
        }
        C12652 m46803 = c20414.m46803(comparable);
        if (m46803 != null) {
            C15765.m37166(c15765, this.f68950.mo10659(m46803));
        } else {
            C15765.m37166(c15765, 0);
        }
        if (z) {
            this.f68932++;
            C15765.m37168(c157652, m46812.size());
            C15765.m37168(c157652, m46814.size());
            C15765.m37168(c157652, m46806.size());
            C15765.m37168(c157652, m46797.size());
            m48514(c157652, m46812);
            m48514(c157652, m46814);
            m48517(c157652, m46806);
            m48517(c157652, m46797);
        }
        return i2;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m48529(C15765 c15765) {
        C3480 c3480;
        this.f68952 = c15765.getPosition();
        C19720 c19720 = new C19720();
        ArrayList arrayList = new ArrayList();
        C2775 c2775 = this.f68926;
        Iterator it = ((AbstractC5266) c2775.mo8571()).iterator();
        int i = -1;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int index = ((InterfaceC4060) entry.getKey()).getIndex();
            if (index < 0 || index >= 65536 || c19720.mo2422(index)) {
                arrayList.add(entry);
            } else {
                c19720.mo2318(index, entry);
                if (index > i) {
                    i = index;
                }
            }
        }
        Collections.sort(arrayList, this.f68956);
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            c3480 = this.f68950;
            if (i2 > i) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) c19720.get(i2);
            if (entry2 == null && it2.hasNext()) {
                entry2 = (Map.Entry) it2.next();
            }
            if (entry2 != null) {
                entry2.setValue(Integer.valueOf(i2));
                C15765.m37166(c15765, c3480.mo10659(c2775.m8572((InterfaceC4060) entry2.getKey())));
            } else {
                C15765.m37166(c15765, -1);
            }
            i2++;
        }
        while (it2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it2.next();
            i++;
            entry3.setValue(Integer.valueOf(i));
            C15765.m37166(c15765, c3480.mo10659(c2775.m8572((InterfaceC4060) entry3.getKey())));
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m48532(C15765 c15765) {
        int mo8575;
        this.f68951 = c15765.getPosition();
        C15142 c15142 = this.f68954;
        Iterator it = ((AbstractC5266) c15142.mo8571()).iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC19583 interfaceC19583 = (InterfaceC19583) entry.getKey();
            c15765.m37175(interfaceC19583.mo2849());
            c15765.m37175(0);
            switch (interfaceC19583.mo2849()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    mo8575 = this.f68924.mo8575(c15142.m35846(interfaceC19583));
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    mo8575 = this.f68923.mo8575(c15142.m35847(interfaceC19583));
                    break;
                default:
                    throw new C15431(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC19583.mo2849()));
            }
            c15765.m37175(mo8575);
            c15765.m37175(0);
            i = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48514(C15765 c15765, SortedSet sortedSet) {
        int i = 0;
        for (Object obj : sortedSet) {
            int m11616 = this.f68924.m11616(obj);
            C20414 c20414 = this.f68942;
            if (!c20414.m46802(obj).isEmpty()) {
                this.f68929 = true;
            }
            C15765.m37168(c15765, m11616 - i);
            C15765.m37168(c15765, c20414.m46796(obj));
            i = m11616;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48517(C15765 c15765, AbstractC23698 abstractC23698) {
        int i = 0;
        for (Object obj : abstractC23698) {
            int m9579 = this.f68923.m9579(obj);
            C20414 c20414 = this.f68942;
            if (!c20414.m46810(obj).isEmpty()) {
                this.f68929 = true;
            }
            C15765.m37168(c15765, m9579 - i);
            C15765.m37168(c15765, c20414.m46788(obj));
            C15765.m37168(c15765, c20414.m46791(obj));
            i = m9579;
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m48527(C15765 c15765) {
        c15765.m37169();
        this.f68940 = c15765.getPosition();
        InterfaceC2069 interfaceC2069 = this.f68946;
        Iterator it = ((AbstractC5266) interfaceC2069.mo10657()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c15765.m37169();
            entry.setValue(Integer.valueOf(c15765.getPosition()));
            List mo6809 = interfaceC2069.mo6809(entry.getKey());
            C15765.m37166(c15765, mo6809.size());
            Iterator it2 = mo6809.iterator();
            while (it2.hasNext()) {
                c15765.m37175(this.f68957.mo8575((CharSequence) it2.next()));
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m48526(C15765 c15765) {
        C0949 c0949 = new C0949(this, c15765);
        this.f68916 = c15765.getPosition();
        C3480 c3480 = this.f68950;
        Iterator it = ((AbstractC5266) c3480.mo10657()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.setValue(Integer.valueOf(c15765.getPosition()));
            List m10660 = c3480.m10660(entry.getKey());
            C15765.m37168(c15765, m10660.size());
            Iterator it2 = m10660.iterator();
            while (it2.hasNext()) {
                mo44614(c0949, it2.next());
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m48531(C15765 c15765) {
        C0949 c0949 = new C0949(this, c15765);
        this.f68943 = c15765.getPosition();
        InterfaceC23527 interfaceC23527 = this.f68933;
        Iterator it = ((AbstractC5266) interfaceC23527.mo10657()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.setValue(Integer.valueOf(c15765.getPosition()));
            InterfaceC20561 interfaceC20561 = (InterfaceC20561) entry.getKey();
            c15765.m37172(interfaceC23527.mo51993(interfaceC20561));
            C15765.m37168(c15765, this.f68957.mo8575(interfaceC23527.mo51992(interfaceC20561)));
            AbstractC14545 m34731 = AbstractC14545.m34731(AbstractC10232.m25862(AbstractC14534.f44527), interfaceC23527.mo51995(interfaceC20561));
            C15765.m37168(c15765, m34731.size());
            AbstractC4628 listIterator = m34731.listIterator(0);
            while (listIterator.hasNext()) {
                InterfaceC9272 interfaceC9272 = (InterfaceC9272) listIterator.next();
                C15765.m37168(c15765, this.f68948.mo8575(interfaceC23527.mo51994(interfaceC9272)));
                mo44614(c0949, interfaceC23527.mo51991(interfaceC9272));
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m48528(C15765 c15765) {
        c15765.m37169();
        this.f68939 = c15765.getPosition();
        if (this.f68955.f24463 < 17) {
            C15765.m37166(c15765, 0);
        }
        InterfaceC6594 interfaceC6594 = this.f68945;
        Iterator it = ((AbstractC5266) interfaceC6594.mo10657()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC14545 m34731 = AbstractC14545.m34731(AbstractC10232.m25862(AbstractC18063.f56276), interfaceC6594.mo18100(entry.getKey()));
            c15765.m37169();
            entry.setValue(Integer.valueOf(c15765.getPosition()));
            C15765.m37166(c15765, m34731.size());
            AbstractC4628 listIterator = m34731.listIterator(0);
            while (listIterator.hasNext()) {
                C15765.m37166(c15765, this.f68933.mo10659(listIterator.next()));
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m48524(C15765 c15765) {
        int mo10659;
        c15765.m37169();
        this.f68947 = c15765.getPosition();
        HashMap hashMap = new HashMap();
        C20414 c20414 = this.f68942;
        AbstractC4628 listIterator = c20414.m46808().listIterator(0);
        while (listIterator.hasNext()) {
            for (Object obj : c20414.m46792((Comparable) listIterator.next())) {
                List m46779 = c20414.m46779(obj);
                if (m46779 != null) {
                    Integer num = (Integer) hashMap.get(m46779);
                    if (num != null) {
                        c20414.m46784(num.intValue(), obj);
                    } else {
                        c15765.m37169();
                        int position = c15765.getPosition();
                        c20414.m46784(position, obj);
                        hashMap.put(m46779, Integer.valueOf(position));
                        this.f68936++;
                        C15765.m37166(c15765, m46779.size());
                        for (Object obj2 : m46779) {
                            InterfaceC6594 interfaceC6594 = this.f68945;
                            if (interfaceC6594.mo18100(obj2).size() > 0) {
                                mo10659 = interfaceC6594.mo10659(obj2);
                            } else if (this.f68955.f24463 >= 17) {
                                C15765.m37166(c15765, 0);
                            } else {
                                mo10659 = this.f68939;
                            }
                            C15765.m37166(c15765, mo10659);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48511(C15765 c15765) {
        InterfaceC6594 interfaceC6594;
        C3149 c3149;
        c15765.m37169();
        this.f68918 = c15765.getPosition();
        HashMap hashMap = new HashMap();
        ByteBuffer allocate = ByteBuffer.allocate(65536);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        C20414 c20414 = this.f68942;
        AbstractC4628 listIterator = c20414.m46808().listIterator(0);
        while (listIterator.hasNext()) {
            Comparable comparable = (Comparable) listIterator.next();
            Collection m46800 = c20414.m46800(comparable);
            Collection m46792 = c20414.m46792(comparable);
            int size = (m46792.size() * 16) + (m46800.size() * 8);
            if (size > allocate.capacity()) {
                allocate = ByteBuffer.allocate(size);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
            }
            allocate.clear();
            Iterator it = m46800.iterator();
            int i = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                interfaceC6594 = this.f68945;
                if (!hasNext) {
                    break;
                }
                Object next = it.next();
                C7008 m46794 = c20414.m46794(next);
                if (m46794 != null) {
                    i++;
                    allocate.putInt(this.f68924.m11616(next));
                    allocate.putInt(interfaceC6594.mo10659(m46794));
                }
            }
            Iterator it2 = m46792.iterator();
            int i2 = 0;
            while (true) {
                boolean hasNext2 = it2.hasNext();
                c3149 = this.f68923;
                if (!hasNext2) {
                    break;
                }
                Object next2 = it2.next();
                C7008 m46809 = c20414.m46809(next2);
                if (m46809 != null) {
                    i2++;
                    allocate.putInt(c3149.m9579(next2));
                    allocate.putInt(interfaceC6594.mo10659(m46809));
                }
            }
            int i3 = 0;
            for (Object obj : m46792) {
                int m46813 = c20414.m46813(obj);
                if (m46813 != 0) {
                    i3++;
                    allocate.putInt(c3149.m9579(obj));
                    allocate.putInt(m46813);
                }
            }
            C7008 m46804 = c20414.m46804(comparable);
            if (i == 0 && i2 == 0 && i3 == 0) {
                if (m46804 != null) {
                    Integer num = (Integer) hashMap.get(m46804);
                    if (num != null) {
                        c20414.m46783(num.intValue(), comparable);
                    } else {
                        hashMap.put(m46804, Integer.valueOf(c15765.getPosition()));
                    }
                }
            }
            this.f68937++;
            c20414.m46783(c15765.getPosition(), comparable);
            C15765.m37166(c15765, interfaceC6594.mo23500(m46804));
            C15765.m37166(c15765, i);
            C15765.m37166(c15765, i2);
            C15765.m37166(c15765, i3);
            c15765.write(allocate.array(), 0, allocate.position());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m48516(l.C15765 r28, l.C20062 r29) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC21411.m48516(l.ܺۜۚ, l.᩶ۡۚ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m48507(C15765 c15765, ByteArrayOutputStream byteArrayOutputStream, Object obj, List list, Iterable iterable, int i) {
        C23589 c23589;
        Iterator it;
        int mo3615;
        if (iterable == null && i == 0) {
            return -1;
        }
        this.f68925++;
        c15765.m37169();
        int position = c15765.getPosition();
        C20414 c20414 = this.f68942;
        int m46780 = c20414.m46780(obj);
        c15765.m37175(m46780);
        boolean m36866 = EnumC15657.STATIC.m36866(c20414.m46788(obj));
        C3149 c3149 = this.f68923;
        C13026 m9578 = c3149.m9578(obj);
        C5971 c5971 = this.f68928;
        int m40411 = C17177.m40411(this.f68946.mo6809(c5971.m16731(m9578)), m36866);
        int i2 = 3;
        if (m40411 > m46780) {
            throw new RuntimeException(String.format("ins_size (%dd) > registers_size (%dd): %s", Integer.valueOf(m40411), Integer.valueOf(m46780), obj.toString()));
        }
        c15765.m37175(m40411);
        if (iterable == null) {
            c15765.m37175(0);
            c15765.m37175(0);
            C15765.m37166(c15765, i);
            C15765.m37166(c15765, 0);
            return position;
        }
        ArrayList m42257 = C18150.m42257(list);
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it2.hasNext()) {
            InterfaceC22677 interfaceC22677 = (InterfaceC22677) it2.next();
            i4 = interfaceC22677.mo3974() + i4;
            int i5 = interfaceC22677.mo3975().f3318;
            if (i5 != i2) {
                mo3615 = i5 != 5 ? 0 : ((InterfaceC6718) interfaceC22677).mo3615();
                it = it2;
            } else {
                InterfaceC5471 interfaceC5471 = (InterfaceC5471) ((InterfaceC10952) interfaceC22677).getReference();
                EnumC0841 mo3975 = interfaceC22677.mo3975();
                it = it2;
                mo3615 = (mo3975 == EnumC0841.f3044 || mo3975 == EnumC0841.f3100) ? ((InterfaceC6718) interfaceC22677).mo3615() : C17177.m40411(interfaceC5471.mo3565(), mo3975 == EnumC0841.f3052 || mo3975 == EnumC0841.f3133);
            }
            if (mo3615 > i3) {
                i3 = mo3615;
            }
            i2 = 3;
            it2 = it;
        }
        if (i3 > 5 && i3 > m46780) {
            throw new RuntimeException(String.format("outs_size (%dd) > registers_size (%dd): %s", Integer.valueOf(i3), Integer.valueOf(m46780), obj.toString()));
        }
        c15765.m37175(i3);
        c15765.m37175(m42257.size());
        C15765.m37166(c15765, i);
        C7897 c7897 = this.f68955;
        InterfaceC7299 interfaceC7299 = this.f68948;
        C14416 c14416 = this.f68957;
        C12943 c12943 = new C12943(c7897, c15765, interfaceC7299, c14416, this.f68924, c3149, c5971, this.f68954, this.f68926);
        C15765.m37166(c15765, i4);
        Iterator it3 = iterable.iterator();
        int i6 = 0;
        while (it3.hasNext()) {
            InterfaceC22677 interfaceC226772 = (InterfaceC22677) it3.next();
            try {
                switch (C0243.f1520[interfaceC226772.mo3975().f3316.ordinal()]) {
                    case 1:
                        c12943.m31470((InterfaceC15889) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 2:
                        c12943.m31450((InterfaceC2485) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 3:
                        c12943.m31452((InterfaceC3896) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 4:
                        c12943.m31475((InterfaceC18713) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 5:
                        c12943.m31476((InterfaceC19419) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 6:
                        c12943.m31447((InterfaceC0367) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 7:
                        c12943.m31454((InterfaceC5307) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 8:
                        c12943.m31448((InterfaceC1073) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 9:
                        c12943.m31458((InterfaceC8129) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 10:
                        c12943.m31469((InterfaceC15183) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 11:
                        c12943.m31479((InterfaceC21535) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 12:
                        c12943.m31480((InterfaceC22240) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 13:
                        c12943.m31477((InterfaceC20124) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 14:
                        c12943.m31453((InterfaceC4601) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 15:
                        c12943.m31451((InterfaceC3190) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 16:
                        c12943.m31466((InterfaceC13067) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 17:
                        c12943.m31465((InterfaceC12362) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 18:
                        c12943.m31462((InterfaceC10246) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 19:
                        c12943.m31455((InterfaceC6012) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 20:
                        c12943.m31464((InterfaceC11657) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 21:
                        c12943.m31481((InterfaceC22945) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 22:
                        c12943.m31467((InterfaceC13772) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 23:
                        c12943.m31457((InterfaceC7423) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 24:
                        c12943.m31449((InterfaceC1943) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 25:
                        c12943.m31463((InterfaceC11116) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 26:
                        c12943.m31472((InterfaceC16759) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 27:
                        c12943.m31474((InterfaceC18171) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 28:
                        c12943.m31473((InterfaceC17465) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 29:
                        c12943.m31468((InterfaceC14642) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 30:
                        c12943.m31482((InterfaceC23815) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 31:
                        c12943.m31456((InterfaceC6882) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 32:
                        c12943.m31478((InterfaceC20994) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 33:
                        c12943.m31461((InterfaceC9705) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 34:
                        c12943.m31459((InterfaceC8835) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 35:
                        c12943.m31460((InterfaceC8999) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    case 36:
                        c12943.m31471((InterfaceC16053) interfaceC226772);
                        continue;
                        i6 += interfaceC226772.mo3974();
                    default:
                        throw new C15431(null, "Unsupported instruction format: %s", interfaceC226772.mo3975().f3316);
                }
            } catch (RuntimeException e) {
                throw new C15431(e, "Error while writing instruction at code offset 0x%x", Integer.valueOf(i6));
            }
            throw new C15431(e, "Error while writing instruction at code offset 0x%x", Integer.valueOf(i6));
        }
        if (m42257.size() > 0) {
            c15765.m37169();
            HashMap hashMap = new HashMap();
            Iterator it4 = m42257.iterator();
            while (it4.hasNext()) {
                hashMap.put(((InterfaceC5038) it4.next()).mo14556(), 0);
            }
            C15765.m37168(byteArrayOutputStream, hashMap.size());
            Iterator it5 = m42257.iterator();
            while (it5.hasNext()) {
                InterfaceC5038 interfaceC5038 = (InterfaceC5038) it5.next();
                int mo14555 = interfaceC5038.mo14555();
                int mo14557 = (interfaceC5038.mo14557() + mo14555) - mo14555;
                C15765.m37166(c15765, mo14555);
                c15765.m37175(mo14557);
                if (interfaceC5038.mo14556().size() == 0) {
                    throw new C15431(null, "No exception handlers for the try block!", new Object[0]);
                }
                Integer num = (Integer) hashMap.get(interfaceC5038.mo14556());
                if (num.intValue() != 0) {
                    c15765.m37175(num.intValue());
                } else {
                    int size = byteArrayOutputStream.size();
                    Integer valueOf = Integer.valueOf(size);
                    c15765.m37175(size);
                    hashMap.put(interfaceC5038.mo14556(), valueOf);
                    int size2 = interfaceC5038.mo14556().size();
                    if (((InterfaceC2216) interfaceC5038.mo14556().get(size2 - 1)).mo7393() == null) {
                        size2 = (size2 * (-1)) + 1;
                    }
                    C15765.m37167(byteArrayOutputStream, size2);
                    for (InterfaceC2216 interfaceC2216 : interfaceC5038.mo14556()) {
                        c20414.getClass();
                        InterfaceC21699 mo7392 = interfaceC2216.mo7392();
                        if (mo7392 == null) {
                            c23589 = null;
                        } else {
                            try {
                                c23589 = (C23589) mo7392;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used.");
                            }
                        }
                        int mo7391 = interfaceC2216.mo7391();
                        if (c23589 != null) {
                            C15765.m37168(byteArrayOutputStream, c14416.mo8575(c23589));
                            C15765.m37168(byteArrayOutputStream, mo7391);
                        } else {
                            C15765.m37168(byteArrayOutputStream, mo7391);
                        }
                    }
                }
            }
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream.writeTo(c15765);
                byteArrayOutputStream.reset();
            }
        }
        return position;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        if (r15.f24463 < 17) goto L39;
     */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m48519(l.C15765 r19) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC21411.m48519(l.ܺۜۚ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48513(C15765 c15765, int i, int i2, int i3) {
        if (i2 > 0) {
            c15765.m37175(i);
            c15765.m37175(0);
            C15765.m37166(c15765, i2);
            C15765.m37166(c15765, i3);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48512(C15765 c15765, int i, int i2) {
        byte[] m15354 = C5383.m15354(this.f68955.f24463);
        c15765.write(m15354, 0, m15354.length);
        C15765.m37166(c15765, 0);
        c15765.write(new byte[20], 0, 20);
        C15765.m37166(c15765, i2);
        C15765.m37166(c15765, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C15765.m37166(c15765, 305419896);
        C15765.m37166(c15765, 0);
        C15765.m37166(c15765, 0);
        C15765.m37166(c15765, this.f68953);
        m48525(c15765, ((AbstractC5266) this.f68948.mo8571()).size(), this.f68944);
        m48525(c15765, ((AbstractC5266) this.f68957.mo8571()).size(), this.f68927);
        m48525(c15765, ((AbstractC5266) this.f68928.mo8571()).size(), this.f68919);
        m48525(c15765, ((AbstractC5266) this.f68924.mo8571()).size(), this.f68917);
        m48525(c15765, ((AbstractC5266) this.f68923.mo8571()).size(), this.f68921);
        m48525(c15765, ((AbstractC5266) this.f68942.mo8571()).size(), this.f68930);
        C15765.m37166(c15765, i2 - i);
        C15765.m37166(c15765, i);
    }
}
