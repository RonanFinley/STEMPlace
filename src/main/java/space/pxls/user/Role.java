package space.pxls.user;

public enum Role {
    BANNED,
    DEFAULT,
    MODERATOR,
    ADMIN;

    public boolean lessThan(Role other) {
        return ordinal() < other.ordinal();
    }

    public boolean greaterThan(Role other) {
        return ordinal() > other.ordinal();
    }

    public boolean lessEqual(Role other) {
        return ordinal() <= other.ordinal();
    }

    public boolean greaterEqual(Role other) {
        return ordinal() >= other.ordinal();
    }
}