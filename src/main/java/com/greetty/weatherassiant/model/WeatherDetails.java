package com.greetty.weatherassiant.model;

import java.util.List;

/**
 * Created by Greetty on 2017/11/11.
 *
 * 天气信息
 */
public class WeatherDetails {


    /**
     * date : 20171111
     * message : Success !
     * status : 200
     * city : 北京
     * count : 6
     * data : {"shidu":"28%","pm25":5,"pm10":15,"quality":"优","wendu":"3","ganmao":"各类人群可自由活动","yesterday":{"date":"10日星期五","sunrise":"06:52","high":"高温 11.0℃","low":"低温 -1.0℃","sunset":"17:04","aqi":30,"fx":"西北风","fl":"3-4级","type":"晴","notice":"天气干燥，请适当增加室内湿度"},"forecast":[{"date":"11日星期六","sunrise":"06:53","high":"高温 10.0℃","low":"低温 0.0℃","sunset":"17:03","aqi":78,"fx":"南风","fl":"<3级","type":"晴","notice":"天气干燥，请适当增加室内湿度"},{"date":"12日星期日","sunrise":"06:54","high":"高温 11.0℃","low":"低温 0.0℃","sunset":"17:02","aqi":263,"fx":"西南风","fl":"<3级","type":"多云","notice":"绵绵的云朵，形状千变万化"},{"date":"13日星期一","sunrise":"06:55","high":"高温 12.0℃","low":"低温 0.0℃","sunset":"17:01","aqi":192,"fx":"西北风","fl":"3-4级","type":"晴","notice":"天气干燥，请适当增加室内湿度"},{"date":"14日星期二","sunrise":"06:57","high":"高温 8.0℃","low":"低温 -3.0℃","sunset":"17:00","aqi":38,"fx":"西北风","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"},{"date":"15日星期三","sunrise":"06:58","high":"高温 9.0℃","low":"低温 -2.0℃","sunset":"16:59","aqi":83,"fx":"北风","fl":"<3级","type":"晴","notice":"天气干燥，请适当增加室内湿度"}]}
     */

    private String date;
    private String message;
    private int status;
    private String city;
    private int count;
    private DataBean data;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * shidu : 28%
         * pm25 : 5.0
         * pm10 : 15.0
         * quality : 优
         * wendu : 3
         * ganmao : 各类人群可自由活动
         * yesterday : {"date":"10日星期五","sunrise":"06:52","high":"高温 11.0℃","low":"低温 -1.0℃","sunset":"17:04","aqi":30,"fx":"西北风","fl":"3-4级","type":"晴","notice":"天气干燥，请适当增加室内湿度"}
         * forecast : [{"date":"11日星期六","sunrise":"06:53","high":"高温 10.0℃","low":"低温 0.0℃","sunset":"17:03","aqi":78,"fx":"南风","fl":"<3级","type":"晴","notice":"天气干燥，请适当增加室内湿度"},{"date":"12日星期日","sunrise":"06:54","high":"高温 11.0℃","low":"低温 0.0℃","sunset":"17:02","aqi":263,"fx":"西南风","fl":"<3级","type":"多云","notice":"绵绵的云朵，形状千变万化"},{"date":"13日星期一","sunrise":"06:55","high":"高温 12.0℃","low":"低温 0.0℃","sunset":"17:01","aqi":192,"fx":"西北风","fl":"3-4级","type":"晴","notice":"天气干燥，请适当增加室内湿度"},{"date":"14日星期二","sunrise":"06:57","high":"高温 8.0℃","low":"低温 -3.0℃","sunset":"17:00","aqi":38,"fx":"西北风","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"},{"date":"15日星期三","sunrise":"06:58","high":"高温 9.0℃","low":"低温 -2.0℃","sunset":"16:59","aqi":83,"fx":"北风","fl":"<3级","type":"晴","notice":"天气干燥，请适当增加室内湿度"}]
         */

        private String shidu;
        private double pm25;
        private double pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private YesterdayBean yesterday;
        private List<ForecastBean> forecast;

        public String getShidu() {
            return shidu;
        }

        public void setShidu(String shidu) {
            this.shidu = shidu;
        }

        public double getPm25() {
            return pm25;
        }

        public void setPm25(double pm25) {
            this.pm25 = pm25;
        }

        public double getPm10() {
            return pm10;
        }

        public void setPm10(double pm10) {
            this.pm10 = pm10;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 10日星期五
             * sunrise : 06:52
             * high : 高温 11.0℃
             * low : 低温 -1.0℃
             * sunset : 17:04
             * aqi : 30.0
             * fx : 西北风
             * fl : 3-4级
             * type : 晴
             * notice : 天气干燥，请适当增加室内湿度
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }

            @Override
            public String toString() {
                return "YesterdayBean{" +
                        "date='" + date + '\'' +
                        ", sunrise='" + sunrise + '\'' +
                        ", high='" + high + '\'' +
                        ", low='" + low + '\'' +
                        ", sunset='" + sunset + '\'' +
                        ", aqi=" + aqi +
                        ", fx='" + fx + '\'' +
                        ", fl='" + fl + '\'' +
                        ", type='" + type + '\'' +
                        ", notice='" + notice + '\'' +
                        '}';
            }
        }

        public static class ForecastBean {
            /**
             * date : 11日星期六
             * sunrise : 06:53
             * high : 高温 10.0℃
             * low : 低温 0.0℃
             * sunset : 17:03
             * aqi : 78.0
             * fx : 南风
             * fl : <3级
             * type : 晴
             * notice : 天气干燥，请适当增加室内湿度
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }

            @Override
            public String toString() {
                return "ForecastBean{" +
                        "date='" + date + '\'' +
                        ", sunrise='" + sunrise + '\'' +
                        ", high='" + high + '\'' +
                        ", low='" + low + '\'' +
                        ", sunset='" + sunset + '\'' +
                        ", aqi=" + aqi +
                        ", fx='" + fx + '\'' +
                        ", fl='" + fl + '\'' +
                        ", type='" + type + '\'' +
                        ", notice='" + notice + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "shidu='" + shidu + '\'' +
                    ", pm25=" + pm25 +
                    ", pm10=" + pm10 +
                    ", quality='" + quality + '\'' +
                    ", wendu='" + wendu + '\'' +
                    ", ganmao='" + ganmao + '\'' +
                    ", yesterday=" + yesterday +
                    ", forecast=" + forecast +
                    '}';
        }
    }
}
