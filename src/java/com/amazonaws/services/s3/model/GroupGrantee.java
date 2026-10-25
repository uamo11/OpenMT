package com.amazonaws.services.s3.model;

import l.C9045;

/* loaded from: classes.dex */
public enum GroupGrantee implements Grantee {
    AllUsers("http://acs.amazonaws.com/groups/global/AllUsers"),
    AuthenticatedUsers("http://acs.amazonaws.com/groups/global/AuthenticatedUsers"),
    LogDelivery("http://acs.amazonaws.com/groups/s3/LogDelivery");


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f604;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String m577() {
        return "uri";
    }

    GroupGrantee(String str) {
        this.f604 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m576() {
        return this.f604;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    /* renamed from: ֫ */
    public void mo539(String str) {
        throw new UnsupportedOperationException("Group grantees have preset identifiers that cannot be modified.");
    }

    @Override // java.lang.Enum
    public String toString() {
        return C9045.m23341(new StringBuilder("GroupGrantee ["), this.f604, "]");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static GroupGrantee m575(String str) {
        for (GroupGrantee groupGrantee : values()) {
            if (groupGrantee.f604.equals(str)) {
                return groupGrantee;
            }
        }
        return null;
    }
}
