package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.io.IOException;

/* compiled from: 3BK7 */
/* renamed from: l.᩶ۖᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class ActivityC19887 extends AbstractActivityC3346 {

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f64270 = 0;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C9357 f64271;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f64272;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final int[] f64273;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "VectorPreviewActivity";
    }

    public ActivityC19887() {
        this.f64273 = C21943.m49431() ? new int[]{-16777216, -7829368, -1} : new int[]{-1, -7829368, -16777216};
        this.f64272 = 0;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C12534 c12534;
        byte[] bArr;
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector_res_0x7f0d0032);
        m10241(R.string.MT_Protector_res_0x7f12079c);
        this.f10584 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f64271 = (C9357) m10241(R.id.MT_Protector_res_0x7f0a0437);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC16536(1, this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra(e.m);
        final C15518 c15518 = null;
        if (byteArrayExtra == null) {
            try {
                AbstractC15440 m39862 = C16999.m39862(getIntent());
                byte[] m36506 = m39862.m36506();
                String parent = m39862.getParent();
                AbstractC15440 m39866 = parent == null ? null : C16999.m39866(parent, "resources.arsc");
                c12534 = (m39866 == null || !m39866.mo23120()) ? null : new C12534(m39866);
                bArr = m36506;
            } catch (Exception e) {
                m10224((Throwable) e, true);
                return;
            }
        } else {
            bArr = C3878.m11708(byteArrayExtra, byteArrayExtra.length);
            String stringExtra = getIntent().getStringExtra("arscPath");
            if (stringExtra != null) {
                AbstractC15440 m398662 = C16999.m39866(stringExtra, new String[0]);
                if (m398662.mo23120()) {
                    try {
                        c12534 = new C12534(m398662);
                    } catch (Throwable unused) {
                    }
                }
            }
            c12534 = null;
        }
        if (c12534 == null) {
            c12534 = new C12534();
        }
        try {
            try {
                c15518 = C15518.m36587(C15206.m35978(bArr).m35994(), c12534, false);
            } catch (Exception unused2) {
            }
            if (c15518 != null) {
                this.f64271.setScaleType(ImageView.ScaleType.CENTER);
                this.f64271.setImageDrawable(c15518);
                this.f64271.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩸ۖᩳ
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        ActivityC19887.m45734(ActivityC19887.this, c15518);
                    }
                });
                Bitmap createBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Rect copyBounds = c15518.copyBounds();
                c15518.setBounds(0, 0, 128, 128);
                c15518.draw(canvas);
                c15518.setBounds(copyBounds);
                int m20003 = C7466.m20003(createBitmap);
                int[] iArr = this.f64273;
                if (C7466.m20006(m20003, iArr[0])) {
                    this.f64272 = 1;
                }
                getWindow().getDecorView().setBackgroundColor(iArr[this.f64272]);
            }
        } catch (IOException e2) {
            m10223(e2, (DialogInterface.OnDismissListener) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45734(ActivityC19887 activityC19887, C15518 c15518) {
        float[] fArr;
        C9357 c9357 = activityC19887.f64271;
        int intrinsicWidth = c15518.getIntrinsicWidth();
        int i = 0;
        float width = (c9357 == null ? 0 : (c9357.getWidth() - c9357.getPaddingLeft()) - c9357.getPaddingRight()) / intrinsicWidth;
        float height = (c9357 == null ? 0 : (c9357.getHeight() - c9357.getPaddingTop()) - c9357.getPaddingBottom()) / c15518.getIntrinsicHeight();
        float min = Math.min(width, height);
        float max = Math.max(width, height);
        if (min >= max) {
            max = min * 1.5f;
        }
        if (min >= 1.0f) {
            fArr = min >= 1.5f ? new float[]{1.0f, min, min} : new float[]{min, 2.0f * min, min};
        } else {
            fArr = new float[]{min, Math.max(2.0f * min, Math.min(3.0f, max)), min};
        }
        activityC19887.f64271.m24168(fArr[0], fArr[1]);
        activityC19887.f64271.post(new RunnableC22003(activityC19887, c15518, fArr, i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45735(ActivityC19887 activityC19887, C15518 c15518, float[] fArr) {
        if (c15518.getIntrinsicWidth() > activityC19887.f64271.getWidth() || c15518.getIntrinsicHeight() > activityC19887.f64271.getHeight()) {
            activityC19887.f64271.m24167(fArr[0]);
        } else {
            activityC19887.f64271.m24167(fArr[1]);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.string.MT_Protector_res_0x7f120610, 0, R.string.MT_Protector_res_0x7f120610).setIcon(R.drawable.MT_Protector_res_0x7f0801ca).setShowAsAction(2);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.string.MT_Protector_res_0x7f120610) {
            return false;
        }
        int i = this.f64272 + 1;
        this.f64272 = i;
        int[] iArr = this.f64273;
        if (i == iArr.length) {
            this.f64272 = 0;
        }
        getWindow().getDecorView().setBackgroundColor(iArr[this.f64272]);
        return true;
    }
}
