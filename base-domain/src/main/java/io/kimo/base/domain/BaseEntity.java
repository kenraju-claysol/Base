package io.kimo.base.domain;


public abstract class BaseEntity implements Entity {
    protected long mEntityId;

    public BaseEntity() {
        mEntityId = System.currentTimeMillis();
    }

    @Override
    public long getEntityId() {
        return mEntityId;
    }
}
