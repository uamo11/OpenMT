package net.engio.mbassy.bus.common;

/* loaded from: classes.dex */
public abstract class PublicationEvent {
    public Object relatedMessage;

    public PublicationEvent(Object obj) {
        this.relatedMessage = obj;
    }

    public Object getMessage() {
        return this.relatedMessage;
    }
}
