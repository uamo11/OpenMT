package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import com.alipay.sdk.m.o.b;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: 2B21 */
/* renamed from: l.ܽۤ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16569 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f50932;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object f50933;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C3432 f50934;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C1315 f50935 = new C1315(16);

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC20804());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f50932 = threadPoolExecutor;
        f50933 = new Object();
        f50934 = new C3432();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m39074(Context context, C11692 c11692, int i, C15218 c15218) {
        Handler handler;
        String str = c11692.m28584() + "-" + i;
        Typeface typeface = (Typeface) f50935.m4553(str);
        if (typeface != null) {
            c15218.m36013(new C10926(typeface));
            return typeface;
        }
        C13807 c13807 = new C13807(c15218);
        synchronized (f50933) {
            C3432 c3432 = f50934;
            ArrayList arrayList = (ArrayList) c3432.getOrDefault(str, null);
            if (arrayList != null) {
                arrayList.add(c13807);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c13807);
            c3432.put(str, arrayList2);
            CallableC7458 callableC7458 = new CallableC7458(str, context, c11692, i);
            ThreadPoolExecutor threadPoolExecutor = f50932;
            C1753 c1753 = new C1753(str);
            if (Looper.myLooper() == null) {
                handler = new Handler(Looper.getMainLooper());
            } else {
                handler = new Handler();
            }
            threadPoolExecutor.execute(new RunnableC8809(handler, callableC7458, c1753));
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m39075(Context context, C11692 c11692, C15218 c15218, int i, int i2) {
        String str = c11692.m28584() + "-" + i;
        Typeface typeface = (Typeface) f50935.m4553(str);
        if (typeface != null) {
            c15218.m36013(new C10926(typeface));
            return typeface;
        }
        if (i2 == -1) {
            C10926 m39076 = m39076(str, context, c11692, i);
            c15218.m36013(m39076);
            return m39076.f32835;
        }
        try {
            try {
                try {
                    try {
                        C10926 c10926 = (C10926) f50932.submit(new CallableC22980(str, context, c11692, i)).get(i2, TimeUnit.MILLISECONDS);
                        c15218.m36013(c10926);
                        return c10926.f32835;
                    } catch (TimeoutException unused) {
                        throw new InterruptedException(b.n0);
                    }
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        } catch (InterruptedException unused2) {
            c15218.m36013(new C10926(-3));
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10926 m39076(String str, Context context, C11692 c11692, int i) {
        C1315 c1315 = f50935;
        Typeface typeface = (Typeface) c1315.m4553(str);
        if (typeface != null) {
            return new C10926(typeface);
        }
        try {
            C17981 m16878 = C6047.m16878(context, c11692);
            int i2 = 1;
            if (m16878.m42022() != 0) {
                if (m16878.m42022() == 1) {
                    i2 = -2;
                }
                i2 = -3;
            } else {
                C17275[] m42021 = m16878.m42021();
                if (m42021 != null && m42021.length != 0) {
                    int length = m42021.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i2 = 0;
                            break;
                        }
                        int m40563 = m42021[i3].m40563();
                        if (m40563 == 0) {
                            i3++;
                        } else if (m40563 >= 0) {
                            i2 = m40563;
                        }
                    }
                    i2 = -3;
                }
            }
            if (i2 != 0) {
                return new C10926(i2);
            }
            Typeface m18418 = C6773.m18418(context, m16878.m42021(), i);
            if (m18418 != null) {
                c1315.m4554(str, m18418);
                return new C10926(m18418);
            }
            return new C10926(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C10926(-1);
        }
    }
}
