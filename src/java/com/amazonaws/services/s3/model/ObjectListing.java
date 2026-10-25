package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ObjectListing implements Serializable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f626;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f627;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f628;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f625 = new ArrayList();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f629 = new ArrayList();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m613() {
        return this.f625;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m609() {
        return this.f629;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m611() {
        return this.f626;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m610(String str) {
        this.f626 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m606() {
        return this.f628;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m607(String str) {
        this.f628 = str;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m612() {
        return this.f627;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m608(boolean z) {
        this.f627 = z;
    }
}
