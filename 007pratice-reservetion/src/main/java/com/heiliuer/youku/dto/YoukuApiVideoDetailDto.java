package com.heiliuer.youku.dto;

import java.util.List;

/**
 * Created by hao.wang on 2017/2/28.
 */
public class YoukuApiVideoDetailDto {


    /**
     * code : 10000
     * msg : success
     * data : {"videoId":631595852,"showId":315070,"parentVideoId":0,"cate":"电视剧","cateid":97,"page":1,"pagesize":50,"total":"7","episode_last":"7","completed":0,"items":[{"pk_video":"631599240","videoid":"XMjUyNjM5Njk2MA==","title":"我的狐仙老婆 第一季 07","thumburl":"https://r1.ykimg.com/0542040858AEFD046F0C239B3109E7A7","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"1863.00","total_vv":2297006,"total_comment":304,"state":"normal","rc_title":"上交勇气星璇刘弈立功","onlinetime":"2017-02-24 00:00:00","show_videoseq":"7","show_videostage":"7","show_videocompleted":1,"pay_type":"[\"mon\"]","pay_state":"1"},{"pk_video":"631595963","videoid":"XMjUyNjM4Mzg1Mg==","title":"我的狐仙老婆 第一季 06","thumburl":"https://r1.ykimg.com/0542040858AE53446F0E571B2D627DD9","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"2111.00","total_vv":1009934,"total_comment":69,"state":"normal","rc_title":"林彤刘弈找到勇气星璇","onlinetime":"2017-02-24 00:00:00","show_videoseq":"6","show_videostage":"6","show_videocompleted":1,"pay_type":"[\"mon\"]","pay_state":"1"},{"pk_video":"631595852","videoid":"XMjUyNjM4MzQwOA==","title":"我的狐仙老婆 第一季 05","thumburl":"https://r1.ykimg.com/0542040858AE51126F0E5D6A9210D0E8","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"1975.00","total_vv":1334842,"total_comment":82,"state":"normal","rc_title":"女神遭袭击刘弈制解药","onlinetime":"2017-02-24 00:00:00","show_videoseq":"5","show_videostage":"5","show_videocompleted":1,"try_episodes":1,"pay_type":"[]","pay_state":"0"},{"pk_video":"631595678","videoid":"XMjUyNjM4MjcxMg==","title":"我的狐仙老婆 第一季 04","thumburl":"https://r1.ykimg.com/0542040858AE4F1C6F0E586E751B6C60","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"1787.00","total_vv":2968872,"total_comment":222,"state":"normal","rc_title":"狐仙搅乱宅男女神之约","onlinetime":"2017-02-24 00:00:00","show_videoseq":"4","show_videostage":"4","show_videocompleted":1,"try_episodes":1,"pay_type":"[]","pay_state":"0"},{"pk_video":"631591137","videoid":"XMjUyNjM2NDU0OA==","title":"我的狐仙老婆 第一季 03","thumburl":"https://r1.ykimg.com/0542040858AE4D476F0C1E0BFC5E9472","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"1968.00","total_vv":4751618,"total_comment":261,"state":"normal","rc_title":"刘弈下决心加入星耀会","onlinetime":"2017-02-24 00:00:00","show_videoseq":"3","show_videostage":"3","show_videocompleted":1,"try_episodes":1,"pay_type":"[]","pay_state":"0"},{"pk_video":"631591215","videoid":"XMjUyNjM2NDg2MA==","title":"我的狐仙老婆 第一季 02","thumburl":"https://r1.ykimg.com/0542040858AE4EE26F0C1F3D6B68ACD9","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"2120.00","total_vv":6894944,"total_comment":456,"state":"normal","rc_title":"林彤携刘弈潜入星耀会","onlinetime":"2017-02-24 00:00:00","show_videoseq":"2","show_videostage":"2","show_videocompleted":1,"try_episodes":1,"pay_type":"[]","pay_state":"0"},{"pk_video":"631591201","videoid":"XMjUyNjM2NDgwNA==","title":"我的狐仙老婆 第一季 01","thumburl":"https://r1.ykimg.com/0542040858AE4EE46F0E5C9E500B00CA","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"2060.00","total_vv":18440394,"total_comment":1296,"state":"normal","rc_title":"狐仙林彤封入宅男之手","onlinetime":"2017-02-24 00:00:00","show_videoseq":"1","show_videostage":"1","show_videocompleted":1,"try_episodes":1,"pay_type":"[]","pay_state":"0"}],"iteCount":7}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * videoId : 631595852
         * showId : 315070
         * parentVideoId : 0
         * cate : 电视剧
         * cateid : 97
         * page : 1
         * pagesize : 50
         * total : 7
         * episode_last : 7
         * completed : 0
         * items : [{"pk_video":"631599240","videoid":"XMjUyNjM5Njk2MA==","title":"我的狐仙老婆 第一季 07","thumburl":"https://r1.ykimg.com/0542040858AEFD046F0C239B3109E7A7","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"1863.00","total_vv":2297006,"total_comment":304,"state":"normal","rc_title":"上交勇气星璇刘弈立功","onlinetime":"2017-02-24 00:00:00","show_videoseq":"7","show_videostage":"7","show_videocompleted":1,"pay_type":"[\"mon\"]","pay_state":"1"},{"pk_video":"631595963","videoid":"XMjUyNjM4Mzg1Mg==","title":"我的狐仙老婆 第一季 06","thumburl":"https://r1.ykimg.com/0542040858AE53446F0E571B2D627DD9","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"2111.00","total_vv":1009934,"total_comment":69,"state":"normal","rc_title":"林彤刘弈找到勇气星璇","onlinetime":"2017-02-24 00:00:00","show_videoseq":"6","show_videostage":"6","show_videocompleted":1,"pay_type":"[\"mon\"]","pay_state":"1"},{"pk_video":"631595852","videoid":"XMjUyNjM4MzQwOA==","title":"我的狐仙老婆 第一季 05","thumburl":"https://r1.ykimg.com/0542040858AE51126F0E5D6A9210D0E8","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"1975.00","total_vv":1334842,"total_comment":82,"state":"normal","rc_title":"女神遭袭击刘弈制解药","onlinetime":"2017-02-24 00:00:00","show_videoseq":"5","show_videostage":"5","show_videocompleted":1,"try_episodes":1,"pay_type":"[]","pay_state":"0"},{"pk_video":"631595678","videoid":"XMjUyNjM4MjcxMg==","title":"我的狐仙老婆 第一季 04","thumburl":"https://r1.ykimg.com/0542040858AE4F1C6F0E586E751B6C60","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"1787.00","total_vv":2968872,"total_comment":222,"state":"normal","rc_title":"狐仙搅乱宅男女神之约","onlinetime":"2017-02-24 00:00:00","show_videoseq":"4","show_videostage":"4","show_videocompleted":1,"try_episodes":1,"pay_type":"[]","pay_state":"0"},{"pk_video":"631591137","videoid":"XMjUyNjM2NDU0OA==","title":"我的狐仙老婆 第一季 03","thumburl":"https://r1.ykimg.com/0542040858AE4D476F0C1E0BFC5E9472","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"1968.00","total_vv":4751618,"total_comment":261,"state":"normal","rc_title":"刘弈下决心加入星耀会","onlinetime":"2017-02-24 00:00:00","show_videoseq":"3","show_videostage":"3","show_videocompleted":1,"try_episodes":1,"pay_type":"[]","pay_state":"0"},{"pk_video":"631591215","videoid":"XMjUyNjM2NDg2MA==","title":"我的狐仙老婆 第一季 02","thumburl":"https://r1.ykimg.com/0542040858AE4EE26F0C1F3D6B68ACD9","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"2120.00","total_vv":6894944,"total_comment":456,"state":"normal","rc_title":"林彤携刘弈潜入星耀会","onlinetime":"2017-02-24 00:00:00","show_videoseq":"2","show_videostage":"2","show_videocompleted":1,"try_episodes":1,"pay_type":"[]","pay_state":"0"},{"pk_video":"631591201","videoid":"XMjUyNjM2NDgwNA==","title":"我的狐仙老婆 第一季 01","thumburl":"https://r1.ykimg.com/0542040858AE4EE46F0E5C9E500B00CA","streamtypes":["3gphd","flvhd","hd","hd2","hd3"],"publishtime":"2017-02-23 23:58:48","seconds":"2060.00","total_vv":18440394,"total_comment":1296,"state":"normal","rc_title":"狐仙林彤封入宅男之手","onlinetime":"2017-02-24 00:00:00","show_videoseq":"1","show_videostage":"1","show_videocompleted":1,"try_episodes":1,"pay_type":"[]","pay_state":"0"}]
         * iteCount : 7
         */

        private int videoId;
        private int showId;
        private int parentVideoId;
        private String cate;
        private int cateid;
        private int page;
        private int pagesize;
        private String total;
        private String episode_last;
        private int completed;
        private int iteCount;
        private List<ItemsBean> items;

        public int getVideoId() {
            return videoId;
        }

        public void setVideoId(int videoId) {
            this.videoId = videoId;
        }

        public int getShowId() {
            return showId;
        }

        public void setShowId(int showId) {
            this.showId = showId;
        }

        public int getParentVideoId() {
            return parentVideoId;
        }

        public void setParentVideoId(int parentVideoId) {
            this.parentVideoId = parentVideoId;
        }

        public String getCate() {
            return cate;
        }

        public void setCate(String cate) {
            this.cate = cate;
        }

        public int getCateid() {
            return cateid;
        }

        public void setCateid(int cateid) {
            this.cateid = cateid;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getEpisode_last() {
            return episode_last;
        }

        public void setEpisode_last(String episode_last) {
            this.episode_last = episode_last;
        }

        public int getCompleted() {
            return completed;
        }

        public void setCompleted(int completed) {
            this.completed = completed;
        }

        public int getIteCount() {
            return iteCount;
        }

        public void setIteCount(int iteCount) {
            this.iteCount = iteCount;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * pk_video : 631599240
             * videoid : XMjUyNjM5Njk2MA==
             * title : 我的狐仙老婆 第一季 07
             * thumburl : https://r1.ykimg.com/0542040858AEFD046F0C239B3109E7A7
             * streamtypes : ["3gphd","flvhd","hd","hd2","hd3"]
             * publishtime : 2017-02-23 23:58:48
             * seconds : 1863.00
             * total_vv : 2297006
             * total_comment : 304
             * state : normal
             * rc_title : 上交勇气星璇刘弈立功
             * onlinetime : 2017-02-24 00:00:00
             * show_videoseq : 7
             * show_videostage : 7
             * show_videocompleted : 1
             * pay_type : ["mon"]
             * pay_state : 1
             * try_episodes : 1
             */

            private String pk_video;
            private String videoid;
            private String title;
            private String thumburl;
            private String publishtime;
            private String seconds;
            private int total_vv;
            private int total_comment;
            private String state;
            private String rc_title;
            private String onlinetime;
            private String show_videoseq;
            private String show_videostage;
            private int show_videocompleted;
            private String pay_type;
            private String pay_state;
            private int try_episodes;
            private List<String> streamtypes;

            public String getPk_video() {
                return pk_video;
            }

            public void setPk_video(String pk_video) {
                this.pk_video = pk_video;
            }

            public String getVideoid() {
                return videoid;
            }

            public void setVideoid(String videoid) {
                this.videoid = videoid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getThumburl() {
                return thumburl;
            }

            public void setThumburl(String thumburl) {
                this.thumburl = thumburl;
            }

            public String getPublishtime() {
                return publishtime;
            }

            public void setPublishtime(String publishtime) {
                this.publishtime = publishtime;
            }

            public String getSeconds() {
                return seconds;
            }

            public void setSeconds(String seconds) {
                this.seconds = seconds;
            }

            public int getTotal_vv() {
                return total_vv;
            }

            public void setTotal_vv(int total_vv) {
                this.total_vv = total_vv;
            }

            public int getTotal_comment() {
                return total_comment;
            }

            public void setTotal_comment(int total_comment) {
                this.total_comment = total_comment;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getRc_title() {
                return rc_title;
            }

            public void setRc_title(String rc_title) {
                this.rc_title = rc_title;
            }

            public String getOnlinetime() {
                return onlinetime;
            }

            public void setOnlinetime(String onlinetime) {
                this.onlinetime = onlinetime;
            }

            public String getShow_videoseq() {
                return show_videoseq;
            }

            public void setShow_videoseq(String show_videoseq) {
                this.show_videoseq = show_videoseq;
            }

            public String getShow_videostage() {
                return show_videostage;
            }

            public void setShow_videostage(String show_videostage) {
                this.show_videostage = show_videostage;
            }

            public int getShow_videocompleted() {
                return show_videocompleted;
            }

            public void setShow_videocompleted(int show_videocompleted) {
                this.show_videocompleted = show_videocompleted;
            }

            public String getPay_type() {
                return pay_type;
            }

            public void setPay_type(String pay_type) {
                this.pay_type = pay_type;
            }

            public String getPay_state() {
                return pay_state;
            }

            public void setPay_state(String pay_state) {
                this.pay_state = pay_state;
            }

            public int getTry_episodes() {
                return try_episodes;
            }

            public void setTry_episodes(int try_episodes) {
                this.try_episodes = try_episodes;
            }

            public List<String> getStreamtypes() {
                return streamtypes;
            }

            public void setStreamtypes(List<String> streamtypes) {
                this.streamtypes = streamtypes;
            }
        }
    }
}
