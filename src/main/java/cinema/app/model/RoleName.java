package cinema.app.model;

public enum RoleName {
    ROLE_ADMIN,
    ROLE_USER;

    @Override
    public String toString() {
        return this.name().replace("ROLE_", "");
    }
}
