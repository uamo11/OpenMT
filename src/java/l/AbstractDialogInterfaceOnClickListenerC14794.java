package l;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

/* compiled from: W5LS */
/* renamed from: l.ܳ᩸ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC14794 extends DialogInterfaceOnCancelListenerC10344 implements DialogInterface.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CharSequence f45173;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f45174;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f45175;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC11079 f45176;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f45177;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public CharSequence f45178;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f45179;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f45180;

    /* renamed from: ֫ */
    public void mo21851(C18892 c18892) {
    }

    /* renamed from: ֫ */
    public abstract void mo21852(boolean z);

    /* renamed from: ܽ */
    public void mo23105() {
    }

    @Override // l.DialogInterfaceOnCancelListenerC10344, l.ComponentCallbacksC9205
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC4557 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof InterfaceC1906)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        InterfaceC1906 interfaceC1906 = (InterfaceC1906) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle == null) {
            AbstractC11079 abstractC11079 = (AbstractC11079) interfaceC1906.findPreference(string);
            this.f45176 = abstractC11079;
            this.f45174 = abstractC11079.m27491();
            this.f45177 = this.f45176.m27487();
            this.f45173 = this.f45176.m27486();
            this.f45178 = this.f45176.m27489();
            this.f45180 = this.f45176.m27490();
            Drawable m27488 = this.f45176.m27488();
            if (m27488 == null || (m27488 instanceof BitmapDrawable)) {
                this.f45179 = (BitmapDrawable) m27488;
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(m27488.getIntrinsicWidth(), m27488.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            m27488.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            m27488.draw(canvas);
            this.f45179 = new BitmapDrawable(getResources(), createBitmap);
            return;
        }
        this.f45174 = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.f45177 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.f45173 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.f45178 = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.f45180 = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.f45179 = new BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // l.DialogInterfaceOnCancelListenerC10344, l.ComponentCallbacksC9205
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f45174);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f45177);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f45173);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f45178);
        bundle.putInt("PreferenceDialogFragment.layout", this.f45180);
        BitmapDrawable bitmapDrawable = this.f45179;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // l.DialogInterfaceOnCancelListenerC10344
    public final Dialog onCreateDialog(Bundle bundle) {
        this.f45175 = -2;
        C18892 negativeButton = new C18892(requireContext()).setTitle(this.f45174).setIcon(this.f45179).setPositiveButton(this.f45177, this).setNegativeButton(this.f45173, this);
        requireContext();
        int i = this.f45180;
        View inflate = i != 0 ? getLayoutInflater().inflate(i, (ViewGroup) null) : null;
        if (inflate != null) {
            mo23104(inflate);
            negativeButton.setView(inflate);
        } else {
            negativeButton.setMessage(this.f45178);
        }
        mo21851(negativeButton);
        DialogInterfaceC19598 create = negativeButton.create();
        if (this instanceof C8962) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C17617.m41178(window);
                return create;
            }
            mo23105();
        }
        return create;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC11079 m35179() {
        if (this.f45176 == null) {
            this.f45176 = (AbstractC11079) ((InterfaceC1906) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.f45176;
    }

    /* renamed from: ֫ */
    public void mo23104(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.f45178;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f45175 = i;
    }

    @Override // l.DialogInterfaceOnCancelListenerC10344, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo21852(this.f45175 == -1);
    }
}
