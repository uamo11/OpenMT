package l;

import android.graphics.Point;
import android.graphics.Rect;

/* compiled from: PAKQ */
/* renamed from: l.᩹ۨܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC22269 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC3219 f72247;

    public RunnableC22269(ServiceC3219 serviceC3219) {
        this.f72247 = serviceC3219;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8091 c8091;
        C8091 c80912;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Point point;
        Rect rect5;
        Rect rect6;
        Point point2;
        C8091 c80913;
        C8091 c80914;
        C8091 c80915;
        C8091 c80916;
        int[] iArr = new int[2];
        ServiceC3219 serviceC3219 = this.f72247;
        c8091 = serviceC3219.f10125;
        c8091.getLocationOnScreen(iArr);
        if (iArr[0] == 0 && iArr[1] == 0) {
            C4925.m14316(this, 50L);
            return;
        }
        int[] iArr2 = new int[2];
        c80912 = serviceC3219.f10125;
        c80912.m21471(iArr2);
        rect = serviceC3219.f10131;
        rect.left = iArr[0] - iArr2[0];
        rect2 = serviceC3219.f10131;
        rect2.top = iArr[1] - iArr2[1];
        rect3 = serviceC3219.f10131;
        rect4 = serviceC3219.f10131;
        int i = rect4.left;
        point = serviceC3219.f10136;
        rect3.right = i + point.x;
        rect5 = serviceC3219.f10131;
        rect6 = serviceC3219.f10131;
        int i2 = rect6.top;
        point2 = serviceC3219.f10136;
        rect5.bottom = i2 + point2.y;
        int i3 = iArr[0];
        c80913 = serviceC3219.f10125;
        int width = (c80913.getWidth() / 2) + i3;
        int i4 = iArr[1];
        c80914 = serviceC3219.f10125;
        serviceC3219.m9863(width, (c80914.getHeight() / 2) + i4);
        c80915 = serviceC3219.f10124;
        c80915.m21466();
        c80916 = serviceC3219.f10125;
        c80916.m21469((C0396) null);
    }
}
