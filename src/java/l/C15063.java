package l;

import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import java.util.zip.GZIPInputStream;

/* compiled from: M1KQ */
/* renamed from: l.ܶۜۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C15063 extends ComponentCallbacksC9205 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int[] f45991;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12366 f45992;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f45993;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f45994;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13132 f45995;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f45996;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f45997;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f45998;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0247 f45999;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f46000;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C3764 f46001;

    public C15063() {
        super(R.layout.MT_Protector_res_0x7f0d01e2);
        this.f45993 = true;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3764 c3764 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f46001 = c3764;
        c3764.m11419().m1668(this, new C22222(3, this));
        this.f45999 = new C0247(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35609(C15063 c15063, C12366 c12366) {
        c15063.f45992 = c12366;
        c15063.f46001.m11389(c15063, new C16648(7, c15063));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35605(C15063 c15063) {
        if (c15063.f45993) {
            c15063.f45993 = false;
            c15063.f46000 = false;
            c15063.f45994 = false;
            AbstractC15440 m27330 = c15063.f45992.m30044().m27330("strings");
            if (m27330.mo23120()) {
                try {
                    C4362 c4362 = new C4362(new GZIPInputStream(m27330.mo27926()));
                    try {
                        if (c4362.readInt() == 830747697) {
                            int readInt = c4362.readInt();
                            c15063.f45998 = new ArrayList(readInt);
                            byte[] bArr = new byte[1024];
                            for (int i = 0; i < readInt; i++) {
                                int read = c4362.read();
                                if (read == -1) {
                                    throw new EOFException();
                                }
                                if (read != 0) {
                                    c15063.f46000 = true;
                                    c15063.f45998.add(new C15769(c4362.m13078(bArr), c4362.m13078(bArr)));
                                } else {
                                    c15063.f45998.add(new C15769(c4362.m13078(bArr)));
                                }
                            }
                            c15063.m35621();
                            AbstractC15440 m273302 = c15063.f45992.m30044().m27330("strings_changed");
                            if (c15063.f46000) {
                                m273302.getClass();
                                m273302.m36503(new byte[]{1}, 0, 1);
                            } else {
                                m273302.mo23552();
                            }
                            c15063.f45999.notifyDataSetChanged();
                            c4362.close();
                            return;
                        }
                        c4362.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    C3764 c3764 = c15063.f46001;
                    if (c3764 != null) {
                        c3764.m11384(th);
                    }
                }
            }
            new C6598(c15063, R.string.MT_Protector_res_0x7f120528).m20274();
        }
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C13132 c13132 = (C13132) view.findViewById(R.id.MT_Protector_res_0x7f0a0486);
        this.f45995 = c13132;
        c13132.setTag("RecyclerView3");
        this.f45995.setAdapter(this.f45999);
        this.f46001.m11395(getViewLifecycleOwner(), new C17887(this));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35617(C15063 c15063) {
        c15063.f45995.scrollToPosition(0);
        c15063.f45999.m1504();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f45995.setAdapter(null);
        this.f45995 = null;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m35630() {
        m35604(this.f45998);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m35604(List list) {
        String str;
        String str2;
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C10007(this.f45992.m30044().m27330("strings").mo23555(false)));
            try {
                C5773.m16235(bufferedOutputStream, 830747697);
                C5773.m16235(bufferedOutputStream, list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C15769 c15769 = (C15769) it.next();
                    bufferedOutputStream.write(c15769.f48614 ? 255 : 0);
                    str = c15769.f48613;
                    C5773.m16235(bufferedOutputStream, C5773.m16233(str));
                    C5773.m16236(bufferedOutputStream, str);
                    if (c15769.f48614) {
                        str2 = c15769.f48612;
                        C5773.m16235(bufferedOutputStream, C5773.m16233(str2));
                        C5773.m16236(bufferedOutputStream, str2);
                    }
                }
                bufferedOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            C3764 c3764 = this.f46001;
            if (c3764 != null) {
                c3764.m11384((Throwable) e);
            }
        }
        AbstractC15440 m27330 = this.f45992.m30044().m27330("strings_changed");
        if (this.f46000) {
            try {
                m27330.getClass();
                m27330.m36503(new byte[]{1}, 0, 1);
                return;
            } catch (IOException e2) {
                C3764 c37642 = this.f46001;
                if (c37642 != null) {
                    c37642.m11384((Throwable) e2);
                    return;
                }
                return;
            }
        }
        m27330.mo23552();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m35612(C15063 c15063) {
        AbstractC15440 m27330 = c15063.f45992.m30044().m27330("stringsFilter");
        if (!c15063.f45994) {
            m27330.mo23552();
            return;
        }
        C10130 m43030 = C18515.m43030(1143374470);
        m43030.m25423((CharSequence) c15063.f45996);
        m43030.writeInt(c15063.f45997);
        for (int i = 0; i < c15063.f45997; i++) {
            m43030.writeInt(c15063.f45991[i]);
        }
        try {
            m27330.m36496(m43030);
        } catch (IOException e) {
            if (c15063.f46001 != null) {
                c15063.f46001.m11384((Throwable) e);
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m35621() {
        AbstractC15440 m27330 = this.f45992.m30044().m27330("stringsFilter");
        if (m27330.mo23120()) {
            C12951 m36528 = m27330.m36528();
            if (m36528.readInt() == 1143374470) {
                this.f45994 = true;
                this.f45996 = m36528.m31504();
                int readInt = m36528.readInt();
                this.f45997 = readInt;
                int[] iArr = this.f45991;
                if (iArr == null || iArr.length < readInt) {
                    this.f45991 = new int[readInt];
                }
                for (int i = 0; i < this.f45997; i++) {
                    this.f45991[i] = m36528.readInt();
                }
            }
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m35613(C15063 c15063) {
        new C20710(c15063, (AbstractActivityC3346) c15063.requireActivity(), c15063.f45994, C2353.m7663()).m40707();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m35622(C15063 c15063) {
        String str;
        String str2;
        ActivityC17169 activityC17169 = (ActivityC17169) c15063.requireActivity();
        C22933 c22933 = new C22933(activityC17169);
        c22933.m51049(R.string.MT_Protector_res_0x7f1207a7);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        final C8715 c8715 = new C8715(c15063, c22933, activityC17169);
        final C2727 c2727 = new C2727();
        for (C15769 c15769 : c15063.f45998) {
            if (c15769.f48614) {
                str = c15769.f48613;
                str2 = c15769.f48612;
                c2727.put(str, str2);
            }
        }
        final C12366 c12366 = c15063.f45992;
        new Thread(new Runnable() { // from class: l.֫ܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                final C22108 c22108 = new C22108();
                final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C12366 c123662 = C12366.this;
                c123662.m30033(concurrentLinkedQueue, "", true, (Predicate) null);
                final InterfaceC21403 interfaceC21403 = c8715;
                interfaceC21403.mo22515(0);
                final C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                c19277.m44459(new C21847(interfaceC21403));
                final C2727 c27272 = c2727;
                Runnable runnable = new Runnable() { // from class: l.ܽܽۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC13508 interfaceC13508;
                        String str3;
                        while (true) {
                            ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                            if (concurrentLinkedQueue2.isEmpty() || (interfaceC13508 = (InterfaceC13508) concurrentLinkedQueue2.poll()) == null || interfaceC21403.mo22513()) {
                                return;
                            }
                            c19277.m44460(1);
                            String mo31675 = interfaceC13508.mo31675();
                            C12572 c12572 = new C12572(mo31675);
                            C22706 c22706 = new C22706(mo31675.length());
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                str3 = null;
                                if (!c12572.m30816()) {
                                    break;
                                }
                                String str4 = (String) c27272.getOrDefault(c12572.f37888, null);
                                if (str4 != null) {
                                    c22706.append((CharSequence) mo31675, i2, c12572.f37890);
                                    try {
                                        C14020.m33624(c22706, str4);
                                    } catch (IOException unused) {
                                    }
                                    i2 = c12572.f37886;
                                    i++;
                                }
                            }
                            if (i != 0) {
                                c22108.m49685(i);
                                if (i2 < mo31675.length()) {
                                    c22706.append((CharSequence) mo31675, i2, mo31675.length());
                                }
                                str3 = c22706.toString();
                            }
                            if (str3 != null) {
                                interfaceC13508.mo31670(str3);
                            }
                        }
                    }
                };
                c123662.m30024();
                c123662.m30042(false);
                C3058.m9358((int) (C17615.f53826 * 0.66f), runnable);
                c123662.m30042(true);
                c123662.m30061();
                C4925.m14315(new RunnableC18175(0, interfaceC21403, c22108));
            }
        }).start();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC19902 m35628() {
        return this.f45999;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m35629() {
        return this.f45998;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m35631() {
        boolean z;
        Iterator it = this.f45998.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((C15769) it.next()).f48614) {
                z = true;
                break;
            }
        }
        this.f46000 = z;
    }
}
