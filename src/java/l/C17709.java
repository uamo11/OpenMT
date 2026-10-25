package l;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 6AY4 */
/* renamed from: l.ᩳ֡᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17709 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f54186;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f54187;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f54188;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f54190;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f54192;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f54189 = new AtomicInteger(0);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f54191 = new Object();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41439(String str) {
        List list;
        List list2;
        C12623 c12623;
        C2447 c2447;
        C11233.m27805(str, "name");
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f54192;
        list = viewOnClickListenerC19121.f60259;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (C11233.m27802((Object) ((InterfaceC17889) it.next()).getName(), (Object) str)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        list2 = viewOnClickListenerC19121.f60259;
        ((InterfaceC17889) list2.get(i2)).mo36976(true);
        c12623 = viewOnClickListenerC19121.f60257;
        if (c12623 == null) {
            C11233.m27804("adapter");
            throw null;
        }
        c12623.notifyItemChanged(i2);
        int m41436 = m41436();
        c2447 = viewOnClickListenerC19121.f60263;
        if (c2447 == null) {
            C11233.m27804("recyclerView");
            throw null;
        }
        int m7899 = c2447.m7899() - 1;
        if (5 >= m7899) {
            m7899 = 5;
        }
        if (i2 >= m41436 && m41436 + m7899 > i2) {
            i = m41436;
        } else if (i2 >= m7899) {
            i = i2;
        }
        m41437(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41440(ViewOnClickListenerC10507 viewOnClickListenerC10507) {
        C11233.m27805(viewOnClickListenerC10507, "holder");
        if (System.currentTimeMillis() - this.f54188 < 300) {
            viewOnClickListenerC10507.itemView.setAlpha(0.0f);
            C16989.m39820(viewOnClickListenerC10507.itemView, 0.0f, 1.0f).m28077();
        }
        String str = this.f54186;
        if (str != null && System.currentTimeMillis() - this.f54187 > 800) {
            str = null;
        }
        if (str != null) {
            if (str.equals(viewOnClickListenerC10507.m26406().getName())) {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C21943.f70284 & C21943.m49424(553648127, 620756991)), new ColorDrawable(0)});
                transitionDrawable.setCrossFadeEnabled(true);
                viewOnClickListenerC10507.m26405().setBackground(transitionDrawable);
                transitionDrawable.startTransition(EnumC3478.f11019);
                this.f54186 = null;
                return;
            }
            if (viewOnClickListenerC10507.m26405().getBackground() != null) {
                viewOnClickListenerC10507.m26405().setBackground(null);
            }
        }
    }

    public C17709(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        this.f54192 = viewOnClickListenerC19121;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41436() {
        C2447 c2447;
        c2447 = this.f54192.f60263;
        if (c2447 != null) {
            return c2447.m7895();
        }
        C11233.m27804("recyclerView");
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41437(int i) {
        C2447 c2447;
        c2447 = this.f54192.f60263;
        if (c2447 != null) {
            c2447.m7897(i);
        } else {
            C11233.m27804("recyclerView");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x012c, code lost:
    
        l.C11233.m27804("recyclerView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0131, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x000b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x000b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0132, code lost:
    
        l.C11233.m27804("recyclerView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0137, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x013e, code lost:
    
        if (r7 != r12.f54189.get()) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0140, code lost:
    
        r0 = r12.f54191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0142, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0143, code lost:
    
        r12.f54191.wait(1000);
        r3 = l.C8058.f24861;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x014c, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0153, code lost:
    
        if (r1.mo19832() != l.EnumC13728.DESTROYED) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x000b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
    
        if (r4 >= r0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ca, code lost:
    
        r5 = r11.f60263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ce, code lost:
    
        if (r5 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d4, code lost:
    
        if (r5.m7901() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d8, code lost:
    
        if (r12.f54190 != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e0, code lost:
    
        if (r7 == r12.f54189.get()) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e4, code lost:
    
        r5 = r11.f60263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e8, code lost:
    
        if (r5 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ee, code lost:
    
        if (r0 == r5.m7895()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f2, code lost:
    
        r5 = (l.InterfaceC17889) r6.get(r4);
        r8 = r5.mo36984();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00fc, code lost:
    
        if (r8 == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00fe, code lost:
    
        r8 = r2.mo9350((l.AbstractC16891) null, r5, r8);
        l.C11233.m27803(r8, "loadDataIcon(...)");
        r5.mo36966(r8);
        r8 = r11.f60263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x010e, code lost:
    
        if (r8 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0110, code lost:
    
        r8.post(new l.RunnableC22793(r12, r5, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x011a, code lost:
    
        l.C11233.m27804("recyclerView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0126, code lost:
    
        if (r1.mo19832() != l.EnumC13728.DESTROYED) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0129, code lost:
    
        r4 = r4 + 1;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m41435(l.ViewOnClickListenerC19121 r11, final l.C17709 r12) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17709.m41435(l.᩵֡᩷, l.ᩳ֡᩷):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41441(InterfaceC17889 interfaceC17889) {
        C2447 c2447;
        C2447 c24472;
        C2447 c24473;
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f54192;
        c2447 = viewOnClickListenerC19121.f60263;
        if (c2447 == null) {
            C11233.m27804("recyclerView");
            throw null;
        }
        int childCount = c2447.getChildCount();
        for (int i = 0; i < childCount; i++) {
            c24472 = viewOnClickListenerC19121.f60263;
            if (c24472 == null) {
                C11233.m27804("recyclerView");
                throw null;
            }
            View childAt = c24472.getChildAt(i);
            if (childAt != null) {
                c24473 = viewOnClickListenerC19121.f60263;
                if (c24473 == null) {
                    C11233.m27804("recyclerView");
                    throw null;
                }
                AbstractC3255 childViewHolder = c24473.getChildViewHolder(childAt);
                C11233.m27800((Object) childViewHolder, "null cannot be cast to non-null type bin.mt.plus.FilePickerActivity.FileListHolder");
                ViewOnClickListenerC10507 viewOnClickListenerC10507 = (ViewOnClickListenerC10507) childViewHolder;
                C11813 icon = interfaceC17889.getIcon();
                if (viewOnClickListenerC10507.m26406() == interfaceC17889 && icon != null) {
                    ImageView m26408 = viewOnClickListenerC10507.m26408();
                    Drawable drawable = m26408.getDrawable();
                    if (drawable == null) {
                        drawable = new ColorDrawable(0);
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, icon.m28878()});
                    transitionDrawable.setCrossFadeEnabled(true);
                    m26408.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                    return;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41442(boolean z) {
        List<InterfaceC17889> list;
        C12623 c12623;
        this.f54190 = true;
        this.f54189.incrementAndGet();
        C20844 c20844 = C20844.f67485;
        list = this.f54192.f60259;
        for (InterfaceC17889 interfaceC17889 : list) {
            if (interfaceC17889.getIcon() == null) {
                interfaceC17889.mo36967(c20844.mo11258(interfaceC17889));
                int mo9351 = c20844.mo9351(interfaceC17889);
                if (mo9351 != 0) {
                    interfaceC17889.mo36974(mo9351);
                }
            }
        }
        if (z) {
            this.f54188 = System.currentTimeMillis();
        }
        c12623 = this.f54192.f60257;
        if (c12623 == null) {
            C11233.m27804("adapter");
            throw null;
        }
        c12623.notifyDataSetChanged();
        this.f54190 = false;
        synchronized (this.f54191) {
            this.f54191.notifyAll();
            C8058 c8058 = C8058.f24861;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r0 < r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r0 < r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        if (r9 == null) goto L36;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m41438(java.lang.Integer r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r10 == 0) goto L85
            l.᩵֡᩷ r2 = r8.f54192
            java.util.List r3 = l.ViewOnClickListenerC19121.m44125(r2)
            java.lang.String r4 = "<this>"
            l.C11233.m27805(r3, r4)
            l.ᩴܶ᩵ r4 = new l.ᩴܶ᩵
            l.ۜܶ᩵ r5 = new l.ۜܶ᩵
            r5.<init>(r3)
            r4.<init>(r5)
            java.util.Iterator r3 = r4.iterator()
        L20:
            r4 = r3
            l.᩵ܶ᩵ r4 = (l.C19553) r4
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L48
            java.lang.Object r4 = r4.next()
            r5 = r4
            l.ۘܶ᩵ r5 = (l.C4030) r5
            java.lang.Object r5 = r5.m12127()
            l.ᩳۜܳ r5 = (l.InterfaceC17889) r5
            boolean r7 = r5.isDirectory()
            if (r7 == 0) goto L20
            java.lang.String r5 = r5.getName()
            boolean r5 = l.C11233.m27802(r5, r10)
            if (r5 == 0) goto L20
            goto L49
        L48:
            r4 = r6
        L49:
            l.ۘܶ᩵ r4 = (l.C4030) r4
            if (r4 == 0) goto L51
            int r0 = r4.m12128()
        L51:
            l.ۖۢۡ r2 = l.ViewOnClickListenerC19121.m44137(r2)
            if (r2 == 0) goto L7f
            int r2 = r2.m7899()
            int r2 = r2 + (-1)
            r3 = 5
            if (r3 >= r2) goto L61
            goto L62
        L61:
            r2 = 5
        L62:
            if (r9 != 0) goto L6b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            if (r0 >= r2) goto L88
            goto L87
        L6b:
            int r3 = r9.intValue()
            if (r0 < r3) goto L78
            int r3 = r9.intValue()
            int r3 = r3 + r2
            if (r3 > r0) goto L88
        L78:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            if (r0 >= r2) goto L88
            goto L87
        L7f:
            java.lang.String r9 = "recyclerView"
            l.C11233.m27804(r9)
            throw r6
        L85:
            if (r9 != 0) goto L88
        L87:
            r9 = r1
        L88:
            int r9 = r9.intValue()
            r8.m41437(r9)
            if (r10 == 0) goto L99
            r8.f54186 = r10
            long r9 = java.lang.System.currentTimeMillis()
            r8.f54187 = r9
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17709.m41438(java.lang.Integer, java.lang.String):void");
    }
}
