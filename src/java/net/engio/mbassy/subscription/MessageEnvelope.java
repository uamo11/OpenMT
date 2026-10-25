package net.engio.mbassy.subscription;

/* loaded from: classes.dex */
public class MessageEnvelope {
    public Object message;

    public MessageEnvelope(Object obj) {
        this.message = obj;
    }

    public Object getMessage() {
        return this.message;
    }
}
