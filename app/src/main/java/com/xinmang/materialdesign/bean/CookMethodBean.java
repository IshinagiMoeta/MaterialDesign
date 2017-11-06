package com.xinmang.materialdesign.bean;

import java.util.List;

/**
 * Created by ketianxing on 2017/11/6.
 */

public class CookMethodBean {

    /**
     * msg : success
     * result : {"ctgIds":["0010001065"],"ctgTitles":"润肺","menuId":"00100010650000040356","name":"润肺食谱","recipe":{"ingredients":"","method":"","sumary":"","title":"润肺清火素小炒"},"thumbnail":"http://f2.mob.com/null/2015/08/21/1440123675026.jpg"}
     * retCode : 200
     */

    private String msg;
    private ResultBean result;
    private String retCode;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public static class ResultBean {
        /**
         * ctgIds : ["0010001065"]
         * ctgTitles : 润肺
         * menuId : 00100010650000040356
         * name : 润肺食谱
         * recipe : {"ingredients":"","method":"","sumary":"","title":"润肺清火素小炒"}
         * thumbnail : http://f2.mob.com/null/2015/08/21/1440123675026.jpg
         */

        private String ctgTitles;
        private String menuId;
        private String name;
        private RecipeBean recipe;
        private String thumbnail;
        private List<String> ctgIds;

        public String getCtgTitles() {
            return ctgTitles;
        }

        public void setCtgTitles(String ctgTitles) {
            this.ctgTitles = ctgTitles;
        }

        public String getMenuId() {
            return menuId;
        }

        public void setMenuId(String menuId) {
            this.menuId = menuId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public RecipeBean getRecipe() {
            return recipe;
        }

        public void setRecipe(RecipeBean recipe) {
            this.recipe = recipe;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public List<String> getCtgIds() {
            return ctgIds;
        }

        public void setCtgIds(List<String> ctgIds) {
            this.ctgIds = ctgIds;
        }

        public static class RecipeBean {
            /**
             * ingredients :
             * method :
             * sumary :
             * title : 润肺清火素小炒
             */

            private String ingredients;
            private String method;
            private String sumary;
            private String title;

            public String getIngredients() {
                return ingredients;
            }

            public void setIngredients(String ingredients) {
                this.ingredients = ingredients;
            }

            public String getMethod() {
                return method;
            }

            public void setMethod(String method) {
                this.method = method;
            }

            public String getSumary() {
                return sumary;
            }

            public void setSumary(String sumary) {
                this.sumary = sumary;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
