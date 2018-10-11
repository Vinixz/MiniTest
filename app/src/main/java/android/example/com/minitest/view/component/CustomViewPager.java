package android.example.com.minitest.view.component;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Felix on 4/21/2017.
 */

public class CustomViewPager extends ViewPager {
    public static int number = 0;

    public CustomViewPager(Context context) {
        super(context);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height = 0;
        if(number != 0){
            height = number;
        }
        else{
            for(int i = 0; i < getChildCount(); i++) {
                View child = getChildAt(i);

                child.measure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
                int h = child.getMeasuredHeight();


                if(h > height)
                {
                    height = h;
                    number = height;
                }
            }

        }
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
