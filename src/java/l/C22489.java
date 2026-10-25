package l;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: 86KX */
/* renamed from: l.᩹᩵ۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22489 extends Exception {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f72812;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f72813;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f72814;

    public C22489(String str, String str2, List list, List list2) {
        super(str2);
        this.f72813 = str;
        this.f72812 = C20195.unmodifiableList(new ArrayList(list));
        this.f72814 = C20195.unmodifiableList(new ArrayList(new LinkedHashSet(list2)));
    }
}
