package l;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: V2SC */
/* renamed from: l.۫۠ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12284 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap f36590;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36591;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36592;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f36593;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f36594;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f36595;

    public C12284(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f36592 = arrayList;
        this.f36593 = 16;
        this.f36595 = 12544;
        this.f36594 = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f36591 = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(C11579.f34521);
        this.f36590 = bitmap;
        arrayList.add(C22867.f73785);
        arrayList.add(C22867.f73784);
        arrayList.add(C22867.f73782);
        arrayList.add(C22867.f73781);
        arrayList.add(C22867.f73780);
        arrayList.add(C22867.f73783);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11579 m29816() {
        int max;
        Bitmap bitmap = this.f36590;
        if (bitmap == null) {
            throw new AssertionError();
        }
        double d = -1.0d;
        int i = this.f36595;
        if (i > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i) {
                d = Math.sqrt(i / height);
            }
        } else {
            int i2 = this.f36594;
            if (i2 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i2) {
                d = i2 / max;
            }
        }
        Bitmap createScaledBitmap = d <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        ArrayList arrayList = this.f36591;
        C3112 c3112 = new C3112(iArr, this.f36593, arrayList.isEmpty() ? null : (InterfaceC10168[]) arrayList.toArray(new InterfaceC10168[arrayList.size()]));
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        C11579 c11579 = new C11579(c3112.f9727, this.f36592);
        c11579.m28466();
        return c11579;
    }
}
