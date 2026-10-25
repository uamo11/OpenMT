package l;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

/* compiled from: G547 */
@Deprecated
/* renamed from: l.ᩳ᩸ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractDialogFragmentC18323 extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CharSequence f56965;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f56966;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f56967;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC11079 f56968;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f56969;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public CharSequence f56970;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f56971;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f56972;

    @Deprecated
    /* renamed from: ֫ */
    public void mo13843(AlertDialog.Builder builder) {
    }

    @Deprecated
    /* renamed from: ֫ */
    public abstract void mo13844(boolean z);

    @Deprecated
    public AbstractDialogFragmentC18323() {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof InterfaceC1906)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        InterfaceC1906 interfaceC1906 = (InterfaceC1906) targetFragment;
        String string = getArguments().getString("key");
        if (bundle == null) {
            AbstractC11079 abstractC11079 = (AbstractC11079) interfaceC1906.findPreference(string);
            this.f56968 = abstractC11079;
            this.f56966 = abstractC11079.m27491();
            this.f56969 = this.f56968.m27487();
            this.f56965 = this.f56968.m27486();
            this.f56970 = this.f56968.m27489();
            this.f56972 = this.f56968.m27490();
            Drawable m27488 = this.f56968.m27488();
            if (m27488 == null || (m27488 instanceof BitmapDrawable)) {
                this.f56971 = (BitmapDrawable) m27488;
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(m27488.getIntrinsicWidth(), m27488.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            m27488.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            m27488.draw(canvas);
            this.f56971 = new BitmapDrawable(getResources(), createBitmap);
            return;
        }
        this.f56966 = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.f56969 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.f56965 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.f56970 = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.f56972 = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.f56971 = new BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f56966);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f56969);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f56965);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f56970);
        bundle.putInt("PreferenceDialogFragment.layout", this.f56972);
        BitmapDrawable bitmapDrawable = this.f56971;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.f56967 = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f56966).setIcon(this.f56971).setPositiveButton(this.f56969, this).setNegativeButton(this.f56965, this);
        int i = this.f56972;
        View inflate = i != 0 ? LayoutInflater.from(activity).inflate(i, (ViewGroup) null) : null;
        if (inflate != null) {
            mo42703(inflate);
            negativeButton.setView(inflate);
        } else {
            negativeButton.setMessage(this.f56970);
        }
        mo13843(negativeButton);
        AlertDialog create = negativeButton.create();
        if (this instanceof DialogFragmentC20957) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C16911.m39765(window);
                return create;
            }
            window.setSoftInputMode(5);
        }
        return create;
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11079 m42702() {
        if (this.f56968 == null) {
            this.f56968 = (AbstractC11079) ((InterfaceC1906) getTargetFragment()).findPreference(getArguments().getString("key"));
        }
        return this.f56968;
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo42703(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.f56970;
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
    @Deprecated
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f56967 = i;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo13844(this.f56967 == -1);
    }
}
