package server.entity;

import java.util.List;

/**
 * Created by Administrator on 2018/4/11 0011.
 */

public class NewsBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"13b757620d154d3d8f4f94e9d61288d1","title":"\u201c我爸是拉车的！\u201d萌金毛挂牌为主人揽活，能叼十几斤重的菜篮子","date":"2018-04-11 11:09","category":"社会","author_name":"北青网","url":"http://mini.eastday.com/mobile/180411110928967.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180411/20180411110928_d19630f4fe3511721167bafa8a82ba9c_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180411/20180411110928_ac99e6eb2b3648b2a31ac036ee4c6e0c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180411/20180411110928_11e8c88438ba04d57a84c77643a34cc3_4_mwpm_03200403.jpg"},{"uniquekey":"829b119f398dc67f3fa3ef1ad6052826","title":"二胡演奏家社区\u201c安家\u201d 马晓晖文创艺术空间入驻创邑邻里汇","date":"2018-04-11 11:11","category":"社会","author_name":"新民网","url":"http://mini.eastday.com/mobile/180411111147078.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180411/20180411111147_40dd5927c33852226744d628b4b5b6b3_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180411/20180411111147_40dd5927c33852226744d628b4b5b6b3_1_mwpm_03200403.jpg"},{"uniquekey":"6f9e398c7d6d3a70777b67c2a04b297c","title":"浦东一工地工棚起火 无人员伤亡","date":"2018-04-11 11:11","category":"社会","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/180411111131103.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180411/20180411111131_f70a5a445af27863c2ac012bc4d9d26d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180411/20180411111131_f70a5a445af27863c2ac012bc4d9d26d_2_mwpm_03200403.jpg"},{"uniquekey":"29df9fe94b8f7372219f4809a15e2254","title":"刘亦菲的\u201c家\u201d美得像梦！传说中的\u201c南烟斋\u201d究竟是什么地方？","date":"2018-04-11 11:09","category":"社会","author_name":"新晚报","url":"http://mini.eastday.com/mobile/180411110911050.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180411/20180411110911_65170b4fb41c4e4218ea7d3689d25ac7_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180411/20180411110911_65170b4fb41c4e4218ea7d3689d25ac7_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180411/20180411110911_65170b4fb41c4e4218ea7d3689d25ac7_8_mwpm_03200403.jpg"},{"uniquekey":"3a90b4aeff9307a610e7c0f94564cacf","title":"疑似圆明园流失文物将拍 中拍协艺委会发声明抵制","date":"2018-04-11 11:09","category":"社会","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/180411110909344.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180411/20180411110909_8cd1269a2e563255bc56e63b08c98eb4_1_mwpm_03200403.jpg"},{"uniquekey":"df1d0232830041b27c24bc11d1928a03","title":"无奈！男子报警让警察送厕纸 民警满厕所找人","date":"2018-04-11 11:09","category":"社会","author_name":"咖啡不加糖33","url":"http://mini.eastday.com/mobile/180411110908394.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180411/20180411_c9c0d16c9b0b26a1748b0d351e1ae9da_cover_mwpm_03200403.jpg"},{"uniquekey":"59719767363b9c82fd9843dbe809179e","title":"合肥快新闻：合肥 2018 年体育中考 4 月 16 日开启 满分增至 60 分","date":"2018-04-11 11:08","category":"社会","author_name":"合肥晚报","url":"http://mini.eastday.com/mobile/180411110844391.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180411/20180411110844_c0d1c1d72aec83dd7e337c1df7e07071_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180411/20180411110844_c0d1c1d72aec83dd7e337c1df7e07071_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180411/20180411110844_c0d1c1d72aec83dd7e337c1df7e07071_4_mwpm_03200403.jpg"},{"uniquekey":"06a48c83c9a0f09f593529713ec4998b","title":"海狗赖上渔民兜风8小时：不是为了讨食，我这么可爱带我走吧","date":"2018-04-11 11:08","category":"社会","author_name":"柠檬气泡","url":"http://mini.eastday.com/mobile/180411110812278.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180411/20180411_7613e28b33e529b5dd15c22d8b8b16d3_cover_mwpm_03200403.jpg"},{"uniquekey":"68670cff6348e6f8fc77f243a2d12eae","title":"上饶县六中：我书我心 我诵我诗","date":"2018-04-11 11:07","category":"社会","author_name":"今视新闻网","url":"http://mini.eastday.com/mobile/180411110747984.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180411/20180411110747_33f79ad2277c0b988ed6a3547c63b3be_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180411/20180411110747_33f79ad2277c0b988ed6a3547c63b3be_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180411/20180411110747_33f79ad2277c0b988ed6a3547c63b3be_2_mwpm_03200403.jpg"},{"uniquekey":"d3eb790e47810dbda745dc90986a4ae5","title":"每年一次论坛使\u201c博鳌\u201d成为热点，博是什么意思？鳌又是何意？","date":"2018-04-11 11:07","category":"社会","author_name":"城市船夫起","url":"http://mini.eastday.com/mobile/180411110744159.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180411/20180411110744_428e2bd56054360482a2af7d1db98e65_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180411/20180411110744_428e2bd56054360482a2af7d1db98e65_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180411/20180411110744_428e2bd56054360482a2af7d1db98e65_3_mwpm_03200403.jpg"},{"uniquekey":"ec11b10c6bebd7132740a222f32f31e5","title":"意大利西西里岛一华人小女孩过人行道时被车撞倒 伤势严重","date":"2018-04-11 11:06","category":"社会","author_name":"意大利华人街","url":"http://mini.eastday.com/mobile/180411110617044.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180411/20180411110617_cf177dbf6567b2d1da74098b975a9125_1_mwpm_03200403.jpg"},{"uniquekey":"3a265b06e6469e899081c840d98f4197","title":"\u201c五星酒店\u201d连快捷酒店都不如？旅游APP被指或存竞价排名","date":"2018-04-11 11:06","category":"社会","author_name":"新蓝网","url":"http://mini.eastday.com/mobile/180411110611034.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180411/20180411110611_2719ed83141fce6d25c31fbd992f22bb_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180411/20180411110611_2719ed83141fce6d25c31fbd992f22bb_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180411/20180411110611_2719ed83141fce6d25c31fbd992f22bb_2_mwpm_03200403.jpg"},{"uniquekey":"5ef4b7d4ed436479948b056684b39879","title":"监控下面动了手 包庇就是打人的理由吗？","date":"2018-04-11 11:06","category":"社会","author_name":"新蓝网","url":"http://mini.eastday.com/mobile/180411110610978.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180411/20180411110610_ffb1a59c8ea185ca4642de50cebd29a0_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180411/20180411110610_ffb1a59c8ea185ca4642de50cebd29a0_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180411/20180411110610_ffb1a59c8ea185ca4642de50cebd29a0_3_mwpm_03200403.jpg"},{"uniquekey":"8828e48d067566d83c39cb6868f6a42c","title":"男子醉驾飙车\u2026撞上指示牌飞出十余米翻车","date":"2018-04-11 11:06","category":"社会","author_name":"新蓝网","url":"http://mini.eastday.com/mobile/180411110606812.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180411/20180411110606_88557a4401c7cda337c1c64a63ccbe43_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180411/20180411110606_88557a4401c7cda337c1c64a63ccbe43_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180411/20180411110606_88557a4401c7cda337c1c64a63ccbe43_1_mwpm_03200403.jpg"},{"uniquekey":"3ae3502d612472da5fe63d3351f5defe","title":"鹅妈妈在火场里坚守到最后，被烤焦了半边身子，也不愿放弃孩子","date":"2018-04-11 11:06","category":"社会","author_name":"黯然童鞋fu","url":"http://mini.eastday.com/mobile/180411110606442.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180411/20180411110606_b0e418bc6848c60ef8eb6230e60a0b0c_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180411/20180411110606_b0e418bc6848c60ef8eb6230e60a0b0c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180411/20180411110606_b0e418bc6848c60ef8eb6230e60a0b0c_1_mwpm_03200403.jpg"},{"uniquekey":"0bf46aaddfa6fc6940a60ca3ff10d9f7","title":"七旬老人看病钱险被骗 民警发现拦截","date":"2018-04-11 11:06","category":"社会","author_name":"呼和浩特晚报","url":"http://mini.eastday.com/mobile/180411110600739.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180411/20180411110600_2ddad5167d1453318c4a455973bfccd7_1_mwpm_03200403.jpg"},{"uniquekey":"caf55259cfc388508cf8cf75ba062f43","title":"天津航空推澳大利亚航线特价机票 低至320元","date":"2018-04-11 11:05","category":"社会","author_name":"中国民航网","url":"http://mini.eastday.com/mobile/180411110517566.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180411/20180411110517_f9417f84c13ad9d2c08dc125812bfe92_2_mwpm_03200403.jpg"},{"uniquekey":"6f868d364f15dbd16ba499909a14096d","title":"高速爆胎婴儿车当警示牌？应急停车要做5件事","date":"2018-04-11 11:05","category":"社会","author_name":"新报徐燕","url":"http://mini.eastday.com/mobile/180411110506706.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180411/20180411110506_ba38125afc96a2208ace9a949c66e141_1_mwpm_03200403.jpg"},{"uniquekey":"a6cbce6d6766564c255c253a2aa8bb50","title":"武汉一小学3年级学生用文言文给老师写\u201c情书\u201d","date":"2018-04-11 11:04","category":"社会","author_name":"中国新闻网本地站","url":"http://mini.eastday.com/mobile/180411110421231.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180411/20180411110421_54c3aaea0422de272abaa6766a6183c6_1_mwpm_03200403.jpg"},{"uniquekey":"a602a03c0fff9a8096d08b6a31b548d5","title":"小伙子搬开老屋下一块砖，结果发现一个洞穴，收获一窝大惊喜","date":"2018-04-11 11:02","category":"社会","author_name":"举头三尺有柴米1","url":"http://mini.eastday.com/mobile/180411110250510.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180411/20180411110250_e0546b5e40f2ab5fa8bc20deda7915b3_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180411/20180411110250_e0546b5e40f2ab5fa8bc20deda7915b3_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180411/20180411110250_e0546b5e40f2ab5fa8bc20deda7915b3_2_mwpm_03200403.jpg"},{"uniquekey":"a918643b63913e8aff2c6d1dd886bcb7","title":"乌龟突然产卵了，知道真相后，他直接笑了","date":"2018-04-11 11:02","category":"社会","author_name":"从轻岁月lf","url":"http://mini.eastday.com/mobile/180411110249352.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180411/20180411110249_e9ba2db4a5a16b33ffdb4901345d733b_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180411/20180411110249_e9ba2db4a5a16b33ffdb4901345d733b_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180411/20180411110249_e9ba2db4a5a16b33ffdb4901345d733b_1_mwpm_03200403.jpg"},{"uniquekey":"20bea781551dbcb5a6adf5f6c7582f03","title":"四川武警应急卫勤保障演练 10分钟内架起\u201c帐篷医院\u201d","date":"2018-04-11 11:02","category":"社会","author_name":"大众网","url":"http://mini.eastday.com/mobile/180411110245719.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180411/20180411110245_4529e8f507bfa7c30c713aace0e27de5_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180411/20180411110245_4529e8f507bfa7c30c713aace0e27de5_2_mwpm_03200403.jpg"},{"uniquekey":"0f07207eb6f83c690eeade2a560e9c98","title":"男子将18个月大男婴打出脑出血险死，事后洋洋得意送飞吻","date":"2018-04-11 11:01","category":"社会","author_name":"万民聊生","url":"http://mini.eastday.com/mobile/180411110147026.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180411/20180411_9c2ff3c8a93343c6fe5f4a2e52ac66a6_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180411/20180411_85e439db0c12aaf4b61acf63b783d3de_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180411/20180411_2e0e9c54808c2c59f388c0158572e35d_cover_mwpm_03200403.jpg"},{"uniquekey":"e39a6c23dae105d4365c79090e6f85e1","title":"\u201c链车科技\u201d创始人黄山赴科教网参访交流","date":"2018-04-11 11:00","category":"社会","author_name":"丝绸之路网","url":"http://mini.eastday.com/mobile/180411110037358.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180411/20180411110037_41dca7168a0db33374a9e30b2966094c_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180411/20180411110037_41dca7168a0db33374a9e30b2966094c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180411/20180411110037_41dca7168a0db33374a9e30b2966094c_5_mwpm_03200403.jpg"},{"uniquekey":"52362386255ea79de6451f68de305db2","title":"文化沙龙|让孩子养成阅读习惯的最佳图书\u2014\u2014绘本","date":"2018-04-11 11:00","category":"社会","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/180411110021116.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180411/20180411110021_52e4cfbe5891bc02c54caa7909e6ac37_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180411/20180411110021_52e4cfbe5891bc02c54caa7909e6ac37_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180411/20180411110021_52e4cfbe5891bc02c54caa7909e6ac37_5_mwpm_03200403.jpg"},{"uniquekey":"d4e9f7c35e99e0dc3dced0b8642b3ff3","title":"著名儿童文学作家任小霞\u201c我阅读，我快乐\u201d郑州校园系列讲座成功举办！","date":"2018-04-11 11:00","category":"社会","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/180411110000396.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180411/20180411110000_843d2d68c9f3eb3391afccd1cd29aba9_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180411/20180411110000_843d2d68c9f3eb3391afccd1cd29aba9_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180411/20180411110000_843d2d68c9f3eb3391afccd1cd29aba9_7_mwpm_03200403.jpg"},{"uniquekey":"f9f22f148547b8b4f993f341bd6cf22d","title":"大爷救下跳河女子 却被网友骂惨 遭其家人殴打","date":"2018-04-11 10:59","category":"社会","author_name":"杀生丸","url":"http://mini.eastday.com/mobile/180411105953157.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180411/20180411_3602972cccd787af6957af3d7d40a450_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180411/20180411_87ff935487ad1466bf05dd6a11d9120d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180411/20180411_ad257395131864529d884a721b310364_cover_mwpm_03200403.jpg"},{"uniquekey":"7f03c311185ff85d66b291f7c1e4ea39","title":"为收养的弃婴，男子终身未娶，靠卖柴卖工含辛茹苦将养女拉扯大","date":"2018-04-11 10:59","category":"社会","author_name":"兔儿姐","url":"http://mini.eastday.com/mobile/180411105920739.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180411/20180411_f87ac4b541d48e236f3c886eccc9f737_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180411/20180411_295206400a5c1120ee6b39c089dadad4_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180411/20180411_ea58b7a9c78c02cd86d1b1169ad89fc8_cover_mwpm_03200403.jpg"},{"uniquekey":"738a735864f39960cde53d9ad2cc8bff","title":"性侵害随时会发生，\u201c性教育\u201d这堂课你到底该怎么给孩子上？","date":"2018-04-11 10:59","category":"社会","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/180411105912612.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180411/20180411105912_464fe9da9aff68085e05937febc1b78e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180411/20180411105912_464fe9da9aff68085e05937febc1b78e_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180411/20180411105912_464fe9da9aff68085e05937febc1b78e_8_mwpm_03200403.jpg"},{"uniquekey":"30ce16804615de1dc52608fc79bf73e2","title":"陕西榆林现\u201c豪华墓地\u201d 上下七层占地数千平米","date":"2018-04-11 10:58","category":"社会","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/180411105858845.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180411/20180411105858_b2341696905c9107b65232e5597a64f9_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180411/20180411105858_b2341696905c9107b65232e5597a64f9_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180411/20180411105858_b2341696905c9107b65232e5597a64f9_1_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"13b757620d154d3d8f4f94e9d61288d1","title":"\u201c我爸是拉车的！\u201d萌金毛挂牌为主人揽活，能叼十几斤重的菜篮子","date":"2018-04-11 11:09","category":"社会","author_name":"北青网","url":"http://mini.eastday.com/mobile/180411110928967.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180411/20180411110928_d19630f4fe3511721167bafa8a82ba9c_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180411/20180411110928_ac99e6eb2b3648b2a31ac036ee4c6e0c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180411/20180411110928_11e8c88438ba04d57a84c77643a34cc3_4_mwpm_03200403.jpg"},{"uniquekey":"829b119f398dc67f3fa3ef1ad6052826","title":"二胡演奏家社区\u201c安家\u201d 马晓晖文创艺术空间入驻创邑邻里汇","date":"2018-04-11 11:11","category":"社会","author_name":"新民网","url":"http://mini.eastday.com/mobile/180411111147078.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180411/20180411111147_40dd5927c33852226744d628b4b5b6b3_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180411/20180411111147_40dd5927c33852226744d628b4b5b6b3_1_mwpm_03200403.jpg"},{"uniquekey":"6f9e398c7d6d3a70777b67c2a04b297c","title":"浦东一工地工棚起火 无人员伤亡","date":"2018-04-11 11:11","category":"社会","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/180411111131103.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180411/20180411111131_f70a5a445af27863c2ac012bc4d9d26d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180411/20180411111131_f70a5a445af27863c2ac012bc4d9d26d_2_mwpm_03200403.jpg"},{"uniquekey":"29df9fe94b8f7372219f4809a15e2254","title":"刘亦菲的\u201c家\u201d美得像梦！传说中的\u201c南烟斋\u201d究竟是什么地方？","date":"2018-04-11 11:09","category":"社会","author_name":"新晚报","url":"http://mini.eastday.com/mobile/180411110911050.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180411/20180411110911_65170b4fb41c4e4218ea7d3689d25ac7_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180411/20180411110911_65170b4fb41c4e4218ea7d3689d25ac7_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180411/20180411110911_65170b4fb41c4e4218ea7d3689d25ac7_8_mwpm_03200403.jpg"},{"uniquekey":"3a90b4aeff9307a610e7c0f94564cacf","title":"疑似圆明园流失文物将拍 中拍协艺委会发声明抵制","date":"2018-04-11 11:09","category":"社会","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/180411110909344.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180411/20180411110909_8cd1269a2e563255bc56e63b08c98eb4_1_mwpm_03200403.jpg"},{"uniquekey":"df1d0232830041b27c24bc11d1928a03","title":"无奈！男子报警让警察送厕纸 民警满厕所找人","date":"2018-04-11 11:09","category":"社会","author_name":"咖啡不加糖33","url":"http://mini.eastday.com/mobile/180411110908394.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180411/20180411_c9c0d16c9b0b26a1748b0d351e1ae9da_cover_mwpm_03200403.jpg"},{"uniquekey":"59719767363b9c82fd9843dbe809179e","title":"合肥快新闻：合肥 2018 年体育中考 4 月 16 日开启 满分增至 60 分","date":"2018-04-11 11:08","category":"社会","author_name":"合肥晚报","url":"http://mini.eastday.com/mobile/180411110844391.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180411/20180411110844_c0d1c1d72aec83dd7e337c1df7e07071_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180411/20180411110844_c0d1c1d72aec83dd7e337c1df7e07071_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180411/20180411110844_c0d1c1d72aec83dd7e337c1df7e07071_4_mwpm_03200403.jpg"},{"uniquekey":"06a48c83c9a0f09f593529713ec4998b","title":"海狗赖上渔民兜风8小时：不是为了讨食，我这么可爱带我走吧","date":"2018-04-11 11:08","category":"社会","author_name":"柠檬气泡","url":"http://mini.eastday.com/mobile/180411110812278.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20180411/20180411_7613e28b33e529b5dd15c22d8b8b16d3_cover_mwpm_03200403.jpg"},{"uniquekey":"68670cff6348e6f8fc77f243a2d12eae","title":"上饶县六中：我书我心 我诵我诗","date":"2018-04-11 11:07","category":"社会","author_name":"今视新闻网","url":"http://mini.eastday.com/mobile/180411110747984.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180411/20180411110747_33f79ad2277c0b988ed6a3547c63b3be_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180411/20180411110747_33f79ad2277c0b988ed6a3547c63b3be_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180411/20180411110747_33f79ad2277c0b988ed6a3547c63b3be_2_mwpm_03200403.jpg"},{"uniquekey":"d3eb790e47810dbda745dc90986a4ae5","title":"每年一次论坛使\u201c博鳌\u201d成为热点，博是什么意思？鳌又是何意？","date":"2018-04-11 11:07","category":"社会","author_name":"城市船夫起","url":"http://mini.eastday.com/mobile/180411110744159.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180411/20180411110744_428e2bd56054360482a2af7d1db98e65_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180411/20180411110744_428e2bd56054360482a2af7d1db98e65_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180411/20180411110744_428e2bd56054360482a2af7d1db98e65_3_mwpm_03200403.jpg"},{"uniquekey":"ec11b10c6bebd7132740a222f32f31e5","title":"意大利西西里岛一华人小女孩过人行道时被车撞倒 伤势严重","date":"2018-04-11 11:06","category":"社会","author_name":"意大利华人街","url":"http://mini.eastday.com/mobile/180411110617044.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180411/20180411110617_cf177dbf6567b2d1da74098b975a9125_1_mwpm_03200403.jpg"},{"uniquekey":"3a265b06e6469e899081c840d98f4197","title":"\u201c五星酒店\u201d连快捷酒店都不如？旅游APP被指或存竞价排名","date":"2018-04-11 11:06","category":"社会","author_name":"新蓝网","url":"http://mini.eastday.com/mobile/180411110611034.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180411/20180411110611_2719ed83141fce6d25c31fbd992f22bb_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180411/20180411110611_2719ed83141fce6d25c31fbd992f22bb_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180411/20180411110611_2719ed83141fce6d25c31fbd992f22bb_2_mwpm_03200403.jpg"},{"uniquekey":"5ef4b7d4ed436479948b056684b39879","title":"监控下面动了手 包庇就是打人的理由吗？","date":"2018-04-11 11:06","category":"社会","author_name":"新蓝网","url":"http://mini.eastday.com/mobile/180411110610978.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180411/20180411110610_ffb1a59c8ea185ca4642de50cebd29a0_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180411/20180411110610_ffb1a59c8ea185ca4642de50cebd29a0_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180411/20180411110610_ffb1a59c8ea185ca4642de50cebd29a0_3_mwpm_03200403.jpg"},{"uniquekey":"8828e48d067566d83c39cb6868f6a42c","title":"男子醉驾飙车\u2026撞上指示牌飞出十余米翻车","date":"2018-04-11 11:06","category":"社会","author_name":"新蓝网","url":"http://mini.eastday.com/mobile/180411110606812.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180411/20180411110606_88557a4401c7cda337c1c64a63ccbe43_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180411/20180411110606_88557a4401c7cda337c1c64a63ccbe43_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180411/20180411110606_88557a4401c7cda337c1c64a63ccbe43_1_mwpm_03200403.jpg"},{"uniquekey":"3ae3502d612472da5fe63d3351f5defe","title":"鹅妈妈在火场里坚守到最后，被烤焦了半边身子，也不愿放弃孩子","date":"2018-04-11 11:06","category":"社会","author_name":"黯然童鞋fu","url":"http://mini.eastday.com/mobile/180411110606442.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180411/20180411110606_b0e418bc6848c60ef8eb6230e60a0b0c_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180411/20180411110606_b0e418bc6848c60ef8eb6230e60a0b0c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180411/20180411110606_b0e418bc6848c60ef8eb6230e60a0b0c_1_mwpm_03200403.jpg"},{"uniquekey":"0bf46aaddfa6fc6940a60ca3ff10d9f7","title":"七旬老人看病钱险被骗 民警发现拦截","date":"2018-04-11 11:06","category":"社会","author_name":"呼和浩特晚报","url":"http://mini.eastday.com/mobile/180411110600739.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180411/20180411110600_2ddad5167d1453318c4a455973bfccd7_1_mwpm_03200403.jpg"},{"uniquekey":"caf55259cfc388508cf8cf75ba062f43","title":"天津航空推澳大利亚航线特价机票 低至320元","date":"2018-04-11 11:05","category":"社会","author_name":"中国民航网","url":"http://mini.eastday.com/mobile/180411110517566.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180411/20180411110517_f9417f84c13ad9d2c08dc125812bfe92_2_mwpm_03200403.jpg"},{"uniquekey":"6f868d364f15dbd16ba499909a14096d","title":"高速爆胎婴儿车当警示牌？应急停车要做5件事","date":"2018-04-11 11:05","category":"社会","author_name":"新报徐燕","url":"http://mini.eastday.com/mobile/180411110506706.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180411/20180411110506_ba38125afc96a2208ace9a949c66e141_1_mwpm_03200403.jpg"},{"uniquekey":"a6cbce6d6766564c255c253a2aa8bb50","title":"武汉一小学3年级学生用文言文给老师写\u201c情书\u201d","date":"2018-04-11 11:04","category":"社会","author_name":"中国新闻网本地站","url":"http://mini.eastday.com/mobile/180411110421231.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180411/20180411110421_54c3aaea0422de272abaa6766a6183c6_1_mwpm_03200403.jpg"},{"uniquekey":"a602a03c0fff9a8096d08b6a31b548d5","title":"小伙子搬开老屋下一块砖，结果发现一个洞穴，收获一窝大惊喜","date":"2018-04-11 11:02","category":"社会","author_name":"举头三尺有柴米1","url":"http://mini.eastday.com/mobile/180411110250510.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180411/20180411110250_e0546b5e40f2ab5fa8bc20deda7915b3_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180411/20180411110250_e0546b5e40f2ab5fa8bc20deda7915b3_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180411/20180411110250_e0546b5e40f2ab5fa8bc20deda7915b3_2_mwpm_03200403.jpg"},{"uniquekey":"a918643b63913e8aff2c6d1dd886bcb7","title":"乌龟突然产卵了，知道真相后，他直接笑了","date":"2018-04-11 11:02","category":"社会","author_name":"从轻岁月lf","url":"http://mini.eastday.com/mobile/180411110249352.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180411/20180411110249_e9ba2db4a5a16b33ffdb4901345d733b_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180411/20180411110249_e9ba2db4a5a16b33ffdb4901345d733b_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180411/20180411110249_e9ba2db4a5a16b33ffdb4901345d733b_1_mwpm_03200403.jpg"},{"uniquekey":"20bea781551dbcb5a6adf5f6c7582f03","title":"四川武警应急卫勤保障演练 10分钟内架起\u201c帐篷医院\u201d","date":"2018-04-11 11:02","category":"社会","author_name":"大众网","url":"http://mini.eastday.com/mobile/180411110245719.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180411/20180411110245_4529e8f507bfa7c30c713aace0e27de5_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180411/20180411110245_4529e8f507bfa7c30c713aace0e27de5_2_mwpm_03200403.jpg"},{"uniquekey":"0f07207eb6f83c690eeade2a560e9c98","title":"男子将18个月大男婴打出脑出血险死，事后洋洋得意送飞吻","date":"2018-04-11 11:01","category":"社会","author_name":"万民聊生","url":"http://mini.eastday.com/mobile/180411110147026.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180411/20180411_9c2ff3c8a93343c6fe5f4a2e52ac66a6_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180411/20180411_85e439db0c12aaf4b61acf63b783d3de_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180411/20180411_2e0e9c54808c2c59f388c0158572e35d_cover_mwpm_03200403.jpg"},{"uniquekey":"e39a6c23dae105d4365c79090e6f85e1","title":"\u201c链车科技\u201d创始人黄山赴科教网参访交流","date":"2018-04-11 11:00","category":"社会","author_name":"丝绸之路网","url":"http://mini.eastday.com/mobile/180411110037358.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180411/20180411110037_41dca7168a0db33374a9e30b2966094c_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180411/20180411110037_41dca7168a0db33374a9e30b2966094c_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180411/20180411110037_41dca7168a0db33374a9e30b2966094c_5_mwpm_03200403.jpg"},{"uniquekey":"52362386255ea79de6451f68de305db2","title":"文化沙龙|让孩子养成阅读习惯的最佳图书\u2014\u2014绘本","date":"2018-04-11 11:00","category":"社会","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/180411110021116.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180411/20180411110021_52e4cfbe5891bc02c54caa7909e6ac37_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180411/20180411110021_52e4cfbe5891bc02c54caa7909e6ac37_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180411/20180411110021_52e4cfbe5891bc02c54caa7909e6ac37_5_mwpm_03200403.jpg"},{"uniquekey":"d4e9f7c35e99e0dc3dced0b8642b3ff3","title":"著名儿童文学作家任小霞\u201c我阅读，我快乐\u201d郑州校园系列讲座成功举办！","date":"2018-04-11 11:00","category":"社会","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/180411110000396.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180411/20180411110000_843d2d68c9f3eb3391afccd1cd29aba9_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180411/20180411110000_843d2d68c9f3eb3391afccd1cd29aba9_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180411/20180411110000_843d2d68c9f3eb3391afccd1cd29aba9_7_mwpm_03200403.jpg"},{"uniquekey":"f9f22f148547b8b4f993f341bd6cf22d","title":"大爷救下跳河女子 却被网友骂惨 遭其家人殴打","date":"2018-04-11 10:59","category":"社会","author_name":"杀生丸","url":"http://mini.eastday.com/mobile/180411105953157.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180411/20180411_3602972cccd787af6957af3d7d40a450_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180411/20180411_87ff935487ad1466bf05dd6a11d9120d_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180411/20180411_ad257395131864529d884a721b310364_cover_mwpm_03200403.jpg"},{"uniquekey":"7f03c311185ff85d66b291f7c1e4ea39","title":"为收养的弃婴，男子终身未娶，靠卖柴卖工含辛茹苦将养女拉扯大","date":"2018-04-11 10:59","category":"社会","author_name":"兔儿姐","url":"http://mini.eastday.com/mobile/180411105920739.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180411/20180411_f87ac4b541d48e236f3c886eccc9f737_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180411/20180411_295206400a5c1120ee6b39c089dadad4_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180411/20180411_ea58b7a9c78c02cd86d1b1169ad89fc8_cover_mwpm_03200403.jpg"},{"uniquekey":"738a735864f39960cde53d9ad2cc8bff","title":"性侵害随时会发生，\u201c性教育\u201d这堂课你到底该怎么给孩子上？","date":"2018-04-11 10:59","category":"社会","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/180411105912612.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180411/20180411105912_464fe9da9aff68085e05937febc1b78e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180411/20180411105912_464fe9da9aff68085e05937febc1b78e_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180411/20180411105912_464fe9da9aff68085e05937febc1b78e_8_mwpm_03200403.jpg"},{"uniquekey":"30ce16804615de1dc52608fc79bf73e2","title":"陕西榆林现\u201c豪华墓地\u201d 上下七层占地数千平米","date":"2018-04-11 10:58","category":"社会","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/180411105858845.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180411/20180411105858_b2341696905c9107b65232e5597a64f9_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180411/20180411105858_b2341696905c9107b65232e5597a64f9_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180411/20180411105858_b2341696905c9107b65232e5597a64f9_1_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 13b757620d154d3d8f4f94e9d61288d1
             * title : “我爸是拉车的！”萌金毛挂牌为主人揽活，能叼十几斤重的菜篮子
             * date : 2018-04-11 11:09
             * category : 社会
             * author_name : 北青网
             * url : http://mini.eastday.com/mobile/180411110928967.html
             * thumbnail_pic_s : http://03.imgmini.eastday.com/mobile/20180411/20180411110928_d19630f4fe3511721167bafa8a82ba9c_2_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://03.imgmini.eastday.com/mobile/20180411/20180411110928_ac99e6eb2b3648b2a31ac036ee4c6e0c_1_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://03.imgmini.eastday.com/mobile/20180411/20180411110928_11e8c88438ba04d57a84c77643a34cc3_4_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }
    }
}
