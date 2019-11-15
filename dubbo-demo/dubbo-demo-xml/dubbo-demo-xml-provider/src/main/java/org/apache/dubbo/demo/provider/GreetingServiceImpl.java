package org.apache.dubbo.demo.provider;/**
 * Created by zyz on 2019/11/14.
 */

import org.apache.dubbo.demo.GreetingService;

/**
 * @description:
 * @author: yuezhong.zyz
 * @date: 2019-11-14
 **/
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String hello() {
        return "hello from GreetingServiceImpl";
    }
}
