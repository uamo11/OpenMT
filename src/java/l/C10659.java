package l;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: J8TX */
/* renamed from: l.ۧ֨֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10659 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C10659 f32062;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Executor f32063;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f32064;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f32065;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f32066;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f32067;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C10659 m26749(Context context) {
        C10659 c10659;
        synchronized (C10659.class) {
            if (f32062 == null) {
                f32062 = new C10659(context);
            }
            c10659 = f32062;
        }
        return c10659;
    }

    public C10659(final Context context) {
        Executor m27178 = C10881.m27178();
        this.f32063 = m27178;
        this.f32065 = new CopyOnWriteArrayList();
        this.f32067 = new Object();
        this.f32066 = 0;
        m27178.execute(new Runnable() { // from class: l.۫ۚ֫
            @Override // java.lang.Runnable
            public final void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new C1486(this), intentFilter);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26753() {
        int i;
        synchronized (this.f32067) {
            i = this.f32066;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m26750(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f32065;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C13604 c13604 = (C13604) it.next();
            if (c13604.m32720()) {
                copyOnWriteArrayList.remove(c13604);
            }
        }
        synchronized (this.f32067) {
            if (this.f32064 && this.f32066 == i) {
                return;
            }
            this.f32064 = true;
            this.f32066 = i;
            Iterator it2 = this.f32065.iterator();
            while (it2.hasNext()) {
                ((C13604) it2.next()).m32719();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26754(C10436 c10436, Executor executor) {
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f32065;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C13604 c13604 = (C13604) it.next();
            if (c13604.m32720()) {
                copyOnWriteArrayList.remove(c13604);
            }
        }
        C13604 c136042 = new C13604(this, c10436, executor);
        synchronized (this.f32067) {
            this.f32065.add(c136042);
            z = this.f32064;
        }
        if (z) {
            c136042.m32719();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26751(Context context, C10659 c10659) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (Build.VERSION.SDK_INT >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && i == 5) {
            C5844.m16367(context, c10659);
        } else {
            c10659.m26750(i);
        }
    }
}
