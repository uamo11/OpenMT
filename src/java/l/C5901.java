package l;

import android.widget.EditText;
import bin.mt.plugin.api.ui.PluginView;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* compiled from: J7R9 */
/* renamed from: l.ۛۜ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5901 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18111;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18112;

    public /* synthetic */ C5901(int i, Object obj) {
        this.f18111 = i;
        this.f18112 = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        PluginView m28424;
        DynamicColor lambda$onSecondaryFixed$125;
        switch (this.f18111) {
            case 0:
                m28424 = ((C11546) this.f18112).m28424((String) obj);
                return m28424;
            case 1:
                String substring = ((String) obj).substring(((String) this.f18112).length());
                int indexOf = substring.indexOf(47);
                return indexOf == -1 ? substring : substring.substring(0, indexOf);
            case 2:
                EditText editText = (EditText) this.f18112;
                return editText.length() == 0 ? (CharSequence) obj : editText.getText();
            default:
                lambda$onSecondaryFixed$125 = ((MaterialDynamicColors) this.f18112).lambda$onSecondaryFixed$125((DynamicScheme) obj);
                return lambda$onSecondaryFixed$125;
        }
    }
}
