package com.vchat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SectionsPagerAdapter extends FragmentPagerAdapter{


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {
            //case 0:
              //  RequestsFragment requestsFragment = new RequestsFragment();
                //return requestsFragment;


            case 0:
                FriendsFragment friendsFragment = new FriendsFragment();
                return friendsFragment;

            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return 1;
    }

    public CharSequence getPageTitle(int position){

        switch (position) {
            //case 0:
              //  return "REQUESTS";

            case 0:
                return "CHATS";

            default:
                return null;
        }

    }

}
