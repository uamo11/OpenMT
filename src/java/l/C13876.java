package l;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.ToIntFunction;
import moe.shizuku.server.IShizukuApplication;

/* compiled from: H1KB */
/* renamed from: l.ܰܳۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13876 extends AbstractC19902 {

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final C8817 f41361 = C8817.m22789();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f41362;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f41363;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41364;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f41365;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public long f41366;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f41367;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Drawable f41368;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public long f41369;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f41370;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Drawable f41371;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f41372;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f41373;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C13132 f41374;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public HashSet f41375;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC15287 f41376;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC8233 f41377;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7527 f41378;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18383 f41379;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Set f41380;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f41381;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ArrayList f41382;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C11328 f41383;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence mo33249(String str, String str2, boolean z) {
        return str2;
    }

    /* renamed from: ۘ */
    public boolean mo25497() {
        return false;
    }

    /* renamed from: ۜ */
    public int mo15999() {
        return 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean mo33277(String str) {
        return true;
    }

    public C13876() {
        this(m33247("C"));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Drawable[] m33247(String str) {
        AbstractC21294 abstractC21294 = C19883.f64226;
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        if (C21943.f70270) {
            paint.setShadowLayer(2.5f, 1.0f, 1.0f, 1342177280);
        }
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.MONOSPACE);
        paint2.setTextSize(C11266.m27880(14 - str.length()));
        int m27878 = C11266.m27878(25.0f);
        int m278782 = C11266.m27878(12.5f);
        int m278783 = C11266.m27878(11.0f);
        int m278784 = C11266.m27878(5.0f);
        int m278785 = C11266.m27878(2.0f);
        paint2.setColor(abstractC21294.mo7430());
        paint2.setAlpha(C21943.m49424(200, 255));
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        float f3 = m278782;
        float f4 = (f3 - f2) - ((f - f2) / 2.0f);
        Bitmap createBitmap = Bitmap.createBitmap(m27878, m27878, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        paint.setColor(abstractC21294.mo7429());
        canvas.drawCircle(f3, f3, m278783, paint);
        canvas.drawText(str, f3, f4, paint2);
        C12324 c12324 = new C12324();
        c12324.f36887 = m27878;
        c12324.f36890 = m278782;
        c12324.f36889 = m278785;
        c12324.f36888 = m278784;
        c12324.f36886 = null;
        return new Drawable[]{new BitmapDrawable(createBitmap), new BitmapDrawable(RunnableC5974.m16746(c12324, C19883.f64184, R.drawable.MT_Protector_res_0x7f080121))};
    }

    public C13876(Drawable[] drawableArr) {
        this.f41370 = C11266.m27878(25.0f);
        this.f41362 = C11266.m27878(17.0f);
        this.f41364 = false;
        this.f41365 = false;
        this.f41382 = new ArrayList();
        C11328 c11328 = new C11328();
        c11328.f33901 = new ArrayList();
        this.f41383 = c11328;
        this.f41375 = new HashSet();
        this.f41373 = new ArrayList();
        this.f41380 = Collections.newSetFromMap(new WeakHashMap());
        this.f41371 = drawableArr[0];
        this.f41368 = drawableArr[1];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33252(int i, Collection collection) {
        C14336 m34211 = C14336.m34211(collection);
        m34211.m34216(i);
        m33260(m34211.m34215());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33260(C17159 c17159) {
        C11328 c11328 = this.f41383;
        ArrayList arrayList = c11328.f33901;
        ArrayList arrayList2 = c11328.f33901;
        arrayList.clear();
        for (C17159 c171592 : c17159.m40251()) {
            C7527 c7527 = new C7527(c171592, (C7527) null);
            arrayList2.add(c7527);
            m33243(c171592, c7527);
        }
        Iterator it = c17159.m40254().iterator();
        while (it.hasNext()) {
            arrayList2.add(new C7527((C10810) it.next(), (C7527) null));
        }
        ArrayList arrayList3 = this.f41382;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        this.f41373.clear();
        notifyDataSetChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33243(C17159 c17159, C7527 c7527) {
        ArrayList arrayList = c7527.f23154;
        for (C17159 c171592 : c17159.m40251()) {
            C7527 c75272 = new C7527(c171592, c7527);
            arrayList.add(c75272);
            m33243(c171592, c75272);
        }
        Iterator it = c17159.m40254().iterator();
        while (it.hasNext()) {
            arrayList.add(new C7527((C10810) it.next(), c7527));
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11328 m33283() {
        return this.f41383;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33275() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f41382;
            if (i < arrayList.size()) {
                C7527 c7527 = (C7527) arrayList.get(i);
                if (c7527.m20181()) {
                    int i2 = i + 1;
                    int m33246 = m33246(c7527);
                    if (m33246 > 0) {
                        arrayList.subList(i2, m33246 + i2).clear();
                    }
                }
                i++;
            } else {
                this.f41373.clear();
                notifyDataSetChanged();
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33264(boolean z) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.f41382;
            if (i >= arrayList.size()) {
                break;
            }
            C7527 c7527 = (C7527) arrayList.get(i);
            if (!c7527.m20189() && !c7527.m20181()) {
                m33240(c7527, false, z);
            }
            i++;
        }
        if (z && mo25497()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C7527 c75272 = (C7527) arrayList.get(i2);
                if (c75272.m20189() && !c75272.m20188() && !c75272.m20181()) {
                    m33240(c75272, false, z);
                }
            }
        }
        this.f41373.clear();
        notifyDataSetChanged();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33278() {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.f41382;
            if (i >= arrayList.size()) {
                break;
            }
            C7527 c7527 = (C7527) arrayList.get(i);
            if (!c7527.m20189() && !c7527.m20181()) {
                m33240(c7527, false, true);
                if (arrayList.size() >= 200) {
                    break;
                }
            }
            i++;
        }
        if (mo25497()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C7527 c75272 = (C7527) arrayList.get(i2);
                if (c75272.m20189() && !c75272.m20188() && !c75272.m20181()) {
                    m33240(c75272, false, true);
                    if (arrayList.size() >= 200) {
                        break;
                    }
                }
            }
        }
        this.f41373.clear();
        notifyDataSetChanged();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet m33273() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f41382.iterator();
        while (it.hasNext()) {
            C7527 c7527 = (C7527) it.next();
            boolean m20181 = c7527.m20181();
            String str = c7527.f23157;
            if (m20181) {
                if (c7527.m20189()) {
                    hashSet.add(str);
                } else {
                    hashSet.add(str + "/");
                }
            }
        }
        return hashSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33255(HashSet hashSet) {
        this.f41382.clear();
        m33238(hashSet, (C7527) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33238(HashSet hashSet, C7527 c7527) {
        for (C7527 c75272 : c7527 == null ? this.f41383.f33901 : c7527.f23154) {
            ArrayList arrayList = this.f41382;
            arrayList.add(c75272);
            boolean m20189 = c75272.m20189();
            String str = c75272.f23157;
            if (!m20189) {
                boolean contains = hashSet.contains(str + "/");
                c75272.m20183(contains);
                if (contains) {
                    m33238(hashSet, c75272);
                }
            } else if (mo25497()) {
                boolean contains2 = hashSet.contains(str);
                c75272.m20183(contains2);
                if (contains2) {
                    int mo25499 = mo25499(str);
                    c75272.m20172(mo25499);
                    for (int i = 0; i < mo25499; i++) {
                        arrayList.add(new C7527(i, c75272));
                    }
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33276(C7527 c7527) {
        ArrayList arrayList = this.f41382;
        int indexOf = arrayList.indexOf(c7527);
        if (indexOf == -1) {
            return;
        }
        int i = indexOf + 1;
        int m33246 = m33246(c7527);
        if (m33246 > 0) {
            arrayList.subList(i, i + m33246).clear();
            notifyItemRangeRemoved(mo15999() + i, m33246);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m33246(C7527 c7527) {
        int i;
        if (!c7527.m20181()) {
            return 0;
        }
        if (c7527.m20189()) {
            if (!mo25497() || c7527.m20188()) {
                throw new RuntimeException();
            }
            i = c7527.m20186();
        } else {
            Iterator it = c7527.f23154.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += m33246((C7527) it.next()) + 1;
            }
            i = i2;
        }
        c7527.m20183(false);
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33257(C7527 c7527) {
        m33240(c7527, true, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33240(C7527 c7527, boolean z, boolean z2) {
        int i;
        ArrayList arrayList = this.f41382;
        int indexOf = arrayList.indexOf(c7527);
        if (indexOf == -1) {
            return;
        }
        int i2 = indexOf + 1;
        c7527.m20183(true);
        ArrayList arrayList2 = c7527.f23154;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C7527 c75272 = (C7527) it.next();
            c75272.m20183(false);
            c75272.m20185(false);
        }
        if (z2 && mo25497()) {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            if (c7527.m20189()) {
                if (c7527.m20188()) {
                    throw new RuntimeException();
                }
                int mo25499 = mo25499(c7527.f23157);
                c7527.m20172(mo25499);
                for (i = 0; i < mo25499; i++) {
                    arrayList3.add(new C7527(i, c7527));
                }
            } else {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C7527 c75273 = (C7527) it2.next();
                    arrayList3.add(c75273);
                    if (c75273.m20189()) {
                        c75273.m20183(true);
                        int mo254992 = mo25499(c75273.f23157);
                        c75273.m20172(mo254992);
                        for (int i3 = 0; i3 < mo254992; i3++) {
                            arrayList3.add(new C7527(i3, c75273));
                        }
                    }
                }
            }
            arrayList2 = arrayList3;
        } else if (c7527.m20189()) {
            throw new RuntimeException();
        }
        arrayList.addAll(i2, arrayList2);
        if (z) {
            notifyItemRangeInserted(mo15999() + i2, arrayList2.size());
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList m33284() {
        return this.f41382;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33258(InterfaceC8233 interfaceC8233) {
        this.f41377 = interfaceC8233;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33259(InterfaceC15287 interfaceC15287) {
        this.f41376 = interfaceC15287;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33262(InterfaceC18383 interfaceC18383) {
        this.f41379 = interfaceC18383;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33266(View view, C7527 c7527, AbstractViewOnClickListenerC17677 abstractViewOnClickListenerC17677) {
        InterfaceC8233 interfaceC8233 = this.f41377;
        if (c7527 == null || interfaceC8233 == null) {
            return false;
        }
        return interfaceC8233.mo16605(new C16971(this, abstractViewOnClickListenerC17677, view));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33253(View view, C7527 c7527, C5411 c5411) {
        if (mo25497() && mo25499(c7527.f23157) > 0) {
            if (!c7527.m20181()) {
                m33240(c7527, true, true);
                return;
            } else {
                m33276(c7527);
                return;
            }
        }
        InterfaceC15287 interfaceC15287 = this.f41376;
        if (c7527 == null || interfaceC15287 == null) {
            return;
        }
        if (!c7527.m20189()) {
            throw new RuntimeException();
        }
        interfaceC15287.mo16606(new C16971(this, c5411, view));
    }

    @Override // l.AbstractC19902
    public final void onAttachedToRecyclerView(C13132 c13132) {
        super.onAttachedToRecyclerView(c13132);
        C13132 c131322 = this.f41374;
        if (c131322 != null && c131322 != c13132) {
            throw new RuntimeException("RecyclerTreeAdaptor can not attach to multi RecyclerView.");
        }
        this.f41374 = c13132;
    }

    @Override // l.AbstractC19902
    public final void onDetachedFromRecyclerView(C13132 c13132) {
        super.onDetachedFromRecyclerView(c13132);
        this.f41374 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33254(Collection collection) {
        ArrayList<C7527> arrayList;
        boolean z;
        m33244();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf != -1) {
                hashSet.add(str.substring(0, lastIndexOf + 1));
            }
        }
        Iterator it2 = hashSet.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            arrayList = this.f41382;
            z = true;
            if (!hasNext) {
                break;
            }
            String str2 = (String) it2.next();
            C7527 c7527 = null;
            while (true) {
                if (c7527 != null) {
                    if (str2.equals(c7527.f23157 + "/")) {
                        break;
                    }
                }
                C7527 c75272 = null;
                for (C7527 c75273 : arrayList) {
                    boolean m20189 = c75273.m20189();
                    String str3 = c75273.f23157;
                    if (!m20189) {
                        if (str2.startsWith(str3 + '/') && (c75272 == null || c75272.f23157.length() < str3.length())) {
                            c75272 = c75273;
                        }
                    }
                }
                if (c75272 == null) {
                    break;
                }
                if (!c75272.m20181()) {
                    m33240(c75272, false, true);
                }
                arrayList = c75272.f23154;
                c7527 = c75272;
            }
            if (c7527 != null) {
                arrayList2.add(c7527);
            }
        }
        HashSet hashSet2 = this.f41375;
        hashSet2.clear();
        int size = arrayList.size();
        for (final int i = 0; i < size; i++) {
            C7527 c75274 = (C7527) arrayList.get(i);
            boolean m201892 = c75274.m20189();
            String str4 = c75274.f23157;
            if (m201892 && collection.contains(str4)) {
                if (z) {
                    final C13132 c13132 = this.f41374;
                    if (c13132 != null) {
                        c13132.post(new Runnable() { // from class: l.᩹ܳۡ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13132.this.scrollToPosition(i);
                            }
                        });
                    }
                    z = false;
                }
                hashSet2.add(str4);
            }
        }
        ArrayList arrayList3 = this.f41373;
        if (z) {
            C5378.stream(arrayList2).mapToInt(new ToIntFunction() { // from class: l.᩶ܳۡ
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    int indexOf;
                    indexOf = C13876.this.f41382.indexOf((C7527) obj);
                    return indexOf;
                }
            }).filter(new C4705()).min().ifPresent(new C3294(0, this));
        } else {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C7527) it3.next()).m20185(false);
            }
        }
        this.f41369 = SystemClock.uptimeMillis();
        arrayList3.clear();
        notifyDataSetChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33242(C13876 c13876, final int i) {
        final C13132 c13132 = c13876.f41374;
        if (c13132 != null) {
            c13132.post(new Runnable() { // from class: l.۬ܳۡ
                @Override // java.lang.Runnable
                public final void run() {
                    C13132.this.scrollToPosition(i);
                }
            });
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m33280() {
        m33244();
        if (!this.f41365) {
            return null;
        }
        C10130 c10130 = new C10130();
        if (this.f41363) {
            c10130.writeByte(81);
            c10130.m25439(this.f41372);
        } else {
            c10130.writeByte(82);
        }
        c10130.writeInt(m33269().size());
        Iterator it = m33269().iterator();
        while (it.hasNext()) {
            c10130.m25439((String) it.next());
        }
        return c10130.m25427();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33265(byte[] bArr) {
        m33244();
        if (bArr == null) {
            if (this.f41365) {
                mo33251();
                return;
            }
            return;
        }
        C12951 m31485 = C12951.m31485(bArr);
        byte readByte = m31485.readByte();
        if (readByte == 81) {
            this.f41365 = true;
            this.f41363 = true;
            this.f41372 = m31485.m31506();
        } else if (readByte == 82) {
            this.f41365 = true;
        } else {
            throw new RuntimeException();
        }
        int readInt = m31485.readInt();
        HashSet hashSet = new HashSet(readInt);
        for (int i = 0; i < readInt; i++) {
            hashSet.add(m31485.m31506());
        }
        this.f41366 = 0L;
        this.f41378 = null;
        this.f41367 = -2;
        m33263(new C22244(4, hashSet));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33271(boolean z) {
        this.f41363 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo33251() {
        if (!this.f41365) {
            throw new IllegalStateException();
        }
        this.f41366 = System.currentTimeMillis();
        m33239((List) this.f41383.f33901);
        this.f41365 = false;
        this.f41373.clear();
        notifyDataSetChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33263(InterfaceC23049 interfaceC23049) {
        if (!this.f41365) {
            throw new IllegalStateException();
        }
        LinkedList linkedList = new LinkedList();
        this.f41383.m27986(new C12466(this, interfaceC23049, linkedList));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((C7527) it.next()).m20174(false);
        }
        m33270();
        this.f41373.clear();
        notifyDataSetChanged();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m33267() {
        return this.f41365;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m33268() {
        if (!this.f41365) {
            throw new IllegalStateException();
        }
        return this.f41383.m27984();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final HashSet m33269() {
        if (!this.f41365) {
            throw new IllegalStateException();
        }
        HashSet hashSet = new HashSet();
        this.f41383.m27985(hashSet);
        return hashSet;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m33281() {
        if (!this.f41365) {
            throw new IllegalStateException();
        }
        this.f41366 = System.currentTimeMillis();
        C11328 c11328 = this.f41383;
        c11328.m27988();
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f41382.iterator();
        int i = 0;
        while (it.hasNext()) {
            C7527 c7527 = (C7527) it.next();
            if (c7527.m20189()) {
                if (c7527.m20175()) {
                    it.remove();
                    linkedList.addFirst(Integer.valueOf(i));
                }
            } else if (c7527.f23154.isEmpty()) {
                it.remove();
                linkedList.addFirst(Integer.valueOf(i));
            }
            i++;
        }
        m33239((List) c11328.f33901);
        int mo15999 = mo15999();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            notifyItemRemoved(((Integer) it2.next()).intValue() + mo15999);
        }
        C13132 c13132 = this.f41374;
        if (c13132 != null) {
            c13132.postDelayed(new RunnableC4196(6, this), 300L);
        } else {
            this.f41365 = false;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m33272(C7527 c7527) {
        if (!mo33277(c7527.f23157)) {
            return false;
        }
        if (!this.f41363) {
            return true;
        }
        C7527 c75272 = c7527.f23158;
        return c75272 != null && C11003.equals(c75272.f23157, this.f41372) && c7527.m20189() && !c7527.m20188();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m33282() {
        m33244();
        if (this.f41365 || this.f41363) {
            throw new IllegalStateException();
        }
        this.f41364 = true;
        this.f41365 = true;
        this.f41378 = null;
        this.f41367 = -2;
        m33263(new C3200(12));
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m33248() {
        m33244();
        if (this.f41365 || this.f41363) {
            throw new IllegalStateException();
        }
        this.f41366 = System.currentTimeMillis();
        this.f41365 = true;
        this.f41378 = null;
        this.f41367 = -2;
        m33263(new C20094(5));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m33279(C7527 c7527) {
        m33244();
        if (this.f41365) {
            throw new IllegalStateException();
        }
        if (!mo33277(c7527.f23157)) {
            throw new IllegalStateException();
        }
        this.f41366 = System.currentTimeMillis();
        this.f41365 = true;
        this.f41378 = null;
        this.f41367 = -2;
        if (this.f41363) {
            this.f41372 = c7527.f23158.f23157;
        }
        if (c7527.m20189()) {
            c7527.m20180(true);
        } else {
            c7527.m20178();
            C1177.m3987(c7527.f23154);
            c7527.m20174(true);
        }
        this.f41373.clear();
        notifyDataSetChanged();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33270() {
        if (this.f41364) {
            return;
        }
        Iterator it = this.f41383.f33901.iterator();
        while (it.hasNext()) {
            if (((C7527) it.next()).m20182() != 0) {
                return;
            }
        }
        mo33251();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33256(C5411 c5411) {
        C7527 c7527 = c5411.f54077;
        if (!m33272(c7527)) {
            throw new IllegalArgumentException();
        }
        this.f41378 = null;
        c7527.m20180(!c7527.m20175());
        if (c7527.m20175()) {
            int indexOf = this.f41382.indexOf(c7527);
            int abs = Math.abs(indexOf - this.f41367);
            this.f41367 = indexOf;
            if (abs == 1) {
                this.f41381++;
            } else {
                this.f41381 = 1;
            }
            if (this.f41381 == 5) {
                C21374.m48463(R.string.MT_Protector_res_0x7f120914);
                this.f41381 = 0;
            }
        } else {
            m33270();
            this.f41367 = -2;
        }
        C5953 c5953 = c5411.f54079;
        boolean m20175 = c7527.m20175();
        c5953.getClass();
        c5953.m16679(m20175 ? 2 : 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33261(AbstractViewOnClickListenerC17677 abstractViewOnClickListenerC17677) {
        C7527 c7527 = abstractViewOnClickListenerC17677.f54077;
        if (!this.f41365) {
            throw new IllegalStateException();
        }
        if (!m33272(c7527)) {
            throw new IllegalArgumentException();
        }
        C7527 c75272 = this.f41378;
        if (c75272 == null) {
            this.f41378 = c7527;
            if (c7527.m20189()) {
                this.f41378.m20180(true);
                C5953 c5953 = abstractViewOnClickListenerC17677.f54079;
                c5953.getClass();
                c5953.m16679(2);
                return;
            }
            ((C1177) abstractViewOnClickListenerC17677).mo3988(2);
            this.f41378 = c7527;
            return;
        }
        this.f41378 = null;
        if (c75272.equals(c7527)) {
            return;
        }
        C10350 c10350 = new C10350(c75272, c7527);
        C11328 c11328 = this.f41383;
        c11328.m27986(c10350);
        LinkedList linkedList = new LinkedList();
        c11328.m27986(new C6116(linkedList));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((C7527) it.next()).m20174(false);
        }
        m33270();
        this.f41373.clear();
        notifyDataSetChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33239(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7527 c7527 = (C7527) it.next();
            c7527.m20171();
            if (!c7527.m20189()) {
                m33239((List) c7527.f23154);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33241(C13876 c13876) {
        c13876.f41365 = false;
        for (C5953 c5953 : c13876.f41380) {
            c5953.getClass();
            c5953.m16679(0);
            int i = C17648.f53953;
            if (c5953.isAttachedToWindow()) {
                ObjectAnimator.ofFloat(c5953, "scaleX", 1.0f, 0.0f).setDuration(200L).start();
            } else {
                c5953.setScaleX(0.0f);
            }
        }
    }

    @Override // l.AbstractC19902
    public int getItemViewType(int i) {
        C7527 c7527 = (C7527) this.f41382.get(i);
        return c7527.m20189() ? (mo25497() && c7527.m20188()) ? 10002 : 10000 : IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation;
    }

    @Override // l.AbstractC19902
    public AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Set set = this.f41380;
        switch (i) {
            case 10000:
                C5411 c5411 = new C5411(this, C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d0149, viewGroup, false));
                c5411.f16891 = (ImageView) c5411.itemView.findViewById(R.id.icon);
                c5411.f16893 = (TextView) c5411.itemView.findViewById(R.id.textView);
                c5411.f16892 = c5411.itemView.findViewById(R.id.MT_Protector_res_0x7f0a010e);
                C5953 c5953 = (C5953) c5411.itemView.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
                c5411.f54079 = c5953;
                c5953.setClickable(false);
                set.add(c5411.f54079);
                return c5411;
            case IShizukuApplication.Stub.TRANSACTION_showPermissionConfirmation /* 10001 */:
                C1177 c1177 = new C1177(this, C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d0164, viewGroup, false));
                c1177.f4228 = (ImageView) c1177.itemView.findViewById(R.id.icon);
                c1177.f4230 = (TextView) c1177.itemView.findViewById(R.id.textView);
                ImageView imageView = (ImageView) c1177.itemView.findViewById(R.id.MT_Protector_res_0x7f0a01d5);
                c1177.f4229 = imageView;
                imageView.setImageResource(R.drawable.MT_Protector_res_0x7f08011d);
                C5953 c59532 = (C5953) c1177.itemView.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
                c1177.f54079 = c59532;
                c59532.m16680(c1177);
                set.add(c1177.f54079);
                return c1177;
            case 10002:
                return mo25494(viewGroup);
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: ֫ */
    public int mo25493(int i) {
        return (this.f41370 * i) + this.f41362;
    }

    @Override // l.AbstractC19902
    public void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C7527 c7527 = (C7527) this.f41382.get(i);
        boolean m20188 = c7527.m20188();
        String str = c7527.f23155;
        String str2 = c7527.f23157;
        if (m20188) {
            mo25496(abstractC3255, c7527.f23158.f23157, c7527.m20186());
            return;
        }
        AbstractViewOnClickListenerC17677 abstractViewOnClickListenerC17677 = (AbstractViewOnClickListenerC17677) abstractC3255;
        abstractViewOnClickListenerC17677.f54077 = c7527;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abstractViewOnClickListenerC17677.itemView.getLayoutParams();
        if (c7527.m20189()) {
            marginLayoutParams.leftMargin = mo25493(c7527.m20184());
            C5411 c5411 = (C5411) abstractViewOnClickListenerC17677;
            ImageView imageView = c5411.f16891;
            TextView textView = c5411.f16893;
            textView.setText(mo33249(str2, C6554.m18061(200, str), true));
            imageView.setImageDrawable(this.f41371);
            if (this.f41375.remove(str2)) {
                this.f41373.add(c7527);
                c7527.m20185(true);
                if (SystemClock.uptimeMillis() - this.f41369 < 2000) {
                    C0471 c0471 = new C0471(C21943.f70286);
                    c0471.m2074(1200);
                    View view = c5411.f16892;
                    int i2 = C17648.f53953;
                    view.setBackground(c0471);
                }
            }
            if (c7527.m20177()) {
                textView.setTextColor(C21943.f70291);
            } else {
                textView.setTextColor(C21943.f70275);
            }
            InterfaceC18383 interfaceC18383 = this.f41379;
            if (interfaceC18383 != null) {
                interfaceC18383.mo25495(str2, imageView, textView);
            }
        } else {
            marginLayoutParams.leftMargin = this.f41370 * c7527.m20184();
            C1177 c1177 = (C1177) abstractViewOnClickListenerC17677;
            c1177.f4230.setText(mo33249(str2, C6554.m18061(200, str), false));
            c1177.f4228.setImageDrawable(this.f41368);
            c1177.f4229.setRotation(c7527.m20181() ? 135.0f : 90.0f);
        }
        c7527.m20173(abstractViewOnClickListenerC17677.f54079);
        if (System.currentTimeMillis() - this.f41366 < 100) {
            if (!m33272(c7527)) {
                C5953 c5953 = abstractViewOnClickListenerC17677.f54079;
                c5953.getClass();
                c5953.setVisibility(8);
            } else {
                C5953 c59532 = abstractViewOnClickListenerC17677.f54079;
                c59532.getClass();
                c59532.setVisibility(0);
                if (this.f41365) {
                    ObjectAnimator.ofFloat(abstractViewOnClickListenerC17677.f54079, "scaleX", 0.01f, 1.0f).setDuration(200L).start();
                } else {
                    ObjectAnimator.ofFloat(abstractViewOnClickListenerC17677.f54079, "scaleX", 1.0f, 0.0f).setDuration(200L).start();
                }
            }
        } else {
            abstractViewOnClickListenerC17677.f54079.setScaleX(1.0f);
            C5953 c59533 = abstractViewOnClickListenerC17677.f54079;
            boolean z = this.f41365 && m33272(c7527);
            c59533.getClass();
            c59533.setVisibility(z ? 0 : 8);
        }
        abstractViewOnClickListenerC17677.itemView.setLayoutParams(marginLayoutParams);
    }

    @Override // l.AbstractC19902
    public int getItemCount() {
        return this.f41382.size();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m33244() {
        if (mo25497()) {
            throw new RuntimeException("Unsupported in left extra mode.");
        }
    }

    /* renamed from: ۧ */
    public int mo25499(String str) {
        throw new RuntimeException();
    }

    /* renamed from: ֫ */
    public AbstractC3255 mo25494(ViewGroup viewGroup) {
        throw new RuntimeException();
    }

    /* renamed from: ֫ */
    public void mo25496(AbstractC3255 abstractC3255, String str, int i) {
        throw new RuntimeException();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m33274() {
        C7527 c7527;
        C6495 c6495 = (C6495) this.f41374.getLayoutManager();
        C11003.requireNonNull(c6495);
        int findFirstVisibleItemPosition = c6495.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1 || (c7527 = ((C7527) this.f41382.get(findFirstVisibleItemPosition)).f23158) == null) {
            return null;
        }
        return m33245(c7527);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m33245(C7527 c7527) {
        C7527 c75272 = c7527.f23158;
        String str = c7527.f23155;
        if (c75272 == null) {
            return str;
        }
        return m33245(c7527.f23158) + "/" + str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9606 m33250(C1178 c1178) {
        return new C11761(this, c1178);
    }
}
