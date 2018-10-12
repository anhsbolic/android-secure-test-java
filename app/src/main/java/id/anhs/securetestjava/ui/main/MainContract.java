package id.anhs.securetestjava.ui.main;

import id.anhs.securetestjava.model.Team;

public interface MainContract {

    interface View {
        void setTeam(Team team);
    }

    interface Presenter{
        void getTeam();
    }
}
