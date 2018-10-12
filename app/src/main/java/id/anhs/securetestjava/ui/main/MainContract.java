package id.anhs.securetestjava.ui.main;

import id.anhs.securetestjava.model.Team;

public interface MainContract {

    interface View {
        void setTeam(Team team);

        void showToast(String msg);
    }

    interface Presenter{
        void clearComposite();

        void disposeComposite();

        void getTeam(String idTeam);
    }
}
