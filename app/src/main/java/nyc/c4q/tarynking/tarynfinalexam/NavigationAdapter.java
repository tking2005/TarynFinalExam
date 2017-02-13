package nyc.c4q.tarynking.tarynfinalexam;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tarynking on 2/12/17.
 */

public class NavigationAdapter extends RecyclerView.Adapter<NavigationViewHolder> {

    ImageViewList heartImage = new ImageViewList(R.drawable.heart_icon, "Button 1");
    ImageViewList emailImage = new ImageViewList(R.drawable.email_icon2, "Button 2");
    ImageViewList contactIcon = new ImageViewList(R.drawable.messaging_contacts_icon2, "Button 3");
    ImageViewList logoutIcon = new ImageViewList(R.drawable.x_logout_icon, "Logout");

    private List<ImageViewList> imageViews = Arrays.asList(heartImage, emailImage, contactIcon, logoutIcon);


    @Override
    public NavigationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_navigation_drawer_layout, parent, false);
        return new NavigationViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(NavigationViewHolder holder, int position) {
        NavigationViewHolder navigationViewHolder = (NavigationViewHolder) holder;
        ImageViewList imageViewList = imageViews.get(position);
//        ImageView currentImage = navigationViewHolder.get(position);
//        navigationViewHolder.bind(currentImage);
        navigationViewHolder.bind(imageViewList);


    }

    @Override
    public int getItemCount() {
        return imageViews.size();
    }


}




