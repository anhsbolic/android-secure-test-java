package id.anhs.securetestjava.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import id.anhs.securetestjava.R;
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
        presenter.getTeam();
    }

    private void initView() {
        txtName = findViewById(R.id.main_txt_team_name);
        txtLeague = findViewById(R.id.main_txt_team_league);
        txtDesc = findViewById(R.id.main_txt_team_desc);
    }

    private void initPresenter() {
        presenter = new MainPresenter(this);
    }

    @Override
    public void setTeam(Team team) {
        txtName.setText(team.getStrTeam());
        txtLeague.setText(team.getStrLeague());
        txtDesc.setText(team.getStrDescriptionEN());
    }

    @Override
    protected void onDestroy() {
        killView();
        super.onDestroy();
    }

    private void killView() {
        txtName = null;
        txtLeague = null;
        txtDesc = null;
    }

}
