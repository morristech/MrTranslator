package com.zhaoweihao.mrtranslator.Util;

import com.google.gson.Gson;
import com.zhaoweihao.mrtranslator.gson.Translate;

/**
 * Created by Administrator on 2017/4/13.
 */

public class Utility {
    public static Translate handleTranslateResponse(String response){
        Gson gson=new Gson();
        Translate translate=gson.fromJson(response,Translate.class);
        return translate;
    }

}