package com.example.mm;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mm.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng han1 = new LatLng(37.194244714900925, 127.02810730931157);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("그린빌리지");
        markerOptions.snippet("원룸");
        markerOptions.position(han1);
        googleMap.addMarker(markerOptions);

        LatLng han2 = new LatLng(37.193983570617505, 127.02742015984143);
        markerOptions.title("아카텔원룸");
        markerOptions.snippet("원룸");
        markerOptions.position(han2);
        googleMap.addMarker(markerOptions);

        LatLng han3 = new LatLng(37.19417734952316, 127.02719215037632);
        markerOptions.title("한빛타운");
        markerOptions.snippet("원룸");
        markerOptions.position(han3);
        googleMap.addMarker(markerOptions);

        LatLng han51 = new LatLng(37.194741, 127.024890);
        markerOptions.title("송정빌");
        markerOptions.snippet("원룸");
        markerOptions.position(han51);
        googleMap.addMarker(markerOptions);

        LatLng han52 = new LatLng(37.194416, 127.024899);
        markerOptions.title("다운타운");
        markerOptions.snippet("원룸");
        markerOptions.position(han52);
        googleMap.addMarker(markerOptions);

        LatLng han53 = new LatLng(37.194951, 127.023484);
        markerOptions.title("에덴빌");
        markerOptions.snippet("원룸");
        markerOptions.position(han53);
        googleMap.addMarker(markerOptions);

        LatLng han54 = new LatLng(37.195039, 127.023572);
        markerOptions.title("케이타운");
        markerOptions.snippet("원룸");
        markerOptions.position(han54);
        googleMap.addMarker(markerOptions);

        LatLng han55 = new LatLng(37.195505, 127.023971);
        markerOptions.title("우정빌라");
        markerOptions.snippet("원룸");
        markerOptions.position(han55);
        googleMap.addMarker(markerOptions);

        LatLng han56 = new LatLng(37.195372, 127.024003);
        markerOptions.title("리더스빌");
        markerOptions.snippet("원룸");
        markerOptions.position(han56);
        googleMap.addMarker(markerOptions);

        LatLng han57 = new LatLng(37.194928, 127.024137);
        markerOptions.title("엘빌");
        markerOptions.snippet("원룸");
        markerOptions.position(han57);
        googleMap.addMarker(markerOptions);

        LatLng han58 = new LatLng(37.195368, 127.024846);
        markerOptions.title("아리따움B");
        markerOptions.snippet("원룸");
        markerOptions.position(han58);
        googleMap.addMarker(markerOptions);

        LatLng han59 = new LatLng(37.194753, 127.024605);
        markerOptions.title("city view");
        markerOptions.snippet("원룸");
        markerOptions.position(han59);
        googleMap.addMarker(markerOptions);

        LatLng han60 = new LatLng(37.194984, 127.025040);
        markerOptions.title("하나주택");
        markerOptions.snippet("원룸");
        markerOptions.position(han60);
        googleMap.addMarker(markerOptions);

        LatLng han61 = new LatLng(37.194943, 127.025171);
        markerOptions.title("드래곤원룸");
        markerOptions.snippet("원룸");
        markerOptions.position(han61);
        googleMap.addMarker(markerOptions);

        LatLng han62 = new LatLng(37.194765, 127.025137);
        markerOptions.title("별빛채룸");
        markerOptions.snippet("원룸");
        markerOptions.position(han62);
        googleMap.addMarker(markerOptions);

        LatLng han63 = new LatLng(37.194912, 127.025445);
        markerOptions.title("둥지원룸");
        markerOptions.snippet("원룸");
        markerOptions.position(han63);
        googleMap.addMarker(markerOptions);

        LatLng han64 = new LatLng(37.194815, 127.025625);
        markerOptions.title("모던캐슬");
        markerOptions.snippet("원룸");
        markerOptions.position(han64);
        googleMap.addMarker(markerOptions);

        LatLng han65 = new LatLng(37.194626, 127.025673);
        markerOptions.title("동인원룸");
        markerOptions.snippet("원룸");
        markerOptions.position(han65);
        googleMap.addMarker(markerOptions);

        LatLng han101 = new LatLng(37.194971359600224, 127.02196907731901);
        markerOptions.title("황금빌라");
        markerOptions.snippet("원룸");
        markerOptions.position(han101);
        googleMap.addMarker(markerOptions);

        LatLng han102 = new LatLng(37.1947325628558, 127.02206474592195);
        markerOptions.title("삼우원룸");
        markerOptions.snippet("원룸");
        markerOptions.position(han102);
        googleMap.addMarker(markerOptions);

        LatLng han103 = new LatLng(37.1948270843376, 127.02253783135157);
        markerOptions.title("모던쉐르빌");
        markerOptions.snippet("원룸");
        markerOptions.position(han103);
        googleMap.addMarker(markerOptions);

        LatLng han104 = new LatLng(37.19498022562555, 127.02273498473872);
        markerOptions.title("태호원룸");
        markerOptions.snippet("원룸");
        markerOptions.position(han104);
        googleMap.addMarker(markerOptions);

        LatLng han105 = new LatLng(37.194588, 127.022259);
        markerOptions.title("아셀원룸");
        markerOptions.snippet("원룸");
        markerOptions.position(han105);
        googleMap.addMarker(markerOptions);

        LatLng han106 = new LatLng(37.194651, 127.022706);
        markerOptions.title("한신원룸");
        markerOptions.snippet("원룸");
        markerOptions.position(han106);
        googleMap.addMarker(markerOptions);

        LatLng han107 = new LatLng(37.194908, 127.022276);
        markerOptions.title("한실빌");
        markerOptions.snippet("원룸");
        markerOptions.position(han107);
        googleMap.addMarker(markerOptions);

        LatLng han108 = new LatLng(37.194090, 127.026627);
        markerOptions.title("한실오피스텔A");
        markerOptions.snippet("원룸");
        markerOptions.position(han108);
        googleMap.addMarker(markerOptions);

        LatLng han109 = new LatLng(37.194053, 127.026834);
        markerOptions.title("한실오피스텔B");
        markerOptions.snippet("원룸");
        markerOptions.position(han109);
        googleMap.addMarker(markerOptions);

        LatLng han110 = new LatLng(37.193984, 127.026924);
        markerOptions.title("한실오피스텔C");
        markerOptions.snippet("원룸");
        markerOptions.position(han110);
        googleMap.addMarker(markerOptions);

        LatLng han111 = new LatLng(37.194512, 127.026598);
        markerOptions.title("이레빌");
        markerOptions.snippet("원룸");
        markerOptions.position(han111);
        googleMap.addMarker(markerOptions);

        LatLng han112 = new LatLng(37.194361, 127.026943);
        markerOptions.title("디에스빌");
        markerOptions.snippet("원룸");
        markerOptions.position(han112);
        googleMap.addMarker(markerOptions);

        LatLng han113 = new LatLng(37.193721, 127.027338);
        markerOptions.title("케미빌");
        markerOptions.snippet("원룸");
        markerOptions.position(han113);
        googleMap.addMarker(markerOptions);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(han51, 16));
    }
}