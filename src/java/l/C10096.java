package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* compiled from: A60Y */
/* renamed from: l.ۤۛ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10096 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m25359(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m25362(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m25361(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static CharSequence m25363(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m25355(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m25360(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m25365(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m25356(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25354(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m25357(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m25364(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m25358(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m25366(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }
}
