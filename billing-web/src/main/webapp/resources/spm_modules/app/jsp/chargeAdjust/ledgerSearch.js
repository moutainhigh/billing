define('app/jsp/chargeAdjust/ledgerSearch', function (require, exports, module) {
    'use strict';
    var $=require('jquery'),
        Widget = require('arale-widget/1.2.0/widget'),
        AjaxController=require('opt-ajax/1.0.0/index'),
        Dialog=require('artDialog/src/dialog'),
        moment = require('moment/2.9.0/moment');

    require("bootstrap-paginator/bootstrap-paginator.min");
    require("twbs-pagination/jquery.twbsPagination.min");
    require('opt-paging/aiopt.pagination');
        
    require("jsviews/jsrender.min");
    require("jsviews/jsviews.min");
    require("app/util/jsviews-ext");

    //实例化AJAX控制处理对象
    var ajaxController = new AjaxController();

    //定义页面组件类
    var LedgerSearchPager = Widget.extend({
        //属性，使用时由类的构造函数传入
        attrs: {
        },
        Statics: {
            DEFAULT_PAGE_SIZE: 6
        },
        //事件代理
        events: {
            //key的格式: 事件+空格+对象选择器;value:事件方法
            "click #billQuery":"searchLedgerList"
        },
        //重写父类
        setup: function () {
            LedgerSearchPager.superclass.setup.call(this);
            this._initSelect();
            this.searchLedgerList();
        },
        _initSelect:function () {
            //初始化账单月
            for(var i=0;i<6;i++){
                var time = moment().subtract(i,"month");
                $("#billMonth").append("<option value='"+time.format("YYYYMM")+"'>"+time.format("YYYY[年]MM[月]")+"</option>");
            }
        },
        searchLedgerList:function(){
            var data = $("#billCondition :input,#billCondition select").serializeArray();
            $("#pagination").runnerPagination({
                url: _base+"/chargeAdjust/ledgerSearch",
                method: "POST",
                dataType: "json",
                processing: true,
                data : data,
                pageSize: LedgerSearchPager.DEFAULT_PAGE_SIZE,
                visiblePages:5,
                message: "正在为您查询数据..",
                render: function (data) {
                    if(data&&data.length>0){
                        var template = $.templates("#billDataTmpl");
                        var htmlOut = template.render(data);
                        $("#billData").html(htmlOut);
                        var selectMonth = $("#billMonth").val();
                        if(!(selectMonth == moment().subtract(1,"month").format("YYYYMM"))){
                            $("#billData").find("a").hide();
                        }
                    }else{
                        $("#billData").html("未搜索到信息");
                    }
                }
            });
        }
    });

    module.exports = LedgerSearchPager;
});
