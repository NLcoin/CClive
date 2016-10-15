package com.wangbo.www.cclive.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/8/29.
 */
public class GameBean {

    /**
     * reason : Success
     * data : {"banner":[{"pic":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PvEmqfa","live_type":0,"config_type":0,
     * "linkurl":"cc://gamevideolist/448?name=《梦幻西游》电脑版&tagname=动画片",
     * "live_link":"","live":0,"share_title":"","tab_id":"game","type":3,
     * "ccid":0,"share_enabled":0,"channelid":0,"share_detail":"",
     * "livetype":"game","roomid":0,"share_pic":""},{"pic":"http://c.cotton
     * .netease.com/buckets/4NhQWd/files/PuD2YZT","live_type":0,
     * "config_type":0,"linkurl":"http://cc.163
     * .com/wdf/2016/08/10/moblive/?id=57b5542610ce2461d1ac06de&platform
     * =mobile","live_link":"","live":0,"share_title":"","tab_id":"game",
     * "type":1,"ccid":0,"share_enabled":0,"channelid":0,"share_detail":"",
     * "livetype":"game","roomid":0,"share_pic":""},{"pic":"http://c.cotton
     * .netease.com/buckets/4NhQWd/files/Psy8AGA","live_type":0,
     * "config_type":0,"linkurl":"http://cc.163
     * .com/wdf/2016/08/03/baixiaosheng/?id=57a1dcb010ce240b8a8617ae&platform
     * =mobile","live_link":"","live":0,"share_detail":"","share_title":"",
     * "tab_id":"all","type":1,"ccid":0,"share_enabled":0,"channelid":0,
     * "livetype":"game","roomid":0,"share_pic":""}],
     * "filters":[{"name":"《梦幻西游》电脑版","icon":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/Pstie7X","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=3&tab_id=301",
     * "live_list":[{"channelid":3163427,"ccid":14370493,"title":"风雨无阻，无限资源",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e635143cfa2fee0cb47bcTSrpLRV","app_id":1,
     * "roomid":90068,"visitor":9058,"gamename":"《梦幻西游》电脑版",
     * "nickname":"【谜底】抗揍--爆奖池返2000","uid":12240737},{"channelid":3309167,
     * "ccid":600111,"title":"精彩不断，有你想看","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e658143cfa3e53b6371f8ziac0o3","app_id":1,"roomid":520,
     * "visitor":4181,"gamename":"《梦幻西游》电脑版","nickname":"柔光：核对主播CC号",
     * "uid":26079223},{"channelid":4444420,"ccid":17160303,
     * "title":"14亿梦幻币/30天，教学五开梦幻","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6475e6027eb4bd7f9acNI2JViXT","app_id":1,"roomid":90068,
     * "visitor":1760,"gamename":"《梦幻西游》电脑版",
     * "nickname":"【谜底】ゞ蚊子：14E每月，巅峰教学全职兼职1V1教学","uid":14477070},
     * {"channelid":2938722,"ccid":520077,"title":"º筱柒 ²接一切资源！","panorama":0,
     * "CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7285e6027eb4bd7fa12kMmcQVDf","app_id":1,"roomid":520,
     * "visitor":3740,"gamename":"《梦幻西游》电脑版","nickname":"筱柒 ²群520077",
     * "uid":365310}],"cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstieAz","livetype":"game","priority":500,
     * "version":1,"gametype":"3","tab_id":"301","type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"大话西游2经典版","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstjIp4","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=6&tab_id=302",
     * "live_list":[{"channelid":4325391,"ccid":19874398,
     * "title":"30♩兔子『_有伱嘚地方就是家〃』(19874398)的直播","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e71d96dee4c86569d7c5YSaAuREW","app_id":1,"roomid":30,
     * "visitor":3920,"gamename":"大话西游2经典版","nickname":"30♩兔子『_有伱嘚地方就是家〃』",
     * "uid":16618882},{"channelid":4603375,"ccid":20789723,"title":"大话公会♩大
     * 鹏『解说学员(20789723)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7af5e6027ed11bdb156G9783BEJ","app_id":1,"roomid":30,
     * "visitor":1525,"gamename":"大话西游2经典版","nickname":"30♩大 鹏『比武激情解说中』",
     * "uid":17245616},{"channelid":3764350,"ccid":3936399,
     * "title":"大话公会」踏歌而行『装备搭配』(3936399)的直播","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6345e6027ef8fcab85eLc1GGNKl","app_id":1,"roomid":30,
     * "visitor":1530,"gamename":"大话西游2经典版","nickname":"30♩踏歌『装备搭配』",
     * "uid":3237502},{"channelid":4605290,"ccid":20134094,"title":"老虎
     * (20134094)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e63d96dee4c86569d78b497jCMuc","app_id":1,"roomid":30,
     * "visitor":1406,"gamename":"大话西游2经典版","nickname":"30♩老 虎『天梯直播』",
     * "uid":16739572}],"cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstjIpo","livetype":"game","priority":480,
     * "version":1,"gametype":"6","tab_id":"302","type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"守望先锋","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstjdlE","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=1007&tab_id=303",
     * "live_list":[{"channelid":4437970,"ccid":218150240,
     * "title":"快上学了，还不来看直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7d45e6027f980290f43xNsT14ZX","app_id":1,"roomid":76,
     * "visitor":1026,"gamename":"守望先锋","nickname":"灰哥","uid":116781620},
     * {"channelid":4449384,"ccid":219204118,"title":"永夜妖月：午时已到丶今天组起装甲车",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e7a35e6027ef8fcab981YZMU0h4s","app_id":1,
     * "roomid":76,"visitor":437,"gamename":"守望先锋","nickname":"永夜妖月",
     * "uid":117736707},{"channelid":4425652,"ccid":218506806,
     * "title":"[老Z]zet0r 没有天梯很无聊","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7cd143cfa40b059be1djNMYxb9N","app_id":1,"roomid":76,
     * "visitor":708,"gamename":"守望先锋","nickname":"[老Z]zet0r",
     * "uid":117137414},{"channelid":4506710,"ccid":16962165,
     * "title":"GTA5招募演员，专业GTA5录制团队","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7cc5e6027d768eb02adv42TEWTc","app_id":1,"roomid":76,
     * "visitor":586,"gamename":"守望先锋","nickname":"CC王有才","uid":14317716}],
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Pstjdls",
     * "livetype":"game","priority":460,"version":1,"gametype":"1007",
     * "tab_id":"303","type":"category","cate_type":"1","anchor_type":""},
     * {"name":"户外直播","icon":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PtLHBsT","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=65001&tab_id=321",
     * "live_list":[{"channelid":4587400,"ccid":127408143,"title":"成都户外疯狂",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e7c05e6027f980290f32Sp5X2Kda","app_id":1,
     * "roomid":90068,"visitor":455,"gamename":"户外直播","nickname":"【谜底】ゞ三疯",
     * "uid":100712338},{"channelid":4586623,"ccid":220786081,
     * "title":"济南优步跑起来，带你认识各类人生","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7c8143cfa40b059be1cajD6LIQi","app_id":1,"roomid":90068,
     * "visitor":300,"gamename":"户外直播","nickname":"㏕°谜底﹏ ♓老孙",
     * "uid":118958311}],"icon1":"","cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PtLHBuA","livetype":"game","priority":455,
     * "version":1,"gametype":"65001","tab_id":"321","type":"category",
     * "cate_type":"3","anchor_type":""},{"name":"《梦幻西游》手游","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstjunO","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=25&tab_id=304",
     * "live_list":[{"channelid":4333636,"ccid":9999968,"title":"【谜底】ゞ然逍遥
     * (9999968)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e62f5e6027ef8fcab859gIrYgDZ4","app_id":1,"roomid":888,
     * "visitor":3539,"gamename":"《梦幻西游》手游","nickname":"【谜底】ゞ然逍遥",
     * "uid":58701102},{"channelid":3924779,"ccid":40342866,
     * "title":"♪﹏梦幻西游°不科学「游戏主播」(40342866)的直播","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e5cd5e6027ef8fcab802aDwggRgv","app_id":1,"roomid":518,
     * "visitor":1319,"gamename":"《梦幻西游》手游","nickname":"〃西游梦リ不科学「签约主播」",
     * "uid":33130067},{"channelid":4312037,"ccid":28649874,"title":"〃西游梦リ沉沦
     * 接熔炼，合宠","panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc
     * .fp.ps.netease.com/file/57c3e6935e6027ed11bdb0b0uFGAt3Lu","app_id":1,
     * "roomid":518,"visitor":2247,"gamename":"《梦幻西游》手游",
     * "nickname":"〃西游梦リ沉沦「签约主播」","uid":23641430},{"channelid":4205007,
     * "ccid":27384331,"title":"【谜底】ゞ暗心「手游丶主播」(27384331)的直播","panorama":0,
     * "CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e623143cfa3e53b63710BiBcTpLK","app_id":1,"roomid":888,
     * "visitor":1250,"gamename":"《梦幻西游》手游","nickname":"【谜底】ゞ暗心:接资源",
     * "uid":22600933}],"cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/Pstjunv","livetype":"game","priority":440,
     * "version":1,"gametype":"25","tab_id":"304","type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"天下3","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstkHgi","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=2&tab_id=305",
     * "live_list":[{"channelid":4230736,"ccid":9165743,"title":"雪无无无ღ
     * (9165743)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6f0143cfa40b059bd8eX981KlFp","app_id":1,"roomid":521,
     * "visitor":1540,"gamename":"天下3","nickname":"雪无无无ღ","uid":6076345},
     * {"channelid":3446847,"ccid":3630206,"title":"狗蛋不会轻易狗带","panorama":0,
     * "CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6a05e6027eb4bd7f9c8PXv3s1mp","app_id":1,"roomid":521,
     * "visitor":1435,"gamename":"天下3","nickname":"天下3ゞ在一起﹏狗蛋『归墟直播』",
     * "uid":3025937},{"channelid":2483027,"ccid":32616485,
     * "title":"没谁了羽毛太狠了","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e68c5e6027ef8fcab8a3bqbWlIfw","app_id":1,"roomid":521,
     * "visitor":1046,"gamename":"天下3","nickname":"天下3ゞ在一起﹏简  爱『游戏直播』",
     * "uid":26877996},{"channelid":4438889,"ccid":7543490,"title":"神经病搬的走位",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e611143cfa40b059bcf5BhT2HFB6","app_id":1,
     * "roomid":521,"visitor":912,"gamename":"天下3",
     * "nickname":"天下3ゞ在一起﹏是的呢『游戏直播』","uid":4478437}],"cover":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstkHhE","livetype":"game",
     * "priority":420,"version":1,"gametype":"2","tab_id":"305",
     * "type":"category","cate_type":"1","anchor_type":""},{"name":"大话西游手游",
     * "icon":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstkgHn",
     * "url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=28&tab_id=306",
     * "live_list":[{"channelid":4420986,"ccid":96541779,"title":"接资源",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e7135e6027ef8fcab920DJIy8bF5","app_id":1,
     * "roomid":917,"visitor":1399,"gamename":"大话西游手游","nickname":"917＂老王
     * 隔壁军团","uid":80682985},{"channelid":4341263,"ccid":114522820,
     * "title":"917＂猫洱茶『请叫我帮贡姐』(114522820)的直播","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e70f5e6027ed11bdb107q8A7LKPf","app_id":1,"roomid":917,
     * "visitor":742,"gamename":"大话西游手游","nickname":"917＂猫洱茶『发烧- -！』",
     * "uid":91124766},{"channelid":4336803,"ccid":3815190,"title":"男神夏星
     * (3815190)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6b95e6027ed11bdb0c8G3eVegOU","app_id":1,"roomid":917,
     * "visitor":379,"gamename":"大话西游手游","nickname":"917＂夏星『死蹲15星",
     * "uid":2236673},{"channelid":4134666,"ccid":45161876,
     * "title":"917＂朵朵~七夕快乐(45161876)的直播","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6fe96dee4c29a7662e8Vib9MQwh","app_id":1,"roomid":917,
     * "visitor":1042,"gamename":"大话西游手游","nickname":"917＂朵朵~神兽号瞎打龙战~",
     * "uid":37339669}],"icon1":"","cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstkgOc","livetype":"game","priority":400,
     * "version":1,"gametype":"28","tab_id":"306","type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"炉石传说","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstlB2N","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=1005&tab_id=307",
     * "live_list":[{"channelid":2683001,"ccid":58721565,
     * "title":"墨泽：吹嘘消失机械贼竞技场之旅","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7d0143cfa40b059be20B2UNaIm9","app_id":1,"roomid":99,
     * "visitor":2203,"gamename":"炉石传说","nickname":"墨泽","uid":49183160},
     * {"channelid":4396855,"ccid":215877252,"title":"暴雪影院-得入暴雪门，无悔游人生",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e7ce5e6027f980290f3fHOdPOPHO","app_id":1,
     * "roomid":99,"visitor":911,"gamename":"炉石传说","nickname":"暴雪游戏频道",
     * "uid":114604043},{"channelid":3212725,"ccid":46329812,
     * "title":"【御姐爱萝莉】一个有内涵的技术主播~","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7f9143cfa40b059be34ERTusHMu","app_id":1,"roomid":99,
     * "visitor":769,"gamename":"炉石传说","nickname":"御姐爱萝莉(CC群1293008)",
     * "uid":38466307},{"channelid":2937049,"ccid":49071348,"title":"CC唯一
     * 直播暴毙的主播！","panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc
     * .fp.ps.netease.com/file/57c3e7cc5e6027ed11bdb170gVmlzh79","app_id":1,
     * "roomid":99,"visitor":685,"gamename":"炉石传说","nickname":"耗子 生活如此多娇",
     * "uid":41075156}],"icon1":"","cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstlB8K","livetype":"game","priority":380,
     * "version":1,"gametype":"1005","tab_id":"307","type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"新倩女幽魂","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstlZY7","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=4&tab_id=308",
     * "live_list":[{"channelid":4172517,"ccid":13958584,"title":"英俊潇洒的老司机",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e68b5e6027eb4bd7f9c2F5X0wg9Z","app_id":1,
     * "roomid":77,"visitor":2031,"gamename":"新倩女幽魂","nickname":"CC77-湮灭",
     * "uid":11902313},{"channelid":4172507,"ccid":204093261,"title":"小莫
     * (204093261)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6b4143cfaf56149bf4ar7IQoh7p","app_id":1,"roomid":77,
     * "visitor":1286,"gamename":"新倩女幽魂","nickname":"CC77-小莫",
     * "uid":105491777},{"channelid":3163045,"ccid":38923702,"title":"CC77-淡淡
     * (38923702)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e764143cfa26a6864b18WCjyBQDz","app_id":1,"roomid":77,
     * "visitor":1078,"gamename":"新倩女幽魂","nickname":"CC77-淡淡",
     * "uid":31971430},{"channelid":4192408,"ccid":22832696,"title":"破晓
     * (22832696)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e73196dee4e6c8e49530b2JGs0Kq","app_id":1,"roomid":77,
     * "visitor":1094,"gamename":"新倩女幽魂","nickname":"CC77-破晓",
     * "uid":18791108}],"cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstlZZY","livetype":"game","priority":360,
     * "version":1,"gametype":"4","tab_id":"308","type":"category",
     * "cate_type":"1","anchor_type":""}],"activity":{}}
     * result : 0
     */

    @SerializedName("reason")
    private String reason;
    /**
     * banner : [{"pic":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PvEmqfa","live_type":0,"config_type":0,
     * "linkurl":"cc://gamevideolist/448?name=《梦幻西游》电脑版&tagname=动画片",
     * "live_link":"","live":0,"share_title":"","tab_id":"game","type":3,
     * "ccid":0,"share_enabled":0,"channelid":0,"share_detail":"",
     * "livetype":"game","roomid":0,"share_pic":""},{"pic":"http://c.cotton
     * .netease.com/buckets/4NhQWd/files/PuD2YZT","live_type":0,
     * "config_type":0,"linkurl":"http://cc.163
     * .com/wdf/2016/08/10/moblive/?id=57b5542610ce2461d1ac06de&platform
     * =mobile","live_link":"","live":0,"share_title":"","tab_id":"game",
     * "type":1,"ccid":0,"share_enabled":0,"channelid":0,"share_detail":"",
     * "livetype":"game","roomid":0,"share_pic":""},{"pic":"http://c.cotton
     * .netease.com/buckets/4NhQWd/files/Psy8AGA","live_type":0,
     * "config_type":0,"linkurl":"http://cc.163
     * .com/wdf/2016/08/03/baixiaosheng/?id=57a1dcb010ce240b8a8617ae&platform
     * =mobile","live_link":"","live":0,"share_detail":"","share_title":"",
     * "tab_id":"all","type":1,"ccid":0,"share_enabled":0,"channelid":0,
     * "livetype":"game","roomid":0,"share_pic":""}]
     * filters : [{"name":"《梦幻西游》电脑版","icon":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/Pstie7X","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=3&tab_id=301",
     * "live_list":[{"channelid":3163427,"ccid":14370493,"title":"风雨无阻，无限资源",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e635143cfa2fee0cb47bcTSrpLRV","app_id":1,
     * "roomid":90068,"visitor":9058,"gamename":"《梦幻西游》电脑版",
     * "nickname":"【谜底】抗揍--爆奖池返2000","uid":12240737},{"channelid":3309167,
     * "ccid":600111,"title":"精彩不断，有你想看","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e658143cfa3e53b6371f8ziac0o3","app_id":1,"roomid":520,
     * "visitor":4181,"gamename":"《梦幻西游》电脑版","nickname":"柔光：核对主播CC号",
     * "uid":26079223},{"channelid":4444420,"ccid":17160303,
     * "title":"14亿梦幻币/30天，教学五开梦幻","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6475e6027eb4bd7f9acNI2JViXT","app_id":1,"roomid":90068,
     * "visitor":1760,"gamename":"《梦幻西游》电脑版",
     * "nickname":"【谜底】ゞ蚊子：14E每月，巅峰教学全职兼职1V1教学","uid":14477070},
     * {"channelid":2938722,"ccid":520077,"title":"º筱柒 ²接一切资源！","panorama":0,
     * "CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7285e6027eb4bd7fa12kMmcQVDf","app_id":1,"roomid":520,
     * "visitor":3740,"gamename":"《梦幻西游》电脑版","nickname":"筱柒 ²群520077",
     * "uid":365310}],"cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstieAz","livetype":"game","priority":500,
     * "version":1,"gametype":"3","tab_id":"301","type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"大话西游2经典版","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstjIp4","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=6&tab_id=302",
     * "live_list":[{"channelid":4325391,"ccid":19874398,
     * "title":"30♩兔子『_有伱嘚地方就是家〃』(19874398)的直播","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e71d96dee4c86569d7c5YSaAuREW","app_id":1,"roomid":30,
     * "visitor":3920,"gamename":"大话西游2经典版","nickname":"30♩兔子『_有伱嘚地方就是家〃』",
     * "uid":16618882},{"channelid":4603375,"ccid":20789723,"title":"大话公会♩大
     * 鹏『解说学员(20789723)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7af5e6027ed11bdb156G9783BEJ","app_id":1,"roomid":30,
     * "visitor":1525,"gamename":"大话西游2经典版","nickname":"30♩大 鹏『比武激情解说中』",
     * "uid":17245616},{"channelid":3764350,"ccid":3936399,
     * "title":"大话公会」踏歌而行『装备搭配』(3936399)的直播","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6345e6027ef8fcab85eLc1GGNKl","app_id":1,"roomid":30,
     * "visitor":1530,"gamename":"大话西游2经典版","nickname":"30♩踏歌『装备搭配』",
     * "uid":3237502},{"channelid":4605290,"ccid":20134094,"title":"老虎
     * (20134094)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e63d96dee4c86569d78b497jCMuc","app_id":1,"roomid":30,
     * "visitor":1406,"gamename":"大话西游2经典版","nickname":"30♩老 虎『天梯直播』",
     * "uid":16739572}],"cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstjIpo","livetype":"game","priority":480,
     * "version":1,"gametype":"6","tab_id":"302","type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"守望先锋","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstjdlE","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=1007&tab_id=303",
     * "live_list":[{"channelid":4437970,"ccid":218150240,
     * "title":"快上学了，还不来看直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7d45e6027f980290f43xNsT14ZX","app_id":1,"roomid":76,
     * "visitor":1026,"gamename":"守望先锋","nickname":"灰哥","uid":116781620},
     * {"channelid":4449384,"ccid":219204118,"title":"永夜妖月：午时已到丶今天组起装甲车",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e7a35e6027ef8fcab981YZMU0h4s","app_id":1,
     * "roomid":76,"visitor":437,"gamename":"守望先锋","nickname":"永夜妖月",
     * "uid":117736707},{"channelid":4425652,"ccid":218506806,
     * "title":"[老Z]zet0r 没有天梯很无聊","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7cd143cfa40b059be1djNMYxb9N","app_id":1,"roomid":76,
     * "visitor":708,"gamename":"守望先锋","nickname":"[老Z]zet0r",
     * "uid":117137414},{"channelid":4506710,"ccid":16962165,
     * "title":"GTA5招募演员，专业GTA5录制团队","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7cc5e6027d768eb02adv42TEWTc","app_id":1,"roomid":76,
     * "visitor":586,"gamename":"守望先锋","nickname":"CC王有才","uid":14317716}],
     * "cover":"http://c.cotton.netease.com/buckets/4NhQWd/files/Pstjdls",
     * "livetype":"game","priority":460,"version":1,"gametype":"1007",
     * "tab_id":"303","type":"category","cate_type":"1","anchor_type":""},
     * {"name":"户外直播","icon":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PtLHBsT","url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=65001&tab_id=321",
     * "live_list":[{"channelid":4587400,"ccid":127408143,"title":"成都户外疯狂",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e7c05e6027f980290f32Sp5X2Kda","app_id":1,
     * "roomid":90068,"visitor":455,"gamename":"户外直播","nickname":"【谜底】ゞ三疯",
     * "uid":100712338},{"channelid":4586623,"ccid":220786081,
     * "title":"济南优步跑起来，带你认识各类人生","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7c8143cfa40b059be1cajD6LIQi","app_id":1,"roomid":90068,
     * "visitor":300,"gamename":"户外直播","nickname":"㏕°谜底﹏ ♓老孙",
     * "uid":118958311}],"icon1":"","cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PtLHBuA","livetype":"game","priority":455,
     * "version":1,"gametype":"65001","tab_id":"321","type":"category",
     * "cate_type":"3","anchor_type":""},{"name":"《梦幻西游》手游","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstjunO","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=25&tab_id=304",
     * "live_list":[{"channelid":4333636,"ccid":9999968,"title":"【谜底】ゞ然逍遥
     * (9999968)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e62f5e6027ef8fcab859gIrYgDZ4","app_id":1,"roomid":888,
     * "visitor":3539,"gamename":"《梦幻西游》手游","nickname":"【谜底】ゞ然逍遥",
     * "uid":58701102},{"channelid":3924779,"ccid":40342866,
     * "title":"♪﹏梦幻西游°不科学「游戏主播」(40342866)的直播","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e5cd5e6027ef8fcab802aDwggRgv","app_id":1,"roomid":518,
     * "visitor":1319,"gamename":"《梦幻西游》手游","nickname":"〃西游梦リ不科学「签约主播」",
     * "uid":33130067},{"channelid":4312037,"ccid":28649874,"title":"〃西游梦リ沉沦
     * 接熔炼，合宠","panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc
     * .fp.ps.netease.com/file/57c3e6935e6027ed11bdb0b0uFGAt3Lu","app_id":1,
     * "roomid":518,"visitor":2247,"gamename":"《梦幻西游》手游",
     * "nickname":"〃西游梦リ沉沦「签约主播」","uid":23641430},{"channelid":4205007,
     * "ccid":27384331,"title":"【谜底】ゞ暗心「手游丶主播」(27384331)的直播","panorama":0,
     * "CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e623143cfa3e53b63710BiBcTpLK","app_id":1,"roomid":888,
     * "visitor":1250,"gamename":"《梦幻西游》手游","nickname":"【谜底】ゞ暗心:接资源",
     * "uid":22600933}],"cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/Pstjunv","livetype":"game","priority":440,
     * "version":1,"gametype":"25","tab_id":"304","type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"天下3","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstkHgi","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=2&tab_id=305",
     * "live_list":[{"channelid":4230736,"ccid":9165743,"title":"雪无无无ღ
     * (9165743)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6f0143cfa40b059bd8eX981KlFp","app_id":1,"roomid":521,
     * "visitor":1540,"gamename":"天下3","nickname":"雪无无无ღ","uid":6076345},
     * {"channelid":3446847,"ccid":3630206,"title":"狗蛋不会轻易狗带","panorama":0,
     * "CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6a05e6027eb4bd7f9c8PXv3s1mp","app_id":1,"roomid":521,
     * "visitor":1435,"gamename":"天下3","nickname":"天下3ゞ在一起﹏狗蛋『归墟直播』",
     * "uid":3025937},{"channelid":2483027,"ccid":32616485,
     * "title":"没谁了羽毛太狠了","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e68c5e6027ef8fcab8a3bqbWlIfw","app_id":1,"roomid":521,
     * "visitor":1046,"gamename":"天下3","nickname":"天下3ゞ在一起﹏简  爱『游戏直播』",
     * "uid":26877996},{"channelid":4438889,"ccid":7543490,"title":"神经病搬的走位",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e611143cfa40b059bcf5BhT2HFB6","app_id":1,
     * "roomid":521,"visitor":912,"gamename":"天下3",
     * "nickname":"天下3ゞ在一起﹏是的呢『游戏直播』","uid":4478437}],"cover":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstkHhE","livetype":"game",
     * "priority":420,"version":1,"gametype":"2","tab_id":"305",
     * "type":"category","cate_type":"1","anchor_type":""},{"name":"大话西游手游",
     * "icon":"http://c.cotton.netease.com/buckets/4NhQWd/files/PstkgHn",
     * "url":"http://mlive.cc.163
     * .com/mlive/game/category?gametype=28&tab_id=306",
     * "live_list":[{"channelid":4420986,"ccid":96541779,"title":"接资源",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e7135e6027ef8fcab920DJIy8bF5","app_id":1,
     * "roomid":917,"visitor":1399,"gamename":"大话西游手游","nickname":"917＂老王
     * 隔壁军团","uid":80682985},{"channelid":4341263,"ccid":114522820,
     * "title":"917＂猫洱茶『请叫我帮贡姐』(114522820)的直播","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e70f5e6027ed11bdb107q8A7LKPf","app_id":1,"roomid":917,
     * "visitor":742,"gamename":"大话西游手游","nickname":"917＂猫洱茶『发烧- -！』",
     * "uid":91124766},{"channelid":4336803,"ccid":3815190,"title":"男神夏星
     * (3815190)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6b95e6027ed11bdb0c8G3eVegOU","app_id":1,"roomid":917,
     * "visitor":379,"gamename":"大话西游手游","nickname":"917＂夏星『死蹲15星",
     * "uid":2236673},{"channelid":4134666,"ccid":45161876,
     * "title":"917＂朵朵~七夕快乐(45161876)的直播","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6fe96dee4c29a7662e8Vib9MQwh","app_id":1,"roomid":917,
     * "visitor":1042,"gamename":"大话西游手游","nickname":"917＂朵朵~神兽号瞎打龙战~",
     * "uid":37339669}],"icon1":"","cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstkgOc","livetype":"game","priority":400,
     * "version":1,"gametype":"28","tab_id":"306","type":"category",
     * "cate_type":"2","anchor_type":""},{"name":"炉石传说","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstlB2N","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=1005&tab_id=307",
     * "live_list":[{"channelid":2683001,"ccid":58721565,
     * "title":"墨泽：吹嘘消失机械贼竞技场之旅","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7d0143cfa40b059be20B2UNaIm9","app_id":1,"roomid":99,
     * "visitor":2203,"gamename":"炉石传说","nickname":"墨泽","uid":49183160},
     * {"channelid":4396855,"ccid":215877252,"title":"暴雪影院-得入暴雪门，无悔游人生",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e7ce5e6027f980290f3fHOdPOPHO","app_id":1,
     * "roomid":99,"visitor":911,"gamename":"炉石传说","nickname":"暴雪游戏频道",
     * "uid":114604043},{"channelid":3212725,"ccid":46329812,
     * "title":"【御姐爱萝莉】一个有内涵的技术主播~","panorama":0,"CDN_FMT":{},
     * "streamname":"","cover":"http://cc.fp.ps.netease
     * .com/file/57c3e7f9143cfa40b059be34ERTusHMu","app_id":1,"roomid":99,
     * "visitor":769,"gamename":"炉石传说","nickname":"御姐爱萝莉(CC群1293008)",
     * "uid":38466307},{"channelid":2937049,"ccid":49071348,"title":"CC唯一
     * 直播暴毙的主播！","panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc
     * .fp.ps.netease.com/file/57c3e7cc5e6027ed11bdb170gVmlzh79","app_id":1,
     * "roomid":99,"visitor":685,"gamename":"炉石传说","nickname":"耗子 生活如此多娇",
     * "uid":41075156}],"icon1":"","cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstlB8K","livetype":"game","priority":380,
     * "version":1,"gametype":"1005","tab_id":"307","type":"category",
     * "cate_type":"1","anchor_type":""},{"name":"新倩女幽魂","icon":"http://c
     * .cotton.netease.com/buckets/4NhQWd/files/PstlZY7","url":"http://mlive
     * .cc.163.com/mlive/game/category?gametype=4&tab_id=308",
     * "live_list":[{"channelid":4172517,"ccid":13958584,"title":"英俊潇洒的老司机",
     * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
     * .netease.com/file/57c3e68b5e6027eb4bd7f9c2F5X0wg9Z","app_id":1,
     * "roomid":77,"visitor":2031,"gamename":"新倩女幽魂","nickname":"CC77-湮灭",
     * "uid":11902313},{"channelid":4172507,"ccid":204093261,"title":"小莫
     * (204093261)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e6b4143cfaf56149bf4ar7IQoh7p","app_id":1,"roomid":77,
     * "visitor":1286,"gamename":"新倩女幽魂","nickname":"CC77-小莫",
     * "uid":105491777},{"channelid":3163045,"ccid":38923702,"title":"CC77-淡淡
     * (38923702)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e764143cfa26a6864b18WCjyBQDz","app_id":1,"roomid":77,
     * "visitor":1078,"gamename":"新倩女幽魂","nickname":"CC77-淡淡",
     * "uid":31971430},{"channelid":4192408,"ccid":22832696,"title":"破晓
     * (22832696)的直播","panorama":0,"CDN_FMT":{},"streamname":"",
     * "cover":"http://cc.fp.ps.netease
     * .com/file/57c3e73196dee4e6c8e49530b2JGs0Kq","app_id":1,"roomid":77,
     * "visitor":1094,"gamename":"新倩女幽魂","nickname":"CC77-破晓",
     * "uid":18791108}],"cover":"http://c.cotton.netease
     * .com/buckets/4NhQWd/files/PstlZZY","livetype":"game","priority":360,
     * "version":1,"gametype":"4","tab_id":"308","type":"category",
     * "cate_type":"1","anchor_type":""}]
     * activity : {}
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
        /**
         * pic : http://c.cotton.netease.com/buckets/4NhQWd/files/PvEmqfa
         * live_type : 0
         * config_type : 0
         * linkurl : cc://gamevideolist/448?name=《梦幻西游》电脑版&tagname=动画片
         * live_link :
         * live : 0
         * share_title :
         * tab_id : game
         * type : 3
         * ccid : 0
         * share_enabled : 0
         * channelid : 0
         * share_detail :
         * livetype : game
         * roomid : 0
         * share_pic :
         */

        @SerializedName("banner")
        private List<BannerBean> banner;
        /**
         * name : 《梦幻西游》电脑版
         * icon : http://c.cotton.netease.com/buckets/4NhQWd/files/Pstie7X
         * url : http://mlive.cc.163
         * .com/mlive/game/category?gametype=3&tab_id=301
         * live_list : [{"channelid":3163427,"ccid":14370493,
         * "title":"风雨无阻，无限资源","panorama":0,"CDN_FMT":{},"streamname":"",
         * "cover":"http://cc.fp.ps.netease
         * .com/file/57c3e635143cfa2fee0cb47bcTSrpLRV","app_id":1,
         * "roomid":90068,"visitor":9058,"gamename":"《梦幻西游》电脑版",
         * "nickname":"【谜底】抗揍--爆奖池返2000","uid":12240737},
         * {"channelid":3309167,"ccid":600111,"title":"精彩不断，有你想看",
         * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
         * .netease.com/file/57c3e658143cfa3e53b6371f8ziac0o3","app_id":1,
         * "roomid":520,"visitor":4181,"gamename":"《梦幻西游》电脑版",
         * "nickname":"柔光：核对主播CC号","uid":26079223},{"channelid":4444420,
         * "ccid":17160303,"title":"14亿梦幻币/30天，教学五开梦幻","panorama":0,
         * "CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps.netease
         * .com/file/57c3e6475e6027eb4bd7f9acNI2JViXT","app_id":1,
         * "roomid":90068,"visitor":1760,"gamename":"《梦幻西游》电脑版",
         * "nickname":"【谜底】ゞ蚊子：14E每月，巅峰教学全职兼职1V1教学","uid":14477070},
         * {"channelid":2938722,"ccid":520077,"title":"º筱柒 ²接一切资源！",
         * "panorama":0,"CDN_FMT":{},"streamname":"","cover":"http://cc.fp.ps
         * .netease.com/file/57c3e7285e6027eb4bd7fa12kMmcQVDf","app_id":1,
         * "roomid":520,"visitor":3740,"gamename":"《梦幻西游》电脑版","nickname":"筱柒
         * ²群520077","uid":365310}]
         * cover : http://c.cotton.netease.com/buckets/4NhQWd/files/PstieAz
         * livetype : game
         * priority : 500
         * version : 1
         * gametype : 3
         * tab_id : 301
         * type : category
         * cate_type : 1
         * anchor_type :
         */

        @SerializedName("filters")
        private List<FiltersBean> filters;

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<FiltersBean> getFilters() {
            return filters;
        }

        public void setFilters(List<FiltersBean> filters) {
            this.filters = filters;
        }

        public static class BannerBean {
            @SerializedName("pic")
            private String pic;
            @SerializedName("live_type")
            private int liveType;
            @SerializedName("config_type")
            private int configType;
            @SerializedName("linkurl")
            private String linkurl;
            @SerializedName("live_link")
            private String liveLink;
            @SerializedName("live")
            private int live;
            @SerializedName("share_title")
            private String shareTitle;
            @SerializedName("tab_id")
            private String tabId;
            @SerializedName("type")
            private int type;
            @SerializedName("ccid")
            private int ccid;
            @SerializedName("share_enabled")
            private int shareEnabled;
            @SerializedName("channelid")
            private int channelid;
            @SerializedName("share_detail")
            private String shareDetail;
            @SerializedName("livetype")
            private String livetype;
            @SerializedName("roomid")
            private int roomid;
            @SerializedName("share_pic")
            private String sharePic;

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getLiveType() {
                return liveType;
            }

            public void setLiveType(int liveType) {
                this.liveType = liveType;
            }

            public int getConfigType() {
                return configType;
            }

            public void setConfigType(int configType) {
                this.configType = configType;
            }

            public String getLinkurl() {
                return linkurl;
            }

            public void setLinkurl(String linkurl) {
                this.linkurl = linkurl;
            }

            public String getLiveLink() {
                return liveLink;
            }

            public void setLiveLink(String liveLink) {
                this.liveLink = liveLink;
            }

            public int getLive() {
                return live;
            }

            public void setLive(int live) {
                this.live = live;
            }

            public String getShareTitle() {
                return shareTitle;
            }

            public void setShareTitle(String shareTitle) {
                this.shareTitle = shareTitle;
            }

            public String getTabId() {
                return tabId;
            }

            public void setTabId(String tabId) {
                this.tabId = tabId;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getCcid() {
                return ccid;
            }

            public void setCcid(int ccid) {
                this.ccid = ccid;
            }

            public int getShareEnabled() {
                return shareEnabled;
            }

            public void setShareEnabled(int shareEnabled) {
                this.shareEnabled = shareEnabled;
            }

            public int getChannelid() {
                return channelid;
            }

            public void setChannelid(int channelid) {
                this.channelid = channelid;
            }

            public String getShareDetail() {
                return shareDetail;
            }

            public void setShareDetail(String shareDetail) {
                this.shareDetail = shareDetail;
            }

            public String getLivetype() {
                return livetype;
            }

            public void setLivetype(String livetype) {
                this.livetype = livetype;
            }

            public int getRoomid() {
                return roomid;
            }

            public void setRoomid(int roomid) {
                this.roomid = roomid;
            }

            public String getSharePic() {
                return sharePic;
            }

            public void setSharePic(String sharePic) {
                this.sharePic = sharePic;
            }
        }

        public static class FiltersBean {
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
            /**
             * channelid : 3163427
             * ccid : 14370493
             * title : 风雨无阻，无限资源
             * panorama : 0
             * CDN_FMT : {}
             * streamname :
             * cover : http://cc.fp.ps.netease.com/file/57c3e635143cfa2fee0cb47bcTSrpLRV
             * app_id : 1
             * roomid : 90068
             * visitor : 9058
             * gamename : 《梦幻西游》电脑版
             * nickname : 【谜底】抗揍--爆奖池返2000
             * uid : 12240737
             */

            @SerializedName("live_list")
            private List<LiveListBean> liveList;

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

            public List<LiveListBean> getLiveList() {
                return liveList;
            }

            public void setLiveList(List<LiveListBean> liveList) {
                this.liveList = liveList;
            }

            public static class LiveListBean {
                @SerializedName("channelid")
                private int channelid;
                @SerializedName("ccid")
                private int ccid;
                @SerializedName("title")
                private String title;
                @SerializedName("panorama")
                private int panorama;
                @SerializedName("streamname")
                private String streamname;
                @SerializedName("cover")
                private String cover;
                @SerializedName("app_id")
                private int appId;
                @SerializedName("roomid")
                private int roomid;
                @SerializedName("visitor")
                private int visitor;
                @SerializedName("gamename")
                private String gamename;
                @SerializedName("nickname")
                private String nickname;
                @SerializedName("uid")
                private int uid;

                public int getChannelid() {
                    return channelid;
                }

                public void setChannelid(int channelid) {
                    this.channelid = channelid;
                }

                public int getCcid() {
                    return ccid;
                }

                public void setCcid(int ccid) {
                    this.ccid = ccid;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getPanorama() {
                    return panorama;
                }

                public void setPanorama(int panorama) {
                    this.panorama = panorama;
                }

                public String getStreamname() {
                    return streamname;
                }

                public void setStreamname(String streamname) {
                    this.streamname = streamname;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public int getAppId() {
                    return appId;
                }

                public void setAppId(int appId) {
                    this.appId = appId;
                }

                public int getRoomid() {
                    return roomid;
                }

                public void setRoomid(int roomid) {
                    this.roomid = roomid;
                }

                public int getVisitor() {
                    return visitor;
                }

                public void setVisitor(int visitor) {
                    this.visitor = visitor;
                }

                public String getGamename() {
                    return gamename;
                }

                public void setGamename(String gamename) {
                    this.gamename = gamename;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public int getUid() {
                    return uid;
                }

                public void setUid(int uid) {
                    this.uid = uid;
                }
            }
        }
    }
}
