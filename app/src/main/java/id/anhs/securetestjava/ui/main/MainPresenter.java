package id.anhs.securetestjava.ui.main;

import java.util.List;

import id.anhs.securetestjava.api.TheSportDbApiServices;
import id.anhs.securetestjava.model.Team;
import id.anhs.securetestjava.model.TeamResponse;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    private TheSportDbApiServices theSportDbApiServices;
    private CompositeDisposable compositeDisposable;

    MainPresenter(MainContract.View view, TheSportDbApiServices theSportDbApiServices){
        this.view = view;
        this.theSportDbApiServices = theSportDbApiServices;
    }

    @Override
    public void clearComposite() {
        compositeDisposable.clear();
    }

    @Override
    public void disposeComposite() {
        compositeDisposable.dispose();
    }

    @Override
    public void getTeam(String idTeam) {
        compositeDisposable = new CompositeDisposable();

        compositeDisposable.add(
                theSportDbApiServices.getTeamDetails(idTeam)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<TeamResponse>() {
                            @Override
                            public void accept(TeamResponse teamResponse) {
                                if (teamResponse != null) {
                                    List<Team> teams = teamResponse.teams;
                                    if (!teams.isEmpty()) {
                                        Team team = teams.get(0);
                                        if (team != null) {
                                            view.setTeam(team);
                                        } else {
                                            showError();
                                        }
                                    } else {
                                        showError();
                                    }
                                } else {
                                    showError();
                                }
                            }
                        })
        );
    }

    private void showError() {
        view.showToast("Get Data Failed");
    }
}
