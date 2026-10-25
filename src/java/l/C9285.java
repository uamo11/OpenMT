package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 19LE */
/* renamed from: l.ۢ֫᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9285 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f28125;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f28126 = new ArrayList();

    public C9285(byte[] bArr) {
        m23818(bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        this.f28125 = decodeByteArray;
        if (decodeByteArray == null) {
            throw new IOException("Decode bitmap failed");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23818(byte[] bArr) {
        C12951 c12951 = new C12951(bArr);
        C22124.m49722((InterfaceC20008) c12951, 1196314761);
        C22124.m49722((InterfaceC20008) c12951, 169478669);
        boolean z = false;
        while (c12951.available() > 0) {
            int m31492 = c12951.m31492();
            C14222 c14222 = new C14222();
            c14222.f42895 = c12951.readInt();
            byte[] bArr2 = new byte[m31492];
            c12951.m31489(m31492, bArr2);
            c14222.f42894 = bArr2;
            c14222.f42893 = c12951.m31492();
            this.f28126.add(c14222);
            if (c14222.f42895 == 1413563465) {
                z = true;
            }
        }
        if (!z) {
            throw new IOException("Data chunk not found");
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m23823() {
        ArrayList arrayList = this.f28126;
        Iterator it = arrayList.iterator();
        int i = 8;
        while (it.hasNext()) {
            i += ((C14222) it.next()).f42894.length + 12;
        }
        C10130 c10130 = new C10130(i);
        c10130.writeInt(1196314761);
        c10130.writeInt(169478669);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C14222 c14222 = (C14222) it2.next();
            c10130.m25430(c14222.f42894.length);
            c10130.writeInt(c14222.f42895);
            c10130.write(c14222.f42894);
            c10130.m25430(c14222.f42893);
        }
        return c10130.m25438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23819(BufferedOutputStream bufferedOutputStream) {
        int width = this.f28125.getWidth();
        int height = this.f28125.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width + 2, height + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setFilterBitmap(false);
        canvas.drawBitmap(this.f28125, 1.0f, 1.0f, paint);
        canvas.translate(1.0f, 1.0f);
        C12260 m23827 = m23827();
        if (m23827 != null) {
            Rect rect = m23827.f36519;
            ArrayList arrayList = m23827.f36521;
            ArrayList arrayList2 = m23827.f36520;
            paint.setColor(-16777216);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C4499 c4499 = (C4499) it.next();
                canvas.drawRect(c4499.f14318, -1.0f, c4499.f14317, 0.0f, paint);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C4499 c44992 = (C4499) it2.next();
                canvas.drawRect(-1.0f, c44992.f14318, 0.0f, c44992.f14317, paint);
            }
            if (!rect.equals(C12260.m29753(arrayList2, arrayList, width, height))) {
                canvas.drawRect(rect.left, height, width - rect.right, height + 1, paint);
                canvas.drawRect(width, rect.top, width + 1, height - rect.bottom, paint);
            }
        }
        if (m23826() != null) {
            paint.setColor(-65536);
            float f = height;
            float f2 = height + 1;
            canvas.drawRect(0.0f, f, r12.f52234, f2, paint);
            float f3 = width;
            canvas.drawRect(width - r12.f52235, f, f3, f2, paint);
            float f4 = width + 1;
            canvas.drawRect(f3, 0.0f, f4, r12.f52236, paint);
            canvas.drawRect(f3, height - r12.f52236, f4, f, paint);
        }
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12260 m23827() {
        Iterator it = this.f28126.iterator();
        while (it.hasNext()) {
            C14222 c14222 = (C14222) it.next();
            if (c14222.f42895 == 1666478190) {
                C12260 c12260 = new C12260();
                C12951 c12951 = new C12951(c14222.f42894);
                c12951.skipBytes(1);
                byte readByte = c12951.readByte();
                byte readByte2 = c12951.readByte();
                int readByte3 = c12951.readByte();
                int readInt = c12951.readInt();
                int readInt2 = c12951.readInt();
                Rect rect = c12260.f36519;
                rect.left = c12951.m31492();
                rect.right = c12951.m31492();
                rect.top = c12951.m31492();
                rect.bottom = c12951.m31492();
                int readInt3 = c12951.readInt();
                c12951.seek(readInt);
                for (int i = readByte / 2; i > 0; i--) {
                    c12260.f36520.add(new C4499(c12951.m31492(), c12951.m31492()));
                }
                c12951.seek(readInt2);
                for (int i2 = readByte2 / 2; i2 > 0; i2--) {
                    c12260.f36521.add(new C4499(c12951.m31492(), c12951.m31492()));
                }
                c12951.seek(readInt3);
                c12260.f36518 = new int[readByte3];
                for (byte b = 0; b < readByte3; b = (byte) (b + 1)) {
                    c12260.f36518[b] = c12951.m31492();
                }
                c12260.m29756(this.f28125);
                return c12260;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23820(C12260 c12260) {
        c12260.m29756(this.f28125);
        c12260.m29758(this.f28125);
        ArrayList arrayList = this.f28126;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14222 c14222 = (C14222) it.next();
            if (c14222.f42895 == 1666478190) {
                c14222.f42894 = c12260.m29757();
                c14222.m33882();
                return;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C14222) arrayList.get(i)).f42895 == 1413563465) {
                C14222 c142222 = new C14222();
                c142222.f42895 = 1666478190;
                c142222.f42894 = c12260.m29757();
                c142222.m33882();
                arrayList.add(i, c142222);
                return;
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17045 m23826() {
        Iterator it = this.f28126.iterator();
        while (it.hasNext()) {
            C14222 c14222 = (C14222) it.next();
            if (c14222.f42895 == 1649176686) {
                C17045 c17045 = new C17045();
                C12951 c12951 = new C12951(c14222.f42894);
                c17045.f52234 = c12951.readInt();
                c17045.f52236 = c12951.readInt();
                c17045.f52235 = c12951.readInt();
                c17045.f52233 = c12951.readInt();
                return c17045;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23821(C17045 c17045) {
        ArrayList arrayList = this.f28126;
        if (c17045 == null) {
            C5378.removeIf(arrayList, new C20574(0));
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14222 c14222 = (C14222) it.next();
            if (c14222.f42895 == 1649176686) {
                c14222.f42894 = c17045.m40012();
                c14222.m33882();
                return;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C14222) arrayList.get(i)).f42895 == 1413563465) {
                C14222 c142222 = new C14222();
                c142222.f42895 = 1649176686;
                c142222.f42894 = c17045.m40012();
                c142222.m33882();
                arrayList.add(i, c142222);
                return;
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m23824() {
        Iterator it = this.f28126.iterator();
        while (it.hasNext()) {
            if (((C14222) it.next()).f42895 == 1666478190) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0215, code lost:
    
        return false;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m23822() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9285.m23822():boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m23817(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = -1;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (Color.alpha(i3) == 0) {
                i3 = 0;
            }
            if (i3 != -16777216) {
                if (i3 != 0) {
                    return null;
                }
                if (z) {
                    arrayList.add(new C4499(i, i2));
                    z = false;
                }
            } else if (!z) {
                i = i2;
                z = true;
            }
        }
        if (z) {
            arrayList.add(new C4499(i, length));
        }
        return arrayList;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Bitmap m23825() {
        return this.f28125;
    }
}
