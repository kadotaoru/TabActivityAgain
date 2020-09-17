package to.msn.wings.tabactivityagain.ui.main;

import android.util.Log;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.google.android.material.tabs.TabLayout;

import static android.content.ContentValues.TAG;

//Tabの中身
public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            //テキストの内容
            Log.i(TAG, "PageViewのinput:" + input);
            if(input==1){
                return "TAB1の内容: fragment1" ;
            } else{
                return "TAB2の内容: fragment2"  ;
            }

        }


    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}