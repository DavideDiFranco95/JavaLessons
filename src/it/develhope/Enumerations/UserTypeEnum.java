package it.develhope.Enumerations;

public enum UserTypeEnum {
    MEGA_ADMIN(true,true,true),
    SUPER_ADMIN(true,true,true),
    ADMIN(true,true,true),
    EDITOR(false,true,true),
    REGISTERED(false,false,true),
    GUEST(false,false,false)
    ;
    final public boolean canAdminUsers;
    final public boolean canWritePosts;
    final public boolean canSeePosts;
    UserTypeEnum(boolean canAdminUsers,boolean canWritePosts,boolean canSeePosts){
        this.canAdminUsers=canAdminUsers;
        this.canWritePosts=canWritePosts;
        this.canSeePosts=canSeePosts;
    }
    public boolean isAdmin(){
        return this.ordinal()<3;
    }

    @Override
    public String toString() {
        return "UserTypeEnum{" +
                "name=" + this.getName() +
                "canAdminUsers=" + canAdminUsers +
                ", canWritePosts=" + canWritePosts +
                ", canSeePosts=" + canSeePosts +
                '}';
    }

    private String getName() {
        return this.name();
    }
}
