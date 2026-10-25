package com.amazonaws.services.s3.internal;

import com.amazonaws.auth.Signer;
import com.amazonaws.http.ExecutionContext;

/* loaded from: classes.dex */
public class S3ExecutionContext extends ExecutionContext {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Signer f499;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m475(Signer signer) {
        this.f499 = signer;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Signer m476() {
        return this.f499;
    }
}
