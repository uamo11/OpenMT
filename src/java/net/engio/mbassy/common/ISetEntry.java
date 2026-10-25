package net.engio.mbassy.common;

/* loaded from: classes.dex */
public interface ISetEntry {
    void clear();

    Object getValue();

    ISetEntry next();

    void remove();
}
