package com.cn.word;

import org.ansj.splitWord.analysis.ToAnalysis;

/**
 * Created by lijunhong on 16/9/1.
 */
public class Word {

    public static void main(String [] args){
        String str = "晟非夜把童朝夕从别人的床上救下来，从此日日宠她入骨。原因只有一个，他喜欢她这么坏。\n" +
                "从寡妇到宠儿，她只用了三天的时间，但他把她养成他的女人，足足用了三十个晚上。\n" +
                "她想尽办法让他厌烦，他却越看越喜欢。\n" +
                "她选择当男科医生，他主动给她当病人，你尽管治，随便瞄，任意切。\n" +
                "日日夜夜，晟非夜啃她上了瘾，他说：没办法，肾好，且咱俩型号正配。\n" +
                "当她发现他的秘密，愤而撕掉协议的那天，晟非夜发怒了：童朝夕，你只有两条路可走，一是睡服我，一是睡死我，你选。\n" +
                "全世界的闪光灯都对准她和他，要报道这则“丑闻”的时候，他揽着她，骄傲地说：“我睡我太太，光明正大。”\n" +
                "看着那群人渣落荒而逃，晟非夜牵着她的手说：“不要怕，从此我带你虐渣渣……”年是脑袋是当年事地阿森纳电商代收的耐受你的";
        
//        System.out.println(seAnalysis.parse(str));
        System.out.println(ToAnalysis.parse(str));
    }
}
