package com.example.shreypatel.gujaratikehvato;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Button bt1,bt2;
    TextView txt;
    ClipboardManager myClipboard;
    ClipData myClip;

    Toolbar toolbar;
    private AdView mAdView;
    private ListView lv;
    private MyAppAdapter appAdapter;
    private ArrayList<ListProfile> ListProfile;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,
                "ca-app-pub-1660035948749105~3896876934");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        Button  bt1 = (Button) findViewById(R.id.bt1);
        Button bt2 = (Button) findViewById(R.id.bt2);


        myClipboard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);


        ListProfile=new ArrayList<>();

        ListProfile.add(new ListProfile("   આમદની અટ્ટની ખર્ચા રૂપૈયા   "));

        ListProfile.add(new ListProfile("   ગાંડાના ગામ ન હોય    "));


        ListProfile.add(new ListProfile("   સુકા ભેગુ લીલુ બળે       "));


        ListProfile.add(new ListProfile("   બાવાનાં બેવુ બગડે         "));


        ListProfile.add(new ListProfile("   લક્ષ્મી ચાંદલો કરવા આવે ત્યારે કપાળ ધોવા ન જવાય     "));


        ListProfile.add(new ListProfile("   વાવો તેવું લણો        "));


        ListProfile.add(new ListProfile("   શેતાનું નામ લીધુ શેતાન હાજર       "));


        ListProfile.add(new ListProfile("   વખાણેલી ખીચડી દાઢે વળગી          "));


        ListProfile.add(new ListProfile("   દશેરાનાં દિવસે ઘોડા ન દોડે        "));


        ListProfile.add(new ListProfile("   સંગ તેવો રંગ        "));


        ListProfile.add(new ListProfile("   બોલે તેના બોર વહેચાય        "));


        ListProfile.add(new ListProfile("   ના બોલવામાં નવ ગુણ        "));


        ListProfile.add(new ListProfile("   ઉજ્જડ ગામમાં ઍરંડો પ્રધાન        "));

        ListProfile.add(new ListProfile("   ડાહ્યી સાસરે ન જાય અને ગાંડીને શીખામણ આપે        "));


        ListProfile.add(new ListProfile("   સંપ ત્યાં જંપ        "));


        ListProfile.add(new ListProfile("   બકરું કઢતા ઉંટ પેઠું         "));


        ListProfile.add(new ListProfile("   રાજા, વાજા અને વાંદરાં ત્રણેય સરખાં       "));


        ListProfile.add(new ListProfile("   સિધ્ધિ તેને જઈ વરે જે પરસેવે ન્હાય         "));


        ListProfile.add(new ListProfile("   બગલમાં છરી અને ગામમાં ઢંઢેરો         "));


        ListProfile.add(new ListProfile("   લૂલી વાસીદુ વાળે અને સાત જણને કામે લગાડે        "));


        ListProfile.add(new ListProfile("   બાંધી મુઠી લાખની        "));


        ListProfile.add(new ListProfile("   લાખ મળ્યાં નહિ અને લખેશ્રી થયા નહિ         "));


        ListProfile.add(new ListProfile("   નાણાં વગરનો નાથીયો ,નાણે નાથા લાલ        "));


        ListProfile.add(new ListProfile("   લાલો લાભ વિના ન લૂટે       "));


        ListProfile.add(new ListProfile("   હિમ્મતે મર્દા તો મદદે ખુદા         "));


        ListProfile.add(new ListProfile("   પૈની પેદાશ નહી અને ઘડીની નવરાશ નહી       "));


        ListProfile.add(new ListProfile("   છાશ લેવા જવુ અને દોહણી સંતાડવી       "));


        ListProfile.add(new ListProfile("   ધોબીનો કૂતરો ન ઘર નો , ન ઘાટનો      "));


        ListProfile.add(new ListProfile("   ધરમની ગાયનાં દાંત ન જોવાય      "));


        ListProfile.add(new ListProfile("   હાથી જીવતો લાખનો , મરે તો સવા લાખનો       "));


        ListProfile.add(new ListProfile("   અધૂરો ઘડો છલકાય ઘણો       "));


        ListProfile.add(new ListProfile("   ખાલી ચણો વાગે ઘણો       "));


        ListProfile.add(new ListProfile("   પારકી મા જ કાન વિંધે         "));


        ListProfile.add(new ListProfile("   જ્યાં ન પહોચે રવિ, ત્યાં પહોંચે કવિ અને જ્યાં ન પહોંચે કવિ ત્યાં પહોંચે અનુભવી        "));


        ListProfile.add(new ListProfile("   ટીંપે ટીંપે સરોવર ભરાય      "));


        ListProfile.add(new ListProfile("   દૂરથી ડુંગર રળિયામણાં       "));


        ListProfile.add(new ListProfile("   લોભી હોય ત્યાં ધૂતારા ભૂખે ન મરે        "));


        ListProfile.add(new ListProfile("   શેરને માથે સવાશેર      "));


        ListProfile.add(new ListProfile("   શેઠની શીખામણ જાંપા સુધી      "));


        ListProfile.add(new ListProfile("   હિરો ગોગે જઈને આવ્યો અને ડેલીએ હાથ દઈને પાછો આવ્યો      "));


        ListProfile.add(new ListProfile("   સીધુ જાય અને યજમાન રીસાય      "));


        ListProfile.add(new ListProfile("   વર મરો, કન્યા મરો પણ ગોરનું તરભાણું ભરો       "));


        ListProfile.add(new ListProfile("   હસે તેનું ઘર વસે     "));


        ListProfile.add(new ListProfile("   બેગાની શાદીમેં અબ્દુલ્લા દિવાના      "));


        ListProfile.add(new ListProfile("   ફરે તે ચરે, બાંધ્યા ભૂખ્યા મરે        "));


        ListProfile.add(new ListProfile("   ભેંસ આગળ ભાગવત       "));


        ListProfile.add(new ListProfile("   ઘરનાં છોકરાં ઘંટી ચાટે ને પાડોશીને આંટો        "));


        ListProfile.add(new ListProfile("   રાત થોડી ને વેશ ઝાઝા     "));


        ListProfile.add(new ListProfile("   ના મામા કરતાં કાણો મામો સારો         "));


        ListProfile.add(new ListProfile("   ભેંસ ભાગોળે અને છાશ છાગોળે        "));


        ListProfile.add(new ListProfile("   વડ જેવા ટેટા ને બાપ જેવા બેટાં         "));


        ListProfile.add(new ListProfile("   પાડાનાં વાંકે પખાલીને ડામ       "));


        ListProfile.add(new ListProfile("   રામ રાખે તેને કોણ ચાખે     "));


        ListProfile.add(new ListProfile("   ઊંટના અઢાર વાંકા      "));


        ListProfile.add(new ListProfile("   ઝાઝા હાથ રળીયામણાં        "));


        ListProfile.add(new ListProfile("   કીડીને કણ ને હાથીને મણ      "));


        ListProfile.add(new ListProfile("   સંગર્યો સાપ પણ કામનો         "));


        ListProfile.add(new ListProfile("   ખોદ્યો ડુંગર, નીકળ્યો ઉંદર    "));


        ListProfile.add(new ListProfile("   નાચ ન જાને આંગન ટેઢા    "));


        ListProfile.add(new ListProfile("   ઝાઝી કીડીઓ સાપને તાણે         "));


        ListProfile.add(new ListProfile("   મન હોય તો માંડવે જવાય      "));


        ListProfile.add(new ListProfile("   અણી ચૂક્યો સો વર્ષ જીવે        "));


        ListProfile.add(new ListProfile("   પારકી આશ સદા નીરાશ       "));


        ListProfile.add(new ListProfile("   ઘરકી મૂર્ઘી દાલ બરાબર          "));


        ListProfile.add(new ListProfile("   બાર વર્ષે બાવો બાલ્યો        "));


        ListProfile.add(new ListProfile("   પહેલુ સુખ તે જાતે નર્યા    "));

        ListProfile.add(new ListProfile("   ભાવતુ હતુ ને વૈદે કીધુ     "));


        ListProfile.add(new ListProfile("   જેને કોઇ ન પહોંચે તેને તેનુ પેટ પહોંચે       "));


        ListProfile.add(new ListProfile("   નામ મોટા દર્શન ખોટા        "));


        ListProfile.add(new ListProfile("   લાતો ના ભૂત વાતોથી ન માને        "));


        ListProfile.add(new ListProfile("   ચેતતા નર સદા સુખી      "));


        ListProfile.add(new ListProfile("   સો દાહ્ડાં સાસુના એક દા‘હ્ડો વહુનો       "));


        ListProfile.add(new ListProfile("   વાડ થઈને ચીભડાં ગળે         "));


        ListProfile.add(new ListProfile("   ઉતાવળે આંબા ન પાકે         "));


        ListProfile.add(new ListProfile("   સાપ ગયા અને લીસોટા રહી ગયા        "));


        ListProfile.add(new ListProfile("   મોરનાં ઈંડા ચીતરવા ન પડે         "));


        ListProfile.add(new ListProfile("   પાકા ઘડે કાંઠા ન ચડે     "));


        ListProfile.add(new ListProfile("   કાશીમાં પણ કાગડા તો કાળા જ       "));


        ListProfile.add(new ListProfile("   કૂતરાની પૂંછડી જમીનમાં દટો તો પણ વાંકી ને વાંકી જ       "));


        ListProfile.add(new ListProfile("   પુત્રનાં લક્ષણ પારણાં માં અને વહુનાં લક્ષણ બારણાં માં       "));

        ListProfile.add(new ListProfile("   ગા વાળે તે ગોવાળ       "));


        ListProfile.add(new ListProfile("   બાંધે એની તલવાર       "));


        ListProfile.add(new ListProfile("    ઘેર ઘેર માટીનાં ચૂલા       "));


        ListProfile.add(new ListProfile("   ઝાઝા ગુમડે ઝાઝી વ્યથા   "));


        ListProfile.add(new ListProfile("   મારુ મારુ આગવુ ને તારુ મારુ સહીયારુ        "));


        ListProfile.add(new ListProfile("   આગ લાગે ત્યારે કૂવો ખોદવા ન જવાય       "));


        ListProfile.add(new ListProfile("   આંધળામાં કાણો રાજા       "));


        ListProfile.add(new ListProfile("   ઈદ પછી રોજા      "));


        ListProfile.add(new ListProfile("   ખાડો ખોદે તે પડે       "));


        ListProfile.add(new ListProfile("  ક્યાં રાજા ભોજ , ક્યાં ગંગુ તલી         "));


        ListProfile.add(new ListProfile("   નમે તે સૌને ગમે        "));


        ListProfile.add(new ListProfile("   દુકાળમાં અધિક માસ        "));


        ListProfile.add(new ListProfile("   એક સાંધતા તેર તૂટે         "));


        ListProfile.add(new ListProfile("    કામ કરે તે કાલા, વાત કરે તે વ્હાલાં       "));


        ListProfile.add(new ListProfile("    મા તે મા, બીજા વગડાનાં વા         "));


        ListProfile.add(new ListProfile("   ધીરજનાં ફળ મીઠાં          "));


        ListProfile.add(new ListProfile("  માણ્યુ તેનું સ્મરણ પણ લહાણું         "));


        ListProfile.add(new ListProfile("  કૂવામાં હોય તો હવાડામાં આવે        "));


        ListProfile.add(new ListProfile("   સો સોનાર કી એક લૂહાર કી         "));


        ListProfile.add(new ListProfile("   રાજા ને ગમે તે રાણી         "));


        ListProfile.add(new ListProfile("   કાગનું બેસવુ અને ડાળનું પડવું         "));









        lv= (ListView)findViewById(R.id.lv);
        appAdapter=new MyAppAdapter(ListProfile,MainActivity.this);
        lv.setAdapter(appAdapter);





    }


    public class MyAppAdapter extends BaseAdapter {


        public class ViewHolder1 {
            TextView txt;
            Button bt1,bt2;
            /* ImageView Img1,Img2;*/

        }

        public ArrayList<ListProfile> List;

        public Context context;


        MyAppAdapter(ArrayList<ListProfile> apps, Context context) {
            this.List = apps;
            this.context = context;

        }

        @Override
        public int getCount() {
            return List.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View rowView = convertView;
            MainActivity.MyAppAdapter.ViewHolder1 viewHolder1;

            if (rowView == null) {
                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.list_view, parent,false);
                // configure view holder
                viewHolder1 = new MainActivity.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt = (TextView) rowView.findViewById(R.id.txt);


                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (MainActivity.MyAppAdapter.ViewHolder1) convertView.getTag();
            }
            viewHolder1.txt.setText(List.get(position).getTxt()+"");

            viewHolder1.bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                    ClipData clip = ClipData.newPlainText("label", List.get(position).getTxt());
                    clipboard.setPrimaryClip(clip);
                    Toast.makeText(context, "Text Copied", Toast.LENGTH_SHORT).show();


                }
            });



            viewHolder1.bt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent shareintent = new Intent();
                    shareintent.setAction(Intent.ACTION_SEND);
                    shareintent.putExtra(Intent.EXTRA_TEXT,List.get(position).getTxt());
                    shareintent.setType("text/plain");
                    startActivity(shareintent);
                }
            });




            return rowView;
        }
    }









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.favourite, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }

        if (item.getItemId() == R.id.more)
        {
            Intent intent = new Intent(MainActivity.this,More_Apps.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home)
        {
            Intent intent = new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        }



        if (id == R.id.exit)
        {
            finish();
            System.exit(0);
        }

        if (id == R.id.share)
        {
            Intent share = new Intent();
            share.setAction(Intent.ACTION_SEND);
            share.putExtra(Intent.EXTRA_TEXT,"Hey Check my new App for Best Best Bollywood Dailgoues \n\n  https://play.google.com/store/apps/details?id=com.sunny.bollywoodfilmydialogues");
            share.setType("text/plain");
            startActivity(share);
        }

        if (id == R.id.rate)
        {
            Toast.makeText(this,"This is Rate App Activity.",Toast.LENGTH_LONG).show();
        }

        if (id == R.id.more)
        {
            Intent intent = new Intent(MainActivity.this,More_Apps.class);
            startActivity(intent);
        }

        if (id == R.id.about)
        {
            Intent intent = new Intent(this,About_us.class);
            startActivity(intent);
        }



        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
