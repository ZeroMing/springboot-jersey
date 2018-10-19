//package com.uec.springbootjersey.resource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import java.util.Map;
//
//
///**
// * @description: 调用远程接口
// * @author: Ming.Lee/李明
// * @create: 2018-10-19 19:27
// **/
//
//@Component
//@Path("https://a1.easemob.com/")
//public interface RemoteAPIResource {
//
//
//    ///{org_name}/{app_name}/token
//    @Path("/easemob-playground/test1/token")
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    //定义了接收的请求 content-type 为 json
//    @Consumes(MediaType.APPLICATION_JSON)
//    Map<String,Object> sayHi(@RequestBody Map<String,Object> freezeState);
//
//
//
//}