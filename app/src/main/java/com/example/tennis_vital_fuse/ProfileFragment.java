package com.example.tennis_vital_fuse;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    ImageView avatartv;
    TextView nam, email;
    RecyclerView postrecycle;
    FloatingActionButton fab;
    ProgressDialog pd;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // creating a view to inflate the layout
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        firebaseAuth = FirebaseAuth.getInstance();

        // getting current user data
        firebaseUser = firebaseAuth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Users");

        // Initialising the text view and imageview
        avatartv = view.findViewById(R.id.avatartv);
        nam = view.findViewById(R.id.nametv);
        email = view.findViewById(R.id.emailtv);
        fab = view.findViewById(R.id.fab);
        pd = new ProgressDialog(getActivity());
        pd.setCanceledOnTouchOutside(false);
        Query query = databaseReference.orderByChild("email").equalTo(firebaseUser.getEmail());

        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    // Retrieving Data from firebase
                    String name = "" + dataSnapshot1.child("name").getValue();
                    String emaill = "" + dataSnapshot1.child("email").getValue();
                    String image = "" + dataSnapshot1.child("image").getValue();
                    // setting data to our text view
                    nam.setText(name);
                    email.setText(emaill);
                    try {
                        Glide.with(getActivity()).load(image).into(avatartv);
                    } catch (Exception e) {

                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        // On click we will open EditProfileActiity
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), EditProfilePage.class));
            }
        });
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }
}


/*
public class ProfileFragment extends Fragment {
//firebase
    FirebaseAuth firebaseAuth;
    FirebaseUser user;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    //views from xml
    ImageView avatarIv,coverIv;
    TextView nameTv, emailTv,phoneTv;
    RecyclerView postrecycle;
    FloatingActionButton fab;

    ProgressDialog pd;
    Button MatchTracker;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // creating a view to inflate the layout
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        //init firebasae
        firebaseAuth = FirebaseAuth.getInstance();
        // getting current user data
        user = firebaseAuth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Users");

        // Initialising the text view and imageview
        avatarIv = view.findViewById(R.id.avatarIv);
        coverIv = view.findViewById(R.id.coverIv);
        nameTv = view.findViewById(R.id.nameTv);
        emailTv = view.findViewById(R.id.emailTv);
        phoneTv = view.findViewById(R.id.phoneTv);
        fab = view.findViewById(R.id.fab);
//init progress dialog
        MatchTracker = view.findViewById(R.id.matchTracker);
        pd = new ProgressDialog(getActivity());
        pd.setCanceledOnTouchOutside(false);
        Query query = databaseReference.orderByChild("email").equalTo(user.getEmail());

        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    // Retrieving Data from firebase
                    String name = "" + dataSnapshot1.child("name").getValue();
                    String email = "" + dataSnapshot1.child("email").getValue();
                    String phone = "" + dataSnapshot1.child("phone").getValue();
                    String image = "" + dataSnapshot1.child("image").getValue();
                    String cover = "" + dataSnapshot1.child("cover").getValue();
                    // setting data to our text view
                    nameTv.setText(name);
                    emailTv.setText(email);
                    phoneTv.setText(phone);

                    try {
                        Picasso.get().load(image).into(avatarIv);
                        Glide.with(getActivity()).load(image).into(avatarIv);
                    } catch (Exception e) {
Picasso.get().load(R.drawable.ic_add_image).into(avatarIv);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        // On click we will open EditProfileActivity
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showEditProfileDialog();
                // startActivity(new Intent(getActivity(), EditProfilePage.class));
            }
        });

        MatchTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),MatchTracker.class));
            }
        });
        return view;
    }

    private void showEditProfileDialog() {
        String options[] = {"Edit Profile Picture", "Edit Cover Photo", "Edit Name", "Edit Photo"};
        //alert dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //set title
        builder.setTitle("Choose Action");
        //set items to diolog
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //handle dialog item click
                if (which == 0) {
                    //Edit Profile Clicked
                } else if (which == 1) {
                    //Edit Cover clicked
                } else if (which == 2) {
                    //Edit Name clicked
                } else if (which == 3) {
                    //Edit Photo clicked
                }
            }
        });

        builder.create().show();

    }
}
*/
