//package com.ai.opt.baas.bmc.test.api.orderinfo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.ai.baas.bmc.api.orderinfo.params.ExtInfo;
//import com.ai.baas.bmc.api.orderinfo.params.Info;
//import com.ai.baas.bmc.api.orderinfo.params.OrderExt;
//import com.ai.baas.bmc.api.orderinfo.params.OrderInfoParams;
//import com.ai.baas.bmc.api.orderinfo.params.Product;
//import com.ai.baas.bmc.api.orderinfo.params.ProductExt;
//import com.ai.opt.sdk.dubbo.util.HttpClientUtil;
//import com.alibaba.fastjson.JSON;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({ "/context/core-context.xml" })
//public class OrderInfoSVRestTest {
//    @Autowired
//    protected ApplicationContext ctx;
//
//    @Test
//    public void orderInfo() {
//        ProductExt productExt = new ProductExt();
//        productExt.setExtName("pe1");
//        productExt.setExtValue("pe1");
//        productExt.setUpdateFlag("N");
//
//        List<ProductExt> productExtInfoList = new ArrayList<ProductExt>();
//        productExtInfoList.add(productExt);
//
//        Product product = new Product();
//        product.setProductId("1");
//        product.setProductType("1");
//        product.setActiveTime("20160101000000");
//        product.setInactiveTime("20990101000000");
//        product.setDeductable("d");
//        product.setProductExtInfoList(productExtInfoList);
//        product.setProductNumber(1);
//        product.setResBonusFlag("r");
//        product.setSubsProductPrice(1000L);
//
//        List<Product> productList = new ArrayList<Product>();
//        productList.add(product);
//
//        OrderExt orderExt = new OrderExt();
//        orderExt.setExtName("oe1");
//        orderExt.setExtValue("oe1");
//        orderExt.setUpdateFlag("N");
//
//        List<OrderExt> orderExtInfo = new ArrayList<OrderExt>();
//        orderExtInfo.add(orderExt);
//
//        Info info = new Info();
//        info.setName("1");
//        info.setValue("2");
//        List<Info> infolist = new ArrayList<Info>();
//        infolist.add(info);
//
//        ExtInfo extInfo = new ExtInfo();
//        extInfo.setExtType("DIVIDE-RATIO");
//        extInfo.setInfolist(infolist);
//        List<ExtInfo> sublist = new ArrayList<ExtInfo>();
//        sublist.add(extInfo);
//
//        OrderInfoParams request = new OrderInfoParams();
//        request.setTenantId("test");
//        request.setTradeSeq("1");
//        request.setExtCustId("1");
//        request.setUsetype("Normal");
//        request.setServiceId("zx1");
//        request.setProductList(productList);
//        request.setOrderExtInfo(orderExtInfo);
//        request.setSublist(sublist);
//
//        System.out.println(JSON.toJSONString(request));
//        String result = HttpClientUtil
//                .sendPost("http://10.1.130.84:10884/baas-bmc/orderinfo/orderInfo",
//                        JSON.toJSONString(request));
//        System.out.println(result);
//        System.out.println("success");
//    }
//}
