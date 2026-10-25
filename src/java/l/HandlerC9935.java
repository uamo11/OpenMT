package l;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* compiled from: 21WX */
/* renamed from: l.ۤ֡ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class HandlerC9935 extends Handler {
    public /* synthetic */ HandlerC9935(int i) {
        this();
    }

    public HandlerC9935() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2;
        ThreadLocal threadLocal3;
        boolean z;
        long j;
        ThreadLocal threadLocal4;
        ThreadLocal threadLocal5;
        long j2;
        threadLocal = C11346.f33950;
        ArrayList arrayList = (ArrayList) threadLocal.get();
        threadLocal2 = C11346.f33949;
        ArrayList arrayList2 = (ArrayList) threadLocal2.get();
        int i = message.what;
        if (i == 0) {
            threadLocal3 = C11346.f33948;
            ArrayList arrayList3 = (ArrayList) threadLocal3.get();
            boolean z2 = arrayList.size() <= 0 && arrayList2.size() <= 0;
            while (arrayList3.size() > 0) {
                ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                arrayList3.clear();
                int size = arrayList4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C11346 c11346 = (C11346) arrayList4.get(i2);
                    j = c11346.f33955;
                    if (j == 0) {
                        c11346.m28066();
                    } else {
                        arrayList2.add(c11346);
                    }
                }
            }
            z = z2;
        } else if (i != 1) {
            return;
        } else {
            z = true;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        threadLocal4 = C11346.f33943;
        ArrayList arrayList5 = (ArrayList) threadLocal4.get();
        threadLocal5 = C11346.f33946;
        ArrayList arrayList6 = (ArrayList) threadLocal5.get();
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C11346 c113462 = (C11346) arrayList2.get(i3);
            if (C11346.m28056(c113462, currentAnimationTimeMillis)) {
                arrayList5.add(c113462);
            }
        }
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i4 = 0; i4 < size3; i4++) {
                C11346 c113463 = (C11346) arrayList5.get(i4);
                c113463.m28066();
                c113463.f33967 = true;
                arrayList2.remove(c113463);
            }
            arrayList5.clear();
        }
        int size4 = arrayList.size();
        int i5 = 0;
        while (i5 < size4) {
            C11346 c113464 = (C11346) arrayList.get(i5);
            if (c113464.m28075(currentAnimationTimeMillis)) {
                arrayList6.add(c113464);
            }
            if (arrayList.size() == size4) {
                i5++;
            } else {
                size4--;
                arrayList6.remove(c113464);
            }
        }
        if (arrayList6.size() > 0) {
            for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                ((C11346) arrayList6.get(i6)).m28058();
            }
            arrayList6.clear();
        }
        if (z) {
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            j2 = C11346.f33945;
            sendEmptyMessageDelayed(1, Math.max(0L, j2 - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
        }
    }
}
