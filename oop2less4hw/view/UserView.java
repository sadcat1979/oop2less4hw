package oop2less4hw.view;

import java.util.List;
import oop2less4hw.model.User;

public interface UserView<T extends User> {

    public void sendOnConsole(List<T> list);
}
