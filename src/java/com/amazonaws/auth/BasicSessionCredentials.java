package com.amazonaws.auth;

/* loaded from: classes.dex */
public class BasicSessionCredentials implements AWSSessionCredentials {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f144;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f145;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f146;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.f144 = str;
        this.f145 = str2;
        this.f146 = str3;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* renamed from: ֫ */
    public final String mo206() {
        return this.f144;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* renamed from: ܽ */
    public final String mo207() {
        return this.f145;
    }

    @Override // com.amazonaws.auth.AWSSessionCredentials
    /* renamed from: ۧ */
    public final String mo209() {
        return this.f146;
    }
}
