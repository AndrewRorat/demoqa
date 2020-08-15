package data;

import pojo.User;

public final class UserRepository {

    public UserRepository() {
    }

    public static User getDefaultUser() {
        return getMark();
    }

    public static User getMark() {
        return new User("Mark", "Pedrisimo", "pedro@gmail.com", 22, 5000, "California");
    }

    public static User getLola() {
        return new User("Lola", "Stringer", "lolita@gmail.com", 19, 1000, "Poland");
    }
}