package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import java.util.List;

/* compiled from: H8RW */
/* renamed from: l.ᩳ۫֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18045 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC9608 f56237;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f56240;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f56241;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C18045 f56239 = new C18045(AbstractC14545.of((Object) C16633.f51080));

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final AbstractC14545 f56238 = AbstractC14545.m34734();

    public /* synthetic */ C18045(int i, List list) {
        this(list);
    }

    static {
        C6785 c6785 = new C6785();
        c6785.mo18428(5, 6);
        c6785.mo18428(17, 6);
        c6785.mo18428(7, 6);
        c6785.mo18428(30, 10);
        c6785.mo18428(18, 6);
        c6785.mo18428(6, 8);
        c6785.mo18428(8, 8);
        c6785.mo18428(14, 8);
        f56237 = c6785.mo18430();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18045 m42101(Context context, C18231 c18231, C9579 c9579) {
        return m42100(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c18231, c9579);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r3.equals("Xiaomi") == false) goto L44;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C18045 m42100(android.content.Context r5, android.content.Intent r6, l.C18231 r7, l.C9579 r8) {
        /*
            android.media.AudioManager r0 = l.C2171.m7181(r5)
            r1 = 33
            if (r8 == 0) goto L9
            goto L13
        L9:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r1) goto L12
            l.ۢ۫֫ r8 = l.C10990.m27303(r0, r7)
            goto L13
        L12:
            r8 = 0
        L13:
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "android.hardware.type.automotive"
            r4 = 23
            if (r2 < r1) goto L32
            boolean r1 = l.C3603.m11050(r5)
            if (r1 != 0) goto L2d
            if (r2 < r4) goto L32
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            boolean r1 = r1.hasSystemFeature(r3)
            if (r1 == 0) goto L32
        L2d:
            l.ᩳ۫֫ r5 = l.C10990.m27302(r0, r7)
            return r5
        L32:
            if (r2 < r4) goto L3d
            boolean r8 = l.C7481.m20103(r0, r8)
            if (r8 == 0) goto L3d
            l.ᩳ۫֫ r5 = l.C18045.f56239
            return r5
        L3d:
            l.۫۬ܺ r8 = new l.۫۬ܺ
            r8.<init>()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.mo6130(r0)
            r0 = 29
            r1 = 10
            if (r2 < r0) goto L7b
            boolean r0 = l.C3603.m11050(r5)
            if (r0 != 0) goto L62
            if (r2 < r4) goto L7b
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L7b
        L62:
            l.ܳ۬ܺ r5 = l.C1817.m6039(r7)
            r8.mo16260(r5)
            l.ᩳ۫֫ r5 = new l.ᩳ۫֫
            l.ۛ۬ܺ r6 = r8.mo30595()
            int[] r6 = l.C13426.m32449(r6)
            l.ܳ۬ܺ r6 = m42099(r1, r6)
            r5.<init>(r6)
            return r5
        L7b:
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.lang.String r7 = "use_external_surround_sound_flag"
            r0 = 0
            int r7 = android.provider.Settings.Global.getInt(r5, r7, r0)
            r2 = 1
            if (r7 != r2) goto L8b
            r7 = 1
            goto L8c
        L8b:
            r7 = 0
        L8c:
            if (r7 != 0) goto La0
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Amazon"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto La0
            java.lang.String r4 = "Xiaomi"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lad
        La0:
            java.lang.String r3 = "external_surround_sound_enabled"
            int r5 = android.provider.Settings.Global.getInt(r5, r3, r0)
            if (r5 != r2) goto Lad
            l.ܳ۬ܺ r5 = l.C18045.f56238
            r8.mo16260(r5)
        Lad:
            if (r6 == 0) goto Le0
            if (r7 != 0) goto Le0
            java.lang.String r5 = "android.media.extra.AUDIO_PLUG_STATE"
            int r5 = r6.getIntExtra(r5, r0)
            if (r5 != r2) goto Le0
            java.lang.String r5 = "android.media.extra.ENCODINGS"
            int[] r5 = r6.getIntArrayExtra(r5)
            if (r5 == 0) goto Lc8
            java.util.List r5 = l.C13426.m32448(r5)
            r8.mo16260(r5)
        Lc8:
            l.ᩳ۫֫ r5 = new l.ᩳ۫֫
            l.ۛ۬ܺ r7 = r8.mo30595()
            int[] r7 = l.C13426.m32449(r7)
            java.lang.String r8 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r6 = r6.getIntExtra(r8, r1)
            l.ܳ۬ܺ r6 = m42099(r6, r7)
            r5.<init>(r6)
            return r5
        Le0:
            l.ᩳ۫֫ r5 = new l.ᩳ۫֫
            l.ۛ۬ܺ r6 = r8.mo30595()
            int[] r6 = l.C13426.m32449(r6)
            l.ܳ۬ܺ r6 = m42099(r1, r6)
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18045.m42100(android.content.Context, android.content.Intent, l.ᩳᩴ֫, l.ۢ۫֫):l.ᩳ۫֫");
    }

    public C18045(List list) {
        this.f56240 = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            C16633 c16633 = (C16633) list.get(i);
            this.f56240.put(c16633.f51082, c16633);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f56240.size(); i3++) {
            i2 = Math.max(i2, ((C16633) this.f56240.valueAt(i3)).f51083);
        }
        this.f56241 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r5 != 5) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair m42102(l.C18231 r8, l.C8353 r9) {
        /*
            r7 = this;
            java.lang.String r0 = r9.f25614
            r0.getClass()
            java.lang.String r1 = r9.f25619
            int r0 = l.C9786.m24805(r0, r1)
            l.ۢ۬ܺ r1 = l.C18045.f56237
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L19
            goto Lad
        L19:
            r1 = 7
            r2 = 6
            r3 = 8
            r4 = 18
            android.util.SparseArray r5 = r7.f56240
            if (r0 != r4) goto L2b
            boolean r6 = l.C3603.m11027(r5, r4)
            if (r6 != 0) goto L2b
            r0 = 6
            goto L3e
        L2b:
            if (r0 != r3) goto L33
            boolean r3 = l.C3603.m11027(r5, r3)
            if (r3 == 0) goto L3d
        L33:
            r3 = 30
            if (r0 != r3) goto L3e
            boolean r3 = l.C3603.m11027(r5, r3)
            if (r3 != 0) goto L3e
        L3d:
            r0 = 7
        L3e:
            boolean r3 = l.C3603.m11027(r5, r0)
            if (r3 != 0) goto L46
            goto Lad
        L46:
            java.lang.Object r3 = r5.get(r0)
            l.ܽ۫֫ r3 = (l.C16633) r3
            r3.getClass()
            int r5 = r9.f25625
            r6 = -1
            if (r5 == r6) goto L73
            if (r0 != r4) goto L57
            goto L73
        L57:
            java.lang.String r8 = r9.f25614
            java.lang.String r9 = "audio/vnd.dts.uhd;profile=p2"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L6c
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 33
            if (r8 >= r9) goto L6c
            r8 = 10
            if (r5 <= r8) goto L7f
            goto Lad
        L6c:
            boolean r8 = r3.m39166(r5)
            if (r8 != 0) goto L7f
            goto Lad
        L73:
            int r9 = r9.f25624
            if (r9 == r6) goto L78
            goto L7b
        L78:
            r9 = 48000(0xbb80, float:6.7262E-41)
        L7b:
            int r5 = r3.m39165(r9, r8)
        L7f:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r8 > r9) goto L94
            if (r5 != r1) goto L8a
            r2 = 8
            goto L95
        L8a:
            r9 = 3
            if (r5 == r9) goto L95
            r9 = 4
            if (r5 == r9) goto L95
            r9 = 5
            if (r5 != r9) goto L94
            goto L95
        L94:
            r2 = r5
        L95:
            r9 = 26
            if (r8 > r9) goto La7
            java.lang.String r8 = "fugu"
            java.lang.String r9 = android.os.Build.DEVICE
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto La7
            r8 = 1
            if (r2 != r8) goto La7
            r2 = 2
        La7:
            int r8 = l.C3603.m11035(r2)
            if (r8 != 0) goto Laf
        Lad:
            r8 = 0
            return r8
        Laf:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18045.m42102(l.ᩳᩴ֫, l.۠ᩴ֫):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18045)) {
            return false;
        }
        C18045 c18045 = (C18045) obj;
        return C3603.m11028(this.f56240, c18045.f56240) && this.f56241 == c18045.f56241;
    }

    public final int hashCode() {
        return (C3603.m11007(this.f56240) * 31) + this.f56241;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f56241 + ", audioProfiles=" + this.f56240 + "]";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m42099(int i, int[] iArr) {
        int i2 = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            c1846.m16264(new C16633(i3, i));
        }
        return c1846.m6131();
    }
}
