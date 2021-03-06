package id.anhs.securetestjava.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import id.anhs.securetestjava.R;
import id.anhs.securetestjava.api.NetworkServices;
import id.anhs.securetestjava.model.Team;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private TextView txtName;
    private TextView txtLeague;
    private TextView txtDesc;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initPresenter();
        String idTeam = "133604";
        presenter.getTeam(idTeam);
    }

    private void initView() {
        txtName = findViewById(R.id.main_txt_team_name);
        txtLeague = findViewById(R.id.main_txt_team_league);
        txtDesc = findViewById(R.id.main_txt_team_desc);
    }

    private void initPresenter() {
        presenter = new MainPresenter(this, NetworkServices.getTheSportDBApiServices());
    }

    @Override
    public void setTeam(Team team) {
        txtName.setText(team.getStrTeam());
        txtLeague.setText(team.getStrLeague());
        txtDesc.setText(team.getStrDescriptionEN());
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        presenter.clearComposite();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        killView();
        presenter.disposeComposite();
        super.onDestroy();
    }

    private void killView() {
        txtName = null;
        txtLeague = null;
        txtDesc = null;
    }

}
