package com.wangbo.www.cclive.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/8/29.
 */
public class GameTypeBean {

    /**
     * reason : Success
     * data : {"total":22,"list":[{"name":"《梦幻西游》电脑版","icon":"http://c.cotton
     * .netease.com/buckets/4NhQWd/files/Pstie7X","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=3&tab_id=301","cover":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstieAz","livetype":"game",
     * "priority":500,"version":1,"gametype":"3","tab_id":"301",
     * "exclude_gametype":[],"type":"category","cate_type":"1",
     * "anchor_type":""},{"name":"大话西游2经典版","icon":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstjIp4","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=6&tab_id=302","cover":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstjIpo","livetype":"game",
     * "priority":480,"version":1,"gametype":"6","tab_id":"302",
     * "exclude_gametype":[],"type":"category","cate_type":"1",
     * "anchor_type":""},{"name":"守望先锋","icon":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstjdlE","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=1007&tab_id=303","cover":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/Pstjdls","livetype":"game",
     * "priority":460,"version":1,"gametype":"1007","tab_id":"303",
     * "exclude_gametype":[],"type":"category","cate_type":"1",
     * "anchor_type":""},{"name":"美女娱乐","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=-1000&tab_id=322","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PuaRyvb",
     * "livetype":"game","priority":456,"anchor_type":"","version":1,
     * "gametype":"-1000","tab_id":"322","icon1_selected":"","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PuaRyup","type":"category",
     * "cate_type":"3","exclude_gametype":[]},{"name":"户外直播","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PtLHBsT","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=65001&tab_id=321","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PtLHBuA",
     * "livetype":"game","priority":455,"version":1,"gametype":"65001",
     * "tab_id":"321","exclude_gametype":[],"type":"category",
     * "cate_type":"3","anchor_type":""},{"name":"《梦幻西游》手游","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstjunO","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=25&tab_id=304",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Pstjunv",
     * "livetype":"game","priority":440,"version":1,"gametype":"25",
     * "tab_id":"304","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"天下3","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstkHgi","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=2&tab_id=305",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstkHhE",
     * "livetype":"game","priority":420,"version":1,"gametype":"2",
     * "tab_id":"305","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"大话西游手游","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstkgHn","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=28&tab_id=306","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstkgOc",
     * "livetype":"game","priority":400,"version":1,"gametype":"28",
     * "tab_id":"306","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"炉石传说","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstlB2N","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=1005&tab_id=307","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstlB8K",
     * "livetype":"game","priority":380,"version":1,"gametype":"1005",
     * "tab_id":"307","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"新倩女幽魂","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstlZY7","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=4&tab_id=308",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstlZZY",
     * "livetype":"game","priority":360,"version":1,"gametype":"4",
     * "tab_id":"308","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"天谕","icon":"http://c.cotton
     * .netease.com/buckets/4NhQWd/files/PstnmQW","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=21&tab_id=312","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstnmR9",
     * "livetype":"game","priority":280,"version":1,"gametype":"21",
     * "tab_id":"312","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"风暴英雄","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/Psto0r3","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=1006&tab_id=313",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Psto0rm",
     * "livetype":"game","priority":260,"version":1,"gametype":"1006",
     * "tab_id":"313","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"乱斗西游2","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstoJyM","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=24&tab_id=314","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstoJzM",
     * "livetype":"game","priority":240,"version":1,"gametype":"24",
     * "tab_id":"314","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"乖离性百万亚瑟王","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/Pstohes","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=9005&tab_id=315",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Pstohfd",
     * "livetype":"game","priority":220,"version":1,"gametype":"9005",
     * "tab_id":"315","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"倩女幽魂手游","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/Pstp01K","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=30&tab_id=316",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Pstp01l",
     * "livetype":"game","priority":200,"version":1,"gametype":"30",
     * "tab_id":"316","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"《梦幻西游》无双版","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstpLOw","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=9007&tab_id=317",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstpLPl",
     * "livetype":"game","priority":180,"version":1,"gametype":"9007",
     * "tab_id":"317","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"《天下》手游","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PszJdqg","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=9009&tab_id=320","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PszJdrO",
     * "livetype":"game","priority":175,"version":1,"gametype":"9009",
     * "tab_id":"320","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"大话西游2免费版","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstpaLa","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=20&tab_id=318","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstpaNQ",
     * "livetype":"game","priority":160,"version":1,"gametype":"20",
     * "tab_id":"318","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"魔兽世界","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstlppI","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=1001&tab_id=309","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Pstlpps",
     * "livetype":"game","priority":158,"version":1,"gametype":"1001",
     * "tab_id":"309","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"无尽战区","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstmO7B","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=29&tab_id=310","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstmO8L",
     * "livetype":"game","priority":156,"version":1,"gametype":"29",
     * "tab_id":"310","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"镇魔曲","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstmfCh","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=23&tab_id=311","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstmfD8",
     * "livetype":"game","priority":154,"version":1,"gametype":"23",
     * "tab_id":"311","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"其他游戏","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PsuroKW","url":"http://mlive
     * .cc.163.com/mlive/game/category_other?gametype=0&exclude_gametype=3,6,
     * 1007,25,2,28,1005,4,1001,29,23,21,1006,24,9005,30,9007,20&tab_id=319",
     * "icon1":"","cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PsuroLr","livetype":"game","priority":140,
     * "version":1,"gametype":"0","tab_id":"319","exclude_gametype":["3,6,
     * 1007,25,2,28,1005,4,1001,29,23,21,1006,24,9005,30,9007,20"],
     * "type":"category","cate_type":"1","anchor_type":""}],"page":1,
     * "page_size":100}
     * result : 0
     */

    @SerializedName("reason")
    private String reason;
    /**
     * total : 22
     * list : [{"name":"《梦幻西游》电脑版","icon":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/Pstie7X","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=3&tab_id=301","cover":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstieAz","livetype":"game",
     * "priority":500,"version":1,"gametype":"3","tab_id":"301",
     * "exclude_gametype":[],"type":"category","cate_type":"1",
     * "anchor_type":""},{"name":"大话西游2经典版","icon":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstjIp4","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=6&tab_id=302","cover":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstjIpo","livetype":"game",
     * "priority":480,"version":1,"gametype":"6","tab_id":"302",
     * "exclude_gametype":[],"type":"category","cate_type":"1",
     * "anchor_type":""},{"name":"守望先锋","icon":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstjdlE","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=1007&tab_id=303","cover":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/Pstjdls","livetype":"game",
     * "priority":460,"version":1,"gametype":"1007","tab_id":"303",
     * "exclude_gametype":[],"type":"category","cate_type":"1",
     * "anchor_type":""},{"name":"美女娱乐","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=-1000&tab_id=322","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PuaRyvb",
     * "livetype":"game","priority":456,"anchor_type":"","version":1,
     * "gametype":"-1000","tab_id":"322","icon1_selected":"","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PuaRyup","type":"category",
     * "cate_type":"3","exclude_gametype":[]},{"name":"户外直播","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PtLHBsT","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=65001&tab_id=321","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PtLHBuA",
     * "livetype":"game","priority":455,"version":1,"gametype":"65001",
     * "tab_id":"321","exclude_gametype":[],"type":"category",
     * "cate_type":"3","anchor_type":""},{"name":"《梦幻西游》手游","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstjunO","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=25&tab_id=304",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Pstjunv",
     * "livetype":"game","priority":440,"version":1,"gametype":"25",
     * "tab_id":"304","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"天下3","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstkHgi","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=2&tab_id=305",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstkHhE",
     * "livetype":"game","priority":420,"version":1,"gametype":"2",
     * "tab_id":"305","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"大话西游手游","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstkgHn","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=28&tab_id=306","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstkgOc",
     * "livetype":"game","priority":400,"version":1,"gametype":"28",
     * "tab_id":"306","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"炉石传说","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstlB2N","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=1005&tab_id=307","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstlB8K",
     * "livetype":"game","priority":380,"version":1,"gametype":"1005",
     * "tab_id":"307","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"新倩女幽魂","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstlZY7","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=4&tab_id=308",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstlZZY",
     * "livetype":"game","priority":360,"version":1,"gametype":"4",
     * "tab_id":"308","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"天谕","icon":"http://c.cotton
     * .netease.com/buckets/4NhQWd/files/PstnmQW","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=21&tab_id=312","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstnmR9",
     * "livetype":"game","priority":280,"version":1,"gametype":"21",
     * "tab_id":"312","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"风暴英雄","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/Psto0r3","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=1006&tab_id=313",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Psto0rm",
     * "livetype":"game","priority":260,"version":1,"gametype":"1006",
     * "tab_id":"313","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"乱斗西游2","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstoJyM","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=24&tab_id=314","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstoJzM",
     * "livetype":"game","priority":240,"version":1,"gametype":"24",
     * "tab_id":"314","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"乖离性百万亚瑟王","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/Pstohes","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=9005&tab_id=315",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Pstohfd",
     * "livetype":"game","priority":220,"version":1,"gametype":"9005",
     * "tab_id":"315","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"倩女幽魂手游","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/Pstp01K","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=30&tab_id=316",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Pstp01l",
     * "livetype":"game","priority":200,"version":1,"gametype":"30",
     * "tab_id":"316","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"《梦幻西游》无双版","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstpLOw","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=9007&tab_id=317",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstpLPl",
     * "livetype":"game","priority":180,"version":1,"gametype":"9007",
     * "tab_id":"317","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"《天下》手游","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PszJdqg","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=9009&tab_id=320","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PszJdrO",
     * "livetype":"game","priority":175,"version":1,"gametype":"9009",
     * "tab_id":"320","exclude_gametype":[],"type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"大话西游2免费版","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstpaLa","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=20&tab_id=318","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstpaNQ",
     * "livetype":"game","priority":160,"version":1,"gametype":"20",
     * "tab_id":"318","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"魔兽世界","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstlppI","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=1001&tab_id=309","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Pstlpps",
     * "livetype":"game","priority":158,"version":1,"gametype":"1001",
     * "tab_id":"309","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"无尽战区","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstmO7B","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=29&tab_id=310","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstmO8L",
     * "livetype":"game","priority":156,"version":1,"gametype":"29",
     * "tab_id":"310","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"镇魔曲","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstmfCh","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=23&tab_id=311","icon1":"",
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstmfD8",
     * "livetype":"game","priority":154,"version":1,"gametype":"23",
     * "tab_id":"311","exclude_gametype":[],"type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"其他游戏","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PsuroKW","url":"http://mlive
     * .cc.163.com/mlive/game/category_other?gametype=0&exclude_gametype=3,6,
     * 1007,25,2,28,1005,4,1001,29,23,21,1006,24,9005,30,9007,20&tab_id=319",
     * "icon1":"","cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PsuroLr","livetype":"game","priority":140,
     * "version":1,"gametype":"0","tab_id":"319","exclude_gametype":["3,6,
     * 1007,25,2,28,1005,4,1001,29,23,21,1006,24,9005,30,9007,20"],
     * "type":"category","cate_type":"1","anchor_type":""}]
     * page : 1
     * page_size : 100
     */

    @SerializedName("data")
    private DataBean data;
    @SerializedName("result")
    private int result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public static class DataBean {
        @SerializedName("total")
        private int total;
        @SerializedName("page")
        private int page;
        @SerializedName("page_size")
        private int pageSize;
        /**
         * name : 《梦幻西游》电脑版
         * icon : http://c.cotton.netease.com/buckets/4NhQWd/files/Pstie7X
         * url : http://mlive.cc.163
         * .com/mlive/game/category?gametype=3&tab_id=301
         * cover : http://c.cotton.netease.com/buckets/4NhQWd/files/PstieAz
         * livetype : game
         * priority : 500
         * version : 1
         * gametype : 3
         * tab_id : 301
         * exclude_gametype : []
         * type : category
         * cate_type : 1
         * anchor_type :
         */

        @SerializedName("list")
        private List<ListBean> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            @SerializedName("name")
            private String name;
            @SerializedName("icon")
            private String icon;
            @SerializedName("url")
            private String url;
            @SerializedName("cover")
            private String cover;
            @SerializedName("livetype")
            private String livetype;
            @SerializedName("priority")
            private int priority;
            @SerializedName("version")
            private int version;
            @SerializedName("gametype")
            private String gametype;
            @SerializedName("tab_id")
            private String tabId;
            @SerializedName("type")
            private String type;
            @SerializedName("cate_type")
            private String cateType;
            @SerializedName("anchor_type")
            private String anchorType;
            @SerializedName("exclude_gametype")
            private List<?> excludeGametype;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getLivetype() {
                return livetype;
            }

            public void setLivetype(String livetype) {
                this.livetype = livetype;
            }

            public int getPriority() {
                return priority;
            }

            public void setPriority(int priority) {
                this.priority = priority;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public String getGametype() {
                return gametype;
            }

            public void setGametype(String gametype) {
                this.gametype = gametype;
            }

            public String getTabId() {
                return tabId;
            }

            public void setTabId(String tabId) {
                this.tabId = tabId;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getCateType() {
                return cateType;
            }

            public void setCateType(String cateType) {
                this.cateType = cateType;
            }

            public String getAnchorType() {
                return anchorType;
            }

            public void setAnchorType(String anchorType) {
                this.anchorType = anchorType;
            }

            public List<?> getExcludeGametype() {
                return excludeGametype;
            }

            public void setExcludeGametype(List<?> excludeGametype) {
                this.excludeGametype = excludeGametype;
            }
        }
    }
}
