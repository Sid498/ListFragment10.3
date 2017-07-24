package com.example.sid.listfragment103;
import android.content.Context;
import android.app.Fragment;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by SID on 7/24/2017.
 */

public class Fragment_List extends Fragment {

    ArrayList<Data> arrayList;
    ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment,container,false);
        listView = (ListView) view.findViewById(R.id.listitem);

        String mYoutube = "Youtube Description";
        String mBlogger = "Blogger Description";

        String mName[] = new String[]{"Youtube","Blogger"};
        String mInfo[] = new String[]{mYoutube,mBlogger};

        int mId[] = new int[]{R.drawable.youtube,R.drawable.blogger};

        arrayList = new ArrayList();
        for(int i=0;i<mName.length;i++){
            Data data = new Data();
            data.setmName(mName[i]);
            data.setmInfo(mInfo[i]);
            data.setmId(mId[i]);
            arrayList.add(data);
        }
        CustomAdapter customAdapter = new CustomAdapter(this,arrayList);
        listView.setAdapter(customAdapter);
        return view;
    }
}
